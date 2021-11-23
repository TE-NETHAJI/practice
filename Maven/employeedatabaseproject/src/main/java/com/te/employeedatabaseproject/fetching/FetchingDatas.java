package com.te.employeedatabaseproject.fetching;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.employeedatabaseproject.driver.ReturnMethod;
import com.te.employeedatabaseproject.module.EmployeeInfoBean;

public class FetchingDatas {

	public static void fetchDatas() {

			LogManager.getLogManager().getLogger("").setLevel(Level.SEVERE);
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("empInfo");
			EntityManager manager = emf.createEntityManager();
			try {

			String read = "from EmployeeInfoBean"; 
			Query query = manager.createQuery(read);
			List<EmployeeInfoBean> infos = query.getResultList();

			for (EmployeeInfoBean info : infos) {

				System.out.println(info.getName());
				System.out.println(info.getId());
				System.out.println(info.getDob());
				System.out.println(info.getRole());
				System.out.println(info.getGender());
				System.out.println(info.getMobileNo());
				System.out.println(info.getSalary());
				System.out.println(info.getEmail());
			}
			emf.close();
			manager.close();
			
			ReturnMethod.goBack();
		} catch (

		Exception e) {

			e.printStackTrace();
		}

	}
}
