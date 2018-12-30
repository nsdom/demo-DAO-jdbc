package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); 
		
		
		System.out.println("\n==== TEST 1: department insert =======");

		Department newDepartment = new Department(null, "Photography");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted new id = " + newDepartment.getId());



		System.out.println("==== TEST 2: department findById =======");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		

		System.out.println("==== TEST 3: department findAll =======");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
			
		}
		
		System.out.println("\n==== TEST 4: department delete =======");
		
		System.out.print("Enter id for delete test: ");
		for (int i = 10; i <= 50; i++) {
			//int id = sc.nextInt();
			departmentDao.deleteById(i);
			System.out.println("Department deleted!");
			sc.close();
		}
		
		
		System.out.println("\n==== TEST 5: department update =======");

		dep = departmentDao.findById(9);
		dep.setName("Ilumination");
		departmentDao.update(dep);
		System.out.println("Updated new name = " + dep.getName());
	}

}
