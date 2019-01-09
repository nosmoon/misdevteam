/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1030_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dlcoclsfcdlist = new ArrayList();
	public ArrayList depsclsflist = new ArrayList();
	public ArrayList xx_cd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_dlco_clsf_cd;

	public FC_FUNC_1030_MDataSet(){}
	public FC_FUNC_1030_MDataSet(String errcode, String errmsg, String xx_dlco_clsf_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_dlco_clsf_cd(String xx_dlco_clsf_cd){
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_dlco_clsf_cd(){
		return this.xx_dlco_clsf_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_1030_MDLCOCLSFCDLISTRecord rec = new FC_FUNC_1030_MDLCOCLSFCDLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.dlcoclsfcdlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_1030_MDEPSCLSFLISTRecord rec = new FC_FUNC_1030_MDEPSCLSFLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.depsclsflist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_1030_MXX_CDRecord rec = new FC_FUNC_1030_MXX_CDRecord();
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.xx_cd.add(rec);
		}
		this.xx_dlco_clsf_cd = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1030_MDataSet ds = (FC_FUNC_1030_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dlcoclsfcdlist.size(); i++){
		FC_FUNC_1030_MDLCOCLSFCDLISTRecord dlcoclsfcdlistRec = (FC_FUNC_1030_MDLCOCLSFCDLISTRecord)ds.dlcoclsfcdlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.depsclsflist.size(); i++){
		FC_FUNC_1030_MDEPSCLSFLISTRecord depsclsflistRec = (FC_FUNC_1030_MDEPSCLSFLISTRecord)ds.depsclsflist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_cd.size(); i++){
		FC_FUNC_1030_MXX_CDRecord xx_cdRec = (FC_FUNC_1030_MXX_CDRecord)ds.xx_cd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlcoclsfcdlist()%>
<%= ds.getDepsclsflist()%>
<%= ds.getXx_cd()%>
<%= ds.getXx_dlco_clsf_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dlcoclsfcdlistRec.cd%>
<%= dlcoclsfcdlistRec.cdnm%>
<%= dlcoclsfcdlistRec.cd_abrv_nm%>
<%= dlcoclsfcdlistRec.cdnm_cd%>
<%= dlcoclsfcdlistRec.cdabrvnm_cd%>
<%= depsclsflistRec.cd%>
<%= depsclsflistRec.cdnm%>
<%= depsclsflistRec.cd_abrv_nm%>
<%= depsclsflistRec.cdnm_cd%>
<%= depsclsflistRec.cdabrvnm_cd%>
<%= xx_cdRec.cd_nm%>
<%= xx_cdRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 03 16:03:01 KST 2012 */