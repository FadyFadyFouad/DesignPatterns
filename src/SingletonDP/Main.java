package SingletonDP;

//import SingletonDP.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            PreparedStatement statement = DB.getInstance().getConnection().prepareStatement("INSERT INTO patient (name, phone, password, age, gender) VALUES (?,?,?,?,?)");
//            statement.setInt(1, 10);
            statement.setString(1, "Fady Fahim");
            statement.setString(2,"+201280828109");
            statement.setString(3, "Password");
            statement.setInt(4,23);
            statement.setInt(5,1);
            statement.executeUpdate();
        } catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}