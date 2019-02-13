import java.io.*;
import java.util.*;

public class Serialization {
	
	public static void main(String[] args){

		 ArrayList<CourseData> al = Admin.course_data;
		 
		 
		 ArrayList<Student> bl = Courses.Students; 
		 
		try {
			FileOutputStream fos= new FileOutputStream("myfile");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(al);
                        oos.reset();
			FileOutputStream fos2 = new FileOutputStream("myfile2");
			ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
			oos2.writeObject(bl);
                        oos2.reset();
			
			oos.close();
			fos.close();
			oos2.close();
			fos2.close();
		}
	       catch(IOException ioe){
	            ioe.printStackTrace();
	        }
	}
        

}
