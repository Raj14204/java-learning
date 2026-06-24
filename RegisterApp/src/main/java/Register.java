

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.*;
@WebServlet("/Register")
public class Register extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String passwordf = request.getParameter("password");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String country = request.getParameter("country");
		String address = request.getParameter("address");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/registration_db";
			String user="root";
			String password="root123";
			Connection connect = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmnt = connect.prepareStatement(
				    "INSERT INTO users (fullname, email, password, phone, gender, dob, country, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
				);
			pstmnt.setString(1, fullname);
			pstmnt.setString(2, email);
			pstmnt.setString(3, passwordf);
			pstmnt.setString(4, phone);
			pstmnt.setString(5, gender);
			pstmnt.setString(6, dob);
			pstmnt.setString(7, country);
			pstmnt.setString(8, address);
			
			int rows = pstmnt.executeUpdate();
			PrintWriter pw = response.getWriter();
			if(rows == 0) {
				pw.println("<h1>Registration Not Done</h1>");
			}else {
				pw.println("<h1>Registration Done</h1>");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
