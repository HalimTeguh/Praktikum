import Praktikum.ElectricityBill;
import Praktikum.Employee;
import Praktikum.InternshipEmployee;
import Praktikum.Payable;
import Praktikum.PermanentEmployee;

public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");

        Employee e;
        Payable p;

        e = pEmp;
        e = iEmp;

        p = pEmp;
        p = eBill;
    }
}
