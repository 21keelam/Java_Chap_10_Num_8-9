package college.course.ke;


public class LabCourse  extends CollegeCourses 
{
    
    public LabCourse(String department, int courseNumb, int creditHours)
    {
        
     super(department,courseNumb, creditHours);   
        
     this.courseFee = (creditHours * courseRate) + 50;   
    }   
    
    @Override
    void display()
    {
        
        System.out.println("Your Course");
        System.out.println("LabCourse: " + this.department + this.courseNumb);
        System.out.println("credit Hours: " + this.creditHours + " Course Fee: $" + this.courseFee);
    }
}
