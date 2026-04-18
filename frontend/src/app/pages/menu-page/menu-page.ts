import { Component, inject, OnChanges, SimpleChanges } from '@angular/core';
import { MenuTable } from '../../components/menu-table/menu-table';
import { MenuForm } from '../../components/menu-form/menu-form';
import { MenuControl } from '../../controls/menu-control/menu-control';

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
