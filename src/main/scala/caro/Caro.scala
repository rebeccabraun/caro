package caro

import  model.Player

object Caro {

  def main(args: Array[String]): Unit = {
    val student = Player("Rebecca")
    println("Hello " + student.name + ", this is Caro!")

  }
}
