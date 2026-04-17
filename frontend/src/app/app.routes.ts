import { Routes } from '@angular/router';
import { CategoryPage } from 'app/pages/category-page/category-page';
import { FoodPage } from 'app/pages/food-page/food-page';
import { MainPage } from 'app/pages/main-page/main-page';
import { MenuPage } from 'app/pages/menu-page/menu-page';
import { NotFoundPage } from 'app/pages/not-found-page/not-found-page';

export const routes: Routes = [
    {
        path: "",
        component: MainPage,
        title: "App"
    },
    {
        path: "food",
        component: FoodPage,
        title: "Food"
    },
    {
        path: "menu",
        component: MenuPage,
        title: "Menu"
    },
    {
        path: "category",
        component: CategoryPage,
        title: "Category"
    },
    {
        path: "**",
        component: NotFoundPage,
        title: "404"
    }
];
