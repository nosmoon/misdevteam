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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_7011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_7011_LDataSet(){}
	public FC_FUNC_7011_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_7011_LCURLIST1Record rec = new FC_FUNC_7011_LCURLIST1Record();
			rec.loan_nm = Util.checkString(rset1.getString("loan_nm"));
			rec.loan_amt = Util.checkString(rset1.getString("loan_amt"));
			rec.comp_dt = Util.checkString(rset1.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.int_clsf_cd = Util.checkString(rset1.getString("int_clsf_cd"));
			rec.loan_rmks = Util.checkString(rset1.getString("loan_rmks"));
			rec.loan_slip_occr_dt = Util.checkString(rset1.getString("loan_slip_occr_dt"));
			rec.loan_slip_clsf_cd = Util.checkString(rset1.getString("loan_slip_clsf_cd"));
			rec.loan_slip_seq = Util.checkString(rset1.getString("loan_slip_seq"));
			rec.loan_repay_clsf_cd = Util.checkString(rset1.getString("loan_repay_clsf_cd"));
			rec.compgbnm = Util.checkString(rset1.getString("compgbnm"));
			rec.compnm = Util.checkString(rset1.getString("compnm"));
			rec.intgbnm = Util.checkString(rset1.getString("intgbnm"));
			rec.cishgbnm = Util.checkString(rset1.getString("cishgbnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_7011_LCURLIST2Record rec = new FC_FUNC_7011_LCURLIST2Record();
			rec.int_rate_chg_dt = Util.checkString(rset2.getString("int_rate_chg_dt"));
			rec.int_rate = Util.checkString(rset2.getString("int_rate"));
			rec.incmg_dt_tm = Util.checkString(rset2.getString("incmg_dt_tm"));
			rec.incmg_pers = Util.checkString(rset2.getString("incmg_pers"));
			rec.incmg_pers_ipadd = Util.checkString(rset2.getString("incmg_pers_ipadd"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_7011_LDataSet ds = (FC_FUNC_7011_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_7011_LCURLIST1Record curlist1Rec = (FC_FUNC_7011_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_FUNC_7011_LCURLIST2Record curlist2Rec = (FC_FUNC_7011_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.loan_nm%>
<%= curlist1Rec.loan_amt%>
<%= curlist1Rec.comp_dt%>
<%= curlist1Rec.mtry_dt%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.int_clsf_cd%>
<%= curlist1Rec.loan_rmks%>
<%= curlist1Rec.loan_slip_occr_dt%>
<%= curlist1Rec.loan_slip_clsf_cd%>
<%= curlist1Rec.loan_slip_seq%>
<%= curlist1Rec.loan_repay_clsf_cd%>
<%= curlist1Rec.compgbnm%>
<%= curlist1Rec.compnm%>
<%= curlist1Rec.intgbnm%>
<%= curlist1Rec.cishgbnm%>
<%= curlist2Rec.int_rate_chg_dt%>
<%= curlist2Rec.int_rate%>
<%= curlist2Rec.incmg_dt_tm%>
<%= curlist2Rec.incmg_pers%>
<%= curlist2Rec.incmg_pers_ipadd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 15:45:42 KST 2009 */