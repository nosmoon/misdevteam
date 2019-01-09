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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2861_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rcpmprocptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2861_LDataSet(){}
	public FC_ACCT_2861_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(12);
		while(rset2.next()){
			FC_ACCT_2861_LRCPMPROCPTCRLISTRecord rec = new FC_ACCT_2861_LRCPMPROCPTCRLISTRecord();
			rec.rcpm_shet_kind = Util.checkString(rset2.getString("rcpm_shet_kind"));
			rec.rcpm_shet_no = Util.checkString(rset2.getString("rcpm_shet_no"));
			rec.rcpm_clsf = Util.checkString(rset2.getString("rcpm_clsf"));
			rec.rcpm_shet_dlv_dt = Util.checkString(rset2.getString("rcpm_shet_dlv_dt"));
			rec.dlver_emp_no = Util.checkString(rset2.getString("dlver_emp_no"));
			rec.dlver_emp_nm = Util.checkString(rset2.getString("dlver_emp_nm"));
			rec.recp_pers_emp_no = Util.checkString(rset2.getString("recp_pers_emp_no"));
			rec.recp_pers_emp_nm = Util.checkString(rset2.getString("recp_pers_emp_nm"));
			rec.widr_dt = Util.checkString(rset2.getString("widr_dt"));
			rec.rcpm_shet_stat = Util.checkString(rset2.getString("rcpm_shet_stat"));
			rec.widr_resn = Util.checkString(rset2.getString("widr_resn"));
			rec.rmks = Util.checkString(rset2.getString("rmks"));
			rec.rsrt_pers_emp_no = Util.checkString(rset2.getString("rsrt_pers_emp_no"));
			rec.rsrt_pers_emp_nm = Util.checkString(rset2.getString("rsrt_pers_emp_nm"));
			this.rcpmprocptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2861_LDataSet ds = (FC_ACCT_2861_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rcpmprocptcrlist.size(); i++){
		FC_ACCT_2861_LRCPMPROCPTCRLISTRecord rcpmprocptcrlistRec = (FC_ACCT_2861_LRCPMPROCPTCRLISTRecord)ds.rcpmprocptcrlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRcpmprocptcrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rcpmprocptcrlistRec.rcpm_shet_kind%>
<%= rcpmprocptcrlistRec.rcpm_shet_no%>
<%= rcpmprocptcrlistRec.rcpm_clsf%>
<%= rcpmprocptcrlistRec.rcpm_shet_dlv_dt%>
<%= rcpmprocptcrlistRec.dlver_emp_no%>
<%= rcpmprocptcrlistRec.dlver_emp_nm%>
<%= rcpmprocptcrlistRec.recp_pers_emp_no%>
<%= rcpmprocptcrlistRec.recp_pers_emp_nm%>
<%= rcpmprocptcrlistRec.widr_dt%>
<%= rcpmprocptcrlistRec.rcpm_shet_stat%>
<%= rcpmprocptcrlistRec.widr_resn%>
<%= rcpmprocptcrlistRec.rmks%>
<%= rcpmprocptcrlistRec.rsrt_pers_emp_no%>
<%= rcpmprocptcrlistRec.rsrt_pers_emp_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 16 10:45:23 KST 2009 */