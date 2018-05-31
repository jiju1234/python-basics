package employee.dao;
import employeeManegement.Employee_manegement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmplyeeDAO {
   
    public void insertemployee_manegement(Employee_manegement m){
              
         
        PreparedStatement ps;
        try {
            ps = DBConnect.getConnection().prepareStatement("insert into Employee_manegement(emp_id,emp_name,emp_phno,email,username,password) values(?,?,?,?,?,?)");
            
            ps.setInt(1,m.getEmpid());
            ps.setString(2,m.getEmpName());
            ps.setString(3,m.getEmpphno());
            ps.setString(4, m.getEmail());
            ps.setString(5,m.getUsername());
            ps.setString(6,m.getPassword());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }}
          
   public void updateemployee_manegement(Employee_manegement e){
         try {
            PreparedStatement ps=DBConnect.getConnection().prepareStatement("update Employee_manegement set emp_name=?,emp_phne=?,emp_email=?,emp_username=?,emp_password=? where emp_id=?");
           ps.setInt(6,e.getEmpid());
            ps.setString(1,e.getEmpName());
            ps.setString(2,e.getEmpphno());
            ps.setString(3,e.getEmail());
            ps.setString(4,e.getUsername());
            ps.setString(5,e.getPassword());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger( EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Employee_manegement> listAllEmployee_manegements(){
        ArrayList<Employee_manegement> al=new ArrayList<Employee_manegement>();
        try {
            
            PreparedStatement ps=DBConnect.getConnection().prepareStatement("select * from employee_manegement");
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
              Employee_manegement s=new Employee_manegement();
                s.setEmpid(rs.getInt(1));
                s.setEmpName(rs.getString(2));
                s.setEmpphno(rs.getString(3));
                s.setEmail(rs.getString(4));
                s.setUsername(rs.getString(5));
                s.setPassword(rs.getString(6));
                al.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee_manegement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

     public Employee_manegement findBId(int id){
        Employee_manegement s=new Employee_manegement();
        try {
            PreparedStatement ps=DBConnect.getConnection().prepareStatement("select * from employee_manegement where emp_id=?");
            ps.setInt(1, id);
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
                s.setEmpid(rs.getInt(1));
                s.setEmpName(rs.getString(2));
                s.setEmpphno(rs.getString(3));
                s.setEmail(rs.getString(4));
                s.setUsername(rs.getString(5));
                s.setPassword(rs.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee_manegement.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println(s);
        return s;
    
    
     }
public void delete(int id){
     PreparedStatement ps;
        try {
            ps = DBConnect.getConnection().prepareStatement("delete from employee_manegement where emp_id=?");
             ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
}
    
     public static void main(String[] args) {
       EmplyeeDAO pp=new EmplyeeDAO();
       Employee_manegement  p;
        p = new Employee_manegement(3,"jiju","no num","jijusebastain2","haron","jiju");
       // pp.insertemployee_manegement(p);
     pp.insertemployee_manegement(p);
    
}

}