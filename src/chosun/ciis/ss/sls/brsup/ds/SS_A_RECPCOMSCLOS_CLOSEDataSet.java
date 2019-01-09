/***************************************************************************************************
* 파일명 : SS_A_RECPCOMSCLOS_CLOSEDataSet.java
* 기능 : 지국지원-빌링-수납수수료-마감-마감,마감취소
* 작성일자 : 2004-03-09
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-빌링-수납수수료-마감-마감,마감취소
 *
 */


public class SS_A_RECPCOMSCLOS_CLOSEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String basidt;

	public SS_A_RECPCOMSCLOS_CLOSEDataSet(){}
	public SS_A_RECPCOMSCLOS_CLOSEDataSet(String errcode, String errmsg, String basidt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.basidt = basidt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.basidt = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_A_RECPCOMSCLOS_CLOSEDataSet ds = (SS_A_RECPCOMSCLOS_CLOSEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBasidt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 10 13:06:08 KST 2004 */