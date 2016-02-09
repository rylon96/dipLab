package dip.lab1.student.solution1;
public class HRService {
    private Employee employee;
    public HRService(Employee e){
        employee = e;
    }
    public HRService(){
    
    }
    
    public void setEmployee (Employee e){
        if(e == null){
            System.out.println("Please enter a value");
        }
        
        employee = e;
    }
    public double getAnnualCompensationForEmployee(Employee e) {
        return e.getAnnualWages();
    }
}
 

