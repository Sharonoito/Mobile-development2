package com.example.mobilewalletapp

data class Transaction(
    var description: String,
    var reference: String,
    var date:String,
    var amount:Int,
    var transactionType:String,
)


