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


public class PL_BAS_1700_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dlco_clsfcur = new ArrayList();
	public ArrayList purc_aply_clsfcur = new ArrayList();
	public ArrayList sale_aply_clsfcur = new ArrayList();
	public ArrayList medi_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1700_MDataSet(){}
	public PL_BAS_1700_MDataSet(String errcode, String errmsg){
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
			PL_BAS_1700_MMEDI_CDCURRecord rec = new PL_BAS_1700_MMEDI_CDCURRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.medi_cdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			PL_BAS_1700_MDLCO_CLSFCURRecord rec = new PL_BAS_1700_MDLCO_CLSFCURRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.dlco_clsfcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			PL_BAS_1700_MSALE_APLY_CLSFCURRecord rec = new PL_BAS_1700_MSALE_APLY_CLSFCURRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.sale_aply_clsfcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			PL_BAS_1700_MPURC_APLY_CLSFCURRecord rec = new PL_BAS_1700_MPURC_APLY_CLSFCURRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.purc_aply_clsfcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1700_MDataSet ds = (PL_BAS_1700_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medi_cdcur.size(); i++){
		PL_BAS_1700_MMEDI_CDCURRecord medi_cdcurRec = (PL_BAS_1700_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlco_clsfcur.size(); i++){
		PL_BAS_1700_MDLCO_CLSFCURRecord dlco_clsfcurRec = (PL_BAS_1700_MDLCO_CLSFCURRecord)ds.dlco_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sale_aply_clsfcur.size(); i++){
		PL_BAS_1700_MSALE_APLY_CLSFCURRecord sale_aply_clsfcurRec = (PL_BAS_1700_MSALE_APLY_CLSFCURRecord)ds.sale_aply_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.purc_aply_clsfcur.size(); i++){
		PL_BAS_1700_MPURC_APLY_CLSFCURRecord purc_aply_clsfcurRec = (PL_BAS_1700_MPURC_APLY_CLSFCURRecord)ds.purc_aply_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cdcur()%>
<%= ds.getDlco_clsfcur()%>
<%= ds.getSale_aply_clsfcur()%>
<%= ds.getPurc_aply_clsfcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medi_cdcurRec.cd%>
<%= medi_cdcurRec.cdnm%>
<%= medi_cdcurRec.cd_abrv_nm%>
<%= medi_cdcurRec.cdnm_cd%>
<%= medi_cdcurRec.cdabrvnm_cd%>
<%= dlco_clsfcurRec.cd%>
<%= dlco_clsfcurRec.cdnm%>
<%= dlco_clsfcurRec.cd_abrv_nm%>
<%= dlco_clsfcurRec.cdnm_cd%>
<%= dlco_clsfcurRec.cdabrvnm_cd%>
<%= sale_aply_clsfcurRec.cd%>
<%= sale_aply_clsfcurRec.cdnm%>
<%= sale_aply_clsfcurRec.cd_abrv_nm%>
<%= sale_aply_clsfcurRec.cdnm_cd%>
<%= sale_aply_clsfcurRec.cdabrvnm_cd%>
<%= purc_aply_clsfcurRec.cd%>
<%= purc_aply_clsfcurRec.cdnm%>
<%= purc_aply_clsfcurRec.cd_abrv_nm%>
<%= purc_aply_clsfcurRec.cdnm_cd%>
<%= purc_aply_clsfcurRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 15 20:47:19 KST 2009 */