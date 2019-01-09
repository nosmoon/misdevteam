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
import chosun.ciis.co.semuro.rec.*;

/**
 *
 */


public class CO_SEMURO_1100_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String semuro_no;
	public String tax_stmt_clsf;
	public String rmsg_pers_semuro_id;
	public String send_pers_id;
	public String send_pers_eps_no;
	public String send_pers_presi_flnm;
	public String send_pers_firmnm;
	public String send_pers_addr;
	public String send_pers_bizcond;
	public String send_pers_indt;
	public String send_pers_email;
	public String issu_dt;
	public String tot_suply_amt;
	public String tot_amt;
	public String tot_tax_amt;
	public String cash;
	public String note;
	public String chqe;
	public String trust_unrcp_amt;
	public String rcpt_clam_yn;
	public String stat_clsf;
	public String stat_clsf_dt_tm;
	public String rremk;
	public String sub_seq;
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

	public CO_SEMURO_1100_ADM(){}
	public CO_SEMURO_1100_ADM(String cmpy_cd, String semuro_no, String tax_stmt_clsf, String rmsg_pers_semuro_id, String send_pers_id, String send_pers_eps_no, String send_pers_presi_flnm, String send_pers_firmnm, String send_pers_addr, String send_pers_bizcond, String send_pers_indt, String send_pers_email, String issu_dt, String tot_suply_amt, String tot_amt, String tot_tax_amt, String cash, String note, String chqe, String trust_unrcp_amt, String rcpt_clam_yn, String stat_clsf, String stat_clsf_dt_tm, String rremk, String sub_seq, String item_nm, String item_dt, String std, String qunt, String uprc, String item_suply_amt, String tax_amt, String remk, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.semuro_no = semuro_no;
		this.tax_stmt_clsf = tax_stmt_clsf;
		this.rmsg_pers_semuro_id = rmsg_pers_semuro_id;
		this.send_pers_id = send_pers_id;
		this.send_pers_eps_no = send_pers_eps_no;
		this.send_pers_presi_flnm = send_pers_presi_flnm;
		this.send_pers_firmnm = send_pers_firmnm;
		this.send_pers_addr = send_pers_addr;
		this.send_pers_bizcond = send_pers_bizcond;
		this.send_pers_indt = send_pers_indt;
		this.send_pers_email = send_pers_email;
		this.issu_dt = issu_dt;
		this.tot_suply_amt = tot_suply_amt;
		this.tot_amt = tot_amt;
		this.tot_tax_amt = tot_tax_amt;
		this.cash = cash;
		this.note = note;
		this.chqe = chqe;
		this.trust_unrcp_amt = trust_unrcp_amt;
		this.rcpt_clam_yn = rcpt_clam_yn;
		this.stat_clsf = stat_clsf;
		this.stat_clsf_dt_tm = stat_clsf_dt_tm;
		this.rremk = rremk;
		this.sub_seq = sub_seq;
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

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setTax_stmt_clsf(String tax_stmt_clsf){
		this.tax_stmt_clsf = tax_stmt_clsf;
	}

	public void setRmsg_pers_semuro_id(String rmsg_pers_semuro_id){
		this.rmsg_pers_semuro_id = rmsg_pers_semuro_id;
	}

	public void setSend_pers_id(String send_pers_id){
		this.send_pers_id = send_pers_id;
	}

	public void setSend_pers_eps_no(String send_pers_eps_no){
		this.send_pers_eps_no = send_pers_eps_no;
	}

	public void setSend_pers_presi_flnm(String send_pers_presi_flnm){
		this.send_pers_presi_flnm = send_pers_presi_flnm;
	}

	public void setSend_pers_firmnm(String send_pers_firmnm){
		this.send_pers_firmnm = send_pers_firmnm;
	}

	public void setSend_pers_addr(String send_pers_addr){
		this.send_pers_addr = send_pers_addr;
	}

	public void setSend_pers_bizcond(String send_pers_bizcond){
		this.send_pers_bizcond = send_pers_bizcond;
	}

	public void setSend_pers_indt(String send_pers_indt){
		this.send_pers_indt = send_pers_indt;
	}

	public void setSend_pers_email(String send_pers_email){
		this.send_pers_email = send_pers_email;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setTot_suply_amt(String tot_suply_amt){
		this.tot_suply_amt = tot_suply_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setTot_tax_amt(String tot_tax_amt){
		this.tot_tax_amt = tot_tax_amt;
	}

	public void setCash(String cash){
		this.cash = cash;
	}

	public void setNote(String note){
		this.note = note;
	}

	public void setChqe(String chqe){
		this.chqe = chqe;
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
	
	public void setRremk(String rremk){
		this.rremk = rremk;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
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

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getTax_stmt_clsf(){
		return this.tax_stmt_clsf;
	}

	public String getRmsg_pers_semuro_id(){
		return this.rmsg_pers_semuro_id;
	}

	public String getSend_pers_id(){
		return this.send_pers_id;
	}

	public String getSend_pers_eps_no(){
		return this.send_pers_eps_no;
	}

	public String getSend_pers_presi_flnm(){
		return this.send_pers_presi_flnm;
	}

	public String getSend_pers_firmnm(){
		return this.send_pers_firmnm;
	}

	public String getSend_pers_addr(){
		return this.send_pers_addr;
	}

	public String getSend_pers_bizcond(){
		return this.send_pers_bizcond;
	}

	public String getSend_pers_indt(){
		return this.send_pers_indt;
	}

	public String getSend_pers_email(){
		return this.send_pers_email;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getTot_suply_amt(){
		return this.tot_suply_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getTot_tax_amt(){
		return this.tot_tax_amt;
	}

	public String getCash(){
		return this.cash;
	}

	public String getNote(){
		return this.note;
	}

	public String getChqe(){
		return this.chqe;
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
	
	public String getRremk(){
		return this.rremk;
	}

	public String getSub_seq(){
		return this.sub_seq;
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
		 return "{ call MISCOM.SP_CO_SEMURO_1100_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_SEMURO_1100_ADM dm = (CO_SEMURO_1100_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.semuro_no);
		cstmt.setString(5, dm.tax_stmt_clsf);
		cstmt.setString(6, dm.rmsg_pers_semuro_id);
		cstmt.setString(7, dm.send_pers_id);
		cstmt.setString(8, dm.send_pers_eps_no);
		cstmt.setString(9, dm.send_pers_presi_flnm);
		cstmt.setString(10, dm.send_pers_firmnm);
		cstmt.setString(11, dm.send_pers_addr);
		cstmt.setString(12, dm.send_pers_bizcond);
		cstmt.setString(13, dm.send_pers_indt);
		cstmt.setString(14, dm.send_pers_email);
		cstmt.setString(15, dm.issu_dt);
		cstmt.setString(16, dm.tot_suply_amt);
		cstmt.setString(17, dm.tot_amt);
		cstmt.setString(18, dm.tot_tax_amt);
		cstmt.setString(19, dm.cash);
		cstmt.setString(20, dm.note);
		cstmt.setString(21, dm.chqe);
		cstmt.setString(22, dm.trust_unrcp_amt);
		cstmt.setString(23, dm.rcpt_clam_yn);
		cstmt.setString(24, dm.stat_clsf);
		cstmt.setString(25, dm.stat_clsf_dt_tm);
		cstmt.setString(26, dm.rremk);
		cstmt.setString(27, dm.sub_seq);
		cstmt.setString(28, dm.item_nm);
		cstmt.setString(29, dm.item_dt);
		cstmt.setString(30, dm.std);
		cstmt.setString(31, dm.qunt);
		cstmt.setString(32, dm.uprc);
		cstmt.setString(33, dm.item_suply_amt);
		cstmt.setString(34, dm.tax_amt);
		cstmt.setString(35, dm.remk);
		cstmt.setString(36, dm.incmg_pers_ip);
		cstmt.setString(37, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.semuro.ds.CO_SEMURO_1100_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("semuro_no = " + getSemuro_no());
        System.out.println("tax_stmt_clsf = " + getTax_stmt_clsf());
        System.out.println("rmsg_pers_semuro_id = " + getRmsg_pers_semuro_id());
        System.out.println("send_pers_id = " + getSend_pers_id());
        System.out.println("send_pers_eps_no = " + getSend_pers_eps_no());
        System.out.println("send_pers_presi_flnm = " + getSend_pers_presi_flnm());
        System.out.println("send_pers_firmnm = " + getSend_pers_firmnm());
        System.out.println("send_pers_addr = " + getSend_pers_addr());
        System.out.println("send_pers_bizcond = " + getSend_pers_bizcond());
        System.out.println("send_pers_indt = " + getSend_pers_indt());
        System.out.println("send_pers_email = " + getSend_pers_email());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("tot_suply_amt = " + getTot_suply_amt());
        System.out.println("tot_amt = " + getTot_amt());
        System.out.println("tot_tax_amt = " + getTot_tax_amt());
        System.out.println("cash = " + getCash());
        System.out.println("note = " + getNote());
        System.out.println("chqe = " + getChqe());
        System.out.println("trust_unrcp_amt = " + getTrust_unrcp_amt());
        System.out.println("rcpt_clam_yn = " + getRcpt_clam_yn());
        System.out.println("stat_clsf = " + getStat_clsf());
        System.out.println("stat_clsf_dt_tm = " + getStat_clsf_dt_tm());
        System.out.println("rremk = " + getRremk());
        System.out.println("sub_seq = " + getSub_seq());
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
String semuro_no = req.getParameter("semuro_no");
if( semuro_no == null){
	System.out.println(this.toString+" : semuro_no is null" );
}else{
	System.out.println(this.toString+" : semuro_no is "+semuro_no );
}
String tax_stmt_clsf = req.getParameter("tax_stmt_clsf");
if( tax_stmt_clsf == null){
	System.out.println(this.toString+" : tax_stmt_clsf is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_clsf is "+tax_stmt_clsf );
}
String rmsg_pers_semuro_id = req.getParameter("rmsg_pers_semuro_id");
if( rmsg_pers_semuro_id == null){
	System.out.println(this.toString+" : rmsg_pers_semuro_id is null" );
}else{
	System.out.println(this.toString+" : rmsg_pers_semuro_id is "+rmsg_pers_semuro_id );
}
String send_pers_id = req.getParameter("send_pers_id");
if( send_pers_id == null){
	System.out.println(this.toString+" : send_pers_id is null" );
}else{
	System.out.println(this.toString+" : send_pers_id is "+send_pers_id );
}
String send_pers_eps_no = req.getParameter("send_pers_eps_no");
if( send_pers_eps_no == null){
	System.out.println(this.toString+" : send_pers_eps_no is null" );
}else{
	System.out.println(this.toString+" : send_pers_eps_no is "+send_pers_eps_no );
}
String send_pers_presi_flnm = req.getParameter("send_pers_presi_flnm");
if( send_pers_presi_flnm == null){
	System.out.println(this.toString+" : send_pers_presi_flnm is null" );
}else{
	System.out.println(this.toString+" : send_pers_presi_flnm is "+send_pers_presi_flnm );
}
String send_pers_firmnm = req.getParameter("send_pers_firmnm");
if( send_pers_firmnm == null){
	System.out.println(this.toString+" : send_pers_firmnm is null" );
}else{
	System.out.println(this.toString+" : send_pers_firmnm is "+send_pers_firmnm );
}
String send_pers_addr = req.getParameter("send_pers_addr");
if( send_pers_addr == null){
	System.out.println(this.toString+" : send_pers_addr is null" );
}else{
	System.out.println(this.toString+" : send_pers_addr is "+send_pers_addr );
}
String send_pers_bizcond = req.getParameter("send_pers_bizcond");
if( send_pers_bizcond == null){
	System.out.println(this.toString+" : send_pers_bizcond is null" );
}else{
	System.out.println(this.toString+" : send_pers_bizcond is "+send_pers_bizcond );
}
String send_pers_indt = req.getParameter("send_pers_indt");
if( send_pers_indt == null){
	System.out.println(this.toString+" : send_pers_indt is null" );
}else{
	System.out.println(this.toString+" : send_pers_indt is "+send_pers_indt );
}
String send_pers_email = req.getParameter("send_pers_email");
if( send_pers_email == null){
	System.out.println(this.toString+" : send_pers_email is null" );
}else{
	System.out.println(this.toString+" : send_pers_email is "+send_pers_email );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String tot_suply_amt = req.getParameter("tot_suply_amt");
if( tot_suply_amt == null){
	System.out.println(this.toString+" : tot_suply_amt is null" );
}else{
	System.out.println(this.toString+" : tot_suply_amt is "+tot_suply_amt );
}
String tot_amt = req.getParameter("tot_amt");
if( tot_amt == null){
	System.out.println(this.toString+" : tot_amt is null" );
}else{
	System.out.println(this.toString+" : tot_amt is "+tot_amt );
}
String tot_tax_amt = req.getParameter("tot_tax_amt");
if( tot_tax_amt == null){
	System.out.println(this.toString+" : tot_tax_amt is null" );
}else{
	System.out.println(this.toString+" : tot_tax_amt is "+tot_tax_amt );
}
String cash = req.getParameter("cash");
if( cash == null){
	System.out.println(this.toString+" : cash is null" );
}else{
	System.out.println(this.toString+" : cash is "+cash );
}
String note = req.getParameter("note");
if( note == null){
	System.out.println(this.toString+" : note is null" );
}else{
	System.out.println(this.toString+" : note is "+note );
}
String chqe = req.getParameter("chqe");
if( chqe == null){
	System.out.println(this.toString+" : chqe is null" );
}else{
	System.out.println(this.toString+" : chqe is "+chqe );
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
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
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
String semuro_no = Util.checkString(req.getParameter("semuro_no"));
String tax_stmt_clsf = Util.checkString(req.getParameter("tax_stmt_clsf"));
String rmsg_pers_semuro_id = Util.checkString(req.getParameter("rmsg_pers_semuro_id"));
String send_pers_id = Util.checkString(req.getParameter("send_pers_id"));
String send_pers_eps_no = Util.checkString(req.getParameter("send_pers_eps_no"));
String send_pers_presi_flnm = Util.checkString(req.getParameter("send_pers_presi_flnm"));
String send_pers_firmnm = Util.checkString(req.getParameter("send_pers_firmnm"));
String send_pers_addr = Util.checkString(req.getParameter("send_pers_addr"));
String send_pers_bizcond = Util.checkString(req.getParameter("send_pers_bizcond"));
String send_pers_indt = Util.checkString(req.getParameter("send_pers_indt"));
String send_pers_email = Util.checkString(req.getParameter("send_pers_email"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String tot_suply_amt = Util.checkString(req.getParameter("tot_suply_amt"));
String tot_amt = Util.checkString(req.getParameter("tot_amt"));
String tot_tax_amt = Util.checkString(req.getParameter("tot_tax_amt"));
String cash = Util.checkString(req.getParameter("cash"));
String note = Util.checkString(req.getParameter("note"));
String chqe = Util.checkString(req.getParameter("chqe"));
String trust_unrcp_amt = Util.checkString(req.getParameter("trust_unrcp_amt"));
String rcpt_clam_yn = Util.checkString(req.getParameter("rcpt_clam_yn"));
String stat_clsf = Util.checkString(req.getParameter("stat_clsf"));
String stat_clsf_dt_tm = Util.checkString(req.getParameter("stat_clsf_dt_tm"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
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
String semuro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_no")));
String tax_stmt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_clsf")));
String rmsg_pers_semuro_id = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsg_pers_semuro_id")));
String send_pers_id = Util.Uni2Ksc(Util.checkString(req.getParameter("send_pers_id")));
String send_pers_eps_no = Util.Uni2Ksc(Util.checkString(req.getParameter("send_pers_eps_no")));
String send_pers_presi_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("send_pers_presi_flnm")));
String send_pers_firmnm = Util.Uni2Ksc(Util.checkString(req.getParameter("send_pers_firmnm")));
String send_pers_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("send_pers_addr")));
String send_pers_bizcond = Util.Uni2Ksc(Util.checkString(req.getParameter("send_pers_bizcond")));
String send_pers_indt = Util.Uni2Ksc(Util.checkString(req.getParameter("send_pers_indt")));
String send_pers_email = Util.Uni2Ksc(Util.checkString(req.getParameter("send_pers_email")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String tot_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_suply_amt")));
String tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_amt")));
String tot_tax_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_tax_amt")));
String cash = Util.Uni2Ksc(Util.checkString(req.getParameter("cash")));
String note = Util.Uni2Ksc(Util.checkString(req.getParameter("note")));
String chqe = Util.Uni2Ksc(Util.checkString(req.getParameter("chqe")));
String trust_unrcp_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("trust_unrcp_amt")));
String rcpt_clam_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_clam_yn")));
String stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_clsf")));
String stat_clsf_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_clsf_dt_tm")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
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
dm.setSemuro_no(semuro_no);
dm.setTax_stmt_clsf(tax_stmt_clsf);
dm.setRmsg_pers_semuro_id(rmsg_pers_semuro_id);
dm.setSend_pers_id(send_pers_id);
dm.setSend_pers_eps_no(send_pers_eps_no);
dm.setSend_pers_presi_flnm(send_pers_presi_flnm);
dm.setSend_pers_firmnm(send_pers_firmnm);
dm.setSend_pers_addr(send_pers_addr);
dm.setSend_pers_bizcond(send_pers_bizcond);
dm.setSend_pers_indt(send_pers_indt);
dm.setSend_pers_email(send_pers_email);
dm.setIssu_dt(issu_dt);
dm.setTot_suply_amt(tot_suply_amt);
dm.setTot_amt(tot_amt);
dm.setTot_tax_amt(tot_tax_amt);
dm.setCash(cash);
dm.setNote(note);
dm.setChqe(chqe);
dm.setTrust_unrcp_amt(trust_unrcp_amt);
dm.setRcpt_clam_yn(rcpt_clam_yn);
dm.setStat_clsf(stat_clsf);
dm.setStat_clsf_dt_tm(stat_clsf_dt_tm);
dm.setSub_seq(sub_seq);
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


/* 작성시간 : Tue Mar 10 19:20:45 KST 2009 */