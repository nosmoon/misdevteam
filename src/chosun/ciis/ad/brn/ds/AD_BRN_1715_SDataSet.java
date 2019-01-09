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


package chosun.ciis.ad.brn.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_BRN_1715_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String job_clsf;
	public String cntc_seq;
	public String cont;
	public String rmsg_seq;
	public String answer_dt;
	public String answer_cont;
	public String add_file_nm;

	public AD_BRN_1715_SDataSet(){}
	public AD_BRN_1715_SDataSet(String errcode, String errmsg, String job_clsf, String cntc_seq, String cont, String rmsg_seq, String answer_dt, String answer_cont, String add_file_nm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.job_clsf = job_clsf;
		this.cntc_seq = cntc_seq;
		this.cont = cont;
		this.rmsg_seq = rmsg_seq;
		this.answer_dt = answer_dt;
		this.answer_cont = answer_cont;
		this.add_file_nm = add_file_nm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCntc_seq(String cntc_seq){
		this.cntc_seq = cntc_seq;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setRmsg_seq(String rmsg_seq){
		this.rmsg_seq = rmsg_seq;
	}

	public void setAnswer_dt(String answer_dt){
		this.answer_dt = answer_dt;
	}

	public void setAnswer_cont(String answer_cont){
		this.answer_cont = answer_cont;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCntc_seq(){
		return this.cntc_seq;
	}

	public String getCont(){
		return this.cont;
	}

	public String getRmsg_seq(){
		return this.rmsg_seq;
	}

	public String getAnswer_dt(){
		return this.answer_dt;
	}

	public String getAnswer_cont(){
		return this.answer_cont;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.job_clsf = Util.checkString(cstmt.getString(4));
		this.cntc_seq = Util.checkString(cstmt.getString(5));
		this.cont = Util.checkString(cstmt.getString(7));
		this.rmsg_seq = Util.checkString(cstmt.getString(8));
		this.answer_dt = Util.checkString(cstmt.getString(9));
		this.answer_cont = Util.checkString(cstmt.getString(10));
		this.add_file_nm = Util.checkString(cstmt.getString(11));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BRN_1715_SDataSet ds = (AD_BRN_1715_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getJob_clsf()%>
<%= ds.getCntc_seq()%>
<%= ds.getCont()%>
<%= ds.getRmsg_seq()%>
<%= ds.getAnswer_dt()%>
<%= ds.getAnswer_cont()%>
<%= ds.getAdd_file_nm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 16:29:00 KST 2009 */