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


public class FC_ACCT_5812_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5812_LDataSet(){}
	public FC_ACCT_5812_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_ACCT_5812_LCURLISTRecord rec = new FC_ACCT_5812_LCURLISTRecord();
			rec.supr_acct_cd = Util.checkString(rset0.getString("supr_acct_cd"));
			rec.insd_acct_nm = Util.checkString(rset0.getString("insd_acct_nm"));
			rec.acctcdacct_abrvnm = Util.checkString(rset0.getString("acctcdacct_abrvnm"));
			rec.acct_levl = Util.checkString(rset0.getString("acct_levl"));
			rec.etc = Util.checkString(rset0.getString("etc"));
			rec.medi_100 = Util.checkString(rset0.getString("medi_100"));
			rec.medi_200 = Util.checkString(rset0.getString("medi_200"));
			rec.medi_210 = Util.checkString(rset0.getString("medi_210"));
			rec.medi_300 = Util.checkString(rset0.getString("medi_300"));
			rec.medi_400 = Util.checkString(rset0.getString("medi_400"));
			rec.medi_410 = Util.checkString(rset0.getString("medi_410"));
			rec.medi_450 = Util.checkString(rset0.getString("medi_450"));
			rec.medi_500 = Util.checkString(rset0.getString("medi_500"));
			rec.medi_550 = Util.checkString(rset0.getString("medi_550"));
			rec.medi_600 = Util.checkString(rset0.getString("medi_600"));
			rec.medi_660 = Util.checkString(rset0.getString("medi_660"));
			rec.medi_700 = Util.checkString(rset0.getString("medi_700"));
			rec.medi_770 = Util.checkString(rset0.getString("medi_770"));
			rec.medi_810 = Util.checkString(rset0.getString("medi_810"));
			rec.medi_900 = Util.checkString(rset0.getString("medi_900"));
			rec.medi_910 = Util.checkString(rset0.getString("medi_910"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_5812_LDataSet ds = (FC_ACCT_5812_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_5812_LCURLISTRecord curlistRec = (FC_ACCT_5812_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.supr_acct_cd%>
<%= curlistRec.insd_acct_nm%>
<%= curlistRec.acctcdacct_abrvnm%>
<%= curlistRec.acct_levl%>
<%= curlistRec.etc%>
<%= curlistRec.medi_100%>
<%= curlistRec.medi_200%>
<%= curlistRec.medi_210%>
<%= curlistRec.medi_300%>
<%= curlistRec.medi_400%>
<%= curlistRec.medi_410%>
<%= curlistRec.medi_450%>
<%= curlistRec.medi_500%>
<%= curlistRec.medi_550%>
<%= curlistRec.medi_600%>
<%= curlistRec.medi_660%>
<%= curlistRec.medi_700%>
<%= curlistRec.medi_770%>
<%= curlistRec.medi_810%>
<%= curlistRec.medi_900%>
<%= curlistRec.medi_910%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 26 09:46:59 KST 2018 */