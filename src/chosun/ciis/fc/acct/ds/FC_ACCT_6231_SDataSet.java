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


public class FC_ACCT_6231_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_exprsltptcr_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String qunt_etc;
	public String frcr_amt_etc;
	public String won_amt_etc;
	public String qunt_exp;
	public String frcr_amt_exp;
	public String won_amt_exp;
	public String qunt_tot;
	public String frcr_amt_tot;
	public String won_amt_tot;

	public FC_ACCT_6231_SDataSet(){}
	public FC_ACCT_6231_SDataSet(String errcode, String errmsg, String erplace_cd, String vat_fr_yymm, String vat_to_yymm, String qunt_etc, String frcr_amt_etc, String won_amt_etc, String qunt_exp, String frcr_amt_exp, String won_amt_exp, String qunt_tot, String frcr_amt_tot, String won_amt_tot){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.erplace_cd = erplace_cd;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.qunt_etc = qunt_etc;
		this.frcr_amt_etc = frcr_amt_etc;
		this.won_amt_etc = won_amt_etc;
		this.qunt_exp = qunt_exp;
		this.frcr_amt_exp = frcr_amt_exp;
		this.won_amt_exp = won_amt_exp;
		this.qunt_tot = qunt_tot;
		this.frcr_amt_tot = frcr_amt_tot;
		this.won_amt_tot = won_amt_tot;
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

	public void setQunt_etc(String qunt_etc){
		this.qunt_etc = qunt_etc;
	}

	public void setFrcr_amt_etc(String frcr_amt_etc){
		this.frcr_amt_etc = frcr_amt_etc;
	}

	public void setWon_amt_etc(String won_amt_etc){
		this.won_amt_etc = won_amt_etc;
	}

	public void setQunt_exp(String qunt_exp){
		this.qunt_exp = qunt_exp;
	}

	public void setFrcr_amt_exp(String frcr_amt_exp){
		this.frcr_amt_exp = frcr_amt_exp;
	}

	public void setWon_amt_exp(String won_amt_exp){
		this.won_amt_exp = won_amt_exp;
	}

	public void setQunt_tot(String qunt_tot){
		this.qunt_tot = qunt_tot;
	}

	public void setFrcr_amt_tot(String frcr_amt_tot){
		this.frcr_amt_tot = frcr_amt_tot;
	}

	public void setWon_amt_tot(String won_amt_tot){
		this.won_amt_tot = won_amt_tot;
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

	public String getQunt_etc(){
		return this.qunt_etc;
	}

	public String getFrcr_amt_etc(){
		return this.frcr_amt_etc;
	}

	public String getWon_amt_etc(){
		return this.won_amt_etc;
	}

	public String getQunt_exp(){
		return this.qunt_exp;
	}

	public String getFrcr_amt_exp(){
		return this.frcr_amt_exp;
	}

	public String getWon_amt_exp(){
		return this.won_amt_exp;
	}

	public String getQunt_tot(){
		return this.qunt_tot;
	}

	public String getFrcr_amt_tot(){
		return this.frcr_amt_tot;
	}

	public String getWon_amt_tot(){
		return this.won_amt_tot;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_6231_SCUR_EXPRSLTPTCR_LISTRecord rec = new FC_ACCT_6231_SCUR_EXPRSLTPTCR_LISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.exp_decl_no = Util.checkString(rset0.getString("exp_decl_no"));
			rec.ship_dt = Util.checkString(rset0.getString("ship_dt"));
			rec.frcr_clsf_cd = Util.checkString(rset0.getString("frcr_clsf_cd"));
			rec.exrate = Util.checkString(rset0.getString("exrate"));
			rec.frcr_amt = Util.checkString(rset0.getString("frcr_amt"));
			rec.won_amt = Util.checkString(rset0.getString("won_amt"));
			this.cur_exprsltptcr_list.add(rec);
		}
		this.erplace_cd = Util.checkString(cstmt.getString(10));
		this.vat_fr_yymm = Util.checkString(cstmt.getString(11));
		this.vat_to_yymm = Util.checkString(cstmt.getString(12));
		this.qunt_etc = Util.checkString(cstmt.getString(13));
		this.frcr_amt_etc = Util.checkString(cstmt.getString(14));
		this.won_amt_etc = Util.checkString(cstmt.getString(15));
		this.qunt_exp = Util.checkString(cstmt.getString(16));
		this.frcr_amt_exp = Util.checkString(cstmt.getString(17));
		this.won_amt_exp = Util.checkString(cstmt.getString(18));
		this.qunt_tot = Util.checkString(cstmt.getString(19));
		this.frcr_amt_tot = Util.checkString(cstmt.getString(20));
		this.won_amt_tot = Util.checkString(cstmt.getString(21));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6231_SDataSet ds = (FC_ACCT_6231_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_exprsltptcr_list.size(); i++){
		FC_ACCT_6231_SCUR_EXPRSLTPTCR_LISTRecord cur_exprsltptcr_listRec = (FC_ACCT_6231_SCUR_EXPRSLTPTCR_LISTRecord)ds.cur_exprsltptcr_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_exprsltptcr_list()%>
<%= ds.getErplace_cd()%>
<%= ds.getVat_fr_yymm()%>
<%= ds.getVat_to_yymm()%>
<%= ds.getQunt_etc()%>
<%= ds.getFrcr_amt_etc()%>
<%= ds.getWon_amt_etc()%>
<%= ds.getQunt_exp()%>
<%= ds.getFrcr_amt_exp()%>
<%= ds.getWon_amt_exp()%>
<%= ds.getQunt_tot()%>
<%= ds.getFrcr_amt_tot()%>
<%= ds.getWon_amt_tot()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_exprsltptcr_listRec.seq%>
<%= cur_exprsltptcr_listRec.exp_decl_no%>
<%= cur_exprsltptcr_listRec.ship_dt%>
<%= cur_exprsltptcr_listRec.frcr_clsf_cd%>
<%= cur_exprsltptcr_listRec.exrate%>
<%= cur_exprsltptcr_listRec.frcr_amt%>
<%= cur_exprsltptcr_listRec.won_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 26 15:46:20 KST 2014 */