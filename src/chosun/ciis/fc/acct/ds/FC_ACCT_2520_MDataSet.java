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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2520_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_acctcdfr;
	public String xx_acctcdto;
	public String xx_g_tag;

	public FC_ACCT_2520_MDataSet(){}
	public FC_ACCT_2520_MDataSet(String errcode, String errmsg, String xx_acctcdfr, String xx_acctcdto, String xx_g_tag){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_acctcdfr = xx_acctcdfr;
		this.xx_acctcdto = xx_acctcdto;
		this.xx_g_tag = xx_g_tag;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_acctcdfr(String xx_acctcdfr){
		this.xx_acctcdfr = xx_acctcdfr;
	}

	public void setXx_acctcdto(String xx_acctcdto){
		this.xx_acctcdto = xx_acctcdto;
	}

	public void setXx_g_tag(String xx_g_tag){
		this.xx_g_tag = xx_g_tag;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_acctcdfr(){
		return this.xx_acctcdfr;
	}

	public String getXx_acctcdto(){
		return this.xx_acctcdto;
	}

	public String getXx_g_tag(){
		return this.xx_g_tag;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_acctcdfr = Util.checkString(cstmt.getString(5));
		this.xx_acctcdto = Util.checkString(cstmt.getString(6));
		this.xx_g_tag = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2520_MDataSet ds = (FC_ACCT_2520_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_acctcdfr()%>
<%= ds.getXx_acctcdto()%>
<%= ds.getXx_g_tag()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 03 15:23:30 KST 2012 */