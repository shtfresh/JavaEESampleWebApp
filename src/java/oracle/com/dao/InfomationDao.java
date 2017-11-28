/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.com.dao;

import oracle.com.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.com.bean.Infomation;

/**
 *
 * @author tasheng
 */
public class InfomationDao {

    private String sql;
    private Connection connection = null;
    private Statement statement;
    private DBConnection dbConnection;
    private ResultSet set = null;
    private List<Infomation> infomationList;
    
    public  InfomationDao(){

             dbConnection = new DBConnection();
            connection = dbConnection.getConnection();
        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(InfomationDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void addInfomation(String bikeNumber, String name, String adress) {

        
        sql = "INSERT INTO INFOMATION (ID,BIKENUMBER,NAME,ADRESS)VALUES (INFOMATION_SEQ.nextVal,'" + bikeNumber + "','" + name + "','" + adress + "')";
        try {
            int Res = statement.executeUpdate(sql);
            System.out.println(Res > 0 ? "data insert success" : "data insert failed");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InfomationDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

      public List<Infomation> showInfomationList(){
      
        infomationList= new ArrayList<>();
        sql = "SELECT  ID,BIKENUMBER, NAME,ADRESS FROM INFOMATION ORDER BY ID";

        try {

            
            set = statement.executeQuery(sql);
            while (set.next()) {
                Infomation infomation =new Infomation();
                infomation.setId(set.getString(1));
                infomation.setBikeNumber(set.getString(2));
                infomation.setName(set.getString(3));
                infomation.setAdress(set.getString(4));
                infomationList.add(infomation);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InfomationDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       return infomationList;
      }
}
