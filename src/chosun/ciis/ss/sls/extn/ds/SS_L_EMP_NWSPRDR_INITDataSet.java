/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_EMP_NWSPRDR_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcmpylist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String maxcntrno;

	public SS_L_EMP_NWSPRDR_INITDataSet(){}
	public SS_L_EMP_NWSPRDR_INITDataSet(String errcode, String errmsg, String maxcntrno){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.maxcntrno = maxcntrno;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMaxcntrno(String maxcntrno){
		this.maxcntrno = maxcntrno;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMaxcntrno(){
		return this.maxcntrno;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			SS_L_EMP_NWSPRDR_INITCURCMPYLISTRecord rec = new SS_L_EMP_NWSPRDR_INITCURCMPYLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.curcmpylist.add(rec);
		}
		this.maxcntrno = Util.checkString(cstmt.getString(4));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_EMP_NWSPRDR_INITDataSet ds = (SS_L_EMP_NWSPRDR_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcmpylist.size(); i++){
		SS_L_EMP_NWSPRDR_INITCURCMPYLISTRecord curcmpylistRec = (SS_L_EMP_NWSPRDR_INITCURCMPYLISTRecord)ds.curcmpylist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcmpylist()%>
<%= ds.getMaxcntrno()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcmpylistRec.dept_cd%>
<%= curcmpylistRec.dept_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 05 08:26:43 GMT 2013 */