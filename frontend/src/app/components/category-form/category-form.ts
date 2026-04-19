import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { BaseForm } from 'app/components/base-components/base-form/base-form';
import { Category } from 'model/category';

@Component({
  selector: 'app-category-form',
  imports: [ReactiveFormsModule],
  templateUrl: './category-form.html',
  styleUrl: './category-form.css',
})
export class CategoryForm extends BaseForm<number, Category> {
  override form = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    menus: new FormControl()
  });

}
