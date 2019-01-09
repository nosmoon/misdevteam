/***************************************************************************************************
* 파일명 : .java
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


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_5010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_LNK_5010_LDataSet(){}
	public TN_LNK_5010_LDataSet(String errcode, String errmsg){
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
			TN_LNK_5010_LCURLISTRecord rec = new TN_LNK_5010_LCURLISTRecord();
			rec.sdsiidx = Util.checkString(rset0.getString("sdsiidx"));
			rec.deptidx = Util.checkString(rset0.getString("deptidx"));
			rec.paymethodcode = Util.checkString(rset0.getString("paymethodcode"));
			rec.pymtyymm = Util.checkString(rset0.getString("pymtyymm"));
			rec.pymtdd = Util.checkString(rset0.getString("pymtdd"));
			rec.requestdate = Util.checkString(rset0.getString("requestdate"));
			rec.acptdate = Util.checkString(rset0.getString("acptdate"));
			rec.paydate = Util.checkString(rset0.getString("paydate"));
			rec.requestcount = Util.checkString(rset0.getString("requestcount"));
			rec.requestprice = Util.checkString(rset0.getString("requestprice"));
			rec.acptcount = Util.checkString(rset0.getString("acptcount"));
			rec.acptprice = Util.checkString(rset0.getString("acptprice"));
			rec.paycount = Util.checkString(rset0.getString("paycount"));
			rec.payprice = Util.checkString(rset0.getString("payprice"));
			rec.errorcount = Util.checkString(rset0.getString("errorcount"));
			rec.errorpayprice = Util.checkString(rset0.getString("errorpayprice"));
			rec.taxfee = Util.checkString(rset0.getString("taxfee"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.delcount = Util.checkString(rset0.getString("delcount"));
			rec.delprice = Util.checkString(rset0.getString("delprice"));
			rec.cnclcount = Util.checkString(rset0.getString("cnclcount"));
			rec.cnclprice = Util.checkString(rset0.getString("cnclprice"));
			rec.status1 = Util.checkString(rset0.getString("status1"));
			rec.status2 = Util.checkString(rset0.getString("status2"));
			rec.status3 = Util.checkString(rset0.getString("status3"));
			rec.status4 = Util.checkString(rset0.getString("status4"));
			rec.status = Util.checkString(rset0.getString("status"));
			rec.fmsseq = Util.checkString(rset0.getString("fmsseq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_5010_LDataSet ds = (TN_LNK_5010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_5010_LCURLISTRecord curlistRec = (TN_LNK_5010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sdsiidx%>
<%= curlistRec.deptidx%>
<%= curlistRec.paymethodcode%>
<%= curlistRec.pymtyymm%>
<%= curlistRec.pymtdd%>
<%= curlistRec.requestdate%>
<%= curlistRec.acptdate%>
<%= curlistRec.paydate%>
<%= curlistRec.requestcount%>
<%= curlistRec.requestprice%>
<%= curlistRec.acptcount%>
<%= curlistRec.acptprice%>
<%= curlistRec.paycount%>
<%= curlistRec.payprice%>
<%= curlistRec.errorcount%>
<%= curlistRec.errorpayprice%>
<%= curlistRec.taxfee%>
<%= curlistRec.fee%>
<%= curlistRec.delcount%>
<%= curlistRec.delprice%>
<%= curlistRec.cnclcount%>
<%= curlistRec.cnclprice%>
<%= curlistRec.status1%>
<%= curlistRec.status2%>
<%= curlistRec.status3%>
<%= curlistRec.status4%>
<%= curlistRec.status%>
<%= curlistRec.fmsseq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 29 10:55:50 KST 2016 */