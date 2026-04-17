import { computed, inject, Injectable } from '@angular/core';
import { CategoryControl } from 'app/controls/category-control/category-control';
import { FoodControl } from 'app/controls/food-control/food-control';
import { BaseControl } from 'app/controls/base-control/base-control';
import { MenuService } from 'app/services/menu-service';

@Injectable({
  providedIn: 'root',
})
export class MenuControl extends BaseControl<number, Menu>{
  override service = inject(MenuService);

  foodControl = inject(FoodControl);
  categoryControl = inject(CategoryControl);

  foodItems = computed(() => this.foodControl.items());
  categoryItems = computed(() => this.categoryControl.items());
  
  override getAllItems(): void {
    this.foodControl.getAllItems();
    this.categoryControl.getAllItems();
    super.getAllItems();
  }
}
