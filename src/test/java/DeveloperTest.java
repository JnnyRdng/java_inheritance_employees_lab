import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("John Smith", "AB123456", 35000.00);
    }

    @Test
    public void hasName(){
        assertEquals("John Smith", developer.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("AB123456", developer.getNINumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1.03);
        assertEquals(36050.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350.00, developer.payBonus(), 0.01);
    }
}
