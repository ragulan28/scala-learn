package com.creativesoftware.model

abstract class BookOpp {
  def add(name: String, author: String, price: Double)
  def deleteByName(name:String)
  def updateByIdName(name:String, book:Book)
  def printAll()
}
