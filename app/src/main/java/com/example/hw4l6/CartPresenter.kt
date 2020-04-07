package com.example.hw4l6

class CartPresenter(
    private val view: ProductView
) {
    private val products = listOf(
        Product(price = 123.5, salePercent = 30, productName = "Fender Telecaster"),
        Product(price = 119.0, salePercent = 5, productName = "Fender Stratocaster"),
        Product(price = 112.1, salePercent = 5, productName = "Gibson Les Paul"),
        Product(price = 119.9, salePercent = 5, productName = "Gibson ES-335"),
        Product(price = 119.9, productName = "Gibson SG Standard")
    )

    fun printAllProducts() = products.forEach { view.print(it.getProductName(), it.calcDiscountPrice()) }

    fun printTotalPrice() = view.print(products.sumByDouble { it.calcDiscountPrice() })
}