class subscription(plan_type:String = "basic") {
  /*
  1. Any attribute defined inside a class is an instance variable with
  public access modifier
  2. Apart from public we can have private and protected
  3. Here plan_type is an optional public instance variable. Both plans and tax
  are public instance values. The method get_total_price is public instance method
  4. If you define a variable global to a class and if you change it within a method.
  Still it will change globally for that instance.
   */
  val plans: Map[String,Double]=Map(
    "basic" -> 1000,
    "standard" -> 1500,
    "premium" -> 2500
  )
  private val tax : Double = 0.18
  def get_total_price(): Double={
    val final_price=plans.getOrElse(plan_type, 0.0)  +
      (plans.getOrElse(plan_type, 0.0) * tax)
    return final_price
  }

//  Getter access method for private variable
  def get_tax (): Double ={
    return tax
  }

}

object basicsClassesObjects {
  def main(args: Array[String]): Unit = {
    var sub1= new subscription()
    println("Basic Plan cost : " + sub1.plans.getOrElse("basic", 0.0))
    println("Total amount to be paid : " + sub1.get_total_price())
    println("Current tax applied : " + sub1.get_tax()*100 + " %")
  }
}
