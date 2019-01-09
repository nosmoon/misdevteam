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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1205_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_pr_job_clsf_23;
	public String xx_annc_clsf;
	public String xx_rmn_vaca_dds;
	public String xx_proc_stat;
	public String xx_qq_month_010;
	public String xx_qq_month_020;
	public String xx_qq_month_030;
	public String xx_qq_month_040;

	public HD_VACA_1205_MDataSet(){}
	public HD_VACA_1205_MDataSet(String errcode, String errmsg, String xx_pr_job_clsf_23, String xx_annc_clsf, String xx_rmn_vaca_dds, String xx_proc_stat, String xx_qq_month_010, String xx_qq_month_020, String xx_qq_month_030, String xx_qq_month_040){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_pr_job_clsf_23 = xx_pr_job_clsf_23;
		this.xx_annc_clsf = xx_annc_clsf;
		this.xx_rmn_vaca_dds = xx_rmn_vaca_dds;
		this.xx_proc_stat = xx_proc_stat;
		this.xx_qq_month_010 = xx_qq_month_010;
		this.xx_qq_month_020 = xx_qq_month_020;
		this.xx_qq_month_030 = xx_qq_month_030;
		this.xx_qq_month_040 = xx_qq_month_040;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_pr_job_clsf_23(String xx_pr_job_clsf_23){
		this.xx_pr_job_clsf_23 = xx_pr_job_clsf_23;
	}

	public void setXx_annc_clsf(String xx_annc_clsf){
		this.xx_annc_clsf = xx_annc_clsf;
	}

	public void setXx_rmn_vaca_dds(String xx_rmn_vaca_dds){
		this.xx_rmn_vaca_dds = xx_rmn_vaca_dds;
	}

	public void setXx_proc_stat(String xx_proc_stat){
		this.xx_proc_stat = xx_proc_stat;
	}

	public void setXx_qq_month_010(String xx_qq_month_010){
		this.xx_qq_month_010 = xx_qq_month_010;
	}

	public void setXx_qq_month_020(String xx_qq_month_020){
		this.xx_qq_month_020 = xx_qq_month_020;
	}

	public void setXx_qq_month_030(String xx_qq_month_030){
		this.xx_qq_month_030 = xx_qq_month_030;
	}

	public void setXx_qq_month_040(String xx_qq_month_040){
		this.xx_qq_month_040 = xx_qq_month_040;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_pr_job_clsf_23(){
		return this.xx_pr_job_clsf_23;
	}

	public String getXx_annc_clsf(){
		return this.xx_annc_clsf;
	}

	public String getXx_rmn_vaca_dds(){
		return this.xx_rmn_vaca_dds;
	}

	public String getXx_proc_stat(){
		return this.xx_proc_stat;
	}

	public String getXx_qq_month_010(){
		return this.xx_qq_month_010;
	}

	public String getXx_qq_month_020(){
		return this.xx_qq_month_020;
	}

	public String getXx_qq_month_030(){
		return this.xx_qq_month_030;
	}

	public String getXx_qq_month_040(){
		return this.xx_qq_month_040;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_pr_job_clsf_23 = Util.checkString(cstmt.getString(5));
		this.xx_annc_clsf = Util.checkString(cstmt.getString(6));
		this.xx_rmn_vaca_dds = Util.checkString(cstmt.getString(7));
		this.xx_proc_stat = Util.checkString(cstmt.getString(8));
		this.xx_qq_month_010 = Util.checkString(cstmt.getString(9));
		this.xx_qq_month_020 = Util.checkString(cstmt.getString(10));
		this.xx_qq_month_030 = Util.checkString(cstmt.getString(11));
		this.xx_qq_month_040 = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_1205_MDataSet ds = (HD_VACA_1205_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_pr_job_clsf_23()%>
<%= ds.getXx_annc_clsf()%>
<%= ds.getXx_rmn_vaca_dds()%>
<%= ds.getXx_proc_stat()%>
<%= ds.getXx_qq_month_010()%>
<%= ds.getXx_qq_month_020()%>
<%= ds.getXx_qq_month_030()%>
<%= ds.getXx_qq_month_040()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 02 17:51:27 KST 2012 */