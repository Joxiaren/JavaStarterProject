import { Component, Input, Signal, signal, SimpleChanges } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { BaseForm } from 'app/components/base-components/base-form/base-form';
import { BaseModel } from 'model/base-model';
import { Category } from 'model/category';
import { Food } from 'model/food';
import { Menu } from 'model/menu';

@Component({
  selector: 'app-menu-form',
  imports: [ReactiveFormsModule],
  templateUrl: './menu-form.html',
  styleUrl: './menu-form.css',
})
export class MenuForm extends BaseForm<number, Menu> {
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

  compare(a: BaseModel<number>, b: BaseModel<number>): boolean {
    if (a == undefined || b == undefined) return false;
    return a.id === b.id;
  }
}
