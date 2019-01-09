/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매 확장점검부실 점검마감여부 조회
* 작성일자 : 2012-01-12
* 작성자 : 이혁
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


public class SL_A_EXTNCLOS_CLOSINFODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String closyn;
	public String issupyn;

	public SL_A_EXTNCLOS_CLOSINFODataSet(){}
	public SL_A_EXTNCLOS_CLOSINFODataSet(String errcode, String errmsg, String closyn, String issupyn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.closyn = closyn;
		this.issupyn = issupyn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setIssupyn(String issupyn){
		this.issupyn = issupyn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getIssupyn(){
		return this.issupyn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.closyn = Util.checkString(cstmt.getString(4));
		this.issupyn = Util.checkString(cstmt.getString(5));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_A_EXTNCLOS_CLOSINFODataSet ds = (SL_A_EXTNCLOS_CLOSINFODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClosyn()%>
<%= ds.getIssupyn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 12 16:41:20 KST 2012 */