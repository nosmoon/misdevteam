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


public class FC_ACCT_6121_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6121_LDataSet(){}
	public FC_ACCT_6121_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_ACCT_6121_LCURLISTRecord rec = new FC_ACCT_6121_LCURLISTRecord();
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.sgamt6042 = Util.checkString(rset0.getString("sgamt6042"));
			rec.sgvat6042 = Util.checkString(rset0.getString("sgvat6042"));
			rec.sgamt8035 = Util.checkString(rset0.getString("sgamt8035"));
			rec.sgvat8035 = Util.checkString(rset0.getString("sgvat8035"));
			rec.sgamt6054 = Util.checkString(rset0.getString("sgamt6054"));
			rec.sgvat6054 = Util.checkString(rset0.getString("sgvat6054"));
			rec.sgtotamt = Util.checkString(rset0.getString("sgtotamt"));
			rec.sgtotvat = Util.checkString(rset0.getString("sgtotvat"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.hjpamt6042 = Util.checkString(rset0.getString("hjpamt6042"));
			rec.hjpvat6042 = Util.checkString(rset0.getString("hjpvat6042"));
			rec.hjpamt8035 = Util.checkString(rset0.getString("hjpamt8035"));
			rec.hjpvat8035 = Util.checkString(rset0.getString("hjpvat8035"));
			rec.hjpamt6054 = Util.checkString(rset0.getString("hjpamt6054"));
			rec.hjpvat6054 = Util.checkString(rset0.getString("hjpvat6054"));
			rec.hjptotamt = Util.checkString(rset0.getString("hjptotamt"));
			rec.hjptotvat = Util.checkString(rset0.getString("hjptotvat"));
			rec.diftotamt = Util.checkString(rset0.getString("diftotamt"));
			rec.diftotvat = Util.checkString(rset0.getString("diftotvat"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6121_LDataSet ds = (FC_ACCT_6121_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_6121_LCURLISTRecord curlistRec = (FC_ACCT_6121_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.make_dt%>
<%= curlistRec.prof_type_cd%>
<%= curlistRec.sgamt6042%>
<%= curlistRec.sgvat6042%>
<%= curlistRec.sgamt8035%>
<%= curlistRec.sgvat8035%>
<%= curlistRec.sgamt6054%>
<%= curlistRec.sgvat6054%>
<%= curlistRec.sgtotamt%>
<%= curlistRec.sgtotvat%>
<%= curlistRec.mang_clsf_cd%>
<%= curlistRec.hjpamt6042%>
<%= curlistRec.hjpvat6042%>
<%= curlistRec.hjpamt8035%>
<%= curlistRec.hjpvat8035%>
<%= curlistRec.hjpamt6054%>
<%= curlistRec.hjpvat6054%>
<%= curlistRec.hjptotamt%>
<%= curlistRec.hjptotvat%>
<%= curlistRec.diftotamt%>
<%= curlistRec.diftotvat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 15 15:11:41 KST 2009 */