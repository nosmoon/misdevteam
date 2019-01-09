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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3601_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long self_done_cnt;
	public long self_doing_cnt;
	public long asst_done_cnt;
	public long asst_doing_cnt;
	public long tms1_done_cnt;
	public long tms1_doing_cnt;
	public long tms2_done_cnt;
	public long tms2_doing_cnt;

	public HD_EVLU_3601_LDataSet(){}
	public HD_EVLU_3601_LDataSet(String errcode, String errmsg, long self_done_cnt, long self_doing_cnt, long asst_done_cnt, long asst_doing_cnt, long tms1_done_cnt, long tms1_doing_cnt, long tms2_done_cnt, long tms2_doing_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.self_done_cnt = self_done_cnt;
		this.self_doing_cnt = self_doing_cnt;
		this.asst_done_cnt = asst_done_cnt;
		this.asst_doing_cnt = asst_doing_cnt;
		this.tms1_done_cnt = tms1_done_cnt;
		this.tms1_doing_cnt = tms1_doing_cnt;
		this.tms2_done_cnt = tms2_done_cnt;
		this.tms2_doing_cnt = tms2_doing_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSelf_done_cnt(long self_done_cnt){
		this.self_done_cnt = self_done_cnt;
	}

	public void setSelf_doing_cnt(long self_doing_cnt){
		this.self_doing_cnt = self_doing_cnt;
	}

	public void setAsst_done_cnt(long asst_done_cnt){
		this.asst_done_cnt = asst_done_cnt;
	}

	public void setAsst_doing_cnt(long asst_doing_cnt){
		this.asst_doing_cnt = asst_doing_cnt;
	}

	public void setTms1_done_cnt(long tms1_done_cnt){
		this.tms1_done_cnt = tms1_done_cnt;
	}

	public void setTms1_doing_cnt(long tms1_doing_cnt){
		this.tms1_doing_cnt = tms1_doing_cnt;
	}

	public void setTms2_done_cnt(long tms2_done_cnt){
		this.tms2_done_cnt = tms2_done_cnt;
	}

	public void setTms2_doing_cnt(long tms2_doing_cnt){
		this.tms2_doing_cnt = tms2_doing_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getSelf_done_cnt(){
		return this.self_done_cnt;
	}

	public long getSelf_doing_cnt(){
		return this.self_doing_cnt;
	}

	public long getAsst_done_cnt(){
		return this.asst_done_cnt;
	}

	public long getAsst_doing_cnt(){
		return this.asst_doing_cnt;
	}

	public long getTms1_done_cnt(){
		return this.tms1_done_cnt;
	}

	public long getTms1_doing_cnt(){
		return this.tms1_doing_cnt;
	}

	public long getTms2_done_cnt(){
		return this.tms2_done_cnt;
	}

	public long getTms2_doing_cnt(){
		return this.tms2_doing_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.self_done_cnt = cstmt.getLong(9);
		this.self_doing_cnt = cstmt.getLong(10);
		this.asst_done_cnt = cstmt.getLong(11);
		this.asst_doing_cnt = cstmt.getLong(12);
		this.tms1_done_cnt = cstmt.getLong(13);
		this.tms1_doing_cnt = cstmt.getLong(14);
		this.tms2_done_cnt = cstmt.getLong(15);
		this.tms2_doing_cnt = cstmt.getLong(16);
		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			HD_EVLU_3601_LCURLISTRecord rec = new HD_EVLU_3601_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.email_id = Util.checkString(rset0.getString("email_id"));
			rec.asst_dept_nm = Util.checkString(rset0.getString("asst_dept_nm"));
			rec.asst_emp_no = Util.checkString(rset0.getString("asst_emp_no"));
			rec.asst_nm_korn = Util.checkString(rset0.getString("asst_nm_korn"));
			rec.asst_dty_nm = Util.checkString(rset0.getString("asst_dty_nm"));
			rec.asst_posi_nm = Util.checkString(rset0.getString("asst_posi_nm"));
			rec.asst_ptph_no = Util.checkString(rset0.getString("asst_ptph_no"));
			rec.asst_email_id = Util.checkString(rset0.getString("asst_email_id"));
			rec.tms1_dept_nm = Util.checkString(rset0.getString("tms1_dept_nm"));
			rec.tms1_emp_no = Util.checkString(rset0.getString("tms1_emp_no"));
			rec.tms1_nm_korn = Util.checkString(rset0.getString("tms1_nm_korn"));
			rec.tms1_dty_nm = Util.checkString(rset0.getString("tms1_dty_nm"));
			rec.tms1_posi_nm = Util.checkString(rset0.getString("tms1_posi_nm"));
			rec.tms1_ptph_no = Util.checkString(rset0.getString("tms1_ptph_no"));
			rec.tms1_email_id = Util.checkString(rset0.getString("tms1_email_id"));
			rec.tms2_dept_nm = Util.checkString(rset0.getString("tms2_dept_nm"));
			rec.tms2_emp_no = Util.checkString(rset0.getString("tms2_emp_no"));
			rec.tms2_nm_korn = Util.checkString(rset0.getString("tms2_nm_korn"));
			rec.tms2_dty_nm = Util.checkString(rset0.getString("tms2_dty_nm"));
			rec.tms2_posi_nm = Util.checkString(rset0.getString("tms2_posi_nm"));
			rec.tms2_ptph_no = Util.checkString(rset0.getString("tms2_ptph_no"));
			rec.tms2_email_id = Util.checkString(rset0.getString("tms2_email_id"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_3601_LDataSet ds = (HD_EVLU_3601_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_3601_LCURLISTRecord curlistRec = (HD_EVLU_3601_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSelf_done_cnt()%>
<%= ds.getSelf_doing_cnt()%>
<%= ds.getAsst_done_cnt()%>
<%= ds.getAsst_doing_cnt()%>
<%= ds.getTms1_done_cnt()%>
<%= ds.getTms1_doing_cnt()%>
<%= ds.getTms2_done_cnt()%>
<%= ds.getTms2_doing_cnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.ptph_no%>
<%= curlistRec.email_id%>
<%= curlistRec.asst_dept_nm%>
<%= curlistRec.asst_emp_no%>
<%= curlistRec.asst_nm_korn%>
<%= curlistRec.asst_dty_nm%>
<%= curlistRec.asst_posi_nm%>
<%= curlistRec.asst_ptph_no%>
<%= curlistRec.asst_email_id%>
<%= curlistRec.tms1_dept_nm%>
<%= curlistRec.tms1_emp_no%>
<%= curlistRec.tms1_nm_korn%>
<%= curlistRec.tms1_dty_nm%>
<%= curlistRec.tms1_posi_nm%>
<%= curlistRec.tms1_ptph_no%>
<%= curlistRec.tms1_email_id%>
<%= curlistRec.tms2_dept_nm%>
<%= curlistRec.tms2_emp_no%>
<%= curlistRec.tms2_nm_korn%>
<%= curlistRec.tms2_dty_nm%>
<%= curlistRec.tms2_posi_nm%>
<%= curlistRec.tms2_ptph_no%>
<%= curlistRec.tms2_email_id%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 14 11:33:42 KST 2014 */