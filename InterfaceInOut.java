import java.util.Scanner;

public class InterfaceInOut {
    private float number1;
    private float number2;
    private String info3;
    private String info2;
    private String info1;
    private char operation;

public InterfaceInOut (float number1, float number2, String info1, String info2, String info3, char operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.info1 = info1;
        this.info2 = info2;
        this.info3 = info3;
        this.operation = operation;
        
        
    }

public InterfaceInOut(String info1, String info2, String info3) {
        this.number1 = inputStringNumber(info1);
        this.number2 = inputStringNumber(info2);
        this.operation = inputOperation(info3);
        
        
    }

 public InterfaceInOut() {

    }
    


public float getNumber1() {
    return number1;
    }
    
public float getNumber2() {
        return number2;
    }

public float setNumber1() {
        return number1;
    }
    
public float setNumber2() {
        return number2;
    }
private static float inputStringNumber(String info) {
    System.out.print(info);
    Scanner in = new Scanner(System.in);
    return in.nextFloat();
    }

private static char inputOperation(String info) {
    System.out.print(info);
    Scanner in = new Scanner(System.in);
    return in.nextLine().charAt(0);
    }


}
