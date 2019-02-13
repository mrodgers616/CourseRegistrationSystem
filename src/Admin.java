import java.io.*;
import java.util.*;
import javax.swing.*;

public class Admin extends Courses implements adminInterface {
	
	//public ArrayList<String> names = new ArrayList<String>();
	
   
        
	public Admin(String fullName) {
		
		setUsername("Admin");
		setPassword("Admin001");
		setName(fullName);
	}
	
	public Admin() {
		
	}
	
////////////////////////- Admin Course Management methods- /////////////////////////
	
	
	
	//method to create a course based on Admin specification
        @Override
	public void createNewCourse(JTextField courseName, JTextField courseID, JTextField maxStudents, JTextField currentStudents, ArrayList<String> allNames, JTextField courseInstructor, JTextField courseSection, JTextField courseLocation) {
		/*
		Scanner input = new Scanner(System.in);
		
		
		String course_name = courseName.getText();
		String course_id = courseID.getText();
		String max_Students = maxStudents.getText();
		String current_students = currentStudents.getText();
		ArrayList<String> names = allNames;
		String course_instructor = courseInstructor.getText();
		String course_section = courseSection.getText();
		String course_location = courseLocation.getText();
		
                
                //Below is code used before GUI was created
                
		String loop_string = "b";
		
		System.out.println("Enter the Course Name:");
		course_name = input.nextLine();
		System.out.println("Enter the Course ID:");
		course_id = input.nextLine();
		System.out.println("Enter the maximum number of students: ");
		max_Students = input.nextLine();
		System.out.println("Enter the current number of students: ");
		current_students = input.nextLine();
		System.out.println("Enter all of the student names for the new course. Enter (a) to finish");
		while(!(loop_string.toLowerCase().equals("a"))) {
			loop_string = input.nextLine();
			names.add(loop_string);
		}
		names.remove(names.size()-1);
		
		
		System.out.println("Enter the course instructor: ");
		course_instructor = input.nextLine();
		System.out.println("Enter the Course Section:");
		course_section = input.nextLine();
		System.out.println("Enter the Course Location:");
		course_location = input.nextLine();
		
		course_data.add(new CourseData(course_name,course_id,max_Students,current_students,names,course_instructor,course_section,course_location));
		*/
	}
	
	//method to delete courses
        @Override
	public void deleteCourse(JTextField courseID) {
                
            //commented out code used before GUI
            /*
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Course ID of the Course you want to delete");
            String course_id_delete = input.nextLine();
            */
            
            String course_id_delete = courseID.getText();
            for(int i = 0; i < course_data.size(); i++) {
                    if(course_data.get(i).getCourseID().equals(course_id_delete)) {
                            course_data.remove(i);
                    }
            }
	}
	
	//method allows user to edit course name, ID, or instructor
	
        @Override
	public void editCourse(JTextField courseID) {
		
            /*
		Scanner input = new Scanner(System.in);
		String course_id_edit = null;
		String edit = null;
		System.out.println("Enter the Course ID of the course you want to edit:");
		course_id_edit = input.nextLine();
		System.out.println("Edit the maximum number of students (1)");
		System.out.println("Edit the current number of students (2)");
		System.out.println("Edit the course instructor (3)");
		System.out.println("Edit the course section (4)");
		System.out.println("Edit the course location (5)");
		
		edit = input.nextLine();
		
		for(int i = 0; i < course_data.size(); i++) {
			if(course_data.get(i).getCourseID().equals(course_id_edit)) {
				
				if(edit.equals("1")) {
					System.out.println("Enter the new maximum number of students:");
					String max = input.nextLine();
					
					course_data.get(i).setMaxStudents(max);
				}
				else if(edit.equals("2")) {
					System.out.println("Enter the new current number of students:");
					String current = input.nextLine();
					course_data.get(i).setCurrentStudents(current);;
					
				}
				else if(edit.equals("3")) {
					System.out.println("Enter the new course instructor");
					String instructor = input.nextLine();
					course_data.get(i).setCourseInstructor(instructor);
				}
				
				else if(edit.equals("4")) {
					System.out.println("Enter the new course section");
					String section = input.nextLine();
					course_data.get(i).setCourseLocation(section);
				}
				
				else if(edit.equals("5")) {
					System.out.println("Enter the new course location");
					String location = input.nextLine();
					course_data.get(i).setCourseLocation(location);
				}
				
			}
		}
            */
	}
	
