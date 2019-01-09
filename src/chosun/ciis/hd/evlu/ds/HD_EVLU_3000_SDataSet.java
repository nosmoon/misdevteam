/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
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

public class HD_EVLU_3000_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
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
	public String self_evlu_proc_stat;
	public String rfl_ratio_10;
	public String rfl_ratio_20;
	public String slf_achv_desc1;
	public String slf_achv_desc2;

	public HD_EVLU_3000_SDataSet(){}
	public HD_EVLU_3000_SDataSet(String errcode, String errmsg, String dept_nm, String grp_nm1, String grp_nm2, String emp_no, String nm_korn, String asst_cnt, String nm_korn_1tms, String nm_korn_2tms, String evlu_cd, String spc_psdo_redu_scorcnt, String self_evlu_proc_stat, String rfl_ratio_10, String rfl_ratio_20, String slf_achv_desc1, String slf_achv_desc2){
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
		this.self_evlu_proc_stat = self_evlu_proc_stat;
		this.rfl_ratio_10 = rfl_ratio_10;
		this.rfl_ratio_20 = rfl_ratio_20;
		this.slf_achv_desc1 = slf_achv_desc1;
		this.slf_achv_desc2 = slf_achv_desc2;
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

	public void setSelf_evlu_proc_stat(String self_evlu_proc_stat){
		this.self_evlu_proc_stat = self_evlu_proc_stat;
	}

	public void setRfl_ratio_10(String rfl_ratio_10){
		this.rfl_ratio_10 = rfl_ratio_10;
	}

	public void setRfl_ratio_20(String rfl_ratio_20){
		this.rfl_ratio_20 = rfl_ratio_20;
	}

	public void setSlf_achv_desc1(String slf_achv_desc1){
		this.slf_achv_desc1 = slf_achv_desc1;
	}

	public void setSlf_achv_desc2(String slf_achv_desc2){
		this.slf_achv_desc2 = slf_achv_desc2;
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

	public String getSelf_evlu_proc_stat(){
		return this.self_evlu_proc_stat;
	}

	public String getRfl_ratio_10(){
		return this.rfl_ratio_10;
	}

	public String getRfl_ratio_20(){
		return this.rfl_ratio_20;
	}

	public String getSlf_achv_desc1(){
		return this.slf_achv_desc1;
	}

	public String getSlf_achv_desc2(){
		return this.slf_achv_desc2;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
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
		this.self_evlu_proc_stat = Util.checkString(cstmt.getString(17));
		this.rfl_ratio_10 = Util.checkString(cstmt.getString(18));
		this.rfl_ratio_20 = Util.checkString(cstmt.getString(19));
		this.slf_achv_desc1 = Util.checkString(cstmt.getString(20));
		this.slf_achv_desc2 = Util.checkString(cstmt.getString(21));
		ResultSet rset0 = (ResultSet) cstmt.getObject(22);
		while(rset0.next()){
			HD_EVLU_3000_SCURLIST1Record rec = new HD_EVLU_3000_SCURLIST1Record();
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.act_indx_def = Util.checkString(rset0.getString("act_indx_def"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(23);
		while(rset1.next()){
			HD_EVLU_3000_SCURLIST2Record rec = new HD_EVLU_3000_SCURLIST2Record();
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.act_indx_def = Util.checkString(rset1.getString("act_indx_def"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_3000_SDataSet ds = (HD_EVLU_3000_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_EVLU_3000_SCURLIST1Record curlist1Rec = (HD_EVLU_3000_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_EVLU_3000_SCURLIST2Record curlist2Rec = (HD_EVLU_3000_SCURLIST2Record)ds.curlist2.get(i);%>
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
<%= ds.getSelf_evlu_proc_stat()%>
<%= ds.getRfl_ratio_10()%>
<%= ds.getRfl_ratio_20()%>
<%= ds.getSlf_achv_desc1()%>
<%= ds.getSlf_achv_desc2()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cdnm%>
<%= curlist1Rec.act_indx_def%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.act_indx_def%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 27 14:47:44 KST 2009 */