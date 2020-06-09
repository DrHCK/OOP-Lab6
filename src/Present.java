import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Present {
    private PresentComponent[] presentComponents;

    public Present(PresentComponent[] presentComponents){
        this.presentComponents = presentComponents;
    }

    public Sweet findInChocolateRange(int from, int to){
        for (PresentComponent presentComponent : this.presentComponents){
            if (presentComponent instanceof Sweet){
                if ((((Sweet) presentComponent).getChocolatePercentage()) > from && (((Sweet) presentComponent).getChocolatePercentage() < to)){
                    return (Sweet)presentComponent;
                }
            }
        }
        return null;
    }

    public double getPresentWeight(){
        double weight = 0;
        for (PresentComponent presentComponent : this.presentComponents){
            weight = weight + presentComponent.getWeight();
        }
        return weight;
    }

    public void sortByKcalAndPrint() {
        List<Sweet> sweetsList = new ArrayList();
        for (PresentComponent presentComponent : this.presentComponents) {
            if (presentComponent instanceof Sweet) {
                sweetsList.add((Sweet) presentComponent);
            }
        }
        sweetsList.sort(Comparator.comparing(Sweet::getKcal));
        System.out.println(sweetsList);
    }
}
