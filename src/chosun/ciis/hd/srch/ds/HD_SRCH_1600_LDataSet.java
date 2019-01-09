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


public class HD_SRCH_1600_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_1600_LDataSet(){}
	public HD_SRCH_1600_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_SRCH_1600_LCURLISTRecord rec = new HD_SRCH_1600_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.emp_clsf = Util.checkString(rset0.getString("emp_clsf"));
			rec.emp_dtls_clsf = Util.checkString(rset0.getString("emp_dtls_clsf"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.emp_dtls_clsf_nm = Util.checkString(rset0.getString("emp_dtls_clsf_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_name = Util.checkString(rset0.getString("dept_name"));
			rec.dty_name = Util.checkString(rset0.getString("dty_name"));
			rec.posi_name = Util.checkString(rset0.getString("posi_name"));
			rec.addm_dept_cd = Util.checkString(rset0.getString("addm_dept_cd"));
			rec.addm_insd_dept_cd = Util.checkString(rset0.getString("addm_insd_dept_cd"));
			rec.addm_dty_cd = Util.checkString(rset0.getString("addm_dty_cd"));
			rec.addm_posi_cd = Util.checkString(rset0.getString("addm_posi_cd"));
			rec.addm_dept_name = Util.checkString(rset0.getString("addm_dept_name"));
			rec.addm_dty_name = Util.checkString(rset0.getString("addm_dty_name"));
			rec.addm_posi_name = Util.checkString(rset0.getString("addm_posi_name"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_1600_LDataSet ds = (HD_SRCH_1600_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SRCH_1600_LCURLISTRecord curlistRec = (HD_SRCH_1600_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.cmpy_cd%>
<%= curlistRec.prn%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.emp_clsf%>
<%= curlistRec.emp_dtls_clsf%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.emp_dtls_clsf_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_name%>
<%= curlistRec.dty_name%>
<%= curlistRec.posi_name%>
<%= curlistRec.addm_dept_cd%>
<%= curlistRec.addm_insd_dept_cd%>
<%= curlistRec.addm_dty_cd%>
<%= curlistRec.addm_posi_cd%>
<%= curlistRec.addm_dept_name%>
<%= curlistRec.addm_dty_name%>
<%= curlistRec.addm_posi_name%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 10:04:25 KST 2009 */