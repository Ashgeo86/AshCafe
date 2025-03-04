package Cafe

class Menu {

  var standardMenu: List[MenuItems] = List(
    MenuItems("Burger", 5.99, 10),
    MenuItems("Chips", 2.50, 20),
    MenuItems("Cola", 1.50, 15),
    MenuItems("Sandwich", 4.70, 5),
    MenuItems("Salad", 5.00, 7),
    MenuItems("Coffee", 4.00, 15),
    MenuItems("Tea", 3.50, 20),
    MenuItems("Bacon roll", 4.00, 4),
    MenuItems("Tomato soup", 5.50, 8)
  )

  var premiumSpecial: List[MenuItems] = List()

}
