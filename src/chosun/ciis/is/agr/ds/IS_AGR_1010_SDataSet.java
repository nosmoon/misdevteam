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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_1010_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_b = new ArrayList();
	public ArrayList curlist_a = new ArrayList();
	public String errcode;
	public String errmsg;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String rvord_dt;
	public String scat_dt;
	public String rvord_type;
	public String advcs_tel_no;
	public String dlco_clsf_cd_seq;
	public String dlco_nm;
	public String advcs_cd;
	public String advcs_cd_nm;
	public String advt_nm;
	public String indt_cd;
	public String indt_cd_nm;
	public String sale_clsf;
	public String spc_sale_clsf;
	public String std_cd;
	public String std_cd_nm;
	public String sms_send_req_yn;
	public String sms_ptph_no;
	public String prof_docu_clsf;
	public String trust_letter_resn;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String vatclsf;
	public String rtax_yn;
	public String uprc_clsf;
	public String qunt;
	public String std_uprc;
	public String uprc;
	public String suply_amt;
	public String vat_amt;
	public String tot_rvord_amt;
	public String suply_pers_erplace_cd;
	public String remk;
	public String feed_req_matt;
	public String fix_yn;
	public String isewh_yn;
	public String bnch_qty;
	public String reg_point_unrcp_pass_dds;
	public String reg_point_unrcp_amt;
	public String deal_resn;
	public String clamt_mthd;
	public String sale_dlco_li_yn;
	public String sale_dlco_li_suply_amt;
	public String sale_dlco_li_vat;
	public String sale_dlco_tot;
	public String clamt_plan_dt;
	public String chg_pers;
	public String chg_dt_tm;
	public String scat_qty;
	public String remain_qty;

	public IS_AGR_1010_SDataSet(){}
	public IS_AGR_1010_SDataSet(String errcode, String errmsg, String acwr_reg_dt, String acwr_reg_seq, String rvord_dt, String scat_dt, String rvord_type, String advcs_tel_no, String dlco_clsf_cd_seq, String dlco_nm, String advcs_cd, String advcs_cd_nm, String advt_nm, String indt_cd, String indt_cd_nm, String sale_clsf, String spc_sale_clsf, String std_cd, String std_cd_nm, String sms_send_req_yn, String sms_ptph_no, String prof_docu_clsf, String trust_letter_resn, String dept_cd, String sub_dept_cd, String chrg_pers, String chrg_pers_nm, String vatclsf, String rtax_yn, String uprc_clsf, String qunt, String std_uprc, String uprc, String suply_amt, String vat_amt, String tot_rvord_amt, String suply_pers_erplace_cd, String remk, String feed_req_matt, String fix_yn, String isewh_yn, String bnch_qty, String reg_point_unrcp_pass_dds, String reg_point_unrcp_amt, String deal_resn, String clamt_mthd, String sale_dlco_li_yn, String sale_dlco_li_suply_amt, String sale_dlco_li_vat, String sale_dlco_tot, String clamt_plan_dt, String chg_pers, String chg_dt_tm, String scat_qty, String remain_qty){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.acwr_reg_dt = acwr_reg_dt;
		this.acwr_reg_seq = acwr_reg_seq;
		this.rvord_dt = rvord_dt;
		this.scat_dt = scat_dt;
		this.rvord_type = rvord_type;
		this.advcs_tel_no = advcs_tel_no;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.dlco_nm = dlco_nm;
		this.advcs_cd = advcs_cd;
		this.advcs_cd_nm = advcs_cd_nm;
		this.advt_nm = advt_nm;
		this.indt_cd = indt_cd;
		this.indt_cd_nm = indt_cd_nm;
		this.sale_clsf = sale_clsf;
		this.spc_sale_clsf = spc_sale_clsf;
		this.std_cd = std_cd;
		this.std_cd_nm = std_cd_nm;
		this.sms_send_req_yn = sms_send_req_yn;
		this.sms_ptph_no = sms_ptph_no;
		this.prof_docu_clsf = prof_docu_clsf;
		this.trust_letter_resn = trust_letter_resn;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.chrg_pers_nm = chrg_pers_nm;
		this.vatclsf = vatclsf;
		this.rtax_yn = rtax_yn;
		this.uprc_clsf = uprc_clsf;
		this.qunt = qunt;
		this.std_uprc = std_uprc;
		this.uprc = uprc;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.tot_rvord_amt = tot_rvord_amt;
		this.suply_pers_erplace_cd = suply_pers_erplace_cd;
		this.remk = remk;
		this.feed_req_matt = feed_req_matt;
		this.fix_yn = fix_yn;
		this.isewh_yn = isewh_yn;
		this.bnch_qty = bnch_qty;
		this.reg_point_unrcp_pass_dds = reg_point_unrcp_pass_dds;
		this.reg_point_unrcp_amt = reg_point_unrcp_amt;
		this.deal_resn = deal_resn;
		this.clamt_mthd = clamt_mthd;
		this.sale_dlco_li_yn = sale_dlco_li_yn;
		this.sale_dlco_li_suply_amt = sale_dlco_li_suply_amt;
		this.sale_dlco_li_vat = sale_dlco_li_vat;
		this.sale_dlco_tot = sale_dlco_tot;
		this.clamt_plan_dt = clamt_plan_dt;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
		this.scat_qty = scat_qty;
		this.remain_qty = remain_qty;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setRvord_dt(String rvord_dt){
		this.rvord_dt = rvord_dt;
	}

	public void setScat_dt(String scat_dt){
		this.scat_dt = scat_dt;
	}

	public void setRvord_type(String rvord_type){
		this.rvord_type = rvord_type;
	}

	public void setAdvcs_tel_no(String advcs_tel_no){
		this.advcs_tel_no = advcs_tel_no;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public void setIndt_cd_nm(String indt_cd_nm){
		this.indt_cd_nm = indt_cd_nm;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSpc_sale_clsf(String spc_sale_clsf){
		this.spc_sale_clsf = spc_sale_clsf;
	}

	public void setStd_cd(String std_cd){
		this.std_cd = std_cd;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setSms_send_req_yn(String sms_send_req_yn){
		this.sms_send_req_yn = sms_send_req_yn;
	}

	public void setSms_ptph_no(String sms_ptph_no){
		this.sms_ptph_no = sms_ptph_no;
	}

	public void setProf_docu_clsf(String prof_docu_clsf){
		this.prof_docu_clsf = prof_docu_clsf;
	}

	public void setTrust_letter_resn(String trust_letter_resn){
		this.trust_letter_resn = trust_letter_resn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setVatclsf(String vatclsf){
		this.vatclsf = vatclsf;
	}

	public void setRtax_yn(String rtax_yn){
		this.rtax_yn = rtax_yn;
	}

	public void setUprc_clsf(String uprc_clsf){
		this.uprc_clsf = uprc_clsf;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setStd_uprc(String std_uprc){
		this.std_uprc = std_uprc;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTot_rvord_amt(String tot_rvord_amt){
		this.tot_rvord_amt = tot_rvord_amt;
	}

	public void setSuply_pers_erplace_cd(String suply_pers_erplace_cd){
		this.suply_pers_erplace_cd = suply_pers_erplace_cd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setFeed_req_matt(String feed_req_matt){
		this.feed_req_matt = feed_req_matt;
	}

	public void setFix_yn(String fix_yn){
		this.fix_yn = fix_yn;
	}

	public void setIsewh_yn(String isewh_yn){
		this.isewh_yn = isewh_yn;
	}

	public void setBnch_qty(String bnch_qty){
		this.bnch_qty = bnch_qty;
	}

	public void setReg_point_unrcp_pass_dds(String reg_point_unrcp_pass_dds){
		this.reg_point_unrcp_pass_dds = reg_point_unrcp_pass_dds;
	}

	public void setReg_point_unrcp_amt(String reg_point_unrcp_amt){
		this.reg_point_unrcp_amt = reg_point_unrcp_amt;
	}

	public void setDeal_resn(String deal_resn){
		this.deal_resn = deal_resn;
	}

	public void setClamt_mthd(String clamt_mthd){
		this.clamt_mthd = clamt_mthd;
	}

	public void setSale_dlco_li_yn(String sale_dlco_li_yn){
		this.sale_dlco_li_yn = sale_dlco_li_yn;
	}

	public void setSale_dlco_li_suply_amt(String sale_dlco_li_suply_amt){
		this.sale_dlco_li_suply_amt = sale_dlco_li_suply_amt;
	}

	public void setSale_dlco_li_vat(String sale_dlco_li_vat){
		this.sale_dlco_li_vat = sale_dlco_li_vat;
	}

	public void setSale_dlco_tot(String sale_dlco_tot){
		this.sale_dlco_tot = sale_dlco_tot;
	}

	public void setClamt_plan_dt(String clamt_plan_dt){
		this.clamt_plan_dt = clamt_plan_dt;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setScat_qty(String scat_qty){
		this.scat_qty = scat_qty;
	}

	public void setRemain_qty(String remain_qty){
		this.remain_qty = remain_qty;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getRvord_dt(){
		return this.rvord_dt;
	}

	public String getScat_dt(){
		return this.scat_dt;
	}

	public String getRvord_type(){
		return this.rvord_type;
	}

	public String getAdvcs_tel_no(){
		return this.advcs_tel_no;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getIndt_cd_nm(){
		return this.indt_cd_nm;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSpc_sale_clsf(){
		return this.spc_sale_clsf;
	}

	public String getStd_cd(){
		return this.std_cd;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getSms_send_req_yn(){
		return this.sms_send_req_yn;
	}

	public String getSms_ptph_no(){
		return this.sms_ptph_no;
	}

	public String getProf_docu_clsf(){
		return this.prof_docu_clsf;
	}

	public String getTrust_letter_resn(){
		return this.trust_letter_resn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getVatclsf(){
		return this.vatclsf;
	}

	public String getRtax_yn(){
		return this.rtax_yn;
	}

	public String getUprc_clsf(){
		return this.uprc_clsf;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getStd_uprc(){
		return this.std_uprc;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTot_rvord_amt(){
		return this.tot_rvord_amt;
	}

	public String getSuply_pers_erplace_cd(){
		return this.suply_pers_erplace_cd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getFeed_req_matt(){
		return this.feed_req_matt;
	}

	public String getFix_yn(){
		return this.fix_yn;
	}

	public String getIsewh_yn(){
		return this.isewh_yn;
	}

	public String getBnch_qty(){
		return this.bnch_qty;
	}

	public String getReg_point_unrcp_pass_dds(){
		return this.reg_point_unrcp_pass_dds;
	}

	public String getReg_point_unrcp_amt(){
		return this.reg_point_unrcp_amt;
	}

	public String getDeal_resn(){
		return this.deal_resn;
	}

	public String getClamt_mthd(){
		return this.clamt_mthd;
	}

	public String getSale_dlco_li_yn(){
		return this.sale_dlco_li_yn;
	}

	public String getSale_dlco_li_suply_amt(){
		return this.sale_dlco_li_suply_amt;
	}

	public String getSale_dlco_li_vat(){
		return this.sale_dlco_li_vat;
	}

	public String getSale_dlco_tot(){
		return this.sale_dlco_tot;
	}

	public String getClamt_plan_dt(){
		return this.clamt_plan_dt;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getScat_qty(){
		return this.scat_qty;
	}

	public String getRemain_qty(){
		return this.remain_qty;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.acwr_reg_dt = Util.checkString(cstmt.getString(7));
		this.acwr_reg_seq = Util.checkString(cstmt.getString(8));
		this.rvord_dt = Util.checkString(cstmt.getString(9));
		this.scat_dt = Util.checkString(cstmt.getString(10));
		this.rvord_type = Util.checkString(cstmt.getString(11));
		this.advcs_tel_no = Util.checkString(cstmt.getString(12));
		this.dlco_clsf_cd_seq = Util.checkString(cstmt.getString(13));
		this.dlco_nm = Util.checkString(cstmt.getString(14));
		this.advcs_cd = Util.checkString(cstmt.getString(15));
		this.advcs_cd_nm = Util.checkString(cstmt.getString(16));
		this.advt_nm = Util.checkString(cstmt.getString(17));
		this.indt_cd = Util.checkString(cstmt.getString(18));
		this.indt_cd_nm = Util.checkString(cstmt.getString(19));
		this.sale_clsf = Util.checkString(cstmt.getString(20));
		this.spc_sale_clsf = Util.checkString(cstmt.getString(21));
		this.std_cd = Util.checkString(cstmt.getString(22));
		this.std_cd_nm = Util.checkString(cstmt.getString(23));
		this.sms_send_req_yn = Util.checkString(cstmt.getString(24));
		this.sms_ptph_no = Util.checkString(cstmt.getString(25));
		this.prof_docu_clsf = Util.checkString(cstmt.getString(26));
		this.trust_letter_resn = Util.checkString(cstmt.getString(27));
		this.dept_cd = Util.checkString(cstmt.getString(28));
		this.sub_dept_cd = Util.checkString(cstmt.getString(29));
		this.chrg_pers = Util.checkString(cstmt.getString(30));
		this.chrg_pers_nm = Util.checkString(cstmt.getString(31));
		this.vatclsf = Util.checkString(cstmt.getString(32));
		this.rtax_yn = Util.checkString(cstmt.getString(33));
		this.uprc_clsf = Util.checkString(cstmt.getString(34));
		this.qunt = Util.checkString(cstmt.getString(35));
		this.std_uprc = Util.checkString(cstmt.getString(36));
		this.uprc = Util.checkString(cstmt.getString(37));
		this.suply_amt = Util.checkString(cstmt.getString(38));
		this.vat_amt = Util.checkString(cstmt.getString(39));
		this.tot_rvord_amt = Util.checkString(cstmt.getString(40));
		this.suply_pers_erplace_cd = Util.checkString(cstmt.getString(41));
		this.remk = Util.checkString(cstmt.getString(42));
		this.feed_req_matt = Util.checkString(cstmt.getString(43));
		this.fix_yn = Util.checkString(cstmt.getString(44));
		this.isewh_yn = Util.checkString(cstmt.getString(45));
		this.bnch_qty = Util.checkString(cstmt.getString(46));
		this.reg_point_unrcp_pass_dds = Util.checkString(cstmt.getString(47));
		this.reg_point_unrcp_amt = Util.checkString(cstmt.getString(48));
		this.deal_resn = Util.checkString(cstmt.getString(49));
		this.clamt_mthd = Util.checkString(cstmt.getString(50));
		this.sale_dlco_li_yn = Util.checkString(cstmt.getString(51));
		this.sale_dlco_li_suply_amt = Util.checkString(cstmt.getString(52));
		this.sale_dlco_li_vat = Util.checkString(cstmt.getString(53));
		this.sale_dlco_tot = Util.checkString(cstmt.getString(54));
		this.clamt_plan_dt = Util.checkString(cstmt.getString(55));
		this.chg_pers = Util.checkString(cstmt.getString(56));
		this.chg_dt_tm = Util.checkString(cstmt.getString(57));
		this.scat_qty = Util.checkString(cstmt.getString(58));
		this.remain_qty = Util.checkString(cstmt.getString(59));
		ResultSet rset0 = (ResultSet) cstmt.getObject(60);
		while(rset0.next()){
			IS_AGR_1010_SCURLIST_ARecord rec = new IS_AGR_1010_SCURLIST_ARecord();
			rec.decid_pre_seq = Util.checkString(rset0.getString("decid_pre_seq"));
			rec.decid_pers = Util.checkString(rset0.getString("decid_pers"));
			rec.decid_pers_nm = Util.checkString(rset0.getString("decid_pers_nm"));
			rec.decid_pers_dty_cd = Util.checkString(rset0.getString("decid_pers_dty_cd"));
			rec.decid_pers_dty_cd_nm = Util.checkString(rset0.getString("decid_pers_dty_cd_nm"));
			rec.decid_yn = Util.checkString(rset0.getString("decid_yn"));
			rec.aprv_step_yn = Util.checkString(rset0.getString("aprv_step_yn"));
			rec.proc_dt = Util.checkString(rset0.getString("proc_dt"));
			this.curlist_a.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(61);
		while(rset1.next()){
			IS_AGR_1010_SCURLIST_BRecord rec = new IS_AGR_1010_SCURLIST_BRecord();
			rec.a_purc_reg_dt = Util.checkString(rset1.getString("a_purc_reg_dt"));
			rec.a_purc_reg_seq = Util.checkString(rset1.getString("a_purc_reg_seq"));
			rec.a_asnt_dstc_cd = Util.checkString(rset1.getString("a_asnt_dstc_cd"));
			rec.a_asnt_dstc_cd_nm = Util.checkString(rset1.getString("a_asnt_dstc_cd_nm"));
			rec.a_dlco_clsf_cd_seq = Util.checkString(rset1.getString("a_dlco_clsf_cd_seq"));
			rec.a_dlco_nm = Util.checkString(rset1.getString("a_dlco_nm"));
			rec.a_purc_clsf = Util.checkString(rset1.getString("a_purc_clsf"));
			rec.a_uprc = Util.checkString(rset1.getString("a_uprc"));
			rec.a_qunt = Util.checkString(rset1.getString("a_qunt"));
			rec.a_send_qty = Util.checkString(rset1.getString("a_send_qty"));
			rec.a_purc_amt = Util.checkString(rset1.getString("a_purc_amt"));
			rec.a_trc_yn = Util.checkString(rset1.getString("a_trc_yn"));
			rec.a_send_yn = Util.checkString(rset1.getString("a_send_yn"));
			rec.a_remk = Util.checkString(rset1.getString("a_remk"));
			rec.a_adjm_yn = Util.checkString(rset1.getString("a_adjm_yn"));
			rec.a_chg_dt_tm = Util.checkString(rset1.getString("a_chg_dt_tm"));
			this.curlist_b.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_1010_SDataSet ds = (IS_AGR_1010_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_a.size(); i++){
		IS_AGR_1010_SCURLIST_ARecord curlist_aRec = (IS_AGR_1010_SCURLIST_ARecord)ds.curlist_a.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_b.size(); i++){
		IS_AGR_1010_SCURLIST_BRecord curlist_bRec = (IS_AGR_1010_SCURLIST_BRecord)ds.curlist_b.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAcwr_reg_dt()%>
<%= ds.getAcwr_reg_seq()%>
<%= ds.getRvord_dt()%>
<%= ds.getScat_dt()%>
<%= ds.getRvord_type()%>
<%= ds.getAdvcs_tel_no()%>
<%= ds.getDlco_clsf_cd_seq()%>
<%= ds.getDlco_nm()%>
<%= ds.getAdvcs_cd()%>
<%= ds.getAdvcs_cd_nm()%>
<%= ds.getAdvt_nm()%>
<%= ds.getIndt_cd()%>
<%= ds.getIndt_cd_nm()%>
<%= ds.getSale_clsf()%>
<%= ds.getSpc_sale_clsf()%>
<%= ds.getStd_cd()%>
<%= ds.getStd_cd_nm()%>
<%= ds.getSms_send_req_yn()%>
<%= ds.getSms_ptph_no()%>
<%= ds.getProf_docu_clsf()%>
<%= ds.getTrust_letter_resn()%>
<%= ds.getDept_cd()%>
<%= ds.getSub_dept_cd()%>
<%= ds.getChrg_pers()%>
<%= ds.getChrg_pers_nm()%>
<%= ds.getVatclsf()%>
<%= ds.getRtax_yn()%>
<%= ds.getUprc_clsf()%>
<%= ds.getQunt()%>
<%= ds.getStd_uprc()%>
<%= ds.getUprc()%>
<%= ds.getSuply_amt()%>
<%= ds.getVat_amt()%>
<%= ds.getTot_rvord_amt()%>
<%= ds.getSuply_pers_erplace_cd()%>
<%= ds.getRemk()%>
<%= ds.getFeed_req_matt()%>
<%= ds.getFix_yn()%>
<%= ds.getIsewh_yn()%>
<%= ds.getBnch_qty()%>
<%= ds.getReg_point_unrcp_pass_dds()%>
<%= ds.getReg_point_unrcp_amt()%>
<%= ds.getDeal_resn()%>
<%= ds.getClamt_mthd()%>
<%= ds.getSale_dlco_li_yn()%>
<%= ds.getSale_dlco_li_suply_amt()%>
<%= ds.getSale_dlco_li_vat()%>
<%= ds.getSale_dlco_tot()%>
<%= ds.getClamt_plan_dt()%>
<%= ds.getChg_pers()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getScat_qty()%>
<%= ds.getRemain_qty()%>
<%= ds.getCurlist_a()%>
<%= ds.getCurlist_b()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_aRec.decid_pre_seq%>
<%= curlist_aRec.decid_pers%>
<%= curlist_aRec.decid_pers_nm%>
<%= curlist_aRec.decid_pers_dty_cd%>
<%= curlist_aRec.decid_pers_dty_cd_nm%>
<%= curlist_aRec.decid_yn%>
<%= curlist_aRec.aprv_step_yn%>
<%= curlist_aRec.proc_dt%>
<%= curlist_bRec.a_purc_reg_dt%>
<%= curlist_bRec.a_purc_reg_seq%>
<%= curlist_bRec.a_asnt_dstc_cd%>
<%= curlist_bRec.a_asnt_dstc_cd_nm%>
<%= curlist_bRec.a_dlco_clsf_cd_seq%>
<%= curlist_bRec.a_dlco_nm%>
<%= curlist_bRec.a_purc_clsf%>
<%= curlist_bRec.a_uprc%>
<%= curlist_bRec.a_qunt%>
<%= curlist_bRec.a_send_qty%>
<%= curlist_bRec.a_purc_amt%>
<%= curlist_bRec.a_trc_yn%>
<%= curlist_bRec.a_send_yn%>
<%= curlist_bRec.a_remk%>
<%= curlist_bRec.a_adjm_yn%>
<%= curlist_bRec.a_chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 26 13:21:22 KST 2012 */