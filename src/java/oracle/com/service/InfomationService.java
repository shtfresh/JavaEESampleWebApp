/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.com.service;

import java.util.List;
import oracle.com.bean.Infomation;
import oracle.com.dao.InfomationDao;

/**
 *
 * @author tasheng
 */
public class InfomationService {
    
    public void addInfomation(String bikeNumber,String name,String adress){
        InfomationDao infomationDao = new InfomationDao();
        infomationDao.addInfomation(bikeNumber, name, adress);
        
    }
        public List<Infomation> showInfomationList(){
            InfomationDao infomationDao = new InfomationDao();
            return infomationDao.showInfomationList();
        
    }
}
