/***************************************************************************************************
* 파일명 : SS_MO_A_LOGINAPLC_APRVDM.java
* 기능 : 관리자-모바일관리-로그인승인,거절,비번초기화 DM
* 작성일자 : 2017-02-15
* 작성자 : 장선희
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
 *
 */


public class SS_MO_A_LOGINAPLC_APRVDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String gcmid;

	public SS_MO_A_LOGINAPLC_APRVDataSet(){}
	public SS_MO_A_LOGINAPLC_APRVDataSet(String errcode, String errmsg, String gcmid){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.gcmid = gcmid;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setGcmid(String gcmid){
		this.gcmid = gcmid;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getGcmid(){
		return this.gcmid;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		this.gcmid = Util.checkString(cstmt.getString(9));
		if(!"".equals(this.errcode)){
			return;
		}


	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_MO_A_LOGINAPLC_APRVDataSet ds = (SS_MO_A_LOGINAPLC_APRVDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getGcmid()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 15 16:13:46 KST 2017 */