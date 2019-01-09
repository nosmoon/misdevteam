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


public class FC_ACCT_6261_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_crdtcardacqptcr_list_1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;

	public FC_ACCT_6261_SDataSet(){}
	public FC_ACCT_6261_SDataSet(String errcode, String errmsg, String erplace_cd, String vat_fr_yymm, String vat_to_yymm){
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
			FC_ACCT_6261_SCUR_CRDTCARDACQPTCR_LIST_1Record rec = new FC_ACCT_6261_SCUR_CRDTCARDACQPTCR_LIST_1Record();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.acq_dt = Util.checkString(rset0.getString("acq_dt"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.intg_dlco_cd = Util.checkString(rset0.getString("intg_dlco_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.crdt_card_nm = Util.checkString(rset0.getString("crdt_card_nm"));
			rec.crdt_card_no = Util.checkString(rset0.getString("crdt_card_no"));
			this.cur_crdtcardacqptcr_list_1.add(rec);
		}
		this.erplace_cd = Util.checkString(cstmt.getString(10));
		this.vat_fr_yymm = Util.checkString(cstmt.getString(11));
		this.vat_to_yymm = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6261_SDataSet ds = (FC_ACCT_6261_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_crdtcardacqptcr_list_1.size(); i++){
		FC_ACCT_6261_SCUR_CRDTCARDACQPTCR_LIST_1Record cur_crdtcardacqptcr_list_1Rec = (FC_ACCT_6261_SCUR_CRDTCARDACQPTCR_LIST_1Record)ds.cur_crdtcardacqptcr_list_1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_crdtcardacqptcr_list_1()%>
<%= ds.getErplace_cd()%>
<%= ds.getVat_fr_yymm()%>
<%= ds.getVat_to_yymm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_crdtcardacqptcr_list_1Rec.seq%>
<%= cur_crdtcardacqptcr_list_1Rec.acq_dt%>
<%= cur_crdtcardacqptcr_list_1Rec.qunt%>
<%= cur_crdtcardacqptcr_list_1Rec.suply_amt%>
<%= cur_crdtcardacqptcr_list_1Rec.vat_amt%>
<%= cur_crdtcardacqptcr_list_1Rec.intg_dlco_cd%>
<%= cur_crdtcardacqptcr_list_1Rec.dlco_clsf_cd%>
<%= cur_crdtcardacqptcr_list_1Rec.dlco_cd%>
<%= cur_crdtcardacqptcr_list_1Rec.dlco_nm%>
<%= cur_crdtcardacqptcr_list_1Rec.ern%>
<%= cur_crdtcardacqptcr_list_1Rec.mang_clsf_cd%>
<%= cur_crdtcardacqptcr_list_1Rec.crdt_card_nm%>
<%= cur_crdtcardacqptcr_list_1Rec.crdt_card_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 17 13:54:08 KST 2014 */