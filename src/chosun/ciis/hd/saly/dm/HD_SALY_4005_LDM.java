/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4005_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String lon_clsf_cd;
	public String lon_dt;
	public String st_dduc_dt;
	public String et_dduc_dt;

	public HD_SALY_4005_LDM(){}
	public HD_SALY_4005_LDM(String cmpy_cd, String emp_no, String lon_clsf_cd, String lon_dt, String st_dduc_dt, String et_dduc_dt){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.lon_clsf_cd = lon_clsf_cd;
		this.lon_dt = lon_dt;
		this.st_dduc_dt = st_dduc_dt;
		this.et_dduc_dt = et_dduc_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLon_clsf_cd(String lon_clsf_cd){
		this.lon_clsf_cd = lon_clsf_cd;
	}

	public void setLon_dt(String lon_dt){
		this.lon_dt = lon_dt;
	}

	public void setSt_dduc_dt(String st_dduc_dt){
		this.st_dduc_dt = st_dduc_dt;
	}

	public void setEt_dduc_dt(String et_dduc_dt){
		this.et_dduc_dt = et_dduc_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLon_clsf_cd(){
		return this.lon_clsf_cd;
	}

	public String getLon_dt(){
		return this.lon_dt;
	}

	public String getSt_dduc_dt(){
		return this.st_dduc_dt;
	}

	public String getEt_dduc_dt(){
		return this.et_dduc_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_4005_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_4005_LDM dm = (HD_SALY_4005_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.lon_clsf_cd);
		cstmt.setString(6, dm.lon_dt);
		cstmt.setString(7, dm.st_dduc_dt);
		cstmt.setString(8, dm.et_dduc_dt);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_4005_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("lon_clsf_cd = [" + getLon_clsf_cd() + "]");
		System.out.println("lon_dt = [" + getLon_dt() + "]");
		System.out.println("st_dduc_dt = [" + getSt_dduc_dt() + "]");
		System.out.println("et_dduc_dt = [" + getEt_dduc_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String lon_clsf_cd = req.getParameter("lon_clsf_cd");
if( lon_clsf_cd == null){
	System.out.println(this.toString+" : lon_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : lon_clsf_cd is "+lon_clsf_cd );
}
String lon_dt = req.getParameter("lon_dt");
if( lon_dt == null){
	System.out.println(this.toString+" : lon_dt is null" );
}else{
	System.out.println(this.toString+" : lon_dt is "+lon_dt );
}
String st_dduc_dt = req.getParameter("st_dduc_dt");
if( st_dduc_dt == null){
	System.out.println(this.toString+" : st_dduc_dt is null" );
}else{
	System.out.println(this.toString+" : st_dduc_dt is "+st_dduc_dt );
}
String et_dduc_dt = req.getParameter("et_dduc_dt");
if( et_dduc_dt == null){
	System.out.println(this.toString+" : et_dduc_dt is null" );
}else{
	System.out.println(this.toString+" : et_dduc_dt is "+et_dduc_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String lon_clsf_cd = Util.checkString(req.getParameter("lon_clsf_cd"));
String lon_dt = Util.checkString(req.getParameter("lon_dt"));
String st_dduc_dt = Util.checkString(req.getParameter("st_dduc_dt"));
String et_dduc_dt = Util.checkString(req.getParameter("et_dduc_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String lon_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("lon_clsf_cd")));
String lon_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lon_dt")));
String st_dduc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("st_dduc_dt")));
String et_dduc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("et_dduc_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setLon_clsf_cd(lon_clsf_cd);
dm.setLon_dt(lon_dt);
dm.setSt_dduc_dt(st_dduc_dt);
dm.setEt_dduc_dt(et_dduc_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 14 17:49:37 KST 2009 */