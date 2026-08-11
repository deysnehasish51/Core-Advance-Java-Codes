package com.nit.product.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import com.nit.payroll.jdbc.DBConnection;
import com.nit.product.bean.Product;

public class ProductService {

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
	
	public List<Product> fetchData(List<Product> list) {
		
	String query = "SELECT * FROM PRODUCT";
		
		 try (
			        Connection connection = DBConnection.getConnection();
			        PreparedStatement pstmt = connection.prepareStatement(query);
			        ResultSet resultSet = pstmt.executeQuery();
			    ) {

			        while (resultSet.next()) {

			            Product product = new Product(
			                    resultSet.getInt("id"),
			                    resultSet.getString("name"),
			                    resultSet.getDouble("price"),
			                    resultSet.getInt("quantity")
			                    
			            );

			            list.add(product);
			        }

			    } catch (SQLException e) {
			        e.printStackTrace();
			    }

		
		return list;
	}
	
	public void filterLowStockProduct(List<Product> list) {
		list.stream().filter(p->p.getQuantity()<10).forEach(System.out::println);
	}
	
	public void sortThePrice(List<Product> list) {
		list.stream().sorted(Comparator.comparingDouble(Product::getPrice)).limit(1).forEach(System.out::println);
	}
	
	public void totalInventoryValue(List<Product> list) {
		double total=  list.stream().mapToDouble(p->p.getPrice()).sum();
		System.out.println("Total Inventory Value: "+total);
	}
	
	public void calculateCostliestProduct(List<Product> list) {
		list.stream().sorted(Comparator.comparingDouble(Product::getPrice)).forEach(System.out::println);
		
	}
}
