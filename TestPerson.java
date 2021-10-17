public class TestPerson {
    public static void main(String[] args)
    {   //Student Test Class
        Student s1 = new Student("Bruce Lee", "1 Happy Ave");
        s1.addCourseGrade("IM101", 97);
        s1.addCourseGrade("IM102", 68);
        s1.printGrades();
        System.out.println("Average is " + s1.getAverageGrade());


        //Teacher Test Class
        Teacher t1 = new Teacher("Todd", "8 Maple Steet");
        System.out.println(t1);
        String[] courses = {"IM101", "IM102", "IM101"};
        for (String course: courses)
        {
            if (t1.addCourse(course))
            {
                System.out.println(course + " Successfully added."); 
            } else
            {
                System.out.println(course + " cannot be added!");
            }
        }
        for (String course: courses)
        {
            if (t1.removeCourse(course))
            {
                System.out.println(course + " Successfully removed!");
            } else
            {
                System.out.println(course + " cannot be removed!");
            }
        }
    }
}
