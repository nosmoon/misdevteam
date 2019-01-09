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


public class FC_FUNC_8041_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_8041_LDataSet(){}
	public FC_FUNC_8041_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_FUNC_8041_LCURLIST1Record rec = new FC_FUNC_8041_LCURLIST1Record();
			rec.leas_nm = Util.checkString(rset0.getString("leas_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.leas_stat_cd = Util.checkString(rset0.getString("leas_stat_cd"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset0.getString("prelae_pay_clsf_cd"));
			rec.cost_gain_stot = Util.checkString(rset0.getString("cost_gain_stot"));
			rec.rcpay_amt_stot = Util.checkString(rset0.getString("rcpay_amt_stot"));
			rec.frcr_amt = Util.checkString(rset0.getString("frcr_amt"));
			rec.pay_plan_tms = Util.checkString(rset0.getString("pay_plan_tms"));
			rec.libo_yn = Util.checkString(rset0.getString("libo_yn"));
			rec.pch_amt1 = Util.checkString(rset0.getString("pch_amt1"));
			rec.pch_amt2 = Util.checkString(rset0.getString("pch_amt2"));
			rec.pch_count = Util.checkString(rset0.getString("pch_count"));
			rec.pch_compgbnm = Util.checkString(rset0.getString("pch_compgbnm"));
			rec.pch_compnm = Util.checkString(rset0.getString("pch_compnm"));
			rec.pch_stnm = Util.checkString(rset0.getString("pch_stnm"));
			rec.shggbnm = Util.checkString(rset0.getString("shggbnm"));
			rec.libo_int_rate = Util.checkString(rset0.getString("libo_int_rate"));
			rec.dedu_int_rate = Util.checkString(rset0.getString("dedu_int_rate"));
			rec.int_calc_cd = Util.checkString(rset0.getString("int_calc_cd"));
			rec.frex_cd = Util.checkString(rset0.getString("frex_cd"));
			rec.frcr_cd_amt = Util.checkString(rset0.getString("frcr_cd_amt"));
			rec.leas_hire_clsf_cd = Util.checkString(rset0.getString("leas_hire_clsf_cd"));
			rec.imchagbnm = Util.checkString(rset0.getString("imchagbnm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_8041_LDataSet ds = (FC_FUNC_8041_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_8041_LCURLIST1Record curlist1Rec = (FC_FUNC_8041_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.leas_nm%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.leas_stat_cd%>
<%= curlist1Rec.prelae_pay_clsf_cd%>
<%= curlist1Rec.cost_gain_stot%>
<%= curlist1Rec.rcpay_amt_stot%>
<%= curlist1Rec.frcr_amt%>
<%= curlist1Rec.pay_plan_tms%>
<%= curlist1Rec.libo_yn%>
<%= curlist1Rec.pch_amt1%>
<%= curlist1Rec.pch_amt2%>
<%= curlist1Rec.pch_count%>
<%= curlist1Rec.pch_compgbnm%>
<%= curlist1Rec.pch_compnm%>
<%= curlist1Rec.pch_stnm%>
<%= curlist1Rec.shggbnm%>
<%= curlist1Rec.libo_int_rate%>
<%= curlist1Rec.dedu_int_rate%>
<%= curlist1Rec.int_calc_cd%>
<%= curlist1Rec.frex_cd%>
<%= curlist1Rec.frcr_cd_amt%>
<%= curlist1Rec.leas_hire_clsf_cd%>
<%= curlist1Rec.imchagbnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 16:48:11 KST 2009 */