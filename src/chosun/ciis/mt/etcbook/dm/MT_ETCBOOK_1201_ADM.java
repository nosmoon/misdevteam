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


package chosun.ciis.mt.etcbook.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcbook.ds.*;
import chosun.ciis.mt.etcbook.rec.*;

/**
 * 
 */


public class MT_ETCBOOK_1201_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String clam_dt;
	public String dept_cd;
	public String book_cd;
	public String qty;
	public String curc_clsf;
	public String uprc_won;
	public String uprc_frex;
	public String frex_exrate;
	public String subs_frdt;
	public String sbend_dt;
	public String aplc_dt;
	public String extd_dt;
	public String dlvs_plac;
	public String dlvs_dt;
	public String canc_yn;
	public String canc_pers;
	public String buy_plac_clsf;
	public String item_clam_occr_dt;
	public String item_clam_seq;
	public String remk;
	public String istt_hdqt_yn;
	public String acpn_dt;
	public String incmg_pers_ipaddr;
	public String chg_pers;
	public String gubun;

	public MT_ETCBOOK_1201_ADM(){}
	public MT_ETCBOOK_1201_ADM(String cmpy_cd, String occr_dt, String seq, String clam_dt, String dept_cd, String book_cd, String qty, String curc_clsf, String uprc_won, String uprc_frex, String frex_exrate, String subs_frdt, String sbend_dt, String aplc_dt, String extd_dt, String dlvs_plac, String dlvs_dt, String canc_yn, String canc_pers, String buy_plac_clsf, String item_clam_occr_dt, String item_clam_seq, String remk, String istt_hdqt_yn, String acpn_dt, String incmg_pers_ipaddr, String chg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.clam_dt = clam_dt;
		this.dept_cd = dept_cd;
		this.book_cd = book_cd;
		this.qty = qty;
		this.curc_clsf = curc_clsf;
		this.uprc_won = uprc_won;
		this.uprc_frex = uprc_frex;
		this.frex_exrate = frex_exrate;
		this.subs_frdt = subs_frdt;
		this.sbend_dt = sbend_dt;
		this.aplc_dt = aplc_dt;
		this.extd_dt = extd_dt;
		this.dlvs_plac = dlvs_plac;
		this.dlvs_dt = dlvs_dt;
		this.canc_yn = canc_yn;
		this.canc_pers = canc_pers;
		this.buy_plac_clsf = buy_plac_clsf;
		this.item_clam_occr_dt = item_clam_occr_dt;
		this.item_clam_seq = item_clam_seq;
		this.remk = remk;
		this.istt_hdqt_yn = istt_hdqt_yn;
		this.acpn_dt = acpn_dt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.chg_pers = chg_pers;
		this.gubun = gubun;
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

	public void setClam_dt(String clam_dt){
		this.clam_dt = clam_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setBook_cd(String book_cd){
		this.book_cd = book_cd;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setCurc_clsf(String curc_clsf){
		this.curc_clsf = curc_clsf;
	}

	public void setUprc_won(String uprc_won){
		this.uprc_won = uprc_won;
	}

	public void setUprc_frex(String uprc_frex){
		this.uprc_frex = uprc_frex;
	}

	public void setFrex_exrate(String frex_exrate){
		this.frex_exrate = frex_exrate;
	}

	public void setSubs_frdt(String subs_frdt){
		this.subs_frdt = subs_frdt;
	}

	public void setSbend_dt(String sbend_dt){
		this.sbend_dt = sbend_dt;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setExtd_dt(String extd_dt){
		this.extd_dt = extd_dt;
	}

	public void setDlvs_plac(String dlvs_plac){
		this.dlvs_plac = dlvs_plac;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
	}

	public void setCanc_yn(String canc_yn){
		this.canc_yn = canc_yn;
	}

	public void setCanc_pers(String canc_pers){
		this.canc_pers = canc_pers;
	}

	public void setBuy_plac_clsf(String buy_plac_clsf){
		this.buy_plac_clsf = buy_plac_clsf;
	}

	public void setItem_clam_occr_dt(String item_clam_occr_dt){
		this.item_clam_occr_dt = item_clam_occr_dt;
	}

	public void setItem_clam_seq(String item_clam_seq){
		this.item_clam_seq = item_clam_seq;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIstt_hdqt_yn(String istt_hdqt_yn){
		this.istt_hdqt_yn = istt_hdqt_yn;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
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

	public String getClam_dt(){
		return this.clam_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getBook_cd(){
		return this.book_cd;
	}

	public String getQty(){
		return this.qty;
	}

	public String getCurc_clsf(){
		return this.curc_clsf;
	}

	public String getUprc_won(){
		return this.uprc_won;
	}

	public String getUprc_frex(){
		return this.uprc_frex;
	}

	public String getFrex_exrate(){
		return this.frex_exrate;
	}

	public String getSubs_frdt(){
		return this.subs_frdt;
	}

	public String getSbend_dt(){
		return this.sbend_dt;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getExtd_dt(){
		return this.extd_dt;
	}

	public String getDlvs_plac(){
		return this.dlvs_plac;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
	}

	public String getCanc_yn(){
		return this.canc_yn;
	}

	public String getCanc_pers(){
		return this.canc_pers;
	}

	public String getBuy_plac_clsf(){
		return this.buy_plac_clsf;
	}

	public String getItem_clam_occr_dt(){
		return this.item_clam_occr_dt;
	}

	public String getItem_clam_seq(){
		return this.item_clam_seq;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIstt_hdqt_yn(){
		return this.istt_hdqt_yn;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCBOOK_1201_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCBOOK_1201_ADM dm = (MT_ETCBOOK_1201_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.clam_dt);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.book_cd);
		cstmt.setString(9, dm.qty);
		cstmt.setString(10, dm.curc_clsf);
		cstmt.setString(11, dm.uprc_won);
		cstmt.setString(12, dm.uprc_frex);
		cstmt.setString(13, dm.frex_exrate);
		cstmt.setString(14, dm.subs_frdt);
		cstmt.setString(15, dm.sbend_dt);
		cstmt.setString(16, dm.aplc_dt);
		cstmt.setString(17, dm.extd_dt);
		cstmt.setString(18, dm.dlvs_plac);
		cstmt.setString(19, dm.dlvs_dt);
		cstmt.setString(20, dm.canc_yn);
		cstmt.setString(21, dm.canc_pers);
		cstmt.setString(22, dm.buy_plac_clsf);
		cstmt.setString(23, dm.item_clam_occr_dt);
		cstmt.setString(24, dm.item_clam_seq);
		cstmt.setString(25, dm.remk);
		cstmt.setString(26, dm.istt_hdqt_yn);
		cstmt.setString(27, dm.acpn_dt);
		cstmt.setString(28, dm.incmg_pers_ipaddr);
		cstmt.setString(29, dm.chg_pers);
		cstmt.setString(30, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcbook.ds.MT_ETCBOOK_1201_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("clam_dt = [" + getClam_dt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("book_cd = [" + getBook_cd() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("curc_clsf = [" + getCurc_clsf() + "]");
		System.out.println("uprc_won = [" + getUprc_won() + "]");
		System.out.println("uprc_frex = [" + getUprc_frex() + "]");
		System.out.println("frex_exrate = [" + getFrex_exrate() + "]");
		System.out.println("subs_frdt = [" + getSubs_frdt() + "]");
		System.out.println("sbend_dt = [" + getSbend_dt() + "]");
		System.out.println("aplc_dt = [" + getAplc_dt() + "]");
		System.out.println("extd_dt = [" + getExtd_dt() + "]");
		System.out.println("dlvs_plac = [" + getDlvs_plac() + "]");
		System.out.println("dlvs_dt = [" + getDlvs_dt() + "]");
		System.out.println("canc_yn = [" + getCanc_yn() + "]");
		System.out.println("canc_pers = [" + getCanc_pers() + "]");
		System.out.println("buy_plac_clsf = [" + getBuy_plac_clsf() + "]");
		System.out.println("item_clam_occr_dt = [" + getItem_clam_occr_dt() + "]");
		System.out.println("item_clam_seq = [" + getItem_clam_seq() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("istt_hdqt_yn = [" + getIstt_hdqt_yn() + "]");
		System.out.println("acpn_dt = [" + getAcpn_dt() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String clam_dt = req.getParameter("clam_dt");
if( clam_dt == null){
	System.out.println(this.toString+" : clam_dt is null" );
}else{
	System.out.println(this.toString+" : clam_dt is "+clam_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String book_cd = req.getParameter("book_cd");
if( book_cd == null){
	System.out.println(this.toString+" : book_cd is null" );
}else{
	System.out.println(this.toString+" : book_cd is "+book_cd );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String curc_clsf = req.getParameter("curc_clsf");
if( curc_clsf == null){
	System.out.println(this.toString+" : curc_clsf is null" );
}else{
	System.out.println(this.toString+" : curc_clsf is "+curc_clsf );
}
String uprc_won = req.getParameter("uprc_won");
if( uprc_won == null){
	System.out.println(this.toString+" : uprc_won is null" );
}else{
	System.out.println(this.toString+" : uprc_won is "+uprc_won );
}
String uprc_frex = req.getParameter("uprc_frex");
if( uprc_frex == null){
	System.out.println(this.toString+" : uprc_frex is null" );
}else{
	System.out.println(this.toString+" : uprc_frex is "+uprc_frex );
}
String frex_exrate = req.getParameter("frex_exrate");
if( frex_exrate == null){
	System.out.println(this.toString+" : frex_exrate is null" );
}else{
	System.out.println(this.toString+" : frex_exrate is "+frex_exrate );
}
String subs_frdt = req.getParameter("subs_frdt");
if( subs_frdt == null){
	System.out.println(this.toString+" : subs_frdt is null" );
}else{
	System.out.println(this.toString+" : subs_frdt is "+subs_frdt );
}
String sbend_dt = req.getParameter("sbend_dt");
if( sbend_dt == null){
	System.out.println(this.toString+" : sbend_dt is null" );
}else{
	System.out.println(this.toString+" : sbend_dt is "+sbend_dt );
}
String aplc_dt = req.getParameter("aplc_dt");
if( aplc_dt == null){
	System.out.println(this.toString+" : aplc_dt is null" );
}else{
	System.out.println(this.toString+" : aplc_dt is "+aplc_dt );
}
String extd_dt = req.getParameter("extd_dt");
if( extd_dt == null){
	System.out.println(this.toString+" : extd_dt is null" );
}else{
	System.out.println(this.toString+" : extd_dt is "+extd_dt );
}
String dlvs_plac = req.getParameter("dlvs_plac");
if( dlvs_plac == null){
	System.out.println(this.toString+" : dlvs_plac is null" );
}else{
	System.out.println(this.toString+" : dlvs_plac is "+dlvs_plac );
}
String dlvs_dt = req.getParameter("dlvs_dt");
if( dlvs_dt == null){
	System.out.println(this.toString+" : dlvs_dt is null" );
}else{
	System.out.println(this.toString+" : dlvs_dt is "+dlvs_dt );
}
String canc_yn = req.getParameter("canc_yn");
if( canc_yn == null){
	System.out.println(this.toString+" : canc_yn is null" );
}else{
	System.out.println(this.toString+" : canc_yn is "+canc_yn );
}
String canc_pers = req.getParameter("canc_pers");
if( canc_pers == null){
	System.out.println(this.toString+" : canc_pers is null" );
}else{
	System.out.println(this.toString+" : canc_pers is "+canc_pers );
}
String buy_plac_clsf = req.getParameter("buy_plac_clsf");
if( buy_plac_clsf == null){
	System.out.println(this.toString+" : buy_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : buy_plac_clsf is "+buy_plac_clsf );
}
String item_clam_occr_dt = req.getParameter("item_clam_occr_dt");
if( item_clam_occr_dt == null){
	System.out.println(this.toString+" : item_clam_occr_dt is null" );
}else{
	System.out.println(this.toString+" : item_clam_occr_dt is "+item_clam_occr_dt );
}
String item_clam_seq = req.getParameter("item_clam_seq");
if( item_clam_seq == null){
	System.out.println(this.toString+" : item_clam_seq is null" );
}else{
	System.out.println(this.toString+" : item_clam_seq is "+item_clam_seq );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String istt_hdqt_yn = req.getParameter("istt_hdqt_yn");
if( istt_hdqt_yn == null){
	System.out.println(this.toString+" : istt_hdqt_yn is null" );
}else{
	System.out.println(this.toString+" : istt_hdqt_yn is "+istt_hdqt_yn );
}
String acpn_dt = req.getParameter("acpn_dt");
if( acpn_dt == null){
	System.out.println(this.toString+" : acpn_dt is null" );
}else{
	System.out.println(this.toString+" : acpn_dt is "+acpn_dt );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String clam_dt = Util.checkString(req.getParameter("clam_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String book_cd = Util.checkString(req.getParameter("book_cd"));
String qty = Util.checkString(req.getParameter("qty"));
String curc_clsf = Util.checkString(req.getParameter("curc_clsf"));
String uprc_won = Util.checkString(req.getParameter("uprc_won"));
String uprc_frex = Util.checkString(req.getParameter("uprc_frex"));
String frex_exrate = Util.checkString(req.getParameter("frex_exrate"));
String subs_frdt = Util.checkString(req.getParameter("subs_frdt"));
String sbend_dt = Util.checkString(req.getParameter("sbend_dt"));
String aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
String extd_dt = Util.checkString(req.getParameter("extd_dt"));
String dlvs_plac = Util.checkString(req.getParameter("dlvs_plac"));
String dlvs_dt = Util.checkString(req.getParameter("dlvs_dt"));
String canc_yn = Util.checkString(req.getParameter("canc_yn"));
String canc_pers = Util.checkString(req.getParameter("canc_pers"));
String buy_plac_clsf = Util.checkString(req.getParameter("buy_plac_clsf"));
String item_clam_occr_dt = Util.checkString(req.getParameter("item_clam_occr_dt"));
String item_clam_seq = Util.checkString(req.getParameter("item_clam_seq"));
String remk = Util.checkString(req.getParameter("remk"));
String istt_hdqt_yn = Util.checkString(req.getParameter("istt_hdqt_yn"));
String acpn_dt = Util.checkString(req.getParameter("acpn_dt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String clam_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String book_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("book_cd")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String curc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("curc_clsf")));
String uprc_won = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_won")));
String uprc_frex = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_frex")));
String frex_exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_exrate")));
String subs_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("subs_frdt")));
String sbend_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("sbend_dt")));
String aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_dt")));
String extd_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("extd_dt")));
String dlvs_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_plac")));
String dlvs_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_dt")));
String canc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("canc_yn")));
String canc_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("canc_pers")));
String buy_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_plac_clsf")));
String item_clam_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("item_clam_occr_dt")));
String item_clam_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("item_clam_seq")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String istt_hdqt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("istt_hdqt_yn")));
String acpn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_dt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setClam_dt(clam_dt);
dm.setDept_cd(dept_cd);
dm.setBook_cd(book_cd);
dm.setQty(qty);
dm.setCurc_clsf(curc_clsf);
dm.setUprc_won(uprc_won);
dm.setUprc_frex(uprc_frex);
dm.setFrex_exrate(frex_exrate);
dm.setSubs_frdt(subs_frdt);
dm.setSbend_dt(sbend_dt);
dm.setAplc_dt(aplc_dt);
dm.setExtd_dt(extd_dt);
dm.setDlvs_plac(dlvs_plac);
dm.setDlvs_dt(dlvs_dt);
dm.setCanc_yn(canc_yn);
dm.setCanc_pers(canc_pers);
dm.setBuy_plac_clsf(buy_plac_clsf);
dm.setItem_clam_occr_dt(item_clam_occr_dt);
dm.setItem_clam_seq(item_clam_seq);
dm.setRemk(remk);
dm.setIstt_hdqt_yn(istt_hdqt_yn);
dm.setAcpn_dt(acpn_dt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setChg_pers(chg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 19:11:44 KST 2009 */