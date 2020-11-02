package servletsExerc;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletControle")
public class ServletControle extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String p1 = req.getParameter("nome");

		if (p1.trim().length() == 0) {
			req.getRequestDispatcher("index.jsp?erro=ERRO NO NOME").forward(req, resp);

		} else {
			req.getRequestDispatcher("bemvindo.jsp?nome=" + p1.toUpperCase()).forward(req, resp);
		}
	}
}

