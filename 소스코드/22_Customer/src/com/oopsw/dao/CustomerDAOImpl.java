package com.oopsw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** ¹è¼ºÀ± */
public class CustomerDAOImpl implements CustomerDAO{

	private Connection connection;
	public CustomerDAOImpl(Connection connection) throws ClassNotFoundException, SQLException {
		this.connection = connection;
	}

	public void setAutoCommit(boolean isOn) throws SQLException{
		connection.setAutoCommit(isOn);
	}
	
	@Override
	public boolean add(String name, String phoneNumber) {
		return add(name, phoneNumber, 0);
	}

	@Override
	public boolean add(String name, String phoneNumber, int point) {
		String sql = "insert into customers (customer_id, name, phone_number, point, in_date) values (customer_id_seq.nextval, ?, ?, ?, sysdate)";

		boolean result = false;
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, phoneNumber);
			preparedStatement.setInt(3, point);
			
			result = preparedStatement.executeUpdate() == 1;
			preparedStatement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int getPoint(int customerId){
		int point = 0;
		
		String sql = "select point from customers where customer_id = ?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()){
				point = resultSet.getInt(1);
			}
			
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return point;
	}

	@Override
	public boolean updatePoint(int customerId, int point) {
		String sql = "update customers set point = ? where customer_id = ?";
		
		boolean result = false;
		
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, point);
			preparedStatement.setInt(2, customerId);
			
			result = preparedStatement.executeUpdate() == 1;
			
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean removeCustomer(int customerId) {
		String sql = "delete from customers where customer_id = ?";
		
		boolean result = false;
		
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			result = preparedStatement.executeUpdate() == 1;
			
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
