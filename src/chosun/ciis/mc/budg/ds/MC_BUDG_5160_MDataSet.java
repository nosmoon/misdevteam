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


public class MC_BUDG_5160_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_wgunhan_010;
	public String xx_wgunhan_020;

	public MC_BUDG_5160_MDataSet(){}
	public MC_BUDG_5160_MDataSet(String errcode, String errmsg, String xx_wgunhan_010, String xx_wgunhan_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_wgunhan_010 = xx_wgunhan_010;
		this.xx_wgunhan_020 = xx_wgunhan_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_wgunhan_010(String xx_wgunhan_010){
		this.xx_wgunhan_010 = xx_wgunhan_010;
	}

	public void setXx_wgunhan_020(String xx_wgunhan_020){
		this.xx_wgunhan_020 = xx_wgunhan_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_wgunhan_010(){
		return this.xx_wgunhan_010;
	}

	public String getXx_wgunhan_020(){
		return this.xx_wgunhan_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_wgunhan_010 = Util.checkString(cstmt.getString(5));
		this.xx_wgunhan_020 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_5160_MDataSet ds = (MC_BUDG_5160_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_wgunhan_010()%>
<%= ds.getXx_wgunhan_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 16 18:00:25 KST 2012 */