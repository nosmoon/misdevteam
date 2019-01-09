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


package chosun.ciis.co.dlco.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_1008_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String st_dlco_no;
	public String ed_dlco_no;

	public CO_DLCO_1008_ADataSet(){}
	public CO_DLCO_1008_ADataSet(String errcode, String errmsg, String st_dlco_no, String ed_dlco_no){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.st_dlco_no = st_dlco_no;
		this.ed_dlco_no = ed_dlco_no;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSt_dlco_no(String st_dlco_no){
		this.st_dlco_no = st_dlco_no;
	}

	public void setEd_dlco_no(String ed_dlco_no){
		this.ed_dlco_no = ed_dlco_no;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSt_dlco_no(){
		return this.st_dlco_no;
	}

	public String getEd_dlco_no(){
		return this.ed_dlco_no;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.st_dlco_no = Util.checkString(cstmt.getString(14));
		this.ed_dlco_no = Util.checkString(cstmt.getString(15));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_DLCO_1008_ADataSet ds = (CO_DLCO_1008_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSt_dlco_no()%>
<%= ds.getEd_dlco_no()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 14 18:07:53 KST 2012 */