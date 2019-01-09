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


package chosun.ciis.hd.edu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_2000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_emp_no_010;
	public String xx_proc_stat_010;
	public String xx_proc_stat_020;
	public String xx_pr_job_clsf_20;
	public String xx_annc_clsf;

	public HD_EDU_2000_MDataSet(){}
	public HD_EDU_2000_MDataSet(String errcode, String errmsg, String xx_emp_no_010, String xx_proc_stat_010, String xx_proc_stat_020, String xx_pr_job_clsf_20, String xx_annc_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_emp_no_010 = xx_emp_no_010;
		this.xx_proc_stat_010 = xx_proc_stat_010;
		this.xx_proc_stat_020 = xx_proc_stat_020;
		this.xx_pr_job_clsf_20 = xx_pr_job_clsf_20;
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

	public void setXx_proc_stat_010(String xx_proc_stat_010){
		this.xx_proc_stat_010 = xx_proc_stat_010;
	}

	public void setXx_proc_stat_020(String xx_proc_stat_020){
		this.xx_proc_stat_020 = xx_proc_stat_020;
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

	public String getXx_emp_no_010(){
		return this.xx_emp_no_010;
	}

	public String getXx_proc_stat_010(){
		return this.xx_proc_stat_010;
	}

	public String getXx_proc_stat_020(){
		return this.xx_proc_stat_020;
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

		this.xx_emp_no_010 = Util.checkString(cstmt.getString(4));
		this.xx_proc_stat_010 = Util.checkString(cstmt.getString(5));
		this.xx_proc_stat_020 = Util.checkString(cstmt.getString(6));
		this.xx_pr_job_clsf_20 = Util.checkString(cstmt.getString(7));
		this.xx_annc_clsf = Util.checkString(cstmt.getString(8));
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			HD_EDU_2000_MCURLIST1Record rec = new HD_EDU_2000_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.mang_cd_12 = Util.checkString(rset0.getString("mang_cd_12"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			HD_EDU_2000_MCURLIST2Record rec = new HD_EDU_2000_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.mang_cd_12 = Util.checkString(rset1.getString("mang_cd_12"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(11);
		while(rset2.next()){
			HD_EDU_2000_MCURLIST3Record rec = new HD_EDU_2000_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.mang_cd_12 = Util.checkString(rset2.getString("mang_cd_12"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(12);
		while(rset3.next()){
			HD_EDU_2000_MCURLIST4Record rec = new HD_EDU_2000_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.mang_cd_12 = Util.checkString(rset3.getString("mang_cd_12"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(13);
		while(rset4.next()){
			HD_EDU_2000_MCURLIST5Record rec = new HD_EDU_2000_MCURLIST5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.mang_cd_12 = Util.checkString(rset4.getString("mang_cd_12"));
			this.curlist5.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EDU_2000_MDataSet ds = (HD_EDU_2000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_EDU_2000_MCURLIST1Record curlist1Rec = (HD_EDU_2000_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_EDU_2000_MCURLIST2Record curlist2Rec = (HD_EDU_2000_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_EDU_2000_MCURLIST3Record curlist3Rec = (HD_EDU_2000_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_EDU_2000_MCURLIST4Record curlist4Rec = (HD_EDU_2000_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		HD_EDU_2000_MCURLIST5Record curlist5Rec = (HD_EDU_2000_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_emp_no_010()%>
<%= ds.getXx_proc_stat_010()%>
<%= ds.getXx_proc_stat_020()%>
<%= ds.getXx_pr_job_clsf_20()%>
<%= ds.getXx_annc_clsf()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.mang_cd_12%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.mang_cd_12%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.mang_cd_12%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist4Rec.mang_cd_12%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cdnm%>
<%= curlist5Rec.mang_cd_12%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 02 15:36:51 KST 2012 */