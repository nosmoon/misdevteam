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


public class HD_AFFR_2802_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_zip1;
	public String xx_zip2;
	public String xx_addr;
	public String xx_dtls_addr;

	public HD_AFFR_2802_MDataSet(){}
	public HD_AFFR_2802_MDataSet(String errcode, String errmsg, String xx_zip1, String xx_zip2, String xx_addr, String xx_dtls_addr){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_zip1 = xx_zip1;
		this.xx_zip2 = xx_zip2;
		this.xx_addr = xx_addr;
		this.xx_dtls_addr = xx_dtls_addr;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_zip1(String xx_zip1){
		this.xx_zip1 = xx_zip1;
	}

	public void setXx_zip2(String xx_zip2){
		this.xx_zip2 = xx_zip2;
	}

	public void setXx_addr(String xx_addr){
		this.xx_addr = xx_addr;
	}

	public void setXx_dtls_addr(String xx_dtls_addr){
		this.xx_dtls_addr = xx_dtls_addr;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_zip1(){
		return this.xx_zip1;
	}

	public String getXx_zip2(){
		return this.xx_zip2;
	}

	public String getXx_addr(){
		return this.xx_addr;
	}

	public String getXx_dtls_addr(){
		return this.xx_dtls_addr;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_zip1 = Util.checkString(cstmt.getString(5));
		this.xx_zip2 = Util.checkString(cstmt.getString(6));
		this.xx_addr = Util.checkString(cstmt.getString(7));
		this.xx_dtls_addr = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_2802_MDataSet ds = (HD_AFFR_2802_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_zip1()%>
<%= ds.getXx_zip2()%>
<%= ds.getXx_addr()%>
<%= ds.getXx_dtls_addr()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 17 18:18:58 KST 2012 */