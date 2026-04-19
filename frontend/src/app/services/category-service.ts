import { Injectable } from '@angular/core';
import { BaseService } from './base-service';
import { Category } from 'model/category';


@Injectable({
  providedIn: 'root',
})
export class CategoryService extends BaseService<number, Category> {
  override resource = "category";
}
