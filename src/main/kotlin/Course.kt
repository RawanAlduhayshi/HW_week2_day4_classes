class Course(var courseName_:String,var num_lectures_:Int,var students_:List<Student>,var professor_:Professor){
    var CourseName:String=courseName_
    var num_lectures:Int=num_lectures_
   var students= students_.toMutableList()
    var professor:Professor=professor_

    fun numberOfStudents():Int{
        return students.size
    }
    fun assignProfessor(p:Professor):Boolean{
      if(professor.firstName==null){
          professor.firstName=p.firstName
          professor.lastName=p.lastName
          return true}
        else {return false}
    }

    fun professorName():String{
        return professor.fullName()
    }
    fun enroll(s:Student):Boolean{
        if(students.size==20)
            return false
        else{
            students.add(s)
            return true
        }
    }
    fun courseInfo():Course{

        return Course(CourseName,num_lectures,students,professor)
    }

}