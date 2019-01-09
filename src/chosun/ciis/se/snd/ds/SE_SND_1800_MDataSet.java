/***************************************************************************************************
* 파일명 : SE_SND_1800_MDataSet.java
* 기능 : 판매 - 발송관리 - 노선조회
* 작성일자 : 2009.03.12
* 작성자 :   김대준
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


public class SE_SND_1800_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist 	= new ArrayList();
	public ArrayList arealist 	= new ArrayList();
	public ArrayList routelist 	= new ArrayList();
	public ArrayList partlist 	= new ArrayList();
	public ArrayList medilist 	= new ArrayList();
	public String errcode	;
	public String errmsg	;

	public SE_SND_1800_MDataSet(){}
	public SE_SND_1800_MDataSet(String errcode, String errmsg){
		this.errcode 	= errcode;
		this.errmsg 	= errmsg;
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
			SE_SND_1800_MTEAMLISTRecord rec = new SE_SND_1800_MTEAMLISTRecord();
			rec.dept_cd 		= Util.checkString(rset0.getString("dept_cd"		));
			rec.dept_nm 		= Util.checkString(rset0.getString("dept_nm"		));
			this.teamlist.add(rec);
		}
		ResultSet rset1 		= (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SE_SND_1800_MPARTLISTRecord rec = new SE_SND_1800_MPARTLISTRecord();
			rec.dept_cd 		= Util.checkString(rset1.getString("dept_cd"		));
			rec.dept_nm 		= Util.checkString(rset1.getString("dept_nm"		));
			rec.supr_dept_cd 	= Util.checkString(rset1.getString("supr_dept_cd"	));
			this.partlist.add(rec);
		}
		ResultSet rset2 		= (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SE_SND_1800_MAREALISTRecord rec = new SE_SND_1800_MAREALISTRecord();
			rec.area_cd 		= Util.checkString(rset2.getString("area_cd"		));
			rec.area_nm 		= Util.checkString(rset2.getString("area_nm"		));
			rec.dept_cd 		= Util.checkString(rset2.getString("dept_cd"		));
			rec.supr_dept_cd 	= Util.checkString(rset2.getString("supr_dept_cd"	));
			this.arealist.add(rec);
		}
		ResultSet rset3 		= (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			SE_SND_1800_MROUTELISTRecord rec = new SE_SND_1800_MROUTELISTRecord();
			rec.cd 				= Util.checkString(rset3.getString("cd"				));
			rec.cdnm 			= Util.checkString(rset3.getString("cdnm"			));
			rec.cd_abrv_nm 		= Util.checkString(rset3.getString("cd_abrv_nm"		));
			this.routelist.add(rec);
		}
		ResultSet rset4 		= (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			SE_SND_1800_MMEDILISTRecord rec = new SE_SND_1800_MMEDILISTRecord();
			rec.cd 				= Util.checkString(rset4.getString("cd"				));
			rec.cdnm 			= Util.checkString(rset4.getString("cdnm"			));
			rec.cd_abrv_nm 		= Util.checkString(rset4.getString("cd_abrv_nm"		));
			this.medilist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_1800_MDataSet ds = (SE_SND_1800_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SE_SND_1800_MTEAMLISTRecord teamlistRec = (SE_SND_1800_MTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SE_SND_1800_MPARTLISTRecord partlistRec = (SE_SND_1800_MPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SE_SND_1800_MAREALISTRecord arealistRec = (SE_SND_1800_MAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.routelist.size(); i++){
		SE_SND_1800_MROUTELISTRecord routelistRec = (SE_SND_1800_MROUTELISTRecord)ds.routelist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medilist.size(); i++){
		SE_SND_1800_MMEDILISTRecord medilistRec = (SE_SND_1800_MMEDILISTRecord)ds.medilist.get(i);%>
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
<%= ds.getRoutelist()%>
<%= ds.getMedilist()%>
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
<%= routelistRec.cd%>
<%= routelistRec.cdnm%>
<%= routelistRec.cd_abrv_nm%>
<%= medilistRec.cd%>
<%= medilistRec.cdnm%>
<%= medilistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 12 14:33:24 KST 2009 */