package Cafe

// A standard list of menu items
object Menu {
  val standardMenu: List[MenuItems] = List(
    MenuItems(name = "Sandwich", price = 6.00, stockCount = 10, foodType = ColdFood),
    MenuItems(name = "Burger", price = 8.00, stockCount = 15, foodType = HotFood),
    MenuItems(name = "Pasta", price = 12.00, stockCount = 8, foodType = ColdFood),
    MenuItems(name = "Coffee", price = 2.50, stockCount = 20, foodType = Drink),
    MenuItems(name = "Salad", price = 7.00, stockCount = 12, foodType = ColdFood),
    MenuItems(name = "Soup", price = 5.00, stockCount = 10, foodType = HotFood),
    MenuItems(name = "Iced Tea", price = 3.00, stockCount = 18, foodType = Drink),
    MenuItems(name = "Pizza", price = 10.00, stockCount = 6, foodType = HotFood),
    MenuItems(name = "Smoothie", price = 4.50, stockCount = 25, foodType = Drink),
    MenuItems(name = "Fries", price = 3.50, stockCount = 30, foodType = HotFood),
    MenuItems(name = "Steak and Chips", price = 100.00, stockCount = 2, foodType = PremiumFood)
  )

  // Premium specials that can be added/removed from the menu
  var premiumSpecial: List[MenuItems] = List()

  // Add premium special to the order
  def addPremiumItem(item: MenuItems): Unit = {
    if (!premiumSpecial.contains(item)) {
      premiumSpecial = premiumSpecial :+ item
    }
  }
}
