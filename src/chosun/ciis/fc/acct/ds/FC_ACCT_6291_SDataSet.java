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


public class FC_ACCT_6291_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_redmasetacqrptcr_list_1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sub_title;
	public String ernm;
	public String ern;
	public String presi_nm;
	public String erplace_addr;
	public String erplace_bizcond;
	public String erplace_item;
	public String rpt_make_dt;
	public String md_rmk_25_g;

	public FC_ACCT_6291_SDataSet(){}
	public FC_ACCT_6291_SDataSet(String errcode, String errmsg, String sub_title, String ernm, String ern, String presi_nm, String erplace_addr, String erplace_bizcond, String erplace_item, String rpt_make_dt, String md_rmk_25_g){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sub_title = sub_title;
		this.ernm = ernm;
		this.ern = ern;
		this.presi_nm = presi_nm;
		this.erplace_addr = erplace_addr;
		this.erplace_bizcond = erplace_bizcond;
		this.erplace_item = erplace_item;
		this.rpt_make_dt = rpt_make_dt;
		this.md_rmk_25_g = md_rmk_25_g;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSub_title(String sub_title){
		this.sub_title = sub_title;
	}

	public void setErnm(String ernm){
		this.ernm = ernm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setErplace_addr(String erplace_addr){
		this.erplace_addr = erplace_addr;
	}

	public void setErplace_bizcond(String erplace_bizcond){
		this.erplace_bizcond = erplace_bizcond;
	}

	public void setErplace_item(String erplace_item){
		this.erplace_item = erplace_item;
	}

	public void setRpt_make_dt(String rpt_make_dt){
		this.rpt_make_dt = rpt_make_dt;
	}

	public void setMd_rmk_25_g(String md_rmk_25_g){
		this.md_rmk_25_g = md_rmk_25_g;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSub_title(){
		return this.sub_title;
	}

	public String getErnm(){
		return this.ernm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getErplace_addr(){
		return this.erplace_addr;
	}

	public String getErplace_bizcond(){
		return this.erplace_bizcond;
	}

	public String getErplace_item(){
		return this.erplace_item;
	}

	public String getRpt_make_dt(){
		return this.rpt_make_dt;
	}

	public String getMd_rmk_25_g(){
		return this.md_rmk_25_g;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_6291_SCUR_REDMASETACQRPTCR_LIST_1Record rec = new FC_ACCT_6291_SCUR_REDMASETACQRPTCR_LIST_1Record();
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.erplace_addr = Util.checkString(rset0.getString("erplace_addr"));
			rec.mc_amt_01 = Util.checkString(rset0.getString("mc_amt_01"));
			rec.mc_vat_01 = Util.checkString(rset0.getString("mc_vat_01"));
			rec.mc_amt_02 = Util.checkString(rset0.getString("mc_amt_02"));
			rec.mc_vat_02 = Util.checkString(rset0.getString("mc_vat_02"));
			rec.mi_amt_01 = Util.checkString(rset0.getString("mi_amt_01"));
			rec.mi_vat_01 = Util.checkString(rset0.getString("mi_vat_01"));
			rec.mi_amt_02 = Util.checkString(rset0.getString("mi_amt_02"));
			rec.mi_vat_02 = Util.checkString(rset0.getString("mi_vat_02"));
			rec.me_vat_01 = Util.checkString(rset0.getString("me_vat_01"));
			rec.me_vat_02 = Util.checkString(rset0.getString("me_vat_02"));
			rec.me_vat_03 = Util.checkString(rset0.getString("me_vat_03"));
			rec.mt_amt_01 = Util.checkString(rset0.getString("mt_amt_01"));
			rec.mt_amt_02 = Util.checkString(rset0.getString("mt_amt_02"));
			this.cur_redmasetacqrptcr_list_1.add(rec);
		}
		this.sub_title = Util.checkString(cstmt.getString(10));
		this.ernm = Util.checkString(cstmt.getString(11));
		this.ern = Util.checkString(cstmt.getString(12));
		this.presi_nm = Util.checkString(cstmt.getString(13));
		this.erplace_addr = Util.checkString(cstmt.getString(14));
		this.erplace_bizcond = Util.checkString(cstmt.getString(15));
		this.erplace_item = Util.checkString(cstmt.getString(16));
		this.rpt_make_dt = Util.checkString(cstmt.getString(17));
		this.md_rmk_25_g = Util.checkString(cstmt.getString(18));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6291_SDataSet ds = (FC_ACCT_6291_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_redmasetacqrptcr_list_1.size(); i++){
		FC_ACCT_6291_SCUR_REDMASETACQRPTCR_LIST_1Record cur_redmasetacqrptcr_list_1Rec = (FC_ACCT_6291_SCUR_REDMASETACQRPTCR_LIST_1Record)ds.cur_redmasetacqrptcr_list_1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_redmasetacqrptcr_list_1()%>
<%= ds.getSub_title()%>
<%= ds.getErnm()%>
<%= ds.getErn()%>
<%= ds.getPresi_nm()%>
<%= ds.getErplace_addr()%>
<%= ds.getErplace_bizcond()%>
<%= ds.getErplace_item()%>
<%= ds.getRpt_make_dt()%>
<%= ds.getMd_rmk_25_g()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_redmasetacqrptcr_list_1Rec.ern%>
<%= cur_redmasetacqrptcr_list_1Rec.erplace_addr%>
<%= cur_redmasetacqrptcr_list_1Rec.mc_amt_01%>
<%= cur_redmasetacqrptcr_list_1Rec.mc_vat_01%>
<%= cur_redmasetacqrptcr_list_1Rec.mc_amt_02%>
<%= cur_redmasetacqrptcr_list_1Rec.mc_vat_02%>
<%= cur_redmasetacqrptcr_list_1Rec.mi_amt_01%>
<%= cur_redmasetacqrptcr_list_1Rec.mi_vat_01%>
<%= cur_redmasetacqrptcr_list_1Rec.mi_amt_02%>
<%= cur_redmasetacqrptcr_list_1Rec.mi_vat_02%>
<%= cur_redmasetacqrptcr_list_1Rec.me_vat_01%>
<%= cur_redmasetacqrptcr_list_1Rec.me_vat_02%>
<%= cur_redmasetacqrptcr_list_1Rec.me_vat_03%>
<%= cur_redmasetacqrptcr_list_1Rec.mt_amt_01%>
<%= cur_redmasetacqrptcr_list_1Rec.mt_amt_02%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 30 19:38:33 KST 2014 */