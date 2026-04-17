import { Injectable } from '@angular/core';
import { BaseService } from 'app/services/base-service';

@Injectable({
  providedIn: 'root',
})
export class CategoryService extends BaseService<number, Category>{
  override resource = "category";
}
