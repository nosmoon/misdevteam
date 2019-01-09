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


package chosun.ciis.hd.trip.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_9996_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_TRIP_9996_LDataSet(){}
	public HD_TRIP_9996_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_TRIP_9996_LCURLIST1Record rec = new HD_TRIP_9996_LCURLIST1Record();
			rec.aply_frdt = Util.checkString(rset0.getString("aply_frdt"));
			rec.aply_todt = Util.checkString(rset0.getString("aply_todt"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			HD_TRIP_9996_LCURLIST2Record rec = new HD_TRIP_9996_LCURLIST2Record();
			rec.aply_frdt = Util.checkString(rset1.getString("aply_frdt"));
			rec.aply_todt = Util.checkString(rset1.getString("aply_todt"));
			rec.cnt = Util.checkString(rset1.getString("cnt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_9996_LDataSet ds = (HD_TRIP_9996_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_TRIP_9996_LCURLIST1Record curlist1Rec = (HD_TRIP_9996_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_TRIP_9996_LCURLIST2Record curlist2Rec = (HD_TRIP_9996_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.aply_frdt%>
<%= curlist1Rec.aply_todt%>
<%= curlist1Rec.cnt%>
<%= curlist2Rec.aply_frdt%>
<%= curlist2Rec.aply_todt%>
<%= curlist2Rec.cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Aug 09 14:28:17 KST 2009 */