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


public class PL_LST_3000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList medi_cd_bookcur = new ArrayList();
	public ArrayList medi_clsfcur = new ArrayList();
	public ArrayList issu_cmpycur = new ArrayList();
	public ArrayList medi_cd_magzcur = new ArrayList();
	public ArrayList rcpm_typecur = new ArrayList();
	public ArrayList decid_linecur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_LST_3000_MDataSet(){}
	public PL_LST_3000_MDataSet(String errcode, String errmsg){
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
			PL_LST_3000_MISSU_CMPYCURRecord rec = new PL_LST_3000_MISSU_CMPYCURRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.issu_cmpycur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			PL_LST_3000_MMEDI_CD_MAGZCURRecord rec = new PL_LST_3000_MMEDI_CD_MAGZCURRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.issu_cmpy = Util.checkString(rset1.getString("issu_cmpy"));
			rec.issu_clsf = Util.checkString(rset1.getString("issu_clsf"));
			this.medi_cd_magzcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			PL_LST_3000_MMEDI_CD_BOOKCURRecord rec = new PL_LST_3000_MMEDI_CD_BOOKCURRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			this.medi_cd_bookcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			PL_LST_3000_MDECID_LINECURRecord rec = new PL_LST_3000_MDECID_LINECURRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.decid_linecur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			PL_LST_3000_MMEDI_CLSFCURRecord rec = new PL_LST_3000_MMEDI_CLSFCURRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.medi_clsfcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			PL_LST_3000_MRCPM_TYPECURRecord rec = new PL_LST_3000_MRCPM_TYPECURRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset5.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset5.getString("cdabrvnm_cd"));
			this.rcpm_typecur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_LST_3000_MDataSet ds = (PL_LST_3000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.issu_cmpycur.size(); i++){
		PL_LST_3000_MISSU_CMPYCURRecord issu_cmpycurRec = (PL_LST_3000_MISSU_CMPYCURRecord)ds.issu_cmpycur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi_cd_magzcur.size(); i++){
		PL_LST_3000_MMEDI_CD_MAGZCURRecord medi_cd_magzcurRec = (PL_LST_3000_MMEDI_CD_MAGZCURRecord)ds.medi_cd_magzcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi_cd_bookcur.size(); i++){
		PL_LST_3000_MMEDI_CD_BOOKCURRecord medi_cd_bookcurRec = (PL_LST_3000_MMEDI_CD_BOOKCURRecord)ds.medi_cd_bookcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.decid_linecur.size(); i++){
		PL_LST_3000_MDECID_LINECURRecord decid_linecurRec = (PL_LST_3000_MDECID_LINECURRecord)ds.decid_linecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi_clsfcur.size(); i++){
		PL_LST_3000_MMEDI_CLSFCURRecord medi_clsfcurRec = (PL_LST_3000_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rcpm_typecur.size(); i++){
		PL_LST_3000_MRCPM_TYPECURRecord rcpm_typecurRec = (PL_LST_3000_MRCPM_TYPECURRecord)ds.rcpm_typecur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getIssu_cmpycur()%>
<%= ds.getMedi_cd_magzcur()%>
<%= ds.getMedi_cd_bookcur()%>
<%= ds.getDecid_linecur()%>
<%= ds.getMedi_clsfcur()%>
<%= ds.getRcpm_typecur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= issu_cmpycurRec.cd%>
<%= issu_cmpycurRec.cdnm%>
<%= issu_cmpycurRec.cd_abrv_nm%>
<%= issu_cmpycurRec.cdnm_cd%>
<%= issu_cmpycurRec.cdabrvnm_cd%>
<%= medi_cd_magzcurRec.cd%>
<%= medi_cd_magzcurRec.cdnm%>
<%= medi_cd_magzcurRec.issu_cmpy%>
<%= medi_cd_magzcurRec.issu_clsf%>
<%= medi_cd_bookcurRec.cd%>
<%= medi_cd_bookcurRec.cdnm%>
<%= decid_linecurRec.cd%>
<%= decid_linecurRec.cdnm%>
<%= decid_linecurRec.cd_abrv_nm%>
<%= decid_linecurRec.cdnm_cd%>
<%= decid_linecurRec.cdabrvnm_cd%>
<%= medi_clsfcurRec.cd%>
<%= medi_clsfcurRec.cdnm%>
<%= medi_clsfcurRec.cd_abrv_nm%>
<%= medi_clsfcurRec.cdnm_cd%>
<%= medi_clsfcurRec.cdabrvnm_cd%>
<%= rcpm_typecurRec.cd%>
<%= rcpm_typecurRec.cdnm%>
<%= rcpm_typecurRec.cd_abrv_nm%>
<%= rcpm_typecurRec.cdnm_cd%>
<%= rcpm_typecurRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 12 20:29:50 KST 2009 */