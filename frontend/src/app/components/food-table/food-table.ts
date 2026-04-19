import { Component } from '@angular/core';
import { BaseTable } from 'app/components/base-components/base-table/base-table';
import { Food } from 'model/food';

@Component({
  selector: 'app-food-table',
  imports: [],
  templateUrl: './food-table.html',
  styleUrl: './food-table.css',
})
export class FoodTable extends BaseTable<number, Food> {

}
