/***************************************************************************************************
* 파일명 : SE_QTY_3010_LDataSet.java
* 기능 : 부수관리 - 발송부수 - 일일발송부수 증감조회
* 작성일자 : 2009-03-09
* 작성자 : 김대준
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
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_QTY_3010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode	;
	public String errmsg	;
	public String rownum	;
	
	public SE_QTY_3010_LDataSet(){}
	public SE_QTY_3010_LDataSet(String errcode, String errmsg, String rownum){
		this.errcode 	= errcode	;
		this.errmsg 	= errmsg	;
		this.rownum		= rownum	;
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

	public String getRownum() {
		return rownum;
	}
	public void setRownum(String rownum) {
		this.rownum = rownum;
	}
	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		this.rownum		= Util.checkString(cstmt.getString(5));
	}
	
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2600_MDataSet ds = (SE_SND_2600_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2600_MCURLISTRecord curlistRec = (SE_SND_2600_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.routelist.size(); i++){
		SE_SND_2600_MROUTELISTRecord routelistRec = (SE_SND_2600_MROUTELISTRecord)ds.routelist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getRoutelist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= routelistRec.cd%>
<%= routelistRec.cdnm%>
<%= routelistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 23 16:59:08 KST 2009 */