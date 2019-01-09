/***************************************************************************************************
* 파일명 : .java
* 기능 : 자금관리-받을어음할인등록
* 작성일자 : 2009-02-19
* 작성자 : 노상현
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
 * 자금관리-받을어음할인등록
 */


public class FC_FUNC_1031_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rcpmshetlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1031_LDataSet(){}
	public FC_FUNC_1031_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_FUNC_1031_LRCPMSHETLISTRecord rec = new FC_FUNC_1031_LRCPMSHETLISTRecord();
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.pay_plac_cd = Util.checkString(rset0.getString("pay_plac_cd"));
			rec.now_note_stat_cd = Util.checkString(rset0.getString("now_note_stat_cd"));
			rec.now_note_stat_cdnm = Util.checkString(rset0.getString("now_note_stat_cdnm"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.pay_plac_cdnm = Util.checkString(rset0.getString("pay_plac_cdnm"));
			rec.note_clsf_cdnm = Util.checkString(rset0.getString("note_clsf_cdnm"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			this.rcpmshetlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1031_LDataSet ds = (FC_FUNC_1031_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rcpmshetlist.size(); i++){
		FC_FUNC_1031_LRCPMSHETLISTRecord rcpmshetlistRec = (FC_FUNC_1031_LRCPMSHETLISTRecord)ds.rcpmshetlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRcpmshetlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rcpmshetlistRec.note_clsf_cd%>
<%= rcpmshetlistRec.bank_cd%>
<%= rcpmshetlistRec.note_no%>
<%= rcpmshetlistRec.note_seq%>
<%= rcpmshetlistRec.mtry_dt%>
<%= rcpmshetlistRec.note_amt%>
<%= rcpmshetlistRec.issu_pers_nm%>
<%= rcpmshetlistRec.dlco_clsf_cd%>
<%= rcpmshetlistRec.dlco_cd%>
<%= rcpmshetlistRec.pay_plac_cd%>
<%= rcpmshetlistRec.now_note_stat_cd%>
<%= rcpmshetlistRec.now_note_stat_cdnm%>
<%= rcpmshetlistRec.compnm%>
<%= rcpmshetlistRec.pay_plac_cdnm%>
<%= rcpmshetlistRec.note_clsf_cdnm%>
<%= rcpmshetlistRec.coms%>
<%= rcpmshetlistRec.slip_occr_dt%>
<%= rcpmshetlistRec.slip_clsf_cd%>
<%= rcpmshetlistRec.slip_seq%>
<%= rcpmshetlistRec.slip_sub_seq%>
<%= rcpmshetlistRec.slip_arow_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 25 16:28:39 KST 2009 */