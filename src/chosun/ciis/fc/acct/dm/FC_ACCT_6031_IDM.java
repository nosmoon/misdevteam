/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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


public class FC_ACCT_6031_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String erplace_cd;
	public String fr_slip_occr_dt;
	public String to_slip_occr_dt;
	public String gssgb1;
	public String jobgb;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String std_dt;

	public FC_ACCT_6031_IDM(){}
	public FC_ACCT_6031_IDM(String cmpy_cd, String erplace_cd, String fr_slip_occr_dt, String to_slip_occr_dt, String gssgb1, String jobgb, String incmg_pers_ipadd, String incmg_pers, String std_dt){
		this.cmpy_cd = cmpy_cd;
		this.erplace_cd = erplace_cd;
		this.fr_slip_occr_dt = fr_slip_occr_dt;
		this.to_slip_occr_dt = to_slip_occr_dt;
		this.gssgb1 = gssgb1;
		this.jobgb = jobgb;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.std_dt = std_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setFr_slip_occr_dt(String fr_slip_occr_dt){
		this.fr_slip_occr_dt = fr_slip_occr_dt;
	}

	public void setTo_slip_occr_dt(String to_slip_occr_dt){
		this.to_slip_occr_dt = to_slip_occr_dt;
	}

	public void setGssgb1(String gssgb1){
		this.gssgb1 = gssgb1;
	}

	public void setJobgb(String jobgb){
		this.jobgb = jobgb;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setStd_dt(String std_dt){
		this.std_dt = std_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getFr_slip_occr_dt(){
		return this.fr_slip_occr_dt;
	}

	public String getTo_slip_occr_dt(){
		return this.to_slip_occr_dt;
	}

	public String getGssgb1(){
		return this.gssgb1;
	}

	public String getJobgb(){
		return this.jobgb;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getStd_dt(){
		return this.std_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6031_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6031_IDM dm = (FC_ACCT_6031_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.erplace_cd);
		cstmt.setString(5, dm.fr_slip_occr_dt);
		cstmt.setString(6, dm.to_slip_occr_dt);
		cstmt.setString(7, dm.gssgb1);
		cstmt.setString(8, dm.jobgb);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.std_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6031_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("fr_slip_occr_dt = [" + getFr_slip_occr_dt() + "]");
		System.out.println("to_slip_occr_dt = [" + getTo_slip_occr_dt() + "]");
		System.out.println("gssgb1 = [" + getGssgb1() + "]");
		System.out.println("jobgb = [" + getJobgb() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("std_dt = [" + getStd_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String fr_slip_occr_dt = req.getParameter("fr_slip_occr_dt");
if( fr_slip_occr_dt == null){
	System.out.println(this.toString+" : fr_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_slip_occr_dt is "+fr_slip_occr_dt );
}
String to_slip_occr_dt = req.getParameter("to_slip_occr_dt");
if( to_slip_occr_dt == null){
	System.out.println(this.toString+" : to_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : to_slip_occr_dt is "+to_slip_occr_dt );
}
String gssgb1 = req.getParameter("gssgb1");
if( gssgb1 == null){
	System.out.println(this.toString+" : gssgb1 is null" );
}else{
	System.out.println(this.toString+" : gssgb1 is "+gssgb1 );
}
String jobgb = req.getParameter("jobgb");
if( jobgb == null){
	System.out.println(this.toString+" : jobgb is null" );
}else{
	System.out.println(this.toString+" : jobgb is "+jobgb );
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
String std_dt = req.getParameter("std_dt");
if( std_dt == null){
	System.out.println(this.toString+" : std_dt is null" );
}else{
	System.out.println(this.toString+" : std_dt is "+std_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String fr_slip_occr_dt = Util.checkString(req.getParameter("fr_slip_occr_dt"));
String to_slip_occr_dt = Util.checkString(req.getParameter("to_slip_occr_dt"));
String gssgb1 = Util.checkString(req.getParameter("gssgb1"));
String jobgb = Util.checkString(req.getParameter("jobgb"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String std_dt = Util.checkString(req.getParameter("std_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String fr_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_slip_occr_dt")));
String to_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_slip_occr_dt")));
String gssgb1 = Util.Uni2Ksc(Util.checkString(req.getParameter("gssgb1")));
String jobgb = Util.Uni2Ksc(Util.checkString(req.getParameter("jobgb")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String std_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("std_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setErplace_cd(erplace_cd);
dm.setFr_slip_occr_dt(fr_slip_occr_dt);
dm.setTo_slip_occr_dt(to_slip_occr_dt);
dm.setGssgb1(gssgb1);
dm.setJobgb(jobgb);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setStd_dt(std_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 22 11:34:10 KST 2015 */