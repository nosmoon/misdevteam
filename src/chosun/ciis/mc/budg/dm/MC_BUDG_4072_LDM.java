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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4072_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String date_fr;
	public String date_to;
	public String dept_fr;
	public String dept_to;

	public MC_BUDG_4072_LDM(){}
	public MC_BUDG_4072_LDM(String cmpy_cd, String date_fr, String date_to, String dept_fr, String dept_to){
		this.cmpy_cd = cmpy_cd;
		this.date_fr = date_fr;
		this.date_to = date_to;
		this.dept_fr = dept_fr;
		this.dept_to = dept_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDate_fr(String date_fr){
		this.date_fr = date_fr;
	}

	public void setDate_to(String date_to){
		this.date_to = date_to;
	}

	public void setDept_fr(String dept_fr){
		this.dept_fr = dept_fr;
	}

	public void setDept_to(String dept_to){
		this.dept_to = dept_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDate_fr(){
		return this.date_fr;
	}

	public String getDate_to(){
		return this.date_to;
	}

	public String getDept_fr(){
		return this.dept_fr;
	}

	public String getDept_to(){
		return this.dept_to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4072_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4072_LDM dm = (MC_BUDG_4072_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.date_fr);
		cstmt.setString(5, dm.date_to);
		cstmt.setString(6, dm.dept_fr);
		cstmt.setString(7, dm.dept_to);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4072_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("date_fr = [" + getDate_fr() + "]");
		System.out.println("date_to = [" + getDate_to() + "]");
		System.out.println("dept_fr = [" + getDept_fr() + "]");
		System.out.println("dept_to = [" + getDept_to() + "]");
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
String date_fr = req.getParameter("date_fr");
if( date_fr == null){
	System.out.println(this.toString+" : date_fr is null" );
}else{
	System.out.println(this.toString+" : date_fr is "+date_fr );
}
String date_to = req.getParameter("date_to");
if( date_to == null){
	System.out.println(this.toString+" : date_to is null" );
}else{
	System.out.println(this.toString+" : date_to is "+date_to );
}
String dept_fr = req.getParameter("dept_fr");
if( dept_fr == null){
	System.out.println(this.toString+" : dept_fr is null" );
}else{
	System.out.println(this.toString+" : dept_fr is "+dept_fr );
}
String dept_to = req.getParameter("dept_to");
if( dept_to == null){
	System.out.println(this.toString+" : dept_to is null" );
}else{
	System.out.println(this.toString+" : dept_to is "+dept_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String date_fr = Util.checkString(req.getParameter("date_fr"));
String date_to = Util.checkString(req.getParameter("date_to"));
String dept_fr = Util.checkString(req.getParameter("dept_fr"));
String dept_to = Util.checkString(req.getParameter("dept_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String date_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("date_fr")));
String date_to = Util.Uni2Ksc(Util.checkString(req.getParameter("date_to")));
String dept_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_fr")));
String dept_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDate_fr(date_fr);
dm.setDate_to(date_to);
dm.setDept_fr(dept_fr);
dm.setDept_to(dept_to);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 11 20:24:17 KST 2009 */