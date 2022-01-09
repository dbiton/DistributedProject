package com.example.api.controller

import com.example.api.repository.model.Transaction
import com.example.api.service.TransactionService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

/**
 * Controller for REST API endpoints
 */
@RestController
class TransactionController(private val transactionService: TransactionService) {
    @PostMapping("/transactions")
    fun submitTransaction(@RequestBody transaction: Transaction): Transaction = transactionService.submitTransaction(transaction)

    fun sendCoins(address, amount)

    fun submitTransactionList(transactionList)

    fun getAddressUnspent(address)

    fun getAddressHistory(address)

    @GetMapping("/transactions")
    fun getAllHistory(): List<Transaction> = transactionService.getAllHistory()

    @GetMapping("/employees/{id}")
    fun getEmployeesById(@PathVariable("id") employeeId: Long): Employee =
            employeeService.getEmployeesById(employeeId)

    @PutMapping("/employees/{id}")
    fun updateEmployeeById(@PathVariable("id") employeeId: Long, @RequestBody payload: Employee): Employee =
            employeeService.updateEmployeeById(employeeId, payload)
}