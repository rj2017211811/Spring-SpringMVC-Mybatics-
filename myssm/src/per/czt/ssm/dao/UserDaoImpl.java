package per.czt.ssm.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import per.czt.ssm.domain.User;
@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	
	@Override
	public List<User> searchAll() {
		List<User> userList=this.getSqlSession().selectList("per.czt.mybatics.domain.User.search", null);
		return userList;
	}

	@Override
	public int insert(User u) {
		int flag=this.getSqlSession().insert("per.czt.mybatics.domain.User.insert", u);
		this.getSqlSession().commit();
		
		return flag;
	}

	@Override
	public int delete(User u) {
		int flag=this.getSqlSession().delete("per.czt.mybatics.domain.User.delete", u);
		this.getSqlSession().commit();
		return flag;
	}

	@Override
	public int update(User u) {
		int flag=this.getSqlSession().update("per.czt.mybatics.domain.User.update", u);
		this.getSqlSession().commit();
		return flag;
	}

	

	@Override
	public List<User> search(User u) {
		List<User>  userList=this.getSqlSession().selectList("per.czt.mybatics.domain.User.search", u);
		//this.getSqlSession().commit();
		return userList;
	}
	

}
