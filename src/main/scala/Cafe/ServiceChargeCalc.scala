package Cafe

object ServiceChargeCalc extends App {

  def tenPercent: Double => Double = price => price * 0.1
  def twentyPercent: Double => Double = price => price * 0.2
  def twentyFivePercent: Double => Double = price => price * 0.25

  def serviceChargeCalculator (item: MenuItems): Double => Double = {
    MenuItems match {
      case MenuItems.ColdFood => tenPercent
      case MenuItems.Hotfood => twentyPercent
      case MenuItems.
    }
  }

  def getFinalDiscount (item: Item): Double = {
    val applyDiscount: Double => Double = discountCalc(item)
    applyDiscount(item.price)
  }
}
