import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthComponent } from './auth/auth.component';
import { BudgetsComponent } from './budgets/budgets.component';
import { ExpenseDetailsComponent } from './expense-details/expense-details.component';
import { ExpensesComponent } from './expenses/expenses.component';
import { FilterExpenseGuard } from './guards/filter-expense.guard';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'expenses', component: ExpensesComponent },
  {
    path: 'expenses/:id',
    component: ExpenseDetailsComponent,
    canActivate: [FilterExpenseGuard],
  },
  { path: 'budgets', component: BudgetsComponent },
  {
    path: 'auth',
    component: AuthComponent,
    children: [
      { path: 'login', component: LoginComponent },
      { path: 'register', component: RegisterComponent },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
