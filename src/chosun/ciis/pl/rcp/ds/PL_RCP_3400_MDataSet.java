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


public class PL_RCP_3400_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList medi_clsfcur = new ArrayList();
	public ArrayList dlco_clsfcur = new ArrayList();
	public ArrayList areacur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_3400_MDataSet(){}
	public PL_RCP_3400_MDataSet(String errcode, String errmsg){
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

		ResultSet rset16 = (ResultSet) cstmt.getObject(5);
		while(rset16.next()){
			PL_RCP_3400_MMEDI_CLSFCURRecord rec = new PL_RCP_3400_MMEDI_CLSFCURRecord();
			rec.cd = Util.checkString(rset16.getString("cd"));
			rec.cdnm = Util.checkString(rset16.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset16.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset16.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset16.getString("cdabrvnm_cd"));
			this.medi_clsfcur.add(rec);
		}
		ResultSet rset17 = (ResultSet) cstmt.getObject(6);
		while(rset17.next()){
			PL_RCP_3400_MDLCO_CLSFCURRecord rec = new PL_RCP_3400_MDLCO_CLSFCURRecord();
			rec.cd = Util.checkString(rset17.getString("cd"));
			rec.cdnm = Util.checkString(rset17.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset17.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset17.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset17.getString("cdabrvnm_cd"));
			this.dlco_clsfcur.add(rec);
		}
		ResultSet rset18 = (ResultSet) cstmt.getObject(7);
		while(rset18.next()){
			PL_RCP_3400_MAREACURRecord rec = new PL_RCP_3400_MAREACURRecord();
			rec.cd = Util.checkString(rset18.getString("cd"));
			rec.cdnm = Util.checkString(rset18.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset18.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset18.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset18.getString("cdabrvnm_cd"));
			this.areacur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_RCP_3400_MDataSet ds = (PL_RCP_3400_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medi_clsfcur.size(); i++){
		PL_RCP_3400_MMEDI_CLSFCURRecord medi_clsfcurRec = (PL_RCP_3400_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlco_clsfcur.size(); i++){
		PL_RCP_3400_MDLCO_CLSFCURRecord dlco_clsfcurRec = (PL_RCP_3400_MDLCO_CLSFCURRecord)ds.dlco_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.areacur.size(); i++){
		PL_RCP_3400_MAREACURRecord areacurRec = (PL_RCP_3400_MAREACURRecord)ds.areacur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_clsfcur()%>
<%= ds.getDlco_clsfcur()%>
<%= ds.getAreacur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medi_clsfcurRec.cd%>
<%= medi_clsfcurRec.cdnm%>
<%= medi_clsfcurRec.cd_abrv_nm%>
<%= medi_clsfcurRec.cdnm_cd%>
<%= medi_clsfcurRec.cdabrvnm_cd%>
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
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */