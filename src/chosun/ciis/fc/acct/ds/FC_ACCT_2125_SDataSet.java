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


public class FC_ACCT_2125_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2125_SDataSet(){}
	public FC_ACCT_2125_SDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_2125_SCURLISTRecord rec = new FC_ACCT_2125_SCURLISTRecord();
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			FC_ACCT_2125_SCURLIST1Record rec = new FC_ACCT_2125_SCURLIST1Record();
			rec.g1_rcpm_slip_seq = Util.checkString(rset1.getString("g1_rcpm_slip_seq"));
			rec.g1_rcpm_dt = Util.checkString(rset1.getString("g1_rcpm_dt"));
			rec.g1_rcpm_amt = Util.checkString(rset1.getString("g1_rcpm_amt"));
			rec.g1_rcpm_pers_nm = Util.checkString(rset1.getString("g1_rcpm_pers_nm"));
			rec.g1_deps_psbk = Util.checkString(rset1.getString("g1_deps_psbk"));
			rec.g1_coms = Util.checkString(rset1.getString("g1_coms"));
			rec.g1_frex_clsf = Util.checkString(rset1.getString("g1_frex_clsf"));
			rec.g1_exrate = Util.checkString(rset1.getString("g1_exrate"));
			rec.g1_frex_amt = Util.checkString(rset1.getString("g1_frex_amt"));
			rec.biz_reg_no = Util.checkString(rset1.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset1.getString("bank_id"));
			rec.acct_num = Util.checkString(rset1.getString("acct_num"));
			rec.tran_date_seq = Util.checkString(rset1.getString("tran_date_seq"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(11);
		while(rset2.next()){
			FC_ACCT_2125_SCURLIST2Record rec = new FC_ACCT_2125_SCURLIST2Record();
			rec.g2_rcpm_sub_seq = Util.checkString(rset2.getString("g2_rcpm_sub_seq"));
			rec.g2_note_no = Util.checkString(rset2.getString("g2_note_no"));
			rec.g2_rcpm_amt = Util.checkString(rset2.getString("g2_rcpm_amt"));
			rec.g2_note_clsf_cd = Util.checkString(rset2.getString("g2_note_clsf_cd"));
			rec.g2_bank_cd = Util.checkString(rset2.getString("g2_bank_cd"));
			rec.g2_bank_cd_nm = Util.checkString(rset2.getString("g2_bank_cd_nm"));
			rec.g2_issu_pers_nm = Util.checkString(rset2.getString("g2_issu_pers_nm"));
			rec.g2_issu_cmpy_clsf_cd = Util.checkString(rset2.getString("g2_issu_cmpy_clsf_cd"));
			rec.g2_comp_dt = Util.checkString(rset2.getString("g2_comp_dt"));
			rec.g2_mtry_dt = Util.checkString(rset2.getString("g2_mtry_dt"));
			rec.g2_rcpm_acct = Util.checkString(rset2.getString("g2_rcpm_acct"));
			rec.g2_sale_aprv_no = Util.checkString(rset2.getString("g2_sale_aprv_no"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(12);
		while(rset3.next()){
			FC_ACCT_2125_SCURLIST3Record rec = new FC_ACCT_2125_SCURLIST3Record();
			rec.g3_rcpm_sub_seq = Util.checkString(rset3.getString("g3_rcpm_sub_seq"));
			rec.g3_budg_cd = Util.checkString(rset3.getString("g3_budg_cd"));
			rec.g3_budg_cd_nm = Util.checkString(rset3.getString("g3_budg_cd_nm"));
			rec.g3_rcpm_amt = Util.checkString(rset3.getString("g3_rcpm_amt"));
			rec.g3_whco_slip_clsf = Util.checkString(rset3.getString("g3_whco_slip_clsf"));
			rec.g3_whco_slip_no = Util.checkString(rset3.getString("g3_whco_slip_no"));
			this.curlist3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(13);
		while(rset4.next()){
			FC_ACCT_2125_SCURLIST4Record rec = new FC_ACCT_2125_SCURLIST4Record();
			rec.rcpm_shet_kind = Util.checkString(rset4.getString("rcpm_shet_kind"));
			rec.rcpm_shet_no = Util.checkString(rset4.getString("rcpm_shet_no"));
			rec.rcpm_slip_no2 = Util.checkString(rset4.getString("rcpm_slip_no2"));
			rec.rcpm_amt = Util.checkString(rset4.getString("rcpm_amt"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2125_SDataSet ds = (FC_ACCT_2125_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2125_SCURLISTRecord curlistRec = (FC_ACCT_2125_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_2125_SCURLIST1Record curlist1Rec = (FC_ACCT_2125_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_2125_SCURLIST2Record curlist2Rec = (FC_ACCT_2125_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_ACCT_2125_SCURLIST3Record curlist3Rec = (FC_ACCT_2125_SCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		FC_ACCT_2125_SCURLIST4Record curlist4Rec = (FC_ACCT_2125_SCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.rcpm_amt%>
<%= curlist1Rec.g1_rcpm_slip_seq%>
<%= curlist1Rec.g1_rcpm_dt%>
<%= curlist1Rec.g1_rcpm_amt%>
<%= curlist1Rec.g1_rcpm_pers_nm%>
<%= curlist1Rec.g1_deps_psbk%>
<%= curlist1Rec.g1_coms%>
<%= curlist1Rec.g1_frex_clsf%>
<%= curlist1Rec.g1_exrate%>
<%= curlist1Rec.g1_frex_amt%>
<%= curlist1Rec.biz_reg_no%>
<%= curlist1Rec.bank_id%>
<%= curlist1Rec.acct_num%>
<%= curlist1Rec.tran_date_seq%>
<%= curlist2Rec.g2_rcpm_sub_seq%>
<%= curlist2Rec.g2_note_no%>
<%= curlist2Rec.g2_rcpm_amt%>
<%= curlist2Rec.g2_note_clsf_cd%>
<%= curlist2Rec.g2_bank_cd%>
<%= curlist2Rec.g2_bank_cd_nm%>
<%= curlist2Rec.g2_issu_pers_nm%>
<%= curlist2Rec.g2_issu_cmpy_clsf_cd%>
<%= curlist2Rec.g2_comp_dt%>
<%= curlist2Rec.g2_mtry_dt%>
<%= curlist2Rec.g2_rcpm_acct%>
<%= curlist2Rec.g2_sale_aprv_no%>
<%= curlist3Rec.g3_rcpm_sub_seq%>
<%= curlist3Rec.g3_budg_cd%>
<%= curlist3Rec.g3_budg_cd_nm%>
<%= curlist3Rec.g3_rcpm_amt%>
<%= curlist3Rec.g3_whco_slip_clsf%>
<%= curlist3Rec.g3_whco_slip_no%>
<%= curlist4Rec.rcpm_shet_kind%>
<%= curlist4Rec.rcpm_shet_no%>
<%= curlist4Rec.rcpm_slip_no2%>
<%= curlist4Rec.rcpm_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 15:33:11 KST 2009 */