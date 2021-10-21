class Professor(var firstName_:String,var lastName_:String) {
    var firstName: String =firstName_
    var lastName: String = lastName_
    var telephone: String = ""
    var courses= mutableListOf<String>()
    fun fullName():String{
        return firstName+" "+lastName
    }
}