package dip.lab3.student.solution1;
public class Run {
    public static void main(String[] args) {
        Input in = new KeyboardInput();
        Output out = new ConsoleOutput();
        
        InputOutputService ios = new InputOutputService (in, out);
        ios.inputToOutput();
        
        
        
    }
    
}
