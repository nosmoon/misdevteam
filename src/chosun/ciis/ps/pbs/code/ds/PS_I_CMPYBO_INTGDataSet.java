/***************************************************************************************************
* 파일명 : SP_PS_I_CMPYBO_INTG.java
* 코드-지사별 통합코드관리 저장화면 
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 : 
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 코드-지사별 통합코드관리 저장화면           
 *
 */

  

public class PS_I_CMPYBO_INTGDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public PS_I_CMPYBO_INTGDataSet(){}
	public PS_I_CMPYBO_INTGDataSet(String errcode, String errmsg){
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
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_I_CMPYBO_INTGDataSet ds = (PS_I_CMPYBO_INTGDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 16 09:33:41 KST 2004 */