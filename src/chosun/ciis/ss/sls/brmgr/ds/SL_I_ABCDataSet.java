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


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SL_I_ABCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList abccur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_I_ABCDataSet(){}
	public SL_I_ABCDataSet(String errcode, String errmsg){
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
			SL_I_ABCABCCURRecord rec = new SL_I_ABCABCCURRecord();
			rec.basiyymm = Util.checkString(rset0.getString("basiyymm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.cntrno = Util.checkString(rset0.getString("cntrno"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.valyymm = Util.checkString(rset0.getString("valyymm"));
			rec.abcvalyymm = Util.checkString(rset0.getString("abcvalyymm"));
			rec.dscnamt = Util.checkString(rset0.getString("dscnamt"));
			rec.subsqty = Util.checkString(rset0.getString("subsqty"));
			rec.resitypecd = Util.checkString(rset0.getString("resitypecd"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.clamtmms = Util.checkString(rset0.getString("clamtmms"));
			rec.re_freemms = Util.checkString(rset0.getString("re_freemms"));
			rec.clamthsty = Util.checkString(rset0.getString("clamthsty"));
			rec.status = Util.checkString(rset0.getString("status"));
			this.abccur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_I_ABCDataSet ds = (SL_I_ABCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.abccur.size(); i++){
		SL_I_ABCABCCURRecord abccurRec = (SL_I_ABCABCCURRecord)ds.abccur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAbccur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= abccurRec.basiyymm%>
<%= abccurRec.rdr_no%>
<%= abccurRec.medicd%>
<%= abccurRec.cntrno%>
<%= abccurRec.bocd%>
<%= abccurRec.valyymm%>
<%= abccurRec.abcvalyymm%>
<%= abccurRec.dscnamt%>
<%= abccurRec.subsqty%>
<%= abccurRec.resitypecd%>
<%= abccurRec.rdr_extndt%>
<%= abccurRec.clamtmms%>
<%= abccurRec.re_freemms%>
<%= abccurRec.clamthsty%>
<%= abccurRec.status%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 25 15:02:39 KST 2010 */