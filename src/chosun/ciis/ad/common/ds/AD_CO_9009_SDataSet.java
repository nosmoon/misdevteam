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


package chosun.ciis.ad.common.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_CO_9009_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String emp_no;
	public String emp_nm;
	public String dept_cd;
	public String dept_nm;
	public String chk_cnt;

	public AD_CO_9009_SDataSet(){}
	public AD_CO_9009_SDataSet(String errcode, String errmsg, String emp_no, String emp_nm, String dept_cd, String dept_nm, String chk_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.emp_no = emp_no;
		this.emp_nm = emp_nm;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.chk_cnt = chk_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setEmp_nm(String emp_nm){
		this.emp_nm = emp_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setChk_cnt(String chk_cnt){
		this.chk_cnt = chk_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getEmp_nm(){
		return this.emp_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getChk_cnt(){
		return this.chk_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.emp_no = Util.checkString(cstmt.getString(4));
		this.emp_nm = Util.checkString(cstmt.getString(5));
		this.dept_cd = Util.checkString(cstmt.getString(6));
		this.dept_nm = Util.checkString(cstmt.getString(7));
		this.chk_cnt = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_CO_9009_SDataSet ds = (AD_CO_9009_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getEmp_no()%>
<%= ds.getEmp_nm()%>
<%= ds.getDept_cd()%>
<%= ds.getDept_nm()%>
<%= ds.getChk_cnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 05 17:12:01 KST 2009 */