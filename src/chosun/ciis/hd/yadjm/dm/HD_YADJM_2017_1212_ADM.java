/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_2017_1212_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String flnm;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String mode;
	public String pay_dt;
	public String ern;
	public String firmnm;
	public String obj_pers_flnm;
	public String prn;
	public String rshp;
	public String obcl_pers_rspc_yn;
	public String pay_noit;
	public String pay_amt;
	public String pay_noit_cash;
	public String pay_amt_cash;
	public String hosp_prof;
	public String seq;
	public String subf_treat_yn;

	public HD_YADJM_2017_1212_ADM(){}
	public HD_YADJM_2017_1212_ADM(String cmpy_cd, String adjm_rvrs_yy, String emp_no, String flnm, String incmg_pers_ip, String incmg_pers, String mode, String pay_dt, String ern, String firmnm, String obj_pers_flnm, String prn, String rshp, String obcl_pers_rspc_yn, String pay_noit, String pay_amt, String pay_noit_cash, String pay_amt_cash, String hosp_prof, String seq, String subf_treat_yn){
		this.cmpy_cd = cmpy_cd;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.pay_dt = pay_dt;
		this.ern = ern;
		this.firmnm = firmnm;
		this.obj_pers_flnm = obj_pers_flnm;
		this.prn = prn;
		this.rshp = rshp;
		this.obcl_pers_rspc_yn = obcl_pers_rspc_yn;
		this.pay_noit = pay_noit;
		this.pay_amt = pay_amt;
		this.pay_noit_cash = pay_noit_cash;
		this.pay_amt_cash = pay_amt_cash;
		this.hosp_prof = hosp_prof;
		this.seq = seq;
		this.subf_treat_yn = subf_treat_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setFirmnm(String firmnm){
		this.firmnm = firmnm;
	}

	public void setObj_pers_flnm(String obj_pers_flnm){
		this.obj_pers_flnm = obj_pers_flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setRshp(String rshp){
		this.rshp = rshp;
	}

	public void setObcl_pers_rspc_yn(String obcl_pers_rspc_yn){
		this.obcl_pers_rspc_yn = obcl_pers_rspc_yn;
	}

	public void setPay_noit(String pay_noit){
		this.pay_noit = pay_noit;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setPay_noit_cash(String pay_noit_cash){
		this.pay_noit_cash = pay_noit_cash;
	}

	public void setPay_amt_cash(String pay_amt_cash){
		this.pay_amt_cash = pay_amt_cash;
	}

	public void setHosp_prof(String hosp_prof){
		this.hosp_prof = hosp_prof;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSubf_treat_yn(String subf_treat_yn){
		this.subf_treat_yn = subf_treat_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getErn(){
		return this.ern;
	}

	public String getFirmnm(){
		return this.firmnm;
	}

	public String getObj_pers_flnm(){
		return this.obj_pers_flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getRshp(){
		return this.rshp;
	}

	public String getObcl_pers_rspc_yn(){
		return this.obcl_pers_rspc_yn;
	}

	public String getPay_noit(){
		return this.pay_noit;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getPay_noit_cash(){
		return this.pay_noit_cash;
	}

	public String getPay_amt_cash(){
		return this.pay_amt_cash;
	}

	public String getHosp_prof(){
		return this.hosp_prof;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSubf_treat_yn(){
		return this.subf_treat_yn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_2017_1212_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_2017_1212_ADM dm = (HD_YADJM_2017_1212_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_rvrs_yy);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.incmg_pers_ip);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.mode);
		cstmt.setString(10, dm.pay_dt);
		cstmt.setString(11, dm.ern);
		cstmt.setString(12, dm.firmnm);
		cstmt.setString(13, dm.obj_pers_flnm);
		cstmt.setString(14, dm.prn);
		cstmt.setString(15, dm.rshp);
		cstmt.setString(16, dm.obcl_pers_rspc_yn);
		cstmt.setString(17, dm.pay_noit);
		cstmt.setString(18, dm.pay_amt);
		cstmt.setString(19, dm.pay_noit_cash);
		cstmt.setString(20, dm.pay_amt_cash);
		cstmt.setString(21, dm.hosp_prof);
		cstmt.setString(22, dm.seq);
		cstmt.setString(23, dm.subf_treat_yn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_2017_1212_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("firmnm = [" + getFirmnm() + "]");
		System.out.println("obj_pers_flnm = [" + getObj_pers_flnm() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("rshp = [" + getRshp() + "]");
		System.out.println("obcl_pers_rspc_yn = [" + getObcl_pers_rspc_yn() + "]");
		System.out.println("pay_noit = [" + getPay_noit() + "]");
		System.out.println("pay_amt = [" + getPay_amt() + "]");
		System.out.println("pay_noit_cash = [" + getPay_noit_cash() + "]");
		System.out.println("pay_amt_cash = [" + getPay_amt_cash() + "]");
		System.out.println("hosp_prof = [" + getHosp_prof() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("subf_treat_yn = [" + getSubf_treat_yn() + "]");
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
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String firmnm = req.getParameter("firmnm");
if( firmnm == null){
	System.out.println(this.toString+" : firmnm is null" );
}else{
	System.out.println(this.toString+" : firmnm is "+firmnm );
}
String obj_pers_flnm = req.getParameter("obj_pers_flnm");
if( obj_pers_flnm == null){
	System.out.println(this.toString+" : obj_pers_flnm is null" );
}else{
	System.out.println(this.toString+" : obj_pers_flnm is "+obj_pers_flnm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String rshp = req.getParameter("rshp");
if( rshp == null){
	System.out.println(this.toString+" : rshp is null" );
}else{
	System.out.println(this.toString+" : rshp is "+rshp );
}
String obcl_pers_rspc_yn = req.getParameter("obcl_pers_rspc_yn");
if( obcl_pers_rspc_yn == null){
	System.out.println(this.toString+" : obcl_pers_rspc_yn is null" );
}else{
	System.out.println(this.toString+" : obcl_pers_rspc_yn is "+obcl_pers_rspc_yn );
}
String pay_noit = req.getParameter("pay_noit");
if( pay_noit == null){
	System.out.println(this.toString+" : pay_noit is null" );
}else{
	System.out.println(this.toString+" : pay_noit is "+pay_noit );
}
String pay_amt = req.getParameter("pay_amt");
if( pay_amt == null){
	System.out.println(this.toString+" : pay_amt is null" );
}else{
	System.out.println(this.toString+" : pay_amt is "+pay_amt );
}
String pay_noit_cash = req.getParameter("pay_noit_cash");
if( pay_noit_cash == null){
	System.out.println(this.toString+" : pay_noit_cash is null" );
}else{
	System.out.println(this.toString+" : pay_noit_cash is "+pay_noit_cash );
}
String pay_amt_cash = req.getParameter("pay_amt_cash");
if( pay_amt_cash == null){
	System.out.println(this.toString+" : pay_amt_cash is null" );
}else{
	System.out.println(this.toString+" : pay_amt_cash is "+pay_amt_cash );
}
String hosp_prof = req.getParameter("hosp_prof");
if( hosp_prof == null){
	System.out.println(this.toString+" : hosp_prof is null" );
}else{
	System.out.println(this.toString+" : hosp_prof is "+hosp_prof );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String subf_treat_yn = req.getParameter("subf_treat_yn");
if( subf_treat_yn == null){
	System.out.println(this.toString+" : subf_treat_yn is null" );
}else{
	System.out.println(this.toString+" : subf_treat_yn is "+subf_treat_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String ern = Util.checkString(req.getParameter("ern"));
String firmnm = Util.checkString(req.getParameter("firmnm"));
String obj_pers_flnm = Util.checkString(req.getParameter("obj_pers_flnm"));
String prn = Util.checkString(req.getParameter("prn"));
String rshp = Util.checkString(req.getParameter("rshp"));
String obcl_pers_rspc_yn = Util.checkString(req.getParameter("obcl_pers_rspc_yn"));
String pay_noit = Util.checkString(req.getParameter("pay_noit"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
String pay_noit_cash = Util.checkString(req.getParameter("pay_noit_cash"));
String pay_amt_cash = Util.checkString(req.getParameter("pay_amt_cash"));
String hosp_prof = Util.checkString(req.getParameter("hosp_prof"));
String seq = Util.checkString(req.getParameter("seq"));
String subf_treat_yn = Util.checkString(req.getParameter("subf_treat_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String firmnm = Util.Uni2Ksc(Util.checkString(req.getParameter("firmnm")));
String obj_pers_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_pers_flnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String rshp = Util.Uni2Ksc(Util.checkString(req.getParameter("rshp")));
String obcl_pers_rspc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_rspc_yn")));
String pay_noit = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_noit")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
String pay_noit_cash = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_noit_cash")));
String pay_amt_cash = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt_cash")));
String hosp_prof = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_prof")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String subf_treat_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("subf_treat_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setPay_dt(pay_dt);
dm.setErn(ern);
dm.setFirmnm(firmnm);
dm.setObj_pers_flnm(obj_pers_flnm);
dm.setPrn(prn);
dm.setRshp(rshp);
dm.setObcl_pers_rspc_yn(obcl_pers_rspc_yn);
dm.setPay_noit(pay_noit);
dm.setPay_amt(pay_amt);
dm.setPay_noit_cash(pay_noit_cash);
dm.setPay_amt_cash(pay_amt_cash);
dm.setHosp_prof(hosp_prof);
dm.setSeq(seq);
dm.setSubf_treat_yn(subf_treat_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 24 13:53:38 KST 2015 */