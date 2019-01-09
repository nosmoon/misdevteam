/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_2120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BNS_2120_LDataSet(){}
	public SE_BNS_2120_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SE_BNS_2120_LCURLISTRecord rec = new SE_BNS_2120_LCURLISTRecord();
			rec.bo_cd = Util.checkString(rset2.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset2.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset2.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset2.getString("bo_head_nm"));
			rec.chrg_pers = Util.checkString(rset2.getString("chrg_pers"));
			rec.bns_item_cd = Util.checkString(rset2.getString("bns_item_cd"));
			rec.bns_item_nm = Util.checkString(rset2.getString("bns_item_nm"));
			rec.divn_dt = Util.checkString(rset2.getString("divn_dt"));
			rec.ewh_seq = Util.checkString(rset2.getString("ewh_seq"));
			rec.bal = Util.checkString(rset2.getString("bal"));
			rec.acct_rcpm_rem_amt = Util.checkString(rset2.getString("acct_rcpm_rem_amt"));
			rec.acpt_rcpm_reg_tot_amt = Util.checkString(rset2.getString("acpt_rcpm_reg_tot_amt"));
			rec.amt1 = Util.checkString(rset2.getString("amt1"));
			rec.amt_sum = Util.checkString(rset2.getString("amt_sum"));
			rec.rcpm_shet_no = Util.checkString(rset2.getString("rcpm_shet_no"));
			rec.rmtt_dt = Util.checkString(rset2.getString("rmtt_dt"));
			rec.rmtt_plac = Util.checkString(rset2.getString("rmtt_plac"));
			rec.tran_amt = Util.checkString(rset2.getString("tran_amt"));
			rec.biz_reg_no = Util.checkString(rset2.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset2.getString("bank_id"));
			rec.acct_num = Util.checkString(rset2.getString("acct_num"));
			rec.tran_date = Util.checkString(rset2.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset2.getString("tran_date_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BNS_2120_LDataSet ds = (SE_BNS_2120_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BNS_2120_LCURLISTRecord curlistRec = (SE_BNS_2120_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.bo_head_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.bns_item_cd%>
<%= curlistRec.bns_item_nm%>
<%= curlistRec.divn_dt%>
<%= curlistRec.ewh_seq%>
<%= curlistRec.bal%>
<%= curlistRec.acct_rcpm_rem_amt%>
<%= curlistRec.acpt_rcpm_reg_tot_amt%>
<%= curlistRec.amt1%>
<%= curlistRec.amt_sum%>
<%= curlistRec.rcpm_shet_no%>
<%= curlistRec.rmtt_dt%>
<%= curlistRec.rmtt_plac%>
<%= curlistRec.tran_amt%>
<%= curlistRec.biz_reg_no%>
<%= curlistRec.bank_id%>
<%= curlistRec.acct_num%>
<%= curlistRec.tran_date%>
<%= curlistRec.tran_date_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 16:15:43 KST 2009 */