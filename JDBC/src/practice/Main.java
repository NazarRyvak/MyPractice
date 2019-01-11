package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
	
	static Connection conn;
	static Statement stmt;
	static PreparedStatement pstmt;
	static Scanner sc = new Scanner(System.in);
	static String url = "jdbc:mysql://localhost:3306/";
	static String urlStudent = "jdbc:mysql://localhost:3306/Students";
	static String name = "root";
	static String password = "20081996nr";

	public static void main(String[] args) {

		//createDatabase();
		
		try {
			conn = DriverManager.getConnection(urlStudent, name, password);
			stmt = conn.createStatement();
			
	
			//createTableStudent();
			//addRandomStudent();
			consoleMenu();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} /*catch (IOException e) {
			e.printStackTrace();
		} */finally {
			
			try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException e){
		    	  e.printStackTrace();
		      }
			try{
		         if(pstmt!=null)
		            pstmt.close();
		      }catch(SQLException e){
		    	  e.printStackTrace();
		      }
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	
	}

	static void consoleMenu() throws SQLException {
		
		while (true) {
			System.out.println("Enter your operation: \n" + "add student to DB - 1 \n"
					+ "delete student from DB by id - 2 \n" + "show list of student from DB - 3 \n"
					+ "find student by name - 4 \n" + "search student by age - 5 \n" + "exit - 6 \n");
			if (sc.hasNextInt()) {
				int key = sc.nextInt();
				sc.nextLine();
				switch (key) {
				case 1:
					addStudent();
					break;
				case 2:
                    deleteStudent();
					break;
				case 3:
					selectStudents();
					break;
				case 4:
					findStudentByName();
					break;
				case 5:
					findStudentByAge();
					break;
				case 6:
					System.out.println("Goodbye!!!");
					return;

				default:
					System.out.println("You entered incorrect number!!!");
					break;
				}
			} else {
				System.out.println("You entered not a number2!!!");
				sc.nextLine();
			}

		}

	}
	
	
	
	
	static void createTableStudent() throws SQLException {
		String dropTable = "DROP TABLE IF EXISTS STUDENT;";
		String createTable = "CREATE TABLE STUDENT("
				+ "ID INT PRIMARY KEY AUTO_INCREMENT,"
				+ "FULL_NAME VARCHAR(50),"
				+ "AGE INT "
				+ ");";
		stmt.executeUpdate(dropTable);
		stmt.executeUpdate(createTable);
	}
	
	static void addRandomStudent() throws SQLException, IOException {

		BufferedReader inputStream = null;
		Random rd = new Random();

		try {
			inputStream = new BufferedReader(new FileReader("src/practice/fullName.txt"));
			String fullName;
			while ((fullName = inputStream.readLine()) != null) {
				String query = "INSERT INTO STUDENT(FULL_NAME, AGE) VALUES(?,?);";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, fullName);
				pstmt.setInt(2, 17 + rd.nextInt(7));
				pstmt.executeUpdate();

			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}

	}
	
	static void addStudent() throws SQLException {
		int age = 0;
		String fullName;

		System.out.println("Enter age:");
		while (true) {
			if (sc.hasNextInt()) {
				age = sc.nextInt();
				sc.nextLine();
				if (age >= 16 && age <= 80) {
					break;
				} else {
					System.out.println("Incorrect age!!!Age should be longer 15 and less than 80!!!");
					sc.nextLine();
				}
			} else {
				System.out.println("You entered not a number!!!");
				sc.nextLine();
			}
		}

		System.out.println("Enter full name:");

		while (true) {
			if (sc.hasNextLine()) {
				fullName = sc.nextLine();
				break;
			}
		}

		String query = "INSERT INTO STUDENT(FULL_NAME, AGE) VALUES(?,?);";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, fullName);
		pstmt.setInt(2, age);
		pstmt.executeUpdate();
	
	}
	
	static void deleteStudent() throws SQLException {
		System.out.println("Enter id:");
		int id = 0 ;
		while (true) {
			if (sc.hasNextInt()) {
				id = sc.nextInt();
				break;
				
			}else {
				System.out.println("You entered not a number!!!");
			}
		}
		String query = "DELETE FROM STUDENT WHERE ID=?";
		pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
	}
	
	static void selectStudents() throws SQLException {
		String query = "SELECT * FROM STUDENT";
		pstmt = conn.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();
		List<String> students = new ArrayList<>();
		while (rs.next()) {
			students.add(rs.getInt("id")+ " full name: " + rs.getString("full_name") + " age: " + rs.getInt("age"));	
		}
		students.forEach(System.out::println);
	}
	
	static void findStudentByName() throws SQLException {
		System.out.println("Enter name:");
        String fullName;
		while (true) {
			if (sc.hasNextLine()) {
				fullName = sc.nextLine();
				break;
			}
		}
		String query = "SELECT * FROM STUDENT WHERE FULL_NAME LIKE ?";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, "%"+fullName+"%");
		ResultSet rs = pstmt.executeQuery();
		List<String> students = new ArrayList<>();
		while (rs.next()) {
			students.add(rs.getInt("id")+ " full name: " + rs.getString("full_name") + " age: " + rs.getInt("age"));	
		}
		students.forEach(System.out::println);
	}
	
	static void findStudentByAge() throws SQLException {
		System.out.println("Enter min age:");
		int minAge = 0;
		int maxAge = 0;
		while (true) {
			if (sc.hasNextInt()) {
				minAge = sc.nextInt();
				break;
				
			}else {
				System.out.println("You entered not a number!!!");
			}
		}
		System.out.println("Enter max age:");
		while (true) {
			if (sc.hasNextInt()) {
				maxAge = sc.nextInt();
				break;
				
			}else {
				System.out.println("You entered not a number!!!");
			}
		}
		
		String query = "SELECT * FROM STUDENT WHERE AGE BETWEEN ? AND ? ORDER BY AGE ASC";
		pstmt = conn.prepareStatement(query);
		if (minAge < maxAge) {
			pstmt.setInt(1, minAge);
			pstmt.setInt(2, maxAge);
		}else {
			pstmt.setInt(1, maxAge);
			pstmt.setInt(2, minAge);
		}
		ResultSet rs = pstmt.executeQuery();
		List<String> students = new ArrayList<>();
		while (rs.next()) {
			students.add(rs.getInt("id")+ " full name: " + rs.getString("full_name") + " age: " + rs.getInt("age"));	
		}
		students.forEach(System.out::println);
	}
	
	
	
	static void createDatabase() {
		String createDatabase = "CREATE DATABASE STUDENTS";
		String dropDatabase = "DROP DATABASE IF EXISTS STUDENTS";
		try {
			conn = DriverManager.getConnection(url, name, password);
			System.out.println("Connected!!!!!");
			stmt = conn.createStatement();
			
			/*stmt.executeUpdate(dropDatabase);
			stmt.executeUpdate(createDatabase);*/
			
			createTableStudent();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException e){
		    	  e.printStackTrace();
		      }
			try {
				conn.close();
			} catch (SQLException e) {	
				e.printStackTrace();
			}
		}
	}
}
