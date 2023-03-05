package domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	public String name;
	public String password;
	
	public User(String n,String passwd) {
		name = n;
		password = passwd;
	}
}
