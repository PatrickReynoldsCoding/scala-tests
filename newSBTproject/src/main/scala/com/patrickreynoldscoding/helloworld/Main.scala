package com.patrickreynoldscoding

import scala.util.Random

object Main {

// pick random Int from array
  def pickRandNum(numbers: Array[Int]): Int = {
    val index = Random.nextInt(numbers.length)
    numbers(index)
  }
// Add two Ints
  def add(x: Int, y: Int): Int = {
    x + y
  }

// Sub Int by 1
  def sub(x: Int): Int = {
    x - 1
  }

// Pick Rand message from Array
  def randMessage(messages: Array[String]): String = {
    val index = Random.nextInt(messages.length)
    messages(index)
  }

// combine message and Int
  def finalMessage(message: String, number: Int): String = {
    s"$message $number"
  }

// Main
  def main(args: Array[String]) = {
    val numbers = Array(1, 2, 3, 4, 10)
    val num1 = pickRandNum(numbers)
    val num2 = pickRandNum(numbers)
    val addedNum = add(num1, num2)
    val subbedNum = sub(addedNum)
    val message = randMessage(Array("I love the number", "I hate the number"))
    println(finalMessage(message, subbedNum))
  }

}
