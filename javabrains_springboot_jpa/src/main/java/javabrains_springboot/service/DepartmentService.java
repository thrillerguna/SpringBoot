package javabrains_springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javabrains_springboot.pojo.Department;
import javabrains_springboot.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository deptrepo;

	/*private List<Department> depts = new ArrayList<>(
			Arrays.asList(new Department("1", "ECE"), new Department("2", "EEE"), new Department("3", "CSE")));*/

	public List<Department> getDepts() {
		List<Department> deptList = new ArrayList<>();
		deptrepo.findAll().forEach(deptList::add);
		return deptList;
	}

	public Department getDept(String id) {
		//return depts.stream().filter(a -> a.getId().equals(id)).findFirst().get();
		return deptrepo.findOne(id);
	}

	public void addDept(Department dept) {
		//depts.add(dept);//
		deptrepo.save(dept);
	}

	public void updateDept(Department dept) {
		/*ListIterator<Department> it = depts.listIterator();
		while (it.hasNext()) {
			Department d = it.next();
			if (d.getId().equals(dept.getId())) {
				it.set(dept);
			}
		}*/
		deptrepo.save(dept);
	}

	public void deleteDept(String id) {
		//depts.removeIf(t -> t.getId().equals(id));
		deptrepo.delete(id);
	}

}
