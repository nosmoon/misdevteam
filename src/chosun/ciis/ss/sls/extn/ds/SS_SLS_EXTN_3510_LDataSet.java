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


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_3510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_3510_LDataSet(){}
	public SS_SLS_EXTN_3510_LDataSet(String errcode, String errmsg){
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
			SS_SLS_EXTN_3510_LCURCOMMLISTRecord rec = new SS_SLS_EXTN_3510_LCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.telno = Util.checkString(rset0.getString("telno"));
			rec.ptphno = Util.checkString(rset0.getString("ptphno"));
			rec.clamhystp = Util.checkString(rset0.getString("clamhystp"));
			rec.clamhystc = Util.checkString(rset0.getString("clamhystc"));
			rec.clamtmthd = Util.checkString(rset0.getString("clamtmthd"));
			rec.resitype = Util.checkString(rset0.getString("resitype"));
			rec.nowsubsyn = Util.checkString(rset0.getString("nowsubsyn"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.pay_reciyn = Util.checkString(rset0.getString("pay_reciyn"));
			rec.headnm = Util.checkString(rset0.getString("headnm"));
			rec.extntype = Util.checkString(rset0.getString("extntype"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_3510_LDataSet ds = (SS_SLS_EXTN_3510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_EXTN_3510_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_EXTN_3510_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.qty%>
<%= curcommlistRec.telno%>
<%= curcommlistRec.ptphno%>
<%= curcommlistRec.clamhystp%>
<%= curcommlistRec.clamhystc%>
<%= curcommlistRec.clamtmthd%>
<%= curcommlistRec.resitype%>
<%= curcommlistRec.nowsubsyn%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.pay_reciyn%>
<%= curcommlistRec.headnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 14 18:13:58 KST 2017 */