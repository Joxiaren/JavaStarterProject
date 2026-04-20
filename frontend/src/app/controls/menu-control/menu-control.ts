import { computed, inject, Injectable } from "@angular/core";
import { BaseControl } from "app/controls/base-control/base-control";
import { CategoryControl } from "app/controls/category-control/category-control";
import { FoodControl } from "app/controls/food-control/food-control";
import { MenuService } from "app/services/menu-service";
import { Menu } from "model/menu";

@Injectable({
  providedIn: "root"
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
