/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_4410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String rcpm_dt;
	public String mchrg_pers;

	public AD_DEP_4410_LDM(){}
	


	public AD_DEP_4410_LDM(String cmpy_cd, String emp_no, String rcpm_dt, String mchrg_pers) {
		super();
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.rcpm_dt = rcpm_dt;
		this.mchrg_pers = mchrg_pers;
	}



	public String getCmpy_cd() {
		return cmpy_cd;
	}



	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}



	public String getEmp_no() {
		return emp_no;
	}



	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}



	public String getMchrg_pers() {
		return mchrg_pers;
	}



	public void setMchrg_pers(String mchrg_pers) {
		this.mchrg_pers = mchrg_pers;
	}



	public String getRcpm_dt() {
		return rcpm_dt;
	}



	public void setRcpm_dt(String rcpm_dt) {
		this.rcpm_dt = rcpm_dt;
	}



	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_4410_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_4410_LDM dm = (AD_DEP_4410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.rcpm_dt);
		cstmt.setString(6, dm.mchrg_pers);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_4410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
	}
}