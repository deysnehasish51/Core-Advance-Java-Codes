package com.nit.product.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nit.payroll.jdbc.DBConnection;
import com.nit.product.bean.Product;

public class ProductDaoImpl implements ProductDao {
	
	
	@Override
	public void addProduct(Product p){
		try(Connection con = DBConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("""
						INSERT INTO product(id,name,price,quantity)
						VALUES(?,?,?,?);
						""");){
			
			pstmt.setInt(1, p.getId());
			pstmt.setString(2, p.getName());
			pstmt.setDouble(3, p.getPrice());
			pstmt.setInt(4, p.getQuantity());
			
			pstmt.executeUpdate();
			
			System.out.println("Product added to DB Succeessfully");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateProduct(Product p) {
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("""
						UPDATE product 
						SET name=?,price=?,quantity=?
						WHERE id=?
						""");){
			
			
			pstmt.setString(1, p.getName());
			pstmt.setDouble(2, p.getPrice());
			pstmt.setInt(3, p.getQuantity());
			pstmt.setInt(4, p.getId());
			
			pstmt.executeUpdate();
			
			System.out.println("Product Updated in DB Succeessfully");

			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProduct(int id) {
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("""
						DELETE FROM product 
						WHERE id=?
						""");){
			
			pstmt.setInt(1, id);
			
			pstmt.executeUpdate();
			
			System.out.println("Product Deleted from DB Succeessfully");

			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getProductById(int id) {
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("""
						SELECT * FROM product
						WHERE id=?
						""");){
			
			pstmt.setInt(1, id);
			
			pstmt.executeUpdate();
			
			try (ResultSet resultSet = pstmt.executeQuery()) {

	            while (resultSet.next()) {

	                int pid = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                double price= resultSet.getDouble("price");
	                int quantity = resultSet.getInt("quantity");
	                System.out.println("ID: " + pid);
	                System.out.println("Name: " + name);
	                System.out.println("Email: " + price);
	                System.out.println("Salary: "+ quantity);
	            }
	        }

			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void getAllProducts() {
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("""
						SELECT * FROM product
						""");){
			
			try (ResultSet resultSet = pstmt.executeQuery()) {

	            while (resultSet.next()) {

	                int pid = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                double price= resultSet.getDouble("price");
	                int quantity = resultSet.getInt("quantity");
	                System.out.println("ID: " + pid);
	                System.out.println("Name: " + name);
	                System.out.println("Email: " + price);
	                System.out.println("Salary: "+ quantity);
	            }
	        }

			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


}
