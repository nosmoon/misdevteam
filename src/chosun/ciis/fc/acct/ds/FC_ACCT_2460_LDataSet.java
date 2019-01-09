/***************************************************************************************************
* 파일명 : SP_CO_L_RDRCRTS_GRAD_APLC.java
* 기능 :  독자-독자인증요청 조회
* 작성일자 : 2004-05-17
* 작성자 : 전현표
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
 * 독자-독자인증요청 조회
 */

public class FC_ACCT_2460_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList slip_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2460_LDataSet(){}
	public FC_ACCT_2460_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			FC_ACCT_2460_LSLIP_LISTRecord rec = new FC_ACCT_2460_LSLIP_LISTRecord();
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.clam_dept_cd = Util.checkString(rset0.getString("clam_dept_cd"));
			rec.clam_dept_nm = Util.checkString(rset0.getString("clam_dept_nm"));
			rec.clam_dept_cdnm = Util.checkString(rset0.getString("clam_dept_cdnm"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.incmg_emp_no = Util.checkString(rset0.getString("incmg_emp_no"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.incmg_emp_nm = Util.checkString(rset0.getString("incmg_emp_nm"));
			rec.incmg_emp_nonm = Util.checkString(rset0.getString("incmg_emp_nonm"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.setoff_slip_clsf_cd = Util.checkString(rset0.getString("setoff_slip_clsf_cd"));
			rec.fisc_seq = Util.checkString(rset0.getString("fisc_seq"));
			rec.fisc_no = Util.checkString(rset0.getString("fisc_no"));
			rec.sum_dr_amt = Util.checkString(rset0.getString("sum_dr_amt"));
			rec.sum_crdt_amt = Util.checkString(rset0.getString("sum_crdt_amt"));
			rec.reso_amt = Util.checkString(rset0.getString("reso_amt"));
			this.slip_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2460_LDataSet ds = (FC_ACCT_2460_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.slip_list.size(); i++){
		FC_ACCT_2460_LSLIP_LISTRecord slip_listRec = (FC_ACCT_2460_LSLIP_LISTRecord)ds.slip_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSlip_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= slip_listRec.slip_occr_dt%>
<%= slip_listRec.slip_clsf_cd%>
<%= slip_listRec.slip_seq%>
<%= slip_listRec.slip_sub_seq%>
<%= slip_listRec.slip_no%>
<%= slip_listRec.clam_dept_cd%>
<%= slip_listRec.clam_dept_nm%>
<%= slip_listRec.clam_dept_cdnm%>
<%= slip_listRec.rmks1%>
<%= slip_listRec.incmg_emp_no%>
<%= slip_listRec.fisc_dt%>
<%= slip_listRec.incmg_emp_nm%>
<%= slip_listRec.incmg_emp_nonm%>
<%= slip_listRec.incmg_dt%>
<%= slip_listRec.setoff_slip_clsf_cd%>
<%= slip_listRec.fisc_seq%>
<%= slip_listRec.fisc_no%>
<%= slip_listRec.sum_dr_amt%>
<%= slip_listRec.sum_crdt_amt%>
<%= slip_listRec.reso_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 20 11:04:25 KST 2009 */