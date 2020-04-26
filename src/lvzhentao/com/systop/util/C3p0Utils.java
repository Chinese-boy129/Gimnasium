package lvzhentao.com.systop.util;


import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Utils {
	//数据源对象
private static DataSource ds;
	
	static {
		//获取C3P0连接池对象
		ds = new ComboPooledDataSource();
	}
	//返回数据源
	public static DataSource getDataSource() {
		return ds;
	}
}

