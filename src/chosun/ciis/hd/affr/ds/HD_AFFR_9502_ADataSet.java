/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9502_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String frlc_no;

	public HD_AFFR_9502_ADataSet(){}
	public HD_AFFR_9502_ADataSet(String errcode, String errmsg, String frlc_no){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.frlc_no = frlc_no;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFrlc_no(String frlc_no){
		this.frlc_no = frlc_no;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getFrlc_no(){
		return this.frlc_no;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.frlc_no = Util.checkString(cstmt.getString(25));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_9502_ADataSet ds = (HD_AFFR_9502_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFrlc_no()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 31 11:45:19 KST 2017 */