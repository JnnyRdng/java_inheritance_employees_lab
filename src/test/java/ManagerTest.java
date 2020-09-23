import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("John Smith", "AB123456", 35000.00, "IT Department");
    }

    @Test
    public void hasName(){
        assertEquals("John Smith", manager.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("AB123456", manager.getNINumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(35000.00, manager.getSalary(), 0.01);
    }
    @Test
    public void hasDept(){
        assertEquals("IT Department", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.03);
        assertEquals(36050.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350.00, manager.payBonus(), 0.01);
    }
}