	//method displays all information for a course for admin
	@Override
	public void displayCourse(JTextField courseID, int i) {
            //Commented code below used before GUI
            /*
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Course ID for the course you want to display:");
            String id = input.nextLine();

            for(int i = 0; i < course_data.size(); i++) {
                    if(course_data.get(i).getCourseID().equals(id)) {
                            System.out.print(course_data.get(i).getCourseName() + " | " );
                            System.out.print(course_data.get(i).getCourseID() + " | ");
                            System.out.print(course_data.get(i).getMaxStudents() + " | ");
                            System.out.print(course_data.get(i).getCurrentStudents() + " | ");
                            System.out.print(course_data.get(i).getStudentNames() + " | ");
                            System.out.print(course_data.get(i).getCourseInstructor() + " | ");
                            System.out.print(course_data.get(i).getCourseSection() + " | ");
                            System.out.print(course_data.get(i).getCourseLocation() + "\n");
                    }
            }
            */
            
            
	}
	
	@Override
	public void registerStudent(ArrayList<String> studentNames) {
            //commented out code was used before GUI
            /*
            Scanner input = new Scanner(System.in);
            String loop_string = "b";
            System.out.println("Enter all of the student names for the new course. Enter (a) to finish");
            while(!(loop_string.toLowerCase().equals("a"))) {
                    loop_string = input.nextLine();
                    names.add(loop_string);
            }
            names.remove(names.size()-1);

            for(int i = 0; i < names.size(); i++) {
                    Students.add(new Student("student" + i, "student00" + i));
                    Students.get(i).setName(names.get(i));
                    System.out.println("New student: " + Students.get(i).getName());
                    System.out.println("Username: " + Students.get(i).getUsername() + " Password: " + Students.get(i).getPassword()) ;

            }

            */
            
           
            //names = studentNames;

            for(int i = Students.size(); i < studentNames.size(); i++) {
                Students.add(new Student("student" + i, "student00" + i));
                Students.get(i).setName(studentNames.get(i));
                System.out.println("New student: " + Students.get(i).getName());
                System.out.println("Username: " + Students.get(i).getUsername() + " Password: " + Students.get(i).getPassword());
                

            }
            
            
	}
	
	
	//////////////////////// - Admin Reports methods - /////////////////////////
	
	
	
	//method allows admin to view full courses
	public static void viewFullCourses() throws IOException {
		PrintWriter writer = new PrintWriter("FullCourses.txt", "UTF-8");
		ArrayList<String> full_courses = new ArrayList<String>();
		for(int i = 0; i < course_data.size(); i++) {
                    if(course_data.get(i).getCurrentStudents().equals((course_data).get(i).getMaxStudents())) {
                        //System.out.println("This course is full: " + course_data.get(i).getCourseName());
                        full_courses.add(course_data.get(i).getCourseName());
                        writer.write(full_courses.toString() + "\n");

                    }
                    else {
                            //System.out.println("No courses are full.");
                    }
		}
                writer.close();
	}
	
	//method allows admin to view students in course
	@Override
	public void viewStudentsInCourse(JTextField courseID) {
                //method moved to gui home 
		/*
                Scanner input = new Scanner(System.in);
		System.out.println("Enter the course ID to see students in the course");
                */
		
	}
	
	//method allows admin to see all courses a student is registered in 
        @Override
	public void studentRegisteredCourses() {
		/*
                Scanner input = new Scanner(System.in);
		System.out.println("Enter a student first and last name to see the courses they are registered for:");
		String student_name = input.nextLine().toLowerCase();
		
		String student_name = name.getText();
		for(int i = 0; i < course_data.size(); i++) {
			if(course_data.get(i).getStudentNames().contains(student_name)) {
				System.out.print("The student is registered in the following courses:");
				System.out.println(course_data.get(i).getCourseName());
			}
			
		}
		*/
	} 
	
        @Override
	public void sort() {
		course_data.sort(Comparator.comparing(CourseData::getCurrentStudents));
	}
	
	
	
	
	
}
