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


public class HD_SALY_4202_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String lon_clsf_cd;
	public String st_lon_dt;
	public String et_lon_dt;
	public String end_yn;

	public HD_SALY_4202_LDM(){}
	public HD_SALY_4202_LDM(String cmpy_cd, String emp_no, String lon_clsf_cd, String st_lon_dt, String et_lon_dt, String end_yn){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.lon_clsf_cd = lon_clsf_cd;
		this.st_lon_dt = st_lon_dt;
		this.et_lon_dt = et_lon_dt;
		this.end_yn = end_yn;
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

	public void setSt_lon_dt(String st_lon_dt){
		this.st_lon_dt = st_lon_dt;
	}

	public void setEt_lon_dt(String et_lon_dt){
		this.et_lon_dt = et_lon_dt;
	}

	public void setEnd_yn(String end_yn){
		this.end_yn = end_yn;
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

	public String getSt_lon_dt(){
		return this.st_lon_dt;
	}

	public String getEt_lon_dt(){
		return this.et_lon_dt;
	}

	public String getEnd_yn(){
		return this.end_yn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_4202_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_4202_LDM dm = (HD_SALY_4202_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.lon_clsf_cd);
		cstmt.setString(6, dm.st_lon_dt);
		cstmt.setString(7, dm.et_lon_dt);
		cstmt.setString(8, dm.end_yn);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_4202_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("lon_clsf_cd = [" + getLon_clsf_cd() + "]");
		System.out.println("st_lon_dt = [" + getSt_lon_dt() + "]");
		System.out.println("et_lon_dt = [" + getEt_lon_dt() + "]");
		System.out.println("end_yn = [" + getEnd_yn() + "]");
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
String st_lon_dt = req.getParameter("st_lon_dt");
if( st_lon_dt == null){
	System.out.println(this.toString+" : st_lon_dt is null" );
}else{
	System.out.println(this.toString+" : st_lon_dt is "+st_lon_dt );
}
String et_lon_dt = req.getParameter("et_lon_dt");
if( et_lon_dt == null){
	System.out.println(this.toString+" : et_lon_dt is null" );
}else{
	System.out.println(this.toString+" : et_lon_dt is "+et_lon_dt );
}
String end_yn = req.getParameter("end_yn");
if( end_yn == null){
	System.out.println(this.toString+" : end_yn is null" );
}else{
	System.out.println(this.toString+" : end_yn is "+end_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String lon_clsf_cd = Util.checkString(req.getParameter("lon_clsf_cd"));
String st_lon_dt = Util.checkString(req.getParameter("st_lon_dt"));
String et_lon_dt = Util.checkString(req.getParameter("et_lon_dt"));
String end_yn = Util.checkString(req.getParameter("end_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String lon_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("lon_clsf_cd")));
String st_lon_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("st_lon_dt")));
String et_lon_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("et_lon_dt")));
String end_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("end_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setLon_clsf_cd(lon_clsf_cd);
dm.setSt_lon_dt(st_lon_dt);
dm.setEt_lon_dt(et_lon_dt);
dm.setEnd_yn(end_yn);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 21 19:40:07 KST 2009 */