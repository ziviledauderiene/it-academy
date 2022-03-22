import { Expense } from './../shared/expense';
import { expensesList } from './../shared/DATA';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ExpensesService {
  constructor() {}

  loadExpenses(): Expense[] {
    return expensesList;
  }

  countTotalAmountOfExpenses(): number {
    let totalAmount = 0;
    for (let i = 0; i < expensesList.length; i++) {
      totalAmount += parseFloat(expensesList[i].amount);
    }
    return totalAmount;
  }

  getExpense(id: string): Expense {
    return expensesList[parseInt(id)-1];
  }
}
