package math

import data.{Point, BezierCurve}

/**
 * Created by nchampagne on 7/27/15.
 */
object Calculator {



  def calculatorQuadraticBezierCurve(point0: Point, point1: Point, point2: Point): BezierCurve = {
    val bezierCurve = new BezierCurve();

    var tVal: Double = 0;

    for(tVal <- 0.0 to 1.0 by 0.1) {
      val p0ValX = point0.pointX;
      val p0ValY = point0.pointY;
      val p1ValX = point1.pointX;
      val p1ValY = point1.pointY;
      val p2ValX = point2.pointX;
      val p2ValY = point2.pointY;

      val X: Int = ((2 * (1 - tVal)) * (p1ValX - p0ValX) + ((2 * tVal) * (p2ValX - p1ValX))).toInt;
      val Y: Int = ((2 * (1 - tVal)) * (p1ValY - p0ValY) + ((2 * tVal) * (p2ValY - p1ValY))).toInt;

      println("Generated point, (" + X + ", " + Y + ")");
    }

    return bezierCurve;
  }

  def calculateCubicBezierCurve(point0: Point, point1: Point, point2: Point, point3: Point): BezierCurve = {
    val bezierCurve = new BezierCurve();

    val p0ValX = point0.pointX;
    val p0ValY = point0.pointY;
    val p1ValX = point1.pointX;
    val p1ValY = point1.pointY;
    val p2ValX = point2.pointX;
    val p2ValY = point2.pointY;
    val p3ValX = point3.pointX;
    val p3ValY = point3.pointY;

    val tVal: Double = 0.0;
    for(tVal <- 0.0 to 1.0 by 0.1) {
      val X: Int = ((p0ValX * Math.pow((1 - tVal), 3)) + (p1ValX * 3 * Math.pow((1 - tVal), 2) * tVal) + (p2ValX * 3 * (1 - tVal) * Math.pow(tVal, 2)) + (p3ValX * Math.pow(tVal, 3))).toInt;
      val Y: Int = ((p0ValY * Math.pow((1 - tVal), 3)) + (p1ValY * 3 * Math.pow((1 - tVal), 2) * tVal) + (p2ValY * 3 * (1 - tVal) * Math.pow(tVal, 2)) + (p3ValY * Math.pow(tVal, 3))).toInt;

      println("Generated point, (" + X + ", " + Y + ")");
      bezierCurve.addPointOnCurve(new Point(X, Y));
    }

    return bezierCurve;
  }

  def calculateCubicBezierCurveWithOffset(f: Tuple2[Int, Int] => Point, point0: Tuple2[Int, Int], point1: Tuple2[Int, Int], point2: Tuple2[Int, Int], point3: Tuple2[Int, Int]): BezierCurve = {
    calculateCubicBezierCurve(f(point0), f(point1), f(point2), f(point3));
  }
}
