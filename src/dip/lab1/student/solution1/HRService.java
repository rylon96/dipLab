package dip.lab1.student.solution1;
public class HRService {
    private Employee employee;
    
    public HRService(Employee e){
        employee = e;
    }
    public HRService(){
        
    }
    public void setEmployee(Employee e){
        if(e==null){
            System.out.println("Enter an Employee");
        }
        employee = e;
    }
    public double getAnnualCompensationForEmployee(){
        return employee.getAnnualWages();
    }
    
    public double getAnnualCompensationForEmployee(Employee e, String employeeType){
        return e.getAnnualWages();
    }
}
 
