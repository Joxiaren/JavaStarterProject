import { Component, inject } from '@angular/core';
import { CategoryControl } from 'app/controls/category-control/category-control';

@Component({
  selector: 'app-category-page',
  imports: [],
  templateUrl: './category-page.html',
  styleUrl: './category-page.css',
})
export class CategoryPage {
  categoryControl = inject(CategoryControl);

  constructor(){
    this.dataRefresh();
  }
  dataRefresh(){
    this.categoryControl.getAllItems();
  }
}
