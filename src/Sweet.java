public class Sweet extends PresentComponent{
    private int chocolatePercentage;
    private int kcal;
    private boolean expired;

    public Sweet(double weight, int chocolatePercentage, int kcal, boolean expired){
        super(weight);
        this.chocolatePercentage = chocolatePercentage;
        this.kcal = kcal;
        this.expired = expired;
    }

    public String toString() {
        return "Sweet{" +
                "class=" + this.getClass().getSimpleName() +
                ", chocolatePercentage=" + chocolatePercentage +
                ", kcal=" + kcal +
                ", expired=" + expired +
                '}';
    }

    public int getChocolatePercentage(){
        return this.chocolatePercentage;
    }

    public int getKcal(){
        return this.kcal;
    }
}

