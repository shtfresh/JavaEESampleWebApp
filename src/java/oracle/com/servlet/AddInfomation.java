package oracle.com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.com.service.InfomationService;

/**
 *
 * @author tasheng
 */
public class AddInfomation extends HttpServlet {

    public AddInfomation() {
        super();
    }

    public void destroy() {
        super.destroy();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/add.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String bikeNumber = request.getParameter("bikeNumber");
        String name = request.getParameter("name");
        String adress = request.getParameter("adress");

        InfomationService infomationService = new InfomationService();
        infomationService.addInfomation(bikeNumber, name, adress);

        request.getRequestDispatcher("show").forward(request, response);
    }
}
