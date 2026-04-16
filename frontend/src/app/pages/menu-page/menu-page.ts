import { Component, inject, OnChanges, SimpleChanges } from '@angular/core';
import { MenuForm } from 'app/components/menu-form/menu-form';
import { MenuTable } from 'app/components/menu-table/menu-table';
import { CategoryControl } from 'app/controls/category-control/category-control';
import { FoodControl } from 'app/controls/food-control/food-control';
import { MenuControl } from 'app/controls/menu-control/menu-control';

@Component({
  selector: 'app-menu-page',
  imports: [ MenuTable, MenuForm ],
  templateUrl: './menu-page.html',
  styleUrl: './menu-page.css',
})
export class MenuPage implements OnChanges{
  menuControl = inject(MenuControl);

  constructor(){
    this.dataRefresh();
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log(changes);
  }

  dataRefresh(){
    this.menuControl.getAllItems();
  }
}
