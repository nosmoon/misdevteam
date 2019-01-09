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


package chosun.ciis.pl.cls.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.cls.ds.*;
import chosun.ciis.pl.cls.rec.*;

/**
 * 
 */


public class PL_CLS_1840_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_yn;
	public String mode;
	public String occr_dt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public PL_CLS_1840_ADM(){}
	public PL_CLS_1840_ADM(String cmpy_cd, String clos_yn, String mode, String occr_dt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.clos_yn = clos_yn;
		this.mode = mode;
		this.occr_dt = occr_dt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getMode(){
		return this.mode;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_CLS_1840_A(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_CLS_1840_ADM dm = (PL_CLS_1840_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clos_yn);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.incmg_pers_ip);
		cstmt.setString(8, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.cls.ds.PL_CLS_1840_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clos_yn = [" + getClos_yn() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String mode = Util.checkString(req.getParameter("mode"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_yn(clos_yn);
dm.setMode(mode);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 27 15:22:25 KST 2017 */