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


package chosun.ciis.ad.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.dep.dm.*;
import chosun.ciis.ad.dep.rec.*;

/**
 * 
 */


public class AD_DEP_1051_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String medi_cd;
	public String dlco_no;
	public String rcpm_plac_clsf;
	public String dlco_nm;
	public long rcpm_tot_amt;
	public long pubc_tot_amt;
	public long setoff_done_amt;
	public long setoff_tobe_amt;
	public long final_setoff_yn;
	public String pubc_frdt;
	public String pubc_todt;
	public String chnl_clsf;

	public AD_DEP_1051_LDataSet(){}
	public AD_DEP_1051_LDataSet(String errcode, String errmsg, String occr_dt, String slip_clsf, String seq, String medi_cd, String dlco_no, String rcpm_plac_clsf, String dlco_nm, long rcpm_tot_amt, long pubc_tot_amt, long setoff_done_amt, long setoff_tobe_amt, long final_setoff_yn, String pubc_frdt, String pubc_todt, String chnl_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.medi_cd = medi_cd;
		this.dlco_no = dlco_no;
		this.rcpm_plac_clsf = rcpm_plac_clsf;
		this.dlco_nm = dlco_nm;
		this.rcpm_tot_amt = rcpm_tot_amt;
		this.pubc_tot_amt = pubc_tot_amt;
		this.setoff_done_amt = setoff_done_amt;
		this.setoff_tobe_amt = setoff_tobe_amt;
		this.final_setoff_yn = final_setoff_yn;
		this.pubc_frdt = pubc_frdt;
		this.pubc_todt = pubc_todt;
		this.chnl_clsf = chnl_clsf;
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

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
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

	public void setPubc_tot_amt(long pubc_tot_amt){
		this.pubc_tot_amt = pubc_tot_amt;
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

	public void setPubc_frdt(String pubc_frdt){
		this.pubc_frdt = pubc_frdt;
	}

	public void setPubc_todt(String pubc_todt){
		this.pubc_todt = pubc_todt;
	}

	public void setChnl_clsf(String chnl_clsf){
		this.chnl_clsf = chnl_clsf;
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

	public String getDlco_no(){
		return this.dlco_no;
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

	public long getPubc_tot_amt(){
		return this.pubc_tot_amt;
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

	public String getPubc_frdt(){
		return this.pubc_frdt;
	}

	public String getPubc_todt(){
		return this.pubc_todt;
	}

	public String getChnl_clsf(){
		return this.chnl_clsf;
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
		this.medi_cd = Util.checkString(cstmt.getString(11));
		this.dlco_no = Util.checkString(cstmt.getString(12));
		this.rcpm_plac_clsf = Util.checkString(cstmt.getString(13));
		this.dlco_nm = Util.checkString(cstmt.getString(14));
		this.rcpm_tot_amt = cstmt.getLong(15);
		this.pubc_tot_amt = cstmt.getLong(16);
		this.setoff_done_amt = cstmt.getLong(17);
		this.setoff_tobe_amt = cstmt.getLong(18);
		this.final_setoff_yn = cstmt.getLong(19);
		this.pubc_frdt = Util.checkString(cstmt.getString(20));
		this.pubc_todt = Util.checkString(cstmt.getString(21));
		this.chnl_clsf = Util.checkString(cstmt.getString(22));
		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			AD_DEP_1051_LCURLISTRecord rec = new AD_DEP_1051_LCURLISTRecord();
			rec.rcpm_advt_fee = Util.checkString(rset0.getString("rcpm_advt_fee"));
			rec.rcpm_vat = Util.checkString(rset0.getString("rcpm_vat"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_fee = rset0.getInt("advt_fee");
			rec.vat = rset0.getInt("vat");
			rec.unrcpm_fee = rset0.getInt("unrcpm_fee");
			rec.unrcpm_vat = rset0.getInt("unrcpm_vat");
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_1051_LDataSet ds = (AD_DEP_1051_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_1051_LCURLISTRecord curlistRec = (AD_DEP_1051_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= ds.getDlco_no()%>
<%= ds.getRcpm_plac_clsf()%>
<%= ds.getDlco_nm()%>
<%= ds.getRcpm_tot_amt()%>
<%= ds.getPubc_tot_amt()%>
<%= ds.getSetoff_done_amt()%>
<%= ds.getSetoff_tobe_amt()%>
<%= ds.getFinal_setoff_yn()%>
<%= ds.getPubc_frdt()%>
<%= ds.getPubc_todt()%>
<%= ds.getChnl_clsf()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.rcpm_advt_fee%>
<%= curlistRec.rcpm_vat%>
<%= curlistRec.medi_cd%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.unrcpm_fee%>
<%= curlistRec.unrcpm_vat%>
<%= curlistRec.medi_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 05 18:58:21 KST 2015 */