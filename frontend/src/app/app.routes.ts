import { Routes } from '@angular/router';
import { Login } from './pages/login/login';
import { SignUp } from './pages/sign-up/sign-up';
import { SearchResults } from './pages/search-results/search-results';

export const routes: Routes = [{
    path: 'login',
    component: Login
},
{
    path: 'sign-up',
    component: SignUp
},
{
    path: 'books',
    component: SearchResults
}    
];
