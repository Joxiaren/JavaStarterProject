import { Component, Input } from '@angular/core';
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
    foodId: new FormControl(),
    categoryId: new FormControl()    
  });
  
  @Input()
  foods: Food[] = [];
  @Input()
  categories: Category[] = [];

}
