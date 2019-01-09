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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6221_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_rlesleasptcr_list_1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;

	public FC_ACCT_6221_SDataSet(){}
	public FC_ACCT_6221_SDataSet(String errcode, String errmsg, String erplace_cd, String vat_fr_yymm, String vat_to_yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.erplace_cd = erplace_cd;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_6221_SCUR_RLESLEASPTCR_LIST_1Record rec = new FC_ACCT_6221_SCUR_RLESLEASPTCR_LIST_1Record();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flor_cnt = Util.checkString(rset0.getString("flor_cnt"));
			rec.ser_no = Util.checkString(rset0.getString("ser_no"));
			rec.cntr_size = Util.checkString(rset0.getString("cntr_size"));
			rec.intg_dlco_cd = Util.checkString(rset0.getString("intg_dlco_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.hire_firm_nm = Util.checkString(rset0.getString("hire_firm_nm"));
			rec.hire_dlco_ern = Util.checkString(rset0.getString("hire_dlco_ern"));
			rec.leas_fr_dt = Util.checkString(rset0.getString("leas_fr_dt"));
			rec.leas_to_dt = Util.checkString(rset0.getString("leas_to_dt"));
			rec.cntr_gurt_amt = Util.checkString(rset0.getString("cntr_gurt_amt"));
			rec.cntr_leas_amt = Util.checkString(rset0.getString("cntr_leas_amt"));
			rec.cntr_mang_amt = Util.checkString(rset0.getString("cntr_mang_amt"));
			rec.rent_impt_amt = Util.checkString(rset0.getString("rent_impt_amt"));
			rec.rent_gurt_amt_int = Util.checkString(rset0.getString("rent_gurt_amt_int"));
			rec.rent_mms_rcpm_amt = Util.checkString(rset0.getString("rent_mms_rcpm_amt"));
			rec.mang_rcpm_amt = Util.checkString(rset0.getString("mang_rcpm_amt"));
			rec.nwsp_dn_yn = Util.checkString(rset0.getString("nwsp_dn_yn"));
			rec.leas_dlco_ern = Util.checkString(rset0.getString("leas_dlco_ern"));
			rec.dong = Util.checkString(rset0.getString("dong"));
			rec.renw_dt = Util.checkString(rset0.getString("renw_dt"));
			this.cur_rlesleasptcr_list_1.add(rec);
		}
		this.erplace_cd = Util.checkString(cstmt.getString(10));
		this.vat_fr_yymm = Util.checkString(cstmt.getString(11));
		this.vat_to_yymm = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6221_SDataSet ds = (FC_ACCT_6221_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_rlesleasptcr_list_1.size(); i++){
		FC_ACCT_6221_SCUR_RLESLEASPTCR_LIST_1Record cur_rlesleasptcr_list_1Rec = (FC_ACCT_6221_SCUR_RLESLEASPTCR_LIST_1Record)ds.cur_rlesleasptcr_list_1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_rlesleasptcr_list_1()%>
<%= ds.getErplace_cd()%>
<%= ds.getVat_fr_yymm()%>
<%= ds.getVat_to_yymm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_rlesleasptcr_list_1Rec.seq%>
<%= cur_rlesleasptcr_list_1Rec.flor_cnt%>
<%= cur_rlesleasptcr_list_1Rec.ser_no%>
<%= cur_rlesleasptcr_list_1Rec.cntr_size%>
<%= cur_rlesleasptcr_list_1Rec.intg_dlco_cd%>
<%= cur_rlesleasptcr_list_1Rec.dlco_clsf_cd%>
<%= cur_rlesleasptcr_list_1Rec.dlco_cd%>
<%= cur_rlesleasptcr_list_1Rec.hire_firm_nm%>
<%= cur_rlesleasptcr_list_1Rec.hire_dlco_ern%>
<%= cur_rlesleasptcr_list_1Rec.leas_fr_dt%>
<%= cur_rlesleasptcr_list_1Rec.leas_to_dt%>
<%= cur_rlesleasptcr_list_1Rec.cntr_gurt_amt%>
<%= cur_rlesleasptcr_list_1Rec.cntr_leas_amt%>
<%= cur_rlesleasptcr_list_1Rec.cntr_mang_amt%>
<%= cur_rlesleasptcr_list_1Rec.rent_impt_amt%>
<%= cur_rlesleasptcr_list_1Rec.rent_gurt_amt_int%>
<%= cur_rlesleasptcr_list_1Rec.rent_mms_rcpm_amt%>
<%= cur_rlesleasptcr_list_1Rec.mang_rcpm_amt%>
<%= cur_rlesleasptcr_list_1Rec.nwsp_dn_yn%>
<%= cur_rlesleasptcr_list_1Rec.leas_dlco_ern%>
<%= cur_rlesleasptcr_list_1Rec.dong%>
<%= cur_rlesleasptcr_list_1Rec.renw_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jun 22 15:14:06 KST 2014 */