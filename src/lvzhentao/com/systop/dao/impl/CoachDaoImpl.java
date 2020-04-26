package lvzhentao.com.systop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import lvzhentao.com.systop.dao.BaseDao;
import lvzhentao.com.systop.dao.CoachDao;
import lvzhentao.com.systop.domain.Coach;
import lvzhentao.com.systop.util.C3p0Utils;

public class CoachDaoImpl extends BaseDao implements CoachDao {

	@Override
	public List showList() {
		// TODO 自动生成的方法存根
		/*String sql = "select * from coach";
		QueryRunner runner=new QueryRunner(C3p0Utils.getDataSource());
		List<Coach> list=null;
		try {
			list = (List<Coach>) runner.query(sql, new BeanListHandler(Coach.class));
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return list;*/
		/*List<Coach> list = new ArrayList<Coach>();
		String sql = "select * from coach";
		try {
			con=C3p0Utils.getDataSource().getConnection();
			
			pstm = con.prepareStatement(sql);
			
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				Coach coach = new Coach();
				coach.setC_id(rs.getInt("c_id"));
				coach.setC_phone(rs.getString("c_phone"));
				coach.setCoachpass(rs.getString("coachpass"));
				coach.setC_name(rs.getString("c_name"));
				coach.setC_sex(rs.getString("c_sex"));
				coach.setC_addres(rs.getString("c_addres"));
				coach.setC_salary_id(rs.getString("c_salary_id"));
				coach.setC_time(rs.getDate("c_time"));
				coach.setC_p_id(rs.getInt("c_p_id"));
				coach.setC_type(rs.getString("c_type"));
			
				list.add(coach);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;*/
		List<Coach> list = new ArrayList<Coach>();
		String sql = "select * from coach";
		try {
			super.getConnection();
			
			pstm = con.prepareStatement(sql);
			
			rs = pstm.executeQuery();

			while (rs.next()) {
				Coach coach = new Coach();
				coach.setC_id(rs.getInt("c_id"));
				coach.setC_phone(rs.getString("c_phone"));
				coach.setCoachpass(rs.getString("coachpass"));
				coach.setC_name(rs.getString("c_name"));
				coach.setC_sex(rs.getString("c_sex"));
				coach.setC_addres(rs.getString("c_addres"));
				coach.setC_salary_id(rs.getString("c_salary_id"));
				coach.setC_time(rs.getDate("c_time"));
				coach.setC_p_id(rs.getInt("c_p_id"));
				coach.setC_type(rs.getString("c_type"));
			
				list.add(coach);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			super.closeAll();
		}
		return list;
	}

	@Override
	public Coach showCoach(int id) {
		String sql = "select * from coach where c_id=?";
		Coach coach = new Coach();
		try {
			super.getConnection();			
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				
				coach.setC_id(rs.getInt("c_id"));
				coach.setC_phone(rs.getString("c_phone"));
				coach.setCoachpass(rs.getString("coachpass"));
				coach.setC_name(rs.getString("c_name"));
				coach.setC_sex(rs.getString("c_sex"));
				coach.setC_addres(rs.getString("c_addres"));
				coach.setC_salary_id(rs.getString("c_salary_id"));
				coach.setC_time(rs.getDate("c_time"));
				coach.setC_p_id(rs.getInt("c_p_id"));
				coach.setC_type(rs.getString("c_type"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			super.closeAll();
		}
		return coach;
	}

}
