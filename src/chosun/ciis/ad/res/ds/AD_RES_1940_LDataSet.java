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


package chosun.ciis.ad.res.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.res.rec.AD_RES_1940_LCURLISTRecord;

/**
 * 
 */


public class AD_RES_1940_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_RES_1940_LDataSet(){}
	public AD_RES_1940_LDataSet(String errcode, String errmsg){
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
			AD_RES_1940_LCURLISTRecord rec = new AD_RES_1940_LCURLISTRecord();
			rec.sun = Util.checkString(rset0.getString("sun"));
			rec.mon = Util.checkString(rset0.getString("mon"));
			rec.tue = Util.checkString(rset0.getString("tue"));
			rec.wed = Util.checkString(rset0.getString("wed"));
			rec.thr = Util.checkString(rset0.getString("thr"));
			rec.fri = Util.checkString(rset0.getString("fri"));
			rec.sat = Util.checkString(rset0.getString("sat"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1940_LDataSet ds = (AD_RES_1940_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1940_LCURLISTRecord curlistRec = (AD_RES_1940_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sun%>
<%= curlistRec.mon%>
<%= curlistRec.tue%>
<%= curlistRec.wed%>
<%= curlistRec.thr%>
<%= curlistRec.fri%>
<%= curlistRec.sat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 22 18:04:36 KST 2009 */