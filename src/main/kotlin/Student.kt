class Student(var firstName_:String,var lastName_:String) {
    var firstName:String=""
    var lastName:String=""
    var courses= mutableListOf<String>()

    fun fullName():String{
        return firstName+" "+lastName
    }
}