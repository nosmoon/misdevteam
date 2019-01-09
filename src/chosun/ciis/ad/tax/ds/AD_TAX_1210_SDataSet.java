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


package chosun.ciis.ad.tax.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.tax.dm.*;
import chosun.ciis.ad.tax.rec.*;

/**
 * 
 */


public class AD_TAX_1210_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String prof_type_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String ern;
	public String presi_nm;
	public String addr;
	public String bizcond;
	public String item;
	public String suply_amt;
	public String remk;
	public String medi_cd;
	public String medi_nm;
	public String make_dt;
	public long chk_cnt;

	public AD_TAX_1210_SDataSet(){}
	public AD_TAX_1210_SDataSet(String errcode, String errmsg, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String prof_type_cd, String dlco_cd, String dlco_nm, String ern, String presi_nm, String addr, String bizcond, String item, String suply_amt, String remk, String medi_cd, String medi_nm, String make_dt, long chk_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.prof_type_cd = prof_type_cd;
		this.dlco_cd = dlco_cd;
		this.dlco_nm = dlco_nm;
		this.ern = ern;
		this.presi_nm = presi_nm;
		this.addr = addr;
		this.bizcond = bizcond;
		this.item = item;
		this.suply_amt = suply_amt;
		this.remk = remk;
		this.medi_cd = medi_cd;
		this.medi_nm = medi_nm;
		this.make_dt = make_dt;
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

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setChk_cnt(long chk_cnt){
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

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public long getChk_cnt(){
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
		this.dlco_cd = Util.checkString(cstmt.getString(8));
		this.dlco_nm = Util.checkString(cstmt.getString(9));
		this.ern = Util.checkString(cstmt.getString(10));
		this.presi_nm = Util.checkString(cstmt.getString(11));
		this.addr = Util.checkString(cstmt.getString(12));
		this.bizcond = Util.checkString(cstmt.getString(13));
		this.item = Util.checkString(cstmt.getString(14));
		this.suply_amt = Util.checkString(cstmt.getString(15));
		this.remk = Util.checkString(cstmt.getString(16));
		this.medi_cd = Util.checkString(cstmt.getString(17));
		this.medi_nm = Util.checkString(cstmt.getString(18));
		this.make_dt = Util.checkString(cstmt.getString(19));
		this.chk_cnt = cstmt.getLong(20);
		ResultSet rset0 = (ResultSet) cstmt.getObject(21);
		while(rset0.next()){
			AD_TAX_1210_SCURLISTRecord rec = new AD_TAX_1210_SCURLISTRecord();
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pre_issu_yn = Util.checkString(rset0.getString("pre_issu_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_TAX_1210_SDataSet ds = (AD_TAX_1210_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_TAX_1210_SCURLISTRecord curlistRec = (AD_TAX_1210_SCURLISTRecord)ds.curlist.get(i);%>
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
<%= ds.getDlco_cd()%>
<%= ds.getDlco_nm()%>
<%= ds.getErn()%>
<%= ds.getPresi_nm()%>
<%= ds.getAddr()%>
<%= ds.getBizcond()%>
<%= ds.getItem()%>
<%= ds.getSuply_amt()%>
<%= ds.getRemk()%>
<%= ds.getMedi_cd()%>
<%= ds.getMedi_nm()%>
<%= ds.getMake_dt()%>
<%= ds.getChk_cnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.medi_nm%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.pre_issu_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 27 16:16:36 KST 2013 */