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


public class MC_BUDG_2253_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_yn;
	public String incmg_pers;
	public String yyyy;
	public String tms;

	public MC_BUDG_2253_UDM(){}
	public MC_BUDG_2253_UDM(String cmpy_cd, String clos_yn, String incmg_pers, String yyyy, String tms){
		this.cmpy_cd = cmpy_cd;
		this.clos_yn = clos_yn;
		this.incmg_pers = incmg_pers;
		this.yyyy = yyyy;
		this.tms = tms;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getTms(){
		return this.tms;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2253_U(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2253_UDM dm = (MC_BUDG_2253_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clos_yn);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.yyyy);
		cstmt.setString(7, dm.tms);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2253_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clos_yn = [" + getClos_yn() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("yyyy = [" + getYyyy() + "]");
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
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String yyyy = req.getParameter("yyyy");
if( yyyy == null){
	System.out.println(this.toString+" : yyyy is null" );
}else{
	System.out.println(this.toString+" : yyyy is "+yyyy );
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
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String yyyy = Util.checkString(req.getParameter("yyyy"));
String tms = Util.checkString(req.getParameter("tms"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_yn(clos_yn);
dm.setIncmg_pers(incmg_pers);
dm.setYyyy(yyyy);
dm.setTms(tms);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 06 17:28:02 KST 2009 */