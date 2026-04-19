import { Component, inject } from '@angular/core';
import { MenuForm } from 'app/components/menu-form/menu-form';
import { MenuTable } from 'app/components/menu-table/menu-table';
import { MenuControl } from 'app/controls/menu-control/menu-control';

@Component({
  selector: 'app-menu-page',
  imports: [MenuTable, MenuForm],
  templateUrl: './menu-page.html',
  styleUrl: './menu-page.css',
})
export class MenuPage {
  menuControl = inject(MenuControl);

  constructor() {
    this.dataRefresh();
  }

  dataRefresh() {
    this.menuControl.getAllItems();
  }
}
