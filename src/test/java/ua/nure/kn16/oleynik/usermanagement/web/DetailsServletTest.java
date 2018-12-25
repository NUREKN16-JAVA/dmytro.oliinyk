package ua.nure.kn16.oleynik.usermanagement.web;

import ua.nure.kn16.oleynik.usermanagement.User;
import ua.nure.kn16.oleynik.usermanagement.web.DetailsServlet;

public class DetailsServletTest extends MockServletTestCase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		createServlet(DetailsServlet.class);
	}

	public void testBack() {
		addRequestParameter("backButton", "Back");
		User user = (User) getWebMockObjectFactory().getMockSession().getAttribute("user");
		assertNull("User was not deleted from session", user);
	}
}
