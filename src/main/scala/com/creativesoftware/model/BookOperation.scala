package com.creativesoftware.model

class BookOperation extends BookOpp {
  var books: List[Book] = List()

  override def add(name: String, author: String, price: Double): Unit = {
    println("adding ...")
    var book = new Book(name, author, price)
    books = book :: books
    this.printAll()

  }

  override def deleteByName(name: String): Unit = {
    println("Deleting .....")
    var deletingBooks:List[Book]=books.filterNot(_.name==name)
    books=deletingBooks
    this.printAll()
  }

  override def updateByIdName(name: String, book: Book): Unit = {
    this.deleteByName(name)
    books = book :: books
    this.printAll()
  }

  override def printAll(): Unit = {
    books.foreach(println(_))
  }
}
