import techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin dbAdmin;

    @Before
    public void before(){
        dbAdmin = new DatabaseAdmin("John Smith", "AB123456", 35000.00);
    }

    @Test
    public void hasName(){
        assertEquals("John Smith", dbAdmin.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("AB123456", dbAdmin.getNINumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(35000.00, dbAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        dbAdmin.raiseSalary(1.03);
        assertEquals(36050.00, dbAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350.00, dbAdmin.payBonus(), 0.01);
    }
}
