import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTextField;

public interface adminInterface {
	
	//Admin management methods below
	public default void createNewCourse(JTextField courseName, JTextField courseID, JTextField maxStudents, JTextField currentStudents, ArrayList<String> allNames, JTextField courseInstructor, JTextField courseSection, JTextField courseLocation) {}
	
	public default void deleteCourse(JTextField courseID) {}
	
	public default void editCourse(JTextField courseID) {}
	
	public default void displayCourse(JTextField courseID, int i) {}
	
	public default void registerStudent(ArrayList<String> names) {}
	
	
	
	//Admin report methods below
	public default void viewStudentsInCourse(JTextField courseID) {}
	
	public default void viewAllCourses() {}
	
	public default void viewNotFullCourses() throws IOException {}
	
	public default void studentRegisteredCourses() {}
        
        public default void sort() {}
	

}
