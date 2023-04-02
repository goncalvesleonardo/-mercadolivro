package com.example.mercadolivro.controller.request

import com.example.mercadolivro.model.CustomerModel

data class PostCustomerRequest(
    var name: String,
    var email: String,
)