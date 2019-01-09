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


package chosun.ciis.is.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_1051_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String medi_cd;
	public String dlco_clsf_cd_seq;
	public String rcpm_plac_clsf;
	public String dlco_nm;
	public long rcpm_tot_amt;
	public long tot_rvord_amt;
	public long setoff_done_amt;
	public long setoff_tobe_amt;
	public long final_setoff_yn;
	public String proc_frdt;
	public String proc_todt;

	public IS_DEP_1051_LDataSet(){}
	public IS_DEP_1051_LDataSet(String errcode, String errmsg, String occr_dt, String slip_clsf, String seq, String medi_cd, String dlco_clsf_cd_seq, String rcpm_plac_clsf, String dlco_nm, long rcpm_tot_amt, long tot_rvord_amt, long setoff_done_amt, long setoff_tobe_amt, long final_setoff_yn, String proc_frdt, String proc_todt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.medi_cd = medi_cd;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.rcpm_plac_clsf = rcpm_plac_clsf;
		this.dlco_nm = dlco_nm;
		this.rcpm_tot_amt = rcpm_tot_amt;
		this.tot_rvord_amt = tot_rvord_amt;
		this.setoff_done_amt = setoff_done_amt;
		this.setoff_tobe_amt = setoff_tobe_amt;
		this.final_setoff_yn = final_setoff_yn;
		this.proc_frdt = proc_frdt;
		this.proc_todt = proc_todt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setRcpm_plac_clsf(String rcpm_plac_clsf){
		this.rcpm_plac_clsf = rcpm_plac_clsf;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setRcpm_tot_amt(long rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
	}

	public void setTot_rvord_amt(long tot_rvord_amt){
		this.tot_rvord_amt = tot_rvord_amt;
	}

	public void setSetoff_done_amt(long setoff_done_amt){
		this.setoff_done_amt = setoff_done_amt;
	}

	public void setSetoff_tobe_amt(long setoff_tobe_amt){
		this.setoff_tobe_amt = setoff_tobe_amt;
	}

	public void setFinal_setoff_yn(long final_setoff_yn){
		this.final_setoff_yn = final_setoff_yn;
	}

	public void setProc_frdt(String proc_frdt){
		this.proc_frdt = proc_frdt;
	}

	public void setProc_todt(String proc_todt){
		this.proc_todt = proc_todt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getRcpm_plac_clsf(){
		return this.rcpm_plac_clsf;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public long getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}

	public long getTot_rvord_amt(){
		return this.tot_rvord_amt;
	}

	public long getSetoff_done_amt(){
		return this.setoff_done_amt;
	}

	public long getSetoff_tobe_amt(){
		return this.setoff_tobe_amt;
	}

	public long getFinal_setoff_yn(){
		return this.final_setoff_yn;
	}

	public String getProc_frdt(){
		return this.proc_frdt;
	}

	public String getProc_todt(){
		return this.proc_todt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.occr_dt = Util.checkString(cstmt.getString(5));
		this.slip_clsf = Util.checkString(cstmt.getString(6));
		this.seq = Util.checkString(cstmt.getString(7));
		this.medi_cd = Util.checkString(cstmt.getString(10));
		this.dlco_clsf_cd_seq = Util.checkString(cstmt.getString(11));
		this.rcpm_plac_clsf = Util.checkString(cstmt.getString(12));
		this.dlco_nm = Util.checkString(cstmt.getString(13));
		this.rcpm_tot_amt = cstmt.getLong(14);
		this.tot_rvord_amt = cstmt.getLong(15);
		this.setoff_done_amt = cstmt.getLong(16);
		this.setoff_tobe_amt = cstmt.getLong(17);
		this.final_setoff_yn = cstmt.getLong(18);
		this.proc_frdt = Util.checkString(cstmt.getString(19));
		this.proc_todt = Util.checkString(cstmt.getString(20));
		ResultSet rset0 = (ResultSet) cstmt.getObject(21);
		while(rset0.next()){
			IS_DEP_1051_LCURLISTRecord rec = new IS_DEP_1051_LCURLISTRecord();
			rec.rcpm_suply_amt = Util.checkString(rset0.getString("rcpm_suply_amt"));
			rec.rcpm_vat = Util.checkString(rset0.getString("rcpm_vat"));
			rec.sale_proc_dt = Util.checkString(rset0.getString("sale_proc_dt"));
			rec.acwr_reg_dt_seq = Util.checkString(rset0.getString("acwr_reg_dt_seq"));
			rec.advt_nm = Util.checkString(rset0.getString("advt_nm"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.unrcpm_suply_amt = Util.checkString(rset0.getString("unrcpm_suply_amt"));
			rec.unrcpm_vat_amt = Util.checkString(rset0.getString("unrcpm_vat_amt"));
			rec.acwr_reg_dt = Util.checkString(rset0.getString("acwr_reg_dt"));
			rec.acwr_reg_seq = Util.checkString(rset0.getString("acwr_reg_seq"));
			rec.sale_dlco_li_seq = Util.checkString(rset0.getString("sale_dlco_li_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_DEP_1051_LDataSet ds = (IS_DEP_1051_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_1051_LCURLISTRecord curlistRec = (IS_DEP_1051_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getOccr_dt()%>
<%= ds.getSlip_clsf()%>
<%= ds.getSeq()%>
<%= ds.getMedi_cd()%>
<%= ds.getDlco_clsf_cd_seq()%>
<%= ds.getRcpm_plac_clsf()%>
<%= ds.getDlco_nm()%>
<%= ds.getRcpm_tot_amt()%>
<%= ds.getTot_rvord_amt()%>
<%= ds.getSetoff_done_amt()%>
<%= ds.getSetoff_tobe_amt()%>
<%= ds.getFinal_setoff_yn()%>
<%= ds.getProc_frdt()%>
<%= ds.getProc_todt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.rcpm_suply_amt%>
<%= curlistRec.rcpm_vat%>
<%= curlistRec.sale_proc_dt%>
<%= curlistRec.acwr_reg_dt_seq%>
<%= curlistRec.advt_nm%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.unrcpm_suply_amt%>
<%= curlistRec.unrcpm_vat_amt%>
<%= curlistRec.acwr_reg_dt%>
<%= curlistRec.acwr_reg_seq%>
<%= curlistRec.sale_dlco_li_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 18 13:15:40 KST 2012 */