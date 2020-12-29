package d20201229;

import java.io.Serializable;

//객체 직렬화 - I/O 전송을 할 객체를 잘게 쪼개놓은 상태
//		  - 객체가 가진 데이터들을 순차적으로 데이터로 변화시키는 것
public class Member implements Serializable {
	private String id, /*pw,*/ name, addrs, email;
	
	//직렬화에서 특정 부분을 제외(보호) 가능
	transient String pw;	
	
	
	public Member() {}

	public Member(String id, String pw, String name, String addrs, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addrs = addrs;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
