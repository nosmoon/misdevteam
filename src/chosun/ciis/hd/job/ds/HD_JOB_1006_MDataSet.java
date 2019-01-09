/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.job.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.job.dm.*;
import chosun.ciis.hd.job.rec.*;

/**
 * 
 */


public class HD_JOB_1006_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_emp_no_010;
	public String xx_aprv_stat_010;
	public String xx_job_clsf_01;
	public String xx_cd_clsf_010;
	public String xx_cd_clsf_020;
	public String xx_aprv_stat_020;
	public String xx_pr_job_clsf_15;
	public String xx_annc_clsf;

	public HD_JOB_1006_MDataSet(){}
	public HD_JOB_1006_MDataSet(String errcode, String errmsg, String xx_emp_no_010, String xx_aprv_stat_010, String xx_job_clsf_01, String xx_cd_clsf_010, String xx_cd_clsf_020, String xx_aprv_stat_020, String xx_pr_job_clsf_15, String xx_annc_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_emp_no_010 = xx_emp_no_010;
		this.xx_aprv_stat_010 = xx_aprv_stat_010;
		this.xx_job_clsf_01 = xx_job_clsf_01;
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
		this.xx_cd_clsf_020 = xx_cd_clsf_020;
		this.xx_aprv_stat_020 = xx_aprv_stat_020;
		this.xx_pr_job_clsf_15 = xx_pr_job_clsf_15;
		this.xx_annc_clsf = xx_annc_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_emp_no_010(String xx_emp_no_010){
		this.xx_emp_no_010 = xx_emp_no_010;
	}

	public void setXx_aprv_stat_010(String xx_aprv_stat_010){
		this.xx_aprv_stat_010 = xx_aprv_stat_010;
	}

	public void setXx_job_clsf_01(String xx_job_clsf_01){
		this.xx_job_clsf_01 = xx_job_clsf_01;
	}

	public void setXx_cd_clsf_010(String xx_cd_clsf_010){
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
	}

	public void setXx_cd_clsf_020(String xx_cd_clsf_020){
		this.xx_cd_clsf_020 = xx_cd_clsf_020;
	}

	public void setXx_aprv_stat_020(String xx_aprv_stat_020){
		this.xx_aprv_stat_020 = xx_aprv_stat_020;
	}

	public void setXx_pr_job_clsf_15(String xx_pr_job_clsf_15){
		this.xx_pr_job_clsf_15 = xx_pr_job_clsf_15;
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

	public String getXx_emp_no_010(){
		return this.xx_emp_no_010;
	}

	public String getXx_aprv_stat_010(){
		return this.xx_aprv_stat_010;
	}

	public String getXx_job_clsf_01(){
		return this.xx_job_clsf_01;
	}

	public String getXx_cd_clsf_010(){
		return this.xx_cd_clsf_010;
	}

	public String getXx_cd_clsf_020(){
		return this.xx_cd_clsf_020;
	}

	public String getXx_aprv_stat_020(){
		return this.xx_aprv_stat_020;
	}

	public String getXx_pr_job_clsf_15(){
		return this.xx_pr_job_clsf_15;
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

		this.xx_emp_no_010 = Util.checkString(cstmt.getString(5));
		this.xx_aprv_stat_010 = Util.checkString(cstmt.getString(6));
		this.xx_job_clsf_01 = Util.checkString(cstmt.getString(7));
		this.xx_cd_clsf_010 = Util.checkString(cstmt.getString(8));
		this.xx_cd_clsf_020 = Util.checkString(cstmt.getString(9));
		this.xx_aprv_stat_020 = Util.checkString(cstmt.getString(10));
		this.xx_pr_job_clsf_15 = Util.checkString(cstmt.getString(11));
		this.xx_annc_clsf = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_JOB_1006_MDataSet ds = (HD_JOB_1006_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_emp_no_010()%>
<%= ds.getXx_aprv_stat_010()%>
<%= ds.getXx_job_clsf_01()%>
<%= ds.getXx_cd_clsf_010()%>
<%= ds.getXx_cd_clsf_020()%>
<%= ds.getXx_aprv_stat_020()%>
<%= ds.getXx_pr_job_clsf_15()%>
<%= ds.getXx_annc_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 02 15:30:10 KST 2012 */