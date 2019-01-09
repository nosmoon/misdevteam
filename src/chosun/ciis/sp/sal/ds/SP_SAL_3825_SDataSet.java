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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_3825_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String rcpm_plan_dt;
	public String make_dt;
	public String suply_amt;
	public String vat_amt;
	public String tot_amt;
	public String setoff_yn;
	public String canc_yn;
	public String re_issu_resn_cd;
	public String issu_tms;
	public String tax_item;
	public String suply_erplace_cd;
	public String suply_ern;
	public String suply_dlco_no;
	public String suply_dlco_nm;
	public String suply_presi_nm;
	public String suply_addr;
	public String suply_bizcond;
	public String suply_item;
	public String demand_biz_plc;
	public String demand_ern;
	public String demand_dlco_no;
	public String demand_dlco_nm;
	public String demand_dlco_abrv_nm;
	public String demand_presi_nm;
	public String demand_addr;
	public String demand_bizcond;
	public String demand_item;
	public String email_id;
	public String elec_tax_comp_cd;
	public String semuro_no;
	public String chk_cnt;

	public SP_SAL_3825_SDataSet(){}
	public SP_SAL_3825_SDataSet(String errcode, String errmsg, String prof_type_cd, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String rcpm_plan_dt, String make_dt, String suply_amt, String vat_amt, String tot_amt, String setoff_yn, String canc_yn, String re_issu_resn_cd, String issu_tms, String tax_item, String suply_erplace_cd, String suply_ern, String suply_dlco_no, String suply_dlco_nm, String suply_presi_nm, String suply_addr, String suply_bizcond, String suply_item, String demand_biz_plc, String demand_ern, String demand_dlco_no, String demand_dlco_nm, String demand_dlco_abrv_nm, String demand_presi_nm, String demand_addr, String demand_bizcond, String demand_item, String email_id, String elec_tax_comp_cd, String semuro_no, String chk_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.prof_type_cd = prof_type_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.rcpm_plan_dt = rcpm_plan_dt;
		this.make_dt = make_dt;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.tot_amt = tot_amt;
		this.setoff_yn = setoff_yn;
		this.canc_yn = canc_yn;
		this.re_issu_resn_cd = re_issu_resn_cd;
		this.issu_tms = issu_tms;
		this.tax_item = tax_item;
		this.suply_erplace_cd = suply_erplace_cd;
		this.suply_ern = suply_ern;
		this.suply_dlco_no = suply_dlco_no;
		this.suply_dlco_nm = suply_dlco_nm;
		this.suply_presi_nm = suply_presi_nm;
		this.suply_addr = suply_addr;
		this.suply_bizcond = suply_bizcond;
		this.suply_item = suply_item;
		this.demand_biz_plc = demand_biz_plc;
		this.demand_ern = demand_ern;
		this.demand_dlco_no = demand_dlco_no;
		this.demand_dlco_nm = demand_dlco_nm;
		this.demand_dlco_abrv_nm = demand_dlco_abrv_nm;
		this.demand_presi_nm = demand_presi_nm;
		this.demand_addr = demand_addr;
		this.demand_bizcond = demand_bizcond;
		this.demand_item = demand_item;
		this.email_id = email_id;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.semuro_no = semuro_no;
		this.chk_cnt = chk_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setRcpm_plan_dt(String rcpm_plan_dt){
		this.rcpm_plan_dt = rcpm_plan_dt;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setSetoff_yn(String setoff_yn){
		this.setoff_yn = setoff_yn;
	}

	public void setCanc_yn(String canc_yn){
		this.canc_yn = canc_yn;
	}

	public void setRe_issu_resn_cd(String re_issu_resn_cd){
		this.re_issu_resn_cd = re_issu_resn_cd;
	}

	public void setIssu_tms(String issu_tms){
		this.issu_tms = issu_tms;
	}

	public void setTax_item(String tax_item){
		this.tax_item = tax_item;
	}

	public void setSuply_erplace_cd(String suply_erplace_cd){
		this.suply_erplace_cd = suply_erplace_cd;
	}

	public void setSuply_ern(String suply_ern){
		this.suply_ern = suply_ern;
	}

	public void setSuply_dlco_no(String suply_dlco_no){
		this.suply_dlco_no = suply_dlco_no;
	}

	public void setSuply_dlco_nm(String suply_dlco_nm){
		this.suply_dlco_nm = suply_dlco_nm;
	}

	public void setSuply_presi_nm(String suply_presi_nm){
		this.suply_presi_nm = suply_presi_nm;
	}

	public void setSuply_addr(String suply_addr){
		this.suply_addr = suply_addr;
	}

	public void setSuply_bizcond(String suply_bizcond){
		this.suply_bizcond = suply_bizcond;
	}

	public void setSuply_item(String suply_item){
		this.suply_item = suply_item;
	}

	public void setDemand_biz_plc(String demand_biz_plc){
		this.demand_biz_plc = demand_biz_plc;
	}

	public void setDemand_ern(String demand_ern){
		this.demand_ern = demand_ern;
	}

	public void setDemand_dlco_no(String demand_dlco_no){
		this.demand_dlco_no = demand_dlco_no;
	}

	public void setDemand_dlco_nm(String demand_dlco_nm){
		this.demand_dlco_nm = demand_dlco_nm;
	}

	public void setDemand_dlco_abrv_nm(String demand_dlco_abrv_nm){
		this.demand_dlco_abrv_nm = demand_dlco_abrv_nm;
	}

	public void setDemand_presi_nm(String demand_presi_nm){
		this.demand_presi_nm = demand_presi_nm;
	}

	public void setDemand_addr(String demand_addr){
		this.demand_addr = demand_addr;
	}

	public void setDemand_bizcond(String demand_bizcond){
		this.demand_bizcond = demand_bizcond;
	}

	public void setDemand_item(String demand_item){
		this.demand_item = demand_item;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setElec_tax_comp_cd(String elec_tax_comp_cd){
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setChk_cnt(String chk_cnt){
		this.chk_cnt = chk_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getRcpm_plan_dt(){
		return this.rcpm_plan_dt;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getSetoff_yn(){
		return this.setoff_yn;
	}

	public String getCanc_yn(){
		return this.canc_yn;
	}

	public String getRe_issu_resn_cd(){
		return this.re_issu_resn_cd;
	}

	public String getIssu_tms(){
		return this.issu_tms;
	}

	public String getTax_item(){
		return this.tax_item;
	}

	public String getSuply_erplace_cd(){
		return this.suply_erplace_cd;
	}

	public String getSuply_ern(){
		return this.suply_ern;
	}

	public String getSuply_dlco_no(){
		return this.suply_dlco_no;
	}

	public String getSuply_dlco_nm(){
		return this.suply_dlco_nm;
	}

	public String getSuply_presi_nm(){
		return this.suply_presi_nm;
	}

	public String getSuply_addr(){
		return this.suply_addr;
	}

	public String getSuply_bizcond(){
		return this.suply_bizcond;
	}

	public String getSuply_item(){
		return this.suply_item;
	}

	public String getDemand_biz_plc(){
		return this.demand_biz_plc;
	}

	public String getDemand_ern(){
		return this.demand_ern;
	}

	public String getDemand_dlco_no(){
		return this.demand_dlco_no;
	}

	public String getDemand_dlco_nm(){
		return this.demand_dlco_nm;
	}

	public String getDemand_dlco_abrv_nm(){
		return this.demand_dlco_abrv_nm;
	}

	public String getDemand_presi_nm(){
		return this.demand_presi_nm;
	}

	public String getDemand_addr(){
		return this.demand_addr;
	}

	public String getDemand_bizcond(){
		return this.demand_bizcond;
	}

	public String getDemand_item(){
		return this.demand_item;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getElec_tax_comp_cd(){
		return this.elec_tax_comp_cd;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getChk_cnt(){
		return this.chk_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.prof_type_cd = Util.checkString(cstmt.getString(6));
		this.slip_clsf_cd = Util.checkString(cstmt.getString(7));
		this.slip_occr_dt = Util.checkString(cstmt.getString(8));
		this.slip_seq = Util.checkString(cstmt.getString(9));
		this.rcpm_plan_dt = Util.checkString(cstmt.getString(10));
		this.make_dt = Util.checkString(cstmt.getString(11));
		this.suply_amt = Util.checkString(cstmt.getString(12));
		this.vat_amt = Util.checkString(cstmt.getString(13));
		this.tot_amt = Util.checkString(cstmt.getString(14));
		this.setoff_yn = Util.checkString(cstmt.getString(15));
		this.canc_yn = Util.checkString(cstmt.getString(16));
		this.re_issu_resn_cd = Util.checkString(cstmt.getString(17));
		this.issu_tms = Util.checkString(cstmt.getString(18));
		this.tax_item = Util.checkString(cstmt.getString(19));
		this.suply_erplace_cd = Util.checkString(cstmt.getString(20));
		this.suply_ern = Util.checkString(cstmt.getString(21));
		this.suply_dlco_no = Util.checkString(cstmt.getString(22));
		this.suply_dlco_nm = Util.checkString(cstmt.getString(23));
		this.suply_presi_nm = Util.checkString(cstmt.getString(24));
		this.suply_addr = Util.checkString(cstmt.getString(25));
		this.suply_bizcond = Util.checkString(cstmt.getString(26));
		this.suply_item = Util.checkString(cstmt.getString(27));
		this.demand_biz_plc = Util.checkString(cstmt.getString(28));
		this.demand_ern = Util.checkString(cstmt.getString(29));
		this.demand_dlco_no = Util.checkString(cstmt.getString(30));
		this.demand_dlco_nm = Util.checkString(cstmt.getString(31));
		this.demand_dlco_abrv_nm = Util.checkString(cstmt.getString(32));
		this.demand_presi_nm = Util.checkString(cstmt.getString(33));
		this.demand_addr = Util.checkString(cstmt.getString(34));
		this.demand_bizcond = Util.checkString(cstmt.getString(35));
		this.demand_item = Util.checkString(cstmt.getString(36));
		this.email_id = Util.checkString(cstmt.getString(37));
		this.elec_tax_comp_cd = Util.checkString(cstmt.getString(38));
		this.semuro_no = Util.checkString(cstmt.getString(39));
		this.chk_cnt = Util.checkString(cstmt.getString(40));
		ResultSet rset0 = (ResultSet) cstmt.getObject(41);
		while(rset0.next()){
			SP_SAL_3825_SCURLISTRecord rec = new SP_SAL_3825_SCURLISTRecord();
			rec.a_sale_yymm = Util.checkString(rset0.getString("a_sale_yymm"));
			rec.a_sale_seq = Util.checkString(rset0.getString("a_sale_seq"));
			rec.a_sale_item_cd_nm = Util.checkString(rset0.getString("a_sale_item_cd_nm"));
			rec.a_suply_amt = Util.checkString(rset0.getString("a_suply_amt"));
			rec.a_vat_amt = Util.checkString(rset0.getString("a_vat_amt"));
			rec.a_tot_rvord_amt = Util.checkString(rset0.getString("a_tot_rvord_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_3825_SDataSet ds = (SP_SAL_3825_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SAL_3825_SCURLISTRecord curlistRec = (SP_SAL_3825_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getProf_type_cd()%>
<%= ds.getSlip_clsf_cd()%>
<%= ds.getSlip_occr_dt()%>
<%= ds.getSlip_seq()%>
<%= ds.getRcpm_plan_dt()%>
<%= ds.getMake_dt()%>
<%= ds.getSuply_amt()%>
<%= ds.getVat_amt()%>
<%= ds.getTot_amt()%>
<%= ds.getSetoff_yn()%>
<%= ds.getCanc_yn()%>
<%= ds.getRe_issu_resn_cd()%>
<%= ds.getIssu_tms()%>
<%= ds.getTax_item()%>
<%= ds.getSuply_erplace_cd()%>
<%= ds.getSuply_ern()%>
<%= ds.getSuply_dlco_no()%>
<%= ds.getSuply_dlco_nm()%>
<%= ds.getSuply_presi_nm()%>
<%= ds.getSuply_addr()%>
<%= ds.getSuply_bizcond()%>
<%= ds.getSuply_item()%>
<%= ds.getDemand_biz_plc()%>
<%= ds.getDemand_ern()%>
<%= ds.getDemand_dlco_no()%>
<%= ds.getDemand_dlco_nm()%>
<%= ds.getDemand_dlco_abrv_nm()%>
<%= ds.getDemand_presi_nm()%>
<%= ds.getDemand_addr()%>
<%= ds.getDemand_bizcond()%>
<%= ds.getDemand_item()%>
<%= ds.getEmail_id()%>
<%= ds.getElec_tax_comp_cd()%>
<%= ds.getSemuro_no()%>
<%= ds.getChk_cnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.a_sale_yymm%>
<%= curlistRec.a_sale_seq%>
<%= curlistRec.a_sale_item_cd_nm%>
<%= curlistRec.a_suply_amt%>
<%= curlistRec.a_vat_amt%>
<%= curlistRec.a_tot_rvord_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 02 17:57:43 KST 2012 */