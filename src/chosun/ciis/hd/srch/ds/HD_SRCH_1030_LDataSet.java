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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_1030_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_1030_LDataSet(){}
	public HD_SRCH_1030_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			HD_SRCH_1030_LCURLISTRecord rec = new HD_SRCH_1030_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.gender = Util.checkString(rset0.getString("gender"));
			rec.cur_job = Util.checkString(rset0.getString("cur_job"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.emp_dtls_clsf_nm = Util.checkString(rset0.getString("emp_dtls_clsf_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.email_id = Util.checkString(rset0.getString("email_id"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.home_zip = Util.checkString(rset0.getString("home_zip"));
			rec.home_addr = Util.checkString(rset0.getString("home_addr"));
			rec.home_dtls_addr = Util.checkString(rset0.getString("home_dtls_addr"));
			rec.cmpy_zip = Util.checkString(rset0.getString("cmpy_zip"));
			rec.cmpy_addr = Util.checkString(rset0.getString("cmpy_addr"));
			rec.cmpy_dtls_addr = Util.checkString(rset0.getString("cmpy_dtls_addr"));
			rec.fore_home_zip = Util.checkString(rset0.getString("fore_home_zip"));
			rec.fore_home_addr = Util.checkString(rset0.getString("fore_home_addr"));
			rec.fore_home_dtls_addr = Util.checkString(rset0.getString("fore_home_dtls_addr"));
			rec.fore_cmpy_zip = Util.checkString(rset0.getString("fore_cmpy_zip"));
			rec.fore_cmpy_addr = Util.checkString(rset0.getString("fore_cmpy_addr"));
			rec.fore_cmpy_dtls_addr = Util.checkString(rset0.getString("fore_cmpy_dtls_addr"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_1030_LDataSet ds = (HD_SRCH_1030_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SRCH_1030_LCURLISTRecord curlistRec = (HD_SRCH_1030_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.cd_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.gender%>
<%= curlistRec.cur_job%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.emp_dtls_clsf_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.email_id%>
<%= curlistRec.ptph_no%>
<%= curlistRec.home_zip%>
<%= curlistRec.home_addr%>
<%= curlistRec.home_dtls_addr%>
<%= curlistRec.cmpy_zip%>
<%= curlistRec.cmpy_addr%>
<%= curlistRec.cmpy_dtls_addr%>
<%= curlistRec.fore_home_zip%>
<%= curlistRec.fore_home_addr%>
<%= curlistRec.fore_home_dtls_addr%>
<%= curlistRec.fore_cmpy_zip%>
<%= curlistRec.fore_cmpy_addr%>
<%= curlistRec.fore_cmpy_dtls_addr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 27 19:49:35 KST 2009 */