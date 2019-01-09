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


package chosun.ciis.pl.ass.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.ass.dm.*;
import chosun.ciis.pl.ass.rec.*;

/**
 * 
 */


public class PL_ASS_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sale_clsfcur = new ArrayList();
	public ArrayList sendclsfcur = new ArrayList();
	public ArrayList wh_cdcur = new ArrayList();
	public ArrayList sell_typecur = new ArrayList();
	public ArrayList decid_linecur = new ArrayList();
	public ArrayList medi_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_ASS_1100_MDataSet(){}
	public PL_ASS_1100_MDataSet(String errcode, String errmsg){
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

		ResultSet rset10 = (ResultSet) cstmt.getObject(5);
		while(rset10.next()){
			PL_ASS_1100_MMEDI_CDCURRecord rec = new PL_ASS_1100_MMEDI_CDCURRecord();
			rec.cd = Util.checkString(rset10.getString("cd"));
			rec.cdnm = Util.checkString(rset10.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset10.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset10.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset10.getString("cdabrvnm_cd"));
			this.medi_cdcur.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(6);
		while(rset11.next()){
			PL_ASS_1100_MSALE_CLSFCURRecord rec = new PL_ASS_1100_MSALE_CLSFCURRecord();
			rec.cd = Util.checkString(rset11.getString("cd"));
			rec.cdnm = Util.checkString(rset11.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset11.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset11.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset11.getString("cdabrvnm_cd"));
			this.sale_clsfcur.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(7);
		while(rset12.next()){
			PL_ASS_1100_MSENDCLSFCURRecord rec = new PL_ASS_1100_MSENDCLSFCURRecord();
			rec.cd = Util.checkString(rset12.getString("cd"));
			rec.cdnm = Util.checkString(rset12.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset12.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset12.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset12.getString("cdabrvnm_cd"));
			this.sendclsfcur.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(8);
		while(rset13.next()){
			PL_ASS_1100_MWH_CDCURRecord rec = new PL_ASS_1100_MWH_CDCURRecord();
			rec.cd = Util.checkString(rset13.getString("cd"));
			rec.cdnm = Util.checkString(rset13.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset13.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset13.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset13.getString("cdabrvnm_cd"));
			this.wh_cdcur.add(rec);
		}
		ResultSet rset14 = (ResultSet) cstmt.getObject(9);
		while(rset14.next()){
			PL_ASS_1100_MSELL_TYPECURRecord rec = new PL_ASS_1100_MSELL_TYPECURRecord();
			rec.cd = Util.checkString(rset14.getString("cd"));
			rec.cdnm = Util.checkString(rset14.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset14.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset14.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset14.getString("cdabrvnm_cd"));
			this.sell_typecur.add(rec);
		}
		ResultSet rset15 = (ResultSet) cstmt.getObject(10);
		while(rset15.next()){
			PL_ASS_1100_MDECID_LINECURRecord rec = new PL_ASS_1100_MDECID_LINECURRecord();
			rec.cd = Util.checkString(rset15.getString("cd"));
			rec.cdnm = Util.checkString(rset15.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset15.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset15.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset15.getString("cdabrvnm_cd"));
			this.decid_linecur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_ASS_1100_MDataSet ds = (PL_ASS_1100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medi_cdcur.size(); i++){
		PL_ASS_1100_MMEDI_CDCURRecord medi_cdcurRec = (PL_ASS_1100_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sale_clsfcur.size(); i++){
		PL_ASS_1100_MSALE_CLSFCURRecord sale_clsfcurRec = (PL_ASS_1100_MSALE_CLSFCURRecord)ds.sale_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sendclsfcur.size(); i++){
		PL_ASS_1100_MSENDCLSFCURRecord sendclsfcurRec = (PL_ASS_1100_MSENDCLSFCURRecord)ds.sendclsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.wh_cdcur.size(); i++){
		PL_ASS_1100_MWH_CDCURRecord wh_cdcurRec = (PL_ASS_1100_MWH_CDCURRecord)ds.wh_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sell_typecur.size(); i++){
		PL_ASS_1100_MSELL_TYPECURRecord sell_typecurRec = (PL_ASS_1100_MSELL_TYPECURRecord)ds.sell_typecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.decid_linecur.size(); i++){
		PL_ASS_1100_MDECID_LINECURRecord decid_linecurRec = (PL_ASS_1100_MDECID_LINECURRecord)ds.decid_linecur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cdcur()%>
<%= ds.getSale_clsfcur()%>
<%= ds.getSendclsfcur()%>
<%= ds.getWh_cdcur()%>
<%= ds.getSell_typecur()%>
<%= ds.getDecid_linecur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medi_cdcurRec.cd%>
<%= medi_cdcurRec.cdnm%>
<%= medi_cdcurRec.cd_abrv_nm%>
<%= medi_cdcurRec.cdnm_cd%>
<%= medi_cdcurRec.cdabrvnm_cd%>
<%= sale_clsfcurRec.cd%>
<%= sale_clsfcurRec.cdnm%>
<%= sale_clsfcurRec.cd_abrv_nm%>
<%= sale_clsfcurRec.cdnm_cd%>
<%= sale_clsfcurRec.cdabrvnm_cd%>
<%= sendclsfcurRec.cd%>
<%= sendclsfcurRec.cdnm%>
<%= sendclsfcurRec.cd_abrv_nm%>
<%= sendclsfcurRec.cdnm_cd%>
<%= sendclsfcurRec.cdabrvnm_cd%>
<%= wh_cdcurRec.cd%>
<%= wh_cdcurRec.cdnm%>
<%= wh_cdcurRec.cd_abrv_nm%>
<%= wh_cdcurRec.cdnm_cd%>
<%= wh_cdcurRec.cdabrvnm_cd%>
<%= sell_typecurRec.cd%>
<%= sell_typecurRec.cdnm%>
<%= sell_typecurRec.cd_abrv_nm%>
<%= sell_typecurRec.cdnm_cd%>
<%= sell_typecurRec.cdabrvnm_cd%>
<%= decid_linecurRec.cd%>
<%= decid_linecurRec.cdnm%>
<%= decid_linecurRec.cd_abrv_nm%>
<%= decid_linecurRec.cdnm_cd%>
<%= decid_linecurRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 26 19:42:40 KST 2009 */