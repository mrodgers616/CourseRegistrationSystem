import java.util.ArrayList;
import java.io.Serializable;

public class CourseData implements Serializable {
	
	private String courseName = null;
	private String courseID = null;
	private String maxStudents = null;
	private String currentStudents = null;
	private ArrayList<String> studentNames = null;
	private String courseInstructor = null;
	private String courseSection = null;
	private String courseLocation = null;
	
	public CourseData() {
		
	}
	
	public CourseData(String courseName, String courseID, String maxStudents, String currentStudents, ArrayList<String> studentNames, String courseInstructor, String courseSection, String courseLocation) {
		this.courseName = courseName;
		this.courseID = courseID;
		this.maxStudents = maxStudents;
		this.currentStudents = currentStudents;
		this.studentNames = studentNames;
		this.courseInstructor = courseInstructor;
		this.courseSection = courseSection;
		this.courseLocation = courseLocation;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getMaxStudents() {
		return maxStudents;
	}
	public void setMaxStudents(String maxStudents) {
		this.maxStudents = maxStudents;
	}
	public String getCurrentStudents() {
		return currentStudents;
	}
	public void setCurrentStudents(String currentStudents) {
		this.currentStudents = currentStudents;
	}
	public ArrayList<String> getStudentNames() {
		return this.studentNames;
	}
	public void setStudentNames(ArrayList<String> studentNames) {
		this.studentNames = studentNames;
	}
        public void addStudentNames(String newNames) {
		studentNames.add(newNames);
	}
	public String getCourseInstructor() {
		return courseInstructor;
	}
	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	public String getCourseSection() {
		return courseSection;
	}
	public void setCourseSection(String courseSection) {
		this.courseSection = courseSection;
	}
	public String getCourseLocation() {
		return courseLocation;
	}
	public void setCourseLocation(String courseLocation) {
		this.courseLocation = courseLocation;
	}
	
	
	
}
