package ua.nure.kn16.oleynik.usermanagement.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.nure.kn16.oleynik.usermanagement.User;
import ua.nure.kn16.oleynik.usermanagement.db.DaoFactory;
import ua.nure.kn16.oleynik.usermanagement.db.DatabaseException;

public class AddServlet extends EditServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void showPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/add.jsp").forward(req, resp);
	}

	@Override
	protected void processUser(User user) throws DatabaseException {
		 DaoFactory.getInstance().getUserDao().create(user);
	}
	

}
