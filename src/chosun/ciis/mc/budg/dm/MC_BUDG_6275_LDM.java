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


public class MC_BUDG_6275_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_yy;
	public String bulen;
	public String buzero;
	public String budg_ym;
	public String cls_cd;
	public String budg_by;
	public String budg_cd;
	public String dept_cd;
	public String tms;

	public MC_BUDG_6275_LDM(){}
	public MC_BUDG_6275_LDM(String cmpy_cd, String budg_yy, String bulen, String buzero, String budg_ym, String cls_cd, String budg_by, String budg_cd, String dept_cd, String tms){
		this.cmpy_cd = cmpy_cd;
		this.budg_yy = budg_yy;
		this.bulen = bulen;
		this.buzero = buzero;
		this.budg_ym = budg_ym;
		this.cls_cd = cls_cd;
		this.budg_by = budg_by;
		this.budg_cd = budg_cd;
		this.dept_cd = dept_cd;
		this.tms = tms;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_yy(String budg_yy){
		this.budg_yy = budg_yy;
	}

	public void setBulen(String bulen){
		this.bulen = bulen;
	}

	public void setBuzero(String buzero){
		this.buzero = buzero;
	}

	public void setBudg_ym(String budg_ym){
		this.budg_ym = budg_ym;
	}

	public void setCls_cd(String cls_cd){
		this.cls_cd = cls_cd;
	}

	public void setBudg_by(String budg_by){
		this.budg_by = budg_by;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_yy(){
		return this.budg_yy;
	}

	public String getBulen(){
		return this.bulen;
	}

	public String getBuzero(){
		return this.buzero;
	}

	public String getBudg_ym(){
		return this.budg_ym;
	}

	public String getCls_cd(){
		return this.cls_cd;
	}

	public String getBudg_by(){
		return this.budg_by;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getTms(){
		return this.tms;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6275_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6275_LDM dm = (MC_BUDG_6275_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_yy);
		cstmt.setString(5, dm.bulen);
		cstmt.setString(6, dm.buzero);
		cstmt.setString(7, dm.budg_ym);
		cstmt.setString(8, dm.cls_cd);
		cstmt.setString(9, dm.budg_by);
		cstmt.setString(10, dm.budg_cd);
		cstmt.setString(11, dm.dept_cd);
		cstmt.setString(12, dm.tms);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6275_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_yy = [" + getBudg_yy() + "]");
		System.out.println("bulen = [" + getBulen() + "]");
		System.out.println("buzero = [" + getBuzero() + "]");
		System.out.println("budg_ym = [" + getBudg_ym() + "]");
		System.out.println("cls_cd = [" + getCls_cd() + "]");
		System.out.println("budg_by = [" + getBudg_by() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("tms = [" + getTms() + "]");
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
String budg_yy = req.getParameter("budg_yy");
if( budg_yy == null){
	System.out.println(this.toString+" : budg_yy is null" );
}else{
	System.out.println(this.toString+" : budg_yy is "+budg_yy );
}
String bulen = req.getParameter("bulen");
if( bulen == null){
	System.out.println(this.toString+" : bulen is null" );
}else{
	System.out.println(this.toString+" : bulen is "+bulen );
}
String buzero = req.getParameter("buzero");
if( buzero == null){
	System.out.println(this.toString+" : buzero is null" );
}else{
	System.out.println(this.toString+" : buzero is "+buzero );
}
String budg_ym = req.getParameter("budg_ym");
if( budg_ym == null){
	System.out.println(this.toString+" : budg_ym is null" );
}else{
	System.out.println(this.toString+" : budg_ym is "+budg_ym );
}
String cls_cd = req.getParameter("cls_cd");
if( cls_cd == null){
	System.out.println(this.toString+" : cls_cd is null" );
}else{
	System.out.println(this.toString+" : cls_cd is "+cls_cd );
}
String budg_by = req.getParameter("budg_by");
if( budg_by == null){
	System.out.println(this.toString+" : budg_by is null" );
}else{
	System.out.println(this.toString+" : budg_by is "+budg_by );
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
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_yy = Util.checkString(req.getParameter("budg_yy"));
String bulen = Util.checkString(req.getParameter("bulen"));
String buzero = Util.checkString(req.getParameter("buzero"));
String budg_ym = Util.checkString(req.getParameter("budg_ym"));
String cls_cd = Util.checkString(req.getParameter("cls_cd"));
String budg_by = Util.checkString(req.getParameter("budg_by"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String tms = Util.checkString(req.getParameter("tms"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yy")));
String bulen = Util.Uni2Ksc(Util.checkString(req.getParameter("bulen")));
String buzero = Util.Uni2Ksc(Util.checkString(req.getParameter("buzero")));
String budg_ym = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_ym")));
String cls_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cls_cd")));
String budg_by = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_by")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_yy(budg_yy);
dm.setBulen(bulen);
dm.setBuzero(buzero);
dm.setBudg_ym(budg_ym);
dm.setCls_cd(cls_cd);
dm.setBudg_by(budg_by);
dm.setBudg_cd(budg_cd);
dm.setDept_cd(dept_cd);
dm.setTms(tms);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 13 12:09:14 KST 2009 */