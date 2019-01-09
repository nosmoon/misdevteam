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


public class PL_BAS_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cont_clascur = new ArrayList();
	public ArrayList issu_cmpycur = new ArrayList();
	public ArrayList wh_cdcur = new ArrayList();
	public ArrayList ewh_clsfcur = new ArrayList();
	public ArrayList absence_clsfcur = new ArrayList();
	public ArrayList ecntcur = new ArrayList();
	public ArrayList typecur = new ArrayList();
	public ArrayList medi_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1100_MDataSet(){}
	public PL_BAS_1100_MDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			PL_BAS_1100_MISSU_CMPYCURRecord rec = new PL_BAS_1100_MISSU_CMPYCURRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.hndl_medi_clsf = Util.checkString(rset1.getString("hndl_medi_clsf"));
			this.issu_cmpycur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			PL_BAS_1100_MMEDI_CDCURRecord rec = new PL_BAS_1100_MMEDI_CDCURRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.issu_cmpy = Util.checkString(rset2.getString("issu_cmpy"));
			rec.medi_clsf = Util.checkString(rset2.getString("medi_clsf"));
			rec.ser_no_bas = Util.checkString(rset2.getString("ser_no_bas"));
			this.medi_cdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			PL_BAS_1100_MCONT_CLASCURRecord rec = new PL_BAS_1100_MCONT_CLASCURRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.cont_clascur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			PL_BAS_1100_MTYPECURRecord rec = new PL_BAS_1100_MTYPECURRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.typecur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			PL_BAS_1100_MABSENCE_CLSFCURRecord rec = new PL_BAS_1100_MABSENCE_CLSFCURRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset5.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset5.getString("cdabrvnm_cd"));
			this.absence_clsfcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			PL_BAS_1100_MECNTCURRecord rec = new PL_BAS_1100_MECNTCURRecord();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset6.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset6.getString("cdabrvnm_cd"));
			this.ecntcur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(12);
		while(rset7.next()){
			PL_BAS_1100_MEWH_CLSFCURRecord rec = new PL_BAS_1100_MEWH_CLSFCURRecord();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset7.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset7.getString("cdabrvnm_cd"));
			this.ewh_clsfcur.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(13);
		while(rset8.next()){
			PL_BAS_1100_MWH_CDCURRecord rec = new PL_BAS_1100_MWH_CDCURRecord();
			rec.cd = Util.checkString(rset8.getString("cd"));
			rec.cdnm = Util.checkString(rset8.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset8.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset8.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset8.getString("cdabrvnm_cd"));
			this.wh_cdcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1100_MDataSet ds = (PL_BAS_1100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.issu_cmpycur.size(); i++){
		PL_BAS_1100_MISSU_CMPYCURRecord issu_cmpycurRec = (PL_BAS_1100_MISSU_CMPYCURRecord)ds.issu_cmpycur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi_cdcur.size(); i++){
		PL_BAS_1100_MMEDI_CDCURRecord medi_cdcurRec = (PL_BAS_1100_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cont_clascur.size(); i++){
		PL_BAS_1100_MCONT_CLASCURRecord cont_clascurRec = (PL_BAS_1100_MCONT_CLASCURRecord)ds.cont_clascur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.typecur.size(); i++){
		PL_BAS_1100_MTYPECURRecord typecurRec = (PL_BAS_1100_MTYPECURRecord)ds.typecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.absence_clsfcur.size(); i++){
		PL_BAS_1100_MABSENCE_CLSFCURRecord absence_clsfcurRec = (PL_BAS_1100_MABSENCE_CLSFCURRecord)ds.absence_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.ecntcur.size(); i++){
		PL_BAS_1100_MECNTCURRecord ecntcurRec = (PL_BAS_1100_MECNTCURRecord)ds.ecntcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.ewh_clsfcur.size(); i++){
		PL_BAS_1100_MEWH_CLSFCURRecord ewh_clsfcurRec = (PL_BAS_1100_MEWH_CLSFCURRecord)ds.ewh_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.wh_cdcur.size(); i++){
		PL_BAS_1100_MWH_CDCURRecord wh_cdcurRec = (PL_BAS_1100_MWH_CDCURRecord)ds.wh_cdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getIssu_cmpycur()%>
<%= ds.getMedi_cdcur()%>
<%= ds.getCont_clascur()%>
<%= ds.getTypecur()%>
<%= ds.getAbsence_clsfcur()%>
<%= ds.getEcntcur()%>
<%= ds.getEwh_clsfcur()%>
<%= ds.getWh_cdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= issu_cmpycurRec.cd%>
<%= issu_cmpycurRec.cdnm%>
<%= issu_cmpycurRec.cd_abrv_nm%>
<%= issu_cmpycurRec.hndl_medi_clsf%>
<%= medi_cdcurRec.cd%>
<%= medi_cdcurRec.cdnm%>
<%= medi_cdcurRec.cd_abrv_nm%>
<%= medi_cdcurRec.issu_cmpy%>
<%= medi_cdcurRec.medi_clsf%>
<%= medi_cdcurRec.ser_no_bas%>
<%= cont_clascurRec.cd%>
<%= cont_clascurRec.cdnm%>
<%= cont_clascurRec.cd_abrv_nm%>
<%= cont_clascurRec.cdnm_cd%>
<%= cont_clascurRec.cdabrvnm_cd%>
<%= typecurRec.cd%>
<%= typecurRec.cdnm%>
<%= typecurRec.cd_abrv_nm%>
<%= typecurRec.cdnm_cd%>
<%= typecurRec.cdabrvnm_cd%>
<%= absence_clsfcurRec.cd%>
<%= absence_clsfcurRec.cdnm%>
<%= absence_clsfcurRec.cd_abrv_nm%>
<%= absence_clsfcurRec.cdnm_cd%>
<%= absence_clsfcurRec.cdabrvnm_cd%>
<%= ecntcurRec.cd%>
<%= ecntcurRec.cdnm%>
<%= ecntcurRec.cd_abrv_nm%>
<%= ecntcurRec.cdnm_cd%>
<%= ecntcurRec.cdabrvnm_cd%>
<%= ewh_clsfcurRec.cd%>
<%= ewh_clsfcurRec.cdnm%>
<%= ewh_clsfcurRec.cd_abrv_nm%>
<%= ewh_clsfcurRec.cdnm_cd%>
<%= ewh_clsfcurRec.cdabrvnm_cd%>
<%= wh_cdcurRec.cd%>
<%= wh_cdcurRec.cdnm%>
<%= wh_cdcurRec.cd_abrv_nm%>
<%= wh_cdcurRec.cdnm_cd%>
<%= wh_cdcurRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 21:11:20 KST 2009 */