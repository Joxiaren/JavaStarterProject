import { signal } from '@angular/core';
import { BaseService } from 'app/services/base-service';

export abstract class BaseControl<IdType, Type extends BaseModel<IdType>> {

  abstract service: BaseService<IdType, Type>;

  items = signal<Type[]>([]);

  itemEdit = signal<Type | null>(null);

  getAllItems(){
    this.service?.getAll().subscribe(data => {
      this.items.set(data);
    })
  }
  addItem(item: any){
    this.service?.create(item).subscribe(data => {
      this.getAllItems();
    });
  }
  setEditItem(index: number){
    this.itemEdit.set(this.items()[index]);
  }
  editItem(item: any){
    this.service?.update(item.id, item).subscribe(data => {
      this.getAllItems();
    });
    this.itemEdit.set(null);
  }
  deleteItem(index: number){
    let id = this.items()[index]["id"];
    this.service?.delete(id).subscribe(data => {
      this.getAllItems();
    });
    this.itemEdit.set(null);
  }
}
