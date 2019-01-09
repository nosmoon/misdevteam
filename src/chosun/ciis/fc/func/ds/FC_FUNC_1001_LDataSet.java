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


public class FC_FUNC_1001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_note_state_dtl_list = new ArrayList();
	public ArrayList cur_note_list = new ArrayList();
	public ArrayList cur_note_state_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1001_LDataSet(){}
	public FC_FUNC_1001_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_1001_LCUR_NOTE_LISTRecord rec = new FC_FUNC_1001_LCUR_NOTE_LISTRecord();
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.rcpm_slip_clsf_cd = Util.checkString(rset0.getString("rcpm_slip_clsf_cd"));
			rec.rcpm_seq = Util.checkString(rset0.getString("rcpm_seq"));
			rec.rcpm_sub_seq = Util.checkString(rset0.getString("rcpm_sub_seq"));
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.pay_plac_cd = Util.checkString(rset0.getString("pay_plac_cd"));
			rec.note_clehous_cd = Util.checkString(rset0.getString("note_clehous_cd"));
			rec.issu_cmpy_clsf_cd = Util.checkString(rset0.getString("issu_cmpy_clsf_cd"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			rec.now_note_stat_cd = Util.checkString(rset0.getString("now_note_stat_cd"));
			rec.now_note_stat_dt = Util.checkString(rset0.getString("now_note_stat_dt"));
			rec.fisc_aprv_stat = Util.checkString(rset0.getString("fisc_aprv_stat"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset0.getString("rmks2"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.sale_dscn_amt = Util.checkString(rset0.getString("sale_dscn_amt"));
			rec.note_clsf_cd2 = Util.checkString(rset0.getString("note_clsf_cd2"));
			this.cur_note_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			FC_FUNC_1001_LCUR_NOTE_STATE_LISTRecord rec = new FC_FUNC_1001_LCUR_NOTE_STATE_LISTRecord();
			rec.stat_cd = Util.checkString(rset1.getString("stat_cd"));
			rec.stat_dt = Util.checkString(rset1.getString("stat_dt"));
			rec.stat_nm = Util.checkString(rset1.getString("stat_nm"));
			this.cur_note_state_list.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			FC_FUNC_1001_LCUR_NOTE_STATE_DTL_LISTRecord rec = new FC_FUNC_1001_LCUR_NOTE_STATE_DTL_LISTRecord();
			rec.slip_occr_dt = Util.checkString(rset2.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset2.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset2.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset2.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset2.getString("slip_arow_no"));
			rec.dlco_clsf_cd = Util.checkString(rset2.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset2.getString("dlco_cd"));
			rec.rmks1 = Util.checkString(rset2.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset2.getString("rmks2"));
			rec.comp_nm = Util.checkString(rset2.getString("comp_nm"));
			this.cur_note_state_dtl_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1001_LDataSet ds = (FC_FUNC_1001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_note_list.size(); i++){
		FC_FUNC_1001_LCUR_NOTE_LISTRecord cur_note_listRec = (FC_FUNC_1001_LCUR_NOTE_LISTRecord)ds.cur_note_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_note_state_list.size(); i++){
		FC_FUNC_1001_LCUR_NOTE_STATE_LISTRecord cur_note_state_listRec = (FC_FUNC_1001_LCUR_NOTE_STATE_LISTRecord)ds.cur_note_state_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_note_state_dtl_list.size(); i++){
		FC_FUNC_1001_LCUR_NOTE_STATE_DTL_LISTRecord cur_note_state_dtl_listRec = (FC_FUNC_1001_LCUR_NOTE_STATE_DTL_LISTRecord)ds.cur_note_state_dtl_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_note_list()%>
<%= ds.getCur_note_state_list()%>
<%= ds.getCur_note_state_dtl_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_note_listRec.bank_cd%>
<%= cur_note_listRec.note_no%>
<%= cur_note_listRec.note_seq%>
<%= cur_note_listRec.rcpm_dt%>
<%= cur_note_listRec.rcpm_slip_clsf_cd%>
<%= cur_note_listRec.rcpm_seq%>
<%= cur_note_listRec.rcpm_sub_seq%>
<%= cur_note_listRec.note_clsf_cd%>
<%= cur_note_listRec.comp_dt%>
<%= cur_note_listRec.mtry_dt%>
<%= cur_note_listRec.note_amt%>
<%= cur_note_listRec.pay_plac_cd%>
<%= cur_note_listRec.note_clehous_cd%>
<%= cur_note_listRec.issu_cmpy_clsf_cd%>
<%= cur_note_listRec.issu_pers_nm%>
<%= cur_note_listRec.dlco_clsf_cd%>
<%= cur_note_listRec.dlco_cd%>
<%= cur_note_listRec.slip_occr_dt%>
<%= cur_note_listRec.slip_clsf_cd%>
<%= cur_note_listRec.slip_seq%>
<%= cur_note_listRec.slip_no%>
<%= cur_note_listRec.slip_sub_seq%>
<%= cur_note_listRec.slip_arow_no%>
<%= cur_note_listRec.now_note_stat_cd%>
<%= cur_note_listRec.now_note_stat_dt%>
<%= cur_note_listRec.fisc_aprv_stat%>
<%= cur_note_listRec.rmks1%>
<%= cur_note_listRec.rmks2%>
<%= cur_note_listRec.fisc_dt%>
<%= cur_note_listRec.chg_dt_tm%>
<%= cur_note_listRec.chg_pers%>
<%= cur_note_listRec.incmg_pers_ipadd%>
<%= cur_note_listRec.bank_nm%>
<%= cur_note_listRec.dlco_nm%>
<%= cur_note_listRec.sale_dscn_amt%>
<%= cur_note_listRec.note_clsf_cd2%>
<%= cur_note_state_listRec.stat_cd%>
<%= cur_note_state_listRec.stat_dt%>
<%= cur_note_state_listRec.stat_nm%>
<%= cur_note_state_dtl_listRec.slip_occr_dt%>
<%= cur_note_state_dtl_listRec.slip_clsf_cd%>
<%= cur_note_state_dtl_listRec.slip_seq%>
<%= cur_note_state_dtl_listRec.slip_sub_seq%>
<%= cur_note_state_dtl_listRec.slip_arow_no%>
<%= cur_note_state_dtl_listRec.dlco_clsf_cd%>
<%= cur_note_state_dtl_listRec.dlco_cd%>
<%= cur_note_state_dtl_listRec.rmks1%>
<%= cur_note_state_dtl_listRec.rmks2%>
<%= cur_note_state_dtl_listRec.comp_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 26 14:14:08 KST 2018 */