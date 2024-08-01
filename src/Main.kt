fun main(args: Array<String>) {
    val publibrary = publicLibrary()

    publibrary.addBook(Book("Gitanjoli","Rabindranath tagor", 1950))
    publibrary.addBook(Book("The avengers","Marvel", 2012))
    publibrary.addBook(Book("The return of the king","J.R.R", 1960))

    println("********All Books********")
    publibrary.viewAllBooks()

    println("*****Find books by author*****")
    publibrary.findBooksByAuthor("Rabindranath tagor")
}