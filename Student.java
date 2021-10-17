public class Student extends Person {
    //Attributes
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 30;

    //Constructor
    public Student(String name, String address)
    {
        super(name,address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }
    //To string
        @Override
        public String toString()
        {
            return "Student: " + super.toString();
        }

        //Add a course and grade
        public void addCourseGrade(String course, int grade)
        {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            ++numCourses;
        }

        public void printGrades()
        {
            System.out.println(this);
            for (int i = 0; i < numCourses; ++i)
            {
                System.out.print(" " + courses[i] + ":" + grades[i]);
            }
            System.out.println();
        }

            public double getAverageGrade()
            {
                int sum = 0;
                for (int i = 0; i < numCourses; i++)
                {
                    sum += grades[i];
                }
                return (double)sum/numCourses;
            }
        }
