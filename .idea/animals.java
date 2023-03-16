public class Animals {

    public int weight;
    public String color;
    public int reproduction;
    public String production;
    public String tolk;

    public void setharacteristics(int weight,String color, int reproduction,String production,String tolk){
        this.weight=weight;
        this.color=color;
        this.reproduction=reproduction;
        this.production=production;
        this.tolk=tolk;
    }

    public void productions( int reproduction, String production) {
        this.reproduction=reproduction;
        this.production=production;
    }
    public void appearance(int weight,String color){
        this.weight=weight;
        this.color=color;

    }
    public String characteristics(){
        String info=" Вес животного "+ weight+ " Цвет животного "+ color+" Потомство в год =" + reproduction+ " Производит "+ production+" Издает звук "+ tolk;
        return info;
    }
}


