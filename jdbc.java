//framework
import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc{
    public static void main(String args[]){
        String url = "jdbc:mysql://localhost:3306";
        String username="root"; 
        String password="";
        try{
        Class.forName("com.mysqll.jdbc.driver");
        Connection connection =DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();

        ResultSet resultSet =statement.ExecuteQuery(select*fromstudent*);
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+""+resultSet.getString(2)+""+resultSet.getInt(3));
        }
        connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
