package Consumable;

public abstract class Consumables {

    private String name;
    private String effect;

    @Override
    public String toString() {
        return
                "\nObject : " + this.name
                        + "\nEffect : " + this.effect;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEffect(String effect){
        this.effect = effect;
    }
}
