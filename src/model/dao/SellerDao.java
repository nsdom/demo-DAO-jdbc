package model.dao;

import java.util.List;

<<<<<<< HEAD
=======
import model.entities.Department;
>>>>>>> 185df995bf4c7920dfb883911180a1186a6d2e66
import model.entities.Seller;

public interface SellerDao {
	
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
<<<<<<< HEAD
	Seller findById(Integer id);
=======
	Department findById(Integer id);
>>>>>>> 185df995bf4c7920dfb883911180a1186a6d2e66
	List<Seller> findAll();


}
