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


public class IS_DEP_3710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_3710_LDataSet(){}
	public IS_DEP_3710_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			IS_DEP_3710_LCURLISTRecord rec = new IS_DEP_3710_LCURLISTRecord();
			rec.rept_no = Util.checkString(rset0.getString("rept_no"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.eps_clsf = Util.checkString(rset0.getString("eps_clsf"));
			rec.enty_clsf = Util.checkString(rset0.getString("enty_clsf"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			rec.sue_chrg_pers = Util.checkString(rset0.getString("sue_chrg_pers"));
			rec.sue_chrg_pers_nm = Util.checkString(rset0.getString("sue_chrg_pers_nm"));
			rec.dlay_rcpm_plan_dt = Util.checkString(rset0.getString("dlay_rcpm_plan_dt"));
			rec.fpymt_dt = Util.checkString(rset0.getString("fpymt_dt"));
			rec.sale_proc_frdt = Util.checkString(rset0.getString("sale_proc_frdt"));
			rec.sale_proc_todt = Util.checkString(rset0.getString("sale_proc_todt"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.unrcp_amt = Util.checkString(rset0.getString("unrcp_amt"));
			rec.dhon_frdt = Util.checkString(rset0.getString("dhon_frdt"));
			rec.dhon_todt = Util.checkString(rset0.getString("dhon_todt"));
			rec.dhon_amt = Util.checkString(rset0.getString("dhon_amt"));
			rec.dhon_bal = Util.checkString(rset0.getString("dhon_bal"));
			rec.aft_rcpm_amt = Util.checkString(rset0.getString("aft_rcpm_amt"));
			rec.aft_rcpm_dt = Util.checkString(rset0.getString("aft_rcpm_dt"));
			rec.aft_bal = Util.checkString(rset0.getString("aft_bal"));
			rec.chk_01 = Util.checkString(rset0.getString("chk_01"));
			rec.chk_02 = Util.checkString(rset0.getString("chk_02"));
			rec.chk_03 = Util.checkString(rset0.getString("chk_03"));
			rec.chk_04 = Util.checkString(rset0.getString("chk_04"));
			rec.chk_05 = Util.checkString(rset0.getString("chk_05"));
			rec.chk_06 = Util.checkString(rset0.getString("chk_06"));
			rec.chk_07 = Util.checkString(rset0.getString("chk_07"));
			rec.chk_08 = Util.checkString(rset0.getString("chk_08"));
			rec.chk_09 = Util.checkString(rset0.getString("chk_09"));
			rec.clct_dt = Util.checkString(rset0.getString("clct_dt"));
			rec.clct_amt = Util.checkString(rset0.getString("clct_amt"));
			rec.loss_amt_inclu_yn = Util.checkString(rset0.getString("loss_amt_inclu_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.remk_1 = Util.checkString(rset0.getString("remk_1"));
			rec.remk_2 = Util.checkString(rset0.getString("remk_2"));
			rec.bddb_amt = Util.checkString(rset0.getString("bddb_amt"));
			rec.bddb_proc_dt = Util.checkString(rset0.getString("bddb_proc_dt"));
			rec.tax_amt_dduc_yn = Util.checkString(rset0.getString("tax_amt_dduc_yn"));
			rec.tax_amt_dduc_amt = Util.checkString(rset0.getString("tax_amt_dduc_amt"));
			rec.tax_amt_dduc_proc_dt = Util.checkString(rset0.getString("tax_amt_dduc_proc_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_DEP_3710_LDataSet ds = (IS_DEP_3710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_3710_LCURLISTRecord curlistRec = (IS_DEP_3710_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.rept_no%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.eps_clsf%>
<%= curlistRec.enty_clsf%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.mchrg_pers%>
<%= curlistRec.sue_chrg_pers%>
<%= curlistRec.sue_chrg_pers_nm%>
<%= curlistRec.dlay_rcpm_plan_dt%>
<%= curlistRec.fpymt_dt%>
<%= curlistRec.sale_proc_frdt%>
<%= curlistRec.sale_proc_todt%>
<%= curlistRec.sale_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.unrcp_amt%>
<%= curlistRec.dhon_frdt%>
<%= curlistRec.dhon_todt%>
<%= curlistRec.dhon_amt%>
<%= curlistRec.dhon_bal%>
<%= curlistRec.aft_rcpm_amt%>
<%= curlistRec.aft_rcpm_dt%>
<%= curlistRec.aft_bal%>
<%= curlistRec.chk_01%>
<%= curlistRec.chk_02%>
<%= curlistRec.chk_03%>
<%= curlistRec.chk_04%>
<%= curlistRec.chk_05%>
<%= curlistRec.chk_06%>
<%= curlistRec.chk_07%>
<%= curlistRec.chk_08%>
<%= curlistRec.chk_09%>
<%= curlistRec.clct_dt%>
<%= curlistRec.clct_amt%>
<%= curlistRec.loss_amt_inclu_yn%>
<%= curlistRec.remk%>
<%= curlistRec.remk_1%>
<%= curlistRec.remk_2%>
<%= curlistRec.bddb_amt%>
<%= curlistRec.bddb_proc_dt%>
<%= curlistRec.tax_amt_dduc_yn%>
<%= curlistRec.tax_amt_dduc_amt%>
<%= curlistRec.tax_amt_dduc_proc_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 09:22:17 KST 2012 */