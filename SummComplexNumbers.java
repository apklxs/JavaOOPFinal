public class SummComplexNumbers extends ComplexNumbers implements Calculations {

    @Override
    public ComplexNumbers calc(ComplexNumbers a, ComplexNumbers b) {
        float realPartab = a.getRealPart() + b.getRealPart();
        float imaginaryPartab = a.getImaginaryPart() + b.getImaginaryPart();
        return new ComplexNumbers(realPartab,imaginaryPartab);
    }

    

    
}
