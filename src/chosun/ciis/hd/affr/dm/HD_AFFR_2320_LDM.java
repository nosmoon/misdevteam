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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_2320_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String congr_condl_dt_ft;
	public String congr_condl_dt_to;
	public String congr_condl_cd;

	public HD_AFFR_2320_LDM(){}
	public HD_AFFR_2320_LDM(String cmpy_cd, String emp_no, String congr_condl_dt_ft, String congr_condl_dt_to, String congr_condl_cd){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.congr_condl_dt_ft = congr_condl_dt_ft;
		this.congr_condl_dt_to = congr_condl_dt_to;
		this.congr_condl_cd = congr_condl_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCongr_condl_dt_ft(String congr_condl_dt_ft){
		this.congr_condl_dt_ft = congr_condl_dt_ft;
	}

	public void setCongr_condl_dt_to(String congr_condl_dt_to){
		this.congr_condl_dt_to = congr_condl_dt_to;
	}

	public void setCongr_condl_cd(String congr_condl_cd){
		this.congr_condl_cd = congr_condl_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCongr_condl_dt_ft(){
		return this.congr_condl_dt_ft;
	}

	public String getCongr_condl_dt_to(){
		return this.congr_condl_dt_to;
	}

	public String getCongr_condl_cd(){
		return this.congr_condl_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2320_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2320_LDM dm = (HD_AFFR_2320_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.congr_condl_dt_ft);
		cstmt.setString(6, dm.congr_condl_dt_to);
		cstmt.setString(7, dm.congr_condl_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2320_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("congr_condl_dt_ft = [" + getCongr_condl_dt_ft() + "]");
		System.out.println("congr_condl_dt_to = [" + getCongr_condl_dt_to() + "]");
		System.out.println("congr_condl_cd = [" + getCongr_condl_cd() + "]");
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
String congr_condl_dt_ft = req.getParameter("congr_condl_dt_ft");
if( congr_condl_dt_ft == null){
	System.out.println(this.toString+" : congr_condl_dt_ft is null" );
}else{
	System.out.println(this.toString+" : congr_condl_dt_ft is "+congr_condl_dt_ft );
}
String congr_condl_dt_to = req.getParameter("congr_condl_dt_to");
if( congr_condl_dt_to == null){
	System.out.println(this.toString+" : congr_condl_dt_to is null" );
}else{
	System.out.println(this.toString+" : congr_condl_dt_to is "+congr_condl_dt_to );
}
String congr_condl_cd = req.getParameter("congr_condl_cd");
if( congr_condl_cd == null){
	System.out.println(this.toString+" : congr_condl_cd is null" );
}else{
	System.out.println(this.toString+" : congr_condl_cd is "+congr_condl_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String congr_condl_dt_ft = Util.checkString(req.getParameter("congr_condl_dt_ft"));
String congr_condl_dt_to = Util.checkString(req.getParameter("congr_condl_dt_to"));
String congr_condl_cd = Util.checkString(req.getParameter("congr_condl_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String congr_condl_dt_ft = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_dt_ft")));
String congr_condl_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_dt_to")));
String congr_condl_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setCongr_condl_dt_ft(congr_condl_dt_ft);
dm.setCongr_condl_dt_to(congr_condl_dt_to);
dm.setCongr_condl_cd(congr_condl_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat May 30 15:21:10 KST 2009 */