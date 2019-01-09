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


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_1830_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_1830_LDataSet(){}
	public HD_YADJM_1830_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_YADJM_1830_LCURLISTRecord rec = new HD_YADJM_1830_LCURLISTRecord();
			rec.pay_dt = Util.checkString(rset0.getString("pay_dt"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.firmnm = Util.checkString(rset0.getString("firmnm"));
			rec.obj_pers_flnm = Util.checkString(rset0.getString("obj_pers_flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.rshp = Util.checkString(rset0.getString("rshp"));
			rec.obcl_pers_rspc_yn = Util.checkString(rset0.getString("obcl_pers_rspc_yn"));
			rec.pay_noit_crdt_card_cash_rcpt = Util.checkString(rset0.getString("pay_noit_crdt_card_cash_rcpt"));
			rec.pay_amt_crdt_card_cash_rcpt = Util.checkString(rset0.getString("pay_amt_crdt_card_cash_rcpt"));
			rec.pay_noit_cash = Util.checkString(rset0.getString("pay_noit_cash"));
			rec.pay_amt_cash = Util.checkString(rset0.getString("pay_amt_cash"));
			rec.hosp_prof = Util.checkString(rset0.getString("hosp_prof"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.subf_treat_yn = Util.checkString(rset0.getString("subf_treat_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_1830_LDataSet ds = (HD_YADJM_1830_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_1830_LCURLISTRecord curlistRec = (HD_YADJM_1830_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pay_dt%>
<%= curlistRec.ern%>
<%= curlistRec.firmnm%>
<%= curlistRec.obj_pers_flnm%>
<%= curlistRec.prn%>
<%= curlistRec.rshp%>
<%= curlistRec.obcl_pers_rspc_yn%>
<%= curlistRec.pay_noit_crdt_card_cash_rcpt%>
<%= curlistRec.pay_amt_crdt_card_cash_rcpt%>
<%= curlistRec.pay_noit_cash%>
<%= curlistRec.pay_amt_cash%>
<%= curlistRec.hosp_prof%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 20 11:04:27 KST 2009 */