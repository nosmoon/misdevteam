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


package chosun.ciis.mt.prnpap.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.ds.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_2020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String gubun_s;
	public String cmpy_cd;
	public String endgbn_s;
	public String occr_dt;
	public String seq;
	public String prt_nm;
	public String prt_plan_dd_pers;
	public String prt_frdt;
	public String prt_todt;
	public String prt_tms;
	public String paper_std;
	public String issu_pcnt;
	public String clr_pcnt;
	public String bw_pcnt;
	public String prt_qty;
	public String prt_paper_clsf;
	public String qunt_out_yn;
	public String paper_gm;
	public String brk_rate;
	public String remk;
	public String real_paper_std;
	public String real_prt_paper_clsf;
	public String matr_clsf;
	public String unit;
	public String qunt;
	public String uprc;
	public String amt;
	public String real_matr_clsf;
	public String sub_seq;
	public String occr_dt_s;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public MT_PRNPAP_2020_ADM(){}
	public MT_PRNPAP_2020_ADM(String gubun, String gubun_s, String cmpy_cd, String endgbn_s, String occr_dt, String seq, String prt_nm, String prt_plan_dd_pers, String prt_frdt, String prt_todt, String prt_tms, String paper_std, String issu_pcnt, String clr_pcnt, String bw_pcnt, String prt_qty, String prt_paper_clsf, String qunt_out_yn, String paper_gm, String brk_rate, String remk, String real_paper_std, String real_prt_paper_clsf, String matr_clsf, String unit, String qunt, String uprc, String amt, String real_matr_clsf, String sub_seq, String occr_dt_s, String incmg_pers_ipadd, String incmg_pers){
		this.gubun = gubun;
		this.gubun_s = gubun_s;
		this.cmpy_cd = cmpy_cd;
		this.endgbn_s = endgbn_s;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.prt_nm = prt_nm;
		this.prt_plan_dd_pers = prt_plan_dd_pers;
		this.prt_frdt = prt_frdt;
		this.prt_todt = prt_todt;
		this.prt_tms = prt_tms;
		this.paper_std = paper_std;
		this.issu_pcnt = issu_pcnt;
		this.clr_pcnt = clr_pcnt;
		this.bw_pcnt = bw_pcnt;
		this.prt_qty = prt_qty;
		this.prt_paper_clsf = prt_paper_clsf;
		this.qunt_out_yn = qunt_out_yn;
		this.paper_gm = paper_gm;
		this.brk_rate = brk_rate;
		this.remk = remk;
		this.real_paper_std = real_paper_std;
		this.real_prt_paper_clsf = real_prt_paper_clsf;
		this.matr_clsf = matr_clsf;
		this.unit = unit;
		this.qunt = qunt;
		this.uprc = uprc;
		this.amt = amt;
		this.real_matr_clsf = real_matr_clsf;
		this.sub_seq = sub_seq;
		this.occr_dt_s = occr_dt_s;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setGubun_s(String gubun_s){
		this.gubun_s = gubun_s;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEndgbn_s(String endgbn_s){
		this.endgbn_s = endgbn_s;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPrt_nm(String prt_nm){
		this.prt_nm = prt_nm;
	}

	public void setPrt_plan_dd_pers(String prt_plan_dd_pers){
		this.prt_plan_dd_pers = prt_plan_dd_pers;
	}

	public void setPrt_frdt(String prt_frdt){
		this.prt_frdt = prt_frdt;
	}

	public void setPrt_todt(String prt_todt){
		this.prt_todt = prt_todt;
	}

	public void setPrt_tms(String prt_tms){
		this.prt_tms = prt_tms;
	}

	public void setPaper_std(String paper_std){
		this.paper_std = paper_std;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setBw_pcnt(String bw_pcnt){
		this.bw_pcnt = bw_pcnt;
	}

	public void setPrt_qty(String prt_qty){
		this.prt_qty = prt_qty;
	}

	public void setPrt_paper_clsf(String prt_paper_clsf){
		this.prt_paper_clsf = prt_paper_clsf;
	}

	public void setQunt_out_yn(String qunt_out_yn){
		this.qunt_out_yn = qunt_out_yn;
	}

	public void setPaper_gm(String paper_gm){
		this.paper_gm = paper_gm;
	}

	public void setBrk_rate(String brk_rate){
		this.brk_rate = brk_rate;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setReal_paper_std(String real_paper_std){
		this.real_paper_std = real_paper_std;
	}

	public void setReal_prt_paper_clsf(String real_prt_paper_clsf){
		this.real_prt_paper_clsf = real_prt_paper_clsf;
	}

	public void setMatr_clsf(String matr_clsf){
		this.matr_clsf = matr_clsf;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setReal_matr_clsf(String real_matr_clsf){
		this.real_matr_clsf = real_matr_clsf;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setOccr_dt_s(String occr_dt_s){
		this.occr_dt_s = occr_dt_s;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getGubun_s(){
		return this.gubun_s;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEndgbn_s(){
		return this.endgbn_s;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPrt_nm(){
		return this.prt_nm;
	}

	public String getPrt_plan_dd_pers(){
		return this.prt_plan_dd_pers;
	}

	public String getPrt_frdt(){
		return this.prt_frdt;
	}

	public String getPrt_todt(){
		return this.prt_todt;
	}

	public String getPrt_tms(){
		return this.prt_tms;
	}

	public String getPaper_std(){
		return this.paper_std;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getBw_pcnt(){
		return this.bw_pcnt;
	}

	public String getPrt_qty(){
		return this.prt_qty;
	}

	public String getPrt_paper_clsf(){
		return this.prt_paper_clsf;
	}

	public String getQunt_out_yn(){
		return this.qunt_out_yn;
	}

	public String getPaper_gm(){
		return this.paper_gm;
	}

	public String getBrk_rate(){
		return this.brk_rate;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getReal_paper_std(){
		return this.real_paper_std;
	}

	public String getReal_prt_paper_clsf(){
		return this.real_prt_paper_clsf;
	}

	public String getMatr_clsf(){
		return this.matr_clsf;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getReal_matr_clsf(){
		return this.real_matr_clsf;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getOccr_dt_s(){
		return this.occr_dt_s;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_2020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_2020_ADM dm = (MT_PRNPAP_2020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.gubun_s);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.endgbn_s);
		cstmt.setString(7, dm.occr_dt);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.prt_nm);
		cstmt.setString(10, dm.prt_plan_dd_pers);
		cstmt.setString(11, dm.prt_frdt);
		cstmt.setString(12, dm.prt_todt);
		cstmt.setString(13, dm.prt_tms);
		cstmt.setString(14, dm.paper_std);
		cstmt.setString(15, dm.issu_pcnt);
		cstmt.setString(16, dm.clr_pcnt);
		cstmt.setString(17, dm.bw_pcnt);
		cstmt.setString(18, dm.prt_qty);
		cstmt.setString(19, dm.prt_paper_clsf);
		cstmt.setString(20, dm.qunt_out_yn);
		cstmt.setString(21, dm.paper_gm);
		cstmt.setString(22, dm.brk_rate);
		cstmt.setString(23, dm.remk);
		cstmt.setString(24, dm.real_paper_std);
		cstmt.setString(25, dm.real_prt_paper_clsf);
		cstmt.setString(26, dm.matr_clsf);
		cstmt.setString(27, dm.unit);
		cstmt.setString(28, dm.qunt);
		cstmt.setString(29, dm.uprc);
		cstmt.setString(30, dm.amt);
		cstmt.setString(31, dm.real_matr_clsf);
		cstmt.setString(32, dm.sub_seq);
		cstmt.setString(33, dm.occr_dt_s);
		cstmt.setString(34, dm.incmg_pers_ipadd);
		cstmt.setString(35, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_2020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("gubun_s = [" + getGubun_s() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("endgbn_s = [" + getEndgbn_s() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("prt_nm = [" + getPrt_nm() + "]");
		System.out.println("prt_plan_dd_pers = [" + getPrt_plan_dd_pers() + "]");
		System.out.println("prt_frdt = [" + getPrt_frdt() + "]");
		System.out.println("prt_todt = [" + getPrt_todt() + "]");
		System.out.println("prt_tms = [" + getPrt_tms() + "]");
		System.out.println("paper_std = [" + getPaper_std() + "]");
		System.out.println("issu_pcnt = [" + getIssu_pcnt() + "]");
		System.out.println("clr_pcnt = [" + getClr_pcnt() + "]");
		System.out.println("bw_pcnt = [" + getBw_pcnt() + "]");
		System.out.println("prt_qty = [" + getPrt_qty() + "]");
		System.out.println("prt_paper_clsf = [" + getPrt_paper_clsf() + "]");
		System.out.println("qunt_out_yn = [" + getQunt_out_yn() + "]");
		System.out.println("paper_gm = [" + getPaper_gm() + "]");
		System.out.println("brk_rate = [" + getBrk_rate() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("real_paper_std = [" + getReal_paper_std() + "]");
		System.out.println("real_prt_paper_clsf = [" + getReal_prt_paper_clsf() + "]");
		System.out.println("matr_clsf = [" + getMatr_clsf() + "]");
		System.out.println("unit = [" + getUnit() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("real_matr_clsf = [" + getReal_matr_clsf() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("occr_dt_s = [" + getOccr_dt_s() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String gubun_s = req.getParameter("gubun_s");
if( gubun_s == null){
	System.out.println(this.toString+" : gubun_s is null" );
}else{
	System.out.println(this.toString+" : gubun_s is "+gubun_s );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String endgbn_s = req.getParameter("endgbn_s");
if( endgbn_s == null){
	System.out.println(this.toString+" : endgbn_s is null" );
}else{
	System.out.println(this.toString+" : endgbn_s is "+endgbn_s );
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
String prt_nm = req.getParameter("prt_nm");
if( prt_nm == null){
	System.out.println(this.toString+" : prt_nm is null" );
}else{
	System.out.println(this.toString+" : prt_nm is "+prt_nm );
}
String prt_plan_dd_pers = req.getParameter("prt_plan_dd_pers");
if( prt_plan_dd_pers == null){
	System.out.println(this.toString+" : prt_plan_dd_pers is null" );
}else{
	System.out.println(this.toString+" : prt_plan_dd_pers is "+prt_plan_dd_pers );
}
String prt_frdt = req.getParameter("prt_frdt");
if( prt_frdt == null){
	System.out.println(this.toString+" : prt_frdt is null" );
}else{
	System.out.println(this.toString+" : prt_frdt is "+prt_frdt );
}
String prt_todt = req.getParameter("prt_todt");
if( prt_todt == null){
	System.out.println(this.toString+" : prt_todt is null" );
}else{
	System.out.println(this.toString+" : prt_todt is "+prt_todt );
}
String prt_tms = req.getParameter("prt_tms");
if( prt_tms == null){
	System.out.println(this.toString+" : prt_tms is null" );
}else{
	System.out.println(this.toString+" : prt_tms is "+prt_tms );
}
String paper_std = req.getParameter("paper_std");
if( paper_std == null){
	System.out.println(this.toString+" : paper_std is null" );
}else{
	System.out.println(this.toString+" : paper_std is "+paper_std );
}
String issu_pcnt = req.getParameter("issu_pcnt");
if( issu_pcnt == null){
	System.out.println(this.toString+" : issu_pcnt is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt is "+issu_pcnt );
}
String clr_pcnt = req.getParameter("clr_pcnt");
if( clr_pcnt == null){
	System.out.println(this.toString+" : clr_pcnt is null" );
}else{
	System.out.println(this.toString+" : clr_pcnt is "+clr_pcnt );
}
String bw_pcnt = req.getParameter("bw_pcnt");
if( bw_pcnt == null){
	System.out.println(this.toString+" : bw_pcnt is null" );
}else{
	System.out.println(this.toString+" : bw_pcnt is "+bw_pcnt );
}
String prt_qty = req.getParameter("prt_qty");
if( prt_qty == null){
	System.out.println(this.toString+" : prt_qty is null" );
}else{
	System.out.println(this.toString+" : prt_qty is "+prt_qty );
}
String prt_paper_clsf = req.getParameter("prt_paper_clsf");
if( prt_paper_clsf == null){
	System.out.println(this.toString+" : prt_paper_clsf is null" );
}else{
	System.out.println(this.toString+" : prt_paper_clsf is "+prt_paper_clsf );
}
String qunt_out_yn = req.getParameter("qunt_out_yn");
if( qunt_out_yn == null){
	System.out.println(this.toString+" : qunt_out_yn is null" );
}else{
	System.out.println(this.toString+" : qunt_out_yn is "+qunt_out_yn );
}
String paper_gm = req.getParameter("paper_gm");
if( paper_gm == null){
	System.out.println(this.toString+" : paper_gm is null" );
}else{
	System.out.println(this.toString+" : paper_gm is "+paper_gm );
}
String brk_rate = req.getParameter("brk_rate");
if( brk_rate == null){
	System.out.println(this.toString+" : brk_rate is null" );
}else{
	System.out.println(this.toString+" : brk_rate is "+brk_rate );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String real_paper_std = req.getParameter("real_paper_std");
if( real_paper_std == null){
	System.out.println(this.toString+" : real_paper_std is null" );
}else{
	System.out.println(this.toString+" : real_paper_std is "+real_paper_std );
}
String real_prt_paper_clsf = req.getParameter("real_prt_paper_clsf");
if( real_prt_paper_clsf == null){
	System.out.println(this.toString+" : real_prt_paper_clsf is null" );
}else{
	System.out.println(this.toString+" : real_prt_paper_clsf is "+real_prt_paper_clsf );
}
String matr_clsf = req.getParameter("matr_clsf");
if( matr_clsf == null){
	System.out.println(this.toString+" : matr_clsf is null" );
}else{
	System.out.println(this.toString+" : matr_clsf is "+matr_clsf );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String real_matr_clsf = req.getParameter("real_matr_clsf");
if( real_matr_clsf == null){
	System.out.println(this.toString+" : real_matr_clsf is null" );
}else{
	System.out.println(this.toString+" : real_matr_clsf is "+real_matr_clsf );
}
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String occr_dt_s = req.getParameter("occr_dt_s");
if( occr_dt_s == null){
	System.out.println(this.toString+" : occr_dt_s is null" );
}else{
	System.out.println(this.toString+" : occr_dt_s is "+occr_dt_s );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String gubun = Util.checkString(req.getParameter("gubun"));
String gubun_s = Util.checkString(req.getParameter("gubun_s"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String endgbn_s = Util.checkString(req.getParameter("endgbn_s"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String prt_nm = Util.checkString(req.getParameter("prt_nm"));
String prt_plan_dd_pers = Util.checkString(req.getParameter("prt_plan_dd_pers"));
String prt_frdt = Util.checkString(req.getParameter("prt_frdt"));
String prt_todt = Util.checkString(req.getParameter("prt_todt"));
String prt_tms = Util.checkString(req.getParameter("prt_tms"));
String paper_std = Util.checkString(req.getParameter("paper_std"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
String bw_pcnt = Util.checkString(req.getParameter("bw_pcnt"));
String prt_qty = Util.checkString(req.getParameter("prt_qty"));
String prt_paper_clsf = Util.checkString(req.getParameter("prt_paper_clsf"));
String qunt_out_yn = Util.checkString(req.getParameter("qunt_out_yn"));
String paper_gm = Util.checkString(req.getParameter("paper_gm"));
String brk_rate = Util.checkString(req.getParameter("brk_rate"));
String remk = Util.checkString(req.getParameter("remk"));
String real_paper_std = Util.checkString(req.getParameter("real_paper_std"));
String real_prt_paper_clsf = Util.checkString(req.getParameter("real_prt_paper_clsf"));
String matr_clsf = Util.checkString(req.getParameter("matr_clsf"));
String unit = Util.checkString(req.getParameter("unit"));
String qunt = Util.checkString(req.getParameter("qunt"));
String uprc = Util.checkString(req.getParameter("uprc"));
String amt = Util.checkString(req.getParameter("amt"));
String real_matr_clsf = Util.checkString(req.getParameter("real_matr_clsf"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String occr_dt_s = Util.checkString(req.getParameter("occr_dt_s"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String gubun_s = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun_s")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String endgbn_s = Util.Uni2Ksc(Util.checkString(req.getParameter("endgbn_s")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String prt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_nm")));
String prt_plan_dd_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plan_dd_pers")));
String prt_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_frdt")));
String prt_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_todt")));
String prt_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_tms")));
String paper_std = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_std")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt")));
String bw_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("bw_pcnt")));
String prt_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_qty")));
String prt_paper_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_paper_clsf")));
String qunt_out_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt_out_yn")));
String paper_gm = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_gm")));
String brk_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("brk_rate")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String real_paper_std = Util.Uni2Ksc(Util.checkString(req.getParameter("real_paper_std")));
String real_prt_paper_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("real_prt_paper_clsf")));
String matr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_clsf")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String real_matr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("real_matr_clsf")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String occr_dt_s = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_s")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setGubun_s(gubun_s);
dm.setCmpy_cd(cmpy_cd);
dm.setEndgbn_s(endgbn_s);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setPrt_nm(prt_nm);
dm.setPrt_plan_dd_pers(prt_plan_dd_pers);
dm.setPrt_frdt(prt_frdt);
dm.setPrt_todt(prt_todt);
dm.setPrt_tms(prt_tms);
dm.setPaper_std(paper_std);
dm.setIssu_pcnt(issu_pcnt);
dm.setClr_pcnt(clr_pcnt);
dm.setBw_pcnt(bw_pcnt);
dm.setPrt_qty(prt_qty);
dm.setPrt_paper_clsf(prt_paper_clsf);
dm.setQunt_out_yn(qunt_out_yn);
dm.setPaper_gm(paper_gm);
dm.setBrk_rate(brk_rate);
dm.setRemk(remk);
dm.setReal_paper_std(real_paper_std);
dm.setReal_prt_paper_clsf(real_prt_paper_clsf);
dm.setMatr_clsf(matr_clsf);
dm.setUnit(unit);
dm.setQunt(qunt);
dm.setUprc(uprc);
dm.setAmt(amt);
dm.setReal_matr_clsf(real_matr_clsf);
dm.setSub_seq(sub_seq);
dm.setOccr_dt_s(occr_dt_s);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 23 16:21:10 KST 2009 */