object basicsObj1 {

  def add_nums(num1:Int = 0,num2: Int = 0): Int = {
    val sum=num1+num2
    return sum

  }
}

object driverObj{
  def main(args: Array[String]): Unit = {
    println(basicsObj1.add_nums(6))
  }
}
