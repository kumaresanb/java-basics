package com.evolvus.object.relationship;

import java.util.ArrayList;
import java.util.List;

public class GFG {
	
	public static void main(String[] args) {
		Student s1 = new Student("Mia", 1, "CSE"); 
        Student s2 = new Student("Priya", 2, "CSE"); 
        Student s3 = new Student("John", 1, "EE"); 
        Student s4 = new Student("Rahul", 2, "EE");
        
        List <Student> cseStudents = new ArrayList<>(); 
        cseStudents.add(s1); 
        cseStudents.add(s2);
        
        List <Student> eeStudents = new ArrayList<>(); 
        eeStudents.add(s3); 
        eeStudents.add(s4); 
        
        Department cse=new Department("CSE", cseStudents);
        Department ee=new Department("EE", eeStudents);
        
        List<Department> departments=new ArrayList<>();
        departments.add(cse);
        departments.add(ee);
        
     // creating an instance of Institute. 
        Institute institute = new Institute("BITS", departments); 
          
        System.out.print("Total students in institute: "); 
        System.out.print(institute.getTotalStudentsInInstitute()); 
    } 
	

}
