public class MyFerm {
    public static void main(String[] args) {
        Animals pig = new Animals();
        pig.setharacteristics(120,"pink",2,"Сало","Хрю");

        String res1=pig.characteristics();

        System.out.println(res1);

        Animals chiken = new Animals();
        chiken.setharacteristics(3,"Gray",15,"Яйца","Кух-кудах");

//chiken.weight=3;
//chiken.reproduction=15;
//chiken.production="Яйцы";
//chiken.tolk="Кух-кудах";
//chiken.color="Gray";
        String res2=chiken.characteristics();
        System.out.println(res2);

        Animals cow = new Animals();
        cow.setharacteristics(280,"RedHead",1,"Мясо и молоко","МУУУУУУ");
//cow.productions(1,"Мясо и молоко");
//cow.appearance(280,"Redhead");
//cow.tolk="МУУУУУУ";
        String res3=cow.characteristics();

        System.out.println(res3);
    }
}




