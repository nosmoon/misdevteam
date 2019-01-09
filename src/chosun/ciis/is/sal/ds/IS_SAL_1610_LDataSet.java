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


package chosun.ciis.is.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_SAL_1610_LDataSet(){}
	public IS_SAL_1610_LDataSet(String errcode, String errmsg){
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
			IS_SAL_1610_LCURLISTRecord rec = new IS_SAL_1610_LCURLISTRecord();
			rec.purc_adjm_reg_dt = Util.checkString(rset0.getString("purc_adjm_reg_dt"));
			rec.purc_adjm_reg_seq = Util.checkString(rset0.getString("purc_adjm_reg_seq"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.asnt_dstc_cd = Util.checkString(rset0.getString("asnt_dstc_cd"));
			rec.asnt_dstc_cd_nm = Util.checkString(rset0.getString("asnt_dstc_cd_nm"));
			rec.dlco_clsf_cd_seq = Util.checkString(rset0.getString("dlco_clsf_cd_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.adjm_dt = Util.checkString(rset0.getString("adjm_dt"));
			rec.pay_plan_dd_pers = Util.checkString(rset0.getString("pay_plan_dd_pers"));
			rec.txn_clsf = Util.checkString(rset0.getString("txn_clsf"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.dduc_amt = Util.checkString(rset0.getString("dduc_amt"));
			rec.comp_amt = Util.checkString(rset0.getString("comp_amt"));
			rec.prom_amt = Util.checkString(rset0.getString("prom_amt"));
			rec.gds_vol_amt = Util.checkString(rset0.getString("gds_vol_amt"));
			rec.etc_amt = Util.checkString(rset0.getString("etc_amt"));
			rec.stot_amt = Util.checkString(rset0.getString("stot_amt"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.setl_bank_nm = Util.checkString(rset0.getString("setl_bank_nm"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.rcpm_main_nm = Util.checkString(rset0.getString("rcpm_main_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.sup_ern = Util.checkString(rset0.getString("sup_ern"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_SAL_1610_LDataSet ds = (IS_SAL_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_SAL_1610_LCURLISTRecord curlistRec = (IS_SAL_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.purc_adjm_reg_dt%>
<%= curlistRec.purc_adjm_reg_seq%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
<%= curlistRec.asnt_dstc_cd%>
<%= curlistRec.asnt_dstc_cd_nm%>
<%= curlistRec.dlco_clsf_cd_seq%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.adjm_dt%>
<%= curlistRec.pay_plan_dd_pers%>
<%= curlistRec.txn_clsf%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.dduc_amt%>
<%= curlistRec.comp_amt%>
<%= curlistRec.prom_amt%>
<%= curlistRec.gds_vol_amt%>
<%= curlistRec.etc_amt%>
<%= curlistRec.stot_amt%>
<%= curlistRec.clos_yn%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.setl_bank_nm%>
<%= curlistRec.acct_no%>
<%= curlistRec.rcpm_main_nm%>
<%= curlistRec.ern%>
<%= curlistRec.sup_ern%>
<%= curlistRec.chg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 13:56:29 KST 2012 */