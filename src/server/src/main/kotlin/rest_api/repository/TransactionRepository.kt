package com.example.api.repository

import com.example.api.repository.model.Transaction
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigInteger

@Repository
interface TransactionRepository : JpaRepository<Transaction, BigInteger>