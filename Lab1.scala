package labs_politeh

/**
  * Created by Лазо on 13.11.2016.
  * Лазо Юлия, группа 13544/2
  * 6) Реализовать функцию, вычисляющую элемент треугольника паскаля (рекурсивно!)
  * def pascal(row:Int, columnt:Int) = ??? (например pascal (0,0) =1, а pascal(2, 1) =2)
  */
object Lab1 {
  def main(args: Array[String]) {


    val col= 2
    val row=3


    println( "pascal("+ col +","+ row +")=" + pascal(col, row))
    println("Треугольник Паскаля")
    for (row <- 0 to row) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

    def pascal(column: Int, row: Int):
    Int = {
      if (column == 0 || column == row) 1
      else pascal(column - 1, row - 1) + pascal(column, row - 1)
    }


}
