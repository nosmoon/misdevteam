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


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */


public class SS_L_VACT_STATDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curbolist = new ArrayList();
	public ArrayList curprintlist = new ArrayList();
	public ArrayList curshftlist = new ArrayList();
	public ArrayList curbanklist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_VACT_STATDataSet(){}
	public SS_L_VACT_STATDataSet(String errcode, String errmsg){
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
			SS_L_VACT_STATCURBOLISTRecord rec = new SS_L_VACT_STATCURBOLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.totcnt = rset0.getInt("totcnt");
			rec.totamt = rset0.getInt("totamt");
			rec.normlcnt = rset0.getInt("normlcnt");
			rec.normlamt = rset0.getInt("normlamt");
			rec.errcnt = rset0.getInt("errcnt");
			rec.erramt = rset0.getInt("erramt");
			this.curbolist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(13);
		while(rset1.next()){
			SS_L_VACT_STATCURSHFTLISTRecord rec = new SS_L_VACT_STATCURSHFTLISTRecord();
			rec.shftdt = Util.checkString(rset1.getString("shftdt"));
			rec.totcnt = rset1.getInt("totcnt");
			rec.totamt = rset1.getInt("totamt");
			rec.normlcnt = rset1.getInt("normlcnt");
			rec.normlamt = rset1.getInt("normlamt");
			rec.errcnt = rset1.getInt("errcnt");
			rec.erramt = rset1.getInt("erramt");
			this.curshftlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(14);
		while(rset2.next()){
			SS_L_VACT_STATCURBANKLISTRecord rec = new SS_L_VACT_STATCURBANKLISTRecord();
			rec.banknm = Util.checkString(rset2.getString("banknm"));
			rec.bankcd = Util.checkString(rset2.getString("bankcd"));
			rec.totcnt = rset2.getInt("totcnt");
			rec.totamt = rset2.getInt("totamt");
			rec.normlcnt = rset2.getInt("normlcnt");
			rec.normlamt = rset2.getInt("normlamt");
			rec.errcnt = rset2.getInt("errcnt");
			rec.erramt = rset2.getInt("erramt");
			this.curbanklist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(15);
		while(rset3.next()){
			SS_L_VACT_STATCURPRINTLISTRecord rec = new SS_L_VACT_STATCURPRINTLISTRecord();
			rec.subsmappli = Util.checkString(rset3.getString("subsmappli"));
			rec.bocd = Util.checkString(rset3.getString("bocd"));
			rec.bonm = Util.checkString(rset3.getString("bonm"));
			rec.bank_cd = Util.checkString(rset3.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset3.getString("bank_nm"));
			rec.totcnt = Util.checkString(rset3.getString("totcnt"));
			rec.totamt = Util.checkString(rset3.getString("totamt"));
			this.curprintlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_VACT_STATDataSet ds = (SS_L_VACT_STATDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curbolist.size(); i++){
		SS_L_VACT_STATCURBOLISTRecord curbolistRec = (SS_L_VACT_STATCURBOLISTRecord)ds.curbolist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curshftlist.size(); i++){
		SS_L_VACT_STATCURSHFTLISTRecord curshftlistRec = (SS_L_VACT_STATCURSHFTLISTRecord)ds.curshftlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curbanklist.size(); i++){
		SS_L_VACT_STATCURBANKLISTRecord curbanklistRec = (SS_L_VACT_STATCURBANKLISTRecord)ds.curbanklist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curprintlist.size(); i++){
		SS_L_VACT_STATCURPRINTLISTRecord curprintlistRec = (SS_L_VACT_STATCURPRINTLISTRecord)ds.curprintlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurbolist()%>
<%= ds.getCurshftlist()%>
<%= ds.getCurbanklist()%>
<%= ds.getCurprintlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curbolistRec.deptnm%>
<%= curbolistRec.partnm%>
<%= curbolistRec.areanm%>
<%= curbolistRec.bonm%>
<%= curbolistRec.bocd%>
<%= curbolistRec.totcnt%>
<%= curbolistRec.totamt%>
<%= curbolistRec.normlcnt%>
<%= curbolistRec.normlamt%>
<%= curbolistRec.errcnt%>
<%= curbolistRec.erramt%>
<%= curshftlistRec.shftdt%>
<%= curshftlistRec.totcnt%>
<%= curshftlistRec.totamt%>
<%= curshftlistRec.normlcnt%>
<%= curshftlistRec.normlamt%>
<%= curshftlistRec.errcnt%>
<%= curshftlistRec.erramt%>
<%= curbanklistRec.banknm%>
<%= curbanklistRec.bankcd%>
<%= curbanklistRec.totcnt%>
<%= curbanklistRec.totamt%>
<%= curbanklistRec.normlcnt%>
<%= curbanklistRec.normlamt%>
<%= curbanklistRec.errcnt%>
<%= curbanklistRec.erramt%>
<%= curprintlistRec.subsmappli%>
<%= curprintlistRec.bocd%>
<%= curprintlistRec.bonm%>
<%= curprintlistRec.bank_cd%>
<%= curprintlistRec.bank_nm%>
<%= curprintlistRec.totcnt%>
<%= curprintlistRec.totamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 04 12:47:42 KST 2015 */