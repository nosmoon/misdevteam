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


public class FC_FUNC_1052_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1052_LDataSet(){}
	public FC_FUNC_1052_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_1052_LCURLISTRecord rec = new FC_FUNC_1052_LCURLISTRecord();
			rec.note_clsf_cd_nm = Util.checkString(rset2.getString("note_clsf_cd_nm"));
			rec.note_no = Util.checkString(rset2.getString("note_no"));
			rec.mtry_dt = Util.checkString(rset2.getString("mtry_dt"));
			rec.note_amt = Util.checkString(rset2.getString("note_amt"));
			rec.frex_amt = Util.checkString(rset2.getString("frex_amt"));
			rec.rcpay_amt = Util.checkString(rset2.getString("rcpay_amt"));
			rec.coms = Util.checkString(rset2.getString("coms"));
			rec.eeik_amt = Util.checkString(rset2.getString("eeik_amt"));
			rec.slipno = Util.checkString(rset2.getString("slipno"));
			rec.issu_pers_nm = Util.checkString(rset2.getString("issu_pers_nm"));
			rec.compnm2 = Util.checkString(rset2.getString("compnm2"));
			rec.note_clehous_cd_nm = Util.checkString(rset2.getString("note_clehous_cd_nm"));
			rec.now_note_stat_cd_nm = Util.checkString(rset2.getString("now_note_stat_cd_nm"));
			rec.bank_nm = Util.checkString(rset2.getString("bank_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset2.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset2.getString("dlco_cd"));
			rec.note_clehous_cd = Util.checkString(rset2.getString("note_clehous_cd"));
			rec.now_note_stat_cd = Util.checkString(rset2.getString("now_note_stat_cd"));
			rec.compnm = Util.checkString(rset2.getString("compnm"));
			rec.note_clsf_cd = Util.checkString(rset2.getString("note_clsf_cd"));
			rec.dlco_clsf_cd1 = Util.checkString(rset2.getString("dlco_clsf_cd1"));
			rec.dlco_cd1 = Util.checkString(rset2.getString("dlco_cd1"));
			rec.slip_occr_dt = Util.checkString(rset2.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset2.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset2.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset2.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset2.getString("slip_arow_no"));
			rec.frex_cd = Util.checkString(rset2.getString("frex_cd"));
			rec.exrate = Util.checkString(rset2.getString("exrate"));
			rec.bank_cd = Util.checkString(rset2.getString("bank_cd"));
			rec.note_seq = Util.checkString(rset2.getString("note_seq"));
			rec.biz_reg_no = Util.checkString(rset2.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset2.getString("bank_id"));
			rec.acct_num = Util.checkString(rset2.getString("acct_num"));
			rec.tran_date_seq = Util.checkString(rset2.getString("tran_date_seq"));
			rec.current_clsf = Util.checkString(rset2.getString("current_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1052_LDataSet ds = (FC_FUNC_1052_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1052_LCURLISTRecord curlistRec = (FC_FUNC_1052_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.note_clsf_cd_nm%>
<%= curlistRec.note_no%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.note_amt%>
<%= curlistRec.frex_amt%>
<%= curlistRec.rcpay_amt%>
<%= curlistRec.coms%>
<%= curlistRec.eeik_amt%>
<%= curlistRec.slipno%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.compnm2%>
<%= curlistRec.note_clehous_cd_nm%>
<%= curlistRec.now_note_stat_cd_nm%>
<%= curlistRec.bank_nm%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.note_clehous_cd%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.compnm%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.dlco_clsf_cd1%>
<%= curlistRec.dlco_cd1%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.frex_cd%>
<%= curlistRec.exrate%>
<%= curlistRec.bank_cd%>
<%= curlistRec.note_seq%>
<%= curlistRec.biz_reg_no%>
<%= curlistRec.bank_id%>
<%= curlistRec.acct_num%>
<%= curlistRec.tran_date_seq%>
<%= curlistRec.current_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 17 20:41:31 KST 2009 */