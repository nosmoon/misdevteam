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


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_7410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_7410_LDataSet(){}
	public MT_COMMATR_7410_LDataSet(String errcode, String errmsg){
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
			MT_COMMATR_7410_LCURLISTRecord rec = new MT_COMMATR_7410_LCURLISTRecord();
			rec.factcd = Util.checkString(rset0.getString("factcd"));
			rec.fact_nm = Util.checkString(rset0.getString("fact_nm"));
			rec.wgt_1101 = Util.checkString(rset0.getString("wgt_1101"));
			rec.per_1101 = Util.checkString(rset0.getString("per_1101"));
			rec.wgt_1102 = Util.checkString(rset0.getString("wgt_1102"));
			rec.per_1102 = Util.checkString(rset0.getString("per_1102"));
			rec.wgt_1105 = Util.checkString(rset0.getString("wgt_1105"));
			rec.per_1105 = Util.checkString(rset0.getString("per_1105"));
			rec.wgt_1106 = Util.checkString(rset0.getString("wgt_1106"));
			rec.per_1106 = Util.checkString(rset0.getString("per_1106"));
			rec.wgt_tot = Util.checkString(rset0.getString("wgt_tot"));
			rec.per_tot = Util.checkString(rset0.getString("per_tot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_7410_LDataSet ds = (MT_COMMATR_7410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_7410_LCURLISTRecord curlistRec = (MT_COMMATR_7410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.factcd%>
<%= curlistRec.fact_nm%>
<%= curlistRec.wgt_1101%>
<%= curlistRec.per_1101%>
<%= curlistRec.wgt_1102%>
<%= curlistRec.per_1102%>
<%= curlistRec.wgt_1105%>
<%= curlistRec.per_1105%>
<%= curlistRec.wgt_1106%>
<%= curlistRec.per_1106%>
<%= curlistRec.wgt_tot%>
<%= curlistRec.per_tot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 16 18:57:25 KST 2015 */