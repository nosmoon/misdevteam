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


package chosun.ciis.ss.sls.move.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 
 */


public class SS_L_MOVM_RDR_COSTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String clos;
	public String closdt;

	public SS_L_MOVM_RDR_COSTDataSet(){}
	public SS_L_MOVM_RDR_COSTDataSet(String errcode, String errmsg, String clos, String closdt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.clos = clos;
		this.closdt = closdt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClos(String clos){
		this.clos = clos;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClos(){
		return this.clos;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_L_MOVM_RDR_COSTCURCOMMLISTRecord rec = new SS_L_MOVM_RDR_COSTCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.trsfqty = Util.checkString(rset0.getString("trsfqty"));
			rec.trsfamt = Util.checkString(rset0.getString("trsfamt"));
			rec.acptqty = Util.checkString(rset0.getString("acptqty"));
			rec.acptamt = Util.checkString(rset0.getString("acptamt"));
			rec.sumamt = Util.checkString(rset0.getString("sumamt"));
			rec.sendamt = Util.checkString(rset0.getString("sendamt"));
			rec.bankcd = Util.checkString(rset0.getString("bankcd"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.deps_persnm = Util.checkString(rset0.getString("deps_persnm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.closmm = Util.checkString(rset0.getString("closmm"));
			this.curcommlist.add(rec);
		}
		this.clos = Util.checkString(cstmt.getString(11));
		this.closdt = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_MOVM_RDR_COSTDataSet ds = (SS_L_MOVM_RDR_COSTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MOVM_RDR_COSTCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDR_COSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getClos()%>
<%= ds.getClosdt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.partcd%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.trsfqty%>
<%= curcommlistRec.trsfamt%>
<%= curcommlistRec.acptqty%>
<%= curcommlistRec.acptamt%>
<%= curcommlistRec.sumamt%>
<%= curcommlistRec.sendamt%>
<%= curcommlistRec.bankcd%>
<%= curcommlistRec.banknm%>
<%= curcommlistRec.deps_persnm%>
<%= curcommlistRec.acctno%>
<%= curcommlistRec.closmm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 24 08:44:43 GMT 2014 */