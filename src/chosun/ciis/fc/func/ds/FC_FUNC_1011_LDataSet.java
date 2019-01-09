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


public class FC_FUNC_1011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1011_LDataSet(){}
	public FC_FUNC_1011_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_1011_LCURLISTRecord rec = new FC_FUNC_1011_LCURLISTRecord();
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
			rec.bank_cd_nm = Util.checkString(rset0.getString("bank_cd_nm"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.rcpm_acct_nm = Util.checkString(rset0.getString("rcpm_acct_nm"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.rcpm_acct = Util.checkString(rset0.getString("rcpm_acct"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1011_LDataSet ds = (FC_FUNC_1011_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1011_LCURLISTRecord curlistRec = (FC_FUNC_1011_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rcpm_dt%>
<%= curlistRec.rcpm_slip_clsf_cd%>
<%= curlistRec.rcpm_seq%>
<%= curlistRec.rcpm_sub_seq%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.note_amt%>
<%= curlistRec.pay_plac_cd%>
<%= curlistRec.note_clehous_cd%>
<%= curlistRec.issu_cmpy_clsf_cd%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.now_note_stat_dt%>
<%= curlistRec.fisc_aprv_stat%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.chg_pers%>
<%= curlistRec.incmg_pers_ipadd%>
<%= curlistRec.bank_cd_nm%>
<%= curlistRec.compnm%>
<%= curlistRec.rcpm_acct_nm%>
<%= curlistRec.bank_cd%>
<%= curlistRec.rcpm_acct%>
<%= curlistRec.slip_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 09:53:31 KST 2009 */