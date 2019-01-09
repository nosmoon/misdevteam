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


public class MC_BUDG_4012_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_dt;
	public String hsty_no;
	public String budg_yymm;
	public String budg_cd;
	public String dept_cd;
	public String evnt_cd;

	public MC_BUDG_4012_LDM(){}
	public MC_BUDG_4012_LDM(String cmpy_cd, String work_dt, String hsty_no, String budg_yymm, String budg_cd, String dept_cd, String evnt_cd){
		this.cmpy_cd = cmpy_cd;
		this.work_dt = work_dt;
		this.hsty_no = hsty_no;
		this.budg_yymm = budg_yymm;
		this.budg_cd = budg_cd;
		this.dept_cd = dept_cd;
		this.evnt_cd = evnt_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_dt(String work_dt){
		this.work_dt = work_dt;
	}

	public void setHsty_no(String hsty_no){
		this.hsty_no = hsty_no;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_dt(){
		return this.work_dt;
	}

	public String getHsty_no(){
		return this.hsty_no;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4012_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4012_LDM dm = (MC_BUDG_4012_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_dt);
		cstmt.setString(5, dm.hsty_no);
		cstmt.setString(6, dm.budg_yymm);
		cstmt.setString(7, dm.budg_cd);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.evnt_cd);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4012_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_dt = [" + getWork_dt() + "]");
		System.out.println("hsty_no = [" + getHsty_no() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
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
String work_dt = req.getParameter("work_dt");
if( work_dt == null){
	System.out.println(this.toString+" : work_dt is null" );
}else{
	System.out.println(this.toString+" : work_dt is "+work_dt );
}
String hsty_no = req.getParameter("hsty_no");
if( hsty_no == null){
	System.out.println(this.toString+" : hsty_no is null" );
}else{
	System.out.println(this.toString+" : hsty_no is "+hsty_no );
}
String budg_yymm = req.getParameter("budg_yymm");
if( budg_yymm == null){
	System.out.println(this.toString+" : budg_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_yymm is "+budg_yymm );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_dt = Util.checkString(req.getParameter("work_dt"));
String hsty_no = Util.checkString(req.getParameter("hsty_no"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("work_dt")));
String hsty_no = Util.Uni2Ksc(Util.checkString(req.getParameter("hsty_no")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_dt(work_dt);
dm.setHsty_no(hsty_no);
dm.setBudg_yymm(budg_yymm);
dm.setBudg_cd(budg_cd);
dm.setDept_cd(dept_cd);
dm.setEvnt_cd(evnt_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 26 17:06:35 KST 2009 */