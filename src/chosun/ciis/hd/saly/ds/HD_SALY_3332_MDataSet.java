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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_3332_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_saly_no_010;
	public String xx_saly_no_020;
	public String xx_proc_clsf_010;
	public String xx_proc_clsf_020;
	public String xx_proc_clsf_030;
	public String xx_emp_no_010;
	public String xx_salary_dt;
	public String xx_pgm_path;
	public String xx_pgm_path_020;
	public String xx_pgm_path_030;

	public HD_SALY_3332_MDataSet(){}
	public HD_SALY_3332_MDataSet(String errcode, String errmsg, String xx_saly_no_010, String xx_saly_no_020, String xx_proc_clsf_010, String xx_proc_clsf_020, String xx_proc_clsf_030, String xx_emp_no_010, String xx_salary_dt, String xx_pgm_path, String xx_pgm_path_020, String xx_pgm_path_030){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_saly_no_010 = xx_saly_no_010;
		this.xx_saly_no_020 = xx_saly_no_020;
		this.xx_proc_clsf_010 = xx_proc_clsf_010;
		this.xx_proc_clsf_020 = xx_proc_clsf_020;
		this.xx_proc_clsf_030 = xx_proc_clsf_030;
		this.xx_emp_no_010 = xx_emp_no_010;
		this.xx_salary_dt = xx_salary_dt;
		this.xx_pgm_path = xx_pgm_path;
		this.xx_pgm_path_020 = xx_pgm_path_020;
		this.xx_pgm_path_030 = xx_pgm_path_030;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_saly_no_010(String xx_saly_no_010){
		this.xx_saly_no_010 = xx_saly_no_010;
	}

	public void setXx_saly_no_020(String xx_saly_no_020){
		this.xx_saly_no_020 = xx_saly_no_020;
	}

	public void setXx_proc_clsf_010(String xx_proc_clsf_010){
		this.xx_proc_clsf_010 = xx_proc_clsf_010;
	}

	public void setXx_proc_clsf_020(String xx_proc_clsf_020){
		this.xx_proc_clsf_020 = xx_proc_clsf_020;
	}

	public void setXx_proc_clsf_030(String xx_proc_clsf_030){
		this.xx_proc_clsf_030 = xx_proc_clsf_030;
	}

	public void setXx_emp_no_010(String xx_emp_no_010){
		this.xx_emp_no_010 = xx_emp_no_010;
	}

	public void setXx_salary_dt(String xx_salary_dt){
		this.xx_salary_dt = xx_salary_dt;
	}

	public void setXx_pgm_path(String xx_pgm_path){
		this.xx_pgm_path = xx_pgm_path;
	}

	public void setXx_pgm_path_020(String xx_pgm_path_020){
		this.xx_pgm_path_020 = xx_pgm_path_020;
	}

	public void setXx_pgm_path_030(String xx_pgm_path_030){
		this.xx_pgm_path_030 = xx_pgm_path_030;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_saly_no_010(){
		return this.xx_saly_no_010;
	}

	public String getXx_saly_no_020(){
		return this.xx_saly_no_020;
	}

	public String getXx_proc_clsf_010(){
		return this.xx_proc_clsf_010;
	}

	public String getXx_proc_clsf_020(){
		return this.xx_proc_clsf_020;
	}

	public String getXx_proc_clsf_030(){
		return this.xx_proc_clsf_030;
	}

	public String getXx_emp_no_010(){
		return this.xx_emp_no_010;
	}

	public String getXx_salary_dt(){
		return this.xx_salary_dt;
	}

	public String getXx_pgm_path(){
		return this.xx_pgm_path;
	}

	public String getXx_pgm_path_020(){
		return this.xx_pgm_path_020;
	}

	public String getXx_pgm_path_030(){
		return this.xx_pgm_path_030;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_saly_no_010 = Util.checkString(cstmt.getString(5));
		this.xx_saly_no_020 = Util.checkString(cstmt.getString(6));
		this.xx_proc_clsf_010 = Util.checkString(cstmt.getString(7));
		this.xx_proc_clsf_020 = Util.checkString(cstmt.getString(8));
		this.xx_proc_clsf_030 = Util.checkString(cstmt.getString(9));
		this.xx_emp_no_010 = Util.checkString(cstmt.getString(10));
		this.xx_salary_dt = Util.checkString(cstmt.getString(11));
		this.xx_pgm_path = Util.checkString(cstmt.getString(12));
		this.xx_pgm_path_020 = Util.checkString(cstmt.getString(13));
		this.xx_pgm_path_030 = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_3332_MDataSet ds = (HD_SALY_3332_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_saly_no_010()%>
<%= ds.getXx_saly_no_020()%>
<%= ds.getXx_proc_clsf_010()%>
<%= ds.getXx_proc_clsf_020()%>
<%= ds.getXx_proc_clsf_030()%>
<%= ds.getXx_emp_no_010()%>
<%= ds.getXx_salary_dt()%>
<%= ds.getXx_pgm_path()%>
<%= ds.getXx_pgm_path_020()%>
<%= ds.getXx_pgm_path_030()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 15 11:05:30 KST 2013 */