package Main;

import Characters.Characters;
import Characters.Warrior;
import Characters.Wizard;
import Shield.DefensiveGears;
import Shield.Barrier;
import Shield.Shield;
import Weapons.OffensiveGears;
import Weapons.hand.Stick;
import Weapons.spell.Magic;
import org.mariadb.jdbc.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManagement {

    private final DatabaseConnection connect = new DatabaseConnection();

    public void save(Characters player, String name) throws SQLException {
        Statement stmt = (Statement) connect.setConnection();
        stmt.executeUpdate("INSERT INTO `Hero`(type,Name,life,strength,weapon,shield) VALUE ('" + name + "','" + player.getName() + "','" + player.getLife() + "'," + player.getAttack() + ",'" + player.getAttackGears() + "','" + player.getDefensiveGears() + "')");
    }

    public Characters loadCharacter(int id) throws SQLException {
        Statement stmt = (Statement) connect.setConnection();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Hero WHERE id = " + id + "");
        OffensiveGears offensiveGears;
        DefensiveGears defensiveGears;
        Characters characters = null;
        while (rs.next()) {
            String type = rs.getString("type");
            String name = rs.getString("Name");
            int life = rs.getInt("life");
            int strength = rs.getInt("strength");
            String weapon = rs.getString("weapon");
            String shield = rs.getString("shield");
            if (weapon.equals("Stick")) {
                offensiveGears = new Stick();
            } else {
                offensiveGears = new Magic();
            }
            if (shield.equals("Shield")) {
                defensiveGears = new Shield();
            } else {
                defensiveGears = new Barrier();
            }
            if (type.equals("class Characters.Warrior")) {
                characters = new Warrior(name, life, strength, offensiveGears, defensiveGears);
            } else {
                characters = new Wizard(name, life, strength, offensiveGears, defensiveGears);
            }
        }
        return characters;
    }
}



