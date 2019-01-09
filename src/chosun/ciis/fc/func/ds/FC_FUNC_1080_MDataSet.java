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


public class FC_FUNC_1080_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dlcoclsfcdlist = new ArrayList();
	public ArrayList depsclsflist = new ArrayList();
	public ArrayList xx_cd = new ArrayList();
	public ArrayList chnl_clsf_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public String mtry_cnt;
	public String xx_dlco_clsf_cd;
	public String xx_now_note_stat_cd_020;
	public String xx_mang_cd_4;

	public FC_FUNC_1080_MDataSet(){}
	public FC_FUNC_1080_MDataSet(String errcode, String errmsg, String mtry_cnt, String xx_dlco_clsf_cd, String xx_now_note_stat_cd_020, String xx_mang_cd_4){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.mtry_cnt = mtry_cnt;
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
		this.xx_now_note_stat_cd_020 = xx_now_note_stat_cd_020;
		this.xx_mang_cd_4 = xx_mang_cd_4;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMtry_cnt(String mtry_cnt){
		this.mtry_cnt = mtry_cnt;
	}

	public void setXx_dlco_clsf_cd(String xx_dlco_clsf_cd){
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
	}

	public void setXx_now_note_stat_cd_020(String xx_now_note_stat_cd_020){
		this.xx_now_note_stat_cd_020 = xx_now_note_stat_cd_020;
	}

	public void setXx_mang_cd_4(String xx_mang_cd_4){
		this.xx_mang_cd_4 = xx_mang_cd_4;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMtry_cnt(){
		return this.mtry_cnt;
	}

	public String getXx_dlco_clsf_cd(){
		return this.xx_dlco_clsf_cd;
	}

	public String getXx_now_note_stat_cd_020(){
		return this.xx_now_note_stat_cd_020;
	}

	public String getXx_mang_cd_4(){
		return this.xx_mang_cd_4;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.mtry_cnt = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_FUNC_1080_MDLCOCLSFCDLISTRecord rec = new FC_FUNC_1080_MDLCOCLSFCDLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.dlcoclsfcdlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			FC_FUNC_1080_MDEPSCLSFLISTRecord rec = new FC_FUNC_1080_MDEPSCLSFLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.depsclsflist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			FC_FUNC_1080_MXX_CDRecord rec = new FC_FUNC_1080_MXX_CDRecord();
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.xx_cd.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			FC_FUNC_1080_MCHNL_CLSF_LISTRecord rec = new FC_FUNC_1080_MCHNL_CLSF_LISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.chnl_clsf_list.add(rec);
		}
		this.xx_dlco_clsf_cd = Util.checkString(cstmt.getString(10));
		this.xx_now_note_stat_cd_020 = Util.checkString(cstmt.getString(11));
		this.xx_mang_cd_4 = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1080_MDataSet ds = (FC_FUNC_1080_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dlcoclsfcdlist.size(); i++){
		FC_FUNC_1080_MDLCOCLSFCDLISTRecord dlcoclsfcdlistRec = (FC_FUNC_1080_MDLCOCLSFCDLISTRecord)ds.dlcoclsfcdlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.depsclsflist.size(); i++){
		FC_FUNC_1080_MDEPSCLSFLISTRecord depsclsflistRec = (FC_FUNC_1080_MDEPSCLSFLISTRecord)ds.depsclsflist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_cd.size(); i++){
		FC_FUNC_1080_MXX_CDRecord xx_cdRec = (FC_FUNC_1080_MXX_CDRecord)ds.xx_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.chnl_clsf_list.size(); i++){
		FC_FUNC_1080_MCHNL_CLSF_LISTRecord chnl_clsf_listRec = (FC_FUNC_1080_MCHNL_CLSF_LISTRecord)ds.chnl_clsf_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMtry_cnt()%>
<%= ds.getDlcoclsfcdlist()%>
<%= ds.getDepsclsflist()%>
<%= ds.getXx_cd()%>
<%= ds.getChnl_clsf_list()%>
<%= ds.getXx_dlco_clsf_cd()%>
<%= ds.getXx_now_note_stat_cd_020()%>
<%= ds.getXx_mang_cd_4()%>
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
<%= chnl_clsf_listRec.cd%>
<%= chnl_clsf_listRec.cdnm%>
<%= chnl_clsf_listRec.cd_abrv_nm%>
<%= chnl_clsf_listRec.cdnm_cd%>
<%= chnl_clsf_listRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 20 10:43:34 KST 2018 */