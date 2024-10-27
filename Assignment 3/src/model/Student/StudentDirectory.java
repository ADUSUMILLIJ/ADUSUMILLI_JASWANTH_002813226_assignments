package model.Student;


import model.Student.Student;
import java.util.ArrayList;
import java.util.List;
import model.Professor.Professor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**String id, String name, String email, String uName, String pwd
 *
 * @author sushanthkumarreddyjanga
 */
public class StudentDirectory {
    private List<Student> students;
    
    public StudentDirectory(){
        this.students = new ArrayList<>();
        Student s =new Student();
        s.setId("s1");s.setName("nik");s.setEmail("n@gmail.com");s.setuName("nik");s.setPassword("nik");
        students.add(s);
        
        s =new Student();
        s.setId("s1");s.setName("john");s.setEmail("john@gmail.com");s.setuName("john");s.setPassword("john123");
        students.add(s);

        s =new Student();
        s.setId("s2");s.setName("lina");s.setEmail("lina@gmail.com");s.setuName("lina");s.setPassword("lina123");
        students.add(s);

        s =new Student();
        s.setId("s3");s.setName("amin");s.setEmail("amin@gmail.com");s.setuName("amin");s.setPassword("amin");
        students.add(s);

        s =new Student();
        s.setId("s4");s.setName("hina");s.setEmail("hina@gmail.com");s.setuName("hina");s.setPassword("hina123");
        students.add(s);

        s =new Student();
        s.setId("s5");s.setName("kathy");s.setEmail("kathy@gmail.com");s.setuName("kathy");s.setPassword("kathy123");
        students.add(s);

        s =new Student();
        s.setId("s6");s.setName("mason");s.setEmail("mason@gmail.com");s.setuName("mason");s.setPassword("mason123");
        students.add(s);

        s =new Student();
        s.setId("s7");s.setName("jash");s.setEmail("jash@gmail.com");s.setuName("jash");s.setPassword("jash123");
        students.add(s);

        s =new Student();
        s.setId("s8");s.setName("harsh");s.setEmail("harsh@gmail.com");s.setuName("harsh");s.setPassword("harsh123");
        students.add(s);

        s =new Student();
        s.setId("s9");s.setName("tom");s.setEmail("tom@gmail.com");s.setuName("tom");s.setPassword("tom123");
        students.add(s);

        s =new Student();
        s.setId("s10");s.setName("mitch");s.setEmail("mitch@gmail.com");s.setuName("mitch");s.setPassword("mitch123");
        students.add(s);

        s =new Student();
        s.setId("s11");s.setName("david");s.setEmail("david@gmail.com");s.setuName("david");s.setPassword("david123");
        students.add(s);

        s =new Student();
        s.setId("s12");s.setName("kane");s.setEmail("kane@gmail.com");s.setuName("kane");s.setPassword("kane123");
        students.add(s);

        s =new Student();
        s.setId("s13");s.setName("james");s.setEmail("james@gmail.com");s.setuName("james");s.setPassword("james123");
        students.add(s);

        s =new Student();
        s.setId("s14");s.setName("imran");s.setEmail("imran@gmail.com");s.setuName("imran");s.setPassword("imran123");
        students.add(s);

        s =new Student();
        s.setId("s15");s.setName("kagiso");s.setEmail("kagiso@gmail.com");s.setuName("kagiso");s.setPassword("kagiso123");
        students.add(s);

        s =new Student();
        s.setId("s16");s.setName("travis");s.setEmail("travis@gmail.com");s.setuName("travis");s.setPassword("travis123");
        students.add(s);

        s =new Student();
        s.setId("s17");s.setName("michael");s.setEmail("michael@gmail.com");s.setuName("michael");s.setPassword("michael123");
        students.add(s);

        s =new Student();
        s.setId("s18");s.setName("joe");s.setEmail("joe@gmail.com");s.setuName("joe");s.setPassword("joe123");
        students.add(s);

        s =new Student();
        s.setId("s19");s.setName("mark");s.setEmail("mark@gmail.com");s.setuName("mark");s.setPassword("mark123");
        students.add(s);

        s =new Student();
        s.setId("s20");s.setName("sam");s.setEmail("sam@gmail.com");s.setuName("sam");s.setPassword("sam123");
        students.add(s);

        s =new Student();
        s.setId("s21");s.setName("daryl");s.setEmail("daryl@gmail.com");s.setuName("daryl");s.setPassword("daryl123");
        students.add(s);

        s =new Student();
        s.setId("s22");s.setName("ben");s.setEmail("ben@gmail.com");s.setuName("ben");s.setPassword("ben123");
        students.add(s);

        s =new Student();
        s.setId("s23");s.setName("rassie");s.setEmail("rassie@gmail.com");s.setuName("rassie");s.setPassword("rassie123");
        students.add(s);

        s =new Student();   
        s.setId("s24");s.setName("hamish");s.setEmail("hamish@gmail.com");s.setuName("hamish");s.setPassword("hamish123");
        students.add(s);

        s =new Student();
        s.setId("s25");s.setName("henry");s.setEmail("henry@gmail.com");s.setuName("henry");s.setPassword("henry123");
        students.add(s);

        s =new Student();
        s.setId("s26");s.setName("neil");s.setEmail("neil@gmail.com");s.setuName("neil");s.setPassword("neil123");
        students.add(s);

        s =new Student();
        s.setId("s27");s.setName("jennifer");s.setEmail("jennifer@gmail.com");s.setuName("jennifer");s.setPassword("jennifer123");
        students.add(s);

        s =new Student();
        s.setId("s28");s.setName("ross");s.setEmail("ross@gmail.com");s.setuName("ross");s.setPassword("ross123");
        students.add(s);

        s =new Student();
        s.setId("s29");s.setName("jenna");s.setEmail("jenna@gmail.com");s.setuName("jenna");s.setPassword("jenna123");
        students.add(s);

        s =new Student();
        s.setId("s30");s.setName("alex");s.setEmail("alex@gmail.com");s.setuName("alex");s.setPassword("alex123");
        students.add(s);
        
        
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public Student searchStudent(String id){
        for(Student student: students){
            if(student.getId().equals(id)){
               return student; 
            }
            }
        return null;
        }
    
    public void deleteStudent(Student student){
        students.remove(student);
    }
        
    }
        
    

