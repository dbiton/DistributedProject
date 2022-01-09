package com.example.api.repository.model

import java.math.BigInteger
import javax.persistence.*

data class Transfer(
        val address: BigInteger,        // the address receiving the coins
        val coins: ULong                // the amount of coins the address is going to receive
        )

data class UnspentTransactionOutput(
        val id: BigInteger,             // the id of the unspent transaction
        val address: BigInteger         // the address that received the unspent transaction
        )

@Entity
@Table(name = "transaction")
data class Transaction(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: BigInteger,
        @ElementCollection
        val inputs: List<String>,
        @ElementCollection
        val outputs: List<String>
)