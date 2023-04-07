object basicsFunctionsConcept1 {
/*
Function overloading sample methods given below.
Functions with same name but with different functionalities.
Based on argument numbers or types of argument , respective
method will be selected for execution

 */
  def add_nums(num1:Int,num2: Int): Int = {
    val sum=num1+num2
    return sum


  }

  def add_nums(num1: Int, num2: Int,num3: Int): Int = {
    val sum = num1 + num2 + num3
    return sum


  }

  def add_nums(num1: Int, num2: String): String = {
    val sum = num1 + num2
    return sum

  }

  /*
  You can define a method logic with just equal sign if your output is a
  single line
   */
  def add_nums_special(num1: Int, num2: Int): Int = num1 + num2
}

/*
Demonstration object
 */
object driverObj{
  def main(args: Array[String]): Unit = {
    println(basicsFunctionsConcept1.add_nums(8,9))
    println(basicsFunctionsConcept1.add_nums(6,7,8))
    println(basicsFunctionsConcept1.add_nums(6,"abc"))
    println(basicsFunctionsConcept1.add_nums_special(num1 = 5,num2 = 8))
  }
}
