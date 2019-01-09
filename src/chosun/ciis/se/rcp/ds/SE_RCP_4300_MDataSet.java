/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_4300_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String yymm;

	public SE_RCP_4300_MDataSet(){}
	public SE_RCP_4300_MDataSet(String errcode, String errmsg, String yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.yymm = yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getYymm(){
		return this.yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.yymm = Util.checkString(cstmt.getString(8));
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			SE_RCP_4300_MTEAMLISTRecord rec = new SE_RCP_4300_MTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset3.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset3.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			SE_RCP_4300_MPARTLISTRecord rec = new SE_RCP_4300_MPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset4.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset4.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset4.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			SE_RCP_4300_MAREALISTRecord rec = new SE_RCP_4300_MAREALISTRecord();
			rec.area_cd = Util.checkString(rset5.getString("area_cd"));
			rec.area_nm = Util.checkString(rset5.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset5.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset5.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_RCP_4300_MDataSet ds = (SE_RCP_4300_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SE_RCP_4300_MTEAMLISTRecord teamlistRec = (SE_RCP_4300_MTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SE_RCP_4300_MPARTLISTRecord partlistRec = (SE_RCP_4300_MPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SE_RCP_4300_MAREALISTRecord arealistRec = (SE_RCP_4300_MAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getYymm()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getArealist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
<%= partlistRec.dept_cd%>
<%= partlistRec.dept_nm%>
<%= partlistRec.supr_dept_cd%>
<%= arealistRec.area_cd%>
<%= arealistRec.area_nm%>
<%= arealistRec.dept_cd%>
<%= arealistRec.supr_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 15 16:18:52 KST 2009 */