package com.creativesoftware

import com.creativesoftware.model.{Book, BookOperation}

object Main {
  def main(args: Array[String]) {
    var bookOperation: BookOperation=new BookOperation
    bookOperation.add("aa","ragul",12)
    var book:Book=new Book("bb","ragul",12)
   bookOperation.updateByIdName("aa",book)
  }
}
