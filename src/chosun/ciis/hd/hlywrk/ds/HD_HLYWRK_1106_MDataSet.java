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


public class HD_HLYWRK_1106_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_pr_job_clsf_21;
	public String xx_annc_clsf;
	public String xx_dept_cd_head;
	public String xx_proc_stat;
	public String xx_alvc_use_yn_010;
	public String xx_alvc_use_yn_020;

	public HD_HLYWRK_1106_MDataSet(){}
	public HD_HLYWRK_1106_MDataSet(String errcode, String errmsg, String xx_pr_job_clsf_21, String xx_annc_clsf, String xx_dept_cd_head, String xx_proc_stat, String xx_alvc_use_yn_010, String xx_alvc_use_yn_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_pr_job_clsf_21 = xx_pr_job_clsf_21;
		this.xx_annc_clsf = xx_annc_clsf;
		this.xx_dept_cd_head = xx_dept_cd_head;
		this.xx_proc_stat = xx_proc_stat;
		this.xx_alvc_use_yn_010 = xx_alvc_use_yn_010;
		this.xx_alvc_use_yn_020 = xx_alvc_use_yn_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_pr_job_clsf_21(String xx_pr_job_clsf_21){
		this.xx_pr_job_clsf_21 = xx_pr_job_clsf_21;
	}

	public void setXx_annc_clsf(String xx_annc_clsf){
		this.xx_annc_clsf = xx_annc_clsf;
	}

	public void setXx_dept_cd_head(String xx_dept_cd_head){
		this.xx_dept_cd_head = xx_dept_cd_head;
	}

	public void setXx_proc_stat(String xx_proc_stat){
		this.xx_proc_stat = xx_proc_stat;
	}

	public void setXx_alvc_use_yn_010(String xx_alvc_use_yn_010){
		this.xx_alvc_use_yn_010 = xx_alvc_use_yn_010;
	}

	public void setXx_alvc_use_yn_020(String xx_alvc_use_yn_020){
		this.xx_alvc_use_yn_020 = xx_alvc_use_yn_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_pr_job_clsf_21(){
		return this.xx_pr_job_clsf_21;
	}

	public String getXx_annc_clsf(){
		return this.xx_annc_clsf;
	}

	public String getXx_dept_cd_head(){
		return this.xx_dept_cd_head;
	}

	public String getXx_proc_stat(){
		return this.xx_proc_stat;
	}

	public String getXx_alvc_use_yn_010(){
		return this.xx_alvc_use_yn_010;
	}

	public String getXx_alvc_use_yn_020(){
		return this.xx_alvc_use_yn_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_pr_job_clsf_21 = Util.checkString(cstmt.getString(5));
		this.xx_annc_clsf = Util.checkString(cstmt.getString(6));
		this.xx_dept_cd_head = Util.checkString(cstmt.getString(7));
		this.xx_proc_stat = Util.checkString(cstmt.getString(8));
		this.xx_alvc_use_yn_010 = Util.checkString(cstmt.getString(9));
		this.xx_alvc_use_yn_020 = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_HLYWRK_1106_MDataSet ds = (HD_HLYWRK_1106_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_pr_job_clsf_21()%>
<%= ds.getXx_annc_clsf()%>
<%= ds.getXx_dept_cd_head()%>
<%= ds.getXx_proc_stat()%>
<%= ds.getXx_alvc_use_yn_010()%>
<%= ds.getXx_alvc_use_yn_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 02 15:51:20 KST 2012 */