import { ExpensesService } from './../services/expenses.service';

import { Expense } from './../shared/expense';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-expenses',
  templateUrl: './expenses.component.html',
  styleUrls: ['./expenses.component.css'],
})
export class ExpensesComponent implements OnInit {
  expenses: Expense[] = new ExpensesService().loadExpenses();
  totalAmount: number = new ExpensesService().countTotalAmountOfExpenses();

  constructor() {}

  ngOnInit(): void {}
}
