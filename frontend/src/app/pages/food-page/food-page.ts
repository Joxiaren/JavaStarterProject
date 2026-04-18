import { Component, inject } from '@angular/core';
import { FoodTable } from '../../components/food-table/food-table';
import { FoodForm } from '../../components/food-form/food-form';
import { FoodControl } from '../../controls/food-control/food-control';

@Component({
  selector: 'app-food-page',
  imports: [FoodTable, FoodForm],
  templateUrl: './food-page.html',
  styleUrl: './food-page.css',
})
export class FoodPage {
  foodControl = inject(FoodControl);

  constructor() {
    this.dataRefresh();
  }

  dataRefresh() {
    this.foodControl.getAllItems();
  }
}
