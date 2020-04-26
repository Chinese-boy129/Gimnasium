package lvzhentao.com.systop.domain;

import java.sql.Date;

public class ClassTable {
	private int cource_id; //课程编号
	private Date weekday;//星期几
	private int classtime;//上课时间
	private int project_id;//项目编号
	private int home_id;//房间编号
	private String p_name;//项目名称
	private String p_type;//项目类型
	private int p_capita;//项目人数
	public int getCource_id() {
		return cource_id;
	}
	public void setCource_id(int cource_id) {
		this.cource_id = cource_id;
	}

	public Date getWeekday() {
		return weekday;
	}
	public void setWeekday(Date weekday) {
		this.weekday = weekday;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public int getClasstime() {
		return classtime;
	}
	public void setClasstime(int classtime) {
		this.classtime = classtime;
	}
	public int getHome_id() {
		return home_id;
	}
	public void setHome_id(int home_id) {
		this.home_id = home_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public int getP_capita() {
		return p_capita;
	}
	public void setP_capita(int p_capita) {
		this.p_capita = p_capita;
	}
	
}
