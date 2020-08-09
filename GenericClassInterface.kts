//T is type parameter

interface Repository<T>{
    fun getById(obj: Int): T
    fun getAll(): List<T>
}

class GenericRepository<T>: Repository<T>{
    override fun getById(obj: Int): T {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<T> {
        TODO("Not yet implemented")
    }
}


//In foll. line "Books" in the name of repo is
//redundant as we r already mentioning type
//in <Books>
//val booksRepo = BooksGenericRepository<Books>()

//so refactoring and renaming it to only
//GenericRepository so that just passing type
//<Languages> we can use it for WorksheetRepository
//too

val booksRepo = GenericRepository<Books>()

interface BooksRepository{
    fun store(obj: Books){
    }
    fun getById(id: Int): Books
}

class Books{

}

//Using Generic functions

