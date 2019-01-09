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


package chosun.ciis.mt.etcimpt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcimpt.ds.*;
import chosun.ciis.mt.etcimpt.rec.*;

/**
 * 
 */


public class MT_ETCIMPT_1120_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String yy;
	public String seq;
	public String leas_clsf;
	public String case_nm;
	public String impt_resn;
	public String matr_ptcr;
	public String use_dept;
	public String offer_pric;
	public String offer_pric_curc_clsf;
	public String ship_pers;
	public String base_cost;
	public String impt_vexc_coms;
	public String impt_vexc_coms_vat;
	public String lcopen_coms;
	public String telx_fee;
	public String offer_offr_plac;
	public String impt_clsf;
	public String lcopen_dt;
	public String lcopen_bank;
	public String lcno;
	public String lcvdty_prd;
	public String crgo_insr_entr_dt;
	public String crgo_insr_cntr_cmpy;
	public String crgo_insr_fee;
	public String ship_widr;
	public String ship_dt;
	public String ewh_dt;
	public String ewh_amt;
	public String last_entr_dt;
	public String impt_vexc_cmpy;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String mode;
	public String medi_cd;
	public String rela_yn;

	public MT_ETCIMPT_1120_ADM(){}
	public MT_ETCIMPT_1120_ADM(String gubun, String cmpy_cd, String yy, String seq, String leas_clsf, String case_nm, String impt_resn, String matr_ptcr, String use_dept, String offer_pric, String offer_pric_curc_clsf, String ship_pers, String base_cost, String impt_vexc_coms, String impt_vexc_coms_vat, String lcopen_coms, String telx_fee, String offer_offr_plac, String impt_clsf, String lcopen_dt, String lcopen_bank, String lcno, String lcvdty_prd, String crgo_insr_entr_dt, String crgo_insr_cntr_cmpy, String crgo_insr_fee, String ship_widr, String ship_dt, String ewh_dt, String ewh_amt, String last_entr_dt, String impt_vexc_cmpy, String remk, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String mode, String medi_cd, String rela_yn){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.yy = yy;
		this.seq = seq;
		this.leas_clsf = leas_clsf;
		this.case_nm = case_nm;
		this.impt_resn = impt_resn;
		this.matr_ptcr = matr_ptcr;
		this.use_dept = use_dept;
		this.offer_pric = offer_pric;
		this.offer_pric_curc_clsf = offer_pric_curc_clsf;
		this.ship_pers = ship_pers;
		this.base_cost = base_cost;
		this.impt_vexc_coms = impt_vexc_coms;
		this.impt_vexc_coms_vat = impt_vexc_coms_vat;
		this.lcopen_coms = lcopen_coms;
		this.telx_fee = telx_fee;
		this.offer_offr_plac = offer_offr_plac;
		this.impt_clsf = impt_clsf;
		this.lcopen_dt = lcopen_dt;
		this.lcopen_bank = lcopen_bank;
		this.lcno = lcno;
		this.lcvdty_prd = lcvdty_prd;
		this.crgo_insr_entr_dt = crgo_insr_entr_dt;
		this.crgo_insr_cntr_cmpy = crgo_insr_cntr_cmpy;
		this.crgo_insr_fee = crgo_insr_fee;
		this.ship_widr = ship_widr;
		this.ship_dt = ship_dt;
		this.ewh_dt = ewh_dt;
		this.ewh_amt = ewh_amt;
		this.last_entr_dt = last_entr_dt;
		this.impt_vexc_cmpy = impt_vexc_cmpy;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.mode = mode;
		this.medi_cd = medi_cd;
		this.rela_yn = rela_yn;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setLeas_clsf(String leas_clsf){
		this.leas_clsf = leas_clsf;
	}

	public void setCase_nm(String case_nm){
		this.case_nm = case_nm;
	}

	public void setImpt_resn(String impt_resn){
		this.impt_resn = impt_resn;
	}

	public void setMatr_ptcr(String matr_ptcr){
		this.matr_ptcr = matr_ptcr;
	}

	public void setUse_dept(String use_dept){
		this.use_dept = use_dept;
	}

	public void setOffer_pric(String offer_pric){
		this.offer_pric = offer_pric;
	}

	public void setOffer_pric_curc_clsf(String offer_pric_curc_clsf){
		this.offer_pric_curc_clsf = offer_pric_curc_clsf;
	}

	public void setShip_pers(String ship_pers){
		this.ship_pers = ship_pers;
	}

	public void setBase_cost(String base_cost){
		this.base_cost = base_cost;
	}

	public void setImpt_vexc_coms(String impt_vexc_coms){
		this.impt_vexc_coms = impt_vexc_coms;
	}

	public void setImpt_vexc_coms_vat(String impt_vexc_coms_vat){
		this.impt_vexc_coms_vat = impt_vexc_coms_vat;
	}

	public void setLcopen_coms(String lcopen_coms){
		this.lcopen_coms = lcopen_coms;
	}

	public void setTelx_fee(String telx_fee){
		this.telx_fee = telx_fee;
	}

	public void setOffer_offr_plac(String offer_offr_plac){
		this.offer_offr_plac = offer_offr_plac;
	}

	public void setImpt_clsf(String impt_clsf){
		this.impt_clsf = impt_clsf;
	}

	public void setLcopen_dt(String lcopen_dt){
		this.lcopen_dt = lcopen_dt;
	}

	public void setLcopen_bank(String lcopen_bank){
		this.lcopen_bank = lcopen_bank;
	}

	public void setLcno(String lcno){
		this.lcno = lcno;
	}

	public void setLcvdty_prd(String lcvdty_prd){
		this.lcvdty_prd = lcvdty_prd;
	}

	public void setCrgo_insr_entr_dt(String crgo_insr_entr_dt){
		this.crgo_insr_entr_dt = crgo_insr_entr_dt;
	}

	public void setCrgo_insr_cntr_cmpy(String crgo_insr_cntr_cmpy){
		this.crgo_insr_cntr_cmpy = crgo_insr_cntr_cmpy;
	}

	public void setCrgo_insr_fee(String crgo_insr_fee){
		this.crgo_insr_fee = crgo_insr_fee;
	}

	public void setShip_widr(String ship_widr){
		this.ship_widr = ship_widr;
	}

	public void setShip_dt(String ship_dt){
		this.ship_dt = ship_dt;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public void setLast_entr_dt(String last_entr_dt){
		this.last_entr_dt = last_entr_dt;
	}

	public void setImpt_vexc_cmpy(String impt_vexc_cmpy){
		this.impt_vexc_cmpy = impt_vexc_cmpy;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRela_yn(String rela_yn){
		this.rela_yn = rela_yn;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYy(){
		return this.yy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getLeas_clsf(){
		return this.leas_clsf;
	}

	public String getCase_nm(){
		return this.case_nm;
	}

	public String getImpt_resn(){
		return this.impt_resn;
	}

	public String getMatr_ptcr(){
		return this.matr_ptcr;
	}

	public String getUse_dept(){
		return this.use_dept;
	}

	public String getOffer_pric(){
		return this.offer_pric;
	}

	public String getOffer_pric_curc_clsf(){
		return this.offer_pric_curc_clsf;
	}

	public String getShip_pers(){
		return this.ship_pers;
	}

	public String getBase_cost(){
		return this.base_cost;
	}

	public String getImpt_vexc_coms(){
		return this.impt_vexc_coms;
	}

	public String getImpt_vexc_coms_vat(){
		return this.impt_vexc_coms_vat;
	}

	public String getLcopen_coms(){
		return this.lcopen_coms;
	}

	public String getTelx_fee(){
		return this.telx_fee;
	}

	public String getOffer_offr_plac(){
		return this.offer_offr_plac;
	}

	public String getImpt_clsf(){
		return this.impt_clsf;
	}

	public String getLcopen_dt(){
		return this.lcopen_dt;
	}

	public String getLcopen_bank(){
		return this.lcopen_bank;
	}

	public String getLcno(){
		return this.lcno;
	}

	public String getLcvdty_prd(){
		return this.lcvdty_prd;
	}

	public String getCrgo_insr_entr_dt(){
		return this.crgo_insr_entr_dt;
	}

	public String getCrgo_insr_cntr_cmpy(){
		return this.crgo_insr_cntr_cmpy;
	}

	public String getCrgo_insr_fee(){
		return this.crgo_insr_fee;
	}

	public String getShip_widr(){
		return this.ship_widr;
	}

	public String getShip_dt(){
		return this.ship_dt;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}

	public String getLast_entr_dt(){
		return this.last_entr_dt;
	}

	public String getImpt_vexc_cmpy(){
		return this.impt_vexc_cmpy;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRela_yn(){
		return this.rela_yn;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCIMPT_1120_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCIMPT_1120_ADM dm = (MT_ETCIMPT_1120_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.yy);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.leas_clsf);
		cstmt.setString(8, dm.case_nm);
		cstmt.setString(9, dm.impt_resn);
		cstmt.setString(10, dm.matr_ptcr);
		cstmt.setString(11, dm.use_dept);
		cstmt.setString(12, dm.offer_pric);
		cstmt.setString(13, dm.offer_pric_curc_clsf);
		cstmt.setString(14, dm.ship_pers);
		cstmt.setString(15, dm.base_cost);
		cstmt.setString(16, dm.impt_vexc_coms);
		cstmt.setString(17, dm.impt_vexc_coms_vat);
		cstmt.setString(18, dm.lcopen_coms);
		cstmt.setString(19, dm.telx_fee);
		cstmt.setString(20, dm.offer_offr_plac);
		cstmt.setString(21, dm.impt_clsf);
		cstmt.setString(22, dm.lcopen_dt);
		cstmt.setString(23, dm.lcopen_bank);
		cstmt.setString(24, dm.lcno);
		cstmt.setString(25, dm.lcvdty_prd);
		cstmt.setString(26, dm.crgo_insr_entr_dt);
		cstmt.setString(27, dm.crgo_insr_cntr_cmpy);
		cstmt.setString(28, dm.crgo_insr_fee);
		cstmt.setString(29, dm.ship_widr);
		cstmt.setString(30, dm.ship_dt);
		cstmt.setString(31, dm.ewh_dt);
		cstmt.setString(32, dm.ewh_amt);
		cstmt.setString(33, dm.last_entr_dt);
		cstmt.setString(34, dm.impt_vexc_cmpy);
		cstmt.setString(35, dm.remk);
		cstmt.setString(36, dm.incmg_pers_ipadd);
		cstmt.setString(37, dm.incmg_pers);
		cstmt.setString(38, dm.chg_pers);
		cstmt.setString(39, dm.mode);
		cstmt.setString(40, dm.medi_cd);
		cstmt.setString(41, dm.rela_yn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcimpt.ds.MT_ETCIMPT_1120_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yy = [" + getYy() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("leas_clsf = [" + getLeas_clsf() + "]");
		System.out.println("case_nm = [" + getCase_nm() + "]");
		System.out.println("impt_resn = [" + getImpt_resn() + "]");
		System.out.println("matr_ptcr = [" + getMatr_ptcr() + "]");
		System.out.println("use_dept = [" + getUse_dept() + "]");
		System.out.println("offer_pric = [" + getOffer_pric() + "]");
		System.out.println("offer_pric_curc_clsf = [" + getOffer_pric_curc_clsf() + "]");
		System.out.println("ship_pers = [" + getShip_pers() + "]");
		System.out.println("base_cost = [" + getBase_cost() + "]");
		System.out.println("impt_vexc_coms = [" + getImpt_vexc_coms() + "]");
		System.out.println("impt_vexc_coms_vat = [" + getImpt_vexc_coms_vat() + "]");
		System.out.println("lcopen_coms = [" + getLcopen_coms() + "]");
		System.out.println("telx_fee = [" + getTelx_fee() + "]");
		System.out.println("offer_offr_plac = [" + getOffer_offr_plac() + "]");
		System.out.println("impt_clsf = [" + getImpt_clsf() + "]");
		System.out.println("lcopen_dt = [" + getLcopen_dt() + "]");
		System.out.println("lcopen_bank = [" + getLcopen_bank() + "]");
		System.out.println("lcno = [" + getLcno() + "]");
		System.out.println("lcvdty_prd = [" + getLcvdty_prd() + "]");
		System.out.println("crgo_insr_entr_dt = [" + getCrgo_insr_entr_dt() + "]");
		System.out.println("crgo_insr_cntr_cmpy = [" + getCrgo_insr_cntr_cmpy() + "]");
		System.out.println("crgo_insr_fee = [" + getCrgo_insr_fee() + "]");
		System.out.println("ship_widr = [" + getShip_widr() + "]");
		System.out.println("ship_dt = [" + getShip_dt() + "]");
		System.out.println("ewh_dt = [" + getEwh_dt() + "]");
		System.out.println("ewh_amt = [" + getEwh_amt() + "]");
		System.out.println("last_entr_dt = [" + getLast_entr_dt() + "]");
		System.out.println("impt_vexc_cmpy = [" + getImpt_vexc_cmpy() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("rela_yn = [" + getRela_yn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String leas_clsf = req.getParameter("leas_clsf");
if( leas_clsf == null){
	System.out.println(this.toString+" : leas_clsf is null" );
}else{
	System.out.println(this.toString+" : leas_clsf is "+leas_clsf );
}
String case_nm = req.getParameter("case_nm");
if( case_nm == null){
	System.out.println(this.toString+" : case_nm is null" );
}else{
	System.out.println(this.toString+" : case_nm is "+case_nm );
}
String impt_resn = req.getParameter("impt_resn");
if( impt_resn == null){
	System.out.println(this.toString+" : impt_resn is null" );
}else{
	System.out.println(this.toString+" : impt_resn is "+impt_resn );
}
String matr_ptcr = req.getParameter("matr_ptcr");
if( matr_ptcr == null){
	System.out.println(this.toString+" : matr_ptcr is null" );
}else{
	System.out.println(this.toString+" : matr_ptcr is "+matr_ptcr );
}
String use_dept = req.getParameter("use_dept");
if( use_dept == null){
	System.out.println(this.toString+" : use_dept is null" );
}else{
	System.out.println(this.toString+" : use_dept is "+use_dept );
}
String offer_pric = req.getParameter("offer_pric");
if( offer_pric == null){
	System.out.println(this.toString+" : offer_pric is null" );
}else{
	System.out.println(this.toString+" : offer_pric is "+offer_pric );
}
String offer_pric_curc_clsf = req.getParameter("offer_pric_curc_clsf");
if( offer_pric_curc_clsf == null){
	System.out.println(this.toString+" : offer_pric_curc_clsf is null" );
}else{
	System.out.println(this.toString+" : offer_pric_curc_clsf is "+offer_pric_curc_clsf );
}
String ship_pers = req.getParameter("ship_pers");
if( ship_pers == null){
	System.out.println(this.toString+" : ship_pers is null" );
}else{
	System.out.println(this.toString+" : ship_pers is "+ship_pers );
}
String base_cost = req.getParameter("base_cost");
if( base_cost == null){
	System.out.println(this.toString+" : base_cost is null" );
}else{
	System.out.println(this.toString+" : base_cost is "+base_cost );
}
String impt_vexc_coms = req.getParameter("impt_vexc_coms");
if( impt_vexc_coms == null){
	System.out.println(this.toString+" : impt_vexc_coms is null" );
}else{
	System.out.println(this.toString+" : impt_vexc_coms is "+impt_vexc_coms );
}
String impt_vexc_coms_vat = req.getParameter("impt_vexc_coms_vat");
if( impt_vexc_coms_vat == null){
	System.out.println(this.toString+" : impt_vexc_coms_vat is null" );
}else{
	System.out.println(this.toString+" : impt_vexc_coms_vat is "+impt_vexc_coms_vat );
}
String lcopen_coms = req.getParameter("lcopen_coms");
if( lcopen_coms == null){
	System.out.println(this.toString+" : lcopen_coms is null" );
}else{
	System.out.println(this.toString+" : lcopen_coms is "+lcopen_coms );
}
String telx_fee = req.getParameter("telx_fee");
if( telx_fee == null){
	System.out.println(this.toString+" : telx_fee is null" );
}else{
	System.out.println(this.toString+" : telx_fee is "+telx_fee );
}
String offer_offr_plac = req.getParameter("offer_offr_plac");
if( offer_offr_plac == null){
	System.out.println(this.toString+" : offer_offr_plac is null" );
}else{
	System.out.println(this.toString+" : offer_offr_plac is "+offer_offr_plac );
}
String impt_clsf = req.getParameter("impt_clsf");
if( impt_clsf == null){
	System.out.println(this.toString+" : impt_clsf is null" );
}else{
	System.out.println(this.toString+" : impt_clsf is "+impt_clsf );
}
String lcopen_dt = req.getParameter("lcopen_dt");
if( lcopen_dt == null){
	System.out.println(this.toString+" : lcopen_dt is null" );
}else{
	System.out.println(this.toString+" : lcopen_dt is "+lcopen_dt );
}
String lcopen_bank = req.getParameter("lcopen_bank");
if( lcopen_bank == null){
	System.out.println(this.toString+" : lcopen_bank is null" );
}else{
	System.out.println(this.toString+" : lcopen_bank is "+lcopen_bank );
}
String lcno = req.getParameter("lcno");
if( lcno == null){
	System.out.println(this.toString+" : lcno is null" );
}else{
	System.out.println(this.toString+" : lcno is "+lcno );
}
String lcvdty_prd = req.getParameter("lcvdty_prd");
if( lcvdty_prd == null){
	System.out.println(this.toString+" : lcvdty_prd is null" );
}else{
	System.out.println(this.toString+" : lcvdty_prd is "+lcvdty_prd );
}
String crgo_insr_entr_dt = req.getParameter("crgo_insr_entr_dt");
if( crgo_insr_entr_dt == null){
	System.out.println(this.toString+" : crgo_insr_entr_dt is null" );
}else{
	System.out.println(this.toString+" : crgo_insr_entr_dt is "+crgo_insr_entr_dt );
}
String crgo_insr_cntr_cmpy = req.getParameter("crgo_insr_cntr_cmpy");
if( crgo_insr_cntr_cmpy == null){
	System.out.println(this.toString+" : crgo_insr_cntr_cmpy is null" );
}else{
	System.out.println(this.toString+" : crgo_insr_cntr_cmpy is "+crgo_insr_cntr_cmpy );
}
String crgo_insr_fee = req.getParameter("crgo_insr_fee");
if( crgo_insr_fee == null){
	System.out.println(this.toString+" : crgo_insr_fee is null" );
}else{
	System.out.println(this.toString+" : crgo_insr_fee is "+crgo_insr_fee );
}
String ship_widr = req.getParameter("ship_widr");
if( ship_widr == null){
	System.out.println(this.toString+" : ship_widr is null" );
}else{
	System.out.println(this.toString+" : ship_widr is "+ship_widr );
}
String ship_dt = req.getParameter("ship_dt");
if( ship_dt == null){
	System.out.println(this.toString+" : ship_dt is null" );
}else{
	System.out.println(this.toString+" : ship_dt is "+ship_dt );
}
String ewh_dt = req.getParameter("ewh_dt");
if( ewh_dt == null){
	System.out.println(this.toString+" : ewh_dt is null" );
}else{
	System.out.println(this.toString+" : ewh_dt is "+ewh_dt );
}
String ewh_amt = req.getParameter("ewh_amt");
if( ewh_amt == null){
	System.out.println(this.toString+" : ewh_amt is null" );
}else{
	System.out.println(this.toString+" : ewh_amt is "+ewh_amt );
}
String last_entr_dt = req.getParameter("last_entr_dt");
if( last_entr_dt == null){
	System.out.println(this.toString+" : last_entr_dt is null" );
}else{
	System.out.println(this.toString+" : last_entr_dt is "+last_entr_dt );
}
String impt_vexc_cmpy = req.getParameter("impt_vexc_cmpy");
if( impt_vexc_cmpy == null){
	System.out.println(this.toString+" : impt_vexc_cmpy is null" );
}else{
	System.out.println(this.toString+" : impt_vexc_cmpy is "+impt_vexc_cmpy );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String rela_yn = req.getParameter("rela_yn");
if( rela_yn == null){
	System.out.println(this.toString+" : rela_yn is null" );
}else{
	System.out.println(this.toString+" : rela_yn is "+rela_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yy = Util.checkString(req.getParameter("yy"));
String seq = Util.checkString(req.getParameter("seq"));
String leas_clsf = Util.checkString(req.getParameter("leas_clsf"));
String case_nm = Util.checkString(req.getParameter("case_nm"));
String impt_resn = Util.checkString(req.getParameter("impt_resn"));
String matr_ptcr = Util.checkString(req.getParameter("matr_ptcr"));
String use_dept = Util.checkString(req.getParameter("use_dept"));
String offer_pric = Util.checkString(req.getParameter("offer_pric"));
String offer_pric_curc_clsf = Util.checkString(req.getParameter("offer_pric_curc_clsf"));
String ship_pers = Util.checkString(req.getParameter("ship_pers"));
String base_cost = Util.checkString(req.getParameter("base_cost"));
String impt_vexc_coms = Util.checkString(req.getParameter("impt_vexc_coms"));
String impt_vexc_coms_vat = Util.checkString(req.getParameter("impt_vexc_coms_vat"));
String lcopen_coms = Util.checkString(req.getParameter("lcopen_coms"));
String telx_fee = Util.checkString(req.getParameter("telx_fee"));
String offer_offr_plac = Util.checkString(req.getParameter("offer_offr_plac"));
String impt_clsf = Util.checkString(req.getParameter("impt_clsf"));
String lcopen_dt = Util.checkString(req.getParameter("lcopen_dt"));
String lcopen_bank = Util.checkString(req.getParameter("lcopen_bank"));
String lcno = Util.checkString(req.getParameter("lcno"));
String lcvdty_prd = Util.checkString(req.getParameter("lcvdty_prd"));
String crgo_insr_entr_dt = Util.checkString(req.getParameter("crgo_insr_entr_dt"));
String crgo_insr_cntr_cmpy = Util.checkString(req.getParameter("crgo_insr_cntr_cmpy"));
String crgo_insr_fee = Util.checkString(req.getParameter("crgo_insr_fee"));
String ship_widr = Util.checkString(req.getParameter("ship_widr"));
String ship_dt = Util.checkString(req.getParameter("ship_dt"));
String ewh_dt = Util.checkString(req.getParameter("ewh_dt"));
String ewh_amt = Util.checkString(req.getParameter("ewh_amt"));
String last_entr_dt = Util.checkString(req.getParameter("last_entr_dt"));
String impt_vexc_cmpy = Util.checkString(req.getParameter("impt_vexc_cmpy"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String rela_yn = Util.checkString(req.getParameter("rela_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String leas_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_clsf")));
String case_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("case_nm")));
String impt_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_resn")));
String matr_ptcr = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_ptcr")));
String use_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept")));
String offer_pric = Util.Uni2Ksc(Util.checkString(req.getParameter("offer_pric")));
String offer_pric_curc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("offer_pric_curc_clsf")));
String ship_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("ship_pers")));
String base_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("base_cost")));
String impt_vexc_coms = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_vexc_coms")));
String impt_vexc_coms_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_vexc_coms_vat")));
String lcopen_coms = Util.Uni2Ksc(Util.checkString(req.getParameter("lcopen_coms")));
String telx_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("telx_fee")));
String offer_offr_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("offer_offr_plac")));
String impt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_clsf")));
String lcopen_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lcopen_dt")));
String lcopen_bank = Util.Uni2Ksc(Util.checkString(req.getParameter("lcopen_bank")));
String lcno = Util.Uni2Ksc(Util.checkString(req.getParameter("lcno")));
String lcvdty_prd = Util.Uni2Ksc(Util.checkString(req.getParameter("lcvdty_prd")));
String crgo_insr_entr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("crgo_insr_entr_dt")));
String crgo_insr_cntr_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("crgo_insr_cntr_cmpy")));
String crgo_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("crgo_insr_fee")));
String ship_widr = Util.Uni2Ksc(Util.checkString(req.getParameter("ship_widr")));
String ship_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ship_dt")));
String ewh_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt")));
String ewh_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_amt")));
String last_entr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_entr_dt")));
String impt_vexc_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_vexc_cmpy")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String rela_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rela_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setYy(yy);
dm.setSeq(seq);
dm.setLeas_clsf(leas_clsf);
dm.setCase_nm(case_nm);
dm.setImpt_resn(impt_resn);
dm.setMatr_ptcr(matr_ptcr);
dm.setUse_dept(use_dept);
dm.setOffer_pric(offer_pric);
dm.setOffer_pric_curc_clsf(offer_pric_curc_clsf);
dm.setShip_pers(ship_pers);
dm.setBase_cost(base_cost);
dm.setImpt_vexc_coms(impt_vexc_coms);
dm.setImpt_vexc_coms_vat(impt_vexc_coms_vat);
dm.setLcopen_coms(lcopen_coms);
dm.setTelx_fee(telx_fee);
dm.setOffer_offr_plac(offer_offr_plac);
dm.setImpt_clsf(impt_clsf);
dm.setLcopen_dt(lcopen_dt);
dm.setLcopen_bank(lcopen_bank);
dm.setLcno(lcno);
dm.setLcvdty_prd(lcvdty_prd);
dm.setCrgo_insr_entr_dt(crgo_insr_entr_dt);
dm.setCrgo_insr_cntr_cmpy(crgo_insr_cntr_cmpy);
dm.setCrgo_insr_fee(crgo_insr_fee);
dm.setShip_widr(ship_widr);
dm.setShip_dt(ship_dt);
dm.setEwh_dt(ewh_dt);
dm.setEwh_amt(ewh_amt);
dm.setLast_entr_dt(last_entr_dt);
dm.setImpt_vexc_cmpy(impt_vexc_cmpy);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setMode(mode);
dm.setMedi_cd(medi_cd);
dm.setRela_yn(rela_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 10:26:08 KST 2009 */