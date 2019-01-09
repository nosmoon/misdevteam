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


public class FC_ACCT_2120_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dlco_clsf_cd_curlist = new ArrayList();
	public ArrayList elec_tax_comp_cd = new ArrayList();
	public ArrayList g2_note_clsf_curlist = new ArrayList();
	public ArrayList prof_kind_curlist = new ArrayList();
	public ArrayList g2_issu_cmpy_cd_curlist = new ArrayList();
	public ArrayList g2_rcpm_acct_curlist = new ArrayList();
	public ArrayList erplace_cd_curlist = new ArrayList();
	public ArrayList rcpm_shet_kind_curlist = new ArrayList();
	public ArrayList g1_mang_clsf_curlist = new ArrayList();
	public ArrayList slip_clsf_curlist = new ArrayList();
	public ArrayList g1_frcr_clsf_curlist = new ArrayList();
	public ArrayList g3_whco_slip_clsf_curlist = new ArrayList();
	public ArrayList medi_cd_curlist = new ArrayList();
	public ArrayList chnl_clsf_cd_curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2120_MDataSet(){}
	public FC_ACCT_2120_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			FC_ACCT_2120_MMEDI_CD_CURLISTRecord rec = new FC_ACCT_2120_MMEDI_CD_CURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.medi_cd_curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			FC_ACCT_2120_MDLCO_CLSF_CD_CURLISTRecord rec = new FC_ACCT_2120_MDLCO_CLSF_CD_CURLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.dlco_clsf_cd_curlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			FC_ACCT_2120_MPROF_KIND_CURLISTRecord rec = new FC_ACCT_2120_MPROF_KIND_CURLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.prof_kind_curlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			FC_ACCT_2120_MSLIP_CLSF_CURLISTRecord rec = new FC_ACCT_2120_MSLIP_CLSF_CURLISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.slip_clsf_curlist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			FC_ACCT_2120_MERPLACE_CD_CURLISTRecord rec = new FC_ACCT_2120_MERPLACE_CD_CURLISTRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.erplace_cd_curlist.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(9);
		while(rset5.next()){
			FC_ACCT_2120_MRCPM_SHET_KIND_CURLISTRecord rec = new FC_ACCT_2120_MRCPM_SHET_KIND_CURLISTRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset5.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset5.getString("cdabrvnm_cd"));
			this.rcpm_shet_kind_curlist.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(10);
		while(rset6.next()){
			FC_ACCT_2120_MG1_MANG_CLSF_CURLISTRecord rec = new FC_ACCT_2120_MG1_MANG_CLSF_CURLISTRecord();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset6.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset6.getString("cdabrvnm_cd"));
			this.g1_mang_clsf_curlist.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(11);
		while(rset7.next()){
			FC_ACCT_2120_MG1_FRCR_CLSF_CURLISTRecord rec = new FC_ACCT_2120_MG1_FRCR_CLSF_CURLISTRecord();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset7.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset7.getString("cdabrvnm_cd"));
			this.g1_frcr_clsf_curlist.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(12);
		while(rset8.next()){
			FC_ACCT_2120_MG2_NOTE_CLSF_CURLISTRecord rec = new FC_ACCT_2120_MG2_NOTE_CLSF_CURLISTRecord();
			rec.cd = Util.checkString(rset8.getString("cd"));
			rec.cdnm = Util.checkString(rset8.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset8.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset8.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset8.getString("cdabrvnm_cd"));
			this.g2_note_clsf_curlist.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(13);
		while(rset9.next()){
			FC_ACCT_2120_MG2_ISSU_CMPY_CD_CURLISTRecord rec = new FC_ACCT_2120_MG2_ISSU_CMPY_CD_CURLISTRecord();
			rec.cd = Util.checkString(rset9.getString("cd"));
			rec.cdnm = Util.checkString(rset9.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset9.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset9.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset9.getString("cdabrvnm_cd"));
			this.g2_issu_cmpy_cd_curlist.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(14);
		while(rset10.next()){
			FC_ACCT_2120_MG2_RCPM_ACCT_CURLISTRecord rec = new FC_ACCT_2120_MG2_RCPM_ACCT_CURLISTRecord();
			rec.cd = Util.checkString(rset10.getString("cd"));
			rec.cdnm = Util.checkString(rset10.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset10.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset10.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset10.getString("cdabrvnm_cd"));
			this.g2_rcpm_acct_curlist.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(15);
		while(rset11.next()){
			FC_ACCT_2120_MG3_WHCO_SLIP_CLSF_CURLISTRecord rec = new FC_ACCT_2120_MG3_WHCO_SLIP_CLSF_CURLISTRecord();
			rec.cd = Util.checkString(rset11.getString("cd"));
			rec.cdnm = Util.checkString(rset11.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset11.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset11.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset11.getString("cdabrvnm_cd"));
			this.g3_whco_slip_clsf_curlist.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(16);
		while(rset12.next()){
			FC_ACCT_2120_MELEC_TAX_COMP_CDRecord rec = new FC_ACCT_2120_MELEC_TAX_COMP_CDRecord();
			rec.cd = Util.checkString(rset12.getString("cd"));
			rec.cdnm = Util.checkString(rset12.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset12.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset12.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset12.getString("cdabrvnm_cd"));
			this.elec_tax_comp_cd.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(17);
		while(rset13.next()){
			FC_ACCT_2120_MCHNL_CLSF_CD_CURLISTRecord rec = new FC_ACCT_2120_MCHNL_CLSF_CD_CURLISTRecord();
			rec.cd = Util.checkString(rset13.getString("cd"));
			rec.cdnm = Util.checkString(rset13.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset13.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset13.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset13.getString("cdabrvnm_cd"));
			this.chnl_clsf_cd_curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2120_MDataSet ds = (FC_ACCT_2120_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medi_cd_curlist.size(); i++){
		FC_ACCT_2120_MMEDI_CD_CURLISTRecord medi_cd_curlistRec = (FC_ACCT_2120_MMEDI_CD_CURLISTRecord)ds.medi_cd_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlco_clsf_cd_curlist.size(); i++){
		FC_ACCT_2120_MDLCO_CLSF_CD_CURLISTRecord dlco_clsf_cd_curlistRec = (FC_ACCT_2120_MDLCO_CLSF_CD_CURLISTRecord)ds.dlco_clsf_cd_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.prof_kind_curlist.size(); i++){
		FC_ACCT_2120_MPROF_KIND_CURLISTRecord prof_kind_curlistRec = (FC_ACCT_2120_MPROF_KIND_CURLISTRecord)ds.prof_kind_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.slip_clsf_curlist.size(); i++){
		FC_ACCT_2120_MSLIP_CLSF_CURLISTRecord slip_clsf_curlistRec = (FC_ACCT_2120_MSLIP_CLSF_CURLISTRecord)ds.slip_clsf_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.erplace_cd_curlist.size(); i++){
		FC_ACCT_2120_MERPLACE_CD_CURLISTRecord erplace_cd_curlistRec = (FC_ACCT_2120_MERPLACE_CD_CURLISTRecord)ds.erplace_cd_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rcpm_shet_kind_curlist.size(); i++){
		FC_ACCT_2120_MRCPM_SHET_KIND_CURLISTRecord rcpm_shet_kind_curlistRec = (FC_ACCT_2120_MRCPM_SHET_KIND_CURLISTRecord)ds.rcpm_shet_kind_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.g1_mang_clsf_curlist.size(); i++){
		FC_ACCT_2120_MG1_MANG_CLSF_CURLISTRecord g1_mang_clsf_curlistRec = (FC_ACCT_2120_MG1_MANG_CLSF_CURLISTRecord)ds.g1_mang_clsf_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.g1_frcr_clsf_curlist.size(); i++){
		FC_ACCT_2120_MG1_FRCR_CLSF_CURLISTRecord g1_frcr_clsf_curlistRec = (FC_ACCT_2120_MG1_FRCR_CLSF_CURLISTRecord)ds.g1_frcr_clsf_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.g2_note_clsf_curlist.size(); i++){
		FC_ACCT_2120_MG2_NOTE_CLSF_CURLISTRecord g2_note_clsf_curlistRec = (FC_ACCT_2120_MG2_NOTE_CLSF_CURLISTRecord)ds.g2_note_clsf_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.g2_issu_cmpy_cd_curlist.size(); i++){
		FC_ACCT_2120_MG2_ISSU_CMPY_CD_CURLISTRecord g2_issu_cmpy_cd_curlistRec = (FC_ACCT_2120_MG2_ISSU_CMPY_CD_CURLISTRecord)ds.g2_issu_cmpy_cd_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.g2_rcpm_acct_curlist.size(); i++){
		FC_ACCT_2120_MG2_RCPM_ACCT_CURLISTRecord g2_rcpm_acct_curlistRec = (FC_ACCT_2120_MG2_RCPM_ACCT_CURLISTRecord)ds.g2_rcpm_acct_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.g3_whco_slip_clsf_curlist.size(); i++){
		FC_ACCT_2120_MG3_WHCO_SLIP_CLSF_CURLISTRecord g3_whco_slip_clsf_curlistRec = (FC_ACCT_2120_MG3_WHCO_SLIP_CLSF_CURLISTRecord)ds.g3_whco_slip_clsf_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.elec_tax_comp_cd.size(); i++){
		FC_ACCT_2120_MELEC_TAX_COMP_CDRecord elec_tax_comp_cdRec = (FC_ACCT_2120_MELEC_TAX_COMP_CDRecord)ds.elec_tax_comp_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.chnl_clsf_cd_curlist.size(); i++){
		FC_ACCT_2120_MCHNL_CLSF_CD_CURLISTRecord chnl_clsf_cd_curlistRec = (FC_ACCT_2120_MCHNL_CLSF_CD_CURLISTRecord)ds.chnl_clsf_cd_curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cd_curlist()%>
<%= ds.getDlco_clsf_cd_curlist()%>
<%= ds.getProf_kind_curlist()%>
<%= ds.getSlip_clsf_curlist()%>
<%= ds.getErplace_cd_curlist()%>
<%= ds.getRcpm_shet_kind_curlist()%>
<%= ds.getG1_mang_clsf_curlist()%>
<%= ds.getG1_frcr_clsf_curlist()%>
<%= ds.getG2_note_clsf_curlist()%>
<%= ds.getG2_issu_cmpy_cd_curlist()%>
<%= ds.getG2_rcpm_acct_curlist()%>
<%= ds.getG3_whco_slip_clsf_curlist()%>
<%= ds.getElec_tax_comp_cd()%>
<%= ds.getChnl_clsf_cd_curlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medi_cd_curlistRec.cd%>
<%= medi_cd_curlistRec.cdnm%>
<%= medi_cd_curlistRec.cd_abrv_nm%>
<%= medi_cd_curlistRec.cdnm_cd%>
<%= medi_cd_curlistRec.cdabrvnm_cd%>
<%= dlco_clsf_cd_curlistRec.cd%>
<%= dlco_clsf_cd_curlistRec.cdnm%>
<%= dlco_clsf_cd_curlistRec.cd_abrv_nm%>
<%= dlco_clsf_cd_curlistRec.cdnm_cd%>
<%= dlco_clsf_cd_curlistRec.cdabrvnm_cd%>
<%= prof_kind_curlistRec.cd%>
<%= prof_kind_curlistRec.cdnm%>
<%= prof_kind_curlistRec.cd_abrv_nm%>
<%= prof_kind_curlistRec.cdnm_cd%>
<%= prof_kind_curlistRec.cdabrvnm_cd%>
<%= slip_clsf_curlistRec.cd%>
<%= slip_clsf_curlistRec.cdnm%>
<%= slip_clsf_curlistRec.cd_abrv_nm%>
<%= slip_clsf_curlistRec.cdnm_cd%>
<%= slip_clsf_curlistRec.cdabrvnm_cd%>
<%= erplace_cd_curlistRec.cd%>
<%= erplace_cd_curlistRec.cdnm%>
<%= erplace_cd_curlistRec.cd_abrv_nm%>
<%= erplace_cd_curlistRec.cdnm_cd%>
<%= erplace_cd_curlistRec.cdabrvnm_cd%>
<%= rcpm_shet_kind_curlistRec.cd%>
<%= rcpm_shet_kind_curlistRec.cdnm%>
<%= rcpm_shet_kind_curlistRec.cd_abrv_nm%>
<%= rcpm_shet_kind_curlistRec.cdnm_cd%>
<%= rcpm_shet_kind_curlistRec.cdabrvnm_cd%>
<%= g1_mang_clsf_curlistRec.cd%>
<%= g1_mang_clsf_curlistRec.cdnm%>
<%= g1_mang_clsf_curlistRec.cd_abrv_nm%>
<%= g1_mang_clsf_curlistRec.cdnm_cd%>
<%= g1_mang_clsf_curlistRec.cdabrvnm_cd%>
<%= g1_frcr_clsf_curlistRec.cd%>
<%= g1_frcr_clsf_curlistRec.cdnm%>
<%= g1_frcr_clsf_curlistRec.cd_abrv_nm%>
<%= g1_frcr_clsf_curlistRec.cdnm_cd%>
<%= g1_frcr_clsf_curlistRec.cdabrvnm_cd%>
<%= g2_note_clsf_curlistRec.cd%>
<%= g2_note_clsf_curlistRec.cdnm%>
<%= g2_note_clsf_curlistRec.cd_abrv_nm%>
<%= g2_note_clsf_curlistRec.cdnm_cd%>
<%= g2_note_clsf_curlistRec.cdabrvnm_cd%>
<%= g2_issu_cmpy_cd_curlistRec.cd%>
<%= g2_issu_cmpy_cd_curlistRec.cdnm%>
<%= g2_issu_cmpy_cd_curlistRec.cd_abrv_nm%>
<%= g2_issu_cmpy_cd_curlistRec.cdnm_cd%>
<%= g2_issu_cmpy_cd_curlistRec.cdabrvnm_cd%>
<%= g2_rcpm_acct_curlistRec.cd%>
<%= g2_rcpm_acct_curlistRec.cdnm%>
<%= g2_rcpm_acct_curlistRec.cd_abrv_nm%>
<%= g2_rcpm_acct_curlistRec.cdnm_cd%>
<%= g2_rcpm_acct_curlistRec.cdabrvnm_cd%>
<%= g3_whco_slip_clsf_curlistRec.cd%>
<%= g3_whco_slip_clsf_curlistRec.cdnm%>
<%= g3_whco_slip_clsf_curlistRec.cd_abrv_nm%>
<%= g3_whco_slip_clsf_curlistRec.cdnm_cd%>
<%= g3_whco_slip_clsf_curlistRec.cdabrvnm_cd%>
<%= elec_tax_comp_cdRec.cd%>
<%= elec_tax_comp_cdRec.cdnm%>
<%= elec_tax_comp_cdRec.cd_abrv_nm%>
<%= elec_tax_comp_cdRec.cdnm_cd%>
<%= elec_tax_comp_cdRec.cdabrvnm_cd%>
<%= chnl_clsf_cd_curlistRec.cd%>
<%= chnl_clsf_cd_curlistRec.cdnm%>
<%= chnl_clsf_cd_curlistRec.cd_abrv_nm%>
<%= chnl_clsf_cd_curlistRec.cdnm_cd%>
<%= chnl_clsf_cd_curlistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 17 19:23:40 KST 2014 */