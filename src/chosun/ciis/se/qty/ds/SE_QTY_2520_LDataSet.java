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


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2520_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String title;

	public SE_QTY_2520_LDataSet(){}
	public SE_QTY_2520_LDataSet(String errcode, String errmsg, String title){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.title = title;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTitle(){
		return this.title;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.title = Util.checkString(cstmt.getString(10));
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_QTY_2520_LCURLISTRecord rec = new SE_QTY_2520_LCURLISTRecord();
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.send_plac_nm = Util.checkString(rset0.getString("send_plac_nm"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_2520_LDataSet ds = (SE_QTY_2520_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_2520_LCURLISTRecord curlistRec = (SE_QTY_2520_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTitle()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.area_nm%>
<%= curlistRec.send_plac_nm%>
<%= curlistRec.qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 16:23:27 KST 2009 */