import java.io._
class Point(val xc: Int, val yc : Int) {
	var x: Int = xc
	var y: Int = yc

	def move (dx: Int, dy : Int) {
		x = x + dx
		y = y + dy

		println("Pont x location: " + x)
		println("Pont y location: " + y)
	}
}

class Location(override val xc : Int, override val yc : Int, val zc : Int) extends Point(xc, yc) {
	var z: Int = zc

	def move(dx: Int, dy: Int, dz :Int) {
		x = x + dx
		y = y + dy
		z = z + dz

		println("Pont x location: " + x)
		println("Pont y location: " + y)
		println("Pont z location: " + z)
	}
}

object TestClass {
	def main(args: Array[String]) {
		val pt = new Point(10, 20)
		pt.move(10, 10)

		val loc = new Location(10, 20, 15)
		loc.move(10, 10, 5)
	}
}
