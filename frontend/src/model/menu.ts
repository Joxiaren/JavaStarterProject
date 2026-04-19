import { BaseModel } from "./base-model";
import { Category } from "./category";
import { Food } from "./food";

export interface Menu extends BaseModel<number> {
    version: number,
    food: Food,
    category: Category
}