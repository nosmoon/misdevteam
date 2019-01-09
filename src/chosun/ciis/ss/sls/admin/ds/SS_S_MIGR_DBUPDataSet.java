/***************************************************************************************************
* 파일명 : SS_S_MIGR_DBUPDataSet.java
* 기능 : 관리자-작업-마이그레이션-지국DB업로드-(업로드상태, 작업번호)를 위한 DataSet
* 작성일자 : 2004-03-12
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-작업-마이그레이션-지국DB업로드-(업로드상태, 작업번호)를 위한 DataSet
 */

public class SS_S_MIGR_DBUPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String bodbupstatcd;
	public String workno;

	public SS_S_MIGR_DBUPDataSet(){}
	public SS_S_MIGR_DBUPDataSet(String errcode, String errmsg, String bodbupstatcd, String workno){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bodbupstatcd = bodbupstatcd;
		this.workno = workno;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBodbupstatcd(String bodbupstatcd){
		this.bodbupstatcd = bodbupstatcd;
	}

	public void setWorkno(String workno){
		this.workno = workno;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBodbupstatcd(){
		return this.bodbupstatcd;
	}

	public String getWorkno(){
		return this.workno;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bodbupstatcd = Util.checkString(cstmt.getString(4));
		this.workno = Util.checkString(cstmt.getString(5));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_MIGR_DBUPDataSet ds = (SS_S_MIGR_DBUPDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBodbupstatcd()%>
<%= ds.getWorkno()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 15 17:15:49 KST 2004 */