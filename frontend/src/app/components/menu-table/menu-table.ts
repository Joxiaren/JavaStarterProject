import { Component } from '@angular/core';
import { BaseTable } from 'app/components/base-components/base-table/base-table';

@Component({
  selector: 'app-menu-table',
  imports: [],
  templateUrl: './menu-table.html',
  styleUrl: './menu-table.css',
})
export class MenuTable extends BaseTable<Menu>{

}
