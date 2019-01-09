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


public class HD_YADJM_2012_1213_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String flnm;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String mode;
	public String ern;
	public String firmnm;
	public String dona_plac_clsf;
	public String dona_yymm;
	public String dona_ptcr_noit;
	public String dona_ptcr_amt;
	public String rmks;
	public String rshp;
	public String obj_pers_flnm;
	public String prn;
	public String corr_txn_prd_dduc_amt;
	public String cyov_amt;
	public String seq;
	public String lastyear_cyov_amt;

	public HD_YADJM_2012_1213_ADM(){}
	public HD_YADJM_2012_1213_ADM(String cmpy_cd, String adjm_rvrs_yy, String emp_no, String flnm, String incmg_pers_ip, String incmg_pers, String mode, String ern, String firmnm, String dona_plac_clsf, String dona_yymm, String dona_ptcr_noit, String dona_ptcr_amt, String rmks, String rshp, String obj_pers_flnm, String prn, String corr_txn_prd_dduc_amt, String cyov_amt, String seq, String lastyear_cyov_amt){
		this.cmpy_cd = cmpy_cd;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.ern = ern;
		this.firmnm = firmnm;
		this.dona_plac_clsf = dona_plac_clsf;
		this.dona_yymm = dona_yymm;
		this.dona_ptcr_noit = dona_ptcr_noit;
		this.dona_ptcr_amt = dona_ptcr_amt;
		this.rmks = rmks;
		this.rshp = rshp;
		this.obj_pers_flnm = obj_pers_flnm;
		this.prn = prn;
		this.corr_txn_prd_dduc_amt = corr_txn_prd_dduc_amt;
		this.cyov_amt = cyov_amt;
		this.seq = seq;
		this.lastyear_cyov_amt = lastyear_cyov_amt;
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

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setFirmnm(String firmnm){
		this.firmnm = firmnm;
	}

	public void setDona_plac_clsf(String dona_plac_clsf){
		this.dona_plac_clsf = dona_plac_clsf;
	}

	public void setDona_yymm(String dona_yymm){
		this.dona_yymm = dona_yymm;
	}

	public void setDona_ptcr_noit(String dona_ptcr_noit){
		this.dona_ptcr_noit = dona_ptcr_noit;
	}

	public void setDona_ptcr_amt(String dona_ptcr_amt){
		this.dona_ptcr_amt = dona_ptcr_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setRshp(String rshp){
		this.rshp = rshp;
	}

	public void setObj_pers_flnm(String obj_pers_flnm){
		this.obj_pers_flnm = obj_pers_flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setCorr_txn_prd_dduc_amt(String corr_txn_prd_dduc_amt){
		this.corr_txn_prd_dduc_amt = corr_txn_prd_dduc_amt;
	}

	public void setCyov_amt(String cyov_amt){
		this.cyov_amt = cyov_amt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setLastyear_cyov_amt(String lastyear_cyov_amt){
		this.lastyear_cyov_amt = lastyear_cyov_amt;
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

	public String getErn(){
		return this.ern;
	}

	public String getFirmnm(){
		return this.firmnm;
	}

	public String getDona_plac_clsf(){
		return this.dona_plac_clsf;
	}

	public String getDona_yymm(){
		return this.dona_yymm;
	}

	public String getDona_ptcr_noit(){
		return this.dona_ptcr_noit;
	}

	public String getDona_ptcr_amt(){
		return this.dona_ptcr_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getRshp(){
		return this.rshp;
	}

	public String getObj_pers_flnm(){
		return this.obj_pers_flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getCorr_txn_prd_dduc_amt(){
		return this.corr_txn_prd_dduc_amt;
	}

	public String getCyov_amt(){
		return this.cyov_amt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getLastyear_cyov_amt(){
		return this.lastyear_cyov_amt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_2012_1213_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_2012_1213_ADM dm = (HD_YADJM_2012_1213_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_rvrs_yy);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.incmg_pers_ip);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.mode);
		cstmt.setString(10, dm.ern);
		cstmt.setString(11, dm.firmnm);
		cstmt.setString(12, dm.dona_plac_clsf);
		cstmt.setString(13, dm.dona_yymm);
		cstmt.setString(14, dm.dona_ptcr_noit);
		cstmt.setString(15, dm.dona_ptcr_amt);
		cstmt.setString(16, dm.rmks);
		cstmt.setString(17, dm.rshp);
		cstmt.setString(18, dm.obj_pers_flnm);
		cstmt.setString(19, dm.prn);
		cstmt.setString(20, dm.corr_txn_prd_dduc_amt);
		cstmt.setString(21, dm.cyov_amt);
		cstmt.setString(22, dm.seq);
		cstmt.setString(23, dm.lastyear_cyov_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_2012_1213_ADataSet();
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
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("firmnm = [" + getFirmnm() + "]");
		System.out.println("dona_plac_clsf = [" + getDona_plac_clsf() + "]");
		System.out.println("dona_yymm = [" + getDona_yymm() + "]");
		System.out.println("dona_ptcr_noit = [" + getDona_ptcr_noit() + "]");
		System.out.println("dona_ptcr_amt = [" + getDona_ptcr_amt() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("rshp = [" + getRshp() + "]");
		System.out.println("obj_pers_flnm = [" + getObj_pers_flnm() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("corr_txn_prd_dduc_amt = [" + getCorr_txn_prd_dduc_amt() + "]");
		System.out.println("cyov_amt = [" + getCyov_amt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("lastyear_cyov_amt = [" + getLastyear_cyov_amt() + "]");
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
String dona_plac_clsf = req.getParameter("dona_plac_clsf");
if( dona_plac_clsf == null){
	System.out.println(this.toString+" : dona_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : dona_plac_clsf is "+dona_plac_clsf );
}
String dona_yymm = req.getParameter("dona_yymm");
if( dona_yymm == null){
	System.out.println(this.toString+" : dona_yymm is null" );
}else{
	System.out.println(this.toString+" : dona_yymm is "+dona_yymm );
}
String dona_ptcr_noit = req.getParameter("dona_ptcr_noit");
if( dona_ptcr_noit == null){
	System.out.println(this.toString+" : dona_ptcr_noit is null" );
}else{
	System.out.println(this.toString+" : dona_ptcr_noit is "+dona_ptcr_noit );
}
String dona_ptcr_amt = req.getParameter("dona_ptcr_amt");
if( dona_ptcr_amt == null){
	System.out.println(this.toString+" : dona_ptcr_amt is null" );
}else{
	System.out.println(this.toString+" : dona_ptcr_amt is "+dona_ptcr_amt );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String rshp = req.getParameter("rshp");
if( rshp == null){
	System.out.println(this.toString+" : rshp is null" );
}else{
	System.out.println(this.toString+" : rshp is "+rshp );
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
String corr_txn_prd_dduc_amt = req.getParameter("corr_txn_prd_dduc_amt");
if( corr_txn_prd_dduc_amt == null){
	System.out.println(this.toString+" : corr_txn_prd_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : corr_txn_prd_dduc_amt is "+corr_txn_prd_dduc_amt );
}
String cyov_amt = req.getParameter("cyov_amt");
if( cyov_amt == null){
	System.out.println(this.toString+" : cyov_amt is null" );
}else{
	System.out.println(this.toString+" : cyov_amt is "+cyov_amt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String lastyear_cyov_amt = req.getParameter("lastyear_cyov_amt");
if( lastyear_cyov_amt == null){
	System.out.println(this.toString+" : lastyear_cyov_amt is null" );
}else{
	System.out.println(this.toString+" : lastyear_cyov_amt is "+lastyear_cyov_amt );
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
String ern = Util.checkString(req.getParameter("ern"));
String firmnm = Util.checkString(req.getParameter("firmnm"));
String dona_plac_clsf = Util.checkString(req.getParameter("dona_plac_clsf"));
String dona_yymm = Util.checkString(req.getParameter("dona_yymm"));
String dona_ptcr_noit = Util.checkString(req.getParameter("dona_ptcr_noit"));
String dona_ptcr_amt = Util.checkString(req.getParameter("dona_ptcr_amt"));
String rmks = Util.checkString(req.getParameter("rmks"));
String rshp = Util.checkString(req.getParameter("rshp"));
String obj_pers_flnm = Util.checkString(req.getParameter("obj_pers_flnm"));
String prn = Util.checkString(req.getParameter("prn"));
String corr_txn_prd_dduc_amt = Util.checkString(req.getParameter("corr_txn_prd_dduc_amt"));
String cyov_amt = Util.checkString(req.getParameter("cyov_amt"));
String seq = Util.checkString(req.getParameter("seq"));
String lastyear_cyov_amt = Util.checkString(req.getParameter("lastyear_cyov_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String firmnm = Util.Uni2Ksc(Util.checkString(req.getParameter("firmnm")));
String dona_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dona_plac_clsf")));
String dona_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("dona_yymm")));
String dona_ptcr_noit = Util.Uni2Ksc(Util.checkString(req.getParameter("dona_ptcr_noit")));
String dona_ptcr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dona_ptcr_amt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String rshp = Util.Uni2Ksc(Util.checkString(req.getParameter("rshp")));
String obj_pers_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_pers_flnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String corr_txn_prd_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("corr_txn_prd_dduc_amt")));
String cyov_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cyov_amt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String lastyear_cyov_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("lastyear_cyov_amt")));
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
dm.setErn(ern);
dm.setFirmnm(firmnm);
dm.setDona_plac_clsf(dona_plac_clsf);
dm.setDona_yymm(dona_yymm);
dm.setDona_ptcr_noit(dona_ptcr_noit);
dm.setDona_ptcr_amt(dona_ptcr_amt);
dm.setRmks(rmks);
dm.setRshp(rshp);
dm.setObj_pers_flnm(obj_pers_flnm);
dm.setPrn(prn);
dm.setCorr_txn_prd_dduc_amt(corr_txn_prd_dduc_amt);
dm.setCyov_amt(cyov_amt);
dm.setSeq(seq);
dm.setLastyear_cyov_amt(lastyear_cyov_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 09 18:36:36 KST 2013 */