

public class Start {
public static void main(String[] args) {
    ComplexNumbers a = new ComplexNumbers();
    ComplexNumbers b = new ComplexNumbers();
    ComplexNumbers c = new SummComplexNumbers();
    ComplexNumbers d = new MultiplicationComplexNumbers();
    ComplexNumbers e = new DividingComplexNumbers();
    InterfaceInOut f = new InterfaceInOut("Введите реальную часть вещественного числа ","Введите мнимую часть вещественного числа ", "Введите математичекую операцию сумма \" + \", деление \" / \", умножение \" * \" ");
    
    System.out.println(f.getNumber1());
    System.out.println(f.getNumber2());
    System.out.println("----------");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c.getImaginaryPart());
    System.out.println(((SummComplexNumbers) c).calc(a,b));
    System.out.println(((MultiplicationComplexNumbers) d).calc(a,b));
    System.out.println(((DividingComplexNumbers) e).calc(a,b));
}
}
