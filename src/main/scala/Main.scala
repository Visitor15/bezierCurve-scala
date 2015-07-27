import data.{BezierCurve, Point}
import math.Calculator

/**
 * Created by nchampagne on 7/27/15.
 */
object Main {

  var offset: Int = 25;

  def main(args: Array[String]) {
    println("Hello, world!")
    val bezierCurve: BezierCurve = Calculator.calculateCubicBezierCurve(new Point(1, 2), new Point(5, 3), new Point(10, 10), new Point(4, 4));

    // Partial function
    val partialBezierCurveFunc = Calculator.calculateCubicBezierCurve(new Point(1, 2), _: Point, _: Point, new Point(4, 4));
    val calcedBezierCurve = partialBezierCurveFunc.apply(new Point(50, 50), new Point(42, 42));

    // Closure test
    val offsetBezierCurve = Calculator.calculateCubicBezierCurveWithOffset(createPointWithOffset, (2, 2), (2, 4), (2, 6), (2, 8));
  }

  def createPointWithOffset(point: Tuple2[Int, Int]): Point = {
    val newPoint = new Point(point._1 + offset, point._2 + offset);
    println("POINT CREATED (" + point._1 + ", " + point._2 + ") --> (" + newPoint.pointX + ", " + newPoint.pointY + ")");
    return newPoint;
  }
}
