/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.rcp.dm.*;
import chosun.ciis.pl.rcp.rec.*;

/**
 * 
 */


public class PL_RCP_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList crdt_ptcrcur = new ArrayList();
	public ArrayList closinfocur = new ArrayList();
	public ArrayList dr_ptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_1020_LDataSet(){}
	public PL_RCP_1020_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			PL_RCP_1020_LCLOSINFOCURRecord rec = new PL_RCP_1020_LCLOSINFOCURRecord();
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.medi_clsf_nm = Util.checkString(rset0.getString("medi_clsf_nm"));
			rec.basi_yymm = Util.checkString(rset0.getString("basi_yymm"));
			rec.cyov_bal = Util.checkString(rset0.getString("cyov_bal"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.thmm_bal = Util.checkString(rset0.getString("thmm_bal"));
			rec.meda_bal = Util.checkString(rset0.getString("meda_bal"));
			rec.tot_bal = Util.checkString(rset0.getString("tot_bal"));
			this.closinfocur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			PL_RCP_1020_LDR_PTCRCURRecord rec = new PL_RCP_1020_LDR_PTCRCURRecord();
			rec.rcpm_type = Util.checkString(rset1.getString("rcpm_type"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			rec.rmtt_dt = Util.checkString(rset1.getString("rmtt_dt"));
			rec.rmtt_plac = Util.checkString(rset1.getString("rmtt_plac"));
			rec.acct_mang_no = Util.checkString(rset1.getString("acct_mang_no"));
			rec.note_no = Util.checkString(rset1.getString("note_no"));
			rec.note_clsf_cd = Util.checkString(rset1.getString("note_clsf_cd"));
			rec.bank_cd = Util.checkString(rset1.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset1.getString("bank_nm"));
			rec.issu_pers_nm = Util.checkString(rset1.getString("issu_pers_nm"));
			rec.issu_cmpy_clsf_cd = Util.checkString(rset1.getString("issu_cmpy_clsf_cd"));
			rec.comp_dt = Util.checkString(rset1.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.slip_clsf = Util.checkString(rset1.getString("slip_clsf"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.subseq = Util.checkString(rset1.getString("subseq"));
			rec.dd_clos_yn = Util.checkString(rset1.getString("dd_clos_yn"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.biz_reg_no = Util.checkString(rset1.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset1.getString("bank_id"));
			rec.acct_num = Util.checkString(rset1.getString("acct_num"));
			rec.tran_date = Util.checkString(rset1.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset1.getString("tran_date_seq"));
			this.dr_ptcrcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(12);
		while(rset2.next()){
			PL_RCP_1020_LCRDT_PTCRCURRecord rec = new PL_RCP_1020_LCRDT_PTCRCURRecord();
			rec.budg_clsf = Util.checkString(rset2.getString("budg_clsf"));
			rec.basi_yymm = Util.checkString(rset2.getString("basi_yymm"));
			rec.amt = Util.checkString(rset2.getString("amt"));
			rec.slip_clsf = Util.checkString(rset2.getString("slip_clsf"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.subseq = Util.checkString(rset2.getString("subseq"));
			rec.dd_clos_yn = Util.checkString(rset2.getString("dd_clos_yn"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			this.crdt_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_RCP_1020_LDataSet ds = (PL_RCP_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.closinfocur.size(); i++){
		PL_RCP_1020_LCLOSINFOCURRecord closinfocurRec = (PL_RCP_1020_LCLOSINFOCURRecord)ds.closinfocur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dr_ptcrcur.size(); i++){
		PL_RCP_1020_LDR_PTCRCURRecord dr_ptcrcurRec = (PL_RCP_1020_LDR_PTCRCURRecord)ds.dr_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.crdt_ptcrcur.size(); i++){
		PL_RCP_1020_LCRDT_PTCRCURRecord crdt_ptcrcurRec = (PL_RCP_1020_LCRDT_PTCRCURRecord)ds.crdt_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClosinfocur()%>
<%= ds.getDr_ptcrcur()%>
<%= ds.getCrdt_ptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= closinfocurRec.medi_clsf%>
<%= closinfocurRec.medi_clsf_nm%>
<%= closinfocurRec.basi_yymm%>
<%= closinfocurRec.cyov_bal%>
<%= closinfocurRec.sale_amt%>
<%= closinfocurRec.rcpm_amt%>
<%= closinfocurRec.thmm_bal%>
<%= closinfocurRec.meda_bal%>
<%= closinfocurRec.tot_bal%>
<%= dr_ptcrcurRec.rcpm_type%>
<%= dr_ptcrcurRec.amt%>
<%= dr_ptcrcurRec.rmtt_dt%>
<%= dr_ptcrcurRec.rmtt_plac%>
<%= dr_ptcrcurRec.acct_mang_no%>
<%= dr_ptcrcurRec.note_no%>
<%= dr_ptcrcurRec.note_clsf_cd%>
<%= dr_ptcrcurRec.bank_cd%>
<%= dr_ptcrcurRec.bank_nm%>
<%= dr_ptcrcurRec.issu_pers_nm%>
<%= dr_ptcrcurRec.issu_cmpy_clsf_cd%>
<%= dr_ptcrcurRec.comp_dt%>
<%= dr_ptcrcurRec.mtry_dt%>
<%= dr_ptcrcurRec.slip_clsf%>
<%= dr_ptcrcurRec.seq%>
<%= dr_ptcrcurRec.subseq%>
<%= dr_ptcrcurRec.dd_clos_yn%>
<%= dr_ptcrcurRec.remk%>
<%= dr_ptcrcurRec.biz_reg_no%>
<%= dr_ptcrcurRec.bank_id%>
<%= dr_ptcrcurRec.acct_num%>
<%= dr_ptcrcurRec.tran_date%>
<%= dr_ptcrcurRec.tran_date_seq%>
<%= crdt_ptcrcurRec.budg_clsf%>
<%= crdt_ptcrcurRec.basi_yymm%>
<%= crdt_ptcrcurRec.amt%>
<%= crdt_ptcrcurRec.slip_clsf%>
<%= crdt_ptcrcurRec.seq%>
<%= crdt_ptcrcurRec.subseq%>
<%= crdt_ptcrcurRec.dd_clos_yn%>
<%= crdt_ptcrcurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 25 10:59:35 KST 2009 */