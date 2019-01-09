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


package chosun.ciis.is.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1130_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String prof_type_cd;
	public String hndl_clsf;
	public String dlco_clsf_cd_seq;
	public String dlco_nm;
	public String make_dt;
	public String suply_amt;
	public String vat_amt;
	public String s_tot_amt;
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
	public String purc_suply_amt;
	public String purc_vat_amt;
	public String purc_tot_amt;
	public String pay_clsf;
	public String canc_yn;
	public String tot_suply_amt;
	public String tot_vat_amt;
	public String purc_frdt;
	public String purc_todt;
	public String erplace_cd;
	public String chk_cnt;

	public IS_SAL_1130_SDataSet(){}
	public IS_SAL_1130_SDataSet(String errcode, String errmsg, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String prof_type_cd, String hndl_clsf, String dlco_clsf_cd_seq, String dlco_nm, String make_dt, String suply_amt, String vat_amt, String s_tot_amt, String medi_cd, String del_resn, String ern, String addr, String deal_clsf, String presi_nm, String bizcond, String item, String email_id, String elec_tax_comp_cd, String semuro_no, String purc_suply_amt, String purc_vat_amt, String purc_tot_amt, String pay_clsf, String canc_yn, String tot_suply_amt, String tot_vat_amt, String purc_frdt, String purc_todt, String erplace_cd, String chk_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.prof_type_cd = prof_type_cd;
		this.hndl_clsf = hndl_clsf;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.dlco_nm = dlco_nm;
		this.make_dt = make_dt;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.s_tot_amt = s_tot_amt;
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
		this.purc_suply_amt = purc_suply_amt;
		this.purc_vat_amt = purc_vat_amt;
		this.purc_tot_amt = purc_tot_amt;
		this.pay_clsf = pay_clsf;
		this.canc_yn = canc_yn;
		this.tot_suply_amt = tot_suply_amt;
		this.tot_vat_amt = tot_vat_amt;
		this.purc_frdt = purc_frdt;
		this.purc_todt = purc_todt;
		this.erplace_cd = erplace_cd;
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

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
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

	public void setS_tot_amt(String s_tot_amt){
		this.s_tot_amt = s_tot_amt;
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

	public void setPurc_suply_amt(String purc_suply_amt){
		this.purc_suply_amt = purc_suply_amt;
	}

	public void setPurc_vat_amt(String purc_vat_amt){
		this.purc_vat_amt = purc_vat_amt;
	}

	public void setPurc_tot_amt(String purc_tot_amt){
		this.purc_tot_amt = purc_tot_amt;
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

	public void setPurc_frdt(String purc_frdt){
		this.purc_frdt = purc_frdt;
	}

	public void setPurc_todt(String purc_todt){
		this.purc_todt = purc_todt;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
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

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
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

	public String getS_tot_amt(){
		return this.s_tot_amt;
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

	public String getPurc_suply_amt(){
		return this.purc_suply_amt;
	}

	public String getPurc_vat_amt(){
		return this.purc_vat_amt;
	}

	public String getPurc_tot_amt(){
		return this.purc_tot_amt;
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

	public String getPurc_frdt(){
		return this.purc_frdt;
	}

	public String getPurc_todt(){
		return this.purc_todt;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
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

		this.slip_clsf_cd = Util.checkString(cstmt.getString(4));
		this.slip_occr_dt = Util.checkString(cstmt.getString(5));
		this.slip_seq = Util.checkString(cstmt.getString(6));
		this.prof_type_cd = Util.checkString(cstmt.getString(7));
		this.hndl_clsf = Util.checkString(cstmt.getString(8));
		this.dlco_clsf_cd_seq = Util.checkString(cstmt.getString(9));
		this.dlco_nm = Util.checkString(cstmt.getString(10));
		this.make_dt = Util.checkString(cstmt.getString(11));
		this.suply_amt = Util.checkString(cstmt.getString(12));
		this.vat_amt = Util.checkString(cstmt.getString(13));
		this.s_tot_amt = Util.checkString(cstmt.getString(14));
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
		this.purc_suply_amt = Util.checkString(cstmt.getString(26));
		this.purc_vat_amt = Util.checkString(cstmt.getString(27));
		this.purc_tot_amt = Util.checkString(cstmt.getString(28));
		this.pay_clsf = Util.checkString(cstmt.getString(29));
		this.canc_yn = Util.checkString(cstmt.getString(30));
		this.tot_suply_amt = Util.checkString(cstmt.getString(31));
		this.tot_vat_amt = Util.checkString(cstmt.getString(32));
		this.purc_frdt = Util.checkString(cstmt.getString(33));
		this.purc_todt = Util.checkString(cstmt.getString(34));
		this.erplace_cd = Util.checkString(cstmt.getString(35));
		this.chk_cnt = Util.checkString(cstmt.getString(36));
		ResultSet rset0 = (ResultSet) cstmt.getObject(37);
		while(rset0.next()){
			IS_SAL_1130_SCURLISTRecord rec = new IS_SAL_1130_SCURLISTRecord();
			rec.purc_reg_dt = Util.checkString(rset0.getString("purc_reg_dt"));
			rec.purc_reg_seq = Util.checkString(rset0.getString("purc_reg_seq"));
			rec.acwr_reg_dt = Util.checkString(rset0.getString("acwr_reg_dt"));
			rec.acwr_reg_seq = Util.checkString(rset0.getString("acwr_reg_seq"));
			rec.purc_clsf = Util.checkString(rset0.getString("purc_clsf"));
			rec.purc_clsf_nm = Util.checkString(rset0.getString("purc_clsf_nm"));
			rec.purc_dt = Util.checkString(rset0.getString("purc_dt"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.purc_amt = Util.checkString(rset0.getString("purc_amt"));
			rec.trc_yn = Util.checkString(rset0.getString("trc_yn"));
			rec.send_yn = Util.checkString(rset0.getString("send_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.adjm_yn = Util.checkString(rset0.getString("adjm_yn"));
			rec.purc_adjm_reg_dt = Util.checkString(rset0.getString("purc_adjm_reg_dt"));
			rec.purc_adjm_reg_seq = Util.checkString(rset0.getString("purc_adjm_reg_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_SAL_1130_SDataSet ds = (IS_SAL_1130_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_SAL_1130_SCURLISTRecord curlistRec = (IS_SAL_1130_SCURLISTRecord)ds.curlist.get(i);%>
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
<%= ds.getDlco_clsf_cd_seq()%>
<%= ds.getDlco_nm()%>
<%= ds.getMake_dt()%>
<%= ds.getSuply_amt()%>
<%= ds.getVat_amt()%>
<%= ds.getS_tot_amt()%>
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
<%= ds.getPurc_suply_amt()%>
<%= ds.getPurc_vat_amt()%>
<%= ds.getPurc_tot_amt()%>
<%= ds.getPay_clsf()%>
<%= ds.getCanc_yn()%>
<%= ds.getTot_suply_amt()%>
<%= ds.getTot_vat_amt()%>
<%= ds.getPurc_frdt()%>
<%= ds.getPurc_todt()%>
<%= ds.getErplace_cd()%>
<%= ds.getChk_cnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.purc_reg_dt%>
<%= curlistRec.purc_reg_seq%>
<%= curlistRec.acwr_reg_dt%>
<%= curlistRec.acwr_reg_seq%>
<%= curlistRec.purc_clsf%>
<%= curlistRec.purc_clsf_nm%>
<%= curlistRec.purc_dt%>
<%= curlistRec.uprc%>
<%= curlistRec.qunt%>
<%= curlistRec.purc_amt%>
<%= curlistRec.trc_yn%>
<%= curlistRec.send_yn%>
<%= curlistRec.remk%>
<%= curlistRec.adjm_yn%>
<%= curlistRec.purc_adjm_reg_dt%>
<%= curlistRec.purc_adjm_reg_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 11 15:39:58 KST 2012 */