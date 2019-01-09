/***************************************************************************************************
* 파일명 : SL_E_RDR_MOVM_TRSF_OBJDataSet.java
* 기능 : 관할구역조정관리-인계-대상목록 추가를 위해 구역내 독자수를 구한다.
* 작성일자 : 2004-02-06
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 관할구역조정관리-인계-대상목록 추가를 위해 구역내 독자수를 구한다.
 *
 */


public class SL_E_RDR_MOVM_TRSF_OBJDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public long rdrcnt;

	public SL_E_RDR_MOVM_TRSF_OBJDataSet(){}
	public SL_E_RDR_MOVM_TRSF_OBJDataSet(String errcode, String errmsg, long rdrcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdrcnt = rdrcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRdrcnt(long rdrcnt){
		this.rdrcnt = rdrcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getRdrcnt(){
		return this.rdrcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rdrcnt = cstmt.getLong(7);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_E_RDR_MOVM_TRSF_OBJDataSet ds = (SL_E_RDR_MOVM_TRSF_OBJDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdrcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 06 10:55:17 KST 2004 */