/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_SRCH_2000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_2000_LDataSet(){}
	public HD_SRCH_2000_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_SRCH_2000_LCURLISTRecord rec = new HD_SRCH_2000_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.temp_yn = Util.checkString(rset0.getString("temp_yn"));
			rec.stdy_yn = Util.checkString(rset0.getString("stdy_yn"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.home_zip = Util.checkString(rset0.getString("home_zip"));
			rec.home_addr = Util.checkString(rset0.getString("home_addr"));
			rec.home_dtls_addr = Util.checkString(rset0.getString("home_dtls_addr"));
			rec.email_id = Util.checkString(rset0.getString("email_id"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_2000_LDataSet ds = (HD_SRCH_2000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SRCH_2000_LCURLISTRecord curlistRec = (HD_SRCH_2000_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.temp_yn%>
<%= curlistRec.stdy_yn%>
<%= curlistRec.prn%>
<%= curlistRec.lvcmpy_dt%>
<%= curlistRec.ptph_no%>
<%= curlistRec.home_zip%>
<%= curlistRec.home_addr%>
<%= curlistRec.home_dtls_addr%>
<%= curlistRec.email_id%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 07 09:57:49 KST 2015 */