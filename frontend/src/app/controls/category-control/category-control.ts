import { inject, Injectable } from '@angular/core';
import { BaseControl } from '../base-control/base-control';
import { CategoryService } from '../../services/category-service';
import { Category } from '../../../model/category';


@Injectable({
  providedIn: 'root',
})
export class CategoryControl extends BaseControl<number, Category> {
  override service = inject(CategoryService);
}
