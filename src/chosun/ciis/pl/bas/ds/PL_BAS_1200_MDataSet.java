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


package chosun.ciis.pl.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1200_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sendclsfcur = new ArrayList();
	public ArrayList colt_clsfcur = new ArrayList();
	public ArrayList dlco_clsfcur = new ArrayList();
	public ArrayList wh_cdcur = new ArrayList();
	public ArrayList rshpcur = new ArrayList();
	public ArrayList areacur = new ArrayList();
	public ArrayList setup_statcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1200_MDataSet(){}
	public PL_BAS_1200_MDataSet(String errcode, String errmsg){
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

		ResultSet rset9 = (ResultSet) cstmt.getObject(5);
		while(rset9.next()){
			PL_BAS_1200_MDLCO_CLSFCURRecord rec = new PL_BAS_1200_MDLCO_CLSFCURRecord();
			rec.cd = Util.checkString(rset9.getString("cd"));
			rec.cdnm = Util.checkString(rset9.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset9.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset9.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset9.getString("cdabrvnm_cd"));
			this.dlco_clsfcur.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(6);
		while(rset10.next()){
			PL_BAS_1200_MAREACURRecord rec = new PL_BAS_1200_MAREACURRecord();
			rec.cd = Util.checkString(rset10.getString("cd"));
			rec.cdnm = Util.checkString(rset10.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset10.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset10.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset10.getString("cdabrvnm_cd"));
			this.areacur.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(7);
		while(rset11.next()){
			PL_BAS_1200_MWH_CDCURRecord rec = new PL_BAS_1200_MWH_CDCURRecord();
			rec.cd = Util.checkString(rset11.getString("cd"));
			rec.cdnm = Util.checkString(rset11.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset11.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset11.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset11.getString("cdabrvnm_cd"));
			this.wh_cdcur.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(8);
		while(rset12.next()){
			PL_BAS_1200_MSENDCLSFCURRecord rec = new PL_BAS_1200_MSENDCLSFCURRecord();
			rec.cd = Util.checkString(rset12.getString("cd"));
			rec.cdnm = Util.checkString(rset12.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset12.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset12.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset12.getString("cdabrvnm_cd"));
			this.sendclsfcur.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(9);
		while(rset13.next()){
			PL_BAS_1200_MCOLT_CLSFCURRecord rec = new PL_BAS_1200_MCOLT_CLSFCURRecord();
			rec.cd = Util.checkString(rset13.getString("cd"));
			rec.cdnm = Util.checkString(rset13.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset13.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset13.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset13.getString("cdabrvnm_cd"));
			this.colt_clsfcur.add(rec);
		}
		ResultSet rset14 = (ResultSet) cstmt.getObject(10);
		while(rset14.next()){
			PL_BAS_1200_MSETUP_STATCURRecord rec = new PL_BAS_1200_MSETUP_STATCURRecord();
			rec.cd = Util.checkString(rset14.getString("cd"));
			rec.cdnm = Util.checkString(rset14.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset14.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset14.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset14.getString("cdabrvnm_cd"));
			this.setup_statcur.add(rec);
		}
		ResultSet rset15 = (ResultSet) cstmt.getObject(11);
		while(rset15.next()){
			PL_BAS_1200_MRSHPCURRecord rec = new PL_BAS_1200_MRSHPCURRecord();
			rec.cd = Util.checkString(rset15.getString("cd"));
			rec.cdnm = Util.checkString(rset15.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset15.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset15.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset15.getString("cdabrvnm_cd"));
			this.rshpcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1200_MDataSet ds = (PL_BAS_1200_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dlco_clsfcur.size(); i++){
		PL_BAS_1200_MDLCO_CLSFCURRecord dlco_clsfcurRec = (PL_BAS_1200_MDLCO_CLSFCURRecord)ds.dlco_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.areacur.size(); i++){
		PL_BAS_1200_MAREACURRecord areacurRec = (PL_BAS_1200_MAREACURRecord)ds.areacur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.wh_cdcur.size(); i++){
		PL_BAS_1200_MWH_CDCURRecord wh_cdcurRec = (PL_BAS_1200_MWH_CDCURRecord)ds.wh_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sendclsfcur.size(); i++){
		PL_BAS_1200_MSENDCLSFCURRecord sendclsfcurRec = (PL_BAS_1200_MSENDCLSFCURRecord)ds.sendclsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.colt_clsfcur.size(); i++){
		PL_BAS_1200_MCOLT_CLSFCURRecord colt_clsfcurRec = (PL_BAS_1200_MCOLT_CLSFCURRecord)ds.colt_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.setup_statcur.size(); i++){
		PL_BAS_1200_MSETUP_STATCURRecord setup_statcurRec = (PL_BAS_1200_MSETUP_STATCURRecord)ds.setup_statcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rshpcur.size(); i++){
		PL_BAS_1200_MRSHPCURRecord rshpcurRec = (PL_BAS_1200_MRSHPCURRecord)ds.rshpcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_clsfcur()%>
<%= ds.getAreacur()%>
<%= ds.getWh_cdcur()%>
<%= ds.getSendclsfcur()%>
<%= ds.getColt_clsfcur()%>
<%= ds.getSetup_statcur()%>
<%= ds.getRshpcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

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
<%= wh_cdcurRec.cd%>
<%= wh_cdcurRec.cdnm%>
<%= wh_cdcurRec.cd_abrv_nm%>
<%= wh_cdcurRec.cdnm_cd%>
<%= wh_cdcurRec.cdabrvnm_cd%>
<%= sendclsfcurRec.cd%>
<%= sendclsfcurRec.cdnm%>
<%= sendclsfcurRec.cd_abrv_nm%>
<%= sendclsfcurRec.cdnm_cd%>
<%= sendclsfcurRec.cdabrvnm_cd%>
<%= colt_clsfcurRec.cd%>
<%= colt_clsfcurRec.cdnm%>
<%= colt_clsfcurRec.cd_abrv_nm%>
<%= colt_clsfcurRec.cdnm_cd%>
<%= colt_clsfcurRec.cdabrvnm_cd%>
<%= setup_statcurRec.cd%>
<%= setup_statcurRec.cdnm%>
<%= setup_statcurRec.cd_abrv_nm%>
<%= setup_statcurRec.cdnm_cd%>
<%= setup_statcurRec.cdabrvnm_cd%>
<%= rshpcurRec.cd%>
<%= rshpcurRec.cdnm%>
<%= rshpcurRec.cd_abrv_nm%>
<%= rshpcurRec.cdnm_cd%>
<%= rshpcurRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */