public class DividingComplexNumbers extends ComplexNumbers implements Calculations {

    @Override
    public ComplexNumbers calc(ComplexNumbers a, ComplexNumbers b) {
        
        float numeratorRealPartab = a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart();
        float denomeratorRealPartab = (float) (Math.pow(b.getRealPart(),2) + Math.pow(b.getImaginaryPart(),2));
        float numeratorImaginaryPartab = a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart() ;
        float denomeratorImaginaryPartab = denomeratorRealPartab ;
        float realPartab = numeratorRealPartab/denomeratorRealPartab;
        float imaginaryPartab = numeratorImaginaryPartab/denomeratorImaginaryPartab;
        return new ComplexNumbers(realPartab,imaginaryPartab);
    }
    
}
