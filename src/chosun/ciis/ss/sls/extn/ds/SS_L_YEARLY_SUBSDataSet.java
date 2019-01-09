/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_YEARLY_SUBSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long selcnt;
	public long usecnt;

	public SS_L_YEARLY_SUBSDataSet(){}
	public SS_L_YEARLY_SUBSDataSet(String errcode, String errmsg, long selcnt, long usecnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.selcnt = selcnt;
		this.usecnt = usecnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSelcnt(long selcnt){
		this.selcnt = selcnt;
	}

	public void setUsecnt(long usecnt){
		this.usecnt = usecnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getSelcnt(){
		return this.selcnt;
	}

	public long getUsecnt(){
		return this.usecnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.selcnt = cstmt.getLong(12);
		this.usecnt = cstmt.getLong(13);
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_L_YEARLY_SUBSCURCOMMLISTRecord rec = new SS_L_YEARLY_SUBSCURCOMMLISTRecord();
			rec.seldt = Util.checkString(rset0.getString("seldt"));
			rec.empnm = Util.checkString(rset0.getString("empnm"));
			rec.empno = Util.checkString(rset0.getString("empno"));
			rec.cmpynm = Util.checkString(rset0.getString("cmpynm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.teamnm = Util.checkString(rset0.getString("teamnm"));
			rec.emp_telno = Util.checkString(rset0.getString("emp_telno"));
			rec.cpnno = Util.checkString(rset0.getString("cpnno"));
			rec.cpntypecd = rset0.getInt("cpntypecd");
			rec.freemm = Util.checkString(rset0.getString("freemm"));
			rec.extnfee = rset0.getInt("extnfee");
			rec.expdt = Util.checkString(rset0.getString("expdt"));
			rec.shftdt = Util.checkString(rset0.getString("shftdt"));
			rec.shftcd = Util.checkString(rset0.getString("shftcd"));
			rec.shftnm = Util.checkString(rset0.getString("shftnm"));
			rec.shftamt = rset0.getInt("shftamt");
			rec.shftyn = Util.checkString(rset0.getString("shftyn"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.deps_persnm = Util.checkString(rset0.getString("deps_persnm"));
			rec.sendyn = Util.checkString(rset0.getString("sendyn"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvhopedt = Util.checkString(rset0.getString("dlvhopedt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.extnbonm = Util.checkString(rset0.getString("extnbonm"));
			rec.extnbo_tel = Util.checkString(rset0.getString("extnbo_tel"));
			rec.bo_headyn = Util.checkString(rset0.getString("bo_headyn"));
			rec.subscnfm = Util.checkString(rset0.getString("subscnfm"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_YEARLY_SUBSDataSet ds = (SS_L_YEARLY_SUBSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_YEARLY_SUBSCURCOMMLISTRecord curcommlistRec = (SS_L_YEARLY_SUBSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSelcnt()%>
<%= ds.getUsecnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.seldt%>
<%= curcommlistRec.empnm%>
<%= curcommlistRec.empno%>
<%= curcommlistRec.cmpynm%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.teamnm%>
<%= curcommlistRec.emp_telno%>
<%= curcommlistRec.cpnno%>
<%= curcommlistRec.cpntypecd%>
<%= curcommlistRec.freemm%>
<%= curcommlistRec.extnfee%>
<%= curcommlistRec.expdt%>
<%= curcommlistRec.shftdt%>
<%= curcommlistRec.shftcd%>
<%= curcommlistRec.shftnm%>
<%= curcommlistRec.shftamt%>
<%= curcommlistRec.shftyn%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.banknm%>
<%= curcommlistRec.acctno%>
<%= curcommlistRec.deps_persnm%>
<%= curcommlistRec.sendyn%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.rdrtel_no%>
<%= curcommlistRec.dlvaddr%>
<%= curcommlistRec.dlvhopedt%>
<%= curcommlistRec.remk%>
<%= curcommlistRec.extnbonm%>
<%= curcommlistRec.extnbo_tel%>
<%= curcommlistRec.bo_headyn%>
<%= curcommlistRec.subscnfm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 29 02:11:26 GMT 2013 */