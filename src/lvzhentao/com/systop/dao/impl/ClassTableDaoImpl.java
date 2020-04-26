package lvzhentao.com.systop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import lvzhentao.com.systop.dao.ClassTableDao;
import lvzhentao.com.systop.domain.ClassTable;
import lvzhentao.com.systop.domain.Coach;
import lvzhentao.com.systop.util.C3p0Utils;

public class ClassTableDaoImpl implements ClassTableDao {
	Connection con = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	@Override
	public List showList() {
		// TODO 自动生成的方法存根
		String sql = "select * from classtable";
		QueryRunner runner=new QueryRunner(C3p0Utils.getDataSource());
		List<ClassTable> list=null;
		try {
			list = (List<ClassTable>) runner.query(sql, new BeanListHandler(ClassTable.class));
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}
}
