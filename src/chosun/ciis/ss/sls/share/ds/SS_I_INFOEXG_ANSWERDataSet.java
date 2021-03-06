/***************************************************************************************************
* 파일명 : SS_I_INFOEXG_ANSWERDataSet.java
* 기능 : 정보공유-공지사항,게시판-답변등록을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-공지사항,게시판-답변등록을 위한 DataSet
 */

public class SS_I_INFOEXG_ANSWERDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String seq;

	public SS_I_INFOEXG_ANSWERDataSet(){}
	public SS_I_INFOEXG_ANSWERDataSet(String errcode, String errmsg, String seq){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.seq = seq;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSeq(){
		return this.seq;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.seq = Util.checkString(cstmt.getString(30));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_I_INFOEXG_ANSWERDataSet ds = (SS_I_INFOEXG_ANSWERDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSeq()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 09 19:32:15 KST 2004 */