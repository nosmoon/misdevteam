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


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_3206_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String ordr_dt;
	public String ordr_per;
	public String ordr_per_email;
	public String dlco_no;
	public String dlvs_dt;
	public String dlvs_fac_cd;
	public String dlvs_chrg_pers;
	public String chrg_pers_cntc_plac;
	public String chrg_pers_email;
	public String amt_pay_mthd;
	public String remk;
	public String per_ip_addr;
	public String per_id;
	public String gubun;
	public String matr_cd;
	public String unit;
	public String std_modl;
	public String matr_nm;
	public String ordr_qunt;
	public String ordr_uprc;
	public String ordr_amt;
	public String remk_ar;
	public String sub_seq;
	public String ordr_req_dd;

	public MT_SUBMATROUT_3206_ADM(){}
	public MT_SUBMATROUT_3206_ADM(String cmpy_cd, String occr_dt, String seq, String ordr_dt, String ordr_per, String ordr_per_email, String dlco_no, String dlvs_dt, String dlvs_fac_cd, String dlvs_chrg_pers, String chrg_pers_cntc_plac, String chrg_pers_email, String amt_pay_mthd, String remk, String per_ip_addr, String per_id, String gubun, String matr_cd, String unit, String std_modl, String matr_nm, String ordr_qunt, String ordr_uprc, String ordr_amt, String remk_ar, String sub_seq, String ordr_req_dd){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.ordr_dt = ordr_dt;
		this.ordr_per = ordr_per;
		this.ordr_per_email = ordr_per_email;
		this.dlco_no = dlco_no;
		this.dlvs_dt = dlvs_dt;
		this.dlvs_fac_cd = dlvs_fac_cd;
		this.dlvs_chrg_pers = dlvs_chrg_pers;
		this.chrg_pers_cntc_plac = chrg_pers_cntc_plac;
		this.chrg_pers_email = chrg_pers_email;
		this.amt_pay_mthd = amt_pay_mthd;
		this.remk = remk;
		this.per_ip_addr = per_ip_addr;
		this.per_id = per_id;
		this.gubun = gubun;
		this.matr_cd = matr_cd;
		this.unit = unit;
		this.std_modl = std_modl;
		this.matr_nm = matr_nm;
		this.ordr_qunt = ordr_qunt;
		this.ordr_uprc = ordr_uprc;
		this.ordr_amt = ordr_amt;
		this.remk_ar = remk_ar;
		this.sub_seq = sub_seq;
		this.ordr_req_dd = ordr_req_dd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setOrdr_per(String ordr_per){
		this.ordr_per = ordr_per;
	}

	public void setOrdr_per_email(String ordr_per_email){
		this.ordr_per_email = ordr_per_email;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
	}

	public void setDlvs_fac_cd(String dlvs_fac_cd){
		this.dlvs_fac_cd = dlvs_fac_cd;
	}

	public void setDlvs_chrg_pers(String dlvs_chrg_pers){
		this.dlvs_chrg_pers = dlvs_chrg_pers;
	}

	public void setChrg_pers_cntc_plac(String chrg_pers_cntc_plac){
		this.chrg_pers_cntc_plac = chrg_pers_cntc_plac;
	}

	public void setChrg_pers_email(String chrg_pers_email){
		this.chrg_pers_email = chrg_pers_email;
	}

	public void setAmt_pay_mthd(String amt_pay_mthd){
		this.amt_pay_mthd = amt_pay_mthd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPer_ip_addr(String per_ip_addr){
		this.per_ip_addr = per_ip_addr;
	}

	public void setPer_id(String per_id){
		this.per_id = per_id;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setOrdr_qunt(String ordr_qunt){
		this.ordr_qunt = ordr_qunt;
	}

	public void setOrdr_uprc(String ordr_uprc){
		this.ordr_uprc = ordr_uprc;
	}

	public void setOrdr_amt(String ordr_amt){
		this.ordr_amt = ordr_amt;
	}

	public void setRemk_ar(String remk_ar){
		this.remk_ar = remk_ar;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setOrdr_req_dd(String ordr_req_dd){
		this.ordr_req_dd = ordr_req_dd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getOrdr_per(){
		return this.ordr_per;
	}

	public String getOrdr_per_email(){
		return this.ordr_per_email;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
	}

	public String getDlvs_fac_cd(){
		return this.dlvs_fac_cd;
	}

	public String getDlvs_chrg_pers(){
		return this.dlvs_chrg_pers;
	}

	public String getChrg_pers_cntc_plac(){
		return this.chrg_pers_cntc_plac;
	}

	public String getChrg_pers_email(){
		return this.chrg_pers_email;
	}

	public String getAmt_pay_mthd(){
		return this.amt_pay_mthd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPer_ip_addr(){
		return this.per_ip_addr;
	}

	public String getPer_id(){
		return this.per_id;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getOrdr_qunt(){
		return this.ordr_qunt;
	}

	public String getOrdr_uprc(){
		return this.ordr_uprc;
	}

	public String getOrdr_amt(){
		return this.ordr_amt;
	}

	public String getRemk_ar(){
		return this.remk_ar;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getOrdr_req_dd(){
		return this.ordr_req_dd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_3206_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_3206_ADM dm = (MT_SUBMATROUT_3206_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.ordr_dt);
		cstmt.setString(7, dm.ordr_per);
		cstmt.setString(8, dm.ordr_per_email);
		cstmt.setString(9, dm.dlco_no);
		cstmt.setString(10, dm.dlvs_dt);
		cstmt.setString(11, dm.dlvs_fac_cd);
		cstmt.setString(12, dm.dlvs_chrg_pers);
		cstmt.setString(13, dm.chrg_pers_cntc_plac);
		cstmt.setString(14, dm.chrg_pers_email);
		cstmt.setString(15, dm.amt_pay_mthd);
		cstmt.setString(16, dm.remk);
		cstmt.setString(17, dm.per_ip_addr);
		cstmt.setString(18, dm.per_id);
		cstmt.setString(19, dm.gubun);
		cstmt.setString(20, dm.matr_cd);
		cstmt.setString(21, dm.unit);
		cstmt.setString(22, dm.std_modl);
		cstmt.setString(23, dm.matr_nm);
		cstmt.setString(24, dm.ordr_qunt);
		cstmt.setString(25, dm.ordr_uprc);
		cstmt.setString(26, dm.ordr_amt);
		cstmt.setString(27, dm.remk_ar);
		cstmt.setString(28, dm.sub_seq);
		cstmt.setString(29, dm.ordr_req_dd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_3206_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("ordr_dt = [" + getOrdr_dt() + "]");
		System.out.println("ordr_per = [" + getOrdr_per() + "]");
		System.out.println("ordr_per_email = [" + getOrdr_per_email() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("dlvs_dt = [" + getDlvs_dt() + "]");
		System.out.println("dlvs_fac_cd = [" + getDlvs_fac_cd() + "]");
		System.out.println("dlvs_chrg_pers = [" + getDlvs_chrg_pers() + "]");
		System.out.println("chrg_pers_cntc_plac = [" + getChrg_pers_cntc_plac() + "]");
		System.out.println("chrg_pers_email = [" + getChrg_pers_email() + "]");
		System.out.println("amt_pay_mthd = [" + getAmt_pay_mthd() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("per_ip_addr = [" + getPer_ip_addr() + "]");
		System.out.println("per_id = [" + getPer_id() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("unit = [" + getUnit() + "]");
		System.out.println("std_modl = [" + getStd_modl() + "]");
		System.out.println("matr_nm = [" + getMatr_nm() + "]");
		System.out.println("ordr_qunt = [" + getOrdr_qunt() + "]");
		System.out.println("ordr_uprc = [" + getOrdr_uprc() + "]");
		System.out.println("ordr_amt = [" + getOrdr_amt() + "]");
		System.out.println("remk_ar = [" + getRemk_ar() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("ordr_req_dd = [" + getOrdr_req_dd() + "]");
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String ordr_dt = req.getParameter("ordr_dt");
if( ordr_dt == null){
	System.out.println(this.toString+" : ordr_dt is null" );
}else{
	System.out.println(this.toString+" : ordr_dt is "+ordr_dt );
}
String ordr_per = req.getParameter("ordr_per");
if( ordr_per == null){
	System.out.println(this.toString+" : ordr_per is null" );
}else{
	System.out.println(this.toString+" : ordr_per is "+ordr_per );
}
String ordr_per_email = req.getParameter("ordr_per_email");
if( ordr_per_email == null){
	System.out.println(this.toString+" : ordr_per_email is null" );
}else{
	System.out.println(this.toString+" : ordr_per_email is "+ordr_per_email );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String dlvs_dt = req.getParameter("dlvs_dt");
if( dlvs_dt == null){
	System.out.println(this.toString+" : dlvs_dt is null" );
}else{
	System.out.println(this.toString+" : dlvs_dt is "+dlvs_dt );
}
String dlvs_fac_cd = req.getParameter("dlvs_fac_cd");
if( dlvs_fac_cd == null){
	System.out.println(this.toString+" : dlvs_fac_cd is null" );
}else{
	System.out.println(this.toString+" : dlvs_fac_cd is "+dlvs_fac_cd );
}
String dlvs_chrg_pers = req.getParameter("dlvs_chrg_pers");
if( dlvs_chrg_pers == null){
	System.out.println(this.toString+" : dlvs_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : dlvs_chrg_pers is "+dlvs_chrg_pers );
}
String chrg_pers_cntc_plac = req.getParameter("chrg_pers_cntc_plac");
if( chrg_pers_cntc_plac == null){
	System.out.println(this.toString+" : chrg_pers_cntc_plac is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_cntc_plac is "+chrg_pers_cntc_plac );
}
String chrg_pers_email = req.getParameter("chrg_pers_email");
if( chrg_pers_email == null){
	System.out.println(this.toString+" : chrg_pers_email is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_email is "+chrg_pers_email );
}
String amt_pay_mthd = req.getParameter("amt_pay_mthd");
if( amt_pay_mthd == null){
	System.out.println(this.toString+" : amt_pay_mthd is null" );
}else{
	System.out.println(this.toString+" : amt_pay_mthd is "+amt_pay_mthd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String per_ip_addr = req.getParameter("per_ip_addr");
if( per_ip_addr == null){
	System.out.println(this.toString+" : per_ip_addr is null" );
}else{
	System.out.println(this.toString+" : per_ip_addr is "+per_ip_addr );
}
String per_id = req.getParameter("per_id");
if( per_id == null){
	System.out.println(this.toString+" : per_id is null" );
}else{
	System.out.println(this.toString+" : per_id is "+per_id );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String std_modl = req.getParameter("std_modl");
if( std_modl == null){
	System.out.println(this.toString+" : std_modl is null" );
}else{
	System.out.println(this.toString+" : std_modl is "+std_modl );
}
String matr_nm = req.getParameter("matr_nm");
if( matr_nm == null){
	System.out.println(this.toString+" : matr_nm is null" );
}else{
	System.out.println(this.toString+" : matr_nm is "+matr_nm );
}
String ordr_qunt = req.getParameter("ordr_qunt");
if( ordr_qunt == null){
	System.out.println(this.toString+" : ordr_qunt is null" );
}else{
	System.out.println(this.toString+" : ordr_qunt is "+ordr_qunt );
}
String ordr_uprc = req.getParameter("ordr_uprc");
if( ordr_uprc == null){
	System.out.println(this.toString+" : ordr_uprc is null" );
}else{
	System.out.println(this.toString+" : ordr_uprc is "+ordr_uprc );
}
String ordr_amt = req.getParameter("ordr_amt");
if( ordr_amt == null){
	System.out.println(this.toString+" : ordr_amt is null" );
}else{
	System.out.println(this.toString+" : ordr_amt is "+ordr_amt );
}
String remk_ar = req.getParameter("remk_ar");
if( remk_ar == null){
	System.out.println(this.toString+" : remk_ar is null" );
}else{
	System.out.println(this.toString+" : remk_ar is "+remk_ar );
}
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String ordr_req_dd = req.getParameter("ordr_req_dd");
if( ordr_req_dd == null){
	System.out.println(this.toString+" : ordr_req_dd is null" );
}else{
	System.out.println(this.toString+" : ordr_req_dd is "+ordr_req_dd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));
String ordr_per = Util.checkString(req.getParameter("ordr_per"));
String ordr_per_email = Util.checkString(req.getParameter("ordr_per_email"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String dlvs_dt = Util.checkString(req.getParameter("dlvs_dt"));
String dlvs_fac_cd = Util.checkString(req.getParameter("dlvs_fac_cd"));
String dlvs_chrg_pers = Util.checkString(req.getParameter("dlvs_chrg_pers"));
String chrg_pers_cntc_plac = Util.checkString(req.getParameter("chrg_pers_cntc_plac"));
String chrg_pers_email = Util.checkString(req.getParameter("chrg_pers_email"));
String amt_pay_mthd = Util.checkString(req.getParameter("amt_pay_mthd"));
String remk = Util.checkString(req.getParameter("remk"));
String per_ip_addr = Util.checkString(req.getParameter("per_ip_addr"));
String per_id = Util.checkString(req.getParameter("per_id"));
String gubun = Util.checkString(req.getParameter("gubun"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String unit = Util.checkString(req.getParameter("unit"));
String std_modl = Util.checkString(req.getParameter("std_modl"));
String matr_nm = Util.checkString(req.getParameter("matr_nm"));
String ordr_qunt = Util.checkString(req.getParameter("ordr_qunt"));
String ordr_uprc = Util.checkString(req.getParameter("ordr_uprc"));
String ordr_amt = Util.checkString(req.getParameter("ordr_amt"));
String remk_ar = Util.checkString(req.getParameter("remk_ar"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String ordr_req_dd = Util.checkString(req.getParameter("ordr_req_dd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String ordr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_dt")));
String ordr_per = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_per")));
String ordr_per_email = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_per_email")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String dlvs_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_dt")));
String dlvs_fac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_fac_cd")));
String dlvs_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_chrg_pers")));
String chrg_pers_cntc_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_cntc_plac")));
String chrg_pers_email = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_email")));
String amt_pay_mthd = Util.Uni2Ksc(Util.checkString(req.getParameter("amt_pay_mthd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String per_ip_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("per_ip_addr")));
String per_id = Util.Uni2Ksc(Util.checkString(req.getParameter("per_id")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String std_modl = Util.Uni2Ksc(Util.checkString(req.getParameter("std_modl")));
String matr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_nm")));
String ordr_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_qunt")));
String ordr_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_uprc")));
String ordr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_amt")));
String remk_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_ar")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String ordr_req_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_req_dd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setOrdr_dt(ordr_dt);
dm.setOrdr_per(ordr_per);
dm.setOrdr_per_email(ordr_per_email);
dm.setDlco_no(dlco_no);
dm.setDlvs_dt(dlvs_dt);
dm.setDlvs_fac_cd(dlvs_fac_cd);
dm.setDlvs_chrg_pers(dlvs_chrg_pers);
dm.setChrg_pers_cntc_plac(chrg_pers_cntc_plac);
dm.setChrg_pers_email(chrg_pers_email);
dm.setAmt_pay_mthd(amt_pay_mthd);
dm.setRemk(remk);
dm.setPer_ip_addr(per_ip_addr);
dm.setPer_id(per_id);
dm.setGubun(gubun);
dm.setMatr_cd(matr_cd);
dm.setUnit(unit);
dm.setStd_modl(std_modl);
dm.setMatr_nm(matr_nm);
dm.setOrdr_qunt(ordr_qunt);
dm.setOrdr_uprc(ordr_uprc);
dm.setOrdr_amt(ordr_amt);
dm.setRemk_ar(remk_ar);
dm.setSub_seq(sub_seq);
dm.setOrdr_req_dd(ordr_req_dd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 08 13:39:15 KST 2009 */