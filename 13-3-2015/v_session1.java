import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class v_session1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		//set resonce type
		res.setContentType("text/html");
		String title="WELCOME USER";
		PrintWriter out= res.getWriter();
		String docType="<!doctype html public \"-//w3c//dtd html 4.0 "+ "transitional //en\"> \n";
		//preparing respncse
		out.println(docType+"<html>");
		out.println("<head><title>"+title+"</title></head>");
		out.println("<body bgcolor=\"green\">");
		out.println("<h1 align=\"center\">"+title+"</h1>");
		String name=req.getParameter("first_name");
		HttpSession session = req.getSession(true);
		session.setAttribute("name1",name);
		
		out.println("<form action=\"v_session2\" method=\"POST\">"+
		"<center><input type=\"submit\" value=\"next\"> </center>");
		out.println("</body>");
		out.println("</html>");	
	} //doget
	
	//Method to handle doPost method requests
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		doGet(req,res);
	}
} //class
