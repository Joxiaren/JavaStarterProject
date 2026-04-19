import { BaseModel } from "./base-model";

export interface Food extends BaseModel<number> {
    name: string,
    calories: number,
    ingredientCount: number,
    expiryDate: Date
}