/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.studentregistraionsystem.CourseProgramme;
import com.mycompany.studentregistraionsystem.Module;
import com.mycompany.studentregistraionsystem.Student;
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
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    @Test
     public void Student_Tests() {
      Student student = new Student();
        student.setName("John Smith");
        student.setAge(21);
        assertEquals(student.getUsername(), "John Smith21");
        
     }
     
     @Test
     public void Module_Tests() {
      Module module = new Module();
        module.setStudents("John Smith");
        module.setName("CT414");
        assertEquals(module.getStudents().toString(), "[John Smith]");  
        
     }
     
     @Test
     public void CP_Tests() {
      CourseProgramme cp = new CourseProgramme();
        cp.setModules("CT414");
        assertEquals(cp.getModules().toString(), "[CT414]");  
     }
}
