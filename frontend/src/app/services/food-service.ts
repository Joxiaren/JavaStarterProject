import { Injectable } from '@angular/core';
import { BaseService } from 'app/services/base-service';

@Injectable({
  providedIn: 'root',
})
export class FoodService extends BaseService<number, Food>{
  override resource = "food"
}
