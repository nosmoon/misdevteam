/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_mm_clos_yn;
	public String xx_prvmm_clos_yn;
	public String xx_emp_no_010;

	public HD_AFFR_9000_MDataSet(){}
	public HD_AFFR_9000_MDataSet(String errcode, String errmsg, String xx_mm_clos_yn, String xx_prvmm_clos_yn, String xx_emp_no_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_mm_clos_yn = xx_mm_clos_yn;
		this.xx_prvmm_clos_yn = xx_prvmm_clos_yn;
		this.xx_emp_no_010 = xx_emp_no_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_mm_clos_yn(String xx_mm_clos_yn){
		this.xx_mm_clos_yn = xx_mm_clos_yn;
	}

	public void setXx_prvmm_clos_yn(String xx_prvmm_clos_yn){
		this.xx_prvmm_clos_yn = xx_prvmm_clos_yn;
	}

	public void setXx_emp_no_010(String xx_emp_no_010){
		this.xx_emp_no_010 = xx_emp_no_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_mm_clos_yn(){
		return this.xx_mm_clos_yn;
	}

	public String getXx_prvmm_clos_yn(){
		return this.xx_prvmm_clos_yn;
	}

	public String getXx_emp_no_010(){
		return this.xx_emp_no_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_mm_clos_yn = Util.checkString(cstmt.getString(5));
		this.xx_prvmm_clos_yn = Util.checkString(cstmt.getString(6));
		this.xx_emp_no_010 = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_9000_MDataSet ds = (HD_AFFR_9000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_mm_clos_yn()%>
<%= ds.getXx_prvmm_clos_yn()%>
<%= ds.getXx_emp_no_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 16 14:56:05 KST 2016 */