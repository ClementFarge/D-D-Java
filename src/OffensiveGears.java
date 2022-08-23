import java.util.Objects;

public class OffensiveGears {

    //Attributes
    private final String weapon ;

    //Methods

    public OffensiveGears(String champion){
        if (Objects.equals(champion, "Warrior")){
            this.weapon = "Sword" ;
        } else {
            this.weapon = "Staff";
        }
    }

    public String toString(){
        return
                this.weapon ;
    }
}
