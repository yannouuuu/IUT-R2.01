package semaine6.tp06;

import java.time.LocalDate;
import java.util.ArrayList;

public class Company{
    private ArrayList<Employee> staff;

    public Company(ArrayList<Employee> staff) {
        this.staff = staff;
    }
    
    public Company() {
        this.staff = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        staff.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.staff.remove(employee);
    }

    public void removeEmployee(int index) {
        this.staff.remove(index);
    }

    @Override
    public String toString() {
        return staff.toString();
    }

    public int getNbEmployee() {
        return staff.size();
    }

    public int getNbSalesPerson() {
        int count = 0;
        for (int i = 0; i < staff.size(); i++) {
            if (staff.get(i).getTitle().equals("TravellingSalesperson") || staff.get(i).getTitle().equals("Vendor")) {
                count++;
            }
        }
        return count;
    }

    public int getNbWorker() {
        int count = 0;
        for (int i = 0; i < staff.size(); i++) {
            if (staff.get(i).getTitle().equals("Worker")) {
                count++;
            }
        }
        return count;
    }

    public void firing(LocalDate fatefulDate) {
        for (int i = staff.size() - 1; i >= 0; i--) {
            if (!staff.get(i).getHiringDate().isBefore(fatefulDate)) {
                removeEmployee(i);
            }
        }
    }

    public void firing(){
        for (int i = staff.size() - 1; i >= 0; i--) {
            if(!staff.get(i).objectiveFulfilled()){
                staff.remove(i);
            }
        }
    }
}
