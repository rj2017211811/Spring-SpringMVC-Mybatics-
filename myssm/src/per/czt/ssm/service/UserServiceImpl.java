package per.czt.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import per.czt.ssm.dao.UserDao;
import per.czt.ssm.domain.User;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name="userDao")
	private UserDao userDao;
	

	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public List<User> searchAll() {
		
		return userDao.searchAll();
	}


	@Override
	public int insert(User u) {
		// TODO Auto-generated method stub
		return userDao.insert(u);
	}


	@Override
	public int delete(User u) {
		// TODO Auto-generated method stub
		return userDao.delete(u);
	}


	@Override
	public int update(User u) {
		// TODO Auto-generated method stub
		return userDao.update(u);
	}


	@Override
	public List<User> search(User u) {
		// TODO Auto-generated method stub
		return userDao.search(u);
	}

}
