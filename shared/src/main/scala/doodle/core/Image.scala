package doodle.core

/**
  * Created by James on 24/02/2016.
  */
import doodle.backend.Canvas

sealed trait Image {

  def on(that: Image): Image =
    ???
  def beside(that: Image): Image = ???
  def above(that: Image): Image = ???
  def draw(canvas: Canvas): Unit = {
    this match {
      case Circle(r) => canvas.circle(0.0, 0.0, r)
      case Rectangle(w,h) => canvas.rectangle(-w/2, h/2, w/2, -h/2) }
  }

}

final case class Circle(radius: Double) extends Image
final case class Rectangle(width: Double, height: Double) extends Image
