package BaseDeDatos;

import java.sql.*;

public class AppBaseDatos {
  public void connectDatabase() {
    try {
      try {
        Class.forName("org.postgresql.Driver");
      } catch (ClassNotFoundException ex) {
        System.out.println("Error al registrar el driver PostgreSQL: " + ex);
      }
      Connection connection = null;

      connection = DriverManager.getConnection(
          "jdbc:postgresql://ep-rough-base-a5t31fog.us-east-2.aws.neon.tech/JA-Mexico?user=JA-Mexico_owner&password=Zq0WsVkzB3po&sslmode=require");
      boolean valid = connection.isValid(50000);
      System.out.println(valid ? "TEST OK" : "TEST FAIL");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  public static void main(String[] args) {
    AppBaseDatos app = new AppBaseDatos();
    app.connectDatabase();
  }
}
