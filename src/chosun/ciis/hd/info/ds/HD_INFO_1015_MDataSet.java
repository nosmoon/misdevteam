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


public class HD_INFO_1015_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_emp_clsf_cd;
	public String xx_job_clsf_01;
	public String xx_clsf_cd_010;
	public String xx_clsf_cd_020;
	public String xx_clsf_cd_030;

	public HD_INFO_1015_MDataSet(){}
	public HD_INFO_1015_MDataSet(String errcode, String errmsg, String xx_emp_clsf_cd, String xx_job_clsf_01, String xx_clsf_cd_010, String xx_clsf_cd_020, String xx_clsf_cd_030){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_emp_clsf_cd = xx_emp_clsf_cd;
		this.xx_job_clsf_01 = xx_job_clsf_01;
		this.xx_clsf_cd_010 = xx_clsf_cd_010;
		this.xx_clsf_cd_020 = xx_clsf_cd_020;
		this.xx_clsf_cd_030 = xx_clsf_cd_030;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_emp_clsf_cd(String xx_emp_clsf_cd){
		this.xx_emp_clsf_cd = xx_emp_clsf_cd;
	}

	public void setXx_job_clsf_01(String xx_job_clsf_01){
		this.xx_job_clsf_01 = xx_job_clsf_01;
	}

	public void setXx_clsf_cd_010(String xx_clsf_cd_010){
		this.xx_clsf_cd_010 = xx_clsf_cd_010;
	}

	public void setXx_clsf_cd_020(String xx_clsf_cd_020){
		this.xx_clsf_cd_020 = xx_clsf_cd_020;
	}

	public void setXx_clsf_cd_030(String xx_clsf_cd_030){
		this.xx_clsf_cd_030 = xx_clsf_cd_030;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_emp_clsf_cd(){
		return this.xx_emp_clsf_cd;
	}

	public String getXx_job_clsf_01(){
		return this.xx_job_clsf_01;
	}

	public String getXx_clsf_cd_010(){
		return this.xx_clsf_cd_010;
	}

	public String getXx_clsf_cd_020(){
		return this.xx_clsf_cd_020;
	}

	public String getXx_clsf_cd_030(){
		return this.xx_clsf_cd_030;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_emp_clsf_cd = Util.checkString(cstmt.getString(5));
		this.xx_job_clsf_01 = Util.checkString(cstmt.getString(6));
		this.xx_clsf_cd_010 = Util.checkString(cstmt.getString(7));
		this.xx_clsf_cd_020 = Util.checkString(cstmt.getString(8));
		this.xx_clsf_cd_030 = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_1015_MDataSet ds = (HD_INFO_1015_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_emp_clsf_cd()%>
<%= ds.getXx_job_clsf_01()%>
<%= ds.getXx_clsf_cd_010()%>
<%= ds.getXx_clsf_cd_020()%>
<%= ds.getXx_clsf_cd_030()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 19 11:29:12 KST 2012 */