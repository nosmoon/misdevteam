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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_1303_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String matr_cd;
	public String dstb_rat_cd;
	public String ewh_budg_cd;
	public String owh_budg_cd;
	public String wste_yn;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public MT_COMMATR_1303_ADM(){}
	public MT_COMMATR_1303_ADM(String cmpy_cd, String matr_cd, String dstb_rat_cd, String ewh_budg_cd, String owh_budg_cd, String wste_yn, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.matr_cd = matr_cd;
		this.dstb_rat_cd = dstb_rat_cd;
		this.ewh_budg_cd = ewh_budg_cd;
		this.owh_budg_cd = owh_budg_cd;
		this.wste_yn = wste_yn;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setWste_yn(String wste_yn){
		this.wste_yn = wste_yn;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getWste_yn(){
		return this.wste_yn;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_1303_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_1303_ADM dm = (MT_COMMATR_1303_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.matr_cd);
		cstmt.setString(5, dm.dstb_rat_cd);
		cstmt.setString(6, dm.ewh_budg_cd);
		cstmt.setString(7, dm.owh_budg_cd);
		cstmt.setString(8, dm.wste_yn);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_1303_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("dstb_rat_cd = [" + getDstb_rat_cd() + "]");
		System.out.println("ewh_budg_cd = [" + getEwh_budg_cd() + "]");
		System.out.println("owh_budg_cd = [" + getOwh_budg_cd() + "]");
		System.out.println("wste_yn = [" + getWste_yn() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String dstb_rat_cd = req.getParameter("dstb_rat_cd");
if( dstb_rat_cd == null){
	System.out.println(this.toString+" : dstb_rat_cd is null" );
}else{
	System.out.println(this.toString+" : dstb_rat_cd is "+dstb_rat_cd );
}
String ewh_budg_cd = req.getParameter("ewh_budg_cd");
if( ewh_budg_cd == null){
	System.out.println(this.toString+" : ewh_budg_cd is null" );
}else{
	System.out.println(this.toString+" : ewh_budg_cd is "+ewh_budg_cd );
}
String owh_budg_cd = req.getParameter("owh_budg_cd");
if( owh_budg_cd == null){
	System.out.println(this.toString+" : owh_budg_cd is null" );
}else{
	System.out.println(this.toString+" : owh_budg_cd is "+owh_budg_cd );
}
String wste_yn = req.getParameter("wste_yn");
if( wste_yn == null){
	System.out.println(this.toString+" : wste_yn is null" );
}else{
	System.out.println(this.toString+" : wste_yn is "+wste_yn );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String dstb_rat_cd = Util.checkString(req.getParameter("dstb_rat_cd"));
String ewh_budg_cd = Util.checkString(req.getParameter("ewh_budg_cd"));
String owh_budg_cd = Util.checkString(req.getParameter("owh_budg_cd"));
String wste_yn = Util.checkString(req.getParameter("wste_yn"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String dstb_rat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstb_rat_cd")));
String ewh_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_budg_cd")));
String owh_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_budg_cd")));
String wste_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("wste_yn")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMatr_cd(matr_cd);
dm.setDstb_rat_cd(dstb_rat_cd);
dm.setEwh_budg_cd(ewh_budg_cd);
dm.setOwh_budg_cd(owh_budg_cd);
dm.setWste_yn(wste_yn);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 02 19:47:11 KST 2009 */