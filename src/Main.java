public class Main {
    public static void main(String[] args){
        Sweet candy = new Candy(0.1, 100, false);
        Sweet jelly = new Jelly(0.15, 230, false);
        Sweet liteChocolateSweets = new ChocolateSweets(0.1, 30, 300, false);
        Sweet normalChocolateSweets = new ChocolateSweets(0.2, 50, 300, false);
        Sweet extraChocolateSweets = new ChocolateSweets(0.3, 95, 300, false);
        Cookie oatmealCookie = new OatmealCookie(0.3, 200, false, false);
        Cookie bisquitCookie = new BisquitCookie(0.2, 240, false);
        Waffle vanilaWaffle = new VanilaWaffle(0.18, 230, false);

        PresentComponent[] presentComponents = new PresentComponent[]{candy, jelly, liteChocolateSweets, normalChocolateSweets, extraChocolateSweets, oatmealCookie, bisquitCookie, vanilaWaffle};

        Present present = new Present(presentComponents);

        System.out.println("Present's weight = " + present.getPresentWeight());

        Sweet findedSweet;

        //Find sweet with chocolatePercentage between 40 and 60
        findedSweet = present.findInChocolateRange(40, 60);

        System.out.println("Found sweets:");
        if (findedSweet != null) {
            System.out.println(findedSweet.toString());
        } else {
            System.out.println("NOTHING FOUND!");
        }

        //Sort all the sweets by kcal
        present.sortByKcalAndPrint();
    }
}
