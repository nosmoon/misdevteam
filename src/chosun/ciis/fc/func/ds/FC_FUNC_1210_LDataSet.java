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


public class FC_FUNC_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1210_LDataSet(){}
	public FC_FUNC_1210_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_1210_LCURLISTRecord rec = new FC_FUNC_1210_LCURLISTRecord();
			rec.pch_eegbnm = Util.checkString(rset1.getString("pch_eegbnm"));
			rec.nbn_no = Util.checkString(rset1.getString("nbn_no"));
			rec.note_amt = Util.checkString(rset1.getString("note_amt"));
			rec.bmdsamt = Util.checkString(rset1.getString("bmdsamt"));
			rec.bmsbamt = Util.checkString(rset1.getString("bmsbamt"));
			rec.dhon_occr_dt = Util.checkString(rset1.getString("dhon_occr_dt"));
			rec.pch_budosayunm = Util.checkString(rset1.getString("pch_budosayunm"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.pch_jpgbnm = Util.checkString(rset1.getString("pch_jpgbnm"));
			rec.dlcd_nm = Util.checkString(rset1.getString("dlcd_nm"));
			rec.pch_compnm = Util.checkString(rset1.getString("pch_compnm"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.issu_pers_nm = Util.checkString(rset1.getString("issu_pers_nm"));
			rec.pch_eestnm = Util.checkString(rset1.getString("pch_eestnm"));
			rec.note_clsf_cd = Util.checkString(rset1.getString("note_clsf_cd"));
			rec.note_no = Util.checkString(rset1.getString("note_no"));
			rec.bank_cd = Util.checkString(rset1.getString("bank_cd"));
			rec.note_seq = Util.checkString(rset1.getString("note_seq"));
			rec.dhon_resn_cd = Util.checkString(rset1.getString("dhon_resn_cd"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.now_note_stat_cd = Util.checkString(rset1.getString("now_note_stat_cd"));
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1210_LDataSet ds = (FC_FUNC_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1210_LCURLISTRecord curlistRec = (FC_FUNC_1210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pch_eegbnm%>
<%= curlistRec.nbn_no%>
<%= curlistRec.note_amt%>
<%= curlistRec.bmdsamt%>
<%= curlistRec.bmsbamt%>
<%= curlistRec.dhon_occr_dt%>
<%= curlistRec.pch_budosayunm%>
<%= curlistRec.slip_no%>
<%= curlistRec.pch_jpgbnm%>
<%= curlistRec.dlcd_nm%>
<%= curlistRec.pch_compnm%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.pch_eestnm%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.note_no%>
<%= curlistRec.bank_cd%>
<%= curlistRec.note_seq%>
<%= curlistRec.dhon_resn_cd%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 14:52:54 KST 2009 */