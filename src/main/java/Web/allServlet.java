package Web;

import Domain.ayanami;
import Service.ayanamiService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/allServlet")
public class allServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ayanamiService ayanamiService=new ayanamiService();
        List<ayanami> ayanamis = ayanamiService.selectAll();
        request.setAttribute("ayanamis",ayanamis);
        request.getRequestDispatcher("all.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
