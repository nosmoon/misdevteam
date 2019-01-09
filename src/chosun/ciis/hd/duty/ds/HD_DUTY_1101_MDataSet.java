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


public class HD_DUTY_1101_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList hody_list = new ArrayList();
	public ArrayList xx_cd_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_duty_proc_stat_010;
	public String xx_emp_no_010;
	public String xx_duty_proc_stat_020;
	public String xx_finish_dd_clsf_010;
	public String xx_finish_dd_clsf_020;
	public String xx_pr_job_clsf_20;
	public String xx_annc_clsf;

	public HD_DUTY_1101_MDataSet(){}
	public HD_DUTY_1101_MDataSet(String errcode, String errmsg, String xx_duty_proc_stat_010, String xx_emp_no_010, String xx_duty_proc_stat_020, String xx_finish_dd_clsf_010, String xx_finish_dd_clsf_020, String xx_pr_job_clsf_20, String xx_annc_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_duty_proc_stat_010 = xx_duty_proc_stat_010;
		this.xx_emp_no_010 = xx_emp_no_010;
		this.xx_duty_proc_stat_020 = xx_duty_proc_stat_020;
		this.xx_finish_dd_clsf_010 = xx_finish_dd_clsf_010;
		this.xx_finish_dd_clsf_020 = xx_finish_dd_clsf_020;
		this.xx_pr_job_clsf_20 = xx_pr_job_clsf_20;
		this.xx_annc_clsf = xx_annc_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_duty_proc_stat_010(String xx_duty_proc_stat_010){
		this.xx_duty_proc_stat_010 = xx_duty_proc_stat_010;
	}

	public void setXx_emp_no_010(String xx_emp_no_010){
		this.xx_emp_no_010 = xx_emp_no_010;
	}

	public void setXx_duty_proc_stat_020(String xx_duty_proc_stat_020){
		this.xx_duty_proc_stat_020 = xx_duty_proc_stat_020;
	}

	public void setXx_finish_dd_clsf_010(String xx_finish_dd_clsf_010){
		this.xx_finish_dd_clsf_010 = xx_finish_dd_clsf_010;
	}

	public void setXx_finish_dd_clsf_020(String xx_finish_dd_clsf_020){
		this.xx_finish_dd_clsf_020 = xx_finish_dd_clsf_020;
	}

	public void setXx_pr_job_clsf_20(String xx_pr_job_clsf_20){
		this.xx_pr_job_clsf_20 = xx_pr_job_clsf_20;
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

	public String getXx_duty_proc_stat_010(){
		return this.xx_duty_proc_stat_010;
	}

	public String getXx_emp_no_010(){
		return this.xx_emp_no_010;
	}

	public String getXx_duty_proc_stat_020(){
		return this.xx_duty_proc_stat_020;
	}

	public String getXx_finish_dd_clsf_010(){
		return this.xx_finish_dd_clsf_010;
	}

	public String getXx_finish_dd_clsf_020(){
		return this.xx_finish_dd_clsf_020;
	}

	public String getXx_pr_job_clsf_20(){
		return this.xx_pr_job_clsf_20;
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_DUTY_1101_MXX_CD_LISTRecord rec = new HD_DUTY_1101_MXX_CD_LISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.xx_cd_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_DUTY_1101_MHODY_LISTRecord rec = new HD_DUTY_1101_MHODY_LISTRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.hody_list.add(rec);
		}
		this.xx_duty_proc_stat_010 = Util.checkString(cstmt.getString(7));
		this.xx_emp_no_010 = Util.checkString(cstmt.getString(8));
		this.xx_duty_proc_stat_020 = Util.checkString(cstmt.getString(9));
		this.xx_finish_dd_clsf_010 = Util.checkString(cstmt.getString(10));
		this.xx_finish_dd_clsf_020 = Util.checkString(cstmt.getString(11));
		this.xx_pr_job_clsf_20 = Util.checkString(cstmt.getString(12));
		this.xx_annc_clsf = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DUTY_1101_MDataSet ds = (HD_DUTY_1101_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.xx_cd_list.size(); i++){
		HD_DUTY_1101_MXX_CD_LISTRecord xx_cd_listRec = (HD_DUTY_1101_MXX_CD_LISTRecord)ds.xx_cd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.hody_list.size(); i++){
		HD_DUTY_1101_MHODY_LISTRecord hody_listRec = (HD_DUTY_1101_MHODY_LISTRecord)ds.hody_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_cd_list()%>
<%= ds.getHody_list()%>
<%= ds.getXx_duty_proc_stat_010()%>
<%= ds.getXx_emp_no_010()%>
<%= ds.getXx_duty_proc_stat_020()%>
<%= ds.getXx_finish_dd_clsf_010()%>
<%= ds.getXx_finish_dd_clsf_020()%>
<%= ds.getXx_pr_job_clsf_20()%>
<%= ds.getXx_annc_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= xx_cd_listRec.cd_nm%>
<%= xx_cd_listRec.cd%>
<%= hody_listRec.cd_nm%>
<%= hody_listRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 24 15:11:18 KST 2018 */