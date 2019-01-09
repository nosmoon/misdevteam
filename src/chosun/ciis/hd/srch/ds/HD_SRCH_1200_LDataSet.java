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


public class HD_SRCH_1200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_1200_LDataSet(){}
	public HD_SRCH_1200_LDataSet(String errcode, String errmsg){
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
			HD_SRCH_1200_LCURLISTRecord rec = new HD_SRCH_1200_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.birth_dt = Util.checkString(rset0.getString("birth_dt"));
			rec.min_in_cmpy_dt = Util.checkString(rset0.getString("min_in_cmpy_dt"));
			rec.lvcmpy_ck = Util.checkString(rset0.getString("lvcmpy_ck"));
			rec.lvcmpy_dty_nm = Util.checkString(rset0.getString("lvcmpy_dty_nm"));
			rec.lvcmpy_posi_nm = Util.checkString(rset0.getString("lvcmpy_posi_nm"));
			rec.lvcmpy_emp_clsf_nm = Util.checkString(rset0.getString("lvcmpy_emp_clsf_nm"));
			rec.lvcmpy_saly = Util.checkString(rset0.getString("lvcmpy_saly"));
			rec.last_in_cmpy_saly = Util.checkString(rset0.getString("last_in_cmpy_saly"));
			rec.now_saly = Util.checkString(rset0.getString("now_saly"));
			rec.last_lvcmpy_dt = Util.checkString(rset0.getString("last_lvcmpy_dt"));
			rec.last_in_cmpy_dt = Util.checkString(rset0.getString("last_in_cmpy_dt"));
			rec.last_in_cmpy_dt_ck = Util.checkString(rset0.getString("last_in_cmpy_dt_ck"));
			rec.old_cmpy_dt = Util.checkString(rset0.getString("old_cmpy_dt"));
			rec.now_cmpy_dt = Util.checkString(rset0.getString("now_cmpy_dt"));
			rec.tot_cmpy_dt = Util.checkString(rset0.getString("tot_cmpy_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_1200_LDataSet ds = (HD_SRCH_1200_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SRCH_1200_LCURLISTRecord curlistRec = (HD_SRCH_1200_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.cd_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.birth_dt%>
<%= curlistRec.min_in_cmpy_dt%>
<%= curlistRec.lvcmpy_ck%>
<%= curlistRec.lvcmpy_dty_nm%>
<%= curlistRec.lvcmpy_posi_nm%>
<%= curlistRec.lvcmpy_emp_clsf_nm%>
<%= curlistRec.lvcmpy_saly%>
<%= curlistRec.last_in_cmpy_saly%>
<%= curlistRec.now_saly%>
<%= curlistRec.last_lvcmpy_dt%>
<%= curlistRec.last_in_cmpy_dt%>
<%= curlistRec.last_in_cmpy_dt_ck%>
<%= curlistRec.old_cmpy_dt%>
<%= curlistRec.now_cmpy_dt%>
<%= curlistRec.tot_cmpy_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 20:20:30 KST 2009 */