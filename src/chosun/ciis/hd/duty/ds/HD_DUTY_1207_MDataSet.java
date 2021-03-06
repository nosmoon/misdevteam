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


package chosun.ciis.hd.duty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.rec.*;

/**
 * 
 */


public class HD_DUTY_1207_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_pr_job_clsf_20;
	public String xx_annc_clsf;
	public String xx_proc_stat_010;
	public String xx_dept_cd;
	public String xx_proc_stat_020;
	public String xx_proc_stat_030;
	public String xx_proc_stat_040;
	public String xx_finish_dd_clsf_010;
	public String xx_finish_dd_clsf_020;

	public HD_DUTY_1207_MDataSet(){}
	public HD_DUTY_1207_MDataSet(String errcode, String errmsg, String xx_pr_job_clsf_20, String xx_annc_clsf, String xx_proc_stat_010, String xx_dept_cd, String xx_proc_stat_020, String xx_proc_stat_030, String xx_proc_stat_040, String xx_finish_dd_clsf_010, String xx_finish_dd_clsf_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_pr_job_clsf_20 = xx_pr_job_clsf_20;
		this.xx_annc_clsf = xx_annc_clsf;
		this.xx_proc_stat_010 = xx_proc_stat_010;
		this.xx_dept_cd = xx_dept_cd;
		this.xx_proc_stat_020 = xx_proc_stat_020;
		this.xx_proc_stat_030 = xx_proc_stat_030;
		this.xx_proc_stat_040 = xx_proc_stat_040;
		this.xx_finish_dd_clsf_010 = xx_finish_dd_clsf_010;
		this.xx_finish_dd_clsf_020 = xx_finish_dd_clsf_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_pr_job_clsf_20(String xx_pr_job_clsf_20){
		this.xx_pr_job_clsf_20 = xx_pr_job_clsf_20;
	}

	public void setXx_annc_clsf(String xx_annc_clsf){
		this.xx_annc_clsf = xx_annc_clsf;
	}

	public void setXx_proc_stat_010(String xx_proc_stat_010){
		this.xx_proc_stat_010 = xx_proc_stat_010;
	}

	public void setXx_dept_cd(String xx_dept_cd){
		this.xx_dept_cd = xx_dept_cd;
	}

	public void setXx_proc_stat_020(String xx_proc_stat_020){
		this.xx_proc_stat_020 = xx_proc_stat_020;
	}

	public void setXx_proc_stat_030(String xx_proc_stat_030){
		this.xx_proc_stat_030 = xx_proc_stat_030;
	}

	public void setXx_proc_stat_040(String xx_proc_stat_040){
		this.xx_proc_stat_040 = xx_proc_stat_040;
	}

	public void setXx_finish_dd_clsf_010(String xx_finish_dd_clsf_010){
		this.xx_finish_dd_clsf_010 = xx_finish_dd_clsf_010;
	}

	public void setXx_finish_dd_clsf_020(String xx_finish_dd_clsf_020){
		this.xx_finish_dd_clsf_020 = xx_finish_dd_clsf_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_pr_job_clsf_20(){
		return this.xx_pr_job_clsf_20;
	}

	public String getXx_annc_clsf(){
		return this.xx_annc_clsf;
	}

	public String getXx_proc_stat_010(){
		return this.xx_proc_stat_010;
	}

	public String getXx_dept_cd(){
		return this.xx_dept_cd;
	}

	public String getXx_proc_stat_020(){
		return this.xx_proc_stat_020;
	}

	public String getXx_proc_stat_030(){
		return this.xx_proc_stat_030;
	}

	public String getXx_proc_stat_040(){
		return this.xx_proc_stat_040;
	}

	public String getXx_finish_dd_clsf_010(){
		return this.xx_finish_dd_clsf_010;
	}

	public String getXx_finish_dd_clsf_020(){
		return this.xx_finish_dd_clsf_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_pr_job_clsf_20 = Util.checkString(cstmt.getString(5));
		this.xx_annc_clsf = Util.checkString(cstmt.getString(6));
		this.xx_proc_stat_010 = Util.checkString(cstmt.getString(7));
		this.xx_dept_cd = Util.checkString(cstmt.getString(8));
		this.xx_proc_stat_020 = Util.checkString(cstmt.getString(9));
		this.xx_proc_stat_030 = Util.checkString(cstmt.getString(10));
		this.xx_proc_stat_040 = Util.checkString(cstmt.getString(11));
		this.xx_finish_dd_clsf_010 = Util.checkString(cstmt.getString(12));
		this.xx_finish_dd_clsf_020 = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DUTY_1207_MDataSet ds = (HD_DUTY_1207_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_pr_job_clsf_20()%>
<%= ds.getXx_annc_clsf()%>
<%= ds.getXx_proc_stat_010()%>
<%= ds.getXx_dept_cd()%>
<%= ds.getXx_proc_stat_020()%>
<%= ds.getXx_proc_stat_030()%>
<%= ds.getXx_proc_stat_040()%>
<%= ds.getXx_finish_dd_clsf_010()%>
<%= ds.getXx_finish_dd_clsf_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 02 15:46:45 KST 2012 */