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


public class FC_FUNC_1104_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1104_LDataSet(){}
	public FC_FUNC_1104_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_FUNC_1104_LCURLISTRecord rec = new FC_FUNC_1104_LCURLISTRecord();
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.now_note_stat_cd = Util.checkString(rset0.getString("now_note_stat_cd"));
			rec.jpgbnm = Util.checkString(rset0.getString("jpgbnm"));
			rec.eegbnm = Util.checkString(rset0.getString("eegbnm"));
			rec.compgbnm = Util.checkString(rset0.getString("compgbnm"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.eestnm = Util.checkString(rset0.getString("eestnm"));
			rec.dlco_clsf_cd2 = Util.checkString(rset0.getString("dlco_clsf_cd2"));
			rec.dlco_cd2 = Util.checkString(rset0.getString("dlco_cd2"));
			rec.patr_budg_cd = Util.checkString(rset0.getString("patr_budg_cd"));
			rec.deps_clsf_cd = Util.checkString(rset0.getString("deps_clsf_cd"));
			rec.deps_dt = Util.checkString(rset0.getString("deps_dt"));
			rec.dhon_resn_cd = Util.checkString(rset0.getString("dhon_resn_cd"));
			rec.dhon_occr_dt = Util.checkString(rset0.getString("dhon_occr_dt"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd2 = Util.checkString(rset0.getString("slip_clsf_cd2"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.escompnm = Util.checkString(rset0.getString("escompnm"));
			rec.frex_cd = Util.checkString(rset0.getString("frex_cd"));
			rec.exrate = Util.checkString(rset0.getString("exrate"));
			rec.frex_amt = Util.checkString(rset0.getString("frex_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1104_LDataSet ds = (FC_FUNC_1104_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1104_LCURLISTRecord curlistRec = (FC_FUNC_1104_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.bank_cd%>
<%= curlistRec.note_no%>
<%= curlistRec.note_seq%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.note_amt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.jpgbnm%>
<%= curlistRec.eegbnm%>
<%= curlistRec.compgbnm%>
<%= curlistRec.compnm%>
<%= curlistRec.eestnm%>
<%= curlistRec.dlco_clsf_cd2%>
<%= curlistRec.dlco_cd2%>
<%= curlistRec.patr_budg_cd%>
<%= curlistRec.deps_clsf_cd%>
<%= curlistRec.deps_dt%>
<%= curlistRec.dhon_resn_cd%>
<%= curlistRec.dhon_occr_dt%>
<%= curlistRec.rmks1%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd2%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_no%>
<%= curlistRec.escompnm%>
<%= curlistRec.frex_cd%>
<%= curlistRec.exrate%>
<%= curlistRec.frex_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 10 11:01:44 KST 2009 */