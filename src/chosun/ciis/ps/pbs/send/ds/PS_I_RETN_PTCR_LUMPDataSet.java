/***************************************************************************************************
* 파일명   : SP_PS_I_RETN_PTCR_LUMP.java
* 기능     : 반송관리 excelupload 일괄저장
* 작성일자 : 2008-08-13
* 작성자   : 김재일
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 발송-반송관리 반송내역 excelupload 일괄저장처리
 *
 */

public class PS_I_RETN_PTCR_LUMPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public PS_I_RETN_PTCR_LUMPDataSet(){}
	public PS_I_RETN_PTCR_LUMPDataSet(String errcode, String errmsg){
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
	PS_I_RETN_PTCR_LUMPDataSet ds = (PS_I_RETN_PTCR_LUMPDataSet)request.getAttribute("ds");
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


/* 작성시간 : Wed Aug 13 19:04:16 KST 2008 */