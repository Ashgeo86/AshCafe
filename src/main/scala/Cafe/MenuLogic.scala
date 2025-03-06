package Cafe

object MenuLogic extends App {

  // Simulate ordering from the menu
  val order1 = List(
    MenuItems("Sandwich", 6.00, 10, ColdFood),
    MenuItems("Coffee", 2.50, 20, Drink),
    MenuItems("Pasta", 12.00, 8, ColdFood),
    MenuItems("Steak", 100.00, 8, PremiumFood)
  )

  // Create a bill for the order
  val bill = new Bill(order1)

  // Print receipt
  println("Itemized Bill:")
  order1.foreach { item =>
    println(s"${item.name}: £${item.price}")
  }
  println(s"Subtotal: £${bill.totalPrice}%.2f")
  println(s"Service Charge: £${bill.addServiceCharge()}%.2f")
  println(s"Final Total: £${bill.finalTotal}%.2f")
}