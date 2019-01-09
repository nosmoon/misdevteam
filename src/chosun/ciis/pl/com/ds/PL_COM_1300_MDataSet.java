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


package chosun.ciis.pl.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.rec.*;

/**
 * 
 */


public class PL_COM_1300_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList crdt_ptcrcur = new ArrayList();
	public ArrayList acct_mang_nocur = new ArrayList();
	public ArrayList note_clsf_cdcur = new ArrayList();
	public ArrayList dr_ptcrcur = new ArrayList();
	public ArrayList issu_cmpy_clsf_cdcur = new ArrayList();
	public ArrayList rcpm_typecur = new ArrayList();
	public ArrayList rcpm_ptcrlist = new ArrayList();
	public ArrayList budg_clsfcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String gurt_amt;

	public PL_COM_1300_MDataSet(){}
	public PL_COM_1300_MDataSet(String errcode, String errmsg, String gurt_amt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.gurt_amt = gurt_amt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setGurt_amt(String gurt_amt){
		this.gurt_amt = gurt_amt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getGurt_amt(){
		return this.gurt_amt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.gurt_amt = Util.checkString(cstmt.getString(9));
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			PL_COM_1300_MRCPM_TYPECURRecord rec = new PL_COM_1300_MRCPM_TYPECURRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.rcpm_typecur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			PL_COM_1300_MACCT_MANG_NOCURRecord rec = new PL_COM_1300_MACCT_MANG_NOCURRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			this.acct_mang_nocur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			PL_COM_1300_MNOTE_CLSF_CDCURRecord rec = new PL_COM_1300_MNOTE_CLSF_CDCURRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			this.note_clsf_cdcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			PL_COM_1300_MISSU_CMPY_CLSF_CDCURRecord rec = new PL_COM_1300_MISSU_CMPY_CLSF_CDCURRecord();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset6.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset6.getString("cdabrvnm_cd"));
			this.issu_cmpy_clsf_cdcur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(14);
		while(rset7.next()){
			PL_COM_1300_MBUDG_CLSFCURRecord rec = new PL_COM_1300_MBUDG_CLSFCURRecord();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset7.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset7.getString("cdabrvnm_cd"));
			this.budg_clsfcur.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(15);
		while(rset8.next()){
			PL_COM_1300_MRCPM_PTCRLISTRecord rec = new PL_COM_1300_MRCPM_PTCRLISTRecord();
			rec.rcpm_dt = Util.checkString(rset8.getString("rcpm_dt"));
			rec.dlco_clsf_nm = Util.checkString(rset8.getString("dlco_clsf_nm"));
			rec.dlco_cd = Util.checkString(rset8.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset8.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset8.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset8.getString("dlco_abrv_nm"));
			rec.amt = Util.checkString(rset8.getString("amt"));
			rec.rcpm_shet_no = Util.checkString(rset8.getString("rcpm_shet_no"));
			rec.occr_dt = Util.checkString(rset8.getString("occr_dt"));
			rec.slip_clsf = Util.checkString(rset8.getString("slip_clsf"));
			rec.seq = Util.checkString(rset8.getString("seq"));
			rec.dd_clos_yn = Util.checkString(rset8.getString("dd_clos_yn"));
			rec.gurt_amt = Util.checkString(rset8.getString("gurt_amt"));
			this.rcpm_ptcrlist.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(16);
		while(rset9.next()){
			PL_COM_1300_MDR_PTCRCURRecord rec = new PL_COM_1300_MDR_PTCRCURRecord();
			rec.rcpm_type = Util.checkString(rset9.getString("rcpm_type"));
			rec.amt = Util.checkString(rset9.getString("amt"));
			rec.rmtt_dt = Util.checkString(rset9.getString("rmtt_dt"));
			rec.rmtt_plac = Util.checkString(rset9.getString("rmtt_plac"));
			rec.acct_mang_no = Util.checkString(rset9.getString("acct_mang_no"));
			rec.note_no = Util.checkString(rset9.getString("note_no"));
			rec.note_clsf_cd = Util.checkString(rset9.getString("note_clsf_cd"));
			rec.bank_cd = Util.checkString(rset9.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset9.getString("bank_nm"));
			rec.issu_pers_nm = Util.checkString(rset9.getString("issu_pers_nm"));
			rec.issu_cmpy_clsf_cd = Util.checkString(rset9.getString("issu_cmpy_clsf_cd"));
			rec.comp_dt = Util.checkString(rset9.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset9.getString("mtry_dt"));
			rec.slip_clsf = Util.checkString(rset9.getString("slip_clsf"));
			rec.seq = Util.checkString(rset9.getString("seq"));
			rec.subseq = Util.checkString(rset9.getString("subseq"));
			rec.dd_clos_yn = Util.checkString(rset9.getString("dd_clos_yn"));
			rec.remk = Util.checkString(rset9.getString("remk"));
			this.dr_ptcrcur.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(17);
		while(rset10.next()){
			PL_COM_1300_MCRDT_PTCRCURRecord rec = new PL_COM_1300_MCRDT_PTCRCURRecord();
			rec.budg_clsf = Util.checkString(rset10.getString("budg_clsf"));
			rec.basi_yymm = Util.checkString(rset10.getString("basi_yymm"));
			rec.amt = Util.checkString(rset10.getString("amt"));
			rec.slip_clsf = Util.checkString(rset10.getString("slip_clsf"));
			rec.seq = Util.checkString(rset10.getString("seq"));
			rec.subseq = Util.checkString(rset10.getString("subseq"));
			rec.dd_clos_yn = Util.checkString(rset10.getString("dd_clos_yn"));
			rec.remk = Util.checkString(rset10.getString("remk"));
			this.crdt_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_COM_1300_MDataSet ds = (PL_COM_1300_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rcpm_typecur.size(); i++){
		PL_COM_1300_MRCPM_TYPECURRecord rcpm_typecurRec = (PL_COM_1300_MRCPM_TYPECURRecord)ds.rcpm_typecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.acct_mang_nocur.size(); i++){
		PL_COM_1300_MACCT_MANG_NOCURRecord acct_mang_nocurRec = (PL_COM_1300_MACCT_MANG_NOCURRecord)ds.acct_mang_nocur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.note_clsf_cdcur.size(); i++){
		PL_COM_1300_MNOTE_CLSF_CDCURRecord note_clsf_cdcurRec = (PL_COM_1300_MNOTE_CLSF_CDCURRecord)ds.note_clsf_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.issu_cmpy_clsf_cdcur.size(); i++){
		PL_COM_1300_MISSU_CMPY_CLSF_CDCURRecord issu_cmpy_clsf_cdcurRec = (PL_COM_1300_MISSU_CMPY_CLSF_CDCURRecord)ds.issu_cmpy_clsf_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.budg_clsfcur.size(); i++){
		PL_COM_1300_MBUDG_CLSFCURRecord budg_clsfcurRec = (PL_COM_1300_MBUDG_CLSFCURRecord)ds.budg_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rcpm_ptcrlist.size(); i++){
		PL_COM_1300_MRCPM_PTCRLISTRecord rcpm_ptcrlistRec = (PL_COM_1300_MRCPM_PTCRLISTRecord)ds.rcpm_ptcrlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dr_ptcrcur.size(); i++){
		PL_COM_1300_MDR_PTCRCURRecord dr_ptcrcurRec = (PL_COM_1300_MDR_PTCRCURRecord)ds.dr_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.crdt_ptcrcur.size(); i++){
		PL_COM_1300_MCRDT_PTCRCURRecord crdt_ptcrcurRec = (PL_COM_1300_MCRDT_PTCRCURRecord)ds.crdt_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getGurt_amt()%>
<%= ds.getRcpm_typecur()%>
<%= ds.getAcct_mang_nocur()%>
<%= ds.getNote_clsf_cdcur()%>
<%= ds.getIssu_cmpy_clsf_cdcur()%>
<%= ds.getBudg_clsfcur()%>
<%= ds.getRcpm_ptcrlist()%>
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
<%= rcpm_ptcrlistRec.rcpm_dt%>
<%= rcpm_ptcrlistRec.dlco_clsf_nm%>
<%= rcpm_ptcrlistRec.dlco_cd%>
<%= rcpm_ptcrlistRec.dlco_seq%>
<%= rcpm_ptcrlistRec.dlco_nm%>
<%= rcpm_ptcrlistRec.dlco_abrv_nm%>
<%= rcpm_ptcrlistRec.amt%>
<%= rcpm_ptcrlistRec.rcpm_shet_no%>
<%= rcpm_ptcrlistRec.occr_dt%>
<%= rcpm_ptcrlistRec.slip_clsf%>
<%= rcpm_ptcrlistRec.seq%>
<%= rcpm_ptcrlistRec.dd_clos_yn%>
<%= rcpm_ptcrlistRec.gurt_amt%>
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
<%= crdt_ptcrcurRec.budg_clsf%>
<%= crdt_ptcrcurRec.basi_yymm%>
<%= crdt_ptcrcurRec.amt%>
<%= crdt_ptcrcurRec.slip_clsf%>
<%= crdt_ptcrcurRec.seq%>
<%= crdt_ptcrcurRec.subseq%>
<%= crdt_ptcrcurRec.dd_clos_yn%>
<%= crdt_ptcrcurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 22 20:01:20 KST 2009 */