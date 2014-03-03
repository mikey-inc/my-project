package org.example

import aa.bb.Hello

class BookController {
    def scaffold = Book // Note the capital "B"
	Hello hello = new Hello()
	
	def index(){
			hello.msg()
	}
	
}