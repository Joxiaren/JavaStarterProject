import { Component, SimpleChanges } from '@angular/core';
import { setThrowInvalidWriteToSignalError } from '@angular/core/primitives/signals';
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
    expiryDate: new FormControl(),
    menus: new FormControl()
  })

  override ngOnChanges(changes: SimpleChanges): void {
    super.ngOnChanges(changes);
    if(this.editItem != undefined) {
      this.form.controls.expiryDate.setValue(this.editItem.expiryDate.toISOString().slice(0, -14));
    }
  }
}
