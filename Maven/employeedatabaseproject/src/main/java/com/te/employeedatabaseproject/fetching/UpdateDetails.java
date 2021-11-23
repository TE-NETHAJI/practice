package com.te.employeedatabaseproject.fetching;

import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.employeedatabaseproject.driver.ReturnMethod;
import com.te.employeedatabaseproject.exceptions.InvalidInputGiven;
import com.te.employeedatabaseproject.exceptions.NumberFormat;
import com.te.employeedatabaseproject.module.EmployeeInfoBean;
import com.te.employeedatabaseproject.validations.Validations;

public class UpdateDetails {

	static EmployeeInfoBean bean = null;

	public static void update(Scanner sc) {

		LogManager.getLogManager().getLogger("").setLevel(Level.SEVERE);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empInfo");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		try {
			System.out.println("Update Employee details");
			System.out.println("-----------------------------------");
			System.out.println("1.update name   :");
			System.out.println("2.update role   :");
			System.out.println("3.update dob    :");
			System.out.println("4.update mobile :");
			System.out.println("5.update salary :");
			System.out.println("6.update Email  :");
			System.out.println("7.Exit");
			System.out.println("------------------------------------");

			Integer key = Integer.parseInt(sc.next());
			System.out.println("Enter ID:");
			Integer in = sc.nextInt();
			bean = manager.find(EmployeeInfoBean.class, in);

			switch (key) {
			case 1:
				updateName(sc);

				break;
			case 2:
				updateRole(sc);

				break;
			case 3:
				updateDob(sc);

				break;
			case 4:
				updateMoblieNo(sc);
				break;

			case 5:
				updateSalary(sc);
				break;
			case 6:
				updateEmail(sc);
				break;

			case 7:
				System.out.println("Thank You!");
				System.exit(0);
				break;

			default:
				System.out.println("Choose the right mode");
				break;
			}

			tran.begin();
			manager.persist(bean);

			tran.commit();
			System.out.println("Database updated sucessfully");
			ReturnMethod.goBack();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
			emf.close();
			sc.close();

		}

	}

	public static void updateName(Scanner sc) throws InvalidInputGiven {

		System.out.println("Update to: ");
		String name = sc.nextLine().trim();
		Validations.name(sc);
		bean.setName(name);

	}

	public static void updateRole(Scanner sc) {

		System.out.println("Update name to: ");
		String name = sc.next();
		bean.setName(name);

	}

	public static void updateDob(Scanner sc) {
		System.out.println("Update to:(YYY-MM-DD)");
		Date dob = java.sql.Date.valueOf(sc.next());
		bean.setDob(dob);
	}

	public static void updateMoblieNo(Scanner sc) throws InvalidInputGiven {
		System.out.println("Update to: ");
		Long no = sc.nextLong();
		if (sc.hasNextDouble() && no > 999999999) {
			bean.setMobileNo(no);
		} else {
			throw new InvalidInputGiven("Enter a valid Mobile Number");
		}
	}

	public static void updateSalary(Scanner sc) {

		System.out.println("Update to: ");
		Double sal = Double.parseDouble(sc.next());
		bean.setSalary(sal);

	}

	public static void updateEmail(Scanner sc) {
		System.out.println("Update to: ");
		String email = sc.next();
		bean.setEmail(email);
	}

}
