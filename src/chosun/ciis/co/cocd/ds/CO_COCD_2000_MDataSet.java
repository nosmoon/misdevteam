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


package chosun.ciis.co.cocd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_2000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_COCD_2000_MDataSet(){}
	public CO_COCD_2000_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			CO_COCD_2000_MCURLIST1Record rec = new CO_COCD_2000_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			CO_COCD_2000_MCURLIST2Record rec = new CO_COCD_2000_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cd1 = Util.checkString(rset1.getString("cd1"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			CO_COCD_2000_MCURLIST3Record rec = new CO_COCD_2000_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			CO_COCD_2000_MCURLIST4Record rec = new CO_COCD_2000_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cd1 = Util.checkString(rset3.getString("cd1"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			CO_COCD_2000_MCURLIST5Record rec = new CO_COCD_2000_MCURLIST5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cd1 = Util.checkString(rset4.getString("cd1"));
			rec.cd2 = Util.checkString(rset4.getString("cd2"));
			this.curlist5.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_COCD_2000_MDataSet ds = (CO_COCD_2000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		CO_COCD_2000_MCURLIST1Record curlist1Rec = (CO_COCD_2000_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		CO_COCD_2000_MCURLIST2Record curlist2Rec = (CO_COCD_2000_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		CO_COCD_2000_MCURLIST3Record curlist3Rec = (CO_COCD_2000_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		CO_COCD_2000_MCURLIST4Record curlist4Rec = (CO_COCD_2000_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		CO_COCD_2000_MCURLIST5Record curlist5Rec = (CO_COCD_2000_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cd1%>
<%= curlist3Rec.cd%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cd1%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cd1%>
<%= curlist5Rec.cd2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 31 11:13:39 KST 2012 */