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


package chosun.ciis.hd.dwnwrk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dwnwrk.dm.*;
import chosun.ciis.hd.dwnwrk.rec.*;

/**
 * 
 */


public class HD_DWNWRK_1105_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_proc_stat_010;
	public String xx_emp_no_010;
	public String xx_pr_job_clsf_22;
	public String xx_annc_clsf;

	public HD_DWNWRK_1105_MDataSet(){}
	public HD_DWNWRK_1105_MDataSet(String errcode, String errmsg, String xx_proc_stat_010, String xx_emp_no_010, String xx_pr_job_clsf_22, String xx_annc_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_proc_stat_010 = xx_proc_stat_010;
		this.xx_emp_no_010 = xx_emp_no_010;
		this.xx_pr_job_clsf_22 = xx_pr_job_clsf_22;
		this.xx_annc_clsf = xx_annc_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_proc_stat_010(String xx_proc_stat_010){
		this.xx_proc_stat_010 = xx_proc_stat_010;
	}

	public void setXx_emp_no_010(String xx_emp_no_010){
		this.xx_emp_no_010 = xx_emp_no_010;
	}

	public void setXx_pr_job_clsf_22(String xx_pr_job_clsf_22){
		this.xx_pr_job_clsf_22 = xx_pr_job_clsf_22;
	}

	public void setXx_annc_clsf(String xx_annc_clsf){
		this.xx_annc_clsf = xx_annc_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_proc_stat_010(){
		return this.xx_proc_stat_010;
	}

	public String getXx_emp_no_010(){
		return this.xx_emp_no_010;
	}

	public String getXx_pr_job_clsf_22(){
		return this.xx_pr_job_clsf_22;
	}

	public String getXx_annc_clsf(){
		return this.xx_annc_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_proc_stat_010 = Util.checkString(cstmt.getString(5));
		this.xx_emp_no_010 = Util.checkString(cstmt.getString(6));
		this.xx_pr_job_clsf_22 = Util.checkString(cstmt.getString(7));
		this.xx_annc_clsf = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DWNWRK_1105_MDataSet ds = (HD_DWNWRK_1105_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_proc_stat_010()%>
<%= ds.getXx_emp_no_010()%>
<%= ds.getXx_pr_job_clsf_22()%>
<%= ds.getXx_annc_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 02 15:56:25 KST 2012 */