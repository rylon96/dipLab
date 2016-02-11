package dip.lab3.student.solution1;
public class Run {
    public static void main(String[] args) {
        MessageInput in = new KeyboardInput();
        //MessageInput in = new GoodMorningInput();
        MessageOutput out = new ConsoleOutput();
        
        InputOutputService ios = new InputOutputService (in, out);
        ios.inputToOutput();
        
        
        
    }
    
}
