package oracle.com.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.com.bean.Infomation;
import oracle.com.service.InfomationService;

/**
 *
 * @author tasheng
 */
public class ShowInfomationList extends HttpServlet {

    public ShowInfomationList() {
        super();
    }

    public void destroy() {
        super.destroy();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        InfomationService infomationService = new InfomationService();
        List<Infomation> InfomationList = infomationService.showInfomationList();

        request.setAttribute("infomationList", InfomationList);
        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);

    }

}
