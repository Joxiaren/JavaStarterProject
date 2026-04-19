import { Component } from '@angular/core';
import { BaseTable } from 'app/components/base-components/base-table/base-table';
import { Category } from 'model/category';

@Component({
  selector: 'app-category-table',
  imports: [],
  templateUrl: './category-table.html',
  styleUrl: './category-table.css',
})
export class CategoryTable extends BaseTable<number, Category> {

}
