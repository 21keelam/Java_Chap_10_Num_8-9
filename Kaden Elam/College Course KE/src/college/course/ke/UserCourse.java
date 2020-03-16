package college.course.ke;

import java.util.Scanner;

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
public class UserCourse {
    
    Scanner sc = new Scanner(System.in);
    
    final String[] labCourse = new String[]{"BIO","CHM","CIS","PHY"};    
    
    int courseNumber = 0;
    int creditHours = 0;
    
    void getInfo()
    {
        System.out.println("welcome! Lets get you signed up for a class.");
        System.out.println("Please enter the 3 letter code that corresponds with the department");
        Boolean lab = false;
        
        String department = sc.nextLine();
        
        for(String s : labCourse)
        {
            if (department.equals(s))
            {
                createLabCourse(s);
                lab = true;
                break;
            }
        }
        if(lab == false)
        {
            createCollegeCourse (department);
        }    
    }
    
    void getInformation()
    {
        System.out.println("Please enter the course number");
        courseNumber = sc.nextInt();
    
        System.out.println("How many credit hours will you be taking?");
        creditHours = sc.nextInt();
    }
    void createLabCourse(String dep)
    {
        getInformation();
        LabCourse a = new LabCourse(dep, courseNumber, creditHours);
        
        
        a.display();
        sc.close();
    }
    void createCollegeCourse(String dep)
    {
        getInformation();
        CollegeCourses b = new CollegeCourses(dep, courseNumber,creditHours);
    
        b.display();
        sc.close();
    } 













}
