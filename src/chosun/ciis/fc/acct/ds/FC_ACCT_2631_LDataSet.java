/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-채권채무대상조회 (목록조회)
* 작성일자 : 2014.12.29
* 작성자 : 이혁
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


public class FC_ACCT_2631_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long tot_dr_amt;
	public long tot_crdt_amt;
	public long tot_diff_amt;
	public long chk_dr_amt;
	public long chk_crdt_amt;
	public long chk_diff_amt;
	public String max_closym;

	public FC_ACCT_2631_LDataSet(){}
	public FC_ACCT_2631_LDataSet(String errcode, String errmsg, long tot_dr_amt, long tot_crdt_amt, long tot_diff_amt, long chk_dr_amt, long chk_crdt_amt, long chk_diff_amt, String max_closym){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tot_dr_amt = tot_dr_amt;
		this.tot_crdt_amt = tot_crdt_amt;
		this.tot_diff_amt = tot_diff_amt;
		this.chk_dr_amt = chk_dr_amt;
		this.chk_crdt_amt = chk_crdt_amt;
		this.chk_diff_amt = chk_diff_amt;
		this.max_closym = max_closym;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTot_dr_amt(long tot_dr_amt){
		this.tot_dr_amt = tot_dr_amt;
	}

	public void setTot_crdt_amt(long tot_crdt_amt){
		this.tot_crdt_amt = tot_crdt_amt;
	}

	public void setTot_diff_amt(long tot_diff_amt){
		this.tot_diff_amt = tot_diff_amt;
	}

	public void setChk_dr_amt(long chk_dr_amt){
		this.chk_dr_amt = chk_dr_amt;
	}

	public void setChk_crdt_amt(long chk_crdt_amt){
		this.chk_crdt_amt = chk_crdt_amt;
	}

	public void setChk_diff_amt(long chk_diff_amt){
		this.chk_diff_amt = chk_diff_amt;
	}

	public void setMax_closym(String max_closym){
		this.max_closym = max_closym;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTot_dr_amt(){
		return this.tot_dr_amt;
	}

	public long getTot_crdt_amt(){
		return this.tot_crdt_amt;
	}

	public long getTot_diff_amt(){
		return this.tot_diff_amt;
	}

	public long getChk_dr_amt(){
		return this.chk_dr_amt;
	}

	public long getChk_crdt_amt(){
		return this.chk_crdt_amt;
	}

	public long getChk_diff_amt(){
		return this.chk_diff_amt;
	}
	
	public String getMax_closym(){
		return this.max_closym;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			FC_ACCT_2631_LCURLISTRecord rec = new FC_ACCT_2631_LCURLISTRecord();
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.dr_amt = rset0.getInt("dr_amt");
			rec.crdt_amt = rset0.getInt("crdt_amt");
			rec.mang_clsf_cd_nm = Util.checkString(rset0.getString("mang_clsf_cd_nm"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.clas_nm = Util.checkString(rset0.getString("clas_nm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.acct_nm = Util.checkString(rset0.getString("acct_nm"));
			rec.dlco_clsf_cd_nm = Util.checkString(rset0.getString("dlco_clsf_cd_nm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.boks_dlco_nm = Util.checkString(rset0.getString("boks_dlco_nm"));
			rec.medi_cd_nm = Util.checkString(rset0.getString("medi_cd_nm"));
			rec.dtls_medi_cdnm = Util.checkString(rset0.getString("dtls_medi_cdnm"));
			rec.evnt_cd_nm = Util.checkString(rset0.getString("evnt_cd_nm"));
			rec.clam_dept_cd_nm = Util.checkString(rset0.getString("clam_dept_cd_nm"));
			rec.obj_acct_cd_nm = Util.checkString(rset0.getString("obj_acct_cd_nm"));
			rec.obj_amt = rset0.getInt("obj_amt");
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.bank_cd_nm = Util.checkString(rset0.getString("bank_cd_nm"));
			rec.cfsobj_seq = Util.checkString(rset0.getString("cfsobj_seq"));
			rec.clos_clsf = Util.checkString(rset0.getString("clos_clsf"));
			rec.budg_clsf_cd = Util.checkString(rset0.getString("budg_clsf_cd"));
			this.curlist.add(rec);
		}
		this.tot_dr_amt = cstmt.getLong(14);
		this.tot_crdt_amt = cstmt.getLong(15);
		this.tot_diff_amt = cstmt.getLong(16);
		this.chk_dr_amt = cstmt.getLong(17);
		this.chk_crdt_amt = cstmt.getLong(18);
		this.chk_diff_amt = cstmt.getLong(19);
		this.max_closym = Util.checkString(cstmt.getString(20));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2631_LDataSet ds = (FC_ACCT_2631_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2631_LCURLISTRecord curlistRec = (FC_ACCT_2631_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getTot_dr_amt()%>
<%= ds.getTot_crdt_amt()%>
<%= ds.getTot_diff_amt()%>
<%= ds.getChk_dr_amt()%>
<%= ds.getChk_crdt_amt()%>
<%= ds.getChk_diff_amt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.fisc_dt%>
<%= curlistRec.slip_no%>
<%= curlistRec.rmks%>
<%= curlistRec.dr_amt%>
<%= curlistRec.crdt_amt%>
<%= curlistRec.mang_clsf_cd_nm%>
<%= curlistRec.mang_no%>
<%= curlistRec.clas_nm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.acct_cd%>
<%= curlistRec.acct_nm%>
<%= curlistRec.dlco_clsf_cd_nm%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.boks_dlco_nm%>
<%= curlistRec.medi_cd_nm%>
<%= curlistRec.dtls_medi_cdnm%>
<%= curlistRec.evnt_cd_nm%>
<%= curlistRec.clam_dept_cd_nm%>
<%= curlistRec.obj_acct_cd_nm%>
<%= curlistRec.obj_amt%>
<%= curlistRec.bank_cd%>
<%= curlistRec.bank_cd_nm%>
<%= curlistRec.cfsobj_seq%>
<%= curlistRec.clos_clsf%>
<%= curlistRec.budg_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 29 16:22:38 KST 2014 */