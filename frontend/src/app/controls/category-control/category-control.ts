import { inject, Injectable } from '@angular/core';
import { GenericControl } from 'app/controls/generic-control/generic-control';
import { CategoryService } from 'app/services/category-service';

@Injectable({
  providedIn: 'root',
})
export class CategoryControl extends GenericControl<number, Category>{
  override service = inject(CategoryService);
}
