import java.io.IOException;
import javax.swing.*;

public interface studentInterface {

	public default void viewNotFullCourses() {}
	
	public default void registerForCourse() {}
	
	public default boolean withdrawFromCourse(String courseID) {return true;}
	
}
