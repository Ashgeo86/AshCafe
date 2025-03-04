package Cafe

//A standard list of menu items
object Menu extends App {

    val sandwich = MenuItems(name = "Sandwich", price = 6.00, stockCount = 10, foodType = ColdFood)
    val burger = MenuItems(name = "Burger", price = 8.00, stockCount = 15, foodType = HotFood)
    val pasta = MenuItems(name = "Pasta", price = 12.00, stockCount = 8, foodType = ColdFood)
    val coffee = MenuItems(name = "Coffee", price = 2.50, stockCount = 20, foodType = Drink)
    val salad = MenuItems(name = "Salad", price = 7.00, stockCount = 12, foodType = ColdFood)
    val soup = MenuItems(name = "Soup", price = 5.00, stockCount = 10, foodType = HotFood)
    val icedTea = MenuItems(name = "Iced Tea", price = 3.00, stockCount = 18, foodType = Drink)
    val pizza = MenuItems(name = "Pizza", price = 10.00, stockCount = 6, foodType = HotFood)
    val smoothie = MenuItems(name = "Smoothie", price = 4.50, stockCount = 25, foodType = Drink)
    val fries = MenuItems(name = "Fries", price = 3.50, stockCount = 30, foodType = HotFood)

  //Premium specials that can be added/removed from the menu
  var premiumSpecial: List[MenuItems] = List()


  //Add premium special to the order
  def addPremiumItem(item: MenuItems): Unit = {
    premiumSpecial = premiumSpecial :+ item
  }

}
