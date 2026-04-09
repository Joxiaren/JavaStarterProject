import { Component, computed, EventEmitter, Input, Output, Signal, signal } from '@angular/core';

@Component({
  selector: 'app-generic-table',
  imports: [],
  templateUrl: './generic-table.html',
  styleUrl: './generic-table.css',
})
export class GenericTable<Type> {
  @Input()
  items : Signal<Type[]>= signal<Type[]>([]);
  
  @Output()
  deleteEmit = new EventEmitter<number>();

  @Output()
  editEmit = new EventEmitter<number>();

  itemsShow : Signal<Type[]> = computed(
    () => {
      let newItems = this.items();

      let filteringFn = this.filteringFns().map(ff => ff.fn);
      newItems = newItems.filter(
        (item) => {
          for(let i = 0; i < filteringFn.length; i++){
            if(!filteringFn[i](item)) return false;
          }
          return true;
      })

      let sortingFn = this.sortingFns().map(sf => sf.fn);
      newItems = newItems.sort(
        (a,b) => {
          for(let i = 0; i < sortingFn.length; i++){
            let sortingResult = sortingFn[i](a,b);
            if(sortingResult != 0) return sortingResult;
          }
          return 0;
        }
      )

      return newItems;
    }
  );
  
  filteringFns = signal<FilterFnContainer<Type>[]>([]);
  sortingFns = signal<SortFnContainer<Type>[]>([]);

  setFilter(name: string, fn: ((a: Type) => boolean) | null) : void{

    let indexFn = this.filteringFns().findIndex((ff) => ff.name === name);
    if(fn !== null){
      if(indexFn === -1){
        this.filteringFns.update((ffs) => [...ffs, {name, fn}]);
      }
      else{
        this.filteringFns.update((ffs) => ffs.map((ff, index) =>{
          if(index === indexFn) return {name, fn};
          return ff;
        }));
      }
    }
    else{
        if(indexFn === -1) return;

        this.filteringFns.update((ffs) => ffs.filter((ff, index) => index !== indexFn));
    }
  }

  compareGen(field: string){
    return (desc: boolean) => {
      return (a: any, b: any) => {
          return (a[field] < b[field] ? 1 : (a[field] > b[field] ? -1 : 0)) * (desc ? -1 : 1);
      }
    }
  }

  setSortFn(indexFn: number, name: string, type: boolean){
    if(indexFn === -1){

      this.sortingFns.update((sfs) => [...sfs, {name, "state" : type ? -1 : 1, "fn" : this.compareGen(name)(type)}])
    }
    else{
      this.sortingFns.update((sfs) => sfs.map( (sf, index) => {
        if(index === indexFn) return {name, "state" : type ? -1 : 1, "fn" : this.compareGen(name)(type)};
        return sf;
      }));
    }
  }

  toggleSort(name: string){
    let indexFn = this.sortingFns().findIndex((sf) => sf.name == name);

    if(indexFn === -1) this.setSort(name, -1);
    else if(this.sortingFns()[indexFn].state === -1)this.setSort(name, 1);
    else this.setSort(name, 0);
  }

  setSort(name: string, type: number) : void{
    let indexFn = this.sortingFns().findIndex((sf) => sf.name === name);

    switch (type){
      case 1:{
        this.setSortFn(indexFn, name, false);
        break;
      }
      case -1:{ 
        this.setSortFn(indexFn, name, true);
        break;
      }
      default:{
        if(indexFn === -1) break;

        this.sortingFns.update((sfs) => sfs.filter((sf, index) => index !== indexFn));
        
        break;
      }
    }
  }
  
  findSortDirection(name: string) : boolean | null{
    let result = null;
    let sortingFn = this.sortingFns().filter( sf => sf.name === name);
    if(sortingFn.length > 0) result = sortingFn[0].state === 1 ? false : true;
    return result;
  }
  editEvent(index: number){
    this.editEmit.emit(index);
  }
  deleteEvent(index: number){
    this.deleteEmit.emit(index);
  }
}

interface SortFnContainer<Type>{
    name : string,
    state: number,
    fn : (a: Type, b: Type) => number
}
interface FilterFnContainer<Type>{
  name: string,
  fn : (a: Type) => boolean
}