import { Component, SimpleChanges } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { BaseForm } from 'app/components/base-components/base-form/base-form';
import { Food } from 'model/food';

@Component({
  selector: 'app-food-form',
  imports: [ReactiveFormsModule],
  templateUrl: './food-form.html',
  styleUrl: './food-form.css',
})
export class FoodForm extends BaseForm<number, Food> {
  override form = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    calories: new FormControl(),
    ingredientCount: new FormControl(),
    expiryDate: new FormControl(),
    menus: new FormControl()
  })

  override ngOnChanges(changes: SimpleChanges): void {
    super.ngOnChanges(changes);
    if (this.editItem != undefined) {
      this.form.controls.expiryDate.setValue(this.editItem.expiryDate.toISOString().slice(0, -14));
    }
  }
}
