
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

    @Before
    public void setUp() {

        cp = new CourseProgramme("BCT", new DateTime("2012-08-16"), new DateTime("2013-08-16"));
        student = new Student("John Smith", 35, "01/01/2000", "1234", cp);
        module = new Module("CT414", student, cp);
        

    }

    @Test
    public void Student_Tests() {
        CourseProgramme[] sendCP = new CourseProgramme[10];
        sendCP[0] = cp;

        student.setName("John Smith");
        student.setAge(35);
        student.setDOB("01/01/2000");
        student.setCourses(sendCP);
        student.setID("123456");

        assertEquals(student.getDOB(), "01/01/2000");
        assertEquals(student.getUsername(), "John Smith35");
        assertEquals(student.getCourses()[0].getName(), "BCT");
        assertEquals(student.getID(), "123456");

    }

    @Test
    public void Module_Tests() {
        Student[] sendStud = new Student[10];
        sendStud[0] = student;

        CourseProgramme[] sendCP = new CourseProgramme[10];
        sendCP[0] = cp;

        module.setStudents(sendStud);
        module.setName("CT414");
        module.setCourses(sendCP);

        assertEquals(module.getStudents()[0].getName(), "John Smith");
        assertEquals(module.getName(), "CT414");
        assertEquals(module.getCourses()[0].getName(), "BCT");

    }

    @Test
    public void CP_Tests() {
        Module[] send = new Module[10];
        send[0] = module;
        cp.setModules(send);
        assertEquals(cp.getModules()[0].getName(), "CT414");

    }
}
