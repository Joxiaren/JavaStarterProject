import { Routes } from '@angular/router';
import { MainPage } from './pages/main-page/main-page';
import { FoodPage } from './pages/food-page/food-page';
import { MenuPage } from './pages/menu-page/menu-page';
import { CategoryPage } from './pages/category-page/category-page';
import { NotFoundPage } from './pages/not-found-page/not-found-page';

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
