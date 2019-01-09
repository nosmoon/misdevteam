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


public class FC_ACCT_2031_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2031_LDataSet(){}
	public FC_ACCT_2031_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_ACCT_2031_LCURLISTRecord rec = new FC_ACCT_2031_LCURLISTRecord();
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.clam_dept_cd = Util.checkString(rset0.getString("clam_dept_cd"));
			rec.chrg_emp_no = Util.checkString(rset0.getString("chrg_emp_no"));
			rec.chrg_emp_no_nm = Util.checkString(rset0.getString("chrg_emp_no_nm"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.clam_amt = Util.checkString(rset0.getString("clam_amt"));
			rec.hj_incmg_emp_no = Util.checkString(rset0.getString("hj_incmg_emp_no"));
			rec.hj_incmg_emp_no_nm = Util.checkString(rset0.getString("hj_incmg_emp_no_nm"));
			rec.hj_slip_aprv_yn = Util.checkString(rset0.getString("hj_slip_aprv_yn"));
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.emp_no_nm = Util.checkString(rset0.getString("emp_no_nm"));
			rec.emp_dept_cd_nm = Util.checkString(rset0.getString("emp_dept_cd_nm"));
			rec.dest = Util.checkString(rset0.getString("dest"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2031_LDataSet ds = (FC_ACCT_2031_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2031_LCURLISTRecord curlistRec = (FC_ACCT_2031_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.clam_dept_cd%>
<%= curlistRec.chrg_emp_no%>
<%= curlistRec.chrg_emp_no_nm%>
<%= curlistRec.rmks%>
<%= curlistRec.clam_amt%>
<%= curlistRec.hj_incmg_emp_no%>
<%= curlistRec.hj_incmg_emp_no_nm%>
<%= curlistRec.hj_slip_aprv_yn%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.emp_no%>
<%= curlistRec.emp_no_nm%>
<%= curlistRec.emp_dept_cd_nm%>
<%= curlistRec.dest%>
<%= curlistRec.amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 06 14:32:44 KST 2009 */