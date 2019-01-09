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


public class FC_FUNC_1111_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1111_LDataSet(){}
	public FC_FUNC_1111_LDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			FC_FUNC_1111_LCURLISTRecord rec = new FC_FUNC_1111_LCURLISTRecord();
			rec.note_amt = Util.checkString(rset1.getString("note_amt"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.issu_pers_nm = Util.checkString(rset1.getString("issu_pers_nm"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.slip_sub_seq = Util.checkString(rset1.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset1.getString("slip_arow_no"));
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dhon_resn_cd = Util.checkString(rset1.getString("dhon_resn_cd"));
			rec.slip_occr_dt2 = Util.checkString(rset1.getString("slip_occr_dt2"));
			rec.slip_clsf_cd2 = Util.checkString(rset1.getString("slip_clsf_cd2"));
			rec.slip_seq2 = Util.checkString(rset1.getString("slip_seq2"));
			rec.slip_no2 = Util.checkString(rset1.getString("slip_no2"));
			rec.dlco_clsf_cd2 = Util.checkString(rset1.getString("dlco_clsf_cd2"));
			rec.dlco_cd2 = Util.checkString(rset1.getString("dlco_cd2"));
			rec.stat_dt = Util.checkString(rset1.getString("stat_dt"));
			rec.dhon_occr_dt = Util.checkString(rset1.getString("dhon_occr_dt"));
			rec.pch_amt1 = Util.checkString(rset1.getString("pch_amt1"));
			rec.pch_amt2 = Util.checkString(rset1.getString("pch_amt2"));
			rec.pch_amt3 = Util.checkString(rset1.getString("pch_amt3"));
			rec.pch_amt4 = Util.checkString(rset1.getString("pch_amt4"));
			rec.pch_compgbnm = Util.checkString(rset1.getString("pch_compgbnm"));
			rec.pch_compnm = Util.checkString(rset1.getString("pch_compnm"));
			rec.pch_bankgbnm = Util.checkString(rset1.getString("pch_bankgbnm"));
			rec.pch_banknm = Util.checkString(rset1.getString("pch_banknm"));
			rec.dhon_resn_nm = Util.checkString(rset1.getString("dhon_resn_nm"));
			rec.pch_amt5 = Util.checkString(rset1.getString("pch_amt5"));
			rec.pch_amt6 = Util.checkString(rset1.getString("pch_amt6"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1111_LDataSet ds = (FC_FUNC_1111_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1111_LCURLISTRecord curlistRec = (FC_FUNC_1111_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.note_amt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_no%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dhon_resn_cd%>
<%= curlistRec.slip_occr_dt2%>
<%= curlistRec.slip_clsf_cd2%>
<%= curlistRec.slip_seq2%>
<%= curlistRec.slip_no2%>
<%= curlistRec.dlco_clsf_cd2%>
<%= curlistRec.dlco_cd2%>
<%= curlistRec.stat_dt%>
<%= curlistRec.dhon_occr_dt%>
<%= curlistRec.pch_amt1%>
<%= curlistRec.pch_amt2%>
<%= curlistRec.pch_amt3%>
<%= curlistRec.pch_amt4%>
<%= curlistRec.pch_compgbnm%>
<%= curlistRec.pch_compnm%>
<%= curlistRec.pch_bankgbnm%>
<%= curlistRec.pch_banknm%>
<%= curlistRec.dhon_resn_nm%>
<%= curlistRec.pch_amt5%>
<%= curlistRec.pch_amt6%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 27 13:33:35 KST 2009 */