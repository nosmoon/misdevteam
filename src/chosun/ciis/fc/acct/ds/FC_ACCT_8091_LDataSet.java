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


public class FC_ACCT_8091_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_8091_LDataSet(){}
	public FC_ACCT_8091_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			FC_ACCT_8091_LCURLISTRecord rec = new FC_ACCT_8091_LCURLISTRecord();
			rec.chk = Util.checkString(rset2.getString("chk"));
			rec.incm_clsf_cd = Util.checkString(rset2.getString("incm_clsf_cd"));
			rec.yscd = Util.checkString(rset2.getString("yscd"));
			rec.acntcymd = Util.checkString(rset2.getString("acntcymd"));
			rec.dlco_cd = Util.checkString(rset2.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset2.getString("dlco_nm"));
			rec.jgamt = Util.checkString(rset2.getString("jgamt"));
			rec.sdsamt = Util.checkString(rset2.getString("sdsamt"));
			rec.jmsamt = Util.checkString(rset2.getString("jmsamt"));
			rec.jeog = Util.checkString(rset2.getString("jeog"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_8091_LDataSet ds = (FC_ACCT_8091_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_8091_LCURLISTRecord curlistRec = (FC_ACCT_8091_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.incm_clsf_cd%>
<%= curlistRec.yscd%>
<%= curlistRec.acntcymd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.jgamt%>
<%= curlistRec.sdsamt%>
<%= curlistRec.jmsamt%>
<%= curlistRec.jeog%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 17 13:21:36 KST 2009 */