// router/index.js
import { createRouter, createWebHistory } from 'vue-router';
import AppDashboard from '../components/AppDashboard.vue';
import RecipesList from '../components/RecipesList.vue';

const routes = [
    {
        path: '/dashboard',
        component: AppDashboard,
    },
    {
        path: '/recipes',
        component: RecipesList,
    },
    {
        path: '/ingredients',
        component: () => import('../components/IngredientsList.vue'), // 确保指向正确的组件
    },
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;
