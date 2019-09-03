package com.creativesoftware.model

class Book(val name: String,val author: String,val price: Double) {
 override def toString: String = {
  "name: "+name+", author: "+author+", price: "+price
 }
}
