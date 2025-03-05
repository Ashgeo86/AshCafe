package Cafe

// Produce an itemized bill which includes total and optional service charge
class Bill(val customerChoices: List[MenuItems], val serviceCharge: Option[Double] = None) {

  // Helper functions to calculate service charge
  def tenPercent(price: Double): Double = price * 0.1
  def twentyPercent(price: Double): Double = price * 0.2
  def twentyFivePercent(price: Double): Double = price * 0.25

  // Calculate total price of the bill
  def totalPrice: Double = customerChoices.map(_.price).sum

  // Calculate service charge based on food type
  def addServiceCharge(): Double = {
    serviceCharge.getOrElse {
      val hasColdFood = customerChoices.exists(_.foodType == ColdFood)
      val hasHotFood = customerChoices.exists(_.foodType == HotFood)
      val hasPremiumFood = customerChoices.exists(_.foodType == PremiumFood)

      val baseCharge = totalPrice match {
        case _ if hasPremiumFood => twentyFivePercent(totalPrice)
        case _ if hasHotFood     => twentyPercent(totalPrice)
        case _ if hasColdFood    => tenPercent(totalPrice)
        case _                   => 0.0 // No service charge for drinks
      }

      baseCharge
    }
  }

  // Final total with service charge
  def finalTotal: Double = totalPrice + addServiceCharge()
}