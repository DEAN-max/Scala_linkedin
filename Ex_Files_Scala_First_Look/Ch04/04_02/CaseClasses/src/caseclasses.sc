object caseclasses {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  case class Money(val amount: Int = 1, val currency: String = "USD") {
    //define a function called '+' to add two money objects
    def +(other: Money): Money = Money(amount + other.amount)
  }
  //creates a money object with 1 USD
  val defaultAmount = Money()                     //> defaultAmount  : caseclasses.Money = Money(1,USD)
  //creates a money object with 5 USD
  val fiveDollars = Money(5)                      //> fiveDollars  : caseclasses.Money = Money(5,USD)
  //creates a money object with 5 USD
  val fiveDollars2 = Money(5, "USD")              //> fiveDollars2  : caseclasses.Money = Money(5,USD)
  //creates a money object with 1 EUR
  val euros = Money(currency = "EUR")             //> euros  : caseclasses.Money = Money(1,EUR)

  //copy to make a new Money object
  val tenDollars = euros.copy(10)                 //> tenDollars  : caseclasses.Money = Money(10,EUR)
  val tenDollars2 = tenDollars.copy(currency = "USD")
                                                  //> tenDollars2  : caseclasses.Money = Money(10,USD)

  val moneyList = List(Money(), Money(50, "GBP"), Money(45, "EUR"))
                                                  //> moneyList  : List[caseclasses.Money] = List(Money(1,USD), Money(50,GBP), Mon
                                                  //| ey(45,EUR))

  //use the + definition above
  println("add 10 + 15: " + { Money(10, "USD") + Money(15, "USD") })
                                                  //> add 10 + 15: Money(25,USD)
}