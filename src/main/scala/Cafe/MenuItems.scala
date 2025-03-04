package Cafe

case class MenuItems(name: String, price: Double, var stockCount: Int) {

 def isAvailable: Boolean = stockCount > 0

}
