import { Component, inject } from '@angular/core';
import { MenuTable } from 'app/components/menu-table/menu-table';
import { MenuControl } from 'app/controls/menu-control/menu-control';

@Component({
  selector: 'app-menu-page',
  imports: [MenuTable],
  templateUrl: './menu-page.html',
  styleUrl: './menu-page.css',
})
export class MenuPage {
  menuControl = inject(MenuControl);

  constructor(){
    this.dataRefresh();
  }

  dataRefresh(){
    this.menuControl.getAllItems();
  }
}
