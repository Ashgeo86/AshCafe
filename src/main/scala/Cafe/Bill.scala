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



    //calculate service charge based on food type - No idea how to finish this!
    def AddServiceCharge(customerChoices: List[MenuItems], serviceCharge: Option[Double] = None): Double = {
        Bill match {
          case service if Drink => 0.0
          case service if ColdFood => tenPercent
          case service if HotFood => twentyPercent
          case service if
          case _ => 0.0
        }
      }
  }
}
