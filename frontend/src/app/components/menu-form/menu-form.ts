import { Component, Input, Signal, signal, SimpleChanges } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { GenericForm } from 'app/components/generics/generic-form/generic-form';

@Component({
  selector: 'app-menu-form',
  imports: [ ReactiveFormsModule ],
  templateUrl: './menu-form.html',
  styleUrl: './menu-form.css',
})
export class MenuForm extends GenericForm<Menu>{
  override form = new FormGroup({
    id: new FormControl(),
    version: new FormControl(),
    food: new FormControl(),
    category: new FormControl()    
  });
  
  @Input()
  foods: Signal<Food[]> = signal([]);
  @Input()
  categories: Signal<Category[]> = signal([]);

  compare(a: GenericModel<number>, b: GenericModel<number>) : boolean{
    if(a == undefined || b == undefined ) return false;
    return a.id === b.id;
  }
}
