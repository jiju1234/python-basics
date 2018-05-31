package employee.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


class DBConnect {
    public static Connection getConnection(){
      Connection  con=null;
     try {
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
        
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
     }
      return con;
}
}