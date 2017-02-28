package com.mengll.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCtest {

	public static void main(String[] args) {
		String name="scott";
		String password="Password123";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",name,password);
			preparedStatement=connection.prepareStatement("select * from emp_test where empno=?");
			preparedStatement.setString(1, "7369");
			resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString(2));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (resultSet!=null) {
					resultSet.close();
				}
				if (preparedStatement!=null) {
					preparedStatement.close();
				}
				if (connection!=null) {
					connection.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
