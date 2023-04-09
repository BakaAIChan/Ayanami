package Web;

import Domain.ayanami;
import Service.ayanamiService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet("/selectByIdServlet")
public class SelectByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ayanamiService ayanamiService=new ayanamiService();
        int count = ayanamiService.count();
        int random=new Random().nextInt(count)+1;
        ayanami ayanami = ayanamiService.selectById(random);
        String imageUrl="image/"+random+".png";
        request.setAttribute("id",imageUrl);
        String url="图片地址为:"+"\n"+ayanami.getUrl();
        request.setAttribute("url",url);
        request.getRequestDispatcher("image.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
