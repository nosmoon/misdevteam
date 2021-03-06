/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_6095_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String header_result;
	public String header_msg;
	public String data_result;
	public String data_msg;
	public String tail_result;
	public String tail_msg;

	public TN_LNK_6095_ADataSet(){}
	public TN_LNK_6095_ADataSet(String errcode, String errmsg, String header_result, String header_msg, String data_result, String data_msg, String tail_result, String tail_msg){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.header_result = header_result;
		this.header_msg = header_msg;
		this.data_result = data_result;
		this.data_msg = data_msg;
		this.tail_result = tail_result;
		this.tail_msg = tail_msg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setHeader_result(String header_result){
		this.header_result = header_result;
	}

	public void setHeader_msg(String header_msg){
		this.header_msg = header_msg;
	}

	public void setData_result(String data_result){
		this.data_result = data_result;
	}

	public void setData_msg(String data_msg){
		this.data_msg = data_msg;
	}

	public void setTail_result(String tail_result){
		this.tail_result = tail_result;
	}

	public void setTail_msg(String tail_msg){
		this.tail_msg = tail_msg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getHeader_result(){
		return this.header_result;
	}

	public String getHeader_msg(){
		return this.header_msg;
	}

	public String getData_result(){
		return this.data_result;
	}

	public String getData_msg(){
		return this.data_msg;
	}

	public String getTail_result(){
		return this.tail_result;
	}

	public String getTail_msg(){
		return this.tail_msg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.header_result = Util.checkString(cstmt.getString(9));
		this.header_msg = Util.checkString(cstmt.getString(10));
		this.data_result = Util.checkString(cstmt.getString(11));
		this.data_msg = Util.checkString(cstmt.getString(12));
		this.tail_result = Util.checkString(cstmt.getString(13));
		this.tail_msg = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_6095_ADataSet ds = (TN_LNK_6095_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getHeader_result()%>
<%= ds.getHeader_msg()%>
<%= ds.getData_result()%>
<%= ds.getData_msg()%>
<%= ds.getTail_result()%>
<%= ds.getTail_msg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 29 11:11:00 KST 2016 */