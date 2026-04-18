import { computed, inject, Injectable } from '@angular/core';
import { BaseControl } from '../base-control/base-control';
import { MenuService } from '../../services/menu-service';
import { FoodControl } from '../food-control/food-control';
import { CategoryControl } from '../category-control/category-control';
import { Menu } from '../../../model/menu';


@Injectable({
  providedIn: 'root',
})
export class MenuControl extends BaseControl<number, Menu> {
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
