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


package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_1500_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String busi_frdt;
	public String busi_todt;
	public String dept_cd;
	public String emp_no;
	public String nm_korn;
	public String cmpy_cd;

	public HD_TRIP_1500_LDM(){}
	public HD_TRIP_1500_LDM(String busi_frdt, String busi_todt, String dept_cd, String emp_no, String nm_korn, String cmpy_cd){
		this.busi_frdt = busi_frdt;
		this.busi_todt = busi_todt;
		this.dept_cd = dept_cd;
		this.emp_no = emp_no;
		this.nm_korn = nm_korn;
		this.cmpy_cd = cmpy_cd;
	}

	public void setBusi_frdt(String busi_frdt){
		this.busi_frdt = busi_frdt;
	}

	public void setBusi_todt(String busi_todt){
		this.busi_todt = busi_todt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getBusi_frdt(){
		return this.busi_frdt;
	}

	public String getBusi_todt(){
		return this.busi_todt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1500_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1500_LDM dm = (HD_TRIP_1500_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.busi_frdt);
		cstmt.setString(4, dm.busi_todt);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.nm_korn);
		cstmt.setString(8, dm.cmpy_cd);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1500_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("busi_frdt = [" + getBusi_frdt() + "]");
		System.out.println("busi_todt = [" + getBusi_todt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("nm_korn = [" + getNm_korn() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String busi_frdt = req.getParameter("busi_frdt");
if( busi_frdt == null){
	System.out.println(this.toString+" : busi_frdt is null" );
}else{
	System.out.println(this.toString+" : busi_frdt is "+busi_frdt );
}
String busi_todt = req.getParameter("busi_todt");
if( busi_todt == null){
	System.out.println(this.toString+" : busi_todt is null" );
}else{
	System.out.println(this.toString+" : busi_todt is "+busi_todt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String nm_korn = req.getParameter("nm_korn");
if( nm_korn == null){
	System.out.println(this.toString+" : nm_korn is null" );
}else{
	System.out.println(this.toString+" : nm_korn is "+nm_korn );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String busi_frdt = Util.checkString(req.getParameter("busi_frdt"));
String busi_todt = Util.checkString(req.getParameter("busi_todt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String nm_korn = Util.checkString(req.getParameter("nm_korn"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String busi_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_frdt")));
String busi_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_todt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String nm_korn = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_korn")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBusi_frdt(busi_frdt);
dm.setBusi_todt(busi_todt);
dm.setDept_cd(dept_cd);
dm.setEmp_no(emp_no);
dm.setNm_korn(nm_korn);
dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 25 14:16:37 KST 2009 */