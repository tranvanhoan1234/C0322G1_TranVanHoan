package company_abc.model;

import java.math.BigDecimal;

public class StaffOfficials extends CompanyABC {
    private Integer salary;
    private Integer salaryCoefficient;

    public StaffOfficials() {
    }

    //Lương NV quản lý: Lương cơ bản x Hệ số lương
    @Override
    public double tinhLuong() {
        return getSalary() * getSalaryCoefficient();
    }

    public StaffOfficials(String name, String dateOfBirth, String address, Integer salary, Integer salaryCoefficient) {
        super(name, dateOfBirth, address);
        this.salary = salary;
        this.salaryCoefficient = salaryCoefficient;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(Integer salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    @Override
    public String toString() {
        return super.toString() +
                "StaffOfficials" +
                "salary : " + salary +
                ", salaryCoefficient : " + salaryCoefficient +
                "\t lương = " + new BigDecimal(tinhLuong());
    }
}
