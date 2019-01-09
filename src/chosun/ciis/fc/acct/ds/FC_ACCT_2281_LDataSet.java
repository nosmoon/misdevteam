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


public class FC_ACCT_2281_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2281_LDataSet(){}
	public FC_ACCT_2281_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			FC_ACCT_2281_LCURLIST1Record rec = new FC_ACCT_2281_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.mang_clsf_cdnm = Util.checkString(rset0.getString("mang_clsf_cdnm"));
			rec.prvdd_bal = Util.checkString(rset0.getString("prvdd_bal"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.crdt_amt = Util.checkString(rset0.getString("crdt_amt"));
			rec.curdd_bal = Util.checkString(rset0.getString("curdd_bal"));
			rec.withdraw = Util.checkString(rset0.getString("withdraw"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			FC_ACCT_2281_LCURLIST2Record rec = new FC_ACCT_2281_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset1.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset1.getString("slip_arow_no"));
			rec.incmg_emp_no = Util.checkString(rset1.getString("incmg_emp_no"));
			rec.incmg_emp_nm = Util.checkString(rset1.getString("incmg_emp_nm"));
			rec.rmks1 = Util.checkString(rset1.getString("rmks1"));
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset1.getString("budg_nm"));
			rec.mang_clsf_cd = Util.checkString(rset1.getString("mang_clsf_cd"));
			rec.mang_clsf_nm = Util.checkString(rset1.getString("mang_clsf_nm"));
			rec.drcr_clsf = Util.checkString(rset1.getString("drcr_clsf"));
			rec.dr_amt = Util.checkString(rset1.getString("dr_amt"));
			rec.crdt_amt = Util.checkString(rset1.getString("crdt_amt"));
			rec.boks_dlco_nm = Util.checkString(rset1.getString("boks_dlco_nm"));
			rec.rmks2 = Util.checkString(rset1.getString("rmks2"));
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2281_LDataSet ds = (FC_ACCT_2281_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_2281_LCURLIST1Record curlist1Rec = (FC_ACCT_2281_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_2281_LCURLIST2Record curlist2Rec = (FC_ACCT_2281_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.incmg_dt%>
<%= curlist1Rec.acct_cd%>
<%= curlist1Rec.mang_clsf_cd%>
<%= curlist1Rec.mang_clsf_cdnm%>
<%= curlist1Rec.prvdd_bal%>
<%= curlist1Rec.dr_amt%>
<%= curlist1Rec.crdt_amt%>
<%= curlist1Rec.curdd_bal%>
<%= curlist1Rec.withdraw%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.slip_occr_dt%>
<%= curlist2Rec.slip_clsf_cd%>
<%= curlist2Rec.slip_seq%>
<%= curlist2Rec.slip_sub_seq%>
<%= curlist2Rec.slip_arow_no%>
<%= curlist2Rec.incmg_emp_no%>
<%= curlist2Rec.incmg_emp_nm%>
<%= curlist2Rec.rmks1%>
<%= curlist2Rec.budg_cd%>
<%= curlist2Rec.budg_nm%>
<%= curlist2Rec.mang_clsf_cd%>
<%= curlist2Rec.mang_clsf_nm%>
<%= curlist2Rec.drcr_clsf%>
<%= curlist2Rec.dr_amt%>
<%= curlist2Rec.crdt_amt%>
<%= curlist2Rec.boks_dlco_nm%>
<%= curlist2Rec.rmks2%>
<%= curlist2Rec.dlco_clsf_cd%>
<%= curlist2Rec.dlco_cd%>
<%= curlist2Rec.dlco_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 21:01:26 KST 2009 */