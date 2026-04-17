interface Food extends BaseModel<number>{
    name: string,
    calories: number,
    ingredientCount: number,
    expiryDate: Date
}