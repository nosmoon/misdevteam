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


public class FC_ACCT_2165_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_dt;
	public String impt_dept;
	public String incmg_seq;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_2165_DDM(){}
	public FC_ACCT_2165_DDM(String cmpy_cd, String incmg_dt, String impt_dept, String incmg_seq, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.incmg_dt = incmg_dt;
		this.impt_dept = impt_dept;
		this.incmg_seq = incmg_seq;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
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

	public void setIncmg_seq(String incmg_seq){
		this.incmg_seq = incmg_seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
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

	public String getIncmg_seq(){
		return this.incmg_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2165_D(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2165_DDM dm = (FC_ACCT_2165_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_dt);
		cstmt.setString(5, dm.impt_dept);
		cstmt.setString(6, dm.incmg_seq);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.setString(8, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2165_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_dt = [" + getIncmg_dt() + "]");
		System.out.println("impt_dept = [" + getImpt_dept() + "]");
		System.out.println("incmg_seq = [" + getIncmg_seq() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String incmg_seq = req.getParameter("incmg_seq");
if( incmg_seq == null){
	System.out.println(this.toString+" : incmg_seq is null" );
}else{
	System.out.println(this.toString+" : incmg_seq is "+incmg_seq );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
String impt_dept = Util.checkString(req.getParameter("impt_dept"));
String incmg_seq = Util.checkString(req.getParameter("incmg_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt")));
String impt_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_dept")));
String incmg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_dt(incmg_dt);
dm.setImpt_dept(impt_dept);
dm.setIncmg_seq(incmg_seq);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 23 17:24:07 KST 2009 */