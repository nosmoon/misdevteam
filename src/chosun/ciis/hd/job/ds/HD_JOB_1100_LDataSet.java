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


public class HD_JOB_1100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_JOB_1100_LDataSet(){}
	public HD_JOB_1100_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			HD_JOB_1100_LCURLISTRecord rec = new HD_JOB_1100_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.in_cmpy_psgp_cd = Util.checkString(rset0.getString("in_cmpy_psgp_cd"));
			rec.in_cmpy_octgr_cd = Util.checkString(rset0.getString("in_cmpy_octgr_cd"));
			rec.in_cmpy_posk_cd = Util.checkString(rset0.getString("in_cmpy_posk_cd"));
			rec.in_cmpy_jobnon_nm = Util.checkString(rset0.getString("in_cmpy_jobnon_nm"));
			rec.cur_cmpy_jobnon_nm = Util.checkString(rset0.getString("cur_cmpy_jobnon_nm"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.cur_jobforc_cd = Util.checkString(rset0.getString("cur_jobforc_cd"));
			rec.cur_jobkind_cd = Util.checkString(rset0.getString("cur_jobkind_cd"));
			rec.cur_jobnon_cd = Util.checkString(rset0.getString("cur_jobnon_cd"));
			rec.cur_jobnon_nm = Util.checkString(rset0.getString("cur_jobnon_nm"));
			rec.now_chrg_job = Util.checkString(rset0.getString("now_chrg_job"));
			rec.now_dtls_job = Util.checkString(rset0.getString("now_dtls_job"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_JOB_1100_LDataSet ds = (HD_JOB_1100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_JOB_1100_LCURLISTRecord curlistRec = (HD_JOB_1100_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.in_cmpy_psgp_cd%>
<%= curlistRec.in_cmpy_octgr_cd%>
<%= curlistRec.in_cmpy_posk_cd%>
<%= curlistRec.in_cmpy_jobnon_nm%>
<%= curlistRec.cur_cmpy_jobnon_nm%>
<%= curlistRec.frdt%>
<%= curlistRec.cur_jobforc_cd%>
<%= curlistRec.cur_jobkind_cd%>
<%= curlistRec.cur_jobnon_cd%>
<%= curlistRec.cur_jobnon_nm%>
<%= curlistRec.now_chrg_job%>
<%= curlistRec.now_dtls_job%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 04 16:46:20 KST 2013 */