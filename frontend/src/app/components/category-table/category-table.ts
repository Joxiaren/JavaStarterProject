import { Component } from '@angular/core';
import { BaseTable } from 'app/components/base-components/base-table/base-table';

@Component({
  selector: 'app-category-table',
  imports: [],
  templateUrl: './category-table.html',
  styleUrl: './category-table.css',
})
export class CategoryTable extends BaseTable<Category>{

}
