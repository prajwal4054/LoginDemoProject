package demo.utility;

public interface QueryMapper {
	public static final String GET_USERDETAIL_BY_USERNAME = "select * from users where username=?";
	public static final String ADD_USERDETAIL= "INSERT INTO users(userid,username,password) VALUES(?,?,?)";

}
