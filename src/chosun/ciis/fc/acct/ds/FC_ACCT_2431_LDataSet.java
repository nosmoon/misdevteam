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

public class FC_ACCT_2431_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList impt_expnlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2431_LDataSet(){}
	public FC_ACCT_2431_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_2431_LIMPT_EXPNLISTRecord rec = new FC_ACCT_2431_LIMPT_EXPNLISTRecord();
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.reso_amt = Util.checkString(rset0.getString("reso_amt"));
			rec.adpay_amt = Util.checkString(rset0.getString("adpay_amt"));
			rec.incmg_emp_no = Util.checkString(rset0.getString("incmg_emp_no"));
			rec.incmg_emp_nm = Util.checkString(rset0.getString("incmg_emp_nm"));
			rec.chrg_emp_no = Util.checkString(rset0.getString("chrg_emp_no"));
			rec.chrg_emp_nm = Util.checkString(rset0.getString("chrg_emp_nm"));
			rec.expn_clsf = Util.checkString(rset0.getString("expn_clsf"));
			rec.impt_expn_clsf = Util.checkString(rset0.getString("impt_expn_clsf"));
			rec.slip_aprv_yn = Util.checkString(rset0.getString("slip_aprv_yn"));
			rec.pg_mid = Util.checkString(rset0.getString("pg_mid"));
			rec.slipprocstat = Util.checkString(rset0.getString("slipprocstat"));
			this.impt_expnlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2431_LDataSet ds = (FC_ACCT_2431_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.impt_expnlist.size(); i++){
		FC_ACCT_2431_LIMPT_EXPNLISTRecord impt_expnlistRec = (FC_ACCT_2431_LIMPT_EXPNLISTRecord)ds.impt_expnlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getImpt_expnlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= impt_expnlistRec.slip_no%>
<%= impt_expnlistRec.slip_occr_dt%>
<%= impt_expnlistRec.slip_clsf_cd%>
<%= impt_expnlistRec.slip_seq%>
<%= impt_expnlistRec.slip_sub_seq%>
<%= impt_expnlistRec.titl%>
<%= impt_expnlistRec.reso_amt%>
<%= impt_expnlistRec.adpay_amt%>
<%= impt_expnlistRec.incmg_emp_no%>
<%= impt_expnlistRec.incmg_emp_nm%>
<%= impt_expnlistRec.chrg_emp_no%>
<%= impt_expnlistRec.chrg_emp_nm%>
<%= impt_expnlistRec.expn_clsf%>
<%= impt_expnlistRec.impt_expn_clsf%>
<%= impt_expnlistRec.slip_aprv_yn%>
<%= impt_expnlistRec.pg_mid%>
<%= impt_expnlistRec.slipprocstat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 18 17:50:51 KST 2009 */