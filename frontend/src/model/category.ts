import { BaseModel } from "./base-model";

export interface Category extends BaseModel<number> {
  name: string;
}
