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


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1420_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String bo_cd;
	public String bo_seq;
	public String srt_seq;
	public String bo_nm;
	public String area_nm;
	public String chrg_flnm;
	public String orgn_clsfnm;
	public String bo_cntr_dt;
	public String bo_expy_dt;
	public String cntr_stat_clsfnm;
	public String jont_debtgurt_limt_amt;
	public String sido_nm;
	public String tel_no_1;
	public String tel_no_2;
	public String bo_zip;
	public String bo_addr;
	public String bo_dtls_addr;
	public String jd_zip;
	public String jd_addr;
	public String jd_dtls_addr;
	public String bo_jurs_nwsp_zip;
	public String bo_jurs_nwsp_addr;
	public String bo_feat_clsf;
	public String bo_mang_grad_clas;
	public String stmt_crte_clsf;
	public String jd_sell_net_clsf;
	public String qty_sell_net_clsf;
	public String dlco_no;

	public SE_BOI_1420_SDataSet(){}
	public SE_BOI_1420_SDataSet(String errcode, String errmsg, String bo_cd, String bo_seq, String srt_seq, String bo_nm, String area_nm, String chrg_flnm, String orgn_clsfnm, String bo_cntr_dt, String bo_expy_dt, String cntr_stat_clsfnm, String jont_debtgurt_limt_amt, String sido_nm, String tel_no_1, String tel_no_2, String bo_zip, String bo_addr, String bo_dtls_addr, String jd_zip, String jd_addr, String jd_dtls_addr, String bo_jurs_nwsp_zip, String bo_jurs_nwsp_addr, String bo_feat_clsf, String bo_mang_grad_clas, String stmt_crte_clsf, String jd_sell_net_clsf, String qty_sell_net_clsf, String dlco_no){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.srt_seq = srt_seq;
		this.bo_nm = bo_nm;
		this.area_nm = area_nm;
		this.chrg_flnm = chrg_flnm;
		this.orgn_clsfnm = orgn_clsfnm;
		this.bo_cntr_dt = bo_cntr_dt;
		this.bo_expy_dt = bo_expy_dt;
		this.cntr_stat_clsfnm = cntr_stat_clsfnm;
		this.jont_debtgurt_limt_amt = jont_debtgurt_limt_amt;
		this.sido_nm = sido_nm;
		this.tel_no_1 = tel_no_1;
		this.tel_no_2 = tel_no_2;
		this.bo_zip = bo_zip;
		this.bo_addr = bo_addr;
		this.bo_dtls_addr = bo_dtls_addr;
		this.jd_zip = jd_zip;
		this.jd_addr = jd_addr;
		this.jd_dtls_addr = jd_dtls_addr;
		this.bo_jurs_nwsp_zip = bo_jurs_nwsp_zip;
		this.bo_jurs_nwsp_addr = bo_jurs_nwsp_addr;
		this.bo_feat_clsf = bo_feat_clsf;
		this.bo_mang_grad_clas = bo_mang_grad_clas;
		this.stmt_crte_clsf = stmt_crte_clsf;
		this.jd_sell_net_clsf = jd_sell_net_clsf;
		this.qty_sell_net_clsf = qty_sell_net_clsf;
		this.dlco_no = dlco_no;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setSrt_seq(String srt_seq){
		this.srt_seq = srt_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setChrg_flnm(String chrg_flnm){
		this.chrg_flnm = chrg_flnm;
	}

	public void setOrgn_clsfnm(String orgn_clsfnm){
		this.orgn_clsfnm = orgn_clsfnm;
	}

	public void setBo_cntr_dt(String bo_cntr_dt){
		this.bo_cntr_dt = bo_cntr_dt;
	}

	public void setBo_expy_dt(String bo_expy_dt){
		this.bo_expy_dt = bo_expy_dt;
	}

	public void setCntr_stat_clsfnm(String cntr_stat_clsfnm){
		this.cntr_stat_clsfnm = cntr_stat_clsfnm;
	}

	public void setJont_debtgurt_limt_amt(String jont_debtgurt_limt_amt){
		this.jont_debtgurt_limt_amt = jont_debtgurt_limt_amt;
	}

	public void setSido_nm(String sido_nm){
		this.sido_nm = sido_nm;
	}

	public void setTel_no_1(String tel_no_1){
		this.tel_no_1 = tel_no_1;
	}

	public void setTel_no_2(String tel_no_2){
		this.tel_no_2 = tel_no_2;
	}

	public void setBo_zip(String bo_zip){
		this.bo_zip = bo_zip;
	}

	public void setBo_addr(String bo_addr){
		this.bo_addr = bo_addr;
	}

	public void setBo_dtls_addr(String bo_dtls_addr){
		this.bo_dtls_addr = bo_dtls_addr;
	}

	public void setJd_zip(String jd_zip){
		this.jd_zip = jd_zip;
	}

	public void setJd_addr(String jd_addr){
		this.jd_addr = jd_addr;
	}

	public void setJd_dtls_addr(String jd_dtls_addr){
		this.jd_dtls_addr = jd_dtls_addr;
	}

	public void setBo_jurs_nwsp_zip(String bo_jurs_nwsp_zip){
		this.bo_jurs_nwsp_zip = bo_jurs_nwsp_zip;
	}

	public void setBo_jurs_nwsp_addr(String bo_jurs_nwsp_addr){
		this.bo_jurs_nwsp_addr = bo_jurs_nwsp_addr;
	}

	public void setBo_feat_clsf(String bo_feat_clsf){
		this.bo_feat_clsf = bo_feat_clsf;
	}

	public void setBo_mang_grad_clas(String bo_mang_grad_clas){
		this.bo_mang_grad_clas = bo_mang_grad_clas;
	}

	public void setStmt_crte_clsf(String stmt_crte_clsf){
		this.stmt_crte_clsf = stmt_crte_clsf;
	}

	public void setJd_sell_net_clsf(String jd_sell_net_clsf){
		this.jd_sell_net_clsf = jd_sell_net_clsf;
	}

	public void setQty_sell_net_clsf(String qty_sell_net_clsf){
		this.qty_sell_net_clsf = qty_sell_net_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getSrt_seq(){
		return this.srt_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getChrg_flnm(){
		return this.chrg_flnm;
	}

	public String getOrgn_clsfnm(){
		return this.orgn_clsfnm;
	}

	public String getBo_cntr_dt(){
		return this.bo_cntr_dt;
	}

	public String getBo_expy_dt(){
		return this.bo_expy_dt;
	}

	public String getCntr_stat_clsfnm(){
		return this.cntr_stat_clsfnm;
	}

	public String getJont_debtgurt_limt_amt(){
		return this.jont_debtgurt_limt_amt;
	}

	public String getSido_nm(){
		return this.sido_nm;
	}

	public String getTel_no_1(){
		return this.tel_no_1;
	}

	public String getTel_no_2(){
		return this.tel_no_2;
	}

	public String getBo_zip(){
		return this.bo_zip;
	}

	public String getBo_addr(){
		return this.bo_addr;
	}

	public String getBo_dtls_addr(){
		return this.bo_dtls_addr;
	}

	public String getJd_zip(){
		return this.jd_zip;
	}

	public String getJd_addr(){
		return this.jd_addr;
	}

	public String getJd_dtls_addr(){
		return this.jd_dtls_addr;
	}

	public String getBo_jurs_nwsp_zip(){
		return this.bo_jurs_nwsp_zip;
	}

	public String getBo_jurs_nwsp_addr(){
		return this.bo_jurs_nwsp_addr;
	}

	public String getBo_feat_clsf(){
		return this.bo_feat_clsf;
	}

	public String getBo_mang_grad_clas(){
		return this.bo_mang_grad_clas;
	}

	public String getStmt_crte_clsf(){
		return this.stmt_crte_clsf;
	}

	public String getJd_sell_net_clsf(){
		return this.jd_sell_net_clsf;
	}

	public String getQty_sell_net_clsf(){
		return this.qty_sell_net_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bo_cd = Util.checkString(cstmt.getString(7));
		this.bo_seq = Util.checkString(cstmt.getString(8));
		this.srt_seq = Util.checkString(cstmt.getString(9));
		this.bo_nm = Util.checkString(cstmt.getString(10));
		this.area_nm = Util.checkString(cstmt.getString(11));
		this.chrg_flnm = Util.checkString(cstmt.getString(12));
		this.orgn_clsfnm = Util.checkString(cstmt.getString(13));
		this.bo_cntr_dt = Util.checkString(cstmt.getString(14));
		this.bo_expy_dt = Util.checkString(cstmt.getString(15));
		this.cntr_stat_clsfnm = Util.checkString(cstmt.getString(16));
		this.jont_debtgurt_limt_amt = Util.checkString(cstmt.getString(17));
		this.sido_nm = Util.checkString(cstmt.getString(18));
		this.tel_no_1 = Util.checkString(cstmt.getString(19));
		this.tel_no_2 = Util.checkString(cstmt.getString(20));
		this.bo_zip = Util.checkString(cstmt.getString(21));
		this.bo_addr = Util.checkString(cstmt.getString(22));
		this.bo_dtls_addr = Util.checkString(cstmt.getString(23));
		this.jd_zip = Util.checkString(cstmt.getString(24));
		this.jd_addr = Util.checkString(cstmt.getString(25));
		this.jd_dtls_addr = Util.checkString(cstmt.getString(26));
		this.bo_jurs_nwsp_zip = Util.checkString(cstmt.getString(27));
		this.bo_jurs_nwsp_addr = Util.checkString(cstmt.getString(28));
		this.bo_feat_clsf = Util.checkString(cstmt.getString(29));
		this.bo_mang_grad_clas = Util.checkString(cstmt.getString(30));
		this.stmt_crte_clsf = Util.checkString(cstmt.getString(31));
		this.jd_sell_net_clsf = Util.checkString(cstmt.getString(32));
		this.qty_sell_net_clsf = Util.checkString(cstmt.getString(33));
		this.dlco_no = Util.checkString(cstmt.getString(34));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1420_SDataSet ds = (SE_BOI_1420_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBo_cd()%>
<%= ds.getBo_seq()%>
<%= ds.getSrt_seq()%>
<%= ds.getBo_nm()%>
<%= ds.getArea_nm()%>
<%= ds.getChrg_flnm()%>
<%= ds.getOrgn_clsfnm()%>
<%= ds.getBo_cntr_dt()%>
<%= ds.getBo_expy_dt()%>
<%= ds.getCntr_stat_clsfnm()%>
<%= ds.getJont_debtgurt_limt_amt()%>
<%= ds.getSido_nm()%>
<%= ds.getTel_no_1()%>
<%= ds.getTel_no_2()%>
<%= ds.getBo_zip()%>
<%= ds.getBo_addr()%>
<%= ds.getBo_dtls_addr()%>
<%= ds.getJd_zip()%>
<%= ds.getJd_addr()%>
<%= ds.getJd_dtls_addr()%>
<%= ds.getBo_jurs_nwsp_zip()%>
<%= ds.getBo_jurs_nwsp_addr()%>
<%= ds.getBo_feat_clsf()%>
<%= ds.getBo_mang_grad_clas()%>
<%= ds.getStmt_crte_clsf()%>
<%= ds.getJd_sell_net_clsf()%>
<%= ds.getQty_sell_net_clsf()%>
<%= ds.getDlco_no()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 05 11:26:58 KST 2009 */