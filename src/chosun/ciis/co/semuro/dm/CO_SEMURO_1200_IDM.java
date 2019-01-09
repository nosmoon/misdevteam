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


package chosun.ciis.co.semuro.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.semuro.ds.*;


/**
 *
 */


public class CO_SEMURO_1200_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String semuro_no;
	public String tmsg_type;
	public String tax_stmt_clsf;
	public String rmsg_pers_clsf;
	public String send_pers_semuro_id;
	public String rmsg_pers_eps_no;
	public String rmsg_pers_semuro_id;
	public String rmsg_pers_presi_nm;
	public String rmsg_pers_nm;
	public String rmsg_pers_tel_no;
	public String rmsg_pers_email;
	public String issu_dt;
	public String nul_cnt;
	public String tot_suply_amt;
	public String tot_tax_amt;
	public String tot_amt;
	public String cash;
	public String chqe;
	public String note;
	public String trust_unrcp_amt;
	public String rcpt_clam_yn;
	public String stat_clsf;
	public String stat_clsf_dt_tm;
	public String remk_head;
	public String item_nm;
	public String item_dt;
	public String std;
	public String qunt;
	public String uprc;
	public String item_suply_amt;
	public String tax_amt;
	public String remk;
	public String incmg_pers_ip;
	public String incmg_pers;

	public CO_SEMURO_1200_IDM(){}
	public CO_SEMURO_1200_IDM(String cmpy_cd, String occr_dt, String seq, String semuro_no, String tmsg_type, String tax_stmt_clsf, String rmsg_pers_clsf, String send_pers_semuro_id, String rmsg_pers_eps_no, String rmsg_pers_semuro_id, String rmsg_pers_presi_nm, String rmsg_pers_nm, String rmsg_pers_tel_no, String rmsg_pers_email, String issu_dt, String nul_cnt, String tot_suply_amt, String tot_tax_amt, String tot_amt, String cash, String chqe, String note, String trust_unrcp_amt, String rcpt_clam_yn, String stat_clsf, String stat_clsf_dt_tm, String remk_head, String item_nm, String item_dt, String std, String qunt, String uprc, String item_suply_amt, String tax_amt, String remk, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.semuro_no = semuro_no;
		this.tmsg_type = tmsg_type;
		this.tax_stmt_clsf = tax_stmt_clsf;
		this.rmsg_pers_clsf = rmsg_pers_clsf;
		this.send_pers_semuro_id = send_pers_semuro_id;
		this.rmsg_pers_eps_no = rmsg_pers_eps_no;
		this.rmsg_pers_semuro_id = rmsg_pers_semuro_id;
		this.rmsg_pers_presi_nm = rmsg_pers_presi_nm;
		this.rmsg_pers_nm = rmsg_pers_nm;
		this.rmsg_pers_tel_no = rmsg_pers_tel_no;
		this.rmsg_pers_email = rmsg_pers_email;
		this.issu_dt = issu_dt;
		this.nul_cnt = nul_cnt;
		this.tot_suply_amt = tot_suply_amt;
		this.tot_tax_amt = tot_tax_amt;
		this.tot_amt = tot_amt;
		this.cash = cash;
		this.chqe = chqe;
		this.note = note;
		this.trust_unrcp_amt = trust_unrcp_amt;
		this.rcpt_clam_yn = rcpt_clam_yn;
		this.stat_clsf = stat_clsf;
		this.stat_clsf_dt_tm = stat_clsf_dt_tm;
		this.remk_head = remk_head;
		this.item_nm = item_nm;
		this.item_dt = item_dt;
		this.std = std;
		this.qunt = qunt;
		this.uprc = uprc;
		this.item_suply_amt = item_suply_amt;
		this.tax_amt = tax_amt;
		this.remk = remk;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
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

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setTmsg_type(String tmsg_type){
		this.tmsg_type = tmsg_type;
	}

	public void setTax_stmt_clsf(String tax_stmt_clsf){
		this.tax_stmt_clsf = tax_stmt_clsf;
	}

	public void setRmsg_pers_clsf(String rmsg_pers_clsf){
		this.rmsg_pers_clsf = rmsg_pers_clsf;
	}

	public void setSend_pers_semuro_id(String send_pers_semuro_id){
		this.send_pers_semuro_id = send_pers_semuro_id;
	}

	public void setRmsg_pers_eps_no(String rmsg_pers_eps_no){
		this.rmsg_pers_eps_no = rmsg_pers_eps_no;
	}

	public void setRmsg_pers_semuro_id(String rmsg_pers_semuro_id){
		this.rmsg_pers_semuro_id = rmsg_pers_semuro_id;
	}

	public void setRmsg_pers_presi_nm(String rmsg_pers_presi_nm){
		this.rmsg_pers_presi_nm = rmsg_pers_presi_nm;
	}

	public void setRmsg_pers_nm(String rmsg_pers_nm){
		this.rmsg_pers_nm = rmsg_pers_nm;
	}

	public void setRmsg_pers_tel_no(String rmsg_pers_tel_no){
		this.rmsg_pers_tel_no = rmsg_pers_tel_no;
	}

	public void setRmsg_pers_email(String rmsg_pers_email){
		this.rmsg_pers_email = rmsg_pers_email;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setNul_cnt(String nul_cnt){
		this.nul_cnt = nul_cnt;
	}

	public void setTot_suply_amt(String tot_suply_amt){
		this.tot_suply_amt = tot_suply_amt;
	}

	public void setTot_tax_amt(String tot_tax_amt){
		this.tot_tax_amt = tot_tax_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setCash(String cash){
		this.cash = cash;
	}

	public void setChqe(String chqe){
		this.chqe = chqe;
	}

	public void setNote(String note){
		this.note = note;
	}

	public void setTrust_unrcp_amt(String trust_unrcp_amt){
		this.trust_unrcp_amt = trust_unrcp_amt;
	}

	public void setRcpt_clam_yn(String rcpt_clam_yn){
		this.rcpt_clam_yn = rcpt_clam_yn;
	}

	public void setStat_clsf(String stat_clsf){
		this.stat_clsf = stat_clsf;
	}

	public void setStat_clsf_dt_tm(String stat_clsf_dt_tm){
		this.stat_clsf_dt_tm = stat_clsf_dt_tm;
	}

	public void setRemk_head(String remk_head){
		this.remk_head = remk_head;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setItem_dt(String item_dt){
		this.item_dt = item_dt;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setItem_suply_amt(String item_suply_amt){
		this.item_suply_amt = item_suply_amt;
	}

	public void setTax_amt(String tax_amt){
		this.tax_amt = tax_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getTmsg_type(){
		return this.tmsg_type;
	}

	public String getTax_stmt_clsf(){
		return this.tax_stmt_clsf;
	}

	public String getRmsg_pers_clsf(){
		return this.rmsg_pers_clsf;
	}

	public String getSend_pers_semuro_id(){
		return this.send_pers_semuro_id;
	}

	public String getRmsg_pers_eps_no(){
		return this.rmsg_pers_eps_no;
	}

	public String getRmsg_pers_semuro_id(){
		return this.rmsg_pers_semuro_id;
	}

	public String getRmsg_pers_presi_nm(){
		return this.rmsg_pers_presi_nm;
	}

	public String getRmsg_pers_nm(){
		return this.rmsg_pers_nm;
	}

	public String getRmsg_pers_tel_no(){
		return this.rmsg_pers_tel_no;
	}

	public String getRmsg_pers_email(){
		return this.rmsg_pers_email;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getNul_cnt(){
		return this.nul_cnt;
	}

	public String getTot_suply_amt(){
		return this.tot_suply_amt;
	}

	public String getTot_tax_amt(){
		return this.tot_tax_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getCash(){
		return this.cash;
	}

	public String getChqe(){
		return this.chqe;
	}

	public String getNote(){
		return this.note;
	}

	public String getTrust_unrcp_amt(){
		return this.trust_unrcp_amt;
	}

	public String getRcpt_clam_yn(){
		return this.rcpt_clam_yn;
	}

	public String getStat_clsf(){
		return this.stat_clsf;
	}

	public String getStat_clsf_dt_tm(){
		return this.stat_clsf_dt_tm;
	}

	public String getRemk_head(){
		return this.remk_head;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getItem_dt(){
		return this.item_dt;
	}

	public String getStd(){
		return this.std;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getItem_suply_amt(){
		return this.item_suply_amt;
	}

	public String getTax_amt(){
		return this.tax_amt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_SEMURO_1200_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_SEMURO_1200_IDM dm = (CO_SEMURO_1200_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.semuro_no);
		cstmt.setString(7, dm.tmsg_type);
		cstmt.setString(8, dm.tax_stmt_clsf);
		cstmt.setString(9, dm.rmsg_pers_clsf);
		cstmt.setString(10, dm.send_pers_semuro_id);
		cstmt.setString(11, dm.rmsg_pers_eps_no);
		cstmt.setString(12, dm.rmsg_pers_semuro_id);
		cstmt.setString(13, dm.rmsg_pers_presi_nm);
		cstmt.setString(14, dm.rmsg_pers_nm);
		cstmt.setString(15, dm.rmsg_pers_tel_no);
		cstmt.setString(16, dm.rmsg_pers_email);
		cstmt.setString(17, dm.issu_dt);
		cstmt.setString(18, dm.nul_cnt);
		cstmt.setString(19, dm.tot_suply_amt);
		cstmt.setString(20, dm.tot_tax_amt);
		cstmt.setString(21, dm.tot_amt);
		cstmt.setString(22, dm.cash);
		cstmt.setString(23, dm.chqe);
		cstmt.setString(24, dm.note);
		cstmt.setString(25, dm.trust_unrcp_amt);
		cstmt.setString(26, dm.rcpt_clam_yn);
		cstmt.setString(27, dm.stat_clsf);
		cstmt.setString(28, dm.stat_clsf_dt_tm);
		cstmt.setString(29, dm.remk_head);
		cstmt.setString(30, dm.item_nm);
		cstmt.setString(31, dm.item_dt);
		cstmt.setString(32, dm.std);
		cstmt.setString(33, dm.qunt);
		cstmt.setString(34, dm.uprc);
		cstmt.setString(35, dm.item_suply_amt);
		cstmt.setString(36, dm.tax_amt);
		cstmt.setString(37, dm.remk);
		cstmt.setString(38, dm.incmg_pers_ip);
		cstmt.setString(39, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.semuro.ds.CO_SEMURO_1200_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("semuro_no = " + getSemuro_no());
        System.out.println("tmsg_type = " + getTmsg_type());
        System.out.println("tax_stmt_clsf = " + getTax_stmt_clsf());
        System.out.println("rmsg_pers_clsf = " + getRmsg_pers_clsf());
        System.out.println("send_pers_semuro_id = " + getSend_pers_semuro_id());
        System.out.println("rmsg_pers_eps_no = " + getRmsg_pers_eps_no());
        System.out.println("rmsg_pers_semuro_id = " + getRmsg_pers_semuro_id());
        System.out.println("rmsg_pers_presi_nm = " + getRmsg_pers_presi_nm());
        System.out.println("rmsg_pers_nm = " + getRmsg_pers_nm());
        System.out.println("rmsg_pers_tel_no = " + getRmsg_pers_tel_no());
        System.out.println("rmsg_pers_email = " + getRmsg_pers_email());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("nul_cnt = " + getNul_cnt());
        System.out.println("tot_suply_amt = " + getTot_suply_amt());
        System.out.println("tot_tax_amt = " + getTot_tax_amt());
        System.out.println("tot_amt = " + getTot_amt());
        System.out.println("cash = " + getCash());
        System.out.println("chqe = " + getChqe());
        System.out.println("note = " + getNote());
        System.out.println("trust_unrcp_amt = " + getTrust_unrcp_amt());
        System.out.println("rcpt_clam_yn = " + getRcpt_clam_yn());
        System.out.println("stat_clsf = " + getStat_clsf());
        System.out.println("stat_clsf_dt_tm = " + getStat_clsf_dt_tm());
        System.out.println("remk_head = " + getRemk_head());
        System.out.println("item_nm = " + getItem_nm());
        System.out.println("item_dt = " + getItem_dt());
        System.out.println("std = " + getStd());
        System.out.println("qunt = " + getQunt());
        System.out.println("uprc = " + getUprc());
        System.out.println("item_suply_amt = " + getItem_suply_amt());
        System.out.println("tax_amt = " + getTax_amt());
        System.out.println("remk = " + getRemk());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String semuro_no = req.getParameter("semuro_no");
if( semuro_no == null){
	System.out.println(this.toString+" : semuro_no is null" );
}else{
	System.out.println(this.toString+" : semuro_no is "+semuro_no );
}
String tmsg_type = req.getParameter("tmsg_type");
if( tmsg_type == null){
	System.out.println(this.toString+" : tmsg_type is null" );
}else{
	System.out.println(this.toString+" : tmsg_type is "+tmsg_type );
}
String tax_stmt_clsf = req.getParameter("tax_stmt_clsf");
if( tax_stmt_clsf == null){
	System.out.println(this.toString+" : tax_stmt_clsf is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_clsf is "+tax_stmt_clsf );
}
String rmsg_pers_clsf = req.getParameter("rmsg_pers_clsf");
if( rmsg_pers_clsf == null){
	System.out.println(this.toString+" : rmsg_pers_clsf is null" );
}else{
	System.out.println(this.toString+" : rmsg_pers_clsf is "+rmsg_pers_clsf );
}
String send_pers_semuro_id = req.getParameter("send_pers_semuro_id");
if( send_pers_semuro_id == null){
	System.out.println(this.toString+" : send_pers_semuro_id is null" );
}else{
	System.out.println(this.toString+" : send_pers_semuro_id is "+send_pers_semuro_id );
}
String rmsg_pers_eps_no = req.getParameter("rmsg_pers_eps_no");
if( rmsg_pers_eps_no == null){
	System.out.println(this.toString+" : rmsg_pers_eps_no is null" );
}else{
	System.out.println(this.toString+" : rmsg_pers_eps_no is "+rmsg_pers_eps_no );
}
String rmsg_pers_semuro_id = req.getParameter("rmsg_pers_semuro_id");
if( rmsg_pers_semuro_id == null){
	System.out.println(this.toString+" : rmsg_pers_semuro_id is null" );
}else{
	System.out.println(this.toString+" : rmsg_pers_semuro_id is "+rmsg_pers_semuro_id );
}
String rmsg_pers_presi_nm = req.getParameter("rmsg_pers_presi_nm");
if( rmsg_pers_presi_nm == null){
	System.out.println(this.toString+" : rmsg_pers_presi_nm is null" );
}else{
	System.out.println(this.toString+" : rmsg_pers_presi_nm is "+rmsg_pers_presi_nm );
}
String rmsg_pers_nm = req.getParameter("rmsg_pers_nm");
if( rmsg_pers_nm == null){
	System.out.println(this.toString+" : rmsg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : rmsg_pers_nm is "+rmsg_pers_nm );
}
String rmsg_pers_tel_no = req.getParameter("rmsg_pers_tel_no");
if( rmsg_pers_tel_no == null){
	System.out.println(this.toString+" : rmsg_pers_tel_no is null" );
}else{
	System.out.println(this.toString+" : rmsg_pers_tel_no is "+rmsg_pers_tel_no );
}
String rmsg_pers_email = req.getParameter("rmsg_pers_email");
if( rmsg_pers_email == null){
	System.out.println(this.toString+" : rmsg_pers_email is null" );
}else{
	System.out.println(this.toString+" : rmsg_pers_email is "+rmsg_pers_email );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String nul_cnt = req.getParameter("nul_cnt");
if( nul_cnt == null){
	System.out.println(this.toString+" : nul_cnt is null" );
}else{
	System.out.println(this.toString+" : nul_cnt is "+nul_cnt );
}
String tot_suply_amt = req.getParameter("tot_suply_amt");
if( tot_suply_amt == null){
	System.out.println(this.toString+" : tot_suply_amt is null" );
}else{
	System.out.println(this.toString+" : tot_suply_amt is "+tot_suply_amt );
}
String tot_tax_amt = req.getParameter("tot_tax_amt");
if( tot_tax_amt == null){
	System.out.println(this.toString+" : tot_tax_amt is null" );
}else{
	System.out.println(this.toString+" : tot_tax_amt is "+tot_tax_amt );
}
String tot_amt = req.getParameter("tot_amt");
if( tot_amt == null){
	System.out.println(this.toString+" : tot_amt is null" );
}else{
	System.out.println(this.toString+" : tot_amt is "+tot_amt );
}
String cash = req.getParameter("cash");
if( cash == null){
	System.out.println(this.toString+" : cash is null" );
}else{
	System.out.println(this.toString+" : cash is "+cash );
}
String chqe = req.getParameter("chqe");
if( chqe == null){
	System.out.println(this.toString+" : chqe is null" );
}else{
	System.out.println(this.toString+" : chqe is "+chqe );
}
String note = req.getParameter("note");
if( note == null){
	System.out.println(this.toString+" : note is null" );
}else{
	System.out.println(this.toString+" : note is "+note );
}
String trust_unrcp_amt = req.getParameter("trust_unrcp_amt");
if( trust_unrcp_amt == null){
	System.out.println(this.toString+" : trust_unrcp_amt is null" );
}else{
	System.out.println(this.toString+" : trust_unrcp_amt is "+trust_unrcp_amt );
}
String rcpt_clam_yn = req.getParameter("rcpt_clam_yn");
if( rcpt_clam_yn == null){
	System.out.println(this.toString+" : rcpt_clam_yn is null" );
}else{
	System.out.println(this.toString+" : rcpt_clam_yn is "+rcpt_clam_yn );
}
String stat_clsf = req.getParameter("stat_clsf");
if( stat_clsf == null){
	System.out.println(this.toString+" : stat_clsf is null" );
}else{
	System.out.println(this.toString+" : stat_clsf is "+stat_clsf );
}
String stat_clsf_dt_tm = req.getParameter("stat_clsf_dt_tm");
if( stat_clsf_dt_tm == null){
	System.out.println(this.toString+" : stat_clsf_dt_tm is null" );
}else{
	System.out.println(this.toString+" : stat_clsf_dt_tm is "+stat_clsf_dt_tm );
}
String remk_head = req.getParameter("remk_head");
if( remk_head == null){
	System.out.println(this.toString+" : remk_head is null" );
}else{
	System.out.println(this.toString+" : remk_head is "+remk_head );
}
String item_nm = req.getParameter("item_nm");
if( item_nm == null){
	System.out.println(this.toString+" : item_nm is null" );
}else{
	System.out.println(this.toString+" : item_nm is "+item_nm );
}
String item_dt = req.getParameter("item_dt");
if( item_dt == null){
	System.out.println(this.toString+" : item_dt is null" );
}else{
	System.out.println(this.toString+" : item_dt is "+item_dt );
}
String std = req.getParameter("std");
if( std == null){
	System.out.println(this.toString+" : std is null" );
}else{
	System.out.println(this.toString+" : std is "+std );
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
String item_suply_amt = req.getParameter("item_suply_amt");
if( item_suply_amt == null){
	System.out.println(this.toString+" : item_suply_amt is null" );
}else{
	System.out.println(this.toString+" : item_suply_amt is "+item_suply_amt );
}
String tax_amt = req.getParameter("tax_amt");
if( tax_amt == null){
	System.out.println(this.toString+" : tax_amt is null" );
}else{
	System.out.println(this.toString+" : tax_amt is "+tax_amt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String semuro_no = Util.checkString(req.getParameter("semuro_no"));
String tmsg_type = Util.checkString(req.getParameter("tmsg_type"));
String tax_stmt_clsf = Util.checkString(req.getParameter("tax_stmt_clsf"));
String rmsg_pers_clsf = Util.checkString(req.getParameter("rmsg_pers_clsf"));
String send_pers_semuro_id = Util.checkString(req.getParameter("send_pers_semuro_id"));
String rmsg_pers_eps_no = Util.checkString(req.getParameter("rmsg_pers_eps_no"));
String rmsg_pers_semuro_id = Util.checkString(req.getParameter("rmsg_pers_semuro_id"));
String rmsg_pers_presi_nm = Util.checkString(req.getParameter("rmsg_pers_presi_nm"));
String rmsg_pers_nm = Util.checkString(req.getParameter("rmsg_pers_nm"));
String rmsg_pers_tel_no = Util.checkString(req.getParameter("rmsg_pers_tel_no"));
String rmsg_pers_email = Util.checkString(req.getParameter("rmsg_pers_email"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String nul_cnt = Util.checkString(req.getParameter("nul_cnt"));
String tot_suply_amt = Util.checkString(req.getParameter("tot_suply_amt"));
String tot_tax_amt = Util.checkString(req.getParameter("tot_tax_amt"));
String tot_amt = Util.checkString(req.getParameter("tot_amt"));
String cash = Util.checkString(req.getParameter("cash"));
String chqe = Util.checkString(req.getParameter("chqe"));
String note = Util.checkString(req.getParameter("note"));
String trust_unrcp_amt = Util.checkString(req.getParameter("trust_unrcp_amt"));
String rcpt_clam_yn = Util.checkString(req.getParameter("rcpt_clam_yn"));
String stat_clsf = Util.checkString(req.getParameter("stat_clsf"));
String stat_clsf_dt_tm = Util.checkString(req.getParameter("stat_clsf_dt_tm"));
String remk_head = Util.checkString(req.getParameter("remk_head"));
String item_nm = Util.checkString(req.getParameter("item_nm"));
String item_dt = Util.checkString(req.getParameter("item_dt"));
String std = Util.checkString(req.getParameter("std"));
String qunt = Util.checkString(req.getParameter("qunt"));
String uprc = Util.checkString(req.getParameter("uprc"));
String item_suply_amt = Util.checkString(req.getParameter("item_suply_amt"));
String tax_amt = Util.checkString(req.getParameter("tax_amt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String semuro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_no")));
String tmsg_type = Util.Uni2Ksc(Util.checkString(req.getParameter("tmsg_type")));
String tax_stmt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_clsf")));
String rmsg_pers_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsg_pers_clsf")));
String send_pers_semuro_id = Util.Uni2Ksc(Util.checkString(req.getParameter("send_pers_semuro_id")));
String rmsg_pers_eps_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsg_pers_eps_no")));
String rmsg_pers_semuro_id = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsg_pers_semuro_id")));
String rmsg_pers_presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsg_pers_presi_nm")));
String rmsg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsg_pers_nm")));
String rmsg_pers_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsg_pers_tel_no")));
String rmsg_pers_email = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsg_pers_email")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String nul_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("nul_cnt")));
String tot_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_suply_amt")));
String tot_tax_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_tax_amt")));
String tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_amt")));
String cash = Util.Uni2Ksc(Util.checkString(req.getParameter("cash")));
String chqe = Util.Uni2Ksc(Util.checkString(req.getParameter("chqe")));
String note = Util.Uni2Ksc(Util.checkString(req.getParameter("note")));
String trust_unrcp_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("trust_unrcp_amt")));
String rcpt_clam_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_clam_yn")));
String stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_clsf")));
String stat_clsf_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_clsf_dt_tm")));
String remk_head = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_head")));
String item_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("item_nm")));
String item_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("item_dt")));
String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String item_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("item_suply_amt")));
String tax_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSemuro_no(semuro_no);
dm.setTmsg_type(tmsg_type);
dm.setTax_stmt_clsf(tax_stmt_clsf);
dm.setRmsg_pers_clsf(rmsg_pers_clsf);
dm.setSend_pers_semuro_id(send_pers_semuro_id);
dm.setRmsg_pers_eps_no(rmsg_pers_eps_no);
dm.setRmsg_pers_semuro_id(rmsg_pers_semuro_id);
dm.setRmsg_pers_presi_nm(rmsg_pers_presi_nm);
dm.setRmsg_pers_nm(rmsg_pers_nm);
dm.setRmsg_pers_tel_no(rmsg_pers_tel_no);
dm.setRmsg_pers_email(rmsg_pers_email);
dm.setIssu_dt(issu_dt);
dm.setNul_cnt(nul_cnt);
dm.setTot_suply_amt(tot_suply_amt);
dm.setTot_tax_amt(tot_tax_amt);
dm.setTot_amt(tot_amt);
dm.setCash(cash);
dm.setChqe(chqe);
dm.setNote(note);
dm.setTrust_unrcp_amt(trust_unrcp_amt);
dm.setRcpt_clam_yn(rcpt_clam_yn);
dm.setStat_clsf(stat_clsf);
dm.setStat_clsf_dt_tm(stat_clsf_dt_tm);
dm.setRemk_head(remk_head);
dm.setItem_nm(item_nm);
dm.setItem_dt(item_dt);
dm.setStd(std);
dm.setQunt(qunt);
dm.setUprc(uprc);
dm.setItem_suply_amt(item_suply_amt);
dm.setTax_amt(tax_amt);
dm.setRemk(remk);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 05 11:36:01 KST 2009 */