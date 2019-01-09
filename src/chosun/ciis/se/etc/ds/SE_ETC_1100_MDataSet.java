/***************************************************************************************************
* 파일명 : SE_ETC_1100_MDataSet.java
* 기능 : 판매-기타관리-확장수당 지급내역 조회
* 작성일자 : 2009-03-04
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.etc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.rec.*;

/**
 * 
 */


public class SE_ETC_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist 	= new ArrayList();
	public ArrayList arealist 	= new ArrayList();
	public ArrayList partlist 	= new ArrayList();
	public ArrayList objlist 	= new ArrayList();
	public String errcode	;
	public String errmsg	;

	public SE_ETC_1100_MDataSet(){}
	public SE_ETC_1100_MDataSet(String errcode, String errmsg){
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
		this.errcode 			= Util.checkString(cstmt.getString(1));
		this.errmsg 			= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 		= (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_ETC_1100_MTEAMLISTRecord rec = new SE_ETC_1100_MTEAMLISTRecord();
			rec.dept_cd 		= Util.checkString(rset0.getString("dept_cd"		));
			rec.dept_nm 		= Util.checkString(rset0.getString("dept_nm"		));
			this.teamlist.add(rec);
		}
		ResultSet rset1 		= (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SE_ETC_1100_MPARTLISTRecord rec = new SE_ETC_1100_MPARTLISTRecord();
			rec.dept_cd 		= Util.checkString(rset1.getString("dept_cd"		));
			rec.dept_nm 		= Util.checkString(rset1.getString("dept_nm"		));
			rec.supr_dept_cd 	= Util.checkString(rset1.getString("supr_dept_cd"	));
			this.partlist.add(rec);
		}
		ResultSet rset2 		= (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			SE_ETC_1100_MAREALISTRecord rec = new SE_ETC_1100_MAREALISTRecord();
			rec.area_cd 		= Util.checkString(rset2.getString("area_cd"		));
			rec.area_nm 		= Util.checkString(rset2.getString("area_nm"		));
			rec.dept_cd 		= Util.checkString(rset2.getString("dept_cd"		));
			rec.supr_dept_cd 	= Util.checkString(rset2.getString("supr_dept_cd"	));
			this.arealist.add(rec);
		}
		ResultSet rset3 		= (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			SE_ETC_1100_MOBJLISTRecord rec = new SE_ETC_1100_MOBJLISTRecord();
			rec.cd 				= Util.checkString(rset3.getString("cd"				));
			rec.cdnm 			= Util.checkString(rset3.getString("cdnm"			));
			rec.cd_abrv_nm 		= Util.checkString(rset3.getString("cd_abrv_nm"		));
			this.objlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_ETC_1100_MDataSet ds = (SE_ETC_1100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SE_ETC_1100_MTEAMLISTRecord teamlistRec = (SE_ETC_1100_MTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SE_ETC_1100_MPARTLISTRecord partlistRec = (SE_ETC_1100_MPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SE_ETC_1100_MAREALISTRecord arealistRec = (SE_ETC_1100_MAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.objlist.size(); i++){
		SE_ETC_1100_MOBJLISTRecord objlistRec = (SE_ETC_1100_MOBJLISTRecord)ds.objlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getArealist()%>
<%= ds.getObjlist()%>
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
<%= objlistRec.cd%>
<%= objlistRec.cdnm%>
<%= objlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 04 17:23:51 KST 2009 */