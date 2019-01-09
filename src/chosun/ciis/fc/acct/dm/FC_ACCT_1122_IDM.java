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


public class FC_ACCT_1122_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fund_cd;
	public String fund_cdnm;
	public String impt_expn_clsf_cd;
	public String pay_cycl_cd;
	public String pay_wkdy;
	public String pay_dd;
	public String pay_dd2;
	public String repe_yn;
	public String repe_cycl;
	public String use_yn;
	public String hd_bsdd_afbf_flag;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_1122_IDM(){}
	public FC_ACCT_1122_IDM(String cmpy_cd, String fund_cd, String fund_cdnm, String impt_expn_clsf_cd, String pay_cycl_cd, String pay_wkdy, String pay_dd, String pay_dd2, String repe_yn, String repe_cycl, String use_yn, String hd_bsdd_afbf_flag, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.fund_cd = fund_cd;
		this.fund_cdnm = fund_cdnm;
		this.impt_expn_clsf_cd = impt_expn_clsf_cd;
		this.pay_cycl_cd = pay_cycl_cd;
		this.pay_wkdy = pay_wkdy;
		this.pay_dd = pay_dd;
		this.pay_dd2 = pay_dd2;
		this.repe_yn = repe_yn;
		this.repe_cycl = repe_cycl;
		this.use_yn = use_yn;
		this.hd_bsdd_afbf_flag = hd_bsdd_afbf_flag;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFund_cd(String fund_cd){
		this.fund_cd = fund_cd;
	}

	public void setFund_cdnm(String fund_cdnm){
		this.fund_cdnm = fund_cdnm;
	}

	public void setImpt_expn_clsf_cd(String impt_expn_clsf_cd){
		this.impt_expn_clsf_cd = impt_expn_clsf_cd;
	}

	public void setPay_cycl_cd(String pay_cycl_cd){
		this.pay_cycl_cd = pay_cycl_cd;
	}

	public void setPay_wkdy(String pay_wkdy){
		this.pay_wkdy = pay_wkdy;
	}

	public void setPay_dd(String pay_dd){
		this.pay_dd = pay_dd;
	}

	public void setPay_dd2(String pay_dd2){
		this.pay_dd2 = pay_dd2;
	}

	public void setRepe_yn(String repe_yn){
		this.repe_yn = repe_yn;
	}

	public void setRepe_cycl(String repe_cycl){
		this.repe_cycl = repe_cycl;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setHd_bsdd_afbf_flag(String hd_bsdd_afbf_flag){
		this.hd_bsdd_afbf_flag = hd_bsdd_afbf_flag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFund_cd(){
		return this.fund_cd;
	}

	public String getFund_cdnm(){
		return this.fund_cdnm;
	}

	public String getImpt_expn_clsf_cd(){
		return this.impt_expn_clsf_cd;
	}

	public String getPay_cycl_cd(){
		return this.pay_cycl_cd;
	}

	public String getPay_wkdy(){
		return this.pay_wkdy;
	}

	public String getPay_dd(){
		return this.pay_dd;
	}

	public String getPay_dd2(){
		return this.pay_dd2;
	}

	public String getRepe_yn(){
		return this.repe_yn;
	}

	public String getRepe_cycl(){
		return this.repe_cycl;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getHd_bsdd_afbf_flag(){
		return this.hd_bsdd_afbf_flag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1122_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1122_IDM dm = (FC_ACCT_1122_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fund_cd);
		cstmt.setString(5, dm.fund_cdnm);
		cstmt.setString(6, dm.impt_expn_clsf_cd);
		cstmt.setString(7, dm.pay_cycl_cd);
		cstmt.setString(8, dm.pay_wkdy);
		cstmt.setString(9, dm.pay_dd);
		cstmt.setString(10, dm.pay_dd2);
		cstmt.setString(11, dm.repe_yn);
		cstmt.setString(12, dm.repe_cycl);
		cstmt.setString(13, dm.use_yn);
		cstmt.setString(14, dm.hd_bsdd_afbf_flag);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1122_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fund_cd = [" + getFund_cd() + "]");
		System.out.println("fund_cdnm = [" + getFund_cdnm() + "]");
		System.out.println("impt_expn_clsf_cd = [" + getImpt_expn_clsf_cd() + "]");
		System.out.println("pay_cycl_cd = [" + getPay_cycl_cd() + "]");
		System.out.println("pay_wkdy = [" + getPay_wkdy() + "]");
		System.out.println("pay_dd = [" + getPay_dd() + "]");
		System.out.println("pay_dd2 = [" + getPay_dd2() + "]");
		System.out.println("repe_yn = [" + getRepe_yn() + "]");
		System.out.println("repe_cycl = [" + getRepe_cycl() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("hd_bsdd_afbf_flag = [" + getHd_bsdd_afbf_flag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String fund_cd = req.getParameter("fund_cd");
if( fund_cd == null){
	System.out.println(this.toString+" : fund_cd is null" );
}else{
	System.out.println(this.toString+" : fund_cd is "+fund_cd );
}
String fund_cdnm = req.getParameter("fund_cdnm");
if( fund_cdnm == null){
	System.out.println(this.toString+" : fund_cdnm is null" );
}else{
	System.out.println(this.toString+" : fund_cdnm is "+fund_cdnm );
}
String impt_expn_clsf_cd = req.getParameter("impt_expn_clsf_cd");
if( impt_expn_clsf_cd == null){
	System.out.println(this.toString+" : impt_expn_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : impt_expn_clsf_cd is "+impt_expn_clsf_cd );
}
String pay_cycl_cd = req.getParameter("pay_cycl_cd");
if( pay_cycl_cd == null){
	System.out.println(this.toString+" : pay_cycl_cd is null" );
}else{
	System.out.println(this.toString+" : pay_cycl_cd is "+pay_cycl_cd );
}
String pay_wkdy = req.getParameter("pay_wkdy");
if( pay_wkdy == null){
	System.out.println(this.toString+" : pay_wkdy is null" );
}else{
	System.out.println(this.toString+" : pay_wkdy is "+pay_wkdy );
}
String pay_dd = req.getParameter("pay_dd");
if( pay_dd == null){
	System.out.println(this.toString+" : pay_dd is null" );
}else{
	System.out.println(this.toString+" : pay_dd is "+pay_dd );
}
String pay_dd2 = req.getParameter("pay_dd2");
if( pay_dd2 == null){
	System.out.println(this.toString+" : pay_dd2 is null" );
}else{
	System.out.println(this.toString+" : pay_dd2 is "+pay_dd2 );
}
String repe_yn = req.getParameter("repe_yn");
if( repe_yn == null){
	System.out.println(this.toString+" : repe_yn is null" );
}else{
	System.out.println(this.toString+" : repe_yn is "+repe_yn );
}
String repe_cycl = req.getParameter("repe_cycl");
if( repe_cycl == null){
	System.out.println(this.toString+" : repe_cycl is null" );
}else{
	System.out.println(this.toString+" : repe_cycl is "+repe_cycl );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String hd_bsdd_afbf_flag = req.getParameter("hd_bsdd_afbf_flag");
if( hd_bsdd_afbf_flag == null){
	System.out.println(this.toString+" : hd_bsdd_afbf_flag is null" );
}else{
	System.out.println(this.toString+" : hd_bsdd_afbf_flag is "+hd_bsdd_afbf_flag );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fund_cd = Util.checkString(req.getParameter("fund_cd"));
String fund_cdnm = Util.checkString(req.getParameter("fund_cdnm"));
String impt_expn_clsf_cd = Util.checkString(req.getParameter("impt_expn_clsf_cd"));
String pay_cycl_cd = Util.checkString(req.getParameter("pay_cycl_cd"));
String pay_wkdy = Util.checkString(req.getParameter("pay_wkdy"));
String pay_dd = Util.checkString(req.getParameter("pay_dd"));
String pay_dd2 = Util.checkString(req.getParameter("pay_dd2"));
String repe_yn = Util.checkString(req.getParameter("repe_yn"));
String repe_cycl = Util.checkString(req.getParameter("repe_cycl"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String hd_bsdd_afbf_flag = Util.checkString(req.getParameter("hd_bsdd_afbf_flag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fund_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_cd")));
String fund_cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_cdnm")));
String impt_expn_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_expn_clsf_cd")));
String pay_cycl_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_cycl_cd")));
String pay_wkdy = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_wkdy")));
String pay_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dd")));
String pay_dd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dd2")));
String repe_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("repe_yn")));
String repe_cycl = Util.Uni2Ksc(Util.checkString(req.getParameter("repe_cycl")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String hd_bsdd_afbf_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("hd_bsdd_afbf_flag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFund_cd(fund_cd);
dm.setFund_cdnm(fund_cdnm);
dm.setImpt_expn_clsf_cd(impt_expn_clsf_cd);
dm.setPay_cycl_cd(pay_cycl_cd);
dm.setPay_wkdy(pay_wkdy);
dm.setPay_dd(pay_dd);
dm.setPay_dd2(pay_dd2);
dm.setRepe_yn(repe_yn);
dm.setRepe_cycl(repe_cycl);
dm.setUse_yn(use_yn);
dm.setHd_bsdd_afbf_flag(hd_bsdd_afbf_flag);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 20:23:44 KST 2009 */