import { Component } from '@angular/core';
import { Menu } from '../../../model/menu';
import { BaseTable } from '../base-components/base-table/base-table';

@Component({
  selector: 'app-menu-table',
  imports: [],
  templateUrl: './menu-table.html',
  styleUrl: './menu-table.css',
})
export class MenuTable extends BaseTable<number, Menu> {

}
