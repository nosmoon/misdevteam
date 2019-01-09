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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6011_LDataSet(){}
	public FC_ACCT_6011_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			FC_ACCT_6011_LCURLIST1Record rec = new FC_ACCT_6011_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.occr_slip_occr_dt = Util.checkString(rset0.getString("occr_slip_occr_dt"));
			rec.occr_slip_clsf_cd = Util.checkString(rset0.getString("occr_slip_clsf_cd"));
			rec.occr_slip_seq = Util.checkString(rset0.getString("occr_slip_seq"));
			rec.occr_slip_sub_seq = Util.checkString(rset0.getString("occr_slip_sub_seq"));
			rec.occr_slip_arow_no = Util.checkString(rset0.getString("occr_slip_arow_no"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.erplace_cd = Util.checkString(rset0.getString("erplace_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.tax_stmt_aprv_yn = Util.checkString(rset0.getString("tax_stmt_aprv_yn"));
			rec.decl_yn = Util.checkString(rset0.getString("decl_yn"));
			rec.decl_qq = Util.checkString(rset0.getString("decl_qq"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.deal_clsf = Util.checkString(rset0.getString("deal_clsf"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.bizcond = Util.checkString(rset0.getString("bizcond"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.canc_yn = Util.checkString(rset0.getString("canc_yn"));
			rec.canc_dt = Util.checkString(rset0.getString("canc_dt"));
			rec.del_resn = Util.checkString(rset0.getString("del_resn"));
			rec.elec_tax_bill_yn = Util.checkString(rset0.getString("elec_tax_bill_yn"));
			rec.elec_tax_issu_dt = Util.checkString(rset0.getString("elec_tax_issu_dt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.incmg_pgm_id = Util.checkString(rset0.getString("incmg_pgm_id"));
			rec.semuro_no = Util.checkString(rset0.getString("semuro_no"));
			rec.elec_tax_comp_cd = Util.checkString(rset0.getString("elec_tax_comp_cd"));
			rec.elec_tax_comp_cd_nm = Util.checkString(rset0.getString("elec_tax_comp_cd_nm"));
			rec.email_id = Util.checkString(rset0.getString("email_id"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_cd_nm = Util.checkString(rset0.getString("budg_cd_nm"));
			rec.biz_plc_cd = Util.checkString(rset0.getString("biz_plc_cd"));
			rec.remk1 = Util.checkString(rset0.getString("remk1"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(12);
		while(rset1.next()){
			FC_ACCT_6011_LCURLIST2Record rec = new FC_ACCT_6011_LCURLIST2Record();
			rec.slip_arow_no = Util.checkString(rset1.getString("slip_arow_no"));
			rec.mmdd = Util.checkString(rset1.getString("mmdd"));
			rec.item = Util.checkString(rset1.getString("item"));
			rec.std = Util.checkString(rset1.getString("std"));
			rec.qunt = Util.checkString(rset1.getString("qunt"));
			rec.uprc = Util.checkString(rset1.getString("uprc"));
			rec.suply_amt = Util.checkString(rset1.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset1.getString("vat_amt"));
			rec.incmg_pgm_id = Util.checkString(rset1.getString("incmg_pgm_id"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6011_LDataSet ds = (FC_ACCT_6011_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_6011_LCURLIST1Record curlist1Rec = (FC_ACCT_6011_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_6011_LCURLIST2Record curlist2Rec = (FC_ACCT_6011_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.prof_type_cd%>
<%= curlist1Rec.slip_clsf_cd%>
<%= curlist1Rec.slip_occr_dt%>
<%= curlist1Rec.slip_seq%>
<%= curlist1Rec.occr_slip_occr_dt%>
<%= curlist1Rec.occr_slip_clsf_cd%>
<%= curlist1Rec.occr_slip_seq%>
<%= curlist1Rec.occr_slip_sub_seq%>
<%= curlist1Rec.occr_slip_arow_no%>
<%= curlist1Rec.make_dt%>
<%= curlist1Rec.erplace_cd%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.suply_amt%>
<%= curlist1Rec.vat_amt%>
<%= curlist1Rec.tax_stmt_aprv_yn%>
<%= curlist1Rec.decl_yn%>
<%= curlist1Rec.decl_qq%>
<%= curlist1Rec.fisc_dt%>
<%= curlist1Rec.deal_clsf%>
<%= curlist1Rec.ern%>
<%= curlist1Rec.presi_nm%>
<%= curlist1Rec.addr%>
<%= curlist1Rec.bizcond%>
<%= curlist1Rec.item%>
<%= curlist1Rec.canc_yn%>
<%= curlist1Rec.canc_dt%>
<%= curlist1Rec.del_resn%>
<%= curlist1Rec.elec_tax_bill_yn%>
<%= curlist1Rec.elec_tax_issu_dt%>
<%= curlist1Rec.slip_no%>
<%= curlist1Rec.incmg_pgm_id%>
<%= curlist1Rec.semuro_no%>
<%= curlist1Rec.elec_tax_comp_cd%>
<%= curlist1Rec.elec_tax_comp_cd_nm%>
<%= curlist1Rec.email_id%>
<%= curlist1Rec.budg_cd%>
<%= curlist1Rec.budg_cd_nm%>
<%= curlist1Rec.biz_plc_cd%>
<%= curlist1Rec.remk1%>
<%= curlist2Rec.slip_arow_no%>
<%= curlist2Rec.mmdd%>
<%= curlist2Rec.item%>
<%= curlist2Rec.std%>
<%= curlist2Rec.qunt%>
<%= curlist2Rec.uprc%>
<%= curlist2Rec.suply_amt%>
<%= curlist2Rec.vat_amt%>
<%= curlist2Rec.incmg_pgm_id%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 03 14:22:18 KST 2018 */