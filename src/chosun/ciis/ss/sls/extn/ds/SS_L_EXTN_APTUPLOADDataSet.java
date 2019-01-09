/***************************************************************************************************
* 파일명 : .java
* 기능 : 입주아파트관리 엑셀 업로드
* 작성일자 : 2009-05-18
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 입주아파트관리 엑셀 업로드
 */

public class SS_L_EXTN_APTUPLOADDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_APTUPLOADDataSet(){}
	public SS_L_EXTN_APTUPLOADDataSet(String errcode, String errmsg){
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
	SS_L_EXTN_APTUPLOADDataSet ds = (SS_L_EXTN_APTUPLOADDataSet)request.getAttribute("ds");
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


/* 작성시간 : Mon May 18 16:19:12 KST 2009 */