package Diet.app.Aplication;
import  java.sql.*;


public class Conn {
    Connection c;
    Statement s;

    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///calculationSystem", "root", "Localhost1243");
            s = c.createStatement();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public void DodajDoBazy(){
        String gender = DietFrame.getStringGenderField();
        double age = DietFrame.getDoubleAgeField();
        double weight = DietFrame.getDoubleWeightField();
        zapiszDoBazy(gender, age, weight);

    }
    public void zapiszDoBazy(String gender, double age, double weight){
        try{
            String query = "INSERT INTO Uzytkownicy (plec, wiek, waga) VALUES(?, ?, ?)";
            try (PreparedStatement preparedStatement = c.prepareStatement(query)){
                preparedStatement.setString(1, gender);
                preparedStatement.setDouble(2, age);
                preparedStatement.setDouble(3, weight);
                preparedStatement.executeUpdate();
            }
            c.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
