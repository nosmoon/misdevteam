/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_2259_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_exec_no;

	public MC_BUDG_2259_MDataSet(){}
	public MC_BUDG_2259_MDataSet(String errcode, String errmsg, String xx_exec_no){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_exec_no = xx_exec_no;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_exec_no(String xx_exec_no){
		this.xx_exec_no = xx_exec_no;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_exec_no(){
		return this.xx_exec_no;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_exec_no = Util.checkString(cstmt.getString(5));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_2259_MDataSet ds = (MC_BUDG_2259_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_exec_no()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 13 17:57:41 KST 2012 */