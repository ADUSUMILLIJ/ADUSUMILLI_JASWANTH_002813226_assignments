package model.Course;


import model.Course.Course;
import java.util.ArrayList;
import java.util.List;



/*String id, String name, String professor,String profID, String term, String time,int credit
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sushanthkumarreddyjanga
 */
public class CourseDirectory {
    private List<Course> courses;
   
    
    public CourseDirectory(){
        this.courses = new ArrayList<>();
        //this.profcourses=new ArrayList<>();
        
        
        Course c =new Course();
        c.setId("16");c.setName("Political Science");c.setProfessor("Amit");c.setProfID("6");c.setTerm("Term1");c.setTime("MON 0900-1200");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("1");c.setName("UIUX");c.setProfessor("Kal");c.setProfID("p1");c.setTerm("Term 1");c.setTime("Monday 15-18");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("2");c.setName("UIUX");c.setProfessor("Kal");c.setProfID("p1");c.setTerm("Term 2");c.setTime("Wednesday 15-18");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("3");c.setName("UIUX");c.setProfessor("Kal");c.setProfID("p1");c.setTerm("Term 3");c.setTime("Friday 15-18");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("4");c.setName("ENCP");c.setProfessor("Laura");c.setProfID("p2");c.setTerm("Term 1");c.setTime("Monday 9-12");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("5");c.setName("ENCP");c.setProfessor("Laura");c.setProfID("p2");c.setTerm("Term 2");c.setTime("Tuesday 12-15");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("6");c.setName("ENCP");c.setProfessor("Laura");c.setProfID("p2");c.setTerm("Term 3");c.setTime("Saturday 9-12");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("7");c.setName("ENCP");c.setProfessor("Sabolina");c.setProfID("p3");c.setTerm("Term 1");c.setTime("Tuesday 9-12");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("8");c.setName("ENCP");c.setProfessor("Sabolina");c.setProfID("p3");c.setTerm("Term 2");c.setTime("Wednesday 19-21  ");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("9");c.setName("ENCP");c.setProfessor("Sabolina");c.setProfID("p3");c.setTerm("Term 3");c.setTime("Friday 9-12");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("10");c.setName("ENCP");c.setProfessor("Yusuf");c.setProfID("p4");c.setTerm("Term 1");c.setTime("Monday 17-20");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("11");c.setName("ENCP");c.setProfessor("Yusuf");c.setProfID("p4");c.setTerm("Term 2");c.setTime("Tuesday 14-17");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("12");c.setName("ENCP");c.setProfessor("Yusuf");c.setProfID("p4");c.setTerm("Term 3");c.setTime("Thurday 17-20");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("13");c.setName("ENCP");c.setProfessor("Naveen");c.setProfID("p5");c.setTerm("Term 1");c.setTime("Tuesday 11-14");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("14");c.setName("ENCP");c.setProfessor("Naveen");c.setProfID("p5");c.setTerm("Term 2");c.setTime("Thursday 18-21");c.setCredit(4);
        courses.add(c);
        
        c= new Course();
        c.setId("15");c.setName("ENCP");c.setProfessor("Naveen");c.setProfID("p5");c.setTerm("Term 3");c.setTime("Friday 11-14");c.setCredit(4);
        courses.add(c);
        
        c =new Course();
        c.setId("17");c.setName("Political Science");c.setProfessor("Amit");c.setProfID("6");c.setTerm("Term2");c.setTime("WED 1500-1800");c.setCredit(4);
        courses.add(c);
        
        c =new Course();
        c.setId("18");c.setName("Political Science");c.setProfessor("Amit");c.setProfID("6");c.setTerm("Term3");c.setTime("THU 0900-1200");c.setCredit(4);
        courses.add(c);
        
        c =new Course();
        c.setId("19");c.setName("Web Dev");c.setProfessor("Vishal");c.setProfID("p7");c.setTerm("Term 1");c.setTime("Monday 11-14");c.setCredit(4);
        courses.add(c);
        
        c =new Course();
        c.setId("20");c.setName("Web Dev");c.setProfessor("Vishal");c.setProfID("p7");c.setTerm("Term 2");c.setTime("Wednesday 11-14");c.setCredit(4);
        courses.add(c);
        
        c =new Course();
        c.setId("21");c.setName("Web Dev");c.setProfessor("Vishal");c.setProfID("p7");c.setTerm("Term 3");c.setTime("Friday 18-21");c.setCredit(4);
        courses.add(c);

        c =new Course();
        c.setId("22");c.setName("Automobile");c.setProfessor("Ram");c.setProfID("p8");c.setTerm("Term 1");c.setTime("Tuesday 11-14");c.setCredit(4);
        courses.add(c);
        
        c =new Course();
        c.setId("23");c.setName("Automobile");c.setProfessor("Ram");c.setProfID("p8");c.setTerm("Term 2");c.setTime("Wednesday 17-20");c.setCredit(4);
        courses.add(c);
        
        c =new Course();
        c.setId("24");c.setName("Automobile");c.setProfessor("Ram");c.setProfID("p8");c.setTerm("Term 3");c.setTime("Friday 11-14");c.setCredit(4);
        courses.add(c);

        c =new Course();
        c.setId("25");c.setName("PSA");c.setProfessor("Catherine");c.setProfID("p9");c.setTerm("Term 1");c.setTime("Tuesday 13-16");c.setCredit(4);
        courses.add(c);
        
        c =new Course();
        c.setId("26");c.setName("PSA");c.setProfessor("Catherine");c.setProfID("p9");c.setTerm("Term 2");c.setTime("Friday 13-16");c.setCredit(4);
        courses.add(c);

        c =new Course();
        c.setId("27");c.setName("PSA");c.setProfessor("Catherine");c.setProfID("p9");c.setTerm("Term 3");c.setTime("Saturday 13-16");c.setCredit(4);
        courses.add(c);

        c =new Course();
        c.setId("28");c.setName("OOPS");c.setProfessor("Lebron");c.setProfID("p10");c.setTerm("Term 1");c.setTime("Monday 9-12");c.setCredit(4);
        courses.add(c);

        c =new Course();
        c.setId("29");c.setName("OOPS");c.setProfessor("Lebron");c.setProfID("p10");c.setTerm("Term 2");c.setTime("Wednesday 9-12");c.setCredit(4);
        courses.add(c);

        c =new Course();
        c.setId("30");c.setName("OOPS");c.setProfessor("Lebron");c.setProfID("p10");c.setTerm("Term 3");c.setTime("Friday 9-12");c.setCredit(4);
        courses.add(c);
        
         
        
        
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course add successfully!");
    }
    public Course getCourseByProfID(String id){
        for(Course profC : courses){
            if(profC.getProfID().equals(id)){
               // profcourses.add(profC);
                
            }
        }
        return null;
    }
            
    public Course searchCourse(String id){
        for(Course course: courses){
            if(course.getId().equals(id)){
               return course; 
            }
            }
        return null;
        }
    public void deleteCourse(Course course){
        courses.remove(course);
    }
}
