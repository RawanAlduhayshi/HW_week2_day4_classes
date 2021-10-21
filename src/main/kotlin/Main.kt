fun main(args: Array<String>) {

    var student1 = Student("Rawan","Alduhayshi")
    var student2 = Student("Sara","Alduhayshi")
    var students = mutableListOf(student1,student2)
    var P=Professor("Nora","Alsalem")
    var course=Course("Intro toAlgorithms",12,students,P)
    var isLigal=course.assignProfessor(P)
    var enroll_first_student =course.enroll(student1)
    var enroll_second_student=course.enroll(student2)
    var course_info:Course=course.courseInfo()
    for(index in 0..students.size)
        println(course_info.CourseName+" \n"+course_info.num_lectures+ "\n"+course_info.students[index].fullName()+"\n"+course_info.professor.fullName())
}


