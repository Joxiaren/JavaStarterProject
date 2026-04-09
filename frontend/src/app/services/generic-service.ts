import { HttpClient } from '@angular/common/http';
import { inject } from '@angular/core';

export abstract class GenericService<IdType, Type> {
  http = inject(HttpClient);
  path = "http://localhost:8080/api/"
  abstract resource : string;

  getAll(){
    console.log(`${this.path}${this.resource}`);
    return this.http.get<Type[]>(`${this.path}${this.resource}`);
  }
  create(item: Type){
    return this.http.post<Type>(`${this.path}${this.resource}`, item);
  }
  update(id: IdType, item: Type){
    return this.http.put<Type>(`${this.path}${this.resource}/${id}`, item);
  }
  delete(id: IdType){
    return this.http.delete<Type>(`${this.path}${this.resource}/${id}`);
  }
}
