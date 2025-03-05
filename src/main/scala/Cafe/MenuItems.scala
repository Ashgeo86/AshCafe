package Cafe

//Case class showing menu items and their params, with stock count
case class MenuItems(name: String, price: Double, var stockCount: Int, foodType: FoodType) {

 def stockAvailable: Boolean = stockCount > 0

}

//Add food types to signify the different service charges
 trait FoodType

  case object ColdFood extends FoodType
  case object HotFood extends FoodType
  case object Drink extends FoodType