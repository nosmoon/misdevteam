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


package chosun.ciis.co.job.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.job.dm.*;
import chosun.ciis.co.job.rec.*;

/**
 * 
 */


public class CO_JOB_2000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_JOB_2000_MDataSet(){}
	public CO_JOB_2000_MDataSet(String errcode, String errmsg){
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
			CO_JOB_2000_MCURLISTRecord rec = new CO_JOB_2000_MCURLISTRecord();
			rec.menu_id = Util.checkString(rset0.getString("menu_id"));
			rec.menu_nm = Util.checkString(rset0.getString("menu_nm"));
			rec.supr_menu_id = Util.checkString(rset0.getString("supr_menu_id"));
			rec.menu_level = Util.checkString(rset0.getString("menu_level"));
			rec.exec_url = Util.checkString(rset0.getString("exec_url"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			CO_JOB_2000_MCURLIST2Record rec = new CO_JOB_2000_MCURLIST2Record();
			rec.menu_id = Util.checkString(rset1.getString("menu_id"));
			rec.menu_nm = Util.checkString(rset1.getString("menu_nm"));
			rec.supr_menu_id = Util.checkString(rset1.getString("supr_menu_id"));
			rec.menu_level = Util.checkString(rset1.getString("menu_level"));
			rec.exec_url = Util.checkString(rset1.getString("exec_url"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_JOB_2000_MDataSet ds = (CO_JOB_2000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_JOB_2000_MCURLISTRecord curlistRec = (CO_JOB_2000_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		CO_JOB_2000_MCURLIST2Record curlist2Rec = (CO_JOB_2000_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.menu_id%>
<%= curlistRec.menu_nm%>
<%= curlistRec.supr_menu_id%>
<%= curlistRec.menu_level%>
<%= curlistRec.exec_url%>
<%= curlist2Rec.menu_id%>
<%= curlist2Rec.menu_nm%>
<%= curlist2Rec.supr_menu_id%>
<%= curlist2Rec.menu_level%>
<%= curlist2Rec.exec_url%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 10 17:35:22 KST 2009 */