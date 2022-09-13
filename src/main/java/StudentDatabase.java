import java.sql.*;


public class StudentDatabase{
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();
        try {

            database.insertIntoStudentDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String pass = "admin";
        connection = DriverManager.getConnection(url, user, pass);
        return connection;

    }
    public void insertIntoStudentDatabase() throws SQLException, ClassNotFoundException {
        Statement stmt = getConnection().createStatement();
        System.out.println("Inserting records into the table...");
        String sql = "INSERT INTO student VALUES (1061, 'Zara', 'Jamuna', 18,860,26)";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO student VALUES (1062, 'Mahnaz', 'Hyd', 25,789,29)";
        stmt.executeUpdate(sql);
        System.out.println("Insertion done");
    }

}