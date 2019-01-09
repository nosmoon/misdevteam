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


public class FC_FUNC_6031_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_6031_LDataSet(){}
	public FC_FUNC_6031_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_6031_LCURLISTRecord rec = new FC_FUNC_6031_LCURLISTRecord();
			rec.cost_gain_stot = Util.checkString(rset0.getString("cost_gain_stot"));
			rec.rcpay_amt_stot = Util.checkString(rset0.getString("rcpay_amt_stot"));
			rec.ijajanamt = Util.checkString(rset0.getString("ijajanamt"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset0.getString("prelae_pay_clsf_cd"));
			rec.deps_isav_nm = Util.checkString(rset0.getString("deps_isav_nm"));
			rec.tot_pymt_amt = Util.checkString(rset0.getString("tot_pymt_amt"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_clsf_nm = Util.checkString(rset0.getString("dlco_clsf_nm"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.jpno = Util.checkString(rset0.getString("jpno"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.deps_isav_stat_cdnm = Util.checkString(rset0.getString("deps_isav_stat_cdnm"));
			rec.deps_isav_stat_cd = Util.checkString(rset0.getString("deps_isav_stat_cd"));
			rec.hy_cctr_dt = Util.checkString(rset0.getString("hy_cctr_dt"));
			rec.hy_impt_amt = Util.checkString(rset0.getString("hy_impt_amt"));
			rec.hy_corp_tax_amt = Util.checkString(rset0.getString("hy_corp_tax_amt"));
			rec.hy_patr_budg_cd = Util.checkString(rset0.getString("hy_patr_budg_cd"));
			rec.hy_deps_clsf_cd = Util.checkString(rset0.getString("hy_deps_clsf_cd"));
			rec.hy_rmks = Util.checkString(rset0.getString("hy_rmks"));
			rec.hy_yejpno = Util.checkString(rset0.getString("hy_yejpno"));
			rec.hy_tot_int_amt = Util.checkString(rset0.getString("hy_tot_int_amt"));
			rec.hy_unrcp_precpt_bal = Util.checkString(rset0.getString("hy_unrcp_precpt_bal"));
			rec.int_rate = Util.checkString(rset0.getString("int_rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_6031_LDataSet ds = (FC_FUNC_6031_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_6031_LCURLISTRecord curlistRec = (FC_FUNC_6031_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.tot_pymt_amt%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dlco_clsf_nm%>
<%= curlistRec.rmks%>
<%= curlistRec.jpno%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.deps_isav_stat_cdnm%>
<%= curlistRec.deps_isav_stat_cd%>
<%= curlistRec.hy_cctr_dt%>
<%= curlistRec.hy_impt_amt%>
<%= curlistRec.hy_corp_tax_amt%>
<%= curlistRec.hy_patr_budg_cd%>
<%= curlistRec.hy_deps_clsf_cd%>
<%= curlistRec.hy_rmks%>
<%= curlistRec.hy_yejpno%>
<%= curlistRec.hy_tot_int_amt%>
<%= curlistRec.hy_unrcp_precpt_bal%>
<%= curlistRec.int_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 18 14:10:04 KST 2009 */