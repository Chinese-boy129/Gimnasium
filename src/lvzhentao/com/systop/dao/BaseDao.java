package lvzhentao.com.systop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	//�������ݿ�����
	String url = "jdbc:mysql://localhost:3306/gymnasium";
	String username = "root";
	String password = "root";
	
	//�������ݿ��������
	protected Connection con = null;
	protected PreparedStatement pstm= null;
	protected ResultSet rs = null;
	
	/**
	 * ��ȡ���ݿ����ӷ���
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void getConnection() throws ClassNotFoundException, SQLException {
		//1�����ز�ע������
		Class.forName("com.mysql.jdbc.Driver");
		//2������Connection����
		con = DriverManager.getConnection(url, username, password);
	}
	
	public void closeAll() {
		try {
			//6���ر�ResultSet
			if (rs != null) {
				rs.close();
			}
			//7���ر�PreparedStatement
			if (pstm != null) {
				pstm.close();
			}
			//8���ر�Connection
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
