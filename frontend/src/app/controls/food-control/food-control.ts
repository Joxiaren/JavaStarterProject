import { inject, Injectable } from '@angular/core';
import { BaseControl } from '../base-control/base-control';
import { FoodService } from '../../services/food-service';
import { Food } from '../../../model/food';

@Injectable({
  providedIn: 'root',
})
export class FoodControl extends BaseControl<number, Food> {
  override service = inject(FoodService);

  override getAllItems() {
    this.service.getAll().subscribe(data => {
      data.map(d => {
        d.expiryDate = new Date(d.expiryDate);
      });
      this.items.set(data);
    });
  }
}
