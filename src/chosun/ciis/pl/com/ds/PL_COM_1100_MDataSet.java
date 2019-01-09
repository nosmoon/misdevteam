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


public class PL_COM_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList medi_clsfcur = new ArrayList();
	public ArrayList absence_clsfcur = new ArrayList();
	public ArrayList medi_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_COM_1100_MDataSet(){}
	public PL_COM_1100_MDataSet(String errcode, String errmsg){
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
		ResultSet rset21 = (ResultSet) cstmt.getObject(5);
		while(rset21.next()){
			PL_COM_1100_MMEDI_CLSFCURRecord rec = new PL_COM_1100_MMEDI_CLSFCURRecord();
			rec.cd = Util.checkString(rset21.getString("cd"));
			rec.cdnm = Util.checkString(rset21.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset21.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset21.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset21.getString("cdabrvnm_cd"));
			this.medi_clsfcur.add(rec);
		}
		ResultSet rset22 = (ResultSet) cstmt.getObject(6);
		while(rset22.next()){
			PL_COM_1100_MMEDI_CDCURRecord rec = new PL_COM_1100_MMEDI_CDCURRecord();
			rec.cd = Util.checkString(rset22.getString("cd"));
			rec.cdnm = Util.checkString(rset22.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset22.getString("cd_abrv_nm"));
			rec.issu_cmpy = Util.checkString(rset22.getString("issu_cmpy"));
			rec.medi_clsf = Util.checkString(rset22.getString("medi_clsf"));
			rec.ser_no_bas = Util.checkString(rset22.getString("ser_no_bas"));
			this.medi_cdcur.add(rec);
		}
		ResultSet rset23 = (ResultSet) cstmt.getObject(7);
		while(rset23.next()){
			PL_COM_1100_MABSENCE_CLSFCURRecord rec = new PL_COM_1100_MABSENCE_CLSFCURRecord();
			rec.cd = Util.checkString(rset23.getString("cd"));
			rec.cdnm = Util.checkString(rset23.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset23.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset23.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset23.getString("cdabrvnm_cd"));
			this.absence_clsfcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_COM_1100_MDataSet ds = (PL_COM_1100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medi_clsfcur.size(); i++){
		PL_COM_1100_MMEDI_CLSFCURRecord medi_clsfcurRec = (PL_COM_1100_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi_cdcur.size(); i++){
		PL_COM_1100_MMEDI_CDCURRecord medi_cdcurRec = (PL_COM_1100_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.absence_clsfcur.size(); i++){
		PL_COM_1100_MABSENCE_CLSFCURRecord absence_clsfcurRec = (PL_COM_1100_MABSENCE_CLSFCURRecord)ds.absence_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_clsfcur()%>
<%= ds.getMedi_cdcur()%>
<%= ds.getAbsence_clsfcur()%>
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
<%= medi_cdcurRec.issu_cmpy%>
<%= medi_cdcurRec.medi_clsf%>
<%= medi_cdcurRec.ser_no_bas%>
<%= absence_clsfcurRec.cd%>
<%= absence_clsfcurRec.cdnm%>
<%= absence_clsfcurRec.cd_abrv_nm%>
<%= absence_clsfcurRec.cdnm_cd%>
<%= absence_clsfcurRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 21:11:20 KST 2009 */