import Array._

object TestArray {
	def main(args:Array[String]){
		var myList = Array(1.9, 2.9, 3.4, 3.5)

		for (x<-myList) {
			println(x)
		}

		var total = 0.0
		for (i <- 0 to (myList.length - 1)) {
			total += myList(i);
		}
		println("Total is " + total)

		var max = myList(0)
		for(i <-1 to (myList.length - 1)) {
			if (myList(i) > max) max = myList(i)
		}
		println("Max is " + max)

		var myList1 = Array(1.9, 2.9, 3.4, 3.5)
		var myList2 = Array(8.9, 7.9, 0.4, 1.5)
		var myList3 = concat(myList1, myList2)
		for (x <- myList3) {
			println(x)
		}
	}
}
