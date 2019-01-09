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


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_DEP_3720_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String chk_item;
	public String chk_dt;
	public String chk_cont;

	public AD_DEP_3720_ADataSet(){}
	public AD_DEP_3720_ADataSet(String errcode, String errmsg, String chk_item, String chk_dt, String chk_cont){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.chk_item = chk_item;
		this.chk_dt = chk_dt;
		this.chk_cont = chk_cont;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setChk_item(String chk_item){
		this.chk_item = chk_item;
	}

	public void setChk_dt(String chk_dt){
		this.chk_dt = chk_dt;
	}

	public void setChk_cont(String chk_cont){
		this.chk_cont = chk_cont;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getChk_item(){
		return this.chk_item;
	}

	public String getChk_dt(){
		return this.chk_dt;
	}

	public String getChk_cont(){
		return this.chk_cont;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.chk_item = Util.checkString(cstmt.getString(6));
		this.chk_dt = Util.checkString(cstmt.getString(7));
		this.chk_cont = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_3720_ADataSet ds = (AD_DEP_3720_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getChk_item()%>
<%= ds.getChk_dt()%>
<%= ds.getChk_cont()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 20:12:16 KST 2009 */