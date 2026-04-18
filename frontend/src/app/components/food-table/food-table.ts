import { Component } from '@angular/core';
import { Food } from '../../../model/food';
import { BaseTable } from '../base-components/base-table/base-table';

@Component({
  selector: 'app-food-table',
  imports: [],
  templateUrl: './food-table.html',
  styleUrl: './food-table.css',
})
export class FoodTable extends BaseTable<number, Food> {

}
