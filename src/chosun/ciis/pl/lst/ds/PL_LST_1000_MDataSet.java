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


package chosun.ciis.pl.lst.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.lst.dm.*;
import chosun.ciis.pl.lst.rec.*;

/**
 * 
 */


public class PL_LST_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sale_clsfcur = new ArrayList();
	public ArrayList absence_clsfcur = new ArrayList();
	public ArrayList decid_linecur = new ArrayList();
	public ArrayList medi_clsfcur = new ArrayList();
	public ArrayList deal_clsfcur = new ArrayList();
	public ArrayList ewh_clsfcur = new ArrayList();
	public ArrayList medi_cd_magzcur = new ArrayList();
	public ArrayList wh_cdcur = new ArrayList();
	public ArrayList dlco_clsfcur = new ArrayList();
	public ArrayList areacur = new ArrayList();
	public ArrayList sendclsfcur = new ArrayList();
	public ArrayList medi_cdcur = new ArrayList();
	public ArrayList issu_cmpycur = new ArrayList();
	public ArrayList medi_cd_bookcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_LST_1000_MDataSet(){}
	public PL_LST_1000_MDataSet(String errcode, String errmsg){
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
			PL_LST_1000_MMEDI_CLSFCURRecord rec = new PL_LST_1000_MMEDI_CLSFCURRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.medi_clsfcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			PL_LST_1000_MMEDI_CDCURRecord rec = new PL_LST_1000_MMEDI_CDCURRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.medi_cdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			PL_LST_1000_MDEAL_CLSFCURRecord rec = new PL_LST_1000_MDEAL_CLSFCURRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.deal_clsfcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			PL_LST_1000_MISSU_CMPYCURRecord rec = new PL_LST_1000_MISSU_CMPYCURRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.issu_cmpycur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			PL_LST_1000_MWH_CDCURRecord rec = new PL_LST_1000_MWH_CDCURRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.wh_cdcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			PL_LST_1000_MDLCO_CLSFCURRecord rec = new PL_LST_1000_MDLCO_CLSFCURRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset5.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset5.getString("cdabrvnm_cd"));
			this.dlco_clsfcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			PL_LST_1000_MAREACURRecord rec = new PL_LST_1000_MAREACURRecord();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset6.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset6.getString("cdabrvnm_cd"));
			this.areacur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(12);
		while(rset7.next()){
			PL_LST_1000_MSENDCLSFCURRecord rec = new PL_LST_1000_MSENDCLSFCURRecord();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset7.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset7.getString("cdabrvnm_cd"));
			this.sendclsfcur.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(13);
		while(rset8.next()){
			PL_LST_1000_MSALE_CLSFCURRecord rec = new PL_LST_1000_MSALE_CLSFCURRecord();
			rec.cd = Util.checkString(rset8.getString("cd"));
			rec.cdnm = Util.checkString(rset8.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset8.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset8.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset8.getString("cdabrvnm_cd"));
			this.sale_clsfcur.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(14);
		while(rset9.next()){
			PL_LST_1000_MABSENCE_CLSFCURRecord rec = new PL_LST_1000_MABSENCE_CLSFCURRecord();
			rec.cd = Util.checkString(rset9.getString("cd"));
			rec.cdnm = Util.checkString(rset9.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset9.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset9.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset9.getString("cdabrvnm_cd"));
			this.absence_clsfcur.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(15);
		while(rset10.next()){
			PL_LST_1000_MMEDI_CD_MAGZCURRecord rec = new PL_LST_1000_MMEDI_CD_MAGZCURRecord();
			rec.cd = Util.checkString(rset10.getString("cd"));
			rec.cdnm = Util.checkString(rset10.getString("cdnm"));
			this.medi_cd_magzcur.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(16);
		while(rset11.next()){
			PL_LST_1000_MMEDI_CD_BOOKCURRecord rec = new PL_LST_1000_MMEDI_CD_BOOKCURRecord();
			rec.cd = Util.checkString(rset11.getString("cd"));
			rec.cdnm = Util.checkString(rset11.getString("cdnm"));
			this.medi_cd_bookcur.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(17);
		while(rset12.next()){
			PL_LST_1000_MDECID_LINECURRecord rec = new PL_LST_1000_MDECID_LINECURRecord();
			rec.cd = Util.checkString(rset12.getString("cd"));
			rec.cdnm = Util.checkString(rset12.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset12.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset12.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset12.getString("cdabrvnm_cd"));
			this.decid_linecur.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(18);
		while(rset13.next()){
			PL_LST_1000_MEWH_CLSFCURRecord rec = new PL_LST_1000_MEWH_CLSFCURRecord();
			rec.cd = Util.checkString(rset13.getString("cd"));
			rec.cdnm = Util.checkString(rset13.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset13.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset13.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset13.getString("cdabrvnm_cd"));
			this.ewh_clsfcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_LST_1000_MDataSet ds = (PL_LST_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medi_clsfcur.size(); i++){
		PL_LST_1000_MMEDI_CLSFCURRecord medi_clsfcurRec = (PL_LST_1000_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi_cdcur.size(); i++){
		PL_LST_1000_MMEDI_CDCURRecord medi_cdcurRec = (PL_LST_1000_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.deal_clsfcur.size(); i++){
		PL_LST_1000_MDEAL_CLSFCURRecord deal_clsfcurRec = (PL_LST_1000_MDEAL_CLSFCURRecord)ds.deal_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.issu_cmpycur.size(); i++){
		PL_LST_1000_MISSU_CMPYCURRecord issu_cmpycurRec = (PL_LST_1000_MISSU_CMPYCURRecord)ds.issu_cmpycur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.wh_cdcur.size(); i++){
		PL_LST_1000_MWH_CDCURRecord wh_cdcurRec = (PL_LST_1000_MWH_CDCURRecord)ds.wh_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlco_clsfcur.size(); i++){
		PL_LST_1000_MDLCO_CLSFCURRecord dlco_clsfcurRec = (PL_LST_1000_MDLCO_CLSFCURRecord)ds.dlco_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.areacur.size(); i++){
		PL_LST_1000_MAREACURRecord areacurRec = (PL_LST_1000_MAREACURRecord)ds.areacur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sendclsfcur.size(); i++){
		PL_LST_1000_MSENDCLSFCURRecord sendclsfcurRec = (PL_LST_1000_MSENDCLSFCURRecord)ds.sendclsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sale_clsfcur.size(); i++){
		PL_LST_1000_MSALE_CLSFCURRecord sale_clsfcurRec = (PL_LST_1000_MSALE_CLSFCURRecord)ds.sale_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.absence_clsfcur.size(); i++){
		PL_LST_1000_MABSENCE_CLSFCURRecord absence_clsfcurRec = (PL_LST_1000_MABSENCE_CLSFCURRecord)ds.absence_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi_cd_magzcur.size(); i++){
		PL_LST_1000_MMEDI_CD_MAGZCURRecord medi_cd_magzcurRec = (PL_LST_1000_MMEDI_CD_MAGZCURRecord)ds.medi_cd_magzcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi_cd_bookcur.size(); i++){
		PL_LST_1000_MMEDI_CD_BOOKCURRecord medi_cd_bookcurRec = (PL_LST_1000_MMEDI_CD_BOOKCURRecord)ds.medi_cd_bookcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.decid_linecur.size(); i++){
		PL_LST_1000_MDECID_LINECURRecord decid_linecurRec = (PL_LST_1000_MDECID_LINECURRecord)ds.decid_linecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.ewh_clsfcur.size(); i++){
		PL_LST_1000_MEWH_CLSFCURRecord ewh_clsfcurRec = (PL_LST_1000_MEWH_CLSFCURRecord)ds.ewh_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_clsfcur()%>
<%= ds.getMedi_cdcur()%>
<%= ds.getDeal_clsfcur()%>
<%= ds.getIssu_cmpycur()%>
<%= ds.getWh_cdcur()%>
<%= ds.getDlco_clsfcur()%>
<%= ds.getAreacur()%>
<%= ds.getSendclsfcur()%>
<%= ds.getSale_clsfcur()%>
<%= ds.getAbsence_clsfcur()%>
<%= ds.getMedi_cd_magzcur()%>
<%= ds.getMedi_cd_bookcur()%>
<%= ds.getDecid_linecur()%>
<%= ds.getEwh_clsfcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medi_clsfcurRec.cd%>
<%= medi_clsfcurRec.cdnm%>
<%= medi_clsfcurRec.cd_abrv_nm%>
<%= medi_clsfcurRec.cdnm_cd%>
<%= medi_clsfcurRec.cdabrvnm_cd%>
<%= medi_cdcurRec.cd%>
<%= medi_cdcurRec.cdnm%>
<%= medi_cdcurRec.cd_abrv_nm%>
<%= medi_cdcurRec.cdnm_cd%>
<%= medi_cdcurRec.cdabrvnm_cd%>
<%= deal_clsfcurRec.cd%>
<%= deal_clsfcurRec.cdnm%>
<%= deal_clsfcurRec.cd_abrv_nm%>
<%= deal_clsfcurRec.cdnm_cd%>
<%= deal_clsfcurRec.cdabrvnm_cd%>
<%= issu_cmpycurRec.cd%>
<%= issu_cmpycurRec.cdnm%>
<%= issu_cmpycurRec.cd_abrv_nm%>
<%= issu_cmpycurRec.cdnm_cd%>
<%= issu_cmpycurRec.cdabrvnm_cd%>
<%= wh_cdcurRec.cd%>
<%= wh_cdcurRec.cdnm%>
<%= wh_cdcurRec.cd_abrv_nm%>
<%= wh_cdcurRec.cdnm_cd%>
<%= wh_cdcurRec.cdabrvnm_cd%>
<%= dlco_clsfcurRec.cd%>
<%= dlco_clsfcurRec.cdnm%>
<%= dlco_clsfcurRec.cd_abrv_nm%>
<%= dlco_clsfcurRec.cdnm_cd%>
<%= dlco_clsfcurRec.cdabrvnm_cd%>
<%= areacurRec.cd%>
<%= areacurRec.cdnm%>
<%= areacurRec.cd_abrv_nm%>
<%= areacurRec.cdnm_cd%>
<%= areacurRec.cdabrvnm_cd%>
<%= sendclsfcurRec.cd%>
<%= sendclsfcurRec.cdnm%>
<%= sendclsfcurRec.cd_abrv_nm%>
<%= sendclsfcurRec.cdnm_cd%>
<%= sendclsfcurRec.cdabrvnm_cd%>
<%= sale_clsfcurRec.cd%>
<%= sale_clsfcurRec.cdnm%>
<%= sale_clsfcurRec.cd_abrv_nm%>
<%= sale_clsfcurRec.cdnm_cd%>
<%= sale_clsfcurRec.cdabrvnm_cd%>
<%= absence_clsfcurRec.cd%>
<%= absence_clsfcurRec.cdnm%>
<%= absence_clsfcurRec.cd_abrv_nm%>
<%= absence_clsfcurRec.cdnm_cd%>
<%= absence_clsfcurRec.cdabrvnm_cd%>
<%= medi_cd_magzcurRec.cd%>
<%= medi_cd_magzcurRec.cdnm%>
<%= medi_cd_bookcurRec.cd%>
<%= medi_cd_bookcurRec.cdnm%>
<%= decid_linecurRec.cd%>
<%= decid_linecurRec.cdnm%>
<%= decid_linecurRec.cd_abrv_nm%>
<%= decid_linecurRec.cdnm_cd%>
<%= decid_linecurRec.cdabrvnm_cd%>
<%= ewh_clsfcurRec.cd%>
<%= ewh_clsfcurRec.cdnm%>
<%= ewh_clsfcurRec.cd_abrv_nm%>
<%= ewh_clsfcurRec.cdnm_cd%>
<%= ewh_clsfcurRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 15 17:43:43 KST 2009 */