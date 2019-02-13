import java.io.*;
import java.util.*;
public class Deserialization {
    public static void main(String [] args)
    {
        ArrayList<CourseData> courseData= new ArrayList<CourseData>();
        ArrayList<Student> Student = new ArrayList<Student>();
        try
        {
            FileInputStream fis = new FileInputStream("myfile");
            ObjectInputStream ois = new ObjectInputStream(fis);
            courseData = (ArrayList<CourseData>) ois.readObject();
            ois.close();
            fis.close();
            
            FileInputStream fis2 = new FileInputStream("myfile2");
            ObjectInputStream ois2 = new ObjectInputStream(fis2);
            Student = (ArrayList<Student>) ois2.readObject();
            Admin.course_data= courseData;
            Courses.Students= Student;
            
            ois2.close();
            fis2.close();
        }
        catch(IOException ioe){
             ioe.printStackTrace();
             return;
        }
        catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             return;
        }
        
   }
}
