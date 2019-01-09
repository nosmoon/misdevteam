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


package chosun.ciis.is.agr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.ds.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_1015_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
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
	public String incmg_pers_ip;
	public String incmg_pers;
	public String clamt_plan_dt;
	public String no_purc_yn;
	public String a_mode;
	public String a_purc_reg_dt;
	public String a_purc_reg_seq;
	public String a_asnt_dstc_cd;
	public String a_dlco_clsf_cd_seq;
	public String a_purc_clsf;
	public String a_uprc;
	public String a_send_qty;
	public String a_send_rate;
	public String a_qunt;
	public String a_purc_amt;
	public String a_trc_yn;
	public String a_send_yn;
	public String a_remk;

	public IS_AGR_1015_ADM(){}
	public IS_AGR_1015_ADM(String flag, String cmpy_cd, String acwr_reg_dt, String acwr_reg_seq, String rvord_dt, String scat_dt, String rvord_type, String advcs_tel_no, String dlco_clsf_cd_seq, String dlco_nm, String advcs_cd, String advcs_cd_nm, String advt_nm, String indt_cd, String indt_cd_nm, String sale_clsf, String spc_sale_clsf, String std_cd, String std_cd_nm, String sms_send_req_yn, String sms_ptph_no, String prof_docu_clsf, String trust_letter_resn, String dept_cd, String sub_dept_cd, String chrg_pers, String chrg_pers_nm, String vatclsf, String rtax_yn, String uprc_clsf, String qunt, String std_uprc, String uprc, String suply_amt, String vat_amt, String tot_rvord_amt, String suply_pers_erplace_cd, String remk, String feed_req_matt, String fix_yn, String isewh_yn, String bnch_qty, String reg_point_unrcp_pass_dds, String reg_point_unrcp_amt, String deal_resn, String clamt_mthd, String incmg_pers_ip, String incmg_pers, String clamt_plan_dt, String no_purc_yn, String a_mode, String a_purc_reg_dt, String a_purc_reg_seq, String a_asnt_dstc_cd, String a_dlco_clsf_cd_seq, String a_purc_clsf, String a_uprc, String a_send_qty, String a_send_rate, String a_qunt, String a_purc_amt, String a_trc_yn, String a_send_yn, String a_remk){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
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
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.clamt_plan_dt = clamt_plan_dt;
		this.no_purc_yn = no_purc_yn;
		this.a_mode = a_mode;
		this.a_purc_reg_dt = a_purc_reg_dt;
		this.a_purc_reg_seq = a_purc_reg_seq;
		this.a_asnt_dstc_cd = a_asnt_dstc_cd;
		this.a_dlco_clsf_cd_seq = a_dlco_clsf_cd_seq;
		this.a_purc_clsf = a_purc_clsf;
		this.a_uprc = a_uprc;
		this.a_send_qty = a_send_qty;
		this.a_send_rate = a_send_rate;
		this.a_qunt = a_qunt;
		this.a_purc_amt = a_purc_amt;
		this.a_trc_yn = a_trc_yn;
		this.a_send_yn = a_send_yn;
		this.a_remk = a_remk;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setClamt_plan_dt(String clamt_plan_dt){
		this.clamt_plan_dt = clamt_plan_dt;
	}

	public void setNo_purc_yn(String no_purc_yn){
		this.no_purc_yn = no_purc_yn;
	}

	public void setA_mode(String a_mode){
		this.a_mode = a_mode;
	}

	public void setA_purc_reg_dt(String a_purc_reg_dt){
		this.a_purc_reg_dt = a_purc_reg_dt;
	}

	public void setA_purc_reg_seq(String a_purc_reg_seq){
		this.a_purc_reg_seq = a_purc_reg_seq;
	}

	public void setA_asnt_dstc_cd(String a_asnt_dstc_cd){
		this.a_asnt_dstc_cd = a_asnt_dstc_cd;
	}

	public void setA_dlco_clsf_cd_seq(String a_dlco_clsf_cd_seq){
		this.a_dlco_clsf_cd_seq = a_dlco_clsf_cd_seq;
	}

	public void setA_purc_clsf(String a_purc_clsf){
		this.a_purc_clsf = a_purc_clsf;
	}

	public void setA_uprc(String a_uprc){
		this.a_uprc = a_uprc;
	}

	public void setA_send_qty(String a_send_qty){
		this.a_send_qty = a_send_qty;
	}

	public void setA_send_rate(String a_send_rate){
		this.a_send_rate = a_send_rate;
	}

	public void setA_qunt(String a_qunt){
		this.a_qunt = a_qunt;
	}

	public void setA_purc_amt(String a_purc_amt){
		this.a_purc_amt = a_purc_amt;
	}

	public void setA_trc_yn(String a_trc_yn){
		this.a_trc_yn = a_trc_yn;
	}

	public void setA_send_yn(String a_send_yn){
		this.a_send_yn = a_send_yn;
	}

	public void setA_remk(String a_remk){
		this.a_remk = a_remk;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getClamt_plan_dt(){
		return this.clamt_plan_dt;
	}

	public String getNo_purc_yn(){
		return this.no_purc_yn;
	}

	public String getA_mode(){
		return this.a_mode;
	}

	public String getA_purc_reg_dt(){
		return this.a_purc_reg_dt;
	}

	public String getA_purc_reg_seq(){
		return this.a_purc_reg_seq;
	}

	public String getA_asnt_dstc_cd(){
		return this.a_asnt_dstc_cd;
	}

	public String getA_dlco_clsf_cd_seq(){
		return this.a_dlco_clsf_cd_seq;
	}

	public String getA_purc_clsf(){
		return this.a_purc_clsf;
	}

	public String getA_uprc(){
		return this.a_uprc;
	}

	public String getA_send_qty(){
		return this.a_send_qty;
	}

	public String getA_send_rate(){
		return this.a_send_rate;
	}

	public String getA_qunt(){
		return this.a_qunt;
	}

	public String getA_purc_amt(){
		return this.a_purc_amt;
	}

	public String getA_trc_yn(){
		return this.a_trc_yn;
	}

	public String getA_send_yn(){
		return this.a_send_yn;
	}

	public String getA_remk(){
		return this.a_remk;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_AGR_1015_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_AGR_1015_ADM dm = (IS_AGR_1015_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.acwr_reg_dt);
		cstmt.setString(6, dm.acwr_reg_seq);
		cstmt.setString(7, dm.rvord_dt);
		cstmt.setString(8, dm.scat_dt);
		cstmt.setString(9, dm.rvord_type);
		cstmt.setString(10, dm.advcs_tel_no);
		cstmt.setString(11, dm.dlco_clsf_cd_seq);
		cstmt.setString(12, dm.dlco_nm);
		cstmt.setString(13, dm.advcs_cd);
		cstmt.setString(14, dm.advcs_cd_nm);
		cstmt.setString(15, dm.advt_nm);
		cstmt.setString(16, dm.indt_cd);
		cstmt.setString(17, dm.indt_cd_nm);
		cstmt.setString(18, dm.sale_clsf);
		cstmt.setString(19, dm.spc_sale_clsf);
		cstmt.setString(20, dm.std_cd);
		cstmt.setString(21, dm.std_cd_nm);
		cstmt.setString(22, dm.sms_send_req_yn);
		cstmt.setString(23, dm.sms_ptph_no);
		cstmt.setString(24, dm.prof_docu_clsf);
		cstmt.setString(25, dm.trust_letter_resn);
		cstmt.setString(26, dm.dept_cd);
		cstmt.setString(27, dm.sub_dept_cd);
		cstmt.setString(28, dm.chrg_pers);
		cstmt.setString(29, dm.chrg_pers_nm);
		cstmt.setString(30, dm.vatclsf);
		cstmt.setString(31, dm.rtax_yn);
		cstmt.setString(32, dm.uprc_clsf);
		cstmt.setString(33, dm.qunt);
		cstmt.setString(34, dm.std_uprc);
		cstmt.setString(35, dm.uprc);
		cstmt.setString(36, dm.suply_amt);
		cstmt.setString(37, dm.vat_amt);
		cstmt.setString(38, dm.tot_rvord_amt);
		cstmt.setString(39, dm.suply_pers_erplace_cd);
		cstmt.setString(40, dm.remk);
		cstmt.setString(41, dm.feed_req_matt);
		cstmt.setString(42, dm.fix_yn);
		cstmt.setString(43, dm.isewh_yn);
		cstmt.setString(44, dm.bnch_qty);
		cstmt.setString(45, dm.reg_point_unrcp_pass_dds);
		cstmt.setString(46, dm.reg_point_unrcp_amt);
		cstmt.setString(47, dm.deal_resn);
		cstmt.setString(48, dm.clamt_mthd);
		cstmt.setString(49, dm.incmg_pers_ip);
		cstmt.setString(50, dm.incmg_pers);
		cstmt.setString(51, dm.clamt_plan_dt);
		cstmt.setString(52, dm.no_purc_yn);
		cstmt.setString(53, dm.a_mode);
		cstmt.setString(54, dm.a_purc_reg_dt);
		cstmt.setString(55, dm.a_purc_reg_seq);
		cstmt.setString(56, dm.a_asnt_dstc_cd);
		cstmt.setString(57, dm.a_dlco_clsf_cd_seq);
		cstmt.setString(58, dm.a_purc_clsf);
		cstmt.setString(59, dm.a_uprc);
		cstmt.setString(60, dm.a_send_qty);
		cstmt.setString(61, dm.a_send_rate);
		cstmt.setString(62, dm.a_qunt);
		cstmt.setString(63, dm.a_purc_amt);
		cstmt.setString(64, dm.a_trc_yn);
		cstmt.setString(65, dm.a_send_yn);
		cstmt.setString(66, dm.a_remk);
		cstmt.registerOutParameter(67, Types.VARCHAR);
		cstmt.registerOutParameter(68, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.agr.ds.IS_AGR_1015_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acwr_reg_dt = [" + getAcwr_reg_dt() + "]");
		System.out.println("acwr_reg_seq = [" + getAcwr_reg_seq() + "]");
		System.out.println("rvord_dt = [" + getRvord_dt() + "]");
		System.out.println("scat_dt = [" + getScat_dt() + "]");
		System.out.println("rvord_type = [" + getRvord_type() + "]");
		System.out.println("advcs_tel_no = [" + getAdvcs_tel_no() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("advcs_cd = [" + getAdvcs_cd() + "]");
		System.out.println("advcs_cd_nm = [" + getAdvcs_cd_nm() + "]");
		System.out.println("advt_nm = [" + getAdvt_nm() + "]");
		System.out.println("indt_cd = [" + getIndt_cd() + "]");
		System.out.println("indt_cd_nm = [" + getIndt_cd_nm() + "]");
		System.out.println("sale_clsf = [" + getSale_clsf() + "]");
		System.out.println("spc_sale_clsf = [" + getSpc_sale_clsf() + "]");
		System.out.println("std_cd = [" + getStd_cd() + "]");
		System.out.println("std_cd_nm = [" + getStd_cd_nm() + "]");
		System.out.println("sms_send_req_yn = [" + getSms_send_req_yn() + "]");
		System.out.println("sms_ptph_no = [" + getSms_ptph_no() + "]");
		System.out.println("prof_docu_clsf = [" + getProf_docu_clsf() + "]");
		System.out.println("trust_letter_resn = [" + getTrust_letter_resn() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("chrg_pers_nm = [" + getChrg_pers_nm() + "]");
		System.out.println("vatclsf = [" + getVatclsf() + "]");
		System.out.println("rtax_yn = [" + getRtax_yn() + "]");
		System.out.println("uprc_clsf = [" + getUprc_clsf() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("std_uprc = [" + getStd_uprc() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("tot_rvord_amt = [" + getTot_rvord_amt() + "]");
		System.out.println("suply_pers_erplace_cd = [" + getSuply_pers_erplace_cd() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("feed_req_matt = [" + getFeed_req_matt() + "]");
		System.out.println("fix_yn = [" + getFix_yn() + "]");
		System.out.println("isewh_yn = [" + getIsewh_yn() + "]");
		System.out.println("bnch_qty = [" + getBnch_qty() + "]");
		System.out.println("reg_point_unrcp_pass_dds = [" + getReg_point_unrcp_pass_dds() + "]");
		System.out.println("reg_point_unrcp_amt = [" + getReg_point_unrcp_amt() + "]");
		System.out.println("deal_resn = [" + getDeal_resn() + "]");
		System.out.println("clamt_mthd = [" + getClamt_mthd() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("clamt_plan_dt = [" + getClamt_plan_dt() + "]");
		System.out.println("no_purc_yn = [" + getNo_purc_yn() + "]");
		System.out.println("a_mode = [" + getA_mode() + "]");
		System.out.println("a_purc_reg_dt = [" + getA_purc_reg_dt() + "]");
		System.out.println("a_purc_reg_seq = [" + getA_purc_reg_seq() + "]");
		System.out.println("a_asnt_dstc_cd = [" + getA_asnt_dstc_cd() + "]");
		System.out.println("a_dlco_clsf_cd_seq = [" + getA_dlco_clsf_cd_seq() + "]");
		System.out.println("a_purc_clsf = [" + getA_purc_clsf() + "]");
		System.out.println("a_uprc = [" + getA_uprc() + "]");
		System.out.println("a_send_qty = [" + getA_send_qty() + "]");
		System.out.println("a_send_rate = [" + getA_send_rate() + "]");
		System.out.println("a_qunt = [" + getA_qunt() + "]");
		System.out.println("a_purc_amt = [" + getA_purc_amt() + "]");
		System.out.println("a_trc_yn = [" + getA_trc_yn() + "]");
		System.out.println("a_send_yn = [" + getA_send_yn() + "]");
		System.out.println("a_remk = [" + getA_remk() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String acwr_reg_dt = req.getParameter("acwr_reg_dt");
if( acwr_reg_dt == null){
	System.out.println(this.toString+" : acwr_reg_dt is null" );
}else{
	System.out.println(this.toString+" : acwr_reg_dt is "+acwr_reg_dt );
}
String acwr_reg_seq = req.getParameter("acwr_reg_seq");
if( acwr_reg_seq == null){
	System.out.println(this.toString+" : acwr_reg_seq is null" );
}else{
	System.out.println(this.toString+" : acwr_reg_seq is "+acwr_reg_seq );
}
String rvord_dt = req.getParameter("rvord_dt");
if( rvord_dt == null){
	System.out.println(this.toString+" : rvord_dt is null" );
}else{
	System.out.println(this.toString+" : rvord_dt is "+rvord_dt );
}
String scat_dt = req.getParameter("scat_dt");
if( scat_dt == null){
	System.out.println(this.toString+" : scat_dt is null" );
}else{
	System.out.println(this.toString+" : scat_dt is "+scat_dt );
}
String rvord_type = req.getParameter("rvord_type");
if( rvord_type == null){
	System.out.println(this.toString+" : rvord_type is null" );
}else{
	System.out.println(this.toString+" : rvord_type is "+rvord_type );
}
String advcs_tel_no = req.getParameter("advcs_tel_no");
if( advcs_tel_no == null){
	System.out.println(this.toString+" : advcs_tel_no is null" );
}else{
	System.out.println(this.toString+" : advcs_tel_no is "+advcs_tel_no );
}
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String advcs_cd = req.getParameter("advcs_cd");
if( advcs_cd == null){
	System.out.println(this.toString+" : advcs_cd is null" );
}else{
	System.out.println(this.toString+" : advcs_cd is "+advcs_cd );
}
String advcs_cd_nm = req.getParameter("advcs_cd_nm");
if( advcs_cd_nm == null){
	System.out.println(this.toString+" : advcs_cd_nm is null" );
}else{
	System.out.println(this.toString+" : advcs_cd_nm is "+advcs_cd_nm );
}
String advt_nm = req.getParameter("advt_nm");
if( advt_nm == null){
	System.out.println(this.toString+" : advt_nm is null" );
}else{
	System.out.println(this.toString+" : advt_nm is "+advt_nm );
}
String indt_cd = req.getParameter("indt_cd");
if( indt_cd == null){
	System.out.println(this.toString+" : indt_cd is null" );
}else{
	System.out.println(this.toString+" : indt_cd is "+indt_cd );
}
String indt_cd_nm = req.getParameter("indt_cd_nm");
if( indt_cd_nm == null){
	System.out.println(this.toString+" : indt_cd_nm is null" );
}else{
	System.out.println(this.toString+" : indt_cd_nm is "+indt_cd_nm );
}
String sale_clsf = req.getParameter("sale_clsf");
if( sale_clsf == null){
	System.out.println(this.toString+" : sale_clsf is null" );
}else{
	System.out.println(this.toString+" : sale_clsf is "+sale_clsf );
}
String spc_sale_clsf = req.getParameter("spc_sale_clsf");
if( spc_sale_clsf == null){
	System.out.println(this.toString+" : spc_sale_clsf is null" );
}else{
	System.out.println(this.toString+" : spc_sale_clsf is "+spc_sale_clsf );
}
String std_cd = req.getParameter("std_cd");
if( std_cd == null){
	System.out.println(this.toString+" : std_cd is null" );
}else{
	System.out.println(this.toString+" : std_cd is "+std_cd );
}
String std_cd_nm = req.getParameter("std_cd_nm");
if( std_cd_nm == null){
	System.out.println(this.toString+" : std_cd_nm is null" );
}else{
	System.out.println(this.toString+" : std_cd_nm is "+std_cd_nm );
}
String sms_send_req_yn = req.getParameter("sms_send_req_yn");
if( sms_send_req_yn == null){
	System.out.println(this.toString+" : sms_send_req_yn is null" );
}else{
	System.out.println(this.toString+" : sms_send_req_yn is "+sms_send_req_yn );
}
String sms_ptph_no = req.getParameter("sms_ptph_no");
if( sms_ptph_no == null){
	System.out.println(this.toString+" : sms_ptph_no is null" );
}else{
	System.out.println(this.toString+" : sms_ptph_no is "+sms_ptph_no );
}
String prof_docu_clsf = req.getParameter("prof_docu_clsf");
if( prof_docu_clsf == null){
	System.out.println(this.toString+" : prof_docu_clsf is null" );
}else{
	System.out.println(this.toString+" : prof_docu_clsf is "+prof_docu_clsf );
}
String trust_letter_resn = req.getParameter("trust_letter_resn");
if( trust_letter_resn == null){
	System.out.println(this.toString+" : trust_letter_resn is null" );
}else{
	System.out.println(this.toString+" : trust_letter_resn is "+trust_letter_resn );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String chrg_pers_nm = req.getParameter("chrg_pers_nm");
if( chrg_pers_nm == null){
	System.out.println(this.toString+" : chrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_nm is "+chrg_pers_nm );
}
String vatclsf = req.getParameter("vatclsf");
if( vatclsf == null){
	System.out.println(this.toString+" : vatclsf is null" );
}else{
	System.out.println(this.toString+" : vatclsf is "+vatclsf );
}
String rtax_yn = req.getParameter("rtax_yn");
if( rtax_yn == null){
	System.out.println(this.toString+" : rtax_yn is null" );
}else{
	System.out.println(this.toString+" : rtax_yn is "+rtax_yn );
}
String uprc_clsf = req.getParameter("uprc_clsf");
if( uprc_clsf == null){
	System.out.println(this.toString+" : uprc_clsf is null" );
}else{
	System.out.println(this.toString+" : uprc_clsf is "+uprc_clsf );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String std_uprc = req.getParameter("std_uprc");
if( std_uprc == null){
	System.out.println(this.toString+" : std_uprc is null" );
}else{
	System.out.println(this.toString+" : std_uprc is "+std_uprc );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String tot_rvord_amt = req.getParameter("tot_rvord_amt");
if( tot_rvord_amt == null){
	System.out.println(this.toString+" : tot_rvord_amt is null" );
}else{
	System.out.println(this.toString+" : tot_rvord_amt is "+tot_rvord_amt );
}
String suply_pers_erplace_cd = req.getParameter("suply_pers_erplace_cd");
if( suply_pers_erplace_cd == null){
	System.out.println(this.toString+" : suply_pers_erplace_cd is null" );
}else{
	System.out.println(this.toString+" : suply_pers_erplace_cd is "+suply_pers_erplace_cd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String feed_req_matt = req.getParameter("feed_req_matt");
if( feed_req_matt == null){
	System.out.println(this.toString+" : feed_req_matt is null" );
}else{
	System.out.println(this.toString+" : feed_req_matt is "+feed_req_matt );
}
String fix_yn = req.getParameter("fix_yn");
if( fix_yn == null){
	System.out.println(this.toString+" : fix_yn is null" );
}else{
	System.out.println(this.toString+" : fix_yn is "+fix_yn );
}
String isewh_yn = req.getParameter("isewh_yn");
if( isewh_yn == null){
	System.out.println(this.toString+" : isewh_yn is null" );
}else{
	System.out.println(this.toString+" : isewh_yn is "+isewh_yn );
}
String bnch_qty = req.getParameter("bnch_qty");
if( bnch_qty == null){
	System.out.println(this.toString+" : bnch_qty is null" );
}else{
	System.out.println(this.toString+" : bnch_qty is "+bnch_qty );
}
String reg_point_unrcp_pass_dds = req.getParameter("reg_point_unrcp_pass_dds");
if( reg_point_unrcp_pass_dds == null){
	System.out.println(this.toString+" : reg_point_unrcp_pass_dds is null" );
}else{
	System.out.println(this.toString+" : reg_point_unrcp_pass_dds is "+reg_point_unrcp_pass_dds );
}
String reg_point_unrcp_amt = req.getParameter("reg_point_unrcp_amt");
if( reg_point_unrcp_amt == null){
	System.out.println(this.toString+" : reg_point_unrcp_amt is null" );
}else{
	System.out.println(this.toString+" : reg_point_unrcp_amt is "+reg_point_unrcp_amt );
}
String deal_resn = req.getParameter("deal_resn");
if( deal_resn == null){
	System.out.println(this.toString+" : deal_resn is null" );
}else{
	System.out.println(this.toString+" : deal_resn is "+deal_resn );
}
String clamt_mthd = req.getParameter("clamt_mthd");
if( clamt_mthd == null){
	System.out.println(this.toString+" : clamt_mthd is null" );
}else{
	System.out.println(this.toString+" : clamt_mthd is "+clamt_mthd );
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
String clamt_plan_dt = req.getParameter("clamt_plan_dt");
if( clamt_plan_dt == null){
	System.out.println(this.toString+" : clamt_plan_dt is null" );
}else{
	System.out.println(this.toString+" : clamt_plan_dt is "+clamt_plan_dt );
}
String no_purc_yn = req.getParameter("no_purc_yn");
if( no_purc_yn == null){
	System.out.println(this.toString+" : no_purc_yn is null" );
}else{
	System.out.println(this.toString+" : no_purc_yn is "+no_purc_yn );
}
String a_mode = req.getParameter("a_mode");
if( a_mode == null){
	System.out.println(this.toString+" : a_mode is null" );
}else{
	System.out.println(this.toString+" : a_mode is "+a_mode );
}
String a_purc_reg_dt = req.getParameter("a_purc_reg_dt");
if( a_purc_reg_dt == null){
	System.out.println(this.toString+" : a_purc_reg_dt is null" );
}else{
	System.out.println(this.toString+" : a_purc_reg_dt is "+a_purc_reg_dt );
}
String a_purc_reg_seq = req.getParameter("a_purc_reg_seq");
if( a_purc_reg_seq == null){
	System.out.println(this.toString+" : a_purc_reg_seq is null" );
}else{
	System.out.println(this.toString+" : a_purc_reg_seq is "+a_purc_reg_seq );
}
String a_asnt_dstc_cd = req.getParameter("a_asnt_dstc_cd");
if( a_asnt_dstc_cd == null){
	System.out.println(this.toString+" : a_asnt_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : a_asnt_dstc_cd is "+a_asnt_dstc_cd );
}
String a_dlco_clsf_cd_seq = req.getParameter("a_dlco_clsf_cd_seq");
if( a_dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : a_dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : a_dlco_clsf_cd_seq is "+a_dlco_clsf_cd_seq );
}
String a_purc_clsf = req.getParameter("a_purc_clsf");
if( a_purc_clsf == null){
	System.out.println(this.toString+" : a_purc_clsf is null" );
}else{
	System.out.println(this.toString+" : a_purc_clsf is "+a_purc_clsf );
}
String a_uprc = req.getParameter("a_uprc");
if( a_uprc == null){
	System.out.println(this.toString+" : a_uprc is null" );
}else{
	System.out.println(this.toString+" : a_uprc is "+a_uprc );
}
String a_send_qty = req.getParameter("a_send_qty");
if( a_send_qty == null){
	System.out.println(this.toString+" : a_send_qty is null" );
}else{
	System.out.println(this.toString+" : a_send_qty is "+a_send_qty );
}
String a_send_rate = req.getParameter("a_send_rate");
if( a_send_rate == null){
	System.out.println(this.toString+" : a_send_rate is null" );
}else{
	System.out.println(this.toString+" : a_send_rate is "+a_send_rate );
}
String a_qunt = req.getParameter("a_qunt");
if( a_qunt == null){
	System.out.println(this.toString+" : a_qunt is null" );
}else{
	System.out.println(this.toString+" : a_qunt is "+a_qunt );
}
String a_purc_amt = req.getParameter("a_purc_amt");
if( a_purc_amt == null){
	System.out.println(this.toString+" : a_purc_amt is null" );
}else{
	System.out.println(this.toString+" : a_purc_amt is "+a_purc_amt );
}
String a_trc_yn = req.getParameter("a_trc_yn");
if( a_trc_yn == null){
	System.out.println(this.toString+" : a_trc_yn is null" );
}else{
	System.out.println(this.toString+" : a_trc_yn is "+a_trc_yn );
}
String a_send_yn = req.getParameter("a_send_yn");
if( a_send_yn == null){
	System.out.println(this.toString+" : a_send_yn is null" );
}else{
	System.out.println(this.toString+" : a_send_yn is "+a_send_yn );
}
String a_remk = req.getParameter("a_remk");
if( a_remk == null){
	System.out.println(this.toString+" : a_remk is null" );
}else{
	System.out.println(this.toString+" : a_remk is "+a_remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acwr_reg_dt = Util.checkString(req.getParameter("acwr_reg_dt"));
String acwr_reg_seq = Util.checkString(req.getParameter("acwr_reg_seq"));
String rvord_dt = Util.checkString(req.getParameter("rvord_dt"));
String scat_dt = Util.checkString(req.getParameter("scat_dt"));
String rvord_type = Util.checkString(req.getParameter("rvord_type"));
String advcs_tel_no = Util.checkString(req.getParameter("advcs_tel_no"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
String advcs_cd_nm = Util.checkString(req.getParameter("advcs_cd_nm"));
String advt_nm = Util.checkString(req.getParameter("advt_nm"));
String indt_cd = Util.checkString(req.getParameter("indt_cd"));
String indt_cd_nm = Util.checkString(req.getParameter("indt_cd_nm"));
String sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
String spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
String std_cd = Util.checkString(req.getParameter("std_cd"));
String std_cd_nm = Util.checkString(req.getParameter("std_cd_nm"));
String sms_send_req_yn = Util.checkString(req.getParameter("sms_send_req_yn"));
String sms_ptph_no = Util.checkString(req.getParameter("sms_ptph_no"));
String prof_docu_clsf = Util.checkString(req.getParameter("prof_docu_clsf"));
String trust_letter_resn = Util.checkString(req.getParameter("trust_letter_resn"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String chrg_pers_nm = Util.checkString(req.getParameter("chrg_pers_nm"));
String vatclsf = Util.checkString(req.getParameter("vatclsf"));
String rtax_yn = Util.checkString(req.getParameter("rtax_yn"));
String uprc_clsf = Util.checkString(req.getParameter("uprc_clsf"));
String qunt = Util.checkString(req.getParameter("qunt"));
String std_uprc = Util.checkString(req.getParameter("std_uprc"));
String uprc = Util.checkString(req.getParameter("uprc"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String tot_rvord_amt = Util.checkString(req.getParameter("tot_rvord_amt"));
String suply_pers_erplace_cd = Util.checkString(req.getParameter("suply_pers_erplace_cd"));
String remk = Util.checkString(req.getParameter("remk"));
String feed_req_matt = Util.checkString(req.getParameter("feed_req_matt"));
String fix_yn = Util.checkString(req.getParameter("fix_yn"));
String isewh_yn = Util.checkString(req.getParameter("isewh_yn"));
String bnch_qty = Util.checkString(req.getParameter("bnch_qty"));
String reg_point_unrcp_pass_dds = Util.checkString(req.getParameter("reg_point_unrcp_pass_dds"));
String reg_point_unrcp_amt = Util.checkString(req.getParameter("reg_point_unrcp_amt"));
String deal_resn = Util.checkString(req.getParameter("deal_resn"));
String clamt_mthd = Util.checkString(req.getParameter("clamt_mthd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String clamt_plan_dt = Util.checkString(req.getParameter("clamt_plan_dt"));
String no_purc_yn = Util.checkString(req.getParameter("no_purc_yn"));
String a_mode = Util.checkString(req.getParameter("a_mode"));
String a_purc_reg_dt = Util.checkString(req.getParameter("a_purc_reg_dt"));
String a_purc_reg_seq = Util.checkString(req.getParameter("a_purc_reg_seq"));
String a_asnt_dstc_cd = Util.checkString(req.getParameter("a_asnt_dstc_cd"));
String a_dlco_clsf_cd_seq = Util.checkString(req.getParameter("a_dlco_clsf_cd_seq"));
String a_purc_clsf = Util.checkString(req.getParameter("a_purc_clsf"));
String a_uprc = Util.checkString(req.getParameter("a_uprc"));
String a_send_qty = Util.checkString(req.getParameter("a_send_qty"));
String a_send_rate = Util.checkString(req.getParameter("a_send_rate"));
String a_qunt = Util.checkString(req.getParameter("a_qunt"));
String a_purc_amt = Util.checkString(req.getParameter("a_purc_amt"));
String a_trc_yn = Util.checkString(req.getParameter("a_trc_yn"));
String a_send_yn = Util.checkString(req.getParameter("a_send_yn"));
String a_remk = Util.checkString(req.getParameter("a_remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acwr_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_dt")));
String acwr_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_seq")));
String rvord_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rvord_dt")));
String scat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("scat_dt")));
String rvord_type = Util.Uni2Ksc(Util.checkString(req.getParameter("rvord_type")));
String advcs_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_tel_no")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String advcs_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_cd")));
String advcs_cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_cd_nm")));
String advt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_nm")));
String indt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_cd")));
String indt_cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_cd_nm")));
String sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf")));
String spc_sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_sale_clsf")));
String std_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("std_cd")));
String std_cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("std_cd_nm")));
String sms_send_req_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("sms_send_req_yn")));
String sms_ptph_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sms_ptph_no")));
String prof_docu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_docu_clsf")));
String trust_letter_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("trust_letter_resn")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String chrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_nm")));
String vatclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vatclsf")));
String rtax_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rtax_yn")));
String uprc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_clsf")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String std_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("std_uprc")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String tot_rvord_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_rvord_amt")));
String suply_pers_erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_pers_erplace_cd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String feed_req_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("feed_req_matt")));
String fix_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_yn")));
String isewh_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("isewh_yn")));
String bnch_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("bnch_qty")));
String reg_point_unrcp_pass_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_point_unrcp_pass_dds")));
String reg_point_unrcp_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_point_unrcp_amt")));
String deal_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_resn")));
String clamt_mthd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamt_mthd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String clamt_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clamt_plan_dt")));
String no_purc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("no_purc_yn")));
String a_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("a_mode")));
String a_purc_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_purc_reg_dt")));
String a_purc_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("a_purc_reg_seq")));
String a_asnt_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("a_asnt_dstc_cd")));
String a_dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("a_dlco_clsf_cd_seq")));
String a_purc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("a_purc_clsf")));
String a_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("a_uprc")));
String a_send_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("a_send_qty")));
String a_send_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("a_send_rate")));
String a_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_qunt")));
String a_purc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_purc_amt")));
String a_trc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("a_trc_yn")));
String a_send_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("a_send_yn")));
String a_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("a_remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setAcwr_reg_dt(acwr_reg_dt);
dm.setAcwr_reg_seq(acwr_reg_seq);
dm.setRvord_dt(rvord_dt);
dm.setScat_dt(scat_dt);
dm.setRvord_type(rvord_type);
dm.setAdvcs_tel_no(advcs_tel_no);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setDlco_nm(dlco_nm);
dm.setAdvcs_cd(advcs_cd);
dm.setAdvcs_cd_nm(advcs_cd_nm);
dm.setAdvt_nm(advt_nm);
dm.setIndt_cd(indt_cd);
dm.setIndt_cd_nm(indt_cd_nm);
dm.setSale_clsf(sale_clsf);
dm.setSpc_sale_clsf(spc_sale_clsf);
dm.setStd_cd(std_cd);
dm.setStd_cd_nm(std_cd_nm);
dm.setSms_send_req_yn(sms_send_req_yn);
dm.setSms_ptph_no(sms_ptph_no);
dm.setProf_docu_clsf(prof_docu_clsf);
dm.setTrust_letter_resn(trust_letter_resn);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setChrg_pers_nm(chrg_pers_nm);
dm.setVatclsf(vatclsf);
dm.setRtax_yn(rtax_yn);
dm.setUprc_clsf(uprc_clsf);
dm.setQunt(qunt);
dm.setStd_uprc(std_uprc);
dm.setUprc(uprc);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setTot_rvord_amt(tot_rvord_amt);
dm.setSuply_pers_erplace_cd(suply_pers_erplace_cd);
dm.setRemk(remk);
dm.setFeed_req_matt(feed_req_matt);
dm.setFix_yn(fix_yn);
dm.setIsewh_yn(isewh_yn);
dm.setBnch_qty(bnch_qty);
dm.setReg_point_unrcp_pass_dds(reg_point_unrcp_pass_dds);
dm.setReg_point_unrcp_amt(reg_point_unrcp_amt);
dm.setDeal_resn(deal_resn);
dm.setClamt_mthd(clamt_mthd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setClamt_plan_dt(clamt_plan_dt);
dm.setNo_purc_yn(no_purc_yn);
dm.setA_mode(a_mode);
dm.setA_purc_reg_dt(a_purc_reg_dt);
dm.setA_purc_reg_seq(a_purc_reg_seq);
dm.setA_asnt_dstc_cd(a_asnt_dstc_cd);
dm.setA_dlco_clsf_cd_seq(a_dlco_clsf_cd_seq);
dm.setA_purc_clsf(a_purc_clsf);
dm.setA_uprc(a_uprc);
dm.setA_send_qty(a_send_qty);
dm.setA_send_rate(a_send_rate);
dm.setA_qunt(a_qunt);
dm.setA_purc_amt(a_purc_amt);
dm.setA_trc_yn(a_trc_yn);
dm.setA_send_yn(a_send_yn);
dm.setA_remk(a_remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 07 19:30:31 KST 2013 */