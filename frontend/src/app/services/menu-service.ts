import { Injectable } from '@angular/core';
import { GenericService } from 'app/services/generic-service';

@Injectable({
  providedIn: 'root',
})
export class MenuService extends GenericService<number, Menu> {
  override resource = "menu"
}
