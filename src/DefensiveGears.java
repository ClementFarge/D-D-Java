import java.util.Objects;

public class DefensiveGears {

    //Attributes
    private final String shield ;

    //Methods

    public DefensiveGears(String champion){
        if (Objects.equals(champion,"Warrior")){
            this.shield = "Shield";
        }else {
            this.shield = "Barrier";
        }
    }

    public String toString(){
        return
                this.shield ;
    }
}
