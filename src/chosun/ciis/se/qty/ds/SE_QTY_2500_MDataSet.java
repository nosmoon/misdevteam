/***************************************************************************************************
* 파일명 : SE_QTY_2500_MDataSet.java
* 기능 : 부수관리 - 발송부수 - 노선별발송부수현황
* 작성일자 : 2009-03-06
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
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2500_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList arealist 	= new ArrayList();
	public ArrayList curlist 	= new ArrayList();
	public String errcode	;
	public String errmsg	;

	public SE_QTY_2500_MDataSet(){}
	public SE_QTY_2500_MDataSet(String errcode, String errmsg){
		this.errcode 	= errcode	;
		this.errmsg 	= errmsg	;
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
		this.errcode 		= Util.checkString(cstmt.getString(1));
		this.errmsg 		= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 	= (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_QTY_2500_MCURLISTRecord rec = new SE_QTY_2500_MCURLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.curlist.add(rec);
		}
		ResultSet rset1 	= (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SE_QTY_2500_MAREALISTRecord rec = new SE_QTY_2500_MAREALISTRecord();
			rec.area_cd 	= Util.checkString(rset1.getString("area_cd"	));
			rec.area_nm 	= Util.checkString(rset1.getString("area_nm"	));
			this.arealist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_2500_MDataSet ds = (SE_QTY_2500_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_2500_MCURLISTRecord curlistRec = (SE_QTY_2500_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SE_QTY_2500_MAREALISTRecord arealistRec = (SE_QTY_2500_MAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getArealist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= arealistRec.area_cd%>
<%= arealistRec.area_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 10:36:50 KST 2009 */