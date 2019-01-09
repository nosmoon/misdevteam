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


package chosun.ciis.ad.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.rec.*;

/**
 * 
 */


public class AD_EVLU_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_EVLU_2210_LDataSet(){}
	public AD_EVLU_2210_LDataSet(String errcode, String errmsg){
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
			AD_EVLU_2210_LCURLISTRecord rec = new AD_EVLU_2210_LCURLISTRecord();
			rec.pubc_yyyymmdd = Util.checkString(rset0.getString("pubc_yyyymmdd"));
			rec.yoil = Util.checkString(rset0.getString("yoil"));
			rec.scorecode = Util.checkString(rset0.getString("scorecode"));
			rec.scor = Util.checkString(rset0.getString("scor"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.evlu_pers_emp_no = Util.checkString(rset0.getString("evlu_pers_emp_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_EVLU_2210_LDataSet ds = (AD_EVLU_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_EVLU_2210_LCURLISTRecord curlistRec = (AD_EVLU_2210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pubc_yyyymmdd%>
<%= curlistRec.yoil%>
<%= curlistRec.scorecode%>
<%= curlistRec.scor%>
<%= curlistRec.remk%>
<%= curlistRec.evlu_pers_emp_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 22 15:16:45 KST 2010 */