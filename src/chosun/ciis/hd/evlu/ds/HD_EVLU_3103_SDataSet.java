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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3103_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String dept_nm;
	public String grp_nm1;
	public String grp_nm2;
	public String emp_no;
	public String nm_korn;
	public String asst_cnt;
	public String nm_korn_1tms;
	public String nm_korn_2tms;
	public String evlu_cd;
	public String spc_psdo_redu_scorcnt;
	public String evlu_proc_stat_1tms;
	public String evlu_proc_stat_2tms;
	public String rfl_ratio_10;
	public String rfl_ratio_20;
	public String rfl_ratio_30;
	public String rfl_ratio_40;
	public String rfl_ratio_50;
	public String slf_achv_desc1;
	public String slf_achv_desc2;
	public String asst_evlu_grad_cd;
	public String asst_evlu_opn;
	public String busn_rslt_scor;
	public String evlu_part_cd1;
	public String evlu_part_cd2;
	public String evlu_part_cd3;
	public String evlu_part_cd4;
	public String evlu_part_cd5;
	public String evlu_cmpt_opn_1tms;
	public String cmpt_scor;
	public String self_evlu_proc_stat;
	public String asst_evlu_proc_stat;
	public String asst_pnt;
	public String rvis_scor_1tms;

	public HD_EVLU_3103_SDataSet(){}
	public HD_EVLU_3103_SDataSet(String errcode, String errmsg, String dept_nm, String grp_nm1, String grp_nm2, String emp_no, String nm_korn, String asst_cnt, String nm_korn_1tms, String nm_korn_2tms, String evlu_cd, String spc_psdo_redu_scorcnt, String evlu_proc_stat_1tms, String evlu_proc_stat_2tms, String rfl_ratio_10, String rfl_ratio_20, String rfl_ratio_30, String rfl_ratio_40, String rfl_ratio_50, String slf_achv_desc1, String slf_achv_desc2, String asst_evlu_grad_cd, String asst_evlu_opn, String busn_rslt_scor, String evlu_part_cd1, String evlu_part_cd2, String evlu_part_cd3, String evlu_part_cd4, String evlu_part_cd5, String evlu_cmpt_opn_1tms, String cmpt_scor, String self_evlu_proc_stat, String asst_evlu_proc_stat, String asst_pnt, String rvis_scor_1tms){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dept_nm = dept_nm;
		this.grp_nm1 = grp_nm1;
		this.grp_nm2 = grp_nm2;
		this.emp_no = emp_no;
		this.nm_korn = nm_korn;
		this.asst_cnt = asst_cnt;
		this.nm_korn_1tms = nm_korn_1tms;
		this.nm_korn_2tms = nm_korn_2tms;
		this.evlu_cd = evlu_cd;
		this.spc_psdo_redu_scorcnt = spc_psdo_redu_scorcnt;
		this.evlu_proc_stat_1tms = evlu_proc_stat_1tms;
		this.evlu_proc_stat_2tms = evlu_proc_stat_2tms;
		this.rfl_ratio_10 = rfl_ratio_10;
		this.rfl_ratio_20 = rfl_ratio_20;
		this.rfl_ratio_30 = rfl_ratio_30;
		this.rfl_ratio_40 = rfl_ratio_40;
		this.rfl_ratio_50 = rfl_ratio_50;
		this.slf_achv_desc1 = slf_achv_desc1;
		this.slf_achv_desc2 = slf_achv_desc2;
		this.asst_evlu_grad_cd = asst_evlu_grad_cd;
		this.asst_evlu_opn = asst_evlu_opn;
		this.busn_rslt_scor = busn_rslt_scor;
		this.evlu_part_cd1 = evlu_part_cd1;
		this.evlu_part_cd2 = evlu_part_cd2;
		this.evlu_part_cd3 = evlu_part_cd3;
		this.evlu_part_cd4 = evlu_part_cd4;
		this.evlu_part_cd5 = evlu_part_cd5;
		this.evlu_cmpt_opn_1tms = evlu_cmpt_opn_1tms;
		this.cmpt_scor = cmpt_scor;
		this.self_evlu_proc_stat = self_evlu_proc_stat;
		this.asst_evlu_proc_stat = asst_evlu_proc_stat;
		this.asst_pnt = asst_pnt;
		this.rvis_scor_1tms = rvis_scor_1tms;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setGrp_nm1(String grp_nm1){
		this.grp_nm1 = grp_nm1;
	}

	public void setGrp_nm2(String grp_nm2){
		this.grp_nm2 = grp_nm2;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setAsst_cnt(String asst_cnt){
		this.asst_cnt = asst_cnt;
	}

	public void setNm_korn_1tms(String nm_korn_1tms){
		this.nm_korn_1tms = nm_korn_1tms;
	}

	public void setNm_korn_2tms(String nm_korn_2tms){
		this.nm_korn_2tms = nm_korn_2tms;
	}

	public void setEvlu_cd(String evlu_cd){
		this.evlu_cd = evlu_cd;
	}

	public void setSpc_psdo_redu_scorcnt(String spc_psdo_redu_scorcnt){
		this.spc_psdo_redu_scorcnt = spc_psdo_redu_scorcnt;
	}

	public void setEvlu_proc_stat_1tms(String evlu_proc_stat_1tms){
		this.evlu_proc_stat_1tms = evlu_proc_stat_1tms;
	}

	public void setEvlu_proc_stat_2tms(String evlu_proc_stat_2tms){
		this.evlu_proc_stat_2tms = evlu_proc_stat_2tms;
	}

	public void setRfl_ratio_10(String rfl_ratio_10){
		this.rfl_ratio_10 = rfl_ratio_10;
	}

	public void setRfl_ratio_20(String rfl_ratio_20){
		this.rfl_ratio_20 = rfl_ratio_20;
	}

	public void setRfl_ratio_30(String rfl_ratio_30){
		this.rfl_ratio_30 = rfl_ratio_30;
	}

	public void setRfl_ratio_40(String rfl_ratio_40){
		this.rfl_ratio_40 = rfl_ratio_40;
	}

	public void setRfl_ratio_50(String rfl_ratio_50){
		this.rfl_ratio_50 = rfl_ratio_50;
	}

	public void setSlf_achv_desc1(String slf_achv_desc1){
		this.slf_achv_desc1 = slf_achv_desc1;
	}

	public void setSlf_achv_desc2(String slf_achv_desc2){
		this.slf_achv_desc2 = slf_achv_desc2;
	}

	public void setAsst_evlu_grad_cd(String asst_evlu_grad_cd){
		this.asst_evlu_grad_cd = asst_evlu_grad_cd;
	}

	public void setAsst_evlu_opn(String asst_evlu_opn){
		this.asst_evlu_opn = asst_evlu_opn;
	}

	public void setBusn_rslt_scor(String busn_rslt_scor){
		this.busn_rslt_scor = busn_rslt_scor;
	}

	public void setEvlu_part_cd1(String evlu_part_cd1){
		this.evlu_part_cd1 = evlu_part_cd1;
	}

	public void setEvlu_part_cd2(String evlu_part_cd2){
		this.evlu_part_cd2 = evlu_part_cd2;
	}

	public void setEvlu_part_cd3(String evlu_part_cd3){
		this.evlu_part_cd3 = evlu_part_cd3;
	}

	public void setEvlu_part_cd4(String evlu_part_cd4){
		this.evlu_part_cd4 = evlu_part_cd4;
	}

	public void setEvlu_part_cd5(String evlu_part_cd5){
		this.evlu_part_cd5 = evlu_part_cd5;
	}

	public void setEvlu_cmpt_opn_1tms(String evlu_cmpt_opn_1tms){
		this.evlu_cmpt_opn_1tms = evlu_cmpt_opn_1tms;
	}

	public void setCmpt_scor(String cmpt_scor){
		this.cmpt_scor = cmpt_scor;
	}

	public void setSelf_evlu_proc_stat(String self_evlu_proc_stat){
		this.self_evlu_proc_stat = self_evlu_proc_stat;
	}

	public void setAsst_evlu_proc_stat(String asst_evlu_proc_stat){
		this.asst_evlu_proc_stat = asst_evlu_proc_stat;
	}

	public void setAsst_pnt(String asst_pnt){
		this.asst_pnt = asst_pnt;
	}

	public void setRvis_scor_1tms(String rvis_scor_1tms){
		this.rvis_scor_1tms = rvis_scor_1tms;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getGrp_nm1(){
		return this.grp_nm1;
	}

	public String getGrp_nm2(){
		return this.grp_nm2;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getAsst_cnt(){
		return this.asst_cnt;
	}

	public String getNm_korn_1tms(){
		return this.nm_korn_1tms;
	}

	public String getNm_korn_2tms(){
		return this.nm_korn_2tms;
	}

	public String getEvlu_cd(){
		return this.evlu_cd;
	}

	public String getSpc_psdo_redu_scorcnt(){
		return this.spc_psdo_redu_scorcnt;
	}

	public String getEvlu_proc_stat_1tms(){
		return this.evlu_proc_stat_1tms;
	}

	public String getEvlu_proc_stat_2tms(){
		return this.evlu_proc_stat_2tms;
	}

	public String getRfl_ratio_10(){
		return this.rfl_ratio_10;
	}

	public String getRfl_ratio_20(){
		return this.rfl_ratio_20;
	}

	public String getRfl_ratio_30(){
		return this.rfl_ratio_30;
	}

	public String getRfl_ratio_40(){
		return this.rfl_ratio_40;
	}

	public String getRfl_ratio_50(){
		return this.rfl_ratio_50;
	}

	public String getSlf_achv_desc1(){
		return this.slf_achv_desc1;
	}

	public String getSlf_achv_desc2(){
		return this.slf_achv_desc2;
	}

	public String getAsst_evlu_grad_cd(){
		return this.asst_evlu_grad_cd;
	}

	public String getAsst_evlu_opn(){
		return this.asst_evlu_opn;
	}

	public String getBusn_rslt_scor(){
		return this.busn_rslt_scor;
	}

	public String getEvlu_part_cd1(){
		return this.evlu_part_cd1;
	}

	public String getEvlu_part_cd2(){
		return this.evlu_part_cd2;
	}

	public String getEvlu_part_cd3(){
		return this.evlu_part_cd3;
	}

	public String getEvlu_part_cd4(){
		return this.evlu_part_cd4;
	}

	public String getEvlu_part_cd5(){
		return this.evlu_part_cd5;
	}

	public String getEvlu_cmpt_opn_1tms(){
		return this.evlu_cmpt_opn_1tms;
	}

	public String getCmpt_scor(){
		return this.cmpt_scor;
	}

	public String getSelf_evlu_proc_stat(){
		return this.self_evlu_proc_stat;
	}

	public String getAsst_evlu_proc_stat(){
		return this.asst_evlu_proc_stat;
	}

	public String getAsst_pnt(){
		return this.asst_pnt;
	}

	public String getRvis_scor_1tms(){
		return this.rvis_scor_1tms;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dept_nm = Util.checkString(cstmt.getString(7));
		this.grp_nm1 = Util.checkString(cstmt.getString(8));
		this.grp_nm2 = Util.checkString(cstmt.getString(9));
		this.emp_no = Util.checkString(cstmt.getString(10));
		this.nm_korn = Util.checkString(cstmt.getString(11));
		this.asst_cnt = Util.checkString(cstmt.getString(12));
		this.nm_korn_1tms = Util.checkString(cstmt.getString(13));
		this.nm_korn_2tms = Util.checkString(cstmt.getString(14));
		this.evlu_cd = Util.checkString(cstmt.getString(15));
		this.spc_psdo_redu_scorcnt = Util.checkString(cstmt.getString(16));
		this.evlu_proc_stat_1tms = Util.checkString(cstmt.getString(17));
		this.evlu_proc_stat_2tms = Util.checkString(cstmt.getString(18));
		this.rfl_ratio_10 = Util.checkString(cstmt.getString(19));
		this.rfl_ratio_20 = Util.checkString(cstmt.getString(20));
		this.rfl_ratio_30 = Util.checkString(cstmt.getString(21));
		this.rfl_ratio_40 = Util.checkString(cstmt.getString(22));
		this.rfl_ratio_50 = Util.checkString(cstmt.getString(23));
		this.slf_achv_desc1 = Util.checkString(cstmt.getString(24));
		this.slf_achv_desc2 = Util.checkString(cstmt.getString(25));
		ResultSet rset0 = (ResultSet) cstmt.getObject(26);
		while(rset0.next()){
			HD_EVLU_3103_SCURLIST1Record rec = new HD_EVLU_3103_SCURLIST1Record();
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.act_indx_def = Util.checkString(rset0.getString("act_indx_def"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(27);
		while(rset1.next()){
			HD_EVLU_3103_SCURLIST2Record rec = new HD_EVLU_3103_SCURLIST2Record();
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.act_indx_def = Util.checkString(rset1.getString("act_indx_def"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(28);
		while(rset2.next()){
			HD_EVLU_3103_SCURLIST3Record rec = new HD_EVLU_3103_SCURLIST3Record();
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.act_indx_def = Util.checkString(rset2.getString("act_indx_def"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(29);
		while(rset3.next()){
			HD_EVLU_3103_SCURLIST4Record rec = new HD_EVLU_3103_SCURLIST4Record();
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.act_indx_def = Util.checkString(rset3.getString("act_indx_def"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(30);
		while(rset4.next()){
			HD_EVLU_3103_SCURLIST5Record rec = new HD_EVLU_3103_SCURLIST5Record();
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.act_indx_def = Util.checkString(rset4.getString("act_indx_def"));
			this.curlist5.add(rec);
		}
		this.asst_evlu_grad_cd = Util.checkString(cstmt.getString(31));
		this.asst_evlu_opn = Util.checkString(cstmt.getString(32));
		this.busn_rslt_scor = Util.checkString(cstmt.getString(33));
		this.evlu_part_cd1 = Util.checkString(cstmt.getString(34));
		this.evlu_part_cd2 = Util.checkString(cstmt.getString(35));
		this.evlu_part_cd3 = Util.checkString(cstmt.getString(36));
		this.evlu_part_cd4 = Util.checkString(cstmt.getString(37));
		this.evlu_part_cd5 = Util.checkString(cstmt.getString(38));
		this.evlu_cmpt_opn_1tms = Util.checkString(cstmt.getString(39));
		this.cmpt_scor = Util.checkString(cstmt.getString(40));
		this.self_evlu_proc_stat = Util.checkString(cstmt.getString(41));
		this.asst_evlu_proc_stat = Util.checkString(cstmt.getString(42));
		this.asst_pnt = Util.checkString(cstmt.getString(43));
		this.rvis_scor_1tms = Util.checkString(cstmt.getString(44));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_3103_SDataSet ds = (HD_EVLU_3103_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_EVLU_3103_SCURLIST1Record curlist1Rec = (HD_EVLU_3103_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_EVLU_3103_SCURLIST2Record curlist2Rec = (HD_EVLU_3103_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_EVLU_3103_SCURLIST3Record curlist3Rec = (HD_EVLU_3103_SCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_EVLU_3103_SCURLIST4Record curlist4Rec = (HD_EVLU_3103_SCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		HD_EVLU_3103_SCURLIST5Record curlist5Rec = (HD_EVLU_3103_SCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDept_nm()%>
<%= ds.getGrp_nm1()%>
<%= ds.getGrp_nm2()%>
<%= ds.getEmp_no()%>
<%= ds.getNm_korn()%>
<%= ds.getAsst_cnt()%>
<%= ds.getNm_korn_1tms()%>
<%= ds.getNm_korn_2tms()%>
<%= ds.getEvlu_cd()%>
<%= ds.getSpc_psdo_redu_scorcnt()%>
<%= ds.getEvlu_proc_stat_1tms()%>
<%= ds.getEvlu_proc_stat_2tms()%>
<%= ds.getRfl_ratio_10()%>
<%= ds.getRfl_ratio_20()%>
<%= ds.getRfl_ratio_30()%>
<%= ds.getRfl_ratio_40()%>
<%= ds.getRfl_ratio_50()%>
<%= ds.getSlf_achv_desc1()%>
<%= ds.getSlf_achv_desc2()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getAsst_evlu_grad_cd()%>
<%= ds.getAsst_evlu_opn()%>
<%= ds.getBusn_rslt_scor()%>
<%= ds.getEvlu_part_cd1()%>
<%= ds.getEvlu_part_cd2()%>
<%= ds.getEvlu_part_cd3()%>
<%= ds.getEvlu_part_cd4()%>
<%= ds.getEvlu_part_cd5()%>
<%= ds.getEvlu_cmpt_opn_1tms()%>
<%= ds.getCmpt_scor()%>
<%= ds.getSelf_evlu_proc_stat()%>
<%= ds.getAsst_evlu_proc_stat()%>
<%= ds.getAsst_pnt()%>
<%= ds.getRvis_scor_1tms()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cdnm%>
<%= curlist1Rec.act_indx_def%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.act_indx_def%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.act_indx_def%>
<%= curlist4Rec.cdnm%>
<%= curlist4Rec.act_indx_def%>
<%= curlist5Rec.cdnm%>
<%= curlist5Rec.act_indx_def%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 01 21:25:33 KST 2014 */