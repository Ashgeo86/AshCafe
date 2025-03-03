package Cafe

case class MenuItems(name: String, price: Double, category: MenuItems, isPremium: Boolean)

object MenuItems {
  case object Hotfood extends MenuItems
  case object ColdFood extends MenuItems
  case object Drink extends MenuItems
}