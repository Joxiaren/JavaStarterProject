import { Component } from '@angular/core';
import { GenericTable } from 'app/components/generics/generic-table/generic-table';

@Component({
  selector: 'app-food-table',
  imports: [],
  templateUrl: './food-table.html',
  styleUrl: './food-table.css',
})
export class FoodTable extends GenericTable<Food>{

}
