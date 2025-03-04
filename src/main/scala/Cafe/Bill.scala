package Cafe

//Produce an itemised bill which includes total and optional service charge
class Bill(val customerChoices: List[MenuItems], val serviceCharge: Option[Double] = None) {

  def tenPercent: Double => Double = price => price * 0.1
  def twentyPercent: Double => Double = price => price * 0.2
  def twentyFivePercent: Double => Double = price => price * 0.25

  def serviceChargeCalculator (item: MenuItems): Double => Double = {
     {
      case
      case MenuItems.Hotfood => twentyPercent
      case MenuItems.
    }
  }
}

