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


package chosun.ciis.hd.hlywrk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.hlywrk.dm.*;
import chosun.ciis.hd.hlywrk.rec.*;

/**
 * 
 */


public class HD_HLYWRK_1305_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_alvc_use_yn_010;
	public String xx_alvc_use_yn_020;
	public String xx_alvc_use_yn_030;
	public String xx_certi_clsf;

	public HD_HLYWRK_1305_MDataSet(){}
	public HD_HLYWRK_1305_MDataSet(String errcode, String errmsg, String xx_alvc_use_yn_010, String xx_alvc_use_yn_020, String xx_alvc_use_yn_030, String xx_certi_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_alvc_use_yn_010 = xx_alvc_use_yn_010;
		this.xx_alvc_use_yn_020 = xx_alvc_use_yn_020;
		this.xx_alvc_use_yn_030 = xx_alvc_use_yn_030;
		this.xx_certi_clsf = xx_certi_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_alvc_use_yn_010(String xx_alvc_use_yn_010){
		this.xx_alvc_use_yn_010 = xx_alvc_use_yn_010;
	}

	public void setXx_alvc_use_yn_020(String xx_alvc_use_yn_020){
		this.xx_alvc_use_yn_020 = xx_alvc_use_yn_020;
	}

	public void setXx_alvc_use_yn_030(String xx_alvc_use_yn_030){
		this.xx_alvc_use_yn_030 = xx_alvc_use_yn_030;
	}

	public void setXx_certi_clsf(String xx_certi_clsf){
		this.xx_certi_clsf = xx_certi_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_alvc_use_yn_010(){
		return this.xx_alvc_use_yn_010;
	}

	public String getXx_alvc_use_yn_020(){
		return this.xx_alvc_use_yn_020;
	}

	public String getXx_alvc_use_yn_030(){
		return this.xx_alvc_use_yn_030;
	}

	public String getXx_certi_clsf(){
		return this.xx_certi_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_alvc_use_yn_010 = Util.checkString(cstmt.getString(5));
		this.xx_alvc_use_yn_020 = Util.checkString(cstmt.getString(6));
		this.xx_alvc_use_yn_030 = Util.checkString(cstmt.getString(7));
		this.xx_certi_clsf = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_HLYWRK_1305_MDataSet ds = (HD_HLYWRK_1305_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_alvc_use_yn_010()%>
<%= ds.getXx_alvc_use_yn_020()%>
<%= ds.getXx_alvc_use_yn_030()%>
<%= ds.getXx_certi_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 01 18:01:50 KST 2012 */