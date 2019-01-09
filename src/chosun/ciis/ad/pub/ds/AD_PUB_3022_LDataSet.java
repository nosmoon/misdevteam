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


public class AD_PUB_3022_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_3022_LDataSet(){}
	public AD_PUB_3022_LDataSet(String errcode, String errmsg){
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
			AD_PUB_3022_LCURLISTRecord rec = new AD_PUB_3022_LCURLISTRecord();
			rec.chcode = Util.checkString(rset0.getString("chcode"));
			rec.cuscode = Util.checkString(rset0.getString("cuscode"));
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
			rec.agentfee = Util.checkString(rset0.getString("agentfee"));
			rec.salecode = Util.checkString(rset0.getString("salecode"));
			rec.saleemp = Util.checkString(rset0.getString("saleemp"));
			rec.deptcode = Util.checkString(rset0.getString("deptcode"));
			rec.deptname = Util.checkString(rset0.getString("deptname"));
			rec.dtlseq = Util.checkString(rset0.getString("dtlseq"));
			rec.zpcode = Util.checkString(rset0.getString("zpcode"));
			rec.zpname = Util.checkString(rset0.getString("zpname"));
			rec.stdamt = Util.checkString(rset0.getString("stdamt"));
			rec.divamt = Util.checkString(rset0.getString("divamt"));
			rec.divvatamt = Util.checkString(rset0.getString("divvatamt"));
			rec.agentstdamt = Util.checkString(rset0.getString("agentstdamt"));
			rec.agentdivamt = Util.checkString(rset0.getString("agentdivamt"));
			rec.agentdivvatamt = Util.checkString(rset0.getString("agentdivvatamt"));
			rec.acct_trn_cnfm = Util.checkString(rset0.getString("acct_trn_cnfm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.pubc_occr_dt = Util.checkString(rset0.getString("pubc_occr_dt"));
			rec.pubc_occr_seq = Util.checkString(rset0.getString("pubc_occr_seq"));
			rec.dtl_num = Util.checkString(rset0.getString("dtl_num"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_3022_LDataSet ds = (AD_PUB_3022_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_3022_LCURLISTRecord curlistRec = (AD_PUB_3022_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.agentfee%>
<%= curlistRec.salecode%>
<%= curlistRec.saleemp%>
<%= curlistRec.deptcode%>
<%= curlistRec.deptname%>
<%= curlistRec.dtlseq%>
<%= curlistRec.zpcode%>
<%= curlistRec.zpname%>
<%= curlistRec.stdamt%>
<%= curlistRec.divamt%>
<%= curlistRec.divvatamt%>
<%= curlistRec.agentstdamt%>
<%= curlistRec.agentdivamt%>
<%= curlistRec.agentdivvatamt%>
<%= curlistRec.acct_trn_cnfm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.pubc_occr_dt%>
<%= curlistRec.pubc_occr_seq%>
<%= curlistRec.dtl_num%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 31 19:43:11 KST 2012 */