package gui

import scala.swing._

/**
 * Created by nchampagne on 7/27/15.
 */
class Gui

object Gui extends MainFrame {

  title = "Test Title";
  preferredSize = new Dimension(600, 800);

  val button = new Button {
    text = "Click me"
  }
  val label = new Label {
    text = "No button clicks registered"
  }

  contents = new BoxPanel(Orientation.Vertical) {
    contents += button
    contents += label
    border = Swing.EmptyBorder(200, 30, 10, 30)
  }
}
