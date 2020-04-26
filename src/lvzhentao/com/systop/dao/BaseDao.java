package lvzhentao.com.systop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	//连接数据库属性
	String url = "jdbc:mysql://localhost:3306/gymnasium";
	String username = "root";
	String password = "root";
	
	//连接数据库对象属性
	protected Connection con = null;
	protected PreparedStatement pstm= null;
	protected ResultSet rs = null;
	
	/**
	 * 获取数据库连接方法
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void getConnection() throws ClassNotFoundException, SQLException {
		//1、加载并注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2、创建Connection连接
		con = DriverManager.getConnection(url, username, password);
	}
	
	public void closeAll() {
		try {
			//6、关闭ResultSet
			if (rs != null) {
				rs.close();
			}
			//7、关闭PreparedStatement
			if (pstm != null) {
				pstm.close();
			}
			//8、关闭Connection
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
