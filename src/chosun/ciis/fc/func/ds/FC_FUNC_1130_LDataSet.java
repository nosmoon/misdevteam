/***************************************************************************************************
* 파일명 : SP_CO_L_RDRCRTS_GRAD_APLC.java
* 기능 :  독자-독자인증요청 조회
* 작성일자 : 2004-05-17
* 작성자 : 전현표
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
 * 독자-독자인증요청 조회
 */

public class FC_FUNC_1130_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList note_stat_list = new ArrayList();
	public ArrayList note_stat = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1130_LDataSet(){}
	public FC_FUNC_1130_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_FUNC_1130_LNOTE_STATRecord rec = new FC_FUNC_1130_LNOTE_STATRecord();
			rec.now_note_stat_cd = Util.checkString(rset0.getString("now_note_stat_cd"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.issu_cmpy_clsf_cd = Util.checkString(rset0.getString("issu_cmpy_clsf_cd"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.now_note_stat_nm = Util.checkString(rset0.getString("now_note_stat_nm"));
			rec.issu_cmpy_clsf_nm = Util.checkString(rset0.getString("issu_cmpy_clsf_nm"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			this.note_stat.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			FC_FUNC_1130_LNOTE_STAT_LISTRecord rec = new FC_FUNC_1130_LNOTE_STAT_LISTRecord();
			rec.stat_dt = Util.checkString(rset1.getString("stat_dt"));
			rec.stat_cd = Util.checkString(rset1.getString("stat_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.stat_nm = Util.checkString(rset1.getString("stat_nm"));
			rec.dlco_clsf_nm = Util.checkString(rset1.getString("dlco_clsf_nm"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset1.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset1.getString("slip_arow_no"));
			this.note_stat_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1130_LDataSet ds = (FC_FUNC_1130_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.note_stat.size(); i++){
		FC_FUNC_1130_LNOTE_STATRecord note_statRec = (FC_FUNC_1130_LNOTE_STATRecord)ds.note_stat.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.note_stat_list.size(); i++){
		FC_FUNC_1130_LNOTE_STAT_LISTRecord note_stat_listRec = (FC_FUNC_1130_LNOTE_STAT_LISTRecord)ds.note_stat_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getNote_stat()%>
<%= ds.getNote_stat_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= note_statRec.now_note_stat_cd%>
<%= note_statRec.note_amt%>
<%= note_statRec.comp_dt%>
<%= note_statRec.mtry_dt%>
<%= note_statRec.issu_cmpy_clsf_cd%>
<%= note_statRec.issu_pers_nm%>
<%= note_statRec.dlco_clsf_cd%>
<%= note_statRec.dlco_cd%>
<%= note_statRec.bank_nm%>
<%= note_statRec.now_note_stat_nm%>
<%= note_statRec.issu_cmpy_clsf_nm%>
<%= note_statRec.compnm%>
<%= note_stat_listRec.stat_dt%>
<%= note_stat_listRec.stat_cd%>
<%= note_stat_listRec.dlco_clsf_cd%>
<%= note_stat_listRec.dlco_cd%>
<%= note_stat_listRec.stat_nm%>
<%= note_stat_listRec.dlco_clsf_nm%>
<%= note_stat_listRec.dlco_nm%>
<%= note_stat_listRec.slip_occr_dt%>
<%= note_stat_listRec.slip_clsf_cd%>
<%= note_stat_listRec.slip_seq%>
<%= note_stat_listRec.slip_sub_seq%>
<%= note_stat_listRec.slip_arow_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 03 17:07:41 KST 2009 */