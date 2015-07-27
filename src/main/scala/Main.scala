import data.Point
import gui.Gui
import math.Calculator

/**
 * Created by nchampagne on 7/27/15.
 */
object Main {
  def main(args: Array[String]) {
    println("Hello, world!")
    Calculator.calculateCubicBezierCurve(new Point(1, 2), new Point(5, 3), new Point(10, 10), new Point(4, 4));
  }
}
