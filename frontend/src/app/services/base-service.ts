import { HttpClient } from '@angular/common/http';
import { inject } from '@angular/core';
import { environment } from 'environments/environment';
import { BaseModel } from 'model/base-model';

export abstract class BaseService<IdType, Type extends BaseModel<IdType>> {
  http = inject(HttpClient);
  path = environment.BACKEND_URL;
  abstract resource : string;

  getAll() {
    return this.http.get<Type[]>(`${this.path}${this.resource}`);
  }
  create(item: Type) {
    return this.http.post<Type>(`${this.path}${this.resource}`, item);
  }
  update(id: IdType, item: Type) {
    return this.http.put<Type>(`${this.path}${this.resource}/${id}`, item);
  }
  delete(id: IdType) {
    return this.http.delete<Type>(`${this.path}${this.resource}/${id}`);
  }
}
