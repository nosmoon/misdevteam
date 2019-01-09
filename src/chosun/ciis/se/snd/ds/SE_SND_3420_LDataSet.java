/***************************************************************************************************
* 파일명 : SE_SND_3420_LDataSet.java
* 기능 : 판매 - 발송관리 - 대표노선, 노선 설정
* 작성일자 : 2009-05-14
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_3420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList inlist = new ArrayList();
	public ArrayList nolist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_3420_LDataSet(){}
	public SE_SND_3420_LDataSet(String errcode, String errmsg){
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
		this.errcode 			= Util.checkString(cstmt.getString(1));
		this.errmsg 			= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 		= (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_SND_3420_LINLISTRecord rec = new SE_SND_3420_LINLISTRecord();
			rec.route_clsf 		= Util.checkString(rset0.getString("route_clsf"		));
			rec.rptv_route_cd 	= Util.checkString(rset0.getString("rptv_route_cd"	));
			rec.rptv_route_nm 	= Util.checkString(rset0.getString("rptv_route_nm"	));
			rec.route_cd 		= Util.checkString(rset0.getString("route_cd"		));
			rec.route_nm 		= Util.checkString(rset0.getString("route_nm"		));
			this.inlist.add(rec);
		}
		ResultSet rset1 		= (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SE_SND_3420_LNOLISTRecord rec = new SE_SND_3420_LNOLISTRecord();
			rec.route_clsf 		= Util.checkString(rset1.getString("route_clsf"		));
			rec.rptv_route_cd 	= Util.checkString(rset1.getString("rptv_route_cd"	));
			rec.rptv_route_nm 	= Util.checkString(rset1.getString("rptv_route_nm"	));
			rec.route_cd 		= Util.checkString(rset1.getString("route_cd"		));
			rec.route_nm 		= Util.checkString(rset1.getString("route_nm"		));
			this.nolist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_3420_LDataSet ds = (SE_SND_3420_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.inlist.size(); i++){
		SE_SND_3420_LINLISTRecord inlistRec = (SE_SND_3420_LINLISTRecord)ds.inlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.nolist.size(); i++){
		SE_SND_3420_LNOLISTRecord nolistRec = (SE_SND_3420_LNOLISTRecord)ds.nolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getInlist()%>
<%= ds.getNolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= inlistRec.route_clsf%>
<%= inlistRec.rptv_route_cd%>
<%= inlistRec.rptv_route_nm%>
<%= inlistRec.route_cd%>
<%= inlistRec.route_nm%>
<%= nolistRec.route_clsf%>
<%= nolistRec.rptv_route_cd%>
<%= nolistRec.rptv_route_nm%>
<%= nolistRec.route_cd%>
<%= nolistRec.route_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 14 17:12:53 KST 2009 */