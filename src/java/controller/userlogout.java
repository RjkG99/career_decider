package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/userlogout")
public class userlogout extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			HttpSession session=request.getSession();
			session.removeAttribute("name");
			session.invalidate();
			//response.sendRedirect("user.jsp");
                        response.sendRedirect("index.html");
	}

}
