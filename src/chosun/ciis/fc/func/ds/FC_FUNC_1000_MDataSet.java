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


public class FC_FUNC_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_note_clehous_list = new ArrayList();
	public ArrayList cur_issu_cmpy_list = new ArrayList();
	public ArrayList cur_pay_plac_list = new ArrayList();
	public ArrayList cur_note_clsf_list = new ArrayList();
	public ArrayList cur_dlco_clsf_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1000_MDataSet(){}
	public FC_FUNC_1000_MDataSet(String errcode, String errmsg){
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
			FC_FUNC_1000_MCUR_NOTE_CLSF_LISTRecord rec = new FC_FUNC_1000_MCUR_NOTE_CLSF_LISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.cur_note_clsf_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_1000_MCUR_ISSU_CMPY_LISTRecord rec = new FC_FUNC_1000_MCUR_ISSU_CMPY_LISTRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.cur_issu_cmpy_list.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_1000_MCUR_PAY_PLAC_LISTRecord rec = new FC_FUNC_1000_MCUR_PAY_PLAC_LISTRecord();
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.cur_pay_plac_list.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_FUNC_1000_MCUR_NOTE_CLEHOUS_LISTRecord rec = new FC_FUNC_1000_MCUR_NOTE_CLEHOUS_LISTRecord();
			rec.cd_nm = Util.checkString(rset3.getString("cd_nm"));
			rec.cd = Util.checkString(rset3.getString("cd"));
			this.cur_note_clehous_list.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_FUNC_1000_MCUR_DLCO_CLSF_LISTRecord rec = new FC_FUNC_1000_MCUR_DLCO_CLSF_LISTRecord();
			rec.cd_nm = Util.checkString(rset4.getString("cd_nm"));
			rec.cd = Util.checkString(rset4.getString("cd"));
			this.cur_dlco_clsf_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1000_MDataSet ds = (FC_FUNC_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_note_clsf_list.size(); i++){
		FC_FUNC_1000_MCUR_NOTE_CLSF_LISTRecord cur_note_clsf_listRec = (FC_FUNC_1000_MCUR_NOTE_CLSF_LISTRecord)ds.cur_note_clsf_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_issu_cmpy_list.size(); i++){
		FC_FUNC_1000_MCUR_ISSU_CMPY_LISTRecord cur_issu_cmpy_listRec = (FC_FUNC_1000_MCUR_ISSU_CMPY_LISTRecord)ds.cur_issu_cmpy_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_pay_plac_list.size(); i++){
		FC_FUNC_1000_MCUR_PAY_PLAC_LISTRecord cur_pay_plac_listRec = (FC_FUNC_1000_MCUR_PAY_PLAC_LISTRecord)ds.cur_pay_plac_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_note_clehous_list.size(); i++){
		FC_FUNC_1000_MCUR_NOTE_CLEHOUS_LISTRecord cur_note_clehous_listRec = (FC_FUNC_1000_MCUR_NOTE_CLEHOUS_LISTRecord)ds.cur_note_clehous_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_dlco_clsf_list.size(); i++){
		FC_FUNC_1000_MCUR_DLCO_CLSF_LISTRecord cur_dlco_clsf_listRec = (FC_FUNC_1000_MCUR_DLCO_CLSF_LISTRecord)ds.cur_dlco_clsf_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_note_clsf_list()%>
<%= ds.getCur_issu_cmpy_list()%>
<%= ds.getCur_pay_plac_list()%>
<%= ds.getCur_note_clehous_list()%>
<%= ds.getCur_dlco_clsf_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_note_clsf_listRec.cd_nm%>
<%= cur_note_clsf_listRec.cd%>
<%= cur_issu_cmpy_listRec.cd_nm%>
<%= cur_issu_cmpy_listRec.cd%>
<%= cur_pay_plac_listRec.cd_nm%>
<%= cur_pay_plac_listRec.cd%>
<%= cur_note_clehous_listRec.cd_nm%>
<%= cur_note_clehous_listRec.cd%>
<%= cur_dlco_clsf_listRec.cd_nm%>
<%= cur_dlco_clsf_listRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 11 11:46:20 KST 2012 */