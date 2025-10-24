package com.example.expense_backend.repository;



import com.example.expense_backend.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
