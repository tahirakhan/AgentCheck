/**
 * Created by Tahir Khan on 3/17/2016.
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgentInfoServlet extends HttpServlet
{

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {

    String userAgent = request.getHeader("User-Agent");

    // Set response content type
    response.setContentType("text/html");

    // Actual logic goes here.
    PrintWriter out = response.getWriter();
    out.println("<h1> " + userAgent + " </h1>");
  }

}
