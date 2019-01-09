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


public class FC_ACCT_2571_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2571_LDataSet(){}
	public FC_ACCT_2571_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2571_LCURLISTRecord rec = new FC_ACCT_2571_LCURLISTRecord();
			rec.chk = Util.checkString(rset0.getString("chk"));
			rec.biz_reg_no = Util.checkString(rset0.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset0.getString("bank_id"));
			rec.acct_num = Util.checkString(rset0.getString("acct_num"));
			rec.acct_num_nm = Util.checkString(rset0.getString("acct_num_nm"));
			rec.acct_tonghwa = Util.checkString(rset0.getString("acct_tonghwa"));
			rec.tran_date = Util.checkString(rset0.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset0.getString("tran_date_seq"));
			rec.extnc_seq = Util.checkString(rset0.getString("extnc_seq"));
			rec.erp_transfer_date = Util.checkString(rset0.getString("erp_transfer_date"));
			rec.tran_content = Util.checkString(rset0.getString("tran_content"));
			rec.tran_amt = Util.checkString(rset0.getString("tran_amt"));
			rec.extnc_amt = Util.checkString(rset0.getString("extnc_amt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.slip_aprv_yn = Util.checkString(rset0.getString("slip_aprv_yn"));
			rec.chg_slip_no = Util.checkString(rset0.getString("chg_slip_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2571_LDataSet ds = (FC_ACCT_2571_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2571_LCURLISTRecord curlistRec = (FC_ACCT_2571_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.chk%>
<%= curlistRec.biz_reg_no%>
<%= curlistRec.bank_id%>
<%= curlistRec.acct_num%>
<%= curlistRec.acct_num_nm%>
<%= curlistRec.acct_tonghwa%>
<%= curlistRec.tran_date%>
<%= curlistRec.tran_date_seq%>
<%= curlistRec.extnc_seq%>
<%= curlistRec.erp_transfer_date%>
<%= curlistRec.tran_content%>
<%= curlistRec.tran_amt%>
<%= curlistRec.extnc_amt%>
<%= curlistRec.slip_no%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.slip_aprv_yn%>
<%= curlistRec.chg_slip_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 13 14:52:50 KST 2012 */