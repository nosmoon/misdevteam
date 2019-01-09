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


public class SS_L_BOACCTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList accitmcur = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public ArrayList bankcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_BOACCTDataSet(){}
	public SS_L_BOACCTDataSet(String errcode, String errmsg, long totalcnt){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SS_L_BOACCTCURCOMMLISTRecord rec = new SS_L_BOACCTCURCOMMLISTRecord();
			rec.bocd = Util.checkString(rset3.getString("bocd"));
			rec.deptnm = Util.checkString(rset3.getString("deptnm"));
			rec.areanm = Util.checkString(rset3.getString("areanm"));
			rec.bonm = Util.checkString(rset3.getString("bonm"));
			rec.seq = Util.checkString(rset3.getString("seq"));
			rec.acctitem = Util.checkString(rset3.getString("acctitem"));
			rec.acctitem_nm = Util.checkString(rset3.getString("acctitem_nm"));
			rec.depskind = Util.checkString(rset3.getString("depskind"));
			rec.bankcd = Util.checkString(rset3.getString("bankcd"));
			rec.bankcd_nm = Util.checkString(rset3.getString("bankcd_nm"));
			rec.deps_persnm = Util.checkString(rset3.getString("deps_persnm"));
			rec.acctno = Util.checkString(rset3.getString("acctno"));
			rec.remk = Util.checkString(rset3.getString("remk"));
			rec.incmgpers = Util.checkString(rset3.getString("incmgpers"));
			rec.incmgdt = Util.checkString(rset3.getString("incmgdt"));
			rec.chgpers = Util.checkString(rset3.getString("chgpers"));
			rec.chgdt = Util.checkString(rset3.getString("chgdt"));
			rec.girono = Util.checkString(rset3.getString("girono"));
			rec.cd_atmyn = Util.checkString(rset3.getString("cd_atmyn"));
			this.curcommlist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			SS_L_BOACCTACCITMCURRecord rec = new SS_L_BOACCTACCITMCURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			this.accitmcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			SS_L_BOACCTBANKCURRecord rec = new SS_L_BOACCTBANKCURRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			this.bankcur.add(rec);
		}
		this.totalcnt = cstmt.getLong(13);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_BOACCTCURCOMMLISTRecord rec = (SS_L_BOACCTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.deptnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String accitmcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = accitmcur.size();
		for(int i=0; i<size; i++){
			SS_L_BOACCTACCITMCURRecord rec = (SS_L_BOACCTACCITMCURRecord)accitmcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String bankcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bankcur.size();
		for(int i=0; i<size; i++){
			SS_L_BOACCTBANKCURRecord rec = (SS_L_BOACCTBANKCURRecord)bankcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_BOACCTCURCOMMLISTRecord rec = (SS_L_BOACCTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.deptnm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String accitmcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = accitmcur.size();
		for(int i=0; i<size; i++){
			SS_L_BOACCTACCITMCURRecord rec = (SS_L_BOACCTACCITMCURRecord)accitmcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String bankcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bankcur.size();
		for(int i=0; i<size; i++){
			SS_L_BOACCTBANKCURRecord rec = (SS_L_BOACCTBANKCURRecord)bankcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_BOACCTCURCOMMLISTRecord rec = (SS_L_BOACCTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.deptnm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String accitmcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = accitmcur.size();
		for(int i=0; i<size; i++){
			SS_L_BOACCTACCITMCURRecord rec = (SS_L_BOACCTACCITMCURRecord)accitmcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String bankcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bankcur.size();
		for(int i=0; i<size; i++){
			SS_L_BOACCTBANKCURRecord rec = (SS_L_BOACCTBANKCURRecord)bankcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_BOACCTDataSet ds = (SS_L_BOACCTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOACCTCURCOMMLISTRecord curcommlistRec = (SS_L_BOACCTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.accitmcur.size(); i++){
		SS_L_BOACCTACCITMCURRecord accitmcurRec = (SS_L_BOACCTACCITMCURRecord)ds.accitmcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bankcur.size(); i++){
		SS_L_BOACCTBANKCURRecord bankcurRec = (SS_L_BOACCTBANKCURRecord)ds.bankcur.get(i);%>
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
<%= accitmcurRec.cicodeval%>
<%= accitmcurRec.cicdnm%>
<%= bankcurRec.cicodeval%>
<%= bankcurRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 17:17:01 KST 2009 */