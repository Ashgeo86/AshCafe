package Cafe

class Bill(var menuItems: List[MenuItems], var serviceCharge: Option[Double]) {

  def tenPercent: Double => Double = price => price * 0.1
  def twentyPercent: Double => Double = price => price * 0.2
  def twentyFivePercent: Double => Double = price => price * 0.25

  def totalPrice: Double = {
    val productTotal = menuItems.map(_.price).sum
    serviceCharge match {
      case price if
    }
    }
  }
}

