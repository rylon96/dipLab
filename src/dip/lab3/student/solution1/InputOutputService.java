package dip.lab3.student.solution1;

public class InputOutputService {

    private Input input;
    private Output output;
    
    public InputOutputService(Input input, Output output){
        this.input = input;
        this.output = output;
    }
    
    public void inputToOutput(){
        String oLine = output.outputLine();
        input.inputLine(oLine);
    }
    
}
