import Praktikum.ElectricityBill;
import Praktikum.Employee;
import Praktikum.InternshipEmployee;
import Praktikum.Payable;
import Praktikum.PermanentEmployee;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Halim", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Teguh", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employee e[] = { pEmp, iEmp };
        Payable p[] = { pEmp, eBill };
        Employee e2[] = { pEmp, iEmp, /* eBill */ };
    }
}
