//DB connection fails
package EXCEPTION_HANDLING;

import java.sql.SQLException;

public class SQLExceptionDemo {
    public static void main(String[] args) {
        try{
            //demo code
            throw new SQLException("Simulated database error");
        }
        catch(SQLException e){
            System.out.println("DataBase error.");
        }
    }
}
