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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_2023_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String seci_no;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String yugaint;
	public String intamt;
	public String jbgamt;
	public String rcpay_amt;
	public String corp_tax_amt;
	public String misuamt;
	public String seci_clsf_cd;
	public String repay_dt;
	public String rmks;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String use_dept_cd;

	public FC_FUNC_2023_IDM(){}
	public FC_FUNC_2023_IDM(String cmpy_cd, String seci_no, String cost_gain_stot, String rcpay_amt_stot, String yugaint, String intamt, String jbgamt, String rcpay_amt, String corp_tax_amt, String misuamt, String seci_clsf_cd, String repay_dt, String rmks, String incmg_pers, String incmg_pers_ipadd, String use_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.seci_no = seci_no;
		this.cost_gain_stot = cost_gain_stot;
		this.rcpay_amt_stot = rcpay_amt_stot;
		this.yugaint = yugaint;
		this.intamt = intamt;
		this.jbgamt = jbgamt;
		this.rcpay_amt = rcpay_amt;
		this.corp_tax_amt = corp_tax_amt;
		this.misuamt = misuamt;
		this.seci_clsf_cd = seci_clsf_cd;
		this.repay_dt = repay_dt;
		this.rmks = rmks;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.use_dept_cd = use_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeci_no(String seci_no){
		this.seci_no = seci_no;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setYugaint(String yugaint){
		this.yugaint = yugaint;
	}

	public void setIntamt(String intamt){
		this.intamt = intamt;
	}

	public void setJbgamt(String jbgamt){
		this.jbgamt = jbgamt;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setCorp_tax_amt(String corp_tax_amt){
		this.corp_tax_amt = corp_tax_amt;
	}

	public void setMisuamt(String misuamt){
		this.misuamt = misuamt;
	}

	public void setSeci_clsf_cd(String seci_clsf_cd){
		this.seci_clsf_cd = seci_clsf_cd;
	}

	public void setRepay_dt(String repay_dt){
		this.repay_dt = repay_dt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeci_no(){
		return this.seci_no;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getYugaint(){
		return this.yugaint;
	}

	public String getIntamt(){
		return this.intamt;
	}

	public String getJbgamt(){
		return this.jbgamt;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getCorp_tax_amt(){
		return this.corp_tax_amt;
	}

	public String getMisuamt(){
		return this.misuamt;
	}

	public String getSeci_clsf_cd(){
		return this.seci_clsf_cd;
	}

	public String getRepay_dt(){
		return this.repay_dt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_2023_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_2023_IDM dm = (FC_FUNC_2023_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.seci_no);
		cstmt.setString(5, dm.cost_gain_stot);
		cstmt.setString(6, dm.rcpay_amt_stot);
		cstmt.setString(7, dm.yugaint);
		cstmt.setString(8, dm.intamt);
		cstmt.setString(9, dm.jbgamt);
		cstmt.setString(10, dm.rcpay_amt);
		cstmt.setString(11, dm.corp_tax_amt);
		cstmt.setString(12, dm.misuamt);
		cstmt.setString(13, dm.seci_clsf_cd);
		cstmt.setString(14, dm.repay_dt);
		cstmt.setString(15, dm.rmks);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.incmg_pers_ipadd);
		cstmt.setString(18, dm.use_dept_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_2023_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("seci_no = " + getSeci_no());
        System.out.println("cost_gain_stot = " + getCost_gain_stot());
        System.out.println("rcpay_amt_stot = " + getRcpay_amt_stot());
        System.out.println("yugaint = " + getYugaint());
        System.out.println("intamt = " + getIntamt());
        System.out.println("jbgamt = " + getJbgamt());
        System.out.println("rcpay_amt = " + getRcpay_amt());
        System.out.println("corp_tax_amt = " + getCorp_tax_amt());
        System.out.println("misuamt = " + getMisuamt());
        System.out.println("seci_clsf_cd = " + getSeci_clsf_cd());
        System.out.println("repay_dt = " + getRepay_dt());
        System.out.println("rmks = " + getRmks());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("use_dept_cd = " + getUse_dept_cd());
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
String seci_no = req.getParameter("seci_no");
if( seci_no == null){
	System.out.println(this.toString+" : seci_no is null" );
}else{
	System.out.println(this.toString+" : seci_no is "+seci_no );
}
String cost_gain_stot = req.getParameter("cost_gain_stot");
if( cost_gain_stot == null){
	System.out.println(this.toString+" : cost_gain_stot is null" );
}else{
	System.out.println(this.toString+" : cost_gain_stot is "+cost_gain_stot );
}
String rcpay_amt_stot = req.getParameter("rcpay_amt_stot");
if( rcpay_amt_stot == null){
	System.out.println(this.toString+" : rcpay_amt_stot is null" );
}else{
	System.out.println(this.toString+" : rcpay_amt_stot is "+rcpay_amt_stot );
}
String yugaint = req.getParameter("yugaint");
if( yugaint == null){
	System.out.println(this.toString+" : yugaint is null" );
}else{
	System.out.println(this.toString+" : yugaint is "+yugaint );
}
String intamt = req.getParameter("intamt");
if( intamt == null){
	System.out.println(this.toString+" : intamt is null" );
}else{
	System.out.println(this.toString+" : intamt is "+intamt );
}
String jbgamt = req.getParameter("jbgamt");
if( jbgamt == null){
	System.out.println(this.toString+" : jbgamt is null" );
}else{
	System.out.println(this.toString+" : jbgamt is "+jbgamt );
}
String rcpay_amt = req.getParameter("rcpay_amt");
if( rcpay_amt == null){
	System.out.println(this.toString+" : rcpay_amt is null" );
}else{
	System.out.println(this.toString+" : rcpay_amt is "+rcpay_amt );
}
String corp_tax_amt = req.getParameter("corp_tax_amt");
if( corp_tax_amt == null){
	System.out.println(this.toString+" : corp_tax_amt is null" );
}else{
	System.out.println(this.toString+" : corp_tax_amt is "+corp_tax_amt );
}
String misuamt = req.getParameter("misuamt");
if( misuamt == null){
	System.out.println(this.toString+" : misuamt is null" );
}else{
	System.out.println(this.toString+" : misuamt is "+misuamt );
}
String seci_clsf_cd = req.getParameter("seci_clsf_cd");
if( seci_clsf_cd == null){
	System.out.println(this.toString+" : seci_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : seci_clsf_cd is "+seci_clsf_cd );
}
String repay_dt = req.getParameter("repay_dt");
if( repay_dt == null){
	System.out.println(this.toString+" : repay_dt is null" );
}else{
	System.out.println(this.toString+" : repay_dt is "+repay_dt );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
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
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seci_no = Util.checkString(req.getParameter("seci_no"));
String cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
String rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
String yugaint = Util.checkString(req.getParameter("yugaint"));
String intamt = Util.checkString(req.getParameter("intamt"));
String jbgamt = Util.checkString(req.getParameter("jbgamt"));
String rcpay_amt = Util.checkString(req.getParameter("rcpay_amt"));
String corp_tax_amt = Util.checkString(req.getParameter("corp_tax_amt"));
String misuamt = Util.checkString(req.getParameter("misuamt"));
String seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
String repay_dt = Util.checkString(req.getParameter("repay_dt"));
String rmks = Util.checkString(req.getParameter("rmks"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seci_no = Util.Uni2Ksc(Util.checkString(req.getParameter("seci_no")));
String cost_gain_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_gain_stot")));
String rcpay_amt_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt_stot")));
String yugaint = Util.Uni2Ksc(Util.checkString(req.getParameter("yugaint")));
String intamt = Util.Uni2Ksc(Util.checkString(req.getParameter("intamt")));
String jbgamt = Util.Uni2Ksc(Util.checkString(req.getParameter("jbgamt")));
String rcpay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt")));
String corp_tax_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("corp_tax_amt")));
String misuamt = Util.Uni2Ksc(Util.checkString(req.getParameter("misuamt")));
String seci_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("seci_clsf_cd")));
String repay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_dt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSeci_no(seci_no);
dm.setCost_gain_stot(cost_gain_stot);
dm.setRcpay_amt_stot(rcpay_amt_stot);
dm.setYugaint(yugaint);
dm.setIntamt(intamt);
dm.setJbgamt(jbgamt);
dm.setRcpay_amt(rcpay_amt);
dm.setCorp_tax_amt(corp_tax_amt);
dm.setMisuamt(misuamt);
dm.setSeci_clsf_cd(seci_clsf_cd);
dm.setRepay_dt(repay_dt);
dm.setRmks(rmks);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setUse_dept_cd(use_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 12 16:24:07 KST 2009 */