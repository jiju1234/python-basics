package employeeManegement;


import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;


public class Employee_manegement {
    int empid;
    String empName;
    String empphno;
    String email;
    String username;
    String password;

  public Employee_manegement() {
      
    }

    @Override
    public String toString() {
        return "Employee_manegement{" + "empid=" + empid + ", empName=" + empName + ", empphno=" + empphno + ", email=" + email + ", username=" + username + ", password=" + password + '}';
    }

    public Employee_manegement(int empid, String empName, String empphno, String email, String username, String password) {
        this.empid = empid;
        this.empName = empName;
        this.empphno = empphno;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    
    
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpphno() {
        return empphno;
    }

    public void setEmpphno(String empphno) {
        this.empphno = empphno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
            
}
