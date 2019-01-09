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


package chosun.ciis.tn.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 
 */


public class TN_RPT_1500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_RPT_1500_LDataSet(){}
	public TN_RPT_1500_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			TN_RPT_1500_LCURLISTRecord rec = new TN_RPT_1500_LCURLISTRecord();
			rec.promiseidx = Util.checkString(rset0.getString("promiseidx"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.code = Util.checkString(rset0.getString("code"));
			rec.kind = Util.checkString(rset0.getString("kind"));
			rec.data_kind = Util.checkString(rset0.getString("data_kind"));
			rec.chg_cont_ssum = Util.checkString(rset0.getString("chg_cont_ssum"));
			rec.chgpers = Util.checkString(rset0.getString("chgpers"));
			rec.chgincmgdt = Util.checkString(rset0.getString("chgincmgdt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_RPT_1500_LDataSet ds = (TN_RPT_1500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_RPT_1500_LCURLISTRecord curlistRec = (TN_RPT_1500_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.promiseidx%>
<%= curlistRec.memberidx%>
<%= curlistRec.kind%>
<%= curlistRec.data_kind%>
<%= curlistRec.chg_cont_ssum%>
<%= curlistRec.chgpers%>
<%= curlistRec.chgdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 03 10:17:03 KST 2016 */