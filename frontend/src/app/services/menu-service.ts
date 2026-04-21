import { Injectable } from "@angular/core";
import { BaseService } from "./base-service";
import { Menu } from "model/menu";

@Injectable({
  providedIn: "root"
})
export class MenuService extends BaseService<number, Menu> {
  override resource = "menu";
}
