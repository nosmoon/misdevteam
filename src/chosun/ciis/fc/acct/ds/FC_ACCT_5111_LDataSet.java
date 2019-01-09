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


public class FC_ACCT_5111_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5111_LDataSet(){}
	public FC_ACCT_5111_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_ACCT_5111_LCURLISTRecord rec = new FC_ACCT_5111_LCURLISTRecord();
			rec.clos_dt = Util.checkString(rset0.getString("clos_dt"));
			rec.clos_clsf = Util.checkString(rset0.getString("clos_clsf"));
			rec.clos_tbl = Util.checkString(rset0.getString("clos_tbl"));
			rec.clos_proc_dt_tm = Util.checkString(rset0.getString("clos_proc_dt_tm"));
			rec.clos_proc_ms = Util.checkString(rset0.getString("clos_proc_ms"));
			rec.clos_pers_emp_no = Util.checkString(rset0.getString("clos_pers_emp_no"));
			rec.clos_pers_emp_nm = Util.checkString(rset0.getString("clos_pers_emp_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_5111_LDataSet ds = (FC_ACCT_5111_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_5111_LCURLISTRecord curlistRec = (FC_ACCT_5111_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.clos_dt%>
<%= curlistRec.clos_clsf%>
<%= curlistRec.clos_tbl%>
<%= curlistRec.clos_proc_dt_tm%>
<%= curlistRec.clos_proc_ms%>
<%= curlistRec.clos_pers_emp_no%>
<%= curlistRec.clos_pers_emp_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 12 20:36:19 KST 2009 */