/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2520_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String reg_dt;
	public String reg_seq;
	public String prt_plac_cd;
	public String route_clsf;
	public String cmpy_clsf;
	public String incmg_pers;

	public SE_SND_2520_LDM(){}
	public SE_SND_2520_LDM(String cmpy_cd, String reg_dt, String reg_seq, String prt_plac_cd, String route_clsf, String cmpy_clsf, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.reg_dt = reg_dt;
		this.reg_seq = reg_seq;
		this.prt_plac_cd = prt_plac_cd;
		this.route_clsf = route_clsf;
		this.cmpy_clsf = cmpy_clsf;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setCmpy_clsf(String cmpy_clsf){
		this.cmpy_clsf = cmpy_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getCmpy_clsf(){
		return this.cmpy_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_2520_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2520_LDM dm = (SE_SND_2520_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.reg_dt);
		cstmt.setString(5, dm.reg_seq);
		cstmt.setString(6, dm.prt_plac_cd);
		cstmt.setString(7, dm.route_clsf);
		cstmt.setString(8, dm.cmpy_clsf);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2520_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("reg_dt = [" + getReg_dt() + "]");
		System.out.println("reg_seq = [" + getReg_seq() + "]");
		System.out.println("prt_plac_cd = [" + getPrt_plac_cd() + "]");
		System.out.println("route_clsf = [" + getRoute_clsf() + "]");
		System.out.println("cmpy_clsf = [" + getCmpy_clsf() + "]");
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
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String reg_seq = req.getParameter("reg_seq");
if( reg_seq == null){
	System.out.println(this.toString+" : reg_seq is null" );
}else{
	System.out.println(this.toString+" : reg_seq is "+reg_seq );
}
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
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
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String reg_seq = Util.checkString(req.getParameter("reg_seq"));
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_seq")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setReg_dt(reg_dt);
dm.setReg_seq(reg_seq);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setRoute_clsf(route_clsf);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 04 20:32:25 KST 2009 */