import { Injectable } from '@angular/core';
import { BaseService } from 'app/services/base-service';

@Injectable({
  providedIn: 'root',
})
export class MenuService extends BaseService<number, Menu> {
  override resource = "menu"
}
