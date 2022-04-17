package ch5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //获取参数
        String bookname = req.getParameter("bookname");
        String author = req.getParameter("author");
        String publish = req.getParameter("publish");
        String date = req.getParameter("date");
        String price = req.getParameter("price");

        if(bookname==""||bookname==null||author==""||author==null||publish==""||publish==null||date==""||date==null||price==""||price==null){
            req.setAttribute("message","信息未填写完整");
            req.getRequestDispatcher("show.jsp").forward(req,resp);
        }else{
            request.setAttribute("art")
        }
    }
}
