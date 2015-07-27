package data

import scala.collection.mutable.ListBuffer

/**
 * Created by nchampagne on 7/27/15.
 */
class BezierCurve {

  var pointList = ListBuffer[Point]();

  def addPointOnCurve(point: Point): ListBuffer[Point] = {
    pointList += point;
    return pointList;
  }
}
