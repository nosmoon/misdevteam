/***************************************************************************************************
* 파일명 : SE_ETC_1000_MDataSet.java
* 기능 : 판매-기타관리-확장수당등록
* 작성일자 : 2009-03-02
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


public class SE_ETC_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist 	= new ArrayList();
	public ArrayList banklist 	= new ArrayList();
	public ArrayList mthdlist 	= new ArrayList();
	public ArrayList objlist 	= new ArrayList();
	public String errcode	;
	public String errmsg	;

	public SE_ETC_1000_MDataSet(){}
	public SE_ETC_1000_MDataSet(String errcode, String errmsg){
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
		this.errcode 		= Util.checkString(cstmt.getString(1));
		this.errmsg 		= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 	= (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_ETC_1000_MCURLISTRecord rec = new SE_ETC_1000_MCURLISTRecord();
			rec.dept_cd 	= Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm 	= Util.checkString(rset0.getString("dept_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 	= (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SE_ETC_1000_MMTHDLISTRecord rec = new SE_ETC_1000_MMTHDLISTRecord();
			rec.cd 			= Util.checkString(rset1.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset1.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset1.getString("cd_abrv_nm"	));
			this.mthdlist.add(rec);
		}
		ResultSet rset2 	= (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			SE_ETC_1000_MOBJLISTRecord rec = new SE_ETC_1000_MOBJLISTRecord();
			rec.cd 			= Util.checkString(rset2.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset2.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset2.getString("cd_abrv_nm"	));
			this.objlist.add(rec);
		}
		ResultSet rset4 	= (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			SE_ETC_1000_MBANKLISTRecord rec = new SE_ETC_1000_MBANKLISTRecord();
			rec.cd 			= Util.checkString(rset4.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset4.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset4.getString("cd_abrv_nm"	));
			this.banklist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_ETC_1000_MDataSet ds = (SE_ETC_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_ETC_1000_MCURLISTRecord curlistRec = (SE_ETC_1000_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.mthdlist.size(); i++){
		SE_ETC_1000_MMTHDLISTRecord mthdlistRec = (SE_ETC_1000_MMTHDLISTRecord)ds.mthdlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.objlist.size(); i++){
		SE_ETC_1000_MOBJLISTRecord objlistRec = (SE_ETC_1000_MOBJLISTRecord)ds.objlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.decidlist.size(); i++){
		SE_ETC_1000_MDECIDLISTRecord decidlistRec = (SE_ETC_1000_MDECIDLISTRecord)ds.decidlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.banklist.size(); i++){
		SE_ETC_1000_MBANKLISTRecord banklistRec = (SE_ETC_1000_MBANKLISTRecord)ds.banklist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getMthdlist()%>
<%= ds.getObjlist()%>
<%= ds.getDecidlist()%>
<%= ds.getBanklist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= mthdlistRec.cd%>
<%= mthdlistRec.cdnm%>
<%= mthdlistRec.cd_abrv_nm%>
<%= objlistRec.cd%>
<%= objlistRec.cdnm%>
<%= objlistRec.cd_abrv_nm%>
<%= decidlistRec.cd%>
<%= decidlistRec.cdnm%>
<%= decidlistRec.cd_abrv_nm%>
<%= banklistRec.cd%>
<%= banklistRec.cdnm%>
<%= banklistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 02 15:29:40 KST 2009 */