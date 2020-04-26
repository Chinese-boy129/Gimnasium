package lvzhentao.com.systop.domain;

import java.sql.Date;

public class ClockIn {
	private int ci_id;
	private int ci_c_id;
	private String ci_type;
	private Date ci_datetime;
	private int ci_c_p_id;
	private String ci_type_process;
	
	public int getCi_id() {
		return ci_id;
	}
	public void setCi_id(int ci_id) {
		this.ci_id = ci_id;
	}
	public int getCi_c_id() {
		return ci_c_id;
	}
	public void setCi_c_id(int ci_c_id) {
		this.ci_c_id = ci_c_id;
	}
	public String getCi_type() {
		return ci_type;
	}
	public void setCi_type(String ci_type) {
		this.ci_type = ci_type;
	}
	public Date getCi_datetime() {
		return ci_datetime;
	}
	public void setCi_datetime(Date ci_datetime) {
		this.ci_datetime = ci_datetime;
	}
	public int getCi_c_p_id() {
		return ci_c_p_id;
	}
	public void setCi_c_p_id(int ci_c_p_id) {
		this.ci_c_p_id = ci_c_p_id;
	}
	public String getCi_type_process() {
		return ci_type_process;
	}
	public void setCi_type_process(String ci_type_process) {
		this.ci_type_process = ci_type_process;
	}
	
}
