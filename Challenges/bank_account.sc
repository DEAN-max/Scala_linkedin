/*
Add a scala app.
Add a class for bank account.
Add a client name, balance and account type(checking or savings)
Use a singleton for the account number and start it at 5000
In the main program create several bank accounts
Finally print out the results
*/
package Practice

object bank_account extends App {
  var cus1 = new Account("Judy Dench", 55551211.2111, "savings")
  var cus2 = new Account("Michael Buttler", 5951211.9999, "checking")
  var cus3 = new Account("Amit G kumar", 9766432211.2331, "savings")

  println(cus1)
  println(cus2)
  println(cus3)
}
class Account(client_name: String, balance: Double, acct_type: String){
  override def toString = "Name: " + client_name + "\nBalance: " + balance + "\nAccount_Type" + acct_type +
    "Account number: " + Customer.getId() + "\n" + "=" * 20
}
object Customer{
  var first = 5000
  var count = 0
  def getId() = {
      first += count
      count = 2
      first
  }
}
/*
Name: Judy Dench
Balance: 5.55512112111E7
Account_TypesavingsAccount number: 5000
====================
Name: Michael Buttler
Balance: 5951211.9999
Account_TypecheckingAccount number: 5002
====================
Name: Amit G kumar
Balance: 9.7664322112331E9
Account_TypesavingsAccount number: 5004
====================
*/
