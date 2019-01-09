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


public class FC_FUNC_8011_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_8011_ADataSet(){}
	public FC_FUNC_8011_ADataSet(String errcode, String errmsg){
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
			FC_FUNC_8011_ACURLIST1Record rec = new FC_FUNC_8011_ACURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.cntr_clsf_cd = Util.checkString(rset0.getString("cntr_clsf_cd"));
			rec.leas_clsf_cd = Util.checkString(rset0.getString("leas_clsf_cd"));
			rec.leas_no = Util.checkString(rset0.getString("leas_no"));
			rec.totz_dt = Util.checkString(rset0.getString("totz_dt"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.cost_amt = Util.checkString(rset0.getString("cost_amt"));
			rec.rcpay_amt_stot = Util.checkString(rset0.getString("rcpay_amt_stot"));
			rec.cost_gain_stot = Util.checkString(rset0.getString("cost_gain_stot"));
			rec.cost_bal = Util.checkString(rset0.getString("cost_bal"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset0.getString("prelae_pay_clsf_cd"));
			rec.prelae_pay_clsf_nm = Util.checkString(rset0.getString("prelae_pay_clsf_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			FC_FUNC_8011_ACURLIST2Record rec = new FC_FUNC_8011_ACURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.cntr_clsf_cd = Util.checkString(rset1.getString("cntr_clsf_cd"));
			rec.leas_clsf_cd = Util.checkString(rset1.getString("leas_clsf_cd"));
			rec.leas_no = Util.checkString(rset1.getString("leas_no"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.cost_amt = Util.checkString(rset1.getString("cost_amt"));
			rec.rmks = Util.checkString(rset1.getString("rmks"));
			rec.fisc_dt = Util.checkString(rset1.getString("fisc_dt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_8011_ADataSet ds = (FC_FUNC_8011_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_8011_ACURLIST1Record curlist1Rec = (FC_FUNC_8011_ACURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_FUNC_8011_ACURLIST2Record curlist2Rec = (FC_FUNC_8011_ACURLIST2Record)ds.curlist2.get(i);%>
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
<%= curlist1Rec.cntr_clsf_cd%>
<%= curlist1Rec.leas_clsf_cd%>
<%= curlist1Rec.leas_no%>
<%= curlist1Rec.totz_dt%>
<%= curlist1Rec.comp_dt%>
<%= curlist1Rec.mtry_dt%>
<%= curlist1Rec.cost_amt%>
<%= curlist1Rec.rcpay_amt_stot%>
<%= curlist1Rec.cost_gain_stot%>
<%= curlist1Rec.cost_bal%>
<%= curlist1Rec.prelae_pay_clsf_cd%>
<%= curlist1Rec.prelae_pay_clsf_nm%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.cntr_clsf_cd%>
<%= curlist2Rec.leas_clsf_cd%>
<%= curlist2Rec.leas_no%>
<%= curlist2Rec.slip_no%>
<%= curlist2Rec.cost_amt%>
<%= curlist2Rec.rmks%>
<%= curlist2Rec.fisc_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 25 18:58:57 KST 2009 */