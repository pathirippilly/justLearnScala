

// Class Person
class Person(name: String, age: Int) {
  def greet(): Unit = {
    println(s"Hello World!, my name is $name and I am $age years old.")
  }
}

object helloWorldWithClass {
  def main(args: Array[String]): Unit = {
    val person = new Person("Akhil", 30)
    person.greet()
  }
}
