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


public class FC_ACCT_5332_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5332_LDataSet(){}
	public FC_ACCT_5332_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_5332_LCURLISTRecord rec = new FC_ACCT_5332_LCURLISTRecord();
			rec.sum_cbamt = Util.checkString(rset0.getString("sum_cbamt"));
			rec.jan_cbamt = Util.checkString(rset0.getString("jan_cbamt"));
			rec.insd_acct_cd = Util.checkString(rset0.getString("insd_acct_cd"));
			rec.acct_subj_nm = Util.checkString(rset0.getString("acct_subj_nm"));
			rec.slip_incmg_exne = Util.checkString(rset0.getString("slip_incmg_exne"));
			rec.acct_levl = Util.checkString(rset0.getString("acct_levl"));
			rec.jan_dbamt = Util.checkString(rset0.getString("jan_dbamt"));
			rec.sum_dbamt = Util.checkString(rset0.getString("sum_dbamt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_5332_LDataSet ds = (FC_ACCT_5332_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_5332_LCURLISTRecord curlistRec = (FC_ACCT_5332_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sum_cbamt%>
<%= curlistRec.jan_cbamt%>
<%= curlistRec.insd_acct_cd%>
<%= curlistRec.acct_subj_nm%>
<%= curlistRec.slip_incmg_exne%>
<%= curlistRec.acct_levl%>
<%= curlistRec.jan_dbamt%>
<%= curlistRec.sum_dbamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 10 16:48:00 KST 2009 */