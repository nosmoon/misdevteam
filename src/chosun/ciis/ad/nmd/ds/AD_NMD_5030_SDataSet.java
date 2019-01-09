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


package chosun.ciis.ad.nmd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_5030_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String make_dt;
	public String suply_amt;
	public String vat_amt;
	public String tot_amt;
	public String setoff_yn;
	public String canc_yn;
	public String re_issu_resn_cd;
	public String issu_tms;
	public String tax_item;
	public String suply_ern;
	public String suply_dlco_no;
	public String suply_dlco_nm;
	public String suply_dlco_abrv_nm;
	public String suply_presi_nm;
	public String suply_addr;
	public String suply_bizcond;
	public String suply_item;
	public String demand_ern;
	public String demand_dlco_no;
	public String demand_dlco_nm;
	public String demand_dlco_abrv_nm;
	public String demand_presi_nm;
	public String demand_addr;
	public String demand_bizcond;
	public String demand_item;
	public String demand_biz_plc;
	public String trust_ern;
	public String trust_dlco_no;
	public String trust_dlco_nm;
	public String trust_dlco_abrv_nm;
	public String trust_presi_nm;
	public String trust_addr;
	public String trust_bizcond;
	public String trust_item;
	public String email_id;
	public String elec_tax_comp_cd;
	public String semuro_no;
	public String chk_cnt;
	public String remk;

	public AD_NMD_5030_SDataSet(){}
	public AD_NMD_5030_SDataSet(String errcode, String errmsg, String prof_type_cd, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String make_dt, String suply_amt, String vat_amt, String tot_amt, String setoff_yn, String canc_yn, String re_issu_resn_cd, String issu_tms, String tax_item, String suply_ern, String suply_dlco_no, String suply_dlco_nm, String suply_dlco_abrv_nm, String suply_presi_nm, String suply_addr, String suply_bizcond, String suply_item, String demand_ern, String demand_dlco_no, String demand_dlco_nm, String demand_dlco_abrv_nm, String demand_presi_nm, String demand_addr, String demand_bizcond, String demand_item, String demand_biz_plc, String trust_ern, String trust_dlco_no, String trust_dlco_nm, String trust_dlco_abrv_nm, String trust_presi_nm, String trust_addr, String trust_bizcond, String trust_item, String email_id, String elec_tax_comp_cd, String semuro_no, String chk_cnt, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.prof_type_cd = prof_type_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.make_dt = make_dt;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.tot_amt = tot_amt;
		this.setoff_yn = setoff_yn;
		this.canc_yn = canc_yn;
		this.re_issu_resn_cd = re_issu_resn_cd;
		this.issu_tms = issu_tms;
		this.tax_item = tax_item;
		this.suply_ern = suply_ern;
		this.suply_dlco_no = suply_dlco_no;
		this.suply_dlco_nm = suply_dlco_nm;
		this.suply_dlco_abrv_nm = suply_dlco_abrv_nm;
		this.suply_presi_nm = suply_presi_nm;
		this.suply_addr = suply_addr;
		this.suply_bizcond = suply_bizcond;
		this.suply_item = suply_item;
		this.demand_ern = demand_ern;
		this.demand_dlco_no = demand_dlco_no;
		this.demand_dlco_nm = demand_dlco_nm;
		this.demand_dlco_abrv_nm = demand_dlco_abrv_nm;
		this.demand_presi_nm = demand_presi_nm;
		this.demand_addr = demand_addr;
		this.demand_bizcond = demand_bizcond;
		this.demand_item = demand_item;
		this.demand_biz_plc = demand_biz_plc;
		this.trust_ern = trust_ern;
		this.trust_dlco_no = trust_dlco_no;
		this.trust_dlco_nm = trust_dlco_nm;
		this.trust_dlco_abrv_nm = trust_dlco_abrv_nm;
		this.trust_presi_nm = trust_presi_nm;
		this.trust_addr = trust_addr;
		this.trust_bizcond = trust_bizcond;
		this.trust_item = trust_item;
		this.email_id = email_id;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.semuro_no = semuro_no;
		this.chk_cnt = chk_cnt;
		this.remk = remk;
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

	public void setSuply_ern(String suply_ern){
		this.suply_ern = suply_ern;
	}

	public void setSuply_dlco_no(String suply_dlco_no){
		this.suply_dlco_no = suply_dlco_no;
	}

	public void setSuply_dlco_nm(String suply_dlco_nm){
		this.suply_dlco_nm = suply_dlco_nm;
	}

	public void setSuply_dlco_abrv_nm(String suply_dlco_abrv_nm){
		this.suply_dlco_abrv_nm = suply_dlco_abrv_nm;
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

	public void setDemand_biz_plc(String demand_biz_plc){
		this.demand_biz_plc = demand_biz_plc;
	}

	public void setTrust_ern(String trust_ern){
		this.trust_ern = trust_ern;
	}

	public void setTrust_dlco_no(String trust_dlco_no){
		this.trust_dlco_no = trust_dlco_no;
	}

	public void setTrust_dlco_nm(String trust_dlco_nm){
		this.trust_dlco_nm = trust_dlco_nm;
	}

	public void setTrust_dlco_abrv_nm(String trust_dlco_abrv_nm){
		this.trust_dlco_abrv_nm = trust_dlco_abrv_nm;
	}

	public void setTrust_presi_nm(String trust_presi_nm){
		this.trust_presi_nm = trust_presi_nm;
	}

	public void setTrust_addr(String trust_addr){
		this.trust_addr = trust_addr;
	}

	public void setTrust_bizcond(String trust_bizcond){
		this.trust_bizcond = trust_bizcond;
	}

	public void setTrust_item(String trust_item){
		this.trust_item = trust_item;
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

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getSuply_ern(){
		return this.suply_ern;
	}

	public String getSuply_dlco_no(){
		return this.suply_dlco_no;
	}

	public String getSuply_dlco_nm(){
		return this.suply_dlco_nm;
	}

	public String getSuply_dlco_abrv_nm(){
		return this.suply_dlco_abrv_nm;
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

	public String getDemand_biz_plc(){
		return this.demand_biz_plc;
	}

	public String getTrust_ern(){
		return this.trust_ern;
	}

	public String getTrust_dlco_no(){
		return this.trust_dlco_no;
	}

	public String getTrust_dlco_nm(){
		return this.trust_dlco_nm;
	}

	public String getTrust_dlco_abrv_nm(){
		return this.trust_dlco_abrv_nm;
	}

	public String getTrust_presi_nm(){
		return this.trust_presi_nm;
	}

	public String getTrust_addr(){
		return this.trust_addr;
	}

	public String getTrust_bizcond(){
		return this.trust_bizcond;
	}

	public String getTrust_item(){
		return this.trust_item;
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

	public String getRemk(){
		return this.remk;
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
		this.make_dt = Util.checkString(cstmt.getString(10));
		this.suply_amt = Util.checkString(cstmt.getString(11));
		this.vat_amt = Util.checkString(cstmt.getString(12));
		this.tot_amt = Util.checkString(cstmt.getString(13));
		this.setoff_yn = Util.checkString(cstmt.getString(14));
		this.canc_yn = Util.checkString(cstmt.getString(15));
		this.re_issu_resn_cd = Util.checkString(cstmt.getString(16));
		this.issu_tms = Util.checkString(cstmt.getString(17));
		this.tax_item = Util.checkString(cstmt.getString(18));
		this.suply_ern = Util.checkString(cstmt.getString(19));
		this.suply_dlco_no = Util.checkString(cstmt.getString(20));
		this.suply_dlco_nm = Util.checkString(cstmt.getString(21));
		this.suply_dlco_abrv_nm = Util.checkString(cstmt.getString(22));
		this.suply_presi_nm = Util.checkString(cstmt.getString(23));
		this.suply_addr = Util.checkString(cstmt.getString(24));
		this.suply_bizcond = Util.checkString(cstmt.getString(25));
		this.suply_item = Util.checkString(cstmt.getString(26));
		this.demand_ern = Util.checkString(cstmt.getString(27));
		this.demand_dlco_no = Util.checkString(cstmt.getString(28));
		this.demand_dlco_nm = Util.checkString(cstmt.getString(29));
		this.demand_dlco_abrv_nm = Util.checkString(cstmt.getString(30));
		this.demand_presi_nm = Util.checkString(cstmt.getString(31));
		this.demand_addr = Util.checkString(cstmt.getString(32));
		this.demand_bizcond = Util.checkString(cstmt.getString(33));
		this.demand_item = Util.checkString(cstmt.getString(34));
		this.demand_biz_plc = Util.checkString(cstmt.getString(35));
		this.trust_ern = Util.checkString(cstmt.getString(36));
		this.trust_dlco_no = Util.checkString(cstmt.getString(37));
		this.trust_dlco_nm = Util.checkString(cstmt.getString(38));
		this.trust_dlco_abrv_nm = Util.checkString(cstmt.getString(39));
		this.trust_presi_nm = Util.checkString(cstmt.getString(40));
		this.trust_addr = Util.checkString(cstmt.getString(41));
		this.trust_bizcond = Util.checkString(cstmt.getString(42));
		this.trust_item = Util.checkString(cstmt.getString(43));
		this.email_id = Util.checkString(cstmt.getString(44));
		this.elec_tax_comp_cd = Util.checkString(cstmt.getString(45));
		this.semuro_no = Util.checkString(cstmt.getString(46));
		this.chk_cnt = Util.checkString(cstmt.getString(47));
		this.remk = Util.checkString(cstmt.getString(48));
		ResultSet rset0 = (ResultSet) cstmt.getObject(49);
		while(rset0.next()){
			AD_NMD_5030_SCURLISTRecord rec = new AD_NMD_5030_SCURLISTRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.agn_nm = Util.checkString(rset0.getString("agn_nm"));
			rec.sale_stmt_issu_yn = Util.checkString(rset0.getString("sale_stmt_issu_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_NMD_5030_SDataSet ds = (AD_NMD_5030_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_NMD_5030_SCURLISTRecord curlistRec = (AD_NMD_5030_SCURLISTRecord)ds.curlist.get(i);%>
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
<%= ds.getMake_dt()%>
<%= ds.getSuply_amt()%>
<%= ds.getVat_amt()%>
<%= ds.getTot_amt()%>
<%= ds.getSetoff_yn()%>
<%= ds.getCanc_yn()%>
<%= ds.getRe_issu_resn_cd()%>
<%= ds.getIssu_tms()%>
<%= ds.getTax_item()%>
<%= ds.getSuply_ern()%>
<%= ds.getSuply_dlco_no()%>
<%= ds.getSuply_dlco_nm()%>
<%= ds.getSuply_dlco_abrv_nm()%>
<%= ds.getSuply_presi_nm()%>
<%= ds.getSuply_addr()%>
<%= ds.getSuply_bizcond()%>
<%= ds.getSuply_item()%>
<%= ds.getDemand_ern()%>
<%= ds.getDemand_dlco_no()%>
<%= ds.getDemand_dlco_nm()%>
<%= ds.getDemand_dlco_abrv_nm()%>
<%= ds.getDemand_presi_nm()%>
<%= ds.getDemand_addr()%>
<%= ds.getDemand_bizcond()%>
<%= ds.getDemand_item()%>
<%= ds.getDemand_biz_plc()%>
<%= ds.getTrust_ern()%>
<%= ds.getTrust_dlco_no()%>
<%= ds.getTrust_dlco_nm()%>
<%= ds.getTrust_dlco_abrv_nm()%>
<%= ds.getTrust_presi_nm()%>
<%= ds.getTrust_addr()%>
<%= ds.getTrust_bizcond()%>
<%= ds.getTrust_item()%>
<%= ds.getEmail_id()%>
<%= ds.getElec_tax_comp_cd()%>
<%= ds.getSemuro_no()%>
<%= ds.getChk_cnt()%>
<%= ds.getRemk()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.agn%>
<%= curlistRec.agn_nm%>
<%= curlistRec.sale_stmt_issu_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 27 16:29:33 KST 2015 */