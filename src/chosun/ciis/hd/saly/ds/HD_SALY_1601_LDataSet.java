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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1601_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_1601_LDataSet(){}
	public HD_SALY_1601_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_SALY_1601_LCURLISTRecord rec = new HD_SALY_1601_LCURLISTRecord();
			rec.saly_yy = Util.checkString(rset0.getString("saly_yy"));
			rec.saly_no = Util.checkString(rset0.getString("saly_no"));
			rec.pay_saly = Util.checkString(rset0.getString("pay_saly"));
			rec.yymm_alon = Util.checkString(rset0.getString("yymm_alon"));
			rec.hody_alon = Util.checkString(rset0.getString("hody_alon"));
			rec.non_regu_alon_stot = Util.checkString(rset0.getString("non_regu_alon_stot"));
			rec.etc_saly_amt1 = Util.checkString(rset0.getString("etc_saly_amt1"));
			rec.etc_saly_amt = Util.checkString(rset0.getString("etc_saly_amt"));
			rec.lvcmpy_alon = Util.checkString(rset0.getString("lvcmpy_alon"));
			rec.corr_base_stay_fee = Util.checkString(rset0.getString("corr_base_stay_fee"));
			rec.bns = Util.checkString(rset0.getString("bns"));
			rec.mm_saly = Util.checkString(rset0.getString("mm_saly"));
			rec.non_tax_stot = Util.checkString(rset0.getString("non_tax_stot"));
			rec.emp_insr_fee = Util.checkString(rset0.getString("emp_insr_fee"));
			rec.np_slf_ctrb_amt = Util.checkString(rset0.getString("np_slf_ctrb_amt"));
			rec.hlth_insr_fee = Util.checkString(rset0.getString("hlth_insr_fee"));
			rec.hlth_insr_med_care_insr_fee = Util.checkString(rset0.getString("hlth_insr_med_care_insr_fee"));
			rec.incm_tax = Util.checkString(rset0.getString("incm_tax"));
			rec.res_tax = Util.checkString(rset0.getString("res_tax"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_SALY_1601_LCURLIST2Record rec = new HD_SALY_1601_LCURLIST2Record();
			rec.saly_yyymm = Util.checkString(rset1.getString("saly_yyymm"));
			rec.base_saly = Util.checkString(rset1.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset1.getString("posk_saly"));
			rec.baseposk_saly = Util.checkString(rset1.getString("baseposk_saly"));
			rec.yymm_alon = Util.checkString(rset1.getString("yymm_alon"));
			rec.holy_alon = Util.checkString(rset1.getString("holy_alon"));
			rec.non_regu_alon_stot = Util.checkString(rset1.getString("non_regu_alon_stot"));
			rec.month_saly_sum = Util.checkString(rset1.getString("month_saly_sum"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_1601_LDataSet ds = (HD_SALY_1601_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_1601_LCURLISTRecord curlistRec = (HD_SALY_1601_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_SALY_1601_LCURLIST2Record curlist2Rec = (HD_SALY_1601_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.saly_yy%>
<%= curlistRec.saly_no%>
<%= curlistRec.pay_saly%>
<%= curlistRec.yymm_alon%>
<%= curlistRec.hody_alon%>
<%= curlistRec.non_regu_alon_stot%>
<%= curlistRec.etc_saly_amt1%>
<%= curlistRec.etc_saly_amt%>
<%= curlistRec.lvcmpy_alon%>
<%= curlistRec.corr_base_stay_fee%>
<%= curlistRec.bns%>
<%= curlistRec.mm_saly%>
<%= curlistRec.non_tax_stot%>
<%= curlistRec.emp_insr_fee%>
<%= curlistRec.np_slf_ctrb_amt%>
<%= curlistRec.hlth_insr_fee%>
<%= curlistRec.hlth_insr_med_care_insr_fee%>
<%= curlistRec.incm_tax%>
<%= curlistRec.res_tax%>
<%= curlist2Rec.saly_yyymm%>
<%= curlist2Rec.base_saly%>
<%= curlist2Rec.posk_saly%>
<%= curlist2Rec.baseposk_saly%>
<%= curlist2Rec.yymm_alon%>
<%= curlist2Rec.holy_alon%>
<%= curlist2Rec.non_regu_alon_stot%>
<%= curlist2Rec.month_saly_sum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 30 10:51:59 KST 2009 */