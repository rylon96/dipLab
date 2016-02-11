package dip.lab3.student.solution1;
public class OutputService {
    private Output output;
    
    public OutputService (Output output){
        this.output = output;
    }
    
    public String outputLine(){
        return output.outputLine();
    }
    
    public Output getOutputLine(){
        return output;
    }
    
    public void setOutputLine (Output output){
        this.output = output;
    }
    
}
