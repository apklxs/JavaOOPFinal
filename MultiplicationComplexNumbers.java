public class MultiplicationComplexNumbers extends ComplexNumbers implements Calculations {

    @Override
    public ComplexNumbers calc(ComplexNumbers a, ComplexNumbers b) {
        float realPartab = a.getRealPart() * b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart();
        float imaginaryPartab = a.getRealPart() * b.getImaginaryPart() +  a.getImaginaryPart() * b.getRealPart()  ;
        return new ComplexNumbers(realPartab,imaginaryPartab);
    }

    

    
}