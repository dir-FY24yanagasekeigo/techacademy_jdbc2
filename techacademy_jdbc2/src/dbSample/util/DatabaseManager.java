package dbSample.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    // データベース接続と結果取得のための変数
    private static Connection con;
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        // 1.ドライバーのクラスをJava上で読み込む
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2.DBと接続する
        con = DriverManager.getConnection(
            "jdbc:mysql://localhost/world?useSSL=false&allowPublicKeyRetrieval=true",
            "root",
            "_KeyMySql123"
            );
        
        return con;
    }
    
    public static void close() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}