/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2520_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_2520_LDataSet(){}
	public SE_SAL_2520_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_SAL_2520_LCURLISTRecord rec = new SE_SAL_2520_LCURLISTRecord();
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.acct_rcpm_rem_amt = Util.checkString(rset0.getString("acct_rcpm_rem_amt"));
			rec.acpt_rcpm_reg_tot_amt = Util.checkString(rset0.getString("acpt_rcpm_reg_tot_amt"));
			rec.amt1 = Util.checkString(rset0.getString("amt1"));
			rec.amt2 = Util.checkString(rset0.getString("amt2"));
			rec.amt3 = Util.checkString(rset0.getString("amt3"));
			rec.amt4 = Util.checkString(rset0.getString("amt4"));
			rec.amt5 = Util.checkString(rset0.getString("amt5"));
			rec.amt_tot = Util.checkString(rset0.getString("amt_tot"));
			rec.rcpm_shet_no = Util.checkString(rset0.getString("rcpm_shet_no"));
			rec.rcpm_rate = Util.checkString(rset0.getString("rcpm_rate"));
			rec.rmtt_dt = Util.checkString(rset0.getString("rmtt_dt"));
			rec.rmtt_plac = Util.checkString(rset0.getString("rmtt_plac"));
			rec.tran_amt = Util.checkString(rset0.getString("tran_amt"));
			rec.biz_reg_no = Util.checkString(rset0.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset0.getString("bank_id"));
			rec.acct_num = Util.checkString(rset0.getString("acct_num"));
			rec.tran_date = Util.checkString(rset0.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset0.getString("tran_date_seq"));
			rec.rcpm_yymm = Util.checkString(rset0.getString("rcpm_yymm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_2520_LDataSet ds = (SE_SAL_2520_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_2520_LCURLISTRecord curlistRec = (SE_SAL_2520_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.net_sale_amt%>
<%= curlistRec.acct_rcpm_rem_amt%>
<%= curlistRec.acpt_rcpm_reg_tot_amt%>
<%= curlistRec.amt1%>
<%= curlistRec.amt2%>
<%= curlistRec.amt3%>
<%= curlistRec.amt4%>
<%= curlistRec.amt5%>
<%= curlistRec.amt_tot%>
<%= curlistRec.rcpm_shet_no%>
<%= curlistRec.rcpm_rate%>
<%= curlistRec.rmtt_dt%>
<%= curlistRec.rmtt_plac%>
<%= curlistRec.tran_amt%>
<%= curlistRec.biz_reg_no%>
<%= curlistRec.bank_id%>
<%= curlistRec.acct_num%>
<%= curlistRec.tran_date%>
<%= curlistRec.tran_date_seq%>
<%= curlistRec.rcpm_yymm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 20 20:23:18 KST 2009 */