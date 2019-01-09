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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_6240_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fit_yy;
	public String fit_no;
	public String magam_flag;
	public String incmg_pers;

	public HD_SALY_6240_ADM(){}
	public HD_SALY_6240_ADM(String cmpy_cd, String fit_yy, String fit_no, String magam_flag, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.fit_yy = fit_yy;
		this.fit_no = fit_no;
		this.magam_flag = magam_flag;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFit_yy(String fit_yy){
		this.fit_yy = fit_yy;
	}

	public void setFit_no(String fit_no){
		this.fit_no = fit_no;
	}

	public void setMagam_flag(String magam_flag){
		this.magam_flag = magam_flag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFit_yy(){
		return this.fit_yy;
	}

	public String getFit_no(){
		return this.fit_no;
	}

	public String getMagam_flag(){
		return this.magam_flag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_6240_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_6240_ADM dm = (HD_SALY_6240_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fit_yy);
		cstmt.setString(5, dm.fit_no);
		cstmt.setString(6, dm.magam_flag);
		cstmt.setString(7, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_6240_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fit_yy = [" + getFit_yy() + "]");
		System.out.println("fit_no = [" + getFit_no() + "]");
		System.out.println("magam_flag = [" + getMagam_flag() + "]");
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
String fit_yy = req.getParameter("fit_yy");
if( fit_yy == null){
	System.out.println(this.toString+" : fit_yy is null" );
}else{
	System.out.println(this.toString+" : fit_yy is "+fit_yy );
}
String fit_no = req.getParameter("fit_no");
if( fit_no == null){
	System.out.println(this.toString+" : fit_no is null" );
}else{
	System.out.println(this.toString+" : fit_no is "+fit_no );
}
String magam_flag = req.getParameter("magam_flag");
if( magam_flag == null){
	System.out.println(this.toString+" : magam_flag is null" );
}else{
	System.out.println(this.toString+" : magam_flag is "+magam_flag );
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
String fit_yy = Util.checkString(req.getParameter("fit_yy"));
String fit_no = Util.checkString(req.getParameter("fit_no"));
String magam_flag = Util.checkString(req.getParameter("magam_flag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fit_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("fit_yy")));
String fit_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fit_no")));
String magam_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("magam_flag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFit_yy(fit_yy);
dm.setFit_no(fit_no);
dm.setMagam_flag(magam_flag);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Sep 17 11:50:07 KST 2015 */