package dip.lab3.student.solution1;

public class InputOutputService {

    private MessageInput input;
    private MessageOutput output;
    
    public InputOutputService(MessageInput input, MessageOutput output){
        this.input = input;
        this.output = output;
    }
    
    public void inputToOutput(){
        String iLine = input.inputMessage();
        output.outputMessage(iLine);
    }
    
}
