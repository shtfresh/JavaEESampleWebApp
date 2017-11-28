package oracle.com.db;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
/**
 *
 * @author tasheng
 */
public class DBConnection {
    
    private static String USERNAMR = "oracleusr";//ユーザー名
    private static String PASSWORD = "oracle";//パスワード
    private static String DRVIER = "oracle.jdbc.OracleDriver";//ドライバー
    private static String URL = "jdbc:oracle:thin:@10.182.243.185:1521:XE";//接続文字
    // データベース接続を作る
    Connection connection = null;
      public Connection getConnection() {
        try {
            Class.forName(DRVIER);
            connection = DriverManager.getConnection(URL, USERNAMR, PASSWORD);
            System.out.println("データベース接続成功");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("class not find !", e);
        } catch (SQLException e) {
            throw new RuntimeException("get connection error!", e);
        }
        return connection;
    }
}
