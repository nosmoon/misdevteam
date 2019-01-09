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


package chosun.ciis.ad.com.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.com.rec.AD_COM_1510_LCURLISTRecord;

/**
 * 
 */


public class AD_COM_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_COM_1510_LDataSet(){}
	public AD_COM_1510_LDataSet(String errcode, String errmsg){
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
			AD_COM_1510_LCURLISTRecord rec = new AD_COM_1510_LCURLISTRecord();
			rec.yyyy = Util.checkString(rset0.getString("yyyy"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.doc_no = Util.checkString(rset0.getString("doc_no"));
			rec.rcv_plac = Util.checkString(rset0.getString("rcv_plac"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.make_pers = Util.checkString(rset0.getString("make_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_COM_1510_LDataSet ds = (AD_COM_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_COM_1510_LCURLISTRecord curlistRec = (AD_COM_1510_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yyyy%>
<%= curlistRec.seq%>
<%= curlistRec.doc_no%>
<%= curlistRec.rcv_plac%>
<%= curlistRec.titl%>
<%= curlistRec.make_dt%>
<%= curlistRec.make_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 14:14:54 KST 2009 */