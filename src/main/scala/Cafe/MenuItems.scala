package Cafe

// Case class representing menu items with stock count
case class MenuItems(name: String, price: Double, var stockCount: Int, foodType: FoodType) {

 // Check if an item is available
 def stockAvailable: Boolean = stockCount > 0

 // Reduce stock when an item is ordered
 def reduceStock(quantity: Int): Boolean = {
  if (stockCount >= quantity) {
   stockCount -= quantity
   true
  } else {
   false
  }
 }
}

// Trait to signify different service charge categories
sealed trait FoodType
case object ColdFood extends FoodType
case object HotFood extends FoodType
case object Drink extends FoodType
case object PremiumFood extends FoodType