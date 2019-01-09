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


package chosun.ciis.ad.pub.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_3110_LDataSet(){}
	public AD_PUB_3110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			AD_PUB_3110_LCURLISTRecord rec = new AD_PUB_3110_LCURLISTRecord();
			rec.chcode = Util.checkString(rset0.getString("chcode"));
			rec.cuscode = Util.checkString(rset0.getString("cuscode"));
			rec.cuscodenm = Util.checkString(rset0.getString("cuscodenm"));
			rec.cuscodeern = Util.checkString(rset0.getString("cuscodeern"));
			rec.blndcode = Util.checkString(rset0.getString("blndcode"));
			rec.orgcode = Util.checkString(rset0.getString("orgcode"));
			rec.frdate = Util.checkString(rset0.getString("frdate"));
			rec.todate = Util.checkString(rset0.getString("todate"));
			rec.rcvgrp = Util.checkString(rset0.getString("rcvgrp"));
			rec.chgcode = Util.checkString(rset0.getString("chgcode"));
			rec.stdmonth = Util.checkString(rset0.getString("stdmonth"));
			rec.rcvamt = Util.checkString(rset0.getString("rcvamt"));
			rec.vatcode = Util.checkString(rset0.getString("vatcode"));
			rec.agentcode = Util.checkString(rset0.getString("agentcode"));
			rec.agentcodenm = Util.checkString(rset0.getString("agentcodenm"));
			rec.agentcodeern = Util.checkString(rset0.getString("agentcodeern"));
			rec.agentfee = Util.checkString(rset0.getString("agentfee"));
			rec.agentcode2 = Util.checkString(rset0.getString("agentcode2"));
			rec.agentcodenm2 = Util.checkString(rset0.getString("agentcodenm2"));
			rec.agentcodeern2 = Util.checkString(rset0.getString("agentcodeern2"));
			rec.agentfee2 = Util.checkString(rset0.getString("agentfee2"));
			rec.salecode = Util.checkString(rset0.getString("salecode"));
			rec.saleemp = Util.checkString(rset0.getString("saleemp"));
			rec.deptcode = Util.checkString(rset0.getString("deptcode"));
			rec.deptname = Util.checkString(rset0.getString("deptname"));
			rec.acct_trn_cnfm = Util.checkString(rset0.getString("acct_trn_cnfm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.pubc_occr_dt = Util.checkString(rset0.getString("pubc_occr_dt"));
			rec.pubc_occr_seq = Util.checkString(rset0.getString("pubc_occr_seq"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.acct_yn_1 = Util.checkString(rset0.getString("acct_yn_1"));
			rec.agent_branch_yn = Util.checkString(rset0.getString("agent_branch_yn"));
			rec.medialeb_yn = Util.checkString(rset0.getString("medialeb_yn"));
			rec.xchngadvt_yn = Util.checkString(rset0.getString("xchngadvt_yn"));
			rec.event_cd = Util.checkString(rset0.getString("event_cd"));
			rec.rslt_dept = Util.checkString(rset0.getString("rslt_dept"));
			rec.trst_rate = Util.checkString(rset0.getString("trst_rate"));
			rec.trst_fee = Util.checkString(rset0.getString("trst_fee"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_3110_LDataSet ds = (AD_PUB_3110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_3110_LCURLISTRecord curlistRec = (AD_PUB_3110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.chcode%>
<%= curlistRec.cuscode%>
<%= curlistRec.cuscodenm%>
<%= curlistRec.blndcode%>
<%= curlistRec.orgcode%>
<%= curlistRec.frdate%>
<%= curlistRec.todate%>
<%= curlistRec.rcvgrp%>
<%= curlistRec.chgcode%>
<%= curlistRec.stdmonth%>
<%= curlistRec.rcvamt%>
<%= curlistRec.vatcode%>
<%= curlistRec.agentcode%>
<%= curlistRec.agentcodenm%>
<%= curlistRec.agentfee%>
<%= curlistRec.agentcode2%>
<%= curlistRec.agentcodenm2%>
<%= curlistRec.agentfee2%>
<%= curlistRec.salecode%>
<%= curlistRec.saleemp%>
<%= curlistRec.deptcode%>
<%= curlistRec.deptname%>
<%= curlistRec.acct_trn_cnfm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.pubc_occr_dt%>
<%= curlistRec.pubc_occr_seq%>
<%= curlistRec.clos_yn%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.acct_yn_1%>
<%= curlistRec.agent_branch_yn%>
<%= curlistRec.medialeb_yn%>
<%= curlistRec.xchngadvt_yn%>
<%= curlistRec.event_cd%>
<%= curlistRec.rslt_dept%>
<%= curlistRec.trst_rate%>
<%= curlistRec.trst_fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 30 17:53:37 KST 2015 */