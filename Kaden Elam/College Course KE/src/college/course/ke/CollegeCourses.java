package college.course.ke;


public class CollegeCourses {
    
    String department = "";
    int courseNumb = 0;
    double courseFee = 0;
    int creditHours = 0;
    
    final double courseRate = 120.00;
    
    CollegeCourses(String department, int courseNumb, int creditHours)
    {
        this.department = department;
        this.courseNumb = courseNumb;
        this.creditHours = creditHours;
        
        this.courseFee = courseFee;
    }
    
    void display()
    {
        
        System.out.println("Your Course");
        System.out.println("collegeCourse: " + this.department + this.courseNumb);
        System.out.println("Credit Hours: " + this.creditHours + "  Course Fee: $" + this.courseFee);  
    }
}
