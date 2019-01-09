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


public class FC_FUNC_1010_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdrcr_dlco_clsf_cd = new ArrayList();
	public ArrayList curdrcr_pay_plac_cd = new ArrayList();
	public ArrayList curdrcr_note_clehous_cd = new ArrayList();
	public ArrayList curdrcr_note_clsf_cd = new ArrayList();
	public ArrayList curdrcr_eeygtj = new ArrayList();
	public ArrayList curdrcr_issu_cmpy_clsf_cd = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1010_MDataSet(){}
	public FC_FUNC_1010_MDataSet(String errcode, String errmsg){
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
			FC_FUNC_1010_MCURDRCR_NOTE_CLSF_CDRecord rec = new FC_FUNC_1010_MCURDRCR_NOTE_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curdrcr_note_clsf_cd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_1010_MCURDRCR_ISSU_CMPY_CLSF_CDRecord rec = new FC_FUNC_1010_MCURDRCR_ISSU_CMPY_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.curdrcr_issu_cmpy_clsf_cd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_1010_MCURDRCR_PAY_PLAC_CDRecord rec = new FC_FUNC_1010_MCURDRCR_PAY_PLAC_CDRecord();
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.curdrcr_pay_plac_cd.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_FUNC_1010_MCURDRCR_NOTE_CLEHOUS_CDRecord rec = new FC_FUNC_1010_MCURDRCR_NOTE_CLEHOUS_CDRecord();
			rec.cd_nm = Util.checkString(rset3.getString("cd_nm"));
			rec.cd = Util.checkString(rset3.getString("cd"));
			this.curdrcr_note_clehous_cd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_FUNC_1010_MCURDRCR_DLCO_CLSF_CDRecord rec = new FC_FUNC_1010_MCURDRCR_DLCO_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset4.getString("cd_nm"));
			rec.cd = Util.checkString(rset4.getString("cd"));
			this.curdrcr_dlco_clsf_cd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			FC_FUNC_1010_MCURDRCR_EEYGTJRecord rec = new FC_FUNC_1010_MCURDRCR_EEYGTJRecord();
			rec.cd_nm = Util.checkString(rset5.getString("cd_nm"));
			rec.cd = Util.checkString(rset5.getString("cd"));
			this.curdrcr_eeygtj.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1010_MDataSet ds = (FC_FUNC_1010_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdrcr_note_clsf_cd.size(); i++){
		FC_FUNC_1010_MCURDRCR_NOTE_CLSF_CDRecord curdrcr_note_clsf_cdRec = (FC_FUNC_1010_MCURDRCR_NOTE_CLSF_CDRecord)ds.curdrcr_note_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_issu_cmpy_clsf_cd.size(); i++){
		FC_FUNC_1010_MCURDRCR_ISSU_CMPY_CLSF_CDRecord curdrcr_issu_cmpy_clsf_cdRec = (FC_FUNC_1010_MCURDRCR_ISSU_CMPY_CLSF_CDRecord)ds.curdrcr_issu_cmpy_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_pay_plac_cd.size(); i++){
		FC_FUNC_1010_MCURDRCR_PAY_PLAC_CDRecord curdrcr_pay_plac_cdRec = (FC_FUNC_1010_MCURDRCR_PAY_PLAC_CDRecord)ds.curdrcr_pay_plac_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_note_clehous_cd.size(); i++){
		FC_FUNC_1010_MCURDRCR_NOTE_CLEHOUS_CDRecord curdrcr_note_clehous_cdRec = (FC_FUNC_1010_MCURDRCR_NOTE_CLEHOUS_CDRecord)ds.curdrcr_note_clehous_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_dlco_clsf_cd.size(); i++){
		FC_FUNC_1010_MCURDRCR_DLCO_CLSF_CDRecord curdrcr_dlco_clsf_cdRec = (FC_FUNC_1010_MCURDRCR_DLCO_CLSF_CDRecord)ds.curdrcr_dlco_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_eeygtj.size(); i++){
		FC_FUNC_1010_MCURDRCR_EEYGTJRecord curdrcr_eeygtjRec = (FC_FUNC_1010_MCURDRCR_EEYGTJRecord)ds.curdrcr_eeygtj.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdrcr_note_clsf_cd()%>
<%= ds.getCurdrcr_issu_cmpy_clsf_cd()%>
<%= ds.getCurdrcr_pay_plac_cd()%>
<%= ds.getCurdrcr_note_clehous_cd()%>
<%= ds.getCurdrcr_dlco_clsf_cd()%>
<%= ds.getCurdrcr_eeygtj()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdrcr_note_clsf_cdRec.cd_nm%>
<%= curdrcr_note_clsf_cdRec.cd%>
<%= curdrcr_issu_cmpy_clsf_cdRec.cd_nm%>
<%= curdrcr_issu_cmpy_clsf_cdRec.cd%>
<%= curdrcr_pay_plac_cdRec.cd_nm%>
<%= curdrcr_pay_plac_cdRec.cd%>
<%= curdrcr_note_clehous_cdRec.cd_nm%>
<%= curdrcr_note_clehous_cdRec.cd%>
<%= curdrcr_dlco_clsf_cdRec.cd_nm%>
<%= curdrcr_dlco_clsf_cdRec.cd%>
<%= curdrcr_eeygtjRec.cd_nm%>
<%= curdrcr_eeygtjRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 03 18:01:34 KST 2012 */