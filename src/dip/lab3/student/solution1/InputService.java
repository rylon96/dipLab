//Incorrect Attempt Ignore but rember this is wrong.
package dip.lab3.student.solution1;
public class InputService {
    private Input input;
    
    public InputService (Input input){
        this.input = input;
    }
    
    public String inputLine(){
        return input.inputLine();
    }
    
    public Input getInputLine(){
        return input;
    }
    
    public void setInputLine(Input input){
        this.input = input;
    }
}
