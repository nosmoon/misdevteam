/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.qty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2340_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt;
	public String send_clos_grp_clsf;
	public String clos_tms;
	public String clos_yn;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_QTY_2340_ADM(){}
	public SE_QTY_2340_ADM(String cmpy_cd, String issu_dt, String send_clos_grp_clsf, String clos_tms, String clos_yn, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt = issu_dt;
		this.send_clos_grp_clsf = send_clos_grp_clsf;
		this.clos_tms = clos_tms;
		this.clos_yn = clos_yn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSend_clos_grp_clsf(String send_clos_grp_clsf){
		this.send_clos_grp_clsf = send_clos_grp_clsf;
	}

	public void setClos_tms(String clos_tms){
		this.clos_tms = clos_tms;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
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

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSend_clos_grp_clsf(){
		return this.send_clos_grp_clsf;
	}

	public String getClos_tms(){
		return this.clos_tms;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_QTY_2340_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_2340_ADM dm = (SE_QTY_2340_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt);
		cstmt.setString(5, dm.send_clos_grp_clsf);
		cstmt.setString(6, dm.clos_tms);
		cstmt.setString(7, dm.clos_yn);
		cstmt.setString(8, dm.incmg_pers_ip);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_2340_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("send_clos_grp_clsf = " + getSend_clos_grp_clsf());
        System.out.println("clos_tms = " + getClos_tms());
        System.out.println("clos_yn = " + getClos_yn());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String send_clos_grp_clsf = req.getParameter("send_clos_grp_clsf");
if( send_clos_grp_clsf == null){
	System.out.println(this.toString+" : send_clos_grp_clsf is null" );
}else{
	System.out.println(this.toString+" : send_clos_grp_clsf is "+send_clos_grp_clsf );
}
String clos_tms = req.getParameter("clos_tms");
if( clos_tms == null){
	System.out.println(this.toString+" : clos_tms is null" );
}else{
	System.out.println(this.toString+" : clos_tms is "+clos_tms );
}
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
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
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
String clos_tms = Util.checkString(req.getParameter("clos_tms"));
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String send_clos_grp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("send_clos_grp_clsf")));
String clos_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_tms")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt(issu_dt);
dm.setSend_clos_grp_clsf(send_clos_grp_clsf);
dm.setClos_tms(clos_tms);
dm.setClos_yn(clos_yn);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 11 17:43:09 KST 2009 */