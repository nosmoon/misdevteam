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


public class FC_FUNC_1400_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdrcr_stat_cd = new ArrayList();
	public ArrayList curdrcr_now_note_stat_cd = new ArrayList();
	public ArrayList curdrcr_bcompgbcd2 = new ArrayList();
	public ArrayList curdrcr_bcompgbcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1400_MDataSet(){}
	public FC_FUNC_1400_MDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			FC_FUNC_1400_MCURDRCR_NOW_NOTE_STAT_CDRecord rec = new FC_FUNC_1400_MCURDRCR_NOW_NOTE_STAT_CDRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curdrcr_now_note_stat_cd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			FC_FUNC_1400_MCURDRCR_STAT_CDRecord rec = new FC_FUNC_1400_MCURDRCR_STAT_CDRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curdrcr_stat_cd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			FC_FUNC_1400_MCURDRCR_BCOMPGBCDRecord rec = new FC_FUNC_1400_MCURDRCR_BCOMPGBCDRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curdrcr_bcompgbcd.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			FC_FUNC_1400_MCURDRCR_BCOMPGBCD2Record rec = new FC_FUNC_1400_MCURDRCR_BCOMPGBCD2Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.curdrcr_bcompgbcd2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1400_MDataSet ds = (FC_FUNC_1400_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdrcr_now_note_stat_cd.size(); i++){
		FC_FUNC_1400_MCURDRCR_NOW_NOTE_STAT_CDRecord curdrcr_now_note_stat_cdRec = (FC_FUNC_1400_MCURDRCR_NOW_NOTE_STAT_CDRecord)ds.curdrcr_now_note_stat_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_stat_cd.size(); i++){
		FC_FUNC_1400_MCURDRCR_STAT_CDRecord curdrcr_stat_cdRec = (FC_FUNC_1400_MCURDRCR_STAT_CDRecord)ds.curdrcr_stat_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_bcompgbcd.size(); i++){
		FC_FUNC_1400_MCURDRCR_BCOMPGBCDRecord curdrcr_bcompgbcdRec = (FC_FUNC_1400_MCURDRCR_BCOMPGBCDRecord)ds.curdrcr_bcompgbcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_bcompgbcd2.size(); i++){
		FC_FUNC_1400_MCURDRCR_BCOMPGBCD2Record curdrcr_bcompgbcd2Rec = (FC_FUNC_1400_MCURDRCR_BCOMPGBCD2Record)ds.curdrcr_bcompgbcd2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdrcr_now_note_stat_cd()%>
<%= ds.getCurdrcr_stat_cd()%>
<%= ds.getCurdrcr_bcompgbcd()%>
<%= ds.getCurdrcr_bcompgbcd2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdrcr_now_note_stat_cdRec.cd%>
<%= curdrcr_now_note_stat_cdRec.cdnm%>
<%= curdrcr_now_note_stat_cdRec.cd_abrv_nm%>
<%= curdrcr_now_note_stat_cdRec.cdnm_cd%>
<%= curdrcr_now_note_stat_cdRec.cdabrvnm_cd%>
<%= curdrcr_stat_cdRec.cd%>
<%= curdrcr_stat_cdRec.cdnm%>
<%= curdrcr_stat_cdRec.cd_abrv_nm%>
<%= curdrcr_stat_cdRec.cdnm_cd%>
<%= curdrcr_stat_cdRec.cdabrvnm_cd%>
<%= curdrcr_bcompgbcdRec.cd%>
<%= curdrcr_bcompgbcdRec.cdnm%>
<%= curdrcr_bcompgbcdRec.cd_abrv_nm%>
<%= curdrcr_bcompgbcdRec.cdnm_cd%>
<%= curdrcr_bcompgbcdRec.cdabrvnm_cd%>
<%= curdrcr_bcompgbcd2Rec.cd%>
<%= curdrcr_bcompgbcd2Rec.cdnm%>
<%= curdrcr_bcompgbcd2Rec.cd_abrv_nm%>
<%= curdrcr_bcompgbcd2Rec.cdnm_cd%>
<%= curdrcr_bcompgbcd2Rec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 14:25:26 KST 2009 */