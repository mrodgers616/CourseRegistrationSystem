import java.io.*;
import java.util.*;
import javax.swing.*;
import java.io.Serializable;


public class Student extends Courses implements studentInterface, Serializable {

	public Student(String username, String password) {
		setUsername(username);
		setPassword(password);
		
	}
	
	public Student() {
		
	}
        
        public ArrayList<Student> getStudents() {
            return Students;
        }
	
	//method allows student to view courses that are not full
	@Override
	public void viewNotFullCourses() {
		for(int i = 0; i < course_data.size(); i++) {
			if(!(course_data.get(i).getCurrentStudents().equals((course_data).get(i).getMaxStudents()))) {
				System.out.println("This course is not full: " + course_data.get(i).getCourseName());
				
			}
			else {
				System.out.println("All courses are full.");
			}
		}
	}
	
	@Override
	public void registerForCourse() {
		
                /*
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the course ID for the course you want to register for:");
                
		String id = input.nextLine();
		
		for(int i = 0; i < course_data.size(); i++) {
			if(!course_data.get(i).getMaxStudents().equals(course_data.get(i).getCurrentStudents())) {
				if(course_data.get(i).getCourseID().equals(id)) {
					ArrayList<String> names = new ArrayList<String>();
					names.add(studentName.toLowerCase());
					
					course_data.get(i).setStudentNames(names);
					
					int new_students = Integer.parseInt(course_data.get(i).getCurrentStudents());
					new_students++;
					String student_amount = String.valueOf(new_students);
					course_data.get(i).setCurrentStudents(student_amount);
					
					System.out.println("Sucess!");
				}
			}
			else {
				System.out.println("Course if full");
					
			}
				
			
		}*/
		
		
	}
	
	@Override
	public boolean withdrawFromCourse(String courseID) {
            String id = courseID;
            boolean withdraw = false;
            for(int i = 0; i < course_data.size(); i++) {
                if(course_data.get(i).getCourseID().equals(id)) {
                        for(int j = 0; j < course_data.get(i).getStudentNames().size(); j++) {
                            for(int k =0; k < Students.size(); k++) {
                               if(course_data.get(i).getStudentNames().get(j).equals(Students.get(k).getName())) {
                                        course_data.get(i).getStudentNames().remove(j);

                                        int new_students = Integer.parseInt(course_data.get(i).getCurrentStudents());
                                        new_students--;
                                        String student_amount = String.valueOf(new_students);
                                        course_data.get(i).setCurrentStudents(student_amount);
                                        withdraw = true;
                                } 
                            }
                                
                        }
                }
            }
            return withdraw;
	}
	
	
}

