import doodle.core.{Stroke, Color, Line, Circle}
import doodle.jvm.Java2DCanvas

/**
  * Created by James on 24/02/2016.
  */


object runner {

  def main(args: Array[String]) {
    val canvas = Java2DCanvas.canvas
    canvas.setSize(500,500)
    canvas.setOrigin(0,0)
    canvas.setStroke(Stroke(3.0, Color.black, Line.Cap.Round, Line.Join.Round))
    Circle(10).draw(canvas)
    canvas.stroke()

  }

}
