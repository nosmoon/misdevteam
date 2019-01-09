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


public class FC_ACCT_6241_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_redmasetacqrptcr_list_1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String qunt_s;
	public String suply_amt_s;
	public String vat_amt_s;
	public String qunt_1;
	public String suply_amt_1;
	public String vat_amt_1;
	public String qunt_2;
	public String suply_amt_2;
	public String vat_amt_2;
	public String qunt_3;
	public String suply_amt_3;
	public String vat_amt_3;
	public String qunt_4;
	public String suply_amt_4;
	public String vat_amt_4;

	public FC_ACCT_6241_SDataSet(){}
	public FC_ACCT_6241_SDataSet(String errcode, String errmsg, String erplace_cd, String vat_fr_yymm, String vat_to_yymm, String qunt_s, String suply_amt_s, String vat_amt_s, String qunt_1, String suply_amt_1, String vat_amt_1, String qunt_2, String suply_amt_2, String vat_amt_2, String qunt_3, String suply_amt_3, String vat_amt_3, String qunt_4, String suply_amt_4, String vat_amt_4){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.erplace_cd = erplace_cd;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.qunt_s = qunt_s;
		this.suply_amt_s = suply_amt_s;
		this.vat_amt_s = vat_amt_s;
		this.qunt_1 = qunt_1;
		this.suply_amt_1 = suply_amt_1;
		this.vat_amt_1 = vat_amt_1;
		this.qunt_2 = qunt_2;
		this.suply_amt_2 = suply_amt_2;
		this.vat_amt_2 = vat_amt_2;
		this.qunt_3 = qunt_3;
		this.suply_amt_3 = suply_amt_3;
		this.vat_amt_3 = vat_amt_3;
		this.qunt_4 = qunt_4;
		this.suply_amt_4 = suply_amt_4;
		this.vat_amt_4 = vat_amt_4;
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

	public void setQunt_s(String qunt_s){
		this.qunt_s = qunt_s;
	}

	public void setSuply_amt_s(String suply_amt_s){
		this.suply_amt_s = suply_amt_s;
	}

	public void setVat_amt_s(String vat_amt_s){
		this.vat_amt_s = vat_amt_s;
	}

	public void setQunt_1(String qunt_1){
		this.qunt_1 = qunt_1;
	}

	public void setSuply_amt_1(String suply_amt_1){
		this.suply_amt_1 = suply_amt_1;
	}

	public void setVat_amt_1(String vat_amt_1){
		this.vat_amt_1 = vat_amt_1;
	}

	public void setQunt_2(String qunt_2){
		this.qunt_2 = qunt_2;
	}

	public void setSuply_amt_2(String suply_amt_2){
		this.suply_amt_2 = suply_amt_2;
	}

	public void setVat_amt_2(String vat_amt_2){
		this.vat_amt_2 = vat_amt_2;
	}

	public void setQunt_3(String qunt_3){
		this.qunt_3 = qunt_3;
	}

	public void setSuply_amt_3(String suply_amt_3){
		this.suply_amt_3 = suply_amt_3;
	}

	public void setVat_amt_3(String vat_amt_3){
		this.vat_amt_3 = vat_amt_3;
	}

	public void setQunt_4(String qunt_4){
		this.qunt_4 = qunt_4;
	}

	public void setSuply_amt_4(String suply_amt_4){
		this.suply_amt_4 = suply_amt_4;
	}

	public void setVat_amt_4(String vat_amt_4){
		this.vat_amt_4 = vat_amt_4;
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

	public String getQunt_s(){
		return this.qunt_s;
	}

	public String getSuply_amt_s(){
		return this.suply_amt_s;
	}

	public String getVat_amt_s(){
		return this.vat_amt_s;
	}

	public String getQunt_1(){
		return this.qunt_1;
	}

	public String getSuply_amt_1(){
		return this.suply_amt_1;
	}

	public String getVat_amt_1(){
		return this.vat_amt_1;
	}

	public String getQunt_2(){
		return this.qunt_2;
	}

	public String getSuply_amt_2(){
		return this.suply_amt_2;
	}

	public String getVat_amt_2(){
		return this.vat_amt_2;
	}

	public String getQunt_3(){
		return this.qunt_3;
	}

	public String getSuply_amt_3(){
		return this.suply_amt_3;
	}

	public String getVat_amt_3(){
		return this.vat_amt_3;
	}

	public String getQunt_4(){
		return this.qunt_4;
	}

	public String getSuply_amt_4(){
		return this.suply_amt_4;
	}

	public String getVat_amt_4(){
		return this.vat_amt_4;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_6241_SCUR_REDMASETACQRPTCR_LIST_1Record rec = new FC_ACCT_6241_SCUR_REDMASETACQRPTCR_LIST_1Record();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.vat_aset_clsf = Util.checkString(rset0.getString("vat_aset_clsf"));
			rec.acqr_dt = Util.checkString(rset0.getString("acqr_dt"));
			rec.intg_dlco_cd = Util.checkString(rset0.getString("intg_dlco_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.suply_amt = rset0.getInt("suply_amt");
			rec.vat_amt = rset0.getInt("vat_amt");
			rec.qunt = rset0.getInt("qunt");
			this.cur_redmasetacqrptcr_list_1.add(rec);
		}
		this.erplace_cd = Util.checkString(cstmt.getString(10));
		this.vat_fr_yymm = Util.checkString(cstmt.getString(11));
		this.vat_to_yymm = Util.checkString(cstmt.getString(12));
		this.qunt_s = Util.checkString(cstmt.getString(13));
		this.suply_amt_s = Util.checkString(cstmt.getString(14));
		this.vat_amt_s = Util.checkString(cstmt.getString(15));
		this.qunt_1 = Util.checkString(cstmt.getString(16));
		this.suply_amt_1 = Util.checkString(cstmt.getString(17));
		this.vat_amt_1 = Util.checkString(cstmt.getString(18));
		this.qunt_2 = Util.checkString(cstmt.getString(19));
		this.suply_amt_2 = Util.checkString(cstmt.getString(20));
		this.vat_amt_2 = Util.checkString(cstmt.getString(21));
		this.qunt_3 = Util.checkString(cstmt.getString(22));
		this.suply_amt_3 = Util.checkString(cstmt.getString(23));
		this.vat_amt_3 = Util.checkString(cstmt.getString(24));
		this.qunt_4 = Util.checkString(cstmt.getString(25));
		this.suply_amt_4 = Util.checkString(cstmt.getString(26));
		this.vat_amt_4 = Util.checkString(cstmt.getString(27));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6241_SDataSet ds = (FC_ACCT_6241_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_redmasetacqrptcr_list_1.size(); i++){
		FC_ACCT_6241_SCUR_REDMASETACQRPTCR_LIST_1Record cur_redmasetacqrptcr_list_1Rec = (FC_ACCT_6241_SCUR_REDMASETACQRPTCR_LIST_1Record)ds.cur_redmasetacqrptcr_list_1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_redmasetacqrptcr_list_1()%>
<%= ds.getErplace_cd()%>
<%= ds.getVat_fr_yymm()%>
<%= ds.getVat_to_yymm()%>
<%= ds.getQunt_s()%>
<%= ds.getSuply_amt_s()%>
<%= ds.getVat_amt_s()%>
<%= ds.getQunt_1()%>
<%= ds.getSuply_amt_1()%>
<%= ds.getVat_amt_1()%>
<%= ds.getQunt_2()%>
<%= ds.getSuply_amt_2()%>
<%= ds.getVat_amt_2()%>
<%= ds.getQunt_3()%>
<%= ds.getSuply_amt_3()%>
<%= ds.getVat_amt_3()%>
<%= ds.getQunt_4()%>
<%= ds.getSuply_amt_4()%>
<%= ds.getVat_amt_4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_redmasetacqrptcr_list_1Rec.seq%>
<%= cur_redmasetacqrptcr_list_1Rec.vat_aset_clsf%>
<%= cur_redmasetacqrptcr_list_1Rec.acqr_dt%>
<%= cur_redmasetacqrptcr_list_1Rec.intg_dlco_cd%>
<%= cur_redmasetacqrptcr_list_1Rec.dlco_clsf_cd%>
<%= cur_redmasetacqrptcr_list_1Rec.dlco_cd%>
<%= cur_redmasetacqrptcr_list_1Rec.dlco_nm%>
<%= cur_redmasetacqrptcr_list_1Rec.ern%>
<%= cur_redmasetacqrptcr_list_1Rec.item%>
<%= cur_redmasetacqrptcr_list_1Rec.suply_amt%>
<%= cur_redmasetacqrptcr_list_1Rec.vat_amt%>
<%= cur_redmasetacqrptcr_list_1Rec.qunt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 23 14:40:01 KST 2014 */