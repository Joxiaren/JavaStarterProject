import { inject, Injectable } from '@angular/core';
import { GenericControl } from 'app/controls/generic-control/generic-control';
import { FoodService } from 'app/services/food-service';

@Injectable({
  providedIn: 'root',
})
export class FoodControl extends GenericControl<number, Food>{
  override service = inject(FoodService);
  
  override getAllItems(){
    this.service.getAll().subscribe(data => {
      data.map(d => {
        d.expiryDate = new Date(d.expiryDate);
      });
      console.log("getting items for Food");
      this.items.set(data);
      console.log(data);
    });
  }
}
