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


public class FC_FUNC_6091_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_6091_LDataSet(){}
	public FC_FUNC_6091_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_FUNC_6091_LCURLISTRecord rec = new FC_FUNC_6091_LCURLISTRecord();
			rec.cost_gain_stot = Util.checkString(rset0.getString("cost_gain_stot"));
			rec.rcpay_amt_stot = Util.checkString(rset0.getString("rcpay_amt_stot"));
			rec.ijajanamt = Util.checkString(rset0.getString("ijajanamt"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset0.getString("prelae_pay_clsf_cd"));
			rec.deps_isav_nm = Util.checkString(rset0.getString("deps_isav_nm"));
			rec.cntr_amt = Util.checkString(rset0.getString("cntr_amt"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.pymt_mm = Util.checkString(rset0.getString("pymt_mm"));
			rec.pymt_amt = Util.checkString(rset0.getString("pymt_amt"));
			rec.tot_pymt_amt = Util.checkString(rset0.getString("tot_pymt_amt"));
			rec.deps_isav_stat_cd = Util.checkString(rset0.getString("deps_isav_stat_cd"));
			rec.cctr_dt = Util.checkString(rset0.getString("cctr_dt"));
			rec.impt_amt = Util.checkString(rset0.getString("impt_amt"));
			rec.corp_tax_amt = Util.checkString(rset0.getString("corp_tax_amt"));
			rec.patr_budg_cd = Util.checkString(rset0.getString("patr_budg_cd"));
			rec.deps_clsf_cd = Util.checkString(rset0.getString("deps_clsf_cd"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.yejpno = Util.checkString(rset0.getString("yejpno"));
			rec.tot_int_amt = Util.checkString(rset0.getString("tot_int_amt"));
			rec.unrcp_precpt_bal = Util.checkString(rset0.getString("unrcp_precpt_bal"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_6091_LDataSet ds = (FC_FUNC_6091_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_6091_LCURLISTRecord curlistRec = (FC_FUNC_6091_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cost_gain_stot%>
<%= curlistRec.rcpay_amt_stot%>
<%= curlistRec.ijajanamt%>
<%= curlistRec.prelae_pay_clsf_cd%>
<%= curlistRec.deps_isav_nm%>
<%= curlistRec.cntr_amt%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.compnm%>
<%= curlistRec.pymt_mm%>
<%= curlistRec.pymt_amt%>
<%= curlistRec.tot_pymt_amt%>
<%= curlistRec.deps_isav_stat_cd%>
<%= curlistRec.cctr_dt%>
<%= curlistRec.impt_amt%>
<%= curlistRec.corp_tax_amt%>
<%= curlistRec.patr_budg_cd%>
<%= curlistRec.deps_clsf_cd%>
<%= curlistRec.rmks%>
<%= curlistRec.yejpno%>
<%= curlistRec.tot_int_amt%>
<%= curlistRec.unrcp_precpt_bal%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 14:11:51 KST 2009 */