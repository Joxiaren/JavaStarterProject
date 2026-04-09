import { Component } from '@angular/core';
import { GenericTable } from 'app/components/generics/generic-table/generic-table';

@Component({
  selector: 'app-menu-table',
  imports: [],
  templateUrl: './menu-table.html',
  styleUrl: './menu-table.css',
})
export class MenuTable extends GenericTable<Menu>{

}
