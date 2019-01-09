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


public class FC_FUNC_1462_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1462_LDataSet(){}
	public FC_FUNC_1462_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_FUNC_1462_LCURLISTRecord rec = new FC_FUNC_1462_LCURLISTRecord();
			rec.note_clsf_cdnm = Util.checkString(rset0.getString("note_clsf_cdnm"));
			rec.note_full_no = Util.checkString(rset0.getString("note_full_no"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.deps_dt = Util.checkString(rset0.getString("deps_dt"));
			rec.sale_dscn_amt = Util.checkString(rset0.getString("sale_dscn_amt"));
			rec.bank_cd_nm = Util.checkString(rset0.getString("bank_cd_nm"));
			rec.rcpm_acct_nm2 = Util.checkString(rset0.getString("rcpm_acct_nm2"));
			rec.rcpay_amt = Util.checkString(rset0.getString("rcpay_amt"));
			rec.corp_tax = Util.checkString(rset0.getString("corp_tax"));
			rec.etc_prft = Util.checkString(rset0.getString("etc_prft"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_cdnm = Util.checkString(rset0.getString("dlco_cdnm"));
			rec.pay_plac_cdnm = Util.checkString(rset0.getString("pay_plac_cdnm"));
			rec.now_note_stat_cdnm = Util.checkString(rset0.getString("now_note_stat_cdnm"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.sale_aprv_no = Util.checkString(rset0.getString("sale_aprv_no"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.biz_reg_no = Util.checkString(rset0.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset0.getString("bank_id"));
			rec.acct_num = Util.checkString(rset0.getString("acct_num"));
			rec.tran_date_seq = Util.checkString(rset0.getString("tran_date_seq"));
			rec.current_clsf = Util.checkString(rset0.getString("current_clsf"));
			rec.corp_local_tax = Util.checkString(rset0.getString("corp_local_tax"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1462_LDataSet ds = (FC_FUNC_1462_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1462_LCURLISTRecord curlistRec = (FC_FUNC_1462_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.note_clsf_cdnm%>
<%= curlistRec.note_full_no%>
<%= curlistRec.note_amt%>
<%= curlistRec.deps_dt%>
<%= curlistRec.sale_dscn_amt%>
<%= curlistRec.bank_cd_nm%>
<%= curlistRec.rcpm_acct_nm2%>
<%= curlistRec.rcpay_amt%>
<%= curlistRec.corp_tax%>
<%= curlistRec.etc_prft%>
<%= curlistRec.slip_no%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_cdnm%>
<%= curlistRec.pay_plac_cdnm%>
<%= curlistRec.now_note_stat_cdnm%>
<%= curlistRec.comp_dt%>
<%= curlistRec.sale_aprv_no%>
<%= curlistRec.coms%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.note_no%>
<%= curlistRec.bank_cd%>
<%= curlistRec.note_seq%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.biz_reg_no%>
<%= curlistRec.bank_id%>
<%= curlistRec.acct_num%>
<%= curlistRec.tran_date_seq%>
<%= curlistRec.current_clsf%>
<%= curlistRec.corp_local_tax%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 07 15:00:49 KST 2015 */