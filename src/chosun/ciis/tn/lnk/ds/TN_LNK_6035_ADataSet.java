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


public class TN_LNK_6035_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public long totcount;
	public long totprice;
	public long sdsiidx;

	public TN_LNK_6035_ADataSet(){}
	public TN_LNK_6035_ADataSet(String errcode, String errmsg, long totcount, long totprice, long sdsiidx){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totcount = totcount;
		this.totprice = totprice;
		this.sdsiidx = sdsiidx;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotcount(long totcount){
		this.totcount = totcount;
	}

	public void setTotprice(long totprice){
		this.totprice = totprice;
	}

	public void setSdsiidx(long sdsiidx){
		this.sdsiidx = sdsiidx;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotcount(){
		return this.totcount;
	}

	public long getTotprice(){
		return this.totprice;
	}

	public long getSdsiidx(){
		return this.sdsiidx;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.totcount = cstmt.getLong(10);
		this.totprice = cstmt.getLong(11);
		this.sdsiidx = cstmt.getLong(12);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_6035_ADataSet ds = (TN_LNK_6035_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotcount()%>
<%= ds.getTotprice()%>
<%= ds.getSdsiidx()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 07 15:00:55 KST 2016 */