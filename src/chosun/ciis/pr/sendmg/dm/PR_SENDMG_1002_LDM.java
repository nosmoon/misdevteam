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


package chosun.ciis.pr.sendmg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.sendmg.ds.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */


public class PR_SENDMG_1002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt;
	public String emp_no;
	public String medi_cd;

	public PR_SENDMG_1002_LDM(){}
	public PR_SENDMG_1002_LDM(String cmpy_cd, String issu_dt, String emp_no, String medi_cd){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt = issu_dt;
		this.emp_no = emp_no;
		this.medi_cd = medi_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_SENDMG_1002_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_SENDMG_1002_LDM dm = (PR_SENDMG_1002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.medi_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.sendmg.ds.PR_SENDMG_1002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt(issu_dt);
dm.setEmp_no(emp_no);
dm.setMedi_cd(medi_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Nov 05 09:36:45 KST 2009 */