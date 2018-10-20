/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.studentregistraionsystem.CourseProgramme;
import com.mycompany.studentregistraionsystem.Module;
import com.mycompany.studentregistraionsystem.Student;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author I342042
 */
public class RegistraionTest {
    
    private Student student;
    private Module module;
    private CourseProgramme cp;
    ArrayList<CourseProgramme> Courses = new ArrayList<CourseProgramme>();
    ArrayList<Student> Students = new ArrayList<Student>();
    ArrayList<Module> Modules = new ArrayList<Module>();
    
    public RegistraionTest() {
    }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
    @Before
    public void setUp() {
         
        student = new Student("John Smith", 35, "01/01/2000", "1234", Courses);
        module = new Module("CT414", Students, Courses);
        cp = new CourseProgramme("BCT", module, new DateTime("2012-08-16"),new DateTime("2013-08-16") );
       
    }
//    
//    @After
//    public void tearDown() {
//    }

//    @Test
//     public void Student_Tests() {
//        student.setName("John Smith");
//        student.setAge(35);
//        student.setDOB("01/01/2000");
//        student.setCourses(cp);
//        student.setID("123456");
//        
//        
//        assertEquals(student.getDOB(), "01/01/2000");
//        assertEquals(student.getUsername(), "John Smith35");
//        assertEquals(student.getCourses().toString(), "[BCT]");
//        assertEquals(student.getID(), "123456");
//        
//     }
//     
//     @Test
//     public void Module_Tests() {
//        module.setStudents(student);
//        module.setName("CT414");
//        module.setCourses("BCT");
//        
//        
//        assertEquals(module.getStudents(), "[John Smith]"); 
//        assertEquals(module.getName(), "CT414");
//        
//     }
//     
     @Test
     public void CP_Tests() {
         Module[] send = new Module[10];
         send[0] = module;
        cp.setModules(send);
        assertEquals(cp.getModules()[0].getName(), "CT414");  
     }
}
