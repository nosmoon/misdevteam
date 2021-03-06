/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 2010.05.26
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.tax.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_TAX_2610_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable
{
	public String errcode;
	public String errmsg;

	public AD_TAX_2610_ADataSet(){}
	public AD_TAX_2610_ADataSet(String errcode, String errmsg)
	{
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode)
	{
		this.errcode = errcode;
	}
	public void setErrmsg(String errmsg)
	{
		this.errmsg = errmsg;
	}

	public String getErrcode()
	{
		return this.errcode;
	}
	public String getErrmsg()
	{
		return this.errmsg;
	}
	public void getValues(CallableStatement cstmt) throws SQLException
	{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_1110_ADataSet ds = (AD_DEP_1110_ADataSet)request.getAttribute("ds");
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


/* 작성시간 : Tue Jun 02 20:31:30 KST 2009 */