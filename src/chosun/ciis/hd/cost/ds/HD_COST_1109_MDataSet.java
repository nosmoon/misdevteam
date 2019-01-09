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


package chosun.ciis.hd.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.dm.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_1109_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_proc_clsf_010;
	public String xx_proc_clsf_020;
	public String xx_proc_clsf_030;
	public String xx_proc_clsf_040;
	public String xx_proc_clsf_050;
	public String xx_proc_clsf_060;
	public String xx_proc_clsf_070;
	public String xx_proc_clsf_080;

	public HD_COST_1109_MDataSet(){}
	public HD_COST_1109_MDataSet(String errcode, String errmsg, String xx_proc_clsf_010, String xx_proc_clsf_020, String xx_proc_clsf_030, String xx_proc_clsf_040, String xx_proc_clsf_050, String xx_proc_clsf_060, String xx_proc_clsf_070, String xx_proc_clsf_080){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_proc_clsf_010 = xx_proc_clsf_010;
		this.xx_proc_clsf_020 = xx_proc_clsf_020;
		this.xx_proc_clsf_030 = xx_proc_clsf_030;
		this.xx_proc_clsf_040 = xx_proc_clsf_040;
		this.xx_proc_clsf_050 = xx_proc_clsf_050;
		this.xx_proc_clsf_060 = xx_proc_clsf_060;
		this.xx_proc_clsf_070 = xx_proc_clsf_070;
		this.xx_proc_clsf_080 = xx_proc_clsf_080;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_proc_clsf_010(String xx_proc_clsf_010){
		this.xx_proc_clsf_010 = xx_proc_clsf_010;
	}

	public void setXx_proc_clsf_020(String xx_proc_clsf_020){
		this.xx_proc_clsf_020 = xx_proc_clsf_020;
	}

	public void setXx_proc_clsf_030(String xx_proc_clsf_030){
		this.xx_proc_clsf_030 = xx_proc_clsf_030;
	}

	public void setXx_proc_clsf_040(String xx_proc_clsf_040){
		this.xx_proc_clsf_040 = xx_proc_clsf_040;
	}

	public void setXx_proc_clsf_050(String xx_proc_clsf_050){
		this.xx_proc_clsf_050 = xx_proc_clsf_050;
	}

	public void setXx_proc_clsf_060(String xx_proc_clsf_060){
		this.xx_proc_clsf_060 = xx_proc_clsf_060;
	}

	public void setXx_proc_clsf_070(String xx_proc_clsf_070){
		this.xx_proc_clsf_070 = xx_proc_clsf_070;
	}

	public void setXx_proc_clsf_080(String xx_proc_clsf_080){
		this.xx_proc_clsf_080 = xx_proc_clsf_080;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_proc_clsf_010(){
		return this.xx_proc_clsf_010;
	}

	public String getXx_proc_clsf_020(){
		return this.xx_proc_clsf_020;
	}

	public String getXx_proc_clsf_030(){
		return this.xx_proc_clsf_030;
	}

	public String getXx_proc_clsf_040(){
		return this.xx_proc_clsf_040;
	}

	public String getXx_proc_clsf_050(){
		return this.xx_proc_clsf_050;
	}

	public String getXx_proc_clsf_060(){
		return this.xx_proc_clsf_060;
	}

	public String getXx_proc_clsf_070(){
		return this.xx_proc_clsf_070;
	}

	public String getXx_proc_clsf_080(){
		return this.xx_proc_clsf_080;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_proc_clsf_010 = Util.checkString(cstmt.getString(5));
		this.xx_proc_clsf_020 = Util.checkString(cstmt.getString(6));
		this.xx_proc_clsf_030 = Util.checkString(cstmt.getString(7));
		this.xx_proc_clsf_040 = Util.checkString(cstmt.getString(8));
		this.xx_proc_clsf_050 = Util.checkString(cstmt.getString(9));
		this.xx_proc_clsf_060 = Util.checkString(cstmt.getString(10));
		this.xx_proc_clsf_070 = Util.checkString(cstmt.getString(11));
		this.xx_proc_clsf_080 = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_COST_1109_MDataSet ds = (HD_COST_1109_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_proc_clsf_010()%>
<%= ds.getXx_proc_clsf_020()%>
<%= ds.getXx_proc_clsf_030()%>
<%= ds.getXx_proc_clsf_040()%>
<%= ds.getXx_proc_clsf_050()%>
<%= ds.getXx_proc_clsf_060()%>
<%= ds.getXx_proc_clsf_070()%>
<%= ds.getXx_proc_clsf_080()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 09 19:48:08 KST 2012 */