import { ActivatedRoute } from '@angular/router';
import { ExpensesService } from './../services/expenses.service';
import { Expense } from './../shared/expense';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-expense-details',
  templateUrl: './expense-details.component.html',
  styleUrls: ['./expense-details.component.css'],
})
export class ExpenseDetailsComponent implements OnInit {
  id: string = this.ngOnInit();
  expense: Expense = new ExpensesService().getExpense(this.id);
  constructor(private activatedRoute: ActivatedRoute) {}

  ngOnInit(): string {
    const id = this.activatedRoute.snapshot.paramMap.get('id')!;
    return id;
  }
}
