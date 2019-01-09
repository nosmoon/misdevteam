/***************************************************************************************************
* 파일명 : SE_SAL_1600_MDataSet.java
* 기능 : 판매 - 지대관리 - 매출관리 - 계산서 정정
* 작성일자 : 2009-04-14
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1600_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList issulist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_1600_MDataSet(){}
	public SE_SAL_1600_MDataSet(String errcode, String errmsg){
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
		ResultSet rset0 		= (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_SAL_1600_MTEAMLISTRecord rec = new SE_SAL_1600_MTEAMLISTRecord();
			rec.dept_cd 		= Util.checkString(rset0.getString("dept_cd"		));
			rec.dept_nm 		= Util.checkString(rset0.getString("dept_nm"		));
			this.teamlist.add(rec);
		}
		ResultSet rset1 		= (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SE_SAL_1600_MPARTLISTRecord rec = new SE_SAL_1600_MPARTLISTRecord();
			rec.dept_cd 		= Util.checkString(rset1.getString("dept_cd"		));
			rec.dept_nm 		= Util.checkString(rset1.getString("dept_nm"		));
			rec.supr_dept_cd 	= Util.checkString(rset1.getString("supr_dept_cd"	));
			this.partlist.add(rec);
		}
		ResultSet rset2 		= (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SE_SAL_1600_MAREALISTRecord rec = new SE_SAL_1600_MAREALISTRecord();
			rec.area_cd 		= Util.checkString(rset2.getString("area_cd"		));
			rec.area_nm 		= Util.checkString(rset2.getString("area_nm"		));
			rec.dept_cd 		= Util.checkString(rset2.getString("dept_cd"		));
			rec.supr_dept_cd 	= Util.checkString(rset2.getString("supr_dept_cd"	));
			this.arealist.add(rec);
		}
		ResultSet rset3 		= (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			SE_SAL_1600_MISSULISTRecord rec = new SE_SAL_1600_MISSULISTRecord();
			rec.cd 				= Util.checkString(rset3.getString("cd"				));
			rec.cdnm 			= Util.checkString(rset3.getString("cdnm"			));
			rec.cd_abrv_nm 		= Util.checkString(rset3.getString("cd_abrv_nm"		));
			this.issulist.add(rec);
		}
		
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_1600_MDataSet ds = (SE_SAL_1600_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SE_SAL_1600_MTEAMLISTRecord teamlistRec = (SE_SAL_1600_MTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SE_SAL_1600_MPARTLISTRecord partlistRec = (SE_SAL_1600_MPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SE_SAL_1600_MAREALISTRecord arealistRec = (SE_SAL_1600_MAREALISTRecord)ds.arealist.get(i);%>
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


/* 작성시간 : Tue Apr 14 19:43:41 KST 2009 */