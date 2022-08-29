package Consumable;

public abstract class Consumables {

    private String name;
    private int effect;

    @Override
    public String toString() {
        return
                "\nObject : " + this.name
                        + "\nEffect : " + "+ " + this.effect + " health";
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEffect(int effect){
        this.effect = effect;
    }
}
