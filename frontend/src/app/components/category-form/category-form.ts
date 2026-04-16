import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { GenericForm } from 'app/components/generics/generic-form/generic-form';

@Component({
  selector: 'app-category-form',
  imports: [ ReactiveFormsModule ],
  templateUrl: './category-form.html',
  styleUrl: './category-form.css',
})
export class CategoryForm extends GenericForm<Category>{
  override form = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    menus: new FormControl()
  });

}
