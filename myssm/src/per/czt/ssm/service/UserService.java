package per.czt.ssm.service;

import java.util.List;

import per.czt.ssm.domain.User;

public interface UserService {
	public List<User> searchAll();
	public int insert(User u);
	public int delete(User u);
	public int update(User u);
	public List<User> search(User u);
}
