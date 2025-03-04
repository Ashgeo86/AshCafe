package Cafe

//Produce an itemised bill which includes total and optional service charge
class Bill(val customerChoices: List[MenuItems], val serviceCharge: Option[Double] = None) {

  //helper functions to calculate service charge
  def tenPercent: Double => Double = price => price * 0.1
  def twentyPercent: Double => Double = price => price * 0.2
  def twentyFivePercent: Double => Double = price => price * 0.25

  //calculate total of the bill (with and without service charge)
  def totalPrice: Double = {
    val total = customerChoices.map(_.price).sum


    //calculate service charge based on food type
    serviceCharge match {
      case Some(charge) => total + charge
      case None =>
        // Calculate the service charge based on food type
        val serviceChargeAmount = customerChoices.map {
          case MenuItems(_, price, ColdFood) => tenPercent(price)
          case MenuItems(_, price, HotFood) => twentyPercent(price)
          case MenuItems(_, price, Drink) => 0.0
        }.sum

        total + serviceChargeAmount
    }
  }
}

