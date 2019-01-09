/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 
 */


public class SS_L_BOACCT_LISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList accitmcur = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public ArrayList bankcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_BOACCT_LISTDataSet(){}
	public SS_L_BOACCT_LISTDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_L_BOACCT_LISTCURCOMMLISTRecord rec = new SS_L_BOACCT_LISTCURCOMMLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.acctitem = Util.checkString(rset0.getString("acctitem"));
			rec.acctitem_nm = Util.checkString(rset0.getString("acctitem_nm"));
			rec.depskind = Util.checkString(rset0.getString("depskind"));
			rec.bankcd = Util.checkString(rset0.getString("bankcd"));
			rec.bankcd_nm = Util.checkString(rset0.getString("bankcd_nm"));
			rec.deps_persnm = Util.checkString(rset0.getString("deps_persnm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.incmgpers = Util.checkString(rset0.getString("incmgpers"));
			rec.incmgdt = Util.checkString(rset0.getString("incmgdt"));
			rec.chgpers = Util.checkString(rset0.getString("chgpers"));
			rec.chgdt = Util.checkString(rset0.getString("chgdt"));
			rec.girono = Util.checkString(rset0.getString("girono"));
			rec.cd_atmyn = Util.checkString(rset0.getString("cd_atmyn"));
			rec.bo_cntr_dt = Util.checkString(rset0.getString("bo_cntr_dt"));
			rec.acct_null = Util.checkString(rset0.getString("acct_null"));
			rec.chrg_cnfm_pers = Util.checkString(rset0.getString("chrg_cnfm_pers"));
			rec.chrg_cnfm_dt = Util.checkString(rset0.getString("chrg_cnfm_dt"));
			this.curcommlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(15);
		while(rset1.next()){
			SS_L_BOACCT_LISTACCITMCURRecord rec = new SS_L_BOACCT_LISTACCITMCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.accitmcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(16);
		while(rset2.next()){
			SS_L_BOACCT_LISTBANKCURRecord rec = new SS_L_BOACCT_LISTBANKCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			this.bankcur.add(rec);
		}
		this.totalcnt = cstmt.getLong(17);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_BOACCT_LISTDataSet ds = (SS_L_BOACCT_LISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOACCT_LISTCURCOMMLISTRecord curcommlistRec = (SS_L_BOACCT_LISTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.accitmcur.size(); i++){
		SS_L_BOACCT_LISTACCITMCURRecord accitmcurRec = (SS_L_BOACCT_LISTACCITMCURRecord)ds.accitmcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bankcur.size(); i++){
		SS_L_BOACCT_LISTBANKCURRecord bankcurRec = (SS_L_BOACCT_LISTBANKCURRecord)ds.bankcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getAccitmcur()%>
<%= ds.getBankcur()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bocd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.seq%>
<%= curcommlistRec.acctitem%>
<%= curcommlistRec.acctitem_nm%>
<%= curcommlistRec.depskind%>
<%= curcommlistRec.bankcd%>
<%= curcommlistRec.bankcd_nm%>
<%= curcommlistRec.deps_persnm%>
<%= curcommlistRec.acctno%>
<%= curcommlistRec.remk%>
<%= curcommlistRec.incmgpers%>
<%= curcommlistRec.incmgdt%>
<%= curcommlistRec.chgpers%>
<%= curcommlistRec.chgdt%>
<%= curcommlistRec.girono%>
<%= curcommlistRec.cd_atmyn%>
<%= curcommlistRec.bo_cntr_dt%>
<%= curcommlistRec.acct_null%>
<%= curcommlistRec.chrg_cnfm_pers%>
<%= curcommlistRec.chrg_cnfm_dt%>
<%= accitmcurRec.cicodeval%>
<%= accitmcurRec.cicdnm%>
<%= bankcurRec.cicodeval%>
<%= bankcurRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 19 14:54:23 KST 2017 */