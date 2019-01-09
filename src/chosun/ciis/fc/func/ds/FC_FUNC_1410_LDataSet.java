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


public class FC_FUNC_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1410_LDataSet(){}
	public FC_FUNC_1410_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_1410_LCURLISTRecord rec = new FC_FUNC_1410_LCURLISTRecord();
			rec.note_clsf_cd_nm2 = Util.checkString(rset1.getString("note_clsf_cd_nm2"));
			rec.note_full_no = Util.checkString(rset1.getString("note_full_no"));
			rec.note_amt = Util.checkString(rset1.getString("note_amt"));
			rec.bank_cd_nm = Util.checkString(rset1.getString("bank_cd_nm"));
			rec.rcpm_acct_nm2 = Util.checkString(rset1.getString("rcpm_acct_nm2"));
			rec.slipno = Util.checkString(rset1.getString("slipno"));
			rec.comp_dt = Util.checkString(rset1.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.issu_pers_nm = Util.checkString(rset1.getString("issu_pers_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.compnm = Util.checkString(rset1.getString("compnm"));
			rec.now_note_stat_cd2 = Util.checkString(rset1.getString("now_note_stat_cd2"));
			rec.sale_aprv_no = Util.checkString(rset1.getString("sale_aprv_no"));
			rec.coms = Util.checkString(rset1.getString("coms"));
			rec.note_clsf_cd = Util.checkString(rset1.getString("note_clsf_cd"));
			rec.note_no = Util.checkString(rset1.getString("note_no"));
			rec.note_seq = Util.checkString(rset1.getString("note_seq"));
			rec.bank_cd = Util.checkString(rset1.getString("bank_cd"));
			rec.rcpm_acct = Util.checkString(rset1.getString("rcpm_acct"));
			rec.rcpm_acct_nm = Util.checkString(rset1.getString("rcpm_acct_nm"));
			rec.now_note_stat_cd = Util.checkString(rset1.getString("now_note_stat_cd"));
			rec.now_note_stat_cd_nm = Util.checkString(rset1.getString("now_note_stat_cd_nm"));
			rec.note_clsf_cd_nm = Util.checkString(rset1.getString("note_clsf_cd_nm"));
			rec.rcpay_amt = Util.checkString(rset1.getString("rcpay_amt"));
			rec.corp_tax = Util.checkString(rset1.getString("corp_tax"));
			rec.etc_prft = Util.checkString(rset1.getString("etc_prft"));
			rec.es_dlco_clsf_cd = Util.checkString(rset1.getString("es_dlco_clsf_cd"));
			rec.es_dlco_cd = Util.checkString(rset1.getString("es_dlco_cd"));
			rec.escompnm = Util.checkString(rset1.getString("escompnm"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset1.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset1.getString("slip_arow_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1410_LDataSet ds = (FC_FUNC_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1410_LCURLISTRecord curlistRec = (FC_FUNC_1410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.note_clsf_cd_nm2%>
<%= curlistRec.note_full_no%>
<%= curlistRec.note_amt%>
<%= curlistRec.bank_cd_nm%>
<%= curlistRec.rcpm_acct_nm2%>
<%= curlistRec.slipno%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.compnm%>
<%= curlistRec.now_note_stat_cd2%>
<%= curlistRec.sale_aprv_no%>
<%= curlistRec.coms%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.note_no%>
<%= curlistRec.note_seq%>
<%= curlistRec.bank_cd%>
<%= curlistRec.rcpm_acct%>
<%= curlistRec.rcpm_acct_nm%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.now_note_stat_cd_nm%>
<%= curlistRec.note_clsf_cd_nm%>
<%= curlistRec.rcpay_amt%>
<%= curlistRec.corp_tax%>
<%= curlistRec.etc_prft%>
<%= curlistRec.es_dlco_clsf_cd%>
<%= curlistRec.es_dlco_cd%>
<%= curlistRec.escompnm%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 15:51:43 KST 2009 */