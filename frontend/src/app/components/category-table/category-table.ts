import { Component } from '@angular/core';
import { GenericTable } from 'app/components/generics/generic-table/generic-table';

@Component({
  selector: 'app-category-table',
  imports: [],
  templateUrl: './category-table.html',
  styleUrl: './category-table.css',
})
export class CategoryTable extends GenericTable<Category>{

}
