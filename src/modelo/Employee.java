package modelo;

public class Employee {

//********************* ATTRIBUTES *********************
	private String name;
	private char sex;
	private int salary;

//********************* CONSTRUCTORS *********************
	public Employee (String nombre, char sexo, int salary) {
		super();
		this.name = nombre;
		this.sex = sexo;
		this.salary = salary;
	}

//********************* OTHER METHODS *********************
	
	
//********************* GETTERS Y SETTERS *********************	
	public String getNombre() {
		return name;
	}

	@Override
	public String toString() {
		return "Employed [name=" + name + ", sex=" + sex + ", salary=" + salary + "]";
	}

	public char getSexo() {
		return sex;
	}

	public int getGasto() {
		return salary;
	}

	public void setNombre(String nombre) {
		this.name = nombre;
	}

	public void setSexo(char sexo) {
		this.sex = sexo;
	}

	public void setGasto(int gasto) {
		this.salary = gasto;
	}
	
	
	

}
