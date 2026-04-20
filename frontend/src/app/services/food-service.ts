import { Injectable } from "@angular/core";
import { BaseService } from "./base-service";
import { Food } from "model/food";

@Injectable({
  providedIn: "root"
})
export class FoodService extends BaseService<number, Food> {
  override resource = "food";
}
