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


public class AD_NMD_5130_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String prof_type_cd;
	public String hndl_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String make_dt;
	public String suply_amt;
	public String vat_amt;
	public String medi_cd;
	public String del_resn;
	public String ern;
	public String addr;
	public String deal_clsf;
	public String presi_nm;
	public String bizcond;
	public String item;
	public String email_id;
	public String elec_tax_comp_cd;
	public String semuro_no;
	public String tot_fee;
	public String pay_clsf;
	public String canc_yn;
	public String tot_suply_amt;
	public String tot_vat_amt;
	public String pubc_frdt;
	public String pubc_todt;
	public String chk_cnt;

	public AD_NMD_5130_SDataSet(){}
	public AD_NMD_5130_SDataSet(String errcode, String errmsg, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String prof_type_cd, String hndl_clsf, String dlco_no, String dlco_nm, String make_dt, String suply_amt, String vat_amt, String medi_cd, String del_resn, String ern, String addr, String deal_clsf, String presi_nm, String bizcond, String item, String email_id, String elec_tax_comp_cd, String semuro_no, String tot_fee, String pay_clsf, String canc_yn, String tot_suply_amt, String tot_vat_amt, String pubc_frdt, String pubc_todt, String chk_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.prof_type_cd = prof_type_cd;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.make_dt = make_dt;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.medi_cd = medi_cd;
		this.del_resn = del_resn;
		this.ern = ern;
		this.addr = addr;
		this.deal_clsf = deal_clsf;
		this.presi_nm = presi_nm;
		this.bizcond = bizcond;
		this.item = item;
		this.email_id = email_id;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.semuro_no = semuro_no;
		this.tot_fee = tot_fee;
		this.pay_clsf = pay_clsf;
		this.canc_yn = canc_yn;
		this.tot_suply_amt = tot_suply_amt;
		this.tot_vat_amt = tot_vat_amt;
		this.pubc_frdt = pubc_frdt;
		this.pubc_todt = pubc_todt;
		this.chk_cnt = chk_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
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

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
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

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDel_resn(String del_resn){
		this.del_resn = del_resn;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDeal_clsf(String deal_clsf){
		this.deal_clsf = deal_clsf;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
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

	public void setTot_fee(String tot_fee){
		this.tot_fee = tot_fee;
	}

	public void setPay_clsf(String pay_clsf){
		this.pay_clsf = pay_clsf;
	}

	public void setCanc_yn(String canc_yn){
		this.canc_yn = canc_yn;
	}

	public void setTot_suply_amt(String tot_suply_amt){
		this.tot_suply_amt = tot_suply_amt;
	}

	public void setTot_vat_amt(String tot_vat_amt){
		this.tot_vat_amt = tot_vat_amt;
	}

	public void setPubc_frdt(String pubc_frdt){
		this.pubc_frdt = pubc_frdt;
	}

	public void setPubc_todt(String pubc_todt){
		this.pubc_todt = pubc_todt;
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

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDel_resn(){
		return this.del_resn;
	}

	public String getErn(){
		return this.ern;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDeal_clsf(){
		return this.deal_clsf;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
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

	public String getTot_fee(){
		return this.tot_fee;
	}

	public String getPay_clsf(){
		return this.pay_clsf;
	}

	public String getCanc_yn(){
		return this.canc_yn;
	}

	public String getTot_suply_amt(){
		return this.tot_suply_amt;
	}

	public String getTot_vat_amt(){
		return this.tot_vat_amt;
	}

	public String getPubc_frdt(){
		return this.pubc_frdt;
	}

	public String getPubc_todt(){
		return this.pubc_todt;
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

		this.slip_clsf_cd = Util.checkString(cstmt.getString(5));
		this.slip_occr_dt = Util.checkString(cstmt.getString(6));
		this.slip_seq = Util.checkString(cstmt.getString(7));
		this.prof_type_cd = Util.checkString(cstmt.getString(8));
		this.hndl_clsf = Util.checkString(cstmt.getString(9));
		this.dlco_no = Util.checkString(cstmt.getString(10));
		this.dlco_nm = Util.checkString(cstmt.getString(11));
		this.make_dt = Util.checkString(cstmt.getString(12));
		this.suply_amt = Util.checkString(cstmt.getString(13));
		this.vat_amt = Util.checkString(cstmt.getString(14));
		this.medi_cd = Util.checkString(cstmt.getString(15));
		this.del_resn = Util.checkString(cstmt.getString(16));
		this.ern = Util.checkString(cstmt.getString(17));
		this.addr = Util.checkString(cstmt.getString(18));
		this.deal_clsf = Util.checkString(cstmt.getString(19));
		this.presi_nm = Util.checkString(cstmt.getString(20));
		this.bizcond = Util.checkString(cstmt.getString(21));
		this.item = Util.checkString(cstmt.getString(22));
		this.email_id = Util.checkString(cstmt.getString(23));
		this.elec_tax_comp_cd = Util.checkString(cstmt.getString(24));
		this.semuro_no = Util.checkString(cstmt.getString(25));
		this.tot_fee = Util.checkString(cstmt.getString(26));
		this.pay_clsf = Util.checkString(cstmt.getString(27));
		this.canc_yn = Util.checkString(cstmt.getString(28));
		this.tot_suply_amt = Util.checkString(cstmt.getString(29));
		this.tot_vat_amt = Util.checkString(cstmt.getString(30));
		this.pubc_frdt = Util.checkString(cstmt.getString(31));
		this.pubc_todt = Util.checkString(cstmt.getString(32));
		this.chk_cnt = Util.checkString(cstmt.getString(33));
		ResultSet rset0 = (ResultSet) cstmt.getObject(34);
		while(rset0.next()){
			AD_NMD_5130_SCURLISTRecord rec = new AD_NMD_5130_SCURLISTRecord();
			rec.purc_stmt_issu_yn = Util.checkString(rset0.getString("purc_stmt_issu_yn"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.fee_rate = Util.checkString(rset0.getString("fee_rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_NMD_5130_SDataSet ds = (AD_NMD_5130_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_NMD_5130_SCURLISTRecord curlistRec = (AD_NMD_5130_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSlip_clsf_cd()%>
<%= ds.getSlip_occr_dt()%>
<%= ds.getSlip_seq()%>
<%= ds.getProf_type_cd()%>
<%= ds.getHndl_clsf()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getMake_dt()%>
<%= ds.getSuply_amt()%>
<%= ds.getVat_amt()%>
<%= ds.getMedi_cd()%>
<%= ds.getDel_resn()%>
<%= ds.getErn()%>
<%= ds.getAddr()%>
<%= ds.getDeal_clsf()%>
<%= ds.getPresi_nm()%>
<%= ds.getBizcond()%>
<%= ds.getItem()%>
<%= ds.getEmail_id()%>
<%= ds.getElec_tax_comp_cd()%>
<%= ds.getSemuro_no()%>
<%= ds.getTot_fee()%>
<%= ds.getPay_clsf()%>
<%= ds.getCanc_yn()%>
<%= ds.getTot_suply_amt()%>
<%= ds.getTot_vat_amt()%>
<%= ds.getPubc_frdt()%>
<%= ds.getPubc_todt()%>
<%= ds.getChk_cnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.purc_stmt_issu_yn%>
<%= curlistRec.fee%>
<%= curlistRec.medi_nm%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.fee_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 28 15:59:10 KST 2014 */