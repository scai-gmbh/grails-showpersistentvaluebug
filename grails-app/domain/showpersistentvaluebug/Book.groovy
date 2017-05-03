package showpersistentvaluebug

class Book {

    static constraints = {
    }

    String bookName

    def beforeUpdate() {
        println "beforeUpdate"
    }

}
