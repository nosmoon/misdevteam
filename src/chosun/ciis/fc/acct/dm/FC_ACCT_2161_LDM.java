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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2161_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_dt;
	public String impt_dept;

	public FC_ACCT_2161_LDM(){}
	public FC_ACCT_2161_LDM(String cmpy_cd, String incmg_dt, String impt_dept){
		this.cmpy_cd = cmpy_cd;
		this.incmg_dt = incmg_dt;
		this.impt_dept = impt_dept;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setImpt_dept(String impt_dept){
		this.impt_dept = impt_dept;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getImpt_dept(){
		return this.impt_dept;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2161_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2161_LDM dm = (FC_ACCT_2161_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_dt);
		cstmt.setString(5, dm.impt_dept);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2161_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_dt = [" + getIncmg_dt() + "]");
		System.out.println("impt_dept = [" + getImpt_dept() + "]");
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
String incmg_dt = req.getParameter("incmg_dt");
if( incmg_dt == null){
	System.out.println(this.toString+" : incmg_dt is null" );
}else{
	System.out.println(this.toString+" : incmg_dt is "+incmg_dt );
}
String impt_dept = req.getParameter("impt_dept");
if( impt_dept == null){
	System.out.println(this.toString+" : impt_dept is null" );
}else{
	System.out.println(this.toString+" : impt_dept is "+impt_dept );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
String impt_dept = Util.checkString(req.getParameter("impt_dept"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt")));
String impt_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_dept")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_dt(incmg_dt);
dm.setImpt_dept(impt_dept);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 02 17:58:21 KST 2015 */