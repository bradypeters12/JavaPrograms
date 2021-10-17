public class Teacher extends Student{
    //Attributes
    private int numCourses;
    private String[] courses;
    private static final int MAX_COURSES = 5;

    public Teacher(String name, String address)
    {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
    }
    //To String
    @Override
    public String toString()
    {
        return "Teacher: " + super.toString();
    }
    //return false if course already exists
    public boolean addCourse(String course)
    {     //Check if the course is already in list
        for (int i = 0; i < numCourses; i++)
        {
            if (courses[i].equals(course)) return false;
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }
    //return false if the course cannot be found
    public boolean removeCourse(String course)
    {
        boolean found = false;
        //Look for course
        int courseIndex = -1;
        for (int i =0; i < numCourses; i++)
        {
            if (courses[i].equals(course))
            {
                courseIndex = i;
                found = true;
                break;
            }
        }
        if (found)
        {   //Remove course and re-arrange array
            for (int i = courseIndex; i < numCourses-1; i++)
            {
                courses[i] = courses[i+1];
            }
            numCourses--;
            return true;
        } else {
            return false;
        }
    }
}
