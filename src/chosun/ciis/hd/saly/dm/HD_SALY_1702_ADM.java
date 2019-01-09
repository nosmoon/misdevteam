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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1702_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String saly_yy;
	public String emp_no;
	public String rslt_pay;
	public String year_alon;
	public String hody_alon;
	public String vgl_fee;
	public String snk_fee;
	public String dd_subj_sel_fee;
	public String cnfr_fee;
	public String real_subj_sel_fee;
	public String erl_prsnt_alon;
	public String movm_fee;
	public String dspch_dd_fee;
	public String cmpy_burd_np_amt;
	public String cmpy_burd_hlth_insr_fee;
	public String cmpy_burd_emp_insr_fee;
	public String cmpy_burd_dist_insr_fee;
	public String corp_card_use_amt;
	public String olcard_use_amt;
	public String welf_card_use_amt;
	public String hlth_chk_sply_amt;
	public String hospz_med_exam_fee;
	public String child_scl_exps;
	public String congr_condl_fee;
	public String paty_insr_fee;
	public String condo_use_cmpy_sply_amt;
	public String posk_edu_fee;
	public String onl_edu_fee;
	public String sclgg_course_edu_fee;
	public String mba_course_edu_fee;
	public String cmpy_sply_stdy_fee;
	public String gc_sply_edu_fee;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_SALY_1702_ADM(){}
	public HD_SALY_1702_ADM(String cmpy_cd, String mode, String saly_yy, String emp_no, String rslt_pay, String year_alon, String hody_alon, String vgl_fee, String snk_fee, String dd_subj_sel_fee, String cnfr_fee, String real_subj_sel_fee, String erl_prsnt_alon, String movm_fee, String dspch_dd_fee, String cmpy_burd_np_amt, String cmpy_burd_hlth_insr_fee, String cmpy_burd_emp_insr_fee, String cmpy_burd_dist_insr_fee, String corp_card_use_amt, String olcard_use_amt, String welf_card_use_amt, String hlth_chk_sply_amt, String hospz_med_exam_fee, String child_scl_exps, String congr_condl_fee, String paty_insr_fee, String condo_use_cmpy_sply_amt, String posk_edu_fee, String onl_edu_fee, String sclgg_course_edu_fee, String mba_course_edu_fee, String cmpy_sply_stdy_fee, String gc_sply_edu_fee, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.saly_yy = saly_yy;
		this.emp_no = emp_no;
		this.rslt_pay = rslt_pay;
		this.year_alon = year_alon;
		this.hody_alon = hody_alon;
		this.vgl_fee = vgl_fee;
		this.snk_fee = snk_fee;
		this.dd_subj_sel_fee = dd_subj_sel_fee;
		this.cnfr_fee = cnfr_fee;
		this.real_subj_sel_fee = real_subj_sel_fee;
		this.erl_prsnt_alon = erl_prsnt_alon;
		this.movm_fee = movm_fee;
		this.dspch_dd_fee = dspch_dd_fee;
		this.cmpy_burd_np_amt = cmpy_burd_np_amt;
		this.cmpy_burd_hlth_insr_fee = cmpy_burd_hlth_insr_fee;
		this.cmpy_burd_emp_insr_fee = cmpy_burd_emp_insr_fee;
		this.cmpy_burd_dist_insr_fee = cmpy_burd_dist_insr_fee;
		this.corp_card_use_amt = corp_card_use_amt;
		this.olcard_use_amt = olcard_use_amt;
		this.welf_card_use_amt = welf_card_use_amt;
		this.hlth_chk_sply_amt = hlth_chk_sply_amt;
		this.hospz_med_exam_fee = hospz_med_exam_fee;
		this.child_scl_exps = child_scl_exps;
		this.congr_condl_fee = congr_condl_fee;
		this.paty_insr_fee = paty_insr_fee;
		this.condo_use_cmpy_sply_amt = condo_use_cmpy_sply_amt;
		this.posk_edu_fee = posk_edu_fee;
		this.onl_edu_fee = onl_edu_fee;
		this.sclgg_course_edu_fee = sclgg_course_edu_fee;
		this.mba_course_edu_fee = mba_course_edu_fee;
		this.cmpy_sply_stdy_fee = cmpy_sply_stdy_fee;
		this.gc_sply_edu_fee = gc_sply_edu_fee;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setRslt_pay(String rslt_pay){
		this.rslt_pay = rslt_pay;
	}

	public void setYear_alon(String year_alon){
		this.year_alon = year_alon;
	}

	public void setHody_alon(String hody_alon){
		this.hody_alon = hody_alon;
	}

	public void setVgl_fee(String vgl_fee){
		this.vgl_fee = vgl_fee;
	}

	public void setSnk_fee(String snk_fee){
		this.snk_fee = snk_fee;
	}

	public void setDd_subj_sel_fee(String dd_subj_sel_fee){
		this.dd_subj_sel_fee = dd_subj_sel_fee;
	}

	public void setCnfr_fee(String cnfr_fee){
		this.cnfr_fee = cnfr_fee;
	}

	public void setReal_subj_sel_fee(String real_subj_sel_fee){
		this.real_subj_sel_fee = real_subj_sel_fee;
	}

	public void setErl_prsnt_alon(String erl_prsnt_alon){
		this.erl_prsnt_alon = erl_prsnt_alon;
	}

	public void setMovm_fee(String movm_fee){
		this.movm_fee = movm_fee;
	}

	public void setDspch_dd_fee(String dspch_dd_fee){
		this.dspch_dd_fee = dspch_dd_fee;
	}

	public void setCmpy_burd_np_amt(String cmpy_burd_np_amt){
		this.cmpy_burd_np_amt = cmpy_burd_np_amt;
	}

	public void setCmpy_burd_hlth_insr_fee(String cmpy_burd_hlth_insr_fee){
		this.cmpy_burd_hlth_insr_fee = cmpy_burd_hlth_insr_fee;
	}

	public void setCmpy_burd_emp_insr_fee(String cmpy_burd_emp_insr_fee){
		this.cmpy_burd_emp_insr_fee = cmpy_burd_emp_insr_fee;
	}

	public void setCmpy_burd_dist_insr_fee(String cmpy_burd_dist_insr_fee){
		this.cmpy_burd_dist_insr_fee = cmpy_burd_dist_insr_fee;
	}

	public void setCorp_card_use_amt(String corp_card_use_amt){
		this.corp_card_use_amt = corp_card_use_amt;
	}

	public void setOlcard_use_amt(String olcard_use_amt){
		this.olcard_use_amt = olcard_use_amt;
	}

	public void setWelf_card_use_amt(String welf_card_use_amt){
		this.welf_card_use_amt = welf_card_use_amt;
	}

	public void setHlth_chk_sply_amt(String hlth_chk_sply_amt){
		this.hlth_chk_sply_amt = hlth_chk_sply_amt;
	}

	public void setHospz_med_exam_fee(String hospz_med_exam_fee){
		this.hospz_med_exam_fee = hospz_med_exam_fee;
	}

	public void setChild_scl_exps(String child_scl_exps){
		this.child_scl_exps = child_scl_exps;
	}

	public void setCongr_condl_fee(String congr_condl_fee){
		this.congr_condl_fee = congr_condl_fee;
	}

	public void setPaty_insr_fee(String paty_insr_fee){
		this.paty_insr_fee = paty_insr_fee;
	}

	public void setCondo_use_cmpy_sply_amt(String condo_use_cmpy_sply_amt){
		this.condo_use_cmpy_sply_amt = condo_use_cmpy_sply_amt;
	}

	public void setPosk_edu_fee(String posk_edu_fee){
		this.posk_edu_fee = posk_edu_fee;
	}

	public void setOnl_edu_fee(String onl_edu_fee){
		this.onl_edu_fee = onl_edu_fee;
	}

	public void setSclgg_course_edu_fee(String sclgg_course_edu_fee){
		this.sclgg_course_edu_fee = sclgg_course_edu_fee;
	}

	public void setMba_course_edu_fee(String mba_course_edu_fee){
		this.mba_course_edu_fee = mba_course_edu_fee;
	}

	public void setCmpy_sply_stdy_fee(String cmpy_sply_stdy_fee){
		this.cmpy_sply_stdy_fee = cmpy_sply_stdy_fee;
	}

	public void setGc_sply_edu_fee(String gc_sply_edu_fee){
		this.gc_sply_edu_fee = gc_sply_edu_fee;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getRslt_pay(){
		return this.rslt_pay;
	}

	public String getYear_alon(){
		return this.year_alon;
	}

	public String getHody_alon(){
		return this.hody_alon;
	}

	public String getVgl_fee(){
		return this.vgl_fee;
	}

	public String getSnk_fee(){
		return this.snk_fee;
	}

	public String getDd_subj_sel_fee(){
		return this.dd_subj_sel_fee;
	}

	public String getCnfr_fee(){
		return this.cnfr_fee;
	}

	public String getReal_subj_sel_fee(){
		return this.real_subj_sel_fee;
	}

	public String getErl_prsnt_alon(){
		return this.erl_prsnt_alon;
	}

	public String getMovm_fee(){
		return this.movm_fee;
	}

	public String getDspch_dd_fee(){
		return this.dspch_dd_fee;
	}

	public String getCmpy_burd_np_amt(){
		return this.cmpy_burd_np_amt;
	}

	public String getCmpy_burd_hlth_insr_fee(){
		return this.cmpy_burd_hlth_insr_fee;
	}

	public String getCmpy_burd_emp_insr_fee(){
		return this.cmpy_burd_emp_insr_fee;
	}

	public String getCmpy_burd_dist_insr_fee(){
		return this.cmpy_burd_dist_insr_fee;
	}

	public String getCorp_card_use_amt(){
		return this.corp_card_use_amt;
	}

	public String getOlcard_use_amt(){
		return this.olcard_use_amt;
	}

	public String getWelf_card_use_amt(){
		return this.welf_card_use_amt;
	}

	public String getHlth_chk_sply_amt(){
		return this.hlth_chk_sply_amt;
	}

	public String getHospz_med_exam_fee(){
		return this.hospz_med_exam_fee;
	}

	public String getChild_scl_exps(){
		return this.child_scl_exps;
	}

	public String getCongr_condl_fee(){
		return this.congr_condl_fee;
	}

	public String getPaty_insr_fee(){
		return this.paty_insr_fee;
	}

	public String getCondo_use_cmpy_sply_amt(){
		return this.condo_use_cmpy_sply_amt;
	}

	public String getPosk_edu_fee(){
		return this.posk_edu_fee;
	}

	public String getOnl_edu_fee(){
		return this.onl_edu_fee;
	}

	public String getSclgg_course_edu_fee(){
		return this.sclgg_course_edu_fee;
	}

	public String getMba_course_edu_fee(){
		return this.mba_course_edu_fee;
	}

	public String getCmpy_sply_stdy_fee(){
		return this.cmpy_sply_stdy_fee;
	}

	public String getGc_sply_edu_fee(){
		return this.gc_sply_edu_fee;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_1702_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_1702_ADM dm = (HD_SALY_1702_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.saly_yy);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.rslt_pay);
		cstmt.setString(8, dm.year_alon);
		cstmt.setString(9, dm.hody_alon);
		cstmt.setString(10, dm.vgl_fee);
		cstmt.setString(11, dm.snk_fee);
		cstmt.setString(12, dm.dd_subj_sel_fee);
		cstmt.setString(13, dm.cnfr_fee);
		cstmt.setString(14, dm.real_subj_sel_fee);
		cstmt.setString(15, dm.erl_prsnt_alon);
		cstmt.setString(16, dm.movm_fee);
		cstmt.setString(17, dm.dspch_dd_fee);
		cstmt.setString(18, dm.cmpy_burd_np_amt);
		cstmt.setString(19, dm.cmpy_burd_hlth_insr_fee);
		cstmt.setString(20, dm.cmpy_burd_emp_insr_fee);
		cstmt.setString(21, dm.cmpy_burd_dist_insr_fee);
		cstmt.setString(22, dm.corp_card_use_amt);
		cstmt.setString(23, dm.olcard_use_amt);
		cstmt.setString(24, dm.welf_card_use_amt);
		cstmt.setString(25, dm.hlth_chk_sply_amt);
		cstmt.setString(26, dm.hospz_med_exam_fee);
		cstmt.setString(27, dm.child_scl_exps);
		cstmt.setString(28, dm.congr_condl_fee);
		cstmt.setString(29, dm.paty_insr_fee);
		cstmt.setString(30, dm.condo_use_cmpy_sply_amt);
		cstmt.setString(31, dm.posk_edu_fee);
		cstmt.setString(32, dm.onl_edu_fee);
		cstmt.setString(33, dm.sclgg_course_edu_fee);
		cstmt.setString(34, dm.mba_course_edu_fee);
		cstmt.setString(35, dm.cmpy_sply_stdy_fee);
		cstmt.setString(36, dm.gc_sply_edu_fee);
		cstmt.setString(37, dm.incmg_pers_ipadd);
		cstmt.setString(38, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_1702_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("saly_yy = [" + getSaly_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("rslt_pay = [" + getRslt_pay() + "]");
		System.out.println("year_alon = [" + getYear_alon() + "]");
		System.out.println("hody_alon = [" + getHody_alon() + "]");
		System.out.println("vgl_fee = [" + getVgl_fee() + "]");
		System.out.println("snk_fee = [" + getSnk_fee() + "]");
		System.out.println("dd_subj_sel_fee = [" + getDd_subj_sel_fee() + "]");
		System.out.println("cnfr_fee = [" + getCnfr_fee() + "]");
		System.out.println("real_subj_sel_fee = [" + getReal_subj_sel_fee() + "]");
		System.out.println("erl_prsnt_alon = [" + getErl_prsnt_alon() + "]");
		System.out.println("movm_fee = [" + getMovm_fee() + "]");
		System.out.println("dspch_dd_fee = [" + getDspch_dd_fee() + "]");
		System.out.println("cmpy_burd_np_amt = [" + getCmpy_burd_np_amt() + "]");
		System.out.println("cmpy_burd_hlth_insr_fee = [" + getCmpy_burd_hlth_insr_fee() + "]");
		System.out.println("cmpy_burd_emp_insr_fee = [" + getCmpy_burd_emp_insr_fee() + "]");
		System.out.println("cmpy_burd_dist_insr_fee = [" + getCmpy_burd_dist_insr_fee() + "]");
		System.out.println("corp_card_use_amt = [" + getCorp_card_use_amt() + "]");
		System.out.println("olcard_use_amt = [" + getOlcard_use_amt() + "]");
		System.out.println("welf_card_use_amt = [" + getWelf_card_use_amt() + "]");
		System.out.println("hlth_chk_sply_amt = [" + getHlth_chk_sply_amt() + "]");
		System.out.println("hospz_med_exam_fee = [" + getHospz_med_exam_fee() + "]");
		System.out.println("child_scl_exps = [" + getChild_scl_exps() + "]");
		System.out.println("congr_condl_fee = [" + getCongr_condl_fee() + "]");
		System.out.println("paty_insr_fee = [" + getPaty_insr_fee() + "]");
		System.out.println("condo_use_cmpy_sply_amt = [" + getCondo_use_cmpy_sply_amt() + "]");
		System.out.println("posk_edu_fee = [" + getPosk_edu_fee() + "]");
		System.out.println("onl_edu_fee = [" + getOnl_edu_fee() + "]");
		System.out.println("sclgg_course_edu_fee = [" + getSclgg_course_edu_fee() + "]");
		System.out.println("mba_course_edu_fee = [" + getMba_course_edu_fee() + "]");
		System.out.println("cmpy_sply_stdy_fee = [" + getCmpy_sply_stdy_fee() + "]");
		System.out.println("gc_sply_edu_fee = [" + getGc_sply_edu_fee() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String saly_yy = req.getParameter("saly_yy");
if( saly_yy == null){
	System.out.println(this.toString+" : saly_yy is null" );
}else{
	System.out.println(this.toString+" : saly_yy is "+saly_yy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String rslt_pay = req.getParameter("rslt_pay");
if( rslt_pay == null){
	System.out.println(this.toString+" : rslt_pay is null" );
}else{
	System.out.println(this.toString+" : rslt_pay is "+rslt_pay );
}
String year_alon = req.getParameter("year_alon");
if( year_alon == null){
	System.out.println(this.toString+" : year_alon is null" );
}else{
	System.out.println(this.toString+" : year_alon is "+year_alon );
}
String hody_alon = req.getParameter("hody_alon");
if( hody_alon == null){
	System.out.println(this.toString+" : hody_alon is null" );
}else{
	System.out.println(this.toString+" : hody_alon is "+hody_alon );
}
String vgl_fee = req.getParameter("vgl_fee");
if( vgl_fee == null){
	System.out.println(this.toString+" : vgl_fee is null" );
}else{
	System.out.println(this.toString+" : vgl_fee is "+vgl_fee );
}
String snk_fee = req.getParameter("snk_fee");
if( snk_fee == null){
	System.out.println(this.toString+" : snk_fee is null" );
}else{
	System.out.println(this.toString+" : snk_fee is "+snk_fee );
}
String dd_subj_sel_fee = req.getParameter("dd_subj_sel_fee");
if( dd_subj_sel_fee == null){
	System.out.println(this.toString+" : dd_subj_sel_fee is null" );
}else{
	System.out.println(this.toString+" : dd_subj_sel_fee is "+dd_subj_sel_fee );
}
String cnfr_fee = req.getParameter("cnfr_fee");
if( cnfr_fee == null){
	System.out.println(this.toString+" : cnfr_fee is null" );
}else{
	System.out.println(this.toString+" : cnfr_fee is "+cnfr_fee );
}
String real_subj_sel_fee = req.getParameter("real_subj_sel_fee");
if( real_subj_sel_fee == null){
	System.out.println(this.toString+" : real_subj_sel_fee is null" );
}else{
	System.out.println(this.toString+" : real_subj_sel_fee is "+real_subj_sel_fee );
}
String erl_prsnt_alon = req.getParameter("erl_prsnt_alon");
if( erl_prsnt_alon == null){
	System.out.println(this.toString+" : erl_prsnt_alon is null" );
}else{
	System.out.println(this.toString+" : erl_prsnt_alon is "+erl_prsnt_alon );
}
String movm_fee = req.getParameter("movm_fee");
if( movm_fee == null){
	System.out.println(this.toString+" : movm_fee is null" );
}else{
	System.out.println(this.toString+" : movm_fee is "+movm_fee );
}
String dspch_dd_fee = req.getParameter("dspch_dd_fee");
if( dspch_dd_fee == null){
	System.out.println(this.toString+" : dspch_dd_fee is null" );
}else{
	System.out.println(this.toString+" : dspch_dd_fee is "+dspch_dd_fee );
}
String cmpy_burd_np_amt = req.getParameter("cmpy_burd_np_amt");
if( cmpy_burd_np_amt == null){
	System.out.println(this.toString+" : cmpy_burd_np_amt is null" );
}else{
	System.out.println(this.toString+" : cmpy_burd_np_amt is "+cmpy_burd_np_amt );
}
String cmpy_burd_hlth_insr_fee = req.getParameter("cmpy_burd_hlth_insr_fee");
if( cmpy_burd_hlth_insr_fee == null){
	System.out.println(this.toString+" : cmpy_burd_hlth_insr_fee is null" );
}else{
	System.out.println(this.toString+" : cmpy_burd_hlth_insr_fee is "+cmpy_burd_hlth_insr_fee );
}
String cmpy_burd_emp_insr_fee = req.getParameter("cmpy_burd_emp_insr_fee");
if( cmpy_burd_emp_insr_fee == null){
	System.out.println(this.toString+" : cmpy_burd_emp_insr_fee is null" );
}else{
	System.out.println(this.toString+" : cmpy_burd_emp_insr_fee is "+cmpy_burd_emp_insr_fee );
}
String cmpy_burd_dist_insr_fee = req.getParameter("cmpy_burd_dist_insr_fee");
if( cmpy_burd_dist_insr_fee == null){
	System.out.println(this.toString+" : cmpy_burd_dist_insr_fee is null" );
}else{
	System.out.println(this.toString+" : cmpy_burd_dist_insr_fee is "+cmpy_burd_dist_insr_fee );
}
String corp_card_use_amt = req.getParameter("corp_card_use_amt");
if( corp_card_use_amt == null){
	System.out.println(this.toString+" : corp_card_use_amt is null" );
}else{
	System.out.println(this.toString+" : corp_card_use_amt is "+corp_card_use_amt );
}
String olcard_use_amt = req.getParameter("olcard_use_amt");
if( olcard_use_amt == null){
	System.out.println(this.toString+" : olcard_use_amt is null" );
}else{
	System.out.println(this.toString+" : olcard_use_amt is "+olcard_use_amt );
}
String welf_card_use_amt = req.getParameter("welf_card_use_amt");
if( welf_card_use_amt == null){
	System.out.println(this.toString+" : welf_card_use_amt is null" );
}else{
	System.out.println(this.toString+" : welf_card_use_amt is "+welf_card_use_amt );
}
String hlth_chk_sply_amt = req.getParameter("hlth_chk_sply_amt");
if( hlth_chk_sply_amt == null){
	System.out.println(this.toString+" : hlth_chk_sply_amt is null" );
}else{
	System.out.println(this.toString+" : hlth_chk_sply_amt is "+hlth_chk_sply_amt );
}
String hospz_med_exam_fee = req.getParameter("hospz_med_exam_fee");
if( hospz_med_exam_fee == null){
	System.out.println(this.toString+" : hospz_med_exam_fee is null" );
}else{
	System.out.println(this.toString+" : hospz_med_exam_fee is "+hospz_med_exam_fee );
}
String child_scl_exps = req.getParameter("child_scl_exps");
if( child_scl_exps == null){
	System.out.println(this.toString+" : child_scl_exps is null" );
}else{
	System.out.println(this.toString+" : child_scl_exps is "+child_scl_exps );
}
String congr_condl_fee = req.getParameter("congr_condl_fee");
if( congr_condl_fee == null){
	System.out.println(this.toString+" : congr_condl_fee is null" );
}else{
	System.out.println(this.toString+" : congr_condl_fee is "+congr_condl_fee );
}
String paty_insr_fee = req.getParameter("paty_insr_fee");
if( paty_insr_fee == null){
	System.out.println(this.toString+" : paty_insr_fee is null" );
}else{
	System.out.println(this.toString+" : paty_insr_fee is "+paty_insr_fee );
}
String condo_use_cmpy_sply_amt = req.getParameter("condo_use_cmpy_sply_amt");
if( condo_use_cmpy_sply_amt == null){
	System.out.println(this.toString+" : condo_use_cmpy_sply_amt is null" );
}else{
	System.out.println(this.toString+" : condo_use_cmpy_sply_amt is "+condo_use_cmpy_sply_amt );
}
String posk_edu_fee = req.getParameter("posk_edu_fee");
if( posk_edu_fee == null){
	System.out.println(this.toString+" : posk_edu_fee is null" );
}else{
	System.out.println(this.toString+" : posk_edu_fee is "+posk_edu_fee );
}
String onl_edu_fee = req.getParameter("onl_edu_fee");
if( onl_edu_fee == null){
	System.out.println(this.toString+" : onl_edu_fee is null" );
}else{
	System.out.println(this.toString+" : onl_edu_fee is "+onl_edu_fee );
}
String sclgg_course_edu_fee = req.getParameter("sclgg_course_edu_fee");
if( sclgg_course_edu_fee == null){
	System.out.println(this.toString+" : sclgg_course_edu_fee is null" );
}else{
	System.out.println(this.toString+" : sclgg_course_edu_fee is "+sclgg_course_edu_fee );
}
String mba_course_edu_fee = req.getParameter("mba_course_edu_fee");
if( mba_course_edu_fee == null){
	System.out.println(this.toString+" : mba_course_edu_fee is null" );
}else{
	System.out.println(this.toString+" : mba_course_edu_fee is "+mba_course_edu_fee );
}
String cmpy_sply_stdy_fee = req.getParameter("cmpy_sply_stdy_fee");
if( cmpy_sply_stdy_fee == null){
	System.out.println(this.toString+" : cmpy_sply_stdy_fee is null" );
}else{
	System.out.println(this.toString+" : cmpy_sply_stdy_fee is "+cmpy_sply_stdy_fee );
}
String gc_sply_edu_fee = req.getParameter("gc_sply_edu_fee");
if( gc_sply_edu_fee == null){
	System.out.println(this.toString+" : gc_sply_edu_fee is null" );
}else{
	System.out.println(this.toString+" : gc_sply_edu_fee is "+gc_sply_edu_fee );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String saly_yy = Util.checkString(req.getParameter("saly_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String rslt_pay = Util.checkString(req.getParameter("rslt_pay"));
String year_alon = Util.checkString(req.getParameter("year_alon"));
String hody_alon = Util.checkString(req.getParameter("hody_alon"));
String vgl_fee = Util.checkString(req.getParameter("vgl_fee"));
String snk_fee = Util.checkString(req.getParameter("snk_fee"));
String dd_subj_sel_fee = Util.checkString(req.getParameter("dd_subj_sel_fee"));
String cnfr_fee = Util.checkString(req.getParameter("cnfr_fee"));
String real_subj_sel_fee = Util.checkString(req.getParameter("real_subj_sel_fee"));
String erl_prsnt_alon = Util.checkString(req.getParameter("erl_prsnt_alon"));
String movm_fee = Util.checkString(req.getParameter("movm_fee"));
String dspch_dd_fee = Util.checkString(req.getParameter("dspch_dd_fee"));
String cmpy_burd_np_amt = Util.checkString(req.getParameter("cmpy_burd_np_amt"));
String cmpy_burd_hlth_insr_fee = Util.checkString(req.getParameter("cmpy_burd_hlth_insr_fee"));
String cmpy_burd_emp_insr_fee = Util.checkString(req.getParameter("cmpy_burd_emp_insr_fee"));
String cmpy_burd_dist_insr_fee = Util.checkString(req.getParameter("cmpy_burd_dist_insr_fee"));
String corp_card_use_amt = Util.checkString(req.getParameter("corp_card_use_amt"));
String olcard_use_amt = Util.checkString(req.getParameter("olcard_use_amt"));
String welf_card_use_amt = Util.checkString(req.getParameter("welf_card_use_amt"));
String hlth_chk_sply_amt = Util.checkString(req.getParameter("hlth_chk_sply_amt"));
String hospz_med_exam_fee = Util.checkString(req.getParameter("hospz_med_exam_fee"));
String child_scl_exps = Util.checkString(req.getParameter("child_scl_exps"));
String congr_condl_fee = Util.checkString(req.getParameter("congr_condl_fee"));
String paty_insr_fee = Util.checkString(req.getParameter("paty_insr_fee"));
String condo_use_cmpy_sply_amt = Util.checkString(req.getParameter("condo_use_cmpy_sply_amt"));
String posk_edu_fee = Util.checkString(req.getParameter("posk_edu_fee"));
String onl_edu_fee = Util.checkString(req.getParameter("onl_edu_fee"));
String sclgg_course_edu_fee = Util.checkString(req.getParameter("sclgg_course_edu_fee"));
String mba_course_edu_fee = Util.checkString(req.getParameter("mba_course_edu_fee"));
String cmpy_sply_stdy_fee = Util.checkString(req.getParameter("cmpy_sply_stdy_fee"));
String gc_sply_edu_fee = Util.checkString(req.getParameter("gc_sply_edu_fee"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String rslt_pay = Util.Uni2Ksc(Util.checkString(req.getParameter("rslt_pay")));
String year_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("year_alon")));
String hody_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_alon")));
String vgl_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("vgl_fee")));
String snk_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("snk_fee")));
String dd_subj_sel_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_subj_sel_fee")));
String cnfr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfr_fee")));
String real_subj_sel_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("real_subj_sel_fee")));
String erl_prsnt_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("erl_prsnt_alon")));
String movm_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("movm_fee")));
String dspch_dd_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("dspch_dd_fee")));
String cmpy_burd_np_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_burd_np_amt")));
String cmpy_burd_hlth_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_burd_hlth_insr_fee")));
String cmpy_burd_emp_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_burd_emp_insr_fee")));
String cmpy_burd_dist_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_burd_dist_insr_fee")));
String corp_card_use_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("corp_card_use_amt")));
String olcard_use_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("olcard_use_amt")));
String welf_card_use_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("welf_card_use_amt")));
String hlth_chk_sply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hlth_chk_sply_amt")));
String hospz_med_exam_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("hospz_med_exam_fee")));
String child_scl_exps = Util.Uni2Ksc(Util.checkString(req.getParameter("child_scl_exps")));
String congr_condl_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_fee")));
String paty_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("paty_insr_fee")));
String condo_use_cmpy_sply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("condo_use_cmpy_sply_amt")));
String posk_edu_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("posk_edu_fee")));
String onl_edu_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("onl_edu_fee")));
String sclgg_course_edu_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("sclgg_course_edu_fee")));
String mba_course_edu_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("mba_course_edu_fee")));
String cmpy_sply_stdy_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_sply_stdy_fee")));
String gc_sply_edu_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("gc_sply_edu_fee")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setSaly_yy(saly_yy);
dm.setEmp_no(emp_no);
dm.setRslt_pay(rslt_pay);
dm.setYear_alon(year_alon);
dm.setHody_alon(hody_alon);
dm.setVgl_fee(vgl_fee);
dm.setSnk_fee(snk_fee);
dm.setDd_subj_sel_fee(dd_subj_sel_fee);
dm.setCnfr_fee(cnfr_fee);
dm.setReal_subj_sel_fee(real_subj_sel_fee);
dm.setErl_prsnt_alon(erl_prsnt_alon);
dm.setMovm_fee(movm_fee);
dm.setDspch_dd_fee(dspch_dd_fee);
dm.setCmpy_burd_np_amt(cmpy_burd_np_amt);
dm.setCmpy_burd_hlth_insr_fee(cmpy_burd_hlth_insr_fee);
dm.setCmpy_burd_emp_insr_fee(cmpy_burd_emp_insr_fee);
dm.setCmpy_burd_dist_insr_fee(cmpy_burd_dist_insr_fee);
dm.setCorp_card_use_amt(corp_card_use_amt);
dm.setOlcard_use_amt(olcard_use_amt);
dm.setWelf_card_use_amt(welf_card_use_amt);
dm.setHlth_chk_sply_amt(hlth_chk_sply_amt);
dm.setHospz_med_exam_fee(hospz_med_exam_fee);
dm.setChild_scl_exps(child_scl_exps);
dm.setCongr_condl_fee(congr_condl_fee);
dm.setPaty_insr_fee(paty_insr_fee);
dm.setCondo_use_cmpy_sply_amt(condo_use_cmpy_sply_amt);
dm.setPosk_edu_fee(posk_edu_fee);
dm.setOnl_edu_fee(onl_edu_fee);
dm.setSclgg_course_edu_fee(sclgg_course_edu_fee);
dm.setMba_course_edu_fee(mba_course_edu_fee);
dm.setCmpy_sply_stdy_fee(cmpy_sply_stdy_fee);
dm.setGc_sply_edu_fee(gc_sply_edu_fee);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 26 16:33:39 KST 2009 */