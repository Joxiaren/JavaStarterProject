import { Component, inject } from '@angular/core';
import { CategoryForm } from '../../components/category-form/category-form';
import { CategoryTable } from '../../components/category-table/category-table';
import { CategoryControl } from '../../controls/category-control/category-control';

@Component({
  selector: 'app-category-page',
  imports: [CategoryForm, CategoryTable],
  templateUrl: './category-page.html',
  styleUrl: './category-page.css',
})
export class CategoryPage {
  categoryControl = inject(CategoryControl);

  constructor() {
    this.dataRefresh();
  }
  dataRefresh() {
    this.categoryControl.getAllItems();
  }
}
