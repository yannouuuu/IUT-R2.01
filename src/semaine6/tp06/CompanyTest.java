package tpOO.tp06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompanyTest {
    private Employee ts1, ts2, v1, w1, w2;
    private Company society;

    @BeforeEach
    public void initialization() {
        ts1 = new TravellingSalesperson("ts-A", LocalDate.now().minusDays(20), 20000);
        ts2 = new TravellingSalesperson("ts-B", LocalDate.now().minusDays(5), 2);
        v1 = new Vendor("v-A", LocalDate.now().minusDays(20), 20000);
        w1 = new Worker("w-A", LocalDate.now().minusDays(20), 2000);
        w2 = new Worker("w-B", LocalDate.now().minusDays(5), 2);
        society = new Company();
    }

    @Test
    public void hiringSalesPersonTest() {
        assertEquals(0, society.getNbEmployee());
        society.addEmployee(ts1);
        assertEquals(1, society.getNbEmployee());
        assertEquals(0, society.getNbWorker());
        assertEquals(1, society.getNbSalesPerson());
        society.addEmployee(ts2);
        assertEquals(2, society.getNbEmployee());
        assertEquals(0, society.getNbWorker());
        assertEquals(2, society.getNbSalesPerson());
        society.addEmployee(v1);
        assertEquals(3, society.getNbEmployee());
        assertEquals(0, society.getNbWorker());
        assertEquals(3, society.getNbSalesPerson());
    }

    @Test
    public void hiringWorkerTest() {
        assertEquals(0, society.getNbEmployee());
        society.addEmployee(w1);
        assertEquals(1, society.getNbEmployee());
        assertEquals(1, society.getNbWorker());
        assertEquals(0, society.getNbSalesPerson());
        society.addEmployee(w2);
        assertEquals(2, society.getNbEmployee());
        assertEquals(2, society.getNbWorker());
        assertEquals(0, society.getNbSalesPerson());
    }

    private void hiring() {
        society.addEmployee(ts1);
        society.addEmployee(ts2);
        society.addEmployee(v1);
        society.addEmployee(w1);
        society.addEmployee(w2);
    }
    private void hiring_alternative() {
        society.addEmployee(ts1);
        society.addEmployee(v1);
        society.addEmployee(w1);
    }

    @Test
    public void firingDate_none() {
        hiring();
        assertEquals(5, society.getNbEmployee());
        assertEquals(3, society.getNbSalesPerson());
        assertEquals(2, society.getNbWorker());
        society.firing(LocalDate.now());
        assertEquals(5, society.getNbEmployee());
        assertEquals(3, society.getNbSalesPerson());
        assertEquals(2, society.getNbWorker());
    }

    @Test
    public void firingDate_all() {
        hiring();
        assertEquals(5, society.getNbEmployee());
        assertEquals(3, society.getNbSalesPerson());
        assertEquals(2, society.getNbWorker());
        society.firing(LocalDate.now().minusDays(50));
        assertEquals(0, society.getNbEmployee());
        assertEquals(0, society.getNbSalesPerson());
        assertEquals(0, society.getNbWorker());
    }

    @Test
    public void firingDate_some() {
        hiring();
        assertEquals(5, society.getNbEmployee());
        assertEquals(3, society.getNbSalesPerson());
        assertEquals(2, society.getNbWorker());
        society.firing(LocalDate.now().minusDays(10));
        assertEquals(3, society.getNbEmployee());
        assertEquals(2, society.getNbSalesPerson());
        assertEquals(1, society.getNbWorker());
    }

    @Test
    public void firingObjective_none() {
        hiring_alternative();
        assertEquals(3, society.getNbEmployee());
        assertEquals(2, society.getNbSalesPerson());
        assertEquals(1, society.getNbWorker());
        society.firing();
        assertEquals(3, society.getNbEmployee());
        assertEquals(2, society.getNbSalesPerson());
        assertEquals(1, society.getNbWorker());
    }

    @Test
    public void firingObjective_some() {
        hiring();
        assertEquals(5, society.getNbEmployee());
        assertEquals(3, society.getNbSalesPerson());
        assertEquals(2, society.getNbWorker());
        society.firing();
        assertEquals(3, society.getNbEmployee());
        assertEquals(2, society.getNbSalesPerson());
        assertEquals(1, society.getNbWorker());
    }
}
