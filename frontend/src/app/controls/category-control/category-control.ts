import { inject, Injectable } from '@angular/core';
import { BaseControl } from 'app/controls/base-control/base-control';
import { CategoryService } from 'app/services/category-service';

@Injectable({
  providedIn: 'root',
})
export class CategoryControl extends BaseControl<number, Category>{
  override service = inject(CategoryService);
}
