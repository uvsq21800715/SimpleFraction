public class Fraction{
    private int numerat, denomin;
    private double result;

    public Fraction(){
        this.numerat = 0;
        this.denomin = 0;
    }

    public Fraction(int numerat, int denomin){
        this.numerat = numerat;
        this.denomin = denomin;
    }

    public int getNumerat(){
        return numerat;
    }

    public int getDenomin(){
        return denomin;
    }

    public void setNumerat(int numerat){
        this.numerat = numerat;
    }

    public void setDenomin(int denomin){
        this.denomin = denomin;
    }
    
    public String toString(){
        return (numerat + " / " + denomin);
    }
}

