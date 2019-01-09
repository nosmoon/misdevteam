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


package chosun.ciis.tn.dns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_5010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_DNS_5010_LDataSet(){}
	public TN_DNS_5010_LDataSet(String errcode, String errmsg){
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
			TN_DNS_5010_LCURLISTRecord rec = new TN_DNS_5010_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.subs_nm = Util.checkString(rset0.getString("subs_nm"));
			rec.subs_addr = Util.checkString(rset0.getString("subs_addr"));
			rec.subs_tel = Util.checkString(rset0.getString("subs_tel"));
			rec.subs_email = Util.checkString(rset0.getString("subs_email"));
			rec.agree_yn = Util.checkString(rset0.getString("agree_yn"));
			rec.etc1 = Util.checkString(rset0.getString("etc1"));
			rec.etc2 = Util.checkString(rset0.getString("etc2"));
			rec.etc3 = Util.checkString(rset0.getString("etc3"));
			rec.etc4 = Util.checkString(rset0.getString("etc4"));
			rec.etc5 = Util.checkString(rset0.getString("etc5"));
			rec.event_cd = Util.checkString(rset0.getString("event_cd"));
			rec.incmgdt = Util.checkString(rset0.getString("incmgdt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_DNS_5010_LDataSet ds = (TN_DNS_5010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_DNS_5010_LCURLISTRecord curlistRec = (TN_DNS_5010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seq%>
<%= curlistRec.subs_nm%>
<%= curlistRec.subs_addr%>
<%= curlistRec.subs_tel%>
<%= curlistRec.subs_email%>
<%= curlistRec.agree_yn%>
<%= curlistRec.etc1%>
<%= curlistRec.etc2%>
<%= curlistRec.etc3%>
<%= curlistRec.etc4%>
<%= curlistRec.etc5%>
<%= curlistRec.event_cd%>
<%= curlistRec.incmgdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 01 13:56:28 KST 2017 */