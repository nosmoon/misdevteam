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


public class PL_COM_1400_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dlco_clsfcur = new ArrayList();
	public ArrayList prv_curr_clsfcur = new ArrayList();
	public ArrayList areacur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_COM_1400_MDataSet(){}
	public PL_COM_1400_MDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			PL_COM_1400_MDLCO_CLSFCURRecord rec = new PL_COM_1400_MDLCO_CLSFCURRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.dlco_clsfcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			PL_COM_1400_MAREACURRecord rec = new PL_COM_1400_MAREACURRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.areacur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			PL_COM_1400_MPRV_CURR_CLSFCURRecord rec = new PL_COM_1400_MPRV_CURR_CLSFCURRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.prv_curr_clsfcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_COM_1400_MDataSet ds = (PL_COM_1400_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dlco_clsfcur.size(); i++){
		PL_COM_1400_MDLCO_CLSFCURRecord dlco_clsfcurRec = (PL_COM_1400_MDLCO_CLSFCURRecord)ds.dlco_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.areacur.size(); i++){
		PL_COM_1400_MAREACURRecord areacurRec = (PL_COM_1400_MAREACURRecord)ds.areacur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.prv_curr_clsfcur.size(); i++){
		PL_COM_1400_MPRV_CURR_CLSFCURRecord prv_curr_clsfcurRec = (PL_COM_1400_MPRV_CURR_CLSFCURRecord)ds.prv_curr_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_clsfcur()%>
<%= ds.getAreacur()%>
<%= ds.getPrv_curr_clsfcur()%>
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
<%= prv_curr_clsfcurRec.cd%>
<%= prv_curr_clsfcurRec.cdnm%>
<%= prv_curr_clsfcurRec.cd_abrv_nm%>
<%= prv_curr_clsfcurRec.cdnm_cd%>
<%= prv_curr_clsfcurRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 16:25:38 KST 2009 */