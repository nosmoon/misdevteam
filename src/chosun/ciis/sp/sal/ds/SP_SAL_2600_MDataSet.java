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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_2600_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cs_partlist = new ArrayList();
	public ArrayList cs_teamlist = new ArrayList();
	public ArrayList cs_arealist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_2600_MDataSet(){}
	public SP_SAL_2600_MDataSet(String errcode, String errmsg){
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
			SP_SAL_2600_MCS_TEAMLISTRecord rec = new SP_SAL_2600_MCS_TEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.cs_teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SP_SAL_2600_MCS_PARTLISTRecord rec = new SP_SAL_2600_MCS_PARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.cs_partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			SP_SAL_2600_MCS_AREALISTRecord rec = new SP_SAL_2600_MCS_AREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.cs_arealist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_2600_MDataSet ds = (SP_SAL_2600_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cs_teamlist.size(); i++){
		SP_SAL_2600_MCS_TEAMLISTRecord cs_teamlistRec = (SP_SAL_2600_MCS_TEAMLISTRecord)ds.cs_teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cs_partlist.size(); i++){
		SP_SAL_2600_MCS_PARTLISTRecord cs_partlistRec = (SP_SAL_2600_MCS_PARTLISTRecord)ds.cs_partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cs_arealist.size(); i++){
		SP_SAL_2600_MCS_AREALISTRecord cs_arealistRec = (SP_SAL_2600_MCS_AREALISTRecord)ds.cs_arealist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCs_teamlist()%>
<%= ds.getCs_partlist()%>
<%= ds.getCs_arealist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cs_teamlistRec.dept_cd%>
<%= cs_teamlistRec.dept_nm%>
<%= cs_partlistRec.dept_cd%>
<%= cs_partlistRec.dept_nm%>
<%= cs_partlistRec.supr_dept_cd%>
<%= cs_arealistRec.area_cd%>
<%= cs_arealistRec.area_nm%>
<%= cs_arealistRec.dept_cd%>
<%= cs_arealistRec.supr_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 23 10:48:10 KST 2012 */