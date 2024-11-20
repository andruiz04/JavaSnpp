package Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/calcular")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	protected void procesar(HttpServletRequest request, HttpServletResponse response) throws IOException {

			float n1 = Float.valueOf(request.getParameter("num1"));
			float n2 = Float.valueOf(request.getParameter("num2"));
			String op = request.getParameter("operacion");
			double resultado = 0.0;
			if(op.equals("sum")) {
				resultado = n1 + n2;
			}else if(op.equals("rest")) {
				resultado = n1 - n2;
			}else if(op.equals("mul")) {
				resultado = n1 * n2;
			}else if(op.equals("div")) {
				if(n2 != 0) {
					resultado = n1 / n2;
				}else {
					response.getWriter().append("Div por cero\n");					
				}
			}
			//response.getWriter().append("Resultado = " + resultado);
			response.sendRedirect("Calculadora.jsp?res=" + resultado);
			
	}	
}
