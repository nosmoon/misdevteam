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


public class SE_SAL_2400_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String max_yymm;

	public SE_SAL_2400_MDataSet(){}
	public SE_SAL_2400_MDataSet(String errcode, String errmsg, String max_yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.max_yymm = max_yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMax_yymm(String max_yymm){
		this.max_yymm = max_yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMax_yymm(){
		return this.max_yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset5 = (ResultSet) cstmt.getObject(8);
		while(rset5.next()){
			SE_SAL_2400_MTEAMLISTRecord rec = new SE_SAL_2400_MTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset5.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset5.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(9);
		while(rset6.next()){
			SE_SAL_2400_MPARTLISTRecord rec = new SE_SAL_2400_MPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset6.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset6.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset6.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(10);
		while(rset7.next()){
			SE_SAL_2400_MAREALISTRecord rec = new SE_SAL_2400_MAREALISTRecord();
			rec.area_cd = Util.checkString(rset7.getString("area_cd"));
			rec.area_nm = Util.checkString(rset7.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset7.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset7.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(11);
		while(rset8.next()){
			SE_SAL_2400_MCURLISTRecord rec = new SE_SAL_2400_MCURLISTRecord();
			rec.cd = Util.checkString(rset8.getString("cd"));
			rec.cdnm = Util.checkString(rset8.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset8.getString("cd_abrv_nm"));
			this.curlist.add(rec);
		}
		this.max_yymm = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_2400_MDataSet ds = (SE_SAL_2400_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SE_SAL_2400_MTEAMLISTRecord teamlistRec = (SE_SAL_2400_MTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SE_SAL_2400_MPARTLISTRecord partlistRec = (SE_SAL_2400_MPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SE_SAL_2400_MAREALISTRecord arealistRec = (SE_SAL_2400_MAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_2400_MCURLISTRecord curlistRec = (SE_SAL_2400_MCURLISTRecord)ds.curlist.get(i);%>
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
<%= ds.getCurlist()%>
<%= ds.getMax_yymm()%>
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
<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 04 14:57:08 KST 2009 */