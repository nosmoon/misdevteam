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


public class PL_RCP_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList crdt_ptcrcur = new ArrayList();
	public ArrayList acct_mang_nocur = new ArrayList();
	public ArrayList note_clsf_cdcur = new ArrayList();
	public ArrayList dr_ptcrcur = new ArrayList();
	public ArrayList issu_cmpy_clsf_cdcur = new ArrayList();
	public ArrayList rcpm_typecur = new ArrayList();
	public ArrayList budg_clsfcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_1000_MDataSet(){}
	public PL_RCP_1000_MDataSet(String errcode, String errmsg){
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

		ResultSet rset3 = (ResultSet) cstmt.getObject(5);
		while(rset3.next()){
			PL_RCP_1000_MRCPM_TYPECURRecord rec = new PL_RCP_1000_MRCPM_TYPECURRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.rcpm_typecur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(6);
		while(rset4.next()){
			PL_RCP_1000_MACCT_MANG_NOCURRecord rec = new PL_RCP_1000_MACCT_MANG_NOCURRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			this.acct_mang_nocur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(7);
		while(rset5.next()){
			PL_RCP_1000_MNOTE_CLSF_CDCURRecord rec = new PL_RCP_1000_MNOTE_CLSF_CDCURRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			this.note_clsf_cdcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(8);
		while(rset6.next()){
			PL_RCP_1000_MISSU_CMPY_CLSF_CDCURRecord rec = new PL_RCP_1000_MISSU_CMPY_CLSF_CDCURRecord();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset6.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset6.getString("cdabrvnm_cd"));
			this.issu_cmpy_clsf_cdcur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(9);
		while(rset7.next()){
			PL_RCP_1000_MBUDG_CLSFCURRecord rec = new PL_RCP_1000_MBUDG_CLSFCURRecord();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset7.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset7.getString("cdabrvnm_cd"));
			this.budg_clsfcur.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(10);
		while(rset8.next()){
			PL_RCP_1000_MDR_PTCRCURRecord rec = new PL_RCP_1000_MDR_PTCRCURRecord();
			rec.rcpm_type = Util.checkString(rset8.getString("rcpm_type"));
			rec.amt = Util.checkString(rset8.getString("amt"));
			rec.rmtt_dt = Util.checkString(rset8.getString("rmtt_dt"));
			rec.rmtt_plac = Util.checkString(rset8.getString("rmtt_plac"));
			rec.acct_mang_no = Util.checkString(rset8.getString("acct_mang_no"));
			rec.note_no = Util.checkString(rset8.getString("note_no"));
			rec.note_clsf_cd = Util.checkString(rset8.getString("note_clsf_cd"));
			rec.bank_cd = Util.checkString(rset8.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset8.getString("bank_nm"));
			rec.issu_pers_nm = Util.checkString(rset8.getString("issu_pers_nm"));
			rec.issu_cmpy_clsf_cd = Util.checkString(rset8.getString("issu_cmpy_clsf_cd"));
			rec.comp_dt = Util.checkString(rset8.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset8.getString("mtry_dt"));
			rec.slip_clsf = Util.checkString(rset8.getString("slip_clsf"));
			rec.seq = Util.checkString(rset8.getString("seq"));
			rec.subseq = Util.checkString(rset8.getString("subseq"));
			rec.dd_clos_yn = Util.checkString(rset8.getString("dd_clos_yn"));
			rec.remk = Util.checkString(rset8.getString("remk"));
			rec.biz_reg_no = Util.checkString(rset8.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset8.getString("bank_id"));
			rec.acct_num = Util.checkString(rset8.getString("acct_num"));
			rec.tran_date = Util.checkString(rset8.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset8.getString("tran_date_seq"));
			this.dr_ptcrcur.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(11);
		while(rset9.next()){
			PL_RCP_1000_MCRDT_PTCRCURRecord rec = new PL_RCP_1000_MCRDT_PTCRCURRecord();
			rec.budg_clsf = Util.checkString(rset9.getString("budg_clsf"));
			rec.basi_yymm = Util.checkString(rset9.getString("basi_yymm"));
			rec.amt = Util.checkString(rset9.getString("amt"));
			rec.slip_clsf = Util.checkString(rset9.getString("slip_clsf"));
			rec.seq = Util.checkString(rset9.getString("seq"));
			rec.subseq = Util.checkString(rset9.getString("subseq"));
			rec.dd_clos_yn = Util.checkString(rset9.getString("dd_clos_yn"));
			rec.remk = Util.checkString(rset9.getString("remk"));
			this.crdt_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_RCP_1000_MDataSet ds = (PL_RCP_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rcpm_typecur.size(); i++){
		PL_RCP_1000_MRCPM_TYPECURRecord rcpm_typecurRec = (PL_RCP_1000_MRCPM_TYPECURRecord)ds.rcpm_typecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.acct_mang_nocur.size(); i++){
		PL_RCP_1000_MACCT_MANG_NOCURRecord acct_mang_nocurRec = (PL_RCP_1000_MACCT_MANG_NOCURRecord)ds.acct_mang_nocur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.note_clsf_cdcur.size(); i++){
		PL_RCP_1000_MNOTE_CLSF_CDCURRecord note_clsf_cdcurRec = (PL_RCP_1000_MNOTE_CLSF_CDCURRecord)ds.note_clsf_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.issu_cmpy_clsf_cdcur.size(); i++){
		PL_RCP_1000_MISSU_CMPY_CLSF_CDCURRecord issu_cmpy_clsf_cdcurRec = (PL_RCP_1000_MISSU_CMPY_CLSF_CDCURRecord)ds.issu_cmpy_clsf_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.budg_clsfcur.size(); i++){
		PL_RCP_1000_MBUDG_CLSFCURRecord budg_clsfcurRec = (PL_RCP_1000_MBUDG_CLSFCURRecord)ds.budg_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dr_ptcrcur.size(); i++){
		PL_RCP_1000_MDR_PTCRCURRecord dr_ptcrcurRec = (PL_RCP_1000_MDR_PTCRCURRecord)ds.dr_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.crdt_ptcrcur.size(); i++){
		PL_RCP_1000_MCRDT_PTCRCURRecord crdt_ptcrcurRec = (PL_RCP_1000_MCRDT_PTCRCURRecord)ds.crdt_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRcpm_typecur()%>
<%= ds.getAcct_mang_nocur()%>
<%= ds.getNote_clsf_cdcur()%>
<%= ds.getIssu_cmpy_clsf_cdcur()%>
<%= ds.getBudg_clsfcur()%>
<%= ds.getDr_ptcrcur()%>
<%= ds.getCrdt_ptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rcpm_typecurRec.cd%>
<%= rcpm_typecurRec.cdnm%>
<%= rcpm_typecurRec.cd_abrv_nm%>
<%= rcpm_typecurRec.cdnm_cd%>
<%= rcpm_typecurRec.cdabrvnm_cd%>
<%= acct_mang_nocurRec.cd%>
<%= acct_mang_nocurRec.cdnm%>
<%= acct_mang_nocurRec.cd_abrv_nm%>
<%= note_clsf_cdcurRec.cd%>
<%= note_clsf_cdcurRec.cdnm%>
<%= note_clsf_cdcurRec.cd_abrv_nm%>
<%= issu_cmpy_clsf_cdcurRec.cd%>
<%= issu_cmpy_clsf_cdcurRec.cdnm%>
<%= issu_cmpy_clsf_cdcurRec.cd_abrv_nm%>
<%= issu_cmpy_clsf_cdcurRec.cdnm_cd%>
<%= issu_cmpy_clsf_cdcurRec.cdabrvnm_cd%>
<%= budg_clsfcurRec.cd%>
<%= budg_clsfcurRec.cdnm%>
<%= budg_clsfcurRec.cd_abrv_nm%>
<%= budg_clsfcurRec.cdnm_cd%>
<%= budg_clsfcurRec.cdabrvnm_cd%>
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