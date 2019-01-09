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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_1084_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_cd_010;
	public String xx_cd_020;
	public String xx_cd_030;
	public String xx_cd_040;
	public String xx_cd_050;
	public String xx_cd_060;
	public String xx_cd_070;
	public String xx_cd_080;
	public String xx_cd_090;
	public String xx_cd_100;

	public HD_INFO_1084_MDataSet(){}
	public HD_INFO_1084_MDataSet(String errcode, String errmsg, String xx_cd_010, String xx_cd_020, String xx_cd_030, String xx_cd_040, String xx_cd_050, String xx_cd_060, String xx_cd_070, String xx_cd_080, String xx_cd_090, String xx_cd_100){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_cd_010 = xx_cd_010;
		this.xx_cd_020 = xx_cd_020;
		this.xx_cd_030 = xx_cd_030;
		this.xx_cd_040 = xx_cd_040;
		this.xx_cd_050 = xx_cd_050;
		this.xx_cd_060 = xx_cd_060;
		this.xx_cd_070 = xx_cd_070;
		this.xx_cd_080 = xx_cd_080;
		this.xx_cd_090 = xx_cd_090;
		this.xx_cd_100 = xx_cd_100;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_cd_010(String xx_cd_010){
		this.xx_cd_010 = xx_cd_010;
	}

	public void setXx_cd_020(String xx_cd_020){
		this.xx_cd_020 = xx_cd_020;
	}

	public void setXx_cd_030(String xx_cd_030){
		this.xx_cd_030 = xx_cd_030;
	}

	public void setXx_cd_040(String xx_cd_040){
		this.xx_cd_040 = xx_cd_040;
	}

	public void setXx_cd_050(String xx_cd_050){
		this.xx_cd_050 = xx_cd_050;
	}

	public void setXx_cd_060(String xx_cd_060){
		this.xx_cd_060 = xx_cd_060;
	}

	public void setXx_cd_070(String xx_cd_070){
		this.xx_cd_070 = xx_cd_070;
	}

	public void setXx_cd_080(String xx_cd_080){
		this.xx_cd_080 = xx_cd_080;
	}

	public void setXx_cd_090(String xx_cd_090){
		this.xx_cd_090 = xx_cd_090;
	}
	
	public void setXx_cd_100(String xx_cd_100){
		this.xx_cd_100 = xx_cd_100;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_cd_010(){
		return this.xx_cd_010;
	}

	public String getXx_cd_020(){
		return this.xx_cd_020;
	}

	public String getXx_cd_030(){
		return this.xx_cd_030;
	}

	public String getXx_cd_040(){
		return this.xx_cd_040;
	}

	public String getXx_cd_050(){
		return this.xx_cd_050;
	}

	public String getXx_cd_060(){
		return this.xx_cd_060;
	}

	public String getXx_cd_070(){
		return this.xx_cd_070;
	}

	public String getXx_cd_080(){
		return this.xx_cd_080;
	}

	public String getXx_cd_090(){
		return this.xx_cd_090;
	}
	
	public String getXx_cd_100(){
		return this.xx_cd_100;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_cd_010 = Util.checkString(cstmt.getString(5));
		this.xx_cd_020 = Util.checkString(cstmt.getString(6));
		this.xx_cd_030 = Util.checkString(cstmt.getString(7));
		this.xx_cd_040 = Util.checkString(cstmt.getString(8));
		this.xx_cd_050 = Util.checkString(cstmt.getString(9));
		this.xx_cd_060 = Util.checkString(cstmt.getString(10));
		this.xx_cd_070 = Util.checkString(cstmt.getString(11));
		this.xx_cd_080 = Util.checkString(cstmt.getString(12));
		this.xx_cd_090 = Util.checkString(cstmt.getString(13));
		this.xx_cd_100 = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_1084_MDataSet ds = (HD_INFO_1084_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_cd_010()%>
<%= ds.getXx_cd_020()%>
<%= ds.getXx_cd_030()%>
<%= ds.getXx_cd_040()%>
<%= ds.getXx_cd_050()%>
<%= ds.getXx_cd_060()%>
<%= ds.getXx_cd_070()%>
<%= ds.getXx_cd_080()%>
<%= ds.getXx_cd_090()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 19 17:52:55 KST 2012 */