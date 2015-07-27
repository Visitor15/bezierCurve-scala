package data

/**
 * Created by nchampagne on 7/27/15.
 */
class Point(x: Int, y: Int) {

  val pointX: Int = x;
  val pointY: Int = y;

  override def toString() : String = {
    return "(" + x + ", " + y + ")";
  }
}
