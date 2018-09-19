package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import modelo.Employee;


public class Ejecuta {
	

//********************* MAIN METHOD *********************	
	public static void main(String[] args) {
		
		printArrayListEmployees(ArrayListDataRead("src/ficheros/informacion.txt"));
		System.out.println("");
		printHashMapEmployees(HashMapDataRead("src/ficheros/informacion.txt"));
	}

//********************* ATTRIBUTES *********************
	
	private  ArrayList<Employee> employeesList;
	private static  HashMap<Integer,Employee> employeesHash;
		

//********************* OTHER METHODS *********************
	
	//-------- READ ARRAYLIST EMPLOYESS -------
	public static ArrayList<Employee> ArrayListDataRead(String pathAndFile) {
		ArrayList<Employee> result = new ArrayList<Employee>();
		try {
			FileReader fr = new FileReader(pathAndFile);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String name = line.split("#")[0];
				char sex = line.split("#")[1].charAt(0);
				int salary = Integer.parseInt(line.split("#")[2]);
				Employee employee = new Employee(name,sex,salary);
				result.add(employee);
			}
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File "+ pathAndFile +" Not Found");
		} catch (IOException e) {
			System.out.println("Input / Output Error");
		}
		return result;
	}
	
	//-------- READ HASMAP EMPLOYESS -------	
	public static HashMap<Integer,Employee> HashMapDataRead(String pathAndFile){
		HashMap<Integer, Employee> result = new HashMap<Integer,Employee>();
		try {
			FileReader fr = new FileReader(pathAndFile);
			BufferedReader br = new BufferedReader(fr);
			String line;
			int counter = 0;
			while ((line = br.readLine()) != null) {
				String name = line.split("#")[0];
				char sex = line.split("#")[1].charAt(0);
				int salary = Integer.parseInt(line.split("#")[2]);
				Employee employee = new Employee(name,sex,salary);			
				result.put(counter++, employee);

			}
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File "+ pathAndFile +" Not Found");
		} catch (IOException e) {
			System.out.println("Input / Output Error");
		}
		return result;
		
	}
	
	//-------- CONSOLE PRINT ARRAYLIST EMPLOYESS -------
	public static void printArrayListEmployees(ArrayList<Employee> employeesList) {
		System.out.println("***** employeesList ***** PRINT");
		for (Employee employee : employeesList) {
			System.out.println(employee);
		}	
	}
	
	//-------- CONSOLE PRINT HASHMAP EMPLOYESS -------
	public static void printHashMapEmployees(HashMap<Integer,Employee> employeesHash) {
		System.out.println("***** employeesHash ***** PRINT");
		for (Integer index : employeesHash.keySet()) {
			System.out.println(employeesHash.get(index));
		}
		
		
	}
//********************* GETTERS Y SETTERS *********************
	
	public  ArrayList<Employee> getEmployeesList() {
		return employeesList;
	}

	public  void setEmployeesList(ArrayList<Employee> employeesList) {
		this.employeesList = employeesList;
	}

	public  HashMap<Integer,Employee> getEmployeesHash() {
		return employeesHash;
	}

	public  void setEmployeesHash(HashMap<Integer,Employee> employeesHash) {
		this.employeesHash = employeesHash;
	}

}
