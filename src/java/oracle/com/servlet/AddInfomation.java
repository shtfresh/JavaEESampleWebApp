package oracle.com.servlet;

import oracle.com.db.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import oracle.com.service.InfomationService;

public class AddInfomation extends HttpServlet {
    


	public AddInfomation() {
        super();
    }

    public void destroy() {
        super.destroy(); 
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	  // response.sendRedirect("WEB-INF/add.jsp");
           request.getRequestDispatcher("WEB-INF/add.jsp").forward(request,response); 
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String bikeNumber = request.getParameter("bikeNumber");
        String name = request.getParameter("name");
        String adress = request.getParameter("adress");
        
        
        
        InfomationService infomationService =new InfomationService();
        infomationService.addInfomation(bikeNumber, name, adress);
    	
        //response.sendRedirect("WEB-INF/index.jsp");
         request.getRequestDispatcher("show").forward(request,response); 
    }


}
