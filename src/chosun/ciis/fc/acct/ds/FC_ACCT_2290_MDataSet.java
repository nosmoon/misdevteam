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


public class FC_ACCT_2290_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_whco_ndstb_cd_list = new ArrayList();
	public ArrayList dlco_clsf_cd_curlist = new ArrayList();
	public ArrayList cur_budgmangcd_list = new ArrayList();
	public ArrayList cur_dlco_clsf_list = new ArrayList();
	public ArrayList mang_clsf_curlist = new ArrayList();
	public ArrayList slip_clsf_curlist = new ArrayList();
	public ArrayList cur_mang_item_cd_list = new ArrayList();
	public ArrayList cur_prof_type_list = new ArrayList();
	public ArrayList frcr_clsf_curlist = new ArrayList();
	public ArrayList cur_erplace_cd_list = new ArrayList();
	public ArrayList medi_cd_curlist = new ArrayList();
	public ArrayList note_stat_curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2290_MDataSet(){}
	public FC_ACCT_2290_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2290_MMEDI_CD_CURLISTRecord rec = new FC_ACCT_2290_MMEDI_CD_CURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.medi_cd_curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2290_MMANG_CLSF_CURLISTRecord rec = new FC_ACCT_2290_MMANG_CLSF_CURLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.mang_clsf_curlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_2290_MDLCO_CLSF_CD_CURLISTRecord rec = new FC_ACCT_2290_MDLCO_CLSF_CD_CURLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.dlco_clsf_cd_curlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_ACCT_2290_MNOTE_STAT_CURLISTRecord rec = new FC_ACCT_2290_MNOTE_STAT_CURLISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.note_stat_curlist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_ACCT_2290_MFRCR_CLSF_CURLISTRecord rec = new FC_ACCT_2290_MFRCR_CLSF_CURLISTRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.frcr_clsf_curlist.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			FC_ACCT_2290_MSLIP_CLSF_CURLISTRecord rec = new FC_ACCT_2290_MSLIP_CLSF_CURLISTRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset5.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset5.getString("cdabrvnm_cd"));
			this.slip_clsf_curlist.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			FC_ACCT_2290_MCUR_PROF_TYPE_LISTRecord rec = new FC_ACCT_2290_MCUR_PROF_TYPE_LISTRecord();
			rec.cd_nm = Util.checkString(rset6.getString("cd_nm"));
			rec.cd = Util.checkString(rset6.getString("cd"));
			this.cur_prof_type_list.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(12);
		while(rset7.next()){
			FC_ACCT_2290_MCUR_ERPLACE_CD_LISTRecord rec = new FC_ACCT_2290_MCUR_ERPLACE_CD_LISTRecord();
			rec.cd_nm = Util.checkString(rset7.getString("cd_nm"));
			rec.cd = Util.checkString(rset7.getString("cd"));
			this.cur_erplace_cd_list.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(13);
		while(rset8.next()){
			FC_ACCT_2290_MCUR_MANG_ITEM_CD_LISTRecord rec = new FC_ACCT_2290_MCUR_MANG_ITEM_CD_LISTRecord();
			rec.mang_item_cd = Util.checkString(rset8.getString("mang_item_cd"));
			rec.drcr_clsf = Util.checkString(rset8.getString("drcr_clsf"));
			this.cur_mang_item_cd_list.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(14);
		while(rset9.next()){
			FC_ACCT_2290_MCUR_DLCO_CLSF_LISTRecord rec = new FC_ACCT_2290_MCUR_DLCO_CLSF_LISTRecord();
			rec.cd = Util.checkString(rset9.getString("cd"));
			rec.cdnm = Util.checkString(rset9.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset9.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset9.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset9.getString("cdabrvnm_cd"));
			this.cur_dlco_clsf_list.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(15);
		while(rset10.next()){
			FC_ACCT_2290_MCUR_BUDGMANGCD_LISTRecord rec = new FC_ACCT_2290_MCUR_BUDGMANGCD_LISTRecord();
			rec.cd = Util.checkString(rset10.getString("cd"));
			rec.cdnm = Util.checkString(rset10.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset10.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset10.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset10.getString("cdabrvnm_cd"));
			this.cur_budgmangcd_list.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(16);
		while(rset11.next()){
			FC_ACCT_2290_MCUR_WHCO_NDSTB_CD_LISTRecord rec = new FC_ACCT_2290_MCUR_WHCO_NDSTB_CD_LISTRecord();
			rec.whco_ndstb_cd = Util.checkString(rset11.getString("whco_ndstb_cd"));
			rec.whco_comn_cost_yn = Util.checkString(rset11.getString("whco_comn_cost_yn"));
			this.cur_whco_ndstb_cd_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2290_MDataSet ds = (FC_ACCT_2290_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medi_cd_curlist.size(); i++){
		FC_ACCT_2290_MMEDI_CD_CURLISTRecord medi_cd_curlistRec = (FC_ACCT_2290_MMEDI_CD_CURLISTRecord)ds.medi_cd_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.mang_clsf_curlist.size(); i++){
		FC_ACCT_2290_MMANG_CLSF_CURLISTRecord mang_clsf_curlistRec = (FC_ACCT_2290_MMANG_CLSF_CURLISTRecord)ds.mang_clsf_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlco_clsf_cd_curlist.size(); i++){
		FC_ACCT_2290_MDLCO_CLSF_CD_CURLISTRecord dlco_clsf_cd_curlistRec = (FC_ACCT_2290_MDLCO_CLSF_CD_CURLISTRecord)ds.dlco_clsf_cd_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.note_stat_curlist.size(); i++){
		FC_ACCT_2290_MNOTE_STAT_CURLISTRecord note_stat_curlistRec = (FC_ACCT_2290_MNOTE_STAT_CURLISTRecord)ds.note_stat_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.frcr_clsf_curlist.size(); i++){
		FC_ACCT_2290_MFRCR_CLSF_CURLISTRecord frcr_clsf_curlistRec = (FC_ACCT_2290_MFRCR_CLSF_CURLISTRecord)ds.frcr_clsf_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.slip_clsf_curlist.size(); i++){
		FC_ACCT_2290_MSLIP_CLSF_CURLISTRecord slip_clsf_curlistRec = (FC_ACCT_2290_MSLIP_CLSF_CURLISTRecord)ds.slip_clsf_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_prof_type_list.size(); i++){
		FC_ACCT_2290_MCUR_PROF_TYPE_LISTRecord cur_prof_type_listRec = (FC_ACCT_2290_MCUR_PROF_TYPE_LISTRecord)ds.cur_prof_type_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_erplace_cd_list.size(); i++){
		FC_ACCT_2290_MCUR_ERPLACE_CD_LISTRecord cur_erplace_cd_listRec = (FC_ACCT_2290_MCUR_ERPLACE_CD_LISTRecord)ds.cur_erplace_cd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_mang_item_cd_list.size(); i++){
		FC_ACCT_2290_MCUR_MANG_ITEM_CD_LISTRecord cur_mang_item_cd_listRec = (FC_ACCT_2290_MCUR_MANG_ITEM_CD_LISTRecord)ds.cur_mang_item_cd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_dlco_clsf_list.size(); i++){
		FC_ACCT_2290_MCUR_DLCO_CLSF_LISTRecord cur_dlco_clsf_listRec = (FC_ACCT_2290_MCUR_DLCO_CLSF_LISTRecord)ds.cur_dlco_clsf_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_budgmangcd_list.size(); i++){
		FC_ACCT_2290_MCUR_BUDGMANGCD_LISTRecord cur_budgmangcd_listRec = (FC_ACCT_2290_MCUR_BUDGMANGCD_LISTRecord)ds.cur_budgmangcd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_whco_ndstb_cd_list.size(); i++){
		FC_ACCT_2290_MCUR_WHCO_NDSTB_CD_LISTRecord cur_whco_ndstb_cd_listRec = (FC_ACCT_2290_MCUR_WHCO_NDSTB_CD_LISTRecord)ds.cur_whco_ndstb_cd_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cd_curlist()%>
<%= ds.getMang_clsf_curlist()%>
<%= ds.getDlco_clsf_cd_curlist()%>
<%= ds.getNote_stat_curlist()%>
<%= ds.getFrcr_clsf_curlist()%>
<%= ds.getSlip_clsf_curlist()%>
<%= ds.getCur_prof_type_list()%>
<%= ds.getCur_erplace_cd_list()%>
<%= ds.getCur_mang_item_cd_list()%>
<%= ds.getCur_dlco_clsf_list()%>
<%= ds.getCur_budgmangcd_list()%>
<%= ds.getCur_whco_ndstb_cd_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medi_cd_curlistRec.cd%>
<%= medi_cd_curlistRec.cdnm%>
<%= medi_cd_curlistRec.cd_abrv_nm%>
<%= medi_cd_curlistRec.cdnm_cd%>
<%= medi_cd_curlistRec.cdabrvnm_cd%>
<%= mang_clsf_curlistRec.cd%>
<%= mang_clsf_curlistRec.cdnm%>
<%= mang_clsf_curlistRec.cd_abrv_nm%>
<%= mang_clsf_curlistRec.cdnm_cd%>
<%= mang_clsf_curlistRec.cdabrvnm_cd%>
<%= dlco_clsf_cd_curlistRec.cd%>
<%= dlco_clsf_cd_curlistRec.cdnm%>
<%= dlco_clsf_cd_curlistRec.cd_abrv_nm%>
<%= dlco_clsf_cd_curlistRec.cdnm_cd%>
<%= dlco_clsf_cd_curlistRec.cdabrvnm_cd%>
<%= note_stat_curlistRec.cd%>
<%= note_stat_curlistRec.cdnm%>
<%= note_stat_curlistRec.cd_abrv_nm%>
<%= note_stat_curlistRec.cdnm_cd%>
<%= note_stat_curlistRec.cdabrvnm_cd%>
<%= frcr_clsf_curlistRec.cd%>
<%= frcr_clsf_curlistRec.cdnm%>
<%= frcr_clsf_curlistRec.cd_abrv_nm%>
<%= frcr_clsf_curlistRec.cdnm_cd%>
<%= frcr_clsf_curlistRec.cdabrvnm_cd%>
<%= slip_clsf_curlistRec.cd%>
<%= slip_clsf_curlistRec.cdnm%>
<%= slip_clsf_curlistRec.cd_abrv_nm%>
<%= slip_clsf_curlistRec.cdnm_cd%>
<%= slip_clsf_curlistRec.cdabrvnm_cd%>
<%= cur_prof_type_listRec.cd_nm%>
<%= cur_prof_type_listRec.cd%>
<%= cur_erplace_cd_listRec.cd_nm%>
<%= cur_erplace_cd_listRec.cd%>
<%= cur_mang_item_cd_listRec.mang_item_cd%>
<%= cur_mang_item_cd_listRec.drcr_clsf%>
<%= cur_dlco_clsf_listRec.cd%>
<%= cur_dlco_clsf_listRec.cdnm%>
<%= cur_dlco_clsf_listRec.cd_abrv_nm%>
<%= cur_dlco_clsf_listRec.cdnm_cd%>
<%= cur_dlco_clsf_listRec.cdabrvnm_cd%>
<%= cur_budgmangcd_listRec.cd%>
<%= cur_budgmangcd_listRec.cdnm%>
<%= cur_budgmangcd_listRec.cd_abrv_nm%>
<%= cur_budgmangcd_listRec.cdnm_cd%>
<%= cur_budgmangcd_listRec.cdabrvnm_cd%>
<%= cur_whco_ndstb_cd_listRec.whco_ndstb_cd%>
<%= cur_whco_ndstb_cd_listRec.whco_comn_cost_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 29 15:53:13 KST 2009 */