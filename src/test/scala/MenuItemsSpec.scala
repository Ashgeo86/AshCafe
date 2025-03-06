import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import Cafe.{HotFood, MenuItems}

class MenuItemsSpec extends AnyWordSpec with Matchers {

  val menuItem = new MenuItems("Pizza", 10.00, 6, HotFood)
  val menuItemNone = new MenuItems("Soup", 6.00, 0, HotFood)
  "checkStockLevel" should {

    "return true" when {

      "There is one or more items in stock" in {
        val input = menuItem.stockCount
        val expectedResult = 6
        input shouldBe expectedResult
      }
    }

    "return false" when {

      "There is no more items in stock" in {
        val input = menuItemNone.stockCount
        val expectedResult = 0
        input shouldBe expectedResult
      }
    }
  }




}
