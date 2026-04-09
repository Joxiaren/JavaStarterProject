import { inject, Injectable } from '@angular/core';
import { GenericControl } from 'app/controls/generic-control/generic-control';
import { MenuService } from 'app/services/menu-service';

@Injectable({
  providedIn: 'root',
})
export class MenuControl extends GenericControl<number, Menu>{
  override service = inject(MenuService);
}
