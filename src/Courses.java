import java.io.*;
import java.util.*;
import javax.swing.*;
public class Courses implements java.io.Serializable{
	
	public static ArrayList<CourseData> course_data = new ArrayList<CourseData>();
        public static CourseData myCourseData = null;
        public static ArrayList<Student> Students = new ArrayList<Student>();
	private String username = null;
	private String password = null;
	protected String studentName = null;
        
        public Courses() {
            
        }
        
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
        
	public String getName() {
		return studentName;
	}
        
	public void setName(String studentName) {
		this.studentName = studentName;
	}

	
	
	//method prints all courses and some info for admin and the student
	public void viewAllCourses() {
            //commented out code was used before GUI
            /*
		System.out.println("All Courses that are available:");
		for(int i = 0; i < course_data.size(); i++ ) {
			System.out.print(course_data.get(i).getCourseName() + " | ");
			System.out.print(course_data.get(i).getCourseID() + " | ");
			System.out.print(course_data.get(i).getStudentNames() + " | ");
			System.out.print(course_data.get(i).getMaxStudents() + "\n"); 
		}
               */
	}
	
	
	//method exits from program
	public void exit() {
		System.exit(0);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//Creates an array list that populated with the file data separated by line breaks
		ArrayList<String> file_data = new ArrayList<String>();
		Scanner file = new Scanner(new File("MyUniversityCourses.csv"));
		file.useDelimiter("\n");
		while (file.hasNext()) {
			file_data.add(file.nextLine());
		}
		file.close();
		
		//Creates an array populated with the array list elements converted to strings and separated by commas
		String the_data = file_data.subList(0, file_data.size()).toString();
		String[] data_array = the_data.split(",");
		
		//loop iterates through previous data array 
		for(int i = 8; i < data_array.length; i++) {
			if((i) % 8 == 0 && i > 0) {
				ArrayList<String> names = new ArrayList<String>(Arrays.asList(data_array[i+4]));
                                 myCourseData = new CourseData(data_array[i], data_array[i+1], data_array[i+2], data_array[i+3], names, data_array[i+5], data_array[i+6], data_array[i+7]);
				course_data.add(myCourseData);
			}
			
			
			
		}
		
		
		
		
	}
	
	

}
