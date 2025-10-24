package com.example.expense_backend.service;

import com.example.expense_backend.model.Expense;
import com.example.expense_backend.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ExpenseService {
	


	    private final ExpenseRepository repository;

	    public ExpenseService(ExpenseRepository repository) {
	        this.repository = repository;
	    }

	    public List<Expense> getAllExpenses() {
	        return repository.findAll();
	    }

	    public Optional<Expense> getExpenseById(Long id) {
	        return repository.findById(id);
	    }

	    public Expense saveExpense(Expense expense) {
	        return repository.save(expense);
	    }

	    public Expense updateExpense(Long id, Expense expenseDetails) {
	        Expense expense = repository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Expense not found with id " + id));

	        expense.setTitle(expenseDetails.getTitle());
	        expense.setAmount(expenseDetails.getAmount());
	        expense.setCategory(expenseDetails.getCategory());
	        expense.setDate(expenseDetails.getDate());

	        return repository.save(expense);
	    }

	    public void deleteExpense(Long id) {
	        repository.deleteById(id);
	    }
	}


