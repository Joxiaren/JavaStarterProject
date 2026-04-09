import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { GenericForm } from 'app/components/generics/generic-form/generic-form';

@Component({
  selector: 'app-food-form',
  imports: [ ReactiveFormsModule ],
  templateUrl: './food-form.html',
  styleUrl: './food-form.css',
})
export class FoodForm extends GenericForm<Food>{
  override form = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    calories: new FormControl(),
    ingredientCount: new FormControl(),
    expiryDate: new FormControl<Date>(new Date()),
    menus: new FormControl()
  })
}
