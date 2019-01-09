/***************************************************************************************************
* 파일명 : PS_I_INFOEXG_ANSWERDataSet.java
* 기능 : 출판국 정보공유 게시판
* 작성일자 : 2004-02-23
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * 출판국 정보공유 게시판
 *
 */


public class PS_I_INFOEXG_ANSWERDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public long seq;

	public PS_I_INFOEXG_ANSWERDataSet(){}
	public PS_I_INFOEXG_ANSWERDataSet(String errcode, String errmsg, long seq){
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

    public void setSeq(long seq){
        this.seq = seq;
    }

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

    public long getSeq(){
        return this.seq;
    }

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
        if(!"".equals(this.errcode)){			return;		}
		this.seq = cstmt.getLong(24);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_I_INFOEXG_ANSWERDataSet ds = (PS_I_INFOEXG_ANSWERDataSet)request.getAttribute("ds");
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


/* 작성시간 : Tue Feb 24 20:12:55 KST 2004 */