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


public class FC_ACCT_2080_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_whco_ndstb_cd_list = new ArrayList();
	public ArrayList cur_mang_item_cd_list = new ArrayList();
	public ArrayList cur_incm_clsf_list = new ArrayList();
	public ArrayList cur_erplace_cd_list = new ArrayList();
	public ArrayList cur_prof_type_list = new ArrayList();
	public ArrayList cur_budgmangcd_list = new ArrayList();
	public ArrayList cur_slip_clsf_list = new ArrayList();
	public ArrayList cur_dlco_clsf_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2080_MDataSet(){}
	public FC_ACCT_2080_MDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_ACCT_2080_MCUR_INCM_CLSF_LISTRecord rec = new FC_ACCT_2080_MCUR_INCM_CLSF_LISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.cur_incm_clsf_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			FC_ACCT_2080_MCUR_PROF_TYPE_LISTRecord rec = new FC_ACCT_2080_MCUR_PROF_TYPE_LISTRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.cur_prof_type_list.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			FC_ACCT_2080_MCUR_ERPLACE_CD_LISTRecord rec = new FC_ACCT_2080_MCUR_ERPLACE_CD_LISTRecord();
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.cur_erplace_cd_list.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			FC_ACCT_2080_MCUR_SLIP_CLSF_LISTRecord rec = new FC_ACCT_2080_MCUR_SLIP_CLSF_LISTRecord();
			rec.cd_nm = Util.checkString(rset3.getString("cd_nm"));
			rec.cd = Util.checkString(rset3.getString("cd"));
			this.cur_slip_clsf_list.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			FC_ACCT_2080_MCUR_DLCO_CLSF_LISTRecord rec = new FC_ACCT_2080_MCUR_DLCO_CLSF_LISTRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			this.cur_dlco_clsf_list.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			FC_ACCT_2080_MCUR_WHCO_NDSTB_CD_LISTRecord rec = new FC_ACCT_2080_MCUR_WHCO_NDSTB_CD_LISTRecord();
			rec.whco_ndstb_cd = Util.checkString(rset5.getString("whco_ndstb_cd"));
			rec.whco_comn_cost_yn = Util.checkString(rset5.getString("whco_comn_cost_yn"));
			this.cur_whco_ndstb_cd_list.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			FC_ACCT_2080_MCUR_MANG_ITEM_CD_LISTRecord rec = new FC_ACCT_2080_MCUR_MANG_ITEM_CD_LISTRecord();
			rec.mang_item_cd = Util.checkString(rset6.getString("mang_item_cd"));
			rec.drcr_clsf = Util.checkString(rset6.getString("drcr_clsf"));
			this.cur_mang_item_cd_list.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(14);
		while(rset7.next()){
			FC_ACCT_2080_MCUR_BUDGMANGCD_LISTRecord rec = new FC_ACCT_2080_MCUR_BUDGMANGCD_LISTRecord();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			this.cur_budgmangcd_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2080_MDataSet ds = (FC_ACCT_2080_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_incm_clsf_list.size(); i++){
		FC_ACCT_2080_MCUR_INCM_CLSF_LISTRecord cur_incm_clsf_listRec = (FC_ACCT_2080_MCUR_INCM_CLSF_LISTRecord)ds.cur_incm_clsf_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_prof_type_list.size(); i++){
		FC_ACCT_2080_MCUR_PROF_TYPE_LISTRecord cur_prof_type_listRec = (FC_ACCT_2080_MCUR_PROF_TYPE_LISTRecord)ds.cur_prof_type_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_erplace_cd_list.size(); i++){
		FC_ACCT_2080_MCUR_ERPLACE_CD_LISTRecord cur_erplace_cd_listRec = (FC_ACCT_2080_MCUR_ERPLACE_CD_LISTRecord)ds.cur_erplace_cd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_slip_clsf_list.size(); i++){
		FC_ACCT_2080_MCUR_SLIP_CLSF_LISTRecord cur_slip_clsf_listRec = (FC_ACCT_2080_MCUR_SLIP_CLSF_LISTRecord)ds.cur_slip_clsf_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_dlco_clsf_list.size(); i++){
		FC_ACCT_2080_MCUR_DLCO_CLSF_LISTRecord cur_dlco_clsf_listRec = (FC_ACCT_2080_MCUR_DLCO_CLSF_LISTRecord)ds.cur_dlco_clsf_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_whco_ndstb_cd_list.size(); i++){
		FC_ACCT_2080_MCUR_WHCO_NDSTB_CD_LISTRecord cur_whco_ndstb_cd_listRec = (FC_ACCT_2080_MCUR_WHCO_NDSTB_CD_LISTRecord)ds.cur_whco_ndstb_cd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_mang_item_cd_list.size(); i++){
		FC_ACCT_2080_MCUR_MANG_ITEM_CD_LISTRecord cur_mang_item_cd_listRec = (FC_ACCT_2080_MCUR_MANG_ITEM_CD_LISTRecord)ds.cur_mang_item_cd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_budgmangcd_list.size(); i++){
		FC_ACCT_2080_MCUR_BUDGMANGCD_LISTRecord cur_budgmangcd_listRec = (FC_ACCT_2080_MCUR_BUDGMANGCD_LISTRecord)ds.cur_budgmangcd_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_incm_clsf_list()%>
<%= ds.getCur_prof_type_list()%>
<%= ds.getCur_erplace_cd_list()%>
<%= ds.getCur_slip_clsf_list()%>
<%= ds.getCur_dlco_clsf_list()%>
<%= ds.getCur_whco_ndstb_cd_list()%>
<%= ds.getCur_mang_item_cd_list()%>
<%= ds.getCur_budgmangcd_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_incm_clsf_listRec.cd_nm%>
<%= cur_incm_clsf_listRec.cd%>
<%= cur_prof_type_listRec.cd_nm%>
<%= cur_prof_type_listRec.cd%>
<%= cur_erplace_cd_listRec.cd_nm%>
<%= cur_erplace_cd_listRec.cd%>
<%= cur_slip_clsf_listRec.cd_nm%>
<%= cur_slip_clsf_listRec.cd%>
<%= cur_dlco_clsf_listRec.cd%>
<%= cur_dlco_clsf_listRec.cdnm%>
<%= cur_dlco_clsf_listRec.cd_abrv_nm%>
<%= cur_whco_ndstb_cd_listRec.whco_ndstb_cd%>
<%= cur_whco_ndstb_cd_listRec.whco_comn_cost_yn%>
<%= cur_mang_item_cd_listRec.mang_item_cd%>
<%= cur_mang_item_cd_listRec.drcr_clsf%>
<%= cur_budgmangcd_listRec.cd%>
<%= cur_budgmangcd_listRec.cdnm%>
<%= cur_budgmangcd_listRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 20 21:07:42 KST 2009 */