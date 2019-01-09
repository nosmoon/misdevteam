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


public class PL_BAS_1600_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList issu_clsfcur = new ArrayList();
	public ArrayList medi_clsfcur = new ArrayList();
	public ArrayList issu_cmpycur = new ArrayList();
	public ArrayList basi_whcur = new ArrayList();
	public ArrayList ser_no_basicur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1600_MDataSet(){}
	public PL_BAS_1600_MDataSet(String errcode, String errmsg){
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
			PL_BAS_1600_MISSU_CMPYCURRecord rec = new PL_BAS_1600_MISSU_CMPYCURRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.issu_cmpycur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			PL_BAS_1600_MMEDI_CLSFCURRecord rec = new PL_BAS_1600_MMEDI_CLSFCURRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.medi_clsfcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			PL_BAS_1600_MSER_NO_BASICURRecord rec = new PL_BAS_1600_MSER_NO_BASICURRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.ser_no_basicur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			PL_BAS_1600_MISSU_CLSFCURRecord rec = new PL_BAS_1600_MISSU_CLSFCURRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.issu_clsfcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			PL_BAS_1600_MBASI_WHCURRecord rec = new PL_BAS_1600_MBASI_WHCURRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.basi_whcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1600_MDataSet ds = (PL_BAS_1600_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.issu_cmpycur.size(); i++){
		PL_BAS_1600_MISSU_CMPYCURRecord issu_cmpycurRec = (PL_BAS_1600_MISSU_CMPYCURRecord)ds.issu_cmpycur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi_clsfcur.size(); i++){
		PL_BAS_1600_MMEDI_CLSFCURRecord medi_clsfcurRec = (PL_BAS_1600_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.ser_no_basicur.size(); i++){
		PL_BAS_1600_MSER_NO_BASICURRecord ser_no_basicurRec = (PL_BAS_1600_MSER_NO_BASICURRecord)ds.ser_no_basicur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.issu_clsfcur.size(); i++){
		PL_BAS_1600_MISSU_CLSFCURRecord issu_clsfcurRec = (PL_BAS_1600_MISSU_CLSFCURRecord)ds.issu_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.basi_whcur.size(); i++){
		PL_BAS_1600_MBASI_WHCURRecord basi_whcurRec = (PL_BAS_1600_MBASI_WHCURRecord)ds.basi_whcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getIssu_cmpycur()%>
<%= ds.getMedi_clsfcur()%>
<%= ds.getSer_no_basicur()%>
<%= ds.getIssu_clsfcur()%>
<%= ds.getBasi_whcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= issu_cmpycurRec.cd%>
<%= issu_cmpycurRec.cdnm%>
<%= issu_cmpycurRec.cd_abrv_nm%>
<%= issu_cmpycurRec.cdnm_cd%>
<%= issu_cmpycurRec.cdabrvnm_cd%>
<%= medi_clsfcurRec.cd%>
<%= medi_clsfcurRec.cdnm%>
<%= medi_clsfcurRec.cd_abrv_nm%>
<%= medi_clsfcurRec.cdnm_cd%>
<%= medi_clsfcurRec.cdabrvnm_cd%>
<%= ser_no_basicurRec.cd%>
<%= ser_no_basicurRec.cdnm%>
<%= ser_no_basicurRec.cd_abrv_nm%>
<%= ser_no_basicurRec.cdnm_cd%>
<%= ser_no_basicurRec.cdabrvnm_cd%>
<%= issu_clsfcurRec.cd%>
<%= issu_clsfcurRec.cdnm%>
<%= issu_clsfcurRec.cd_abrv_nm%>
<%= issu_clsfcurRec.cdnm_cd%>
<%= issu_clsfcurRec.cdabrvnm_cd%>
<%= basi_whcurRec.cd%>
<%= basi_whcurRec.cdnm%>
<%= basi_whcurRec.cd_abrv_nm%>
<%= basi_whcurRec.cdnm_cd%>
<%= basi_whcurRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 11:10:35 KST 2009 */