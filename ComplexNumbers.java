public class ComplexNumbers {
    private float realPart;
    private float imaginaryPart;

public ComplexNumbers(float realPart, float imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

public ComplexNumbers() {
    }

    
public float getRealPart() {
        return realPart;
    }
    
public float getImaginaryPart() {
        return imaginaryPart;
    }

public void setRealPart(float realPart) {
    this.realPart = realPart;      
    }
    
public void setImaginaryPart(float imaginaryPart) {
    this.imaginaryPart = imaginaryPart; 
        
    }

public String toString() {
    return realPart+" "+"+"+" "+""+imaginaryPart+"i";
    
    
    }

}
