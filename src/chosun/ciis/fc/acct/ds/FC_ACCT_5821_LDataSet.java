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


public class FC_ACCT_5821_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5821_LDataSet(){}
	public FC_ACCT_5821_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_5821_LCURLISTRecord rec = new FC_ACCT_5821_LCURLISTRecord();
			rec.pch_acctnm = Util.checkString(rset0.getString("pch_acctnm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.pch_compnm = Util.checkString(rset0.getString("pch_compnm"));
			rec.pch_convno = Util.checkString(rset0.getString("pch_convno"));
			rec.pch_gwgbnm = Util.checkString(rset0.getString("pch_gwgbnm"));
			rec.pch_mccdnm = Util.checkString(rset0.getString("pch_mccdnm"));
			rec.intg_dlco_cd = Util.checkString(rset0.getString("intg_dlco_cd"));
			rec.pch_hsnm = Util.checkString(rset0.getString("pch_hsnm"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.crdt_amt = Util.checkString(rset0.getString("crdt_amt"));
			rec.pch_amt = Util.checkString(rset0.getString("pch_amt"));
			rec.dr_amt_00 = Util.checkString(rset0.getString("dr_amt_00"));
			rec.crdt_amt_00 = Util.checkString(rset0.getString("crdt_amt_00"));
			rec.pch_amt_00 = Util.checkString(rset0.getString("pch_amt_00"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_5821_LDataSet ds = (FC_ACCT_5821_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_5821_LCURLISTRecord curlistRec = (FC_ACCT_5821_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pch_acctnm%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.pch_compnm%>
<%= curlistRec.pch_convno%>
<%= curlistRec.pch_gwgbnm%>
<%= curlistRec.pch_mccdnm%>
<%= curlistRec.intg_dlco_cd%>
<%= curlistRec.pch_hsnm%>
<%= curlistRec.dr_amt%>
<%= curlistRec.crdt_amt%>
<%= curlistRec.pch_amt%>
<%= curlistRec.dr_amt_00%>
<%= curlistRec.crdt_amt_00%>
<%= curlistRec.pch_amt_00%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 04 15:15:23 KST 2018 */