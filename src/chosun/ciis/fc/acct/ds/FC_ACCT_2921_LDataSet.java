/***************************************************************************************************
* 파일명 : .java
* 기능 : 회계관리
* 작성일자 : 2009-02-19
* 작성자 : 노상현
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
 * 회계관리
 */


public class FC_ACCT_2921_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2921_LDataSet(){}
	public FC_ACCT_2921_LDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			FC_ACCT_2921_LCURLISTRecord rec = new FC_ACCT_2921_LCURLISTRecord();
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.budg_cdnm = Util.checkString(rset1.getString("budg_cdnm"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			rec.duty_dt = Util.checkString(rset1.getString("duty_dt"));
			rec.acct_rmtt_dt = Util.checkString(rset1.getString("acct_rmtt_dt"));
			rec.acct_no = Util.checkString(rset1.getString("acct_no"));
			rec.actu_slip_occr_seqo = Util.checkString(rset1.getString("actu_slip_occr_seqo"));
			rec.aprv_slip_occr_seqo = Util.checkString(rset1.getString("aprv_slip_occr_seqo"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2921_LDataSet ds = (FC_ACCT_2921_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2921_LCURLISTRecord curlistRec = (FC_ACCT_2921_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_nm%>
<%= curlistRec.budg_cdnm%>
<%= curlistRec.amt%>
<%= curlistRec.duty_dt%>
<%= curlistRec.acct_rmtt_dt%>
<%= curlistRec.acct_no%>
<%= curlistRec.actu_slip_occr_seqo%>
<%= curlistRec.aprv_slip_occr_seqo%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 03 20:38:33 KST 2009 */