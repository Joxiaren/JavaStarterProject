import { Injectable } from '@angular/core';
import { GenericService } from 'app/services/generic-service';

@Injectable({
  providedIn: 'root',
})
export class CategoryService extends GenericService<number, Category>{
  override resource = "category";
}
