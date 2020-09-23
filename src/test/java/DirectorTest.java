import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("John Smith", "AB123456", 35000.00, "IT Department", 35000000.00);
    }

    @Test
    public void hasName(){
        assertEquals("John Smith", director.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("AB123456", director.getNINumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(35000.00, director.getSalary(), 0.01);
    }
    @Test
    public void hasDept(){
        assertEquals("IT Department", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1.03);
        assertEquals(36050.00, director.getSalary(), 0.01);
    }
    @Test public void cantLowerSalaryThroughARaise() {
        director.raiseSalary(0.2);
        assertEquals(35000.00, director.getSalary(), 0.01);
    }

//    @Test
//    public void canPayBonus(){
//        assertEquals(350.00, director.payBonus(), 0.01);
//    }

    @Test public void cantRenameToNullOrNothing() {
        director.setName(null);
        assertEquals("John Smith", director.getName());
        director.setName("");
        assertEquals("John Smith", director.getName());
    }

    @Test public void canPayBonusOf2Percent() {
        assertEquals(700.00, director.payBonus(), 0.01);
    }
}
