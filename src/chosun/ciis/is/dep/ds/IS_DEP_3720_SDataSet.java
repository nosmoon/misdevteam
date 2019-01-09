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


package chosun.ciis.is.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_3720_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String rept_no;
	public String chk_item;
	public String chk_dt;
	public String chk_cont;

	public IS_DEP_3720_SDataSet(){}
	public IS_DEP_3720_SDataSet(String errcode, String errmsg, String rept_no, String chk_item, String chk_dt, String chk_cont){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rept_no = rept_no;
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

	public void setRept_no(String rept_no){
		this.rept_no = rept_no;
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

	public String getRept_no(){
		return this.rept_no;
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

		this.rept_no = Util.checkString(cstmt.getString(4));
		this.chk_item = Util.checkString(cstmt.getString(5));
		this.chk_dt = Util.checkString(cstmt.getString(6));
		this.chk_cont = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_DEP_3720_SDataSet ds = (IS_DEP_3720_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRept_no()%>
<%= ds.getChk_item()%>
<%= ds.getChk_dt()%>
<%= ds.getChk_cont()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 09:07:20 KST 2012 */