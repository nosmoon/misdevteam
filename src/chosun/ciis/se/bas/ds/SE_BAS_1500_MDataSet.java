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


package chosun.ciis.se.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1500_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String jd_yymm;

	public SE_BAS_1500_MDataSet(){}
	public SE_BAS_1500_MDataSet(String errcode, String errmsg, String jd_yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.jd_yymm = jd_yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setJd_yymm(String jd_yymm){
		this.jd_yymm = jd_yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getJd_yymm(){
		return this.jd_yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.jd_yymm = Util.checkString(cstmt.getString(7));
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SE_BAS_1500_MTEAMLISTRecord rec = new SE_BAS_1500_MTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SE_BAS_1500_MPARTLISTRecord rec = new SE_BAS_1500_MPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset2.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SE_BAS_1500_MAREALISTRecord rec = new SE_BAS_1500_MAREALISTRecord();
			rec.area_cd = Util.checkString(rset3.getString("area_cd"));
			rec.area_nm = Util.checkString(rset3.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset3.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset3.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BAS_1500_MDataSet ds = (SE_BAS_1500_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SE_BAS_1500_MTEAMLISTRecord teamlistRec = (SE_BAS_1500_MTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SE_BAS_1500_MPARTLISTRecord partlistRec = (SE_BAS_1500_MPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SE_BAS_1500_MAREALISTRecord arealistRec = (SE_BAS_1500_MAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getJd_yymm()%>
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


/* 작성시간 : Fri Aug 21 10:44:09 KST 2009 */