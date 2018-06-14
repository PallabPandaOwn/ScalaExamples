package unit.test

import org.scalatest.FunSuite
import unit.test.Calculator

class CalculatorTest extends FunSuite{
    test("Calculator.add") {
      println(Calculator.add(10, 20))
    }
}