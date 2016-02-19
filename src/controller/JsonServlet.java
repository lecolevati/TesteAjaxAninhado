package controller;

import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

public class JsonServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String country = request.getParameter("countryname");
		List<String> list = new ArrayList<String>();
		String json = null;

		if (country.equals("India")) {
			list.add("aaaa");
			list.add("bbbb");
			list.add("cccc");
			list.add("dddd");
		} else if (country.equals("US")) {
			list.add("zzzz");
			list.add("xxxx");
			list.add("yyyy");
		} else if (country.equals("Select Sports")) {
			list.add("Select Player");
		}

		json = new Gson().toJson(list);
		response.setContentType("application/json");
		response.getWriter().write(json);
	}
}