interface Food extends GenericModel<number>{
    name: string,
    calories: number,
    ingredientCount: number,
    expiryDate: Date
}