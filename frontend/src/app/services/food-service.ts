import { Injectable } from '@angular/core';
import { GenericService } from 'app/services/generic-service';

@Injectable({
  providedIn: 'root',
})
export class FoodService extends GenericService<number, Food>{
  override resource = "food"
}
