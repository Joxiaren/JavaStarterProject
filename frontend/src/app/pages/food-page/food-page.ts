import { Component, inject } from '@angular/core';
import { FoodForm } from 'app/components/food-form/food-form';
import { FoodTable } from 'app/components/food-table/food-table';
import { FoodControl } from 'app/controls/food-control/food-control';

@Component({
  selector: 'app-food-page',
  imports: [ FoodTable, FoodForm ],
  templateUrl: './food-page.html',
  styleUrl: './food-page.css',
})
export class FoodPage {
  foodControl = inject(FoodControl);

  constructor(){
    this.dataRefresh();
  }

  dataRefresh(){
    this.foodControl.getAllItems();
  }
}
