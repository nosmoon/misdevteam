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


public class FC_FUNC_4023_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_4023_LDataSet(){}
	public FC_FUNC_4023_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_4023_LCURLISTRecord rec = new FC_FUNC_4023_LCURLISTRecord();
			rec.recp_dt = Util.checkString(rset0.getString("recp_dt"));
			rec.bgn_no = Util.checkString(rset0.getString("bgn_no"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.now_note_stat_cd = Util.checkString(rset0.getString("now_note_stat_cd"));
			rec.now_note_stat_dt = Util.checkString(rset0.getString("now_note_stat_dt"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			rec.patr_budg_cd = Util.checkString(rset0.getString("patr_budg_cd"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset0.getString("rmks2"));
			rec.setoff_yn = Util.checkString(rset0.getString("setoff_yn"));
			rec.curacct_clsf_cd = Util.checkString(rset0.getString("curacct_clsf_cd"));
			rec.issu_clsf_cd = Util.checkString(rset0.getString("issu_clsf_cd"));
			rec.incm_tax = Util.checkString(rset0.getString("incm_tax"));
			rec.res_tax = Util.checkString(rset0.getString("res_tax"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.eestnm = Util.checkString(rset0.getString("eestnm"));
			rec.compgbnm = Util.checkString(rset0.getString("compgbnm"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.ysnm = Util.checkString(rset0.getString("ysnm"));
			rec.djgbnm = Util.checkString(rset0.getString("djgbnm"));
			rec.bhgbnm = Util.checkString(rset0.getString("bhgbnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_4023_LDataSet ds = (FC_FUNC_4023_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_4023_LCURLISTRecord curlistRec = (FC_FUNC_4023_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.recp_dt%>
<%= curlistRec.bgn_no%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.now_note_stat_dt%>
<%= curlistRec.note_amt%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.bank_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_no%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.patr_budg_cd%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.setoff_yn%>
<%= curlistRec.curacct_clsf_cd%>
<%= curlistRec.issu_clsf_cd%>
<%= curlistRec.incm_tax%>
<%= curlistRec.res_tax%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_pers_ipadd%>
<%= curlistRec.eestnm%>
<%= curlistRec.compgbnm%>
<%= curlistRec.compnm%>
<%= curlistRec.banknm%>
<%= curlistRec.ysnm%>
<%= curlistRec.djgbnm%>
<%= curlistRec.bhgbnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 17:09:49 KST 2009 */