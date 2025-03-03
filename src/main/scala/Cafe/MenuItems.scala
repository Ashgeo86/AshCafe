package Cafe

case class MenuItems(name: String, price: Double, category: MenuItems, isPremium: Boolean)

object MenuItems {
  case object Food extends MenuItems
  case object Drink extends MenuItems
}