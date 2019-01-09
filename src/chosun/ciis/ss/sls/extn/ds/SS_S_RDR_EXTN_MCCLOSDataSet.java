/***************************************************************************************************
* 파일명 : SS_S_RDR_EXTN_MCCLOSDataSet.java
* 기능 : 확장현황-조선IS확장-MC확장
* 작성일자 : 2005-02-19
* 작성자 : 김대섭
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
 * 확장현황-조선IS확장-MC확장
 */


public class SS_S_RDR_EXTN_MCCLOSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList curmedicd = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String basidt;
	public String frdt;
	public String todt;
	public String closyn;
	public String closdt;
	public String splychrgclosyn;
	public String splychrgclosdt;
	public String clamdt;
	public String remk;

	public SS_S_RDR_EXTN_MCCLOSDataSet(){}
	public SS_S_RDR_EXTN_MCCLOSDataSet(String errcode, String errmsg, String basidt, String frdt, String todt, String closyn, String closdt, String splychrgclosyn, String splychrgclosdt, String clamdt, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.basidt = basidt;
		this.frdt = frdt;
		this.todt = todt;
		this.closyn = closyn;
		this.closdt = closdt;
		this.splychrgclosyn = splychrgclosyn;
		this.splychrgclosdt = splychrgclosdt;
		this.clamdt = clamdt;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setSplychrgclosyn(String splychrgclosyn){
		this.splychrgclosyn = splychrgclosyn;
	}

	public void setSplychrgclosdt(String splychrgclosdt){
		this.splychrgclosdt = splychrgclosdt;
	}

	public void setClamdt(String clamdt){
		this.clamdt = clamdt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getSplychrgclosyn(){
		return this.splychrgclosyn;
	}

	public String getSplychrgclosdt(){
		return this.splychrgclosdt;
	}

	public String getClamdt(){
		return this.clamdt;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.basidt = Util.checkString(cstmt.getString(4));
		this.frdt = Util.checkString(cstmt.getString(5));
		this.todt = Util.checkString(cstmt.getString(6));
		this.closyn = Util.checkString(cstmt.getString(7));
		this.closdt = Util.checkString(cstmt.getString(8));
		this.splychrgclosyn = Util.checkString(cstmt.getString(9));
		this.splychrgclosdt = Util.checkString(cstmt.getString(10));
		this.clamdt = Util.checkString(cstmt.getString(11));
		this.remk = Util.checkString(cstmt.getString(12));
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord rec = new SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord();
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.basiamt1 = rset0.getInt("basiamt1");
			rec.basiamt2 = rset0.getInt("basiamt2");
			rec.basiamt3 = rset0.getInt("basiamt3");
			this.curcommlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord rec = new SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord();
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.boksnm = Util.checkString(rset1.getString("boksnm"));
			this.curdeptcd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(15);
		while(rset2.next()){
			SS_S_RDR_EXTN_MCCLOSCURMEDICDRecord rec = new SS_S_RDR_EXTN_MCCLOSCURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord rec = (SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
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

	public String curdeptcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord rec = (SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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

	public String curmedicdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_MCCLOSCURMEDICDRecord rec = (SS_S_RDR_EXTN_MCCLOSCURMEDICDRecord)curmedicd.get(i);
			
			
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
			SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord rec = (SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String curdeptcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord rec = (SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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

	public String curmedicdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_MCCLOSCURMEDICDRecord rec = (SS_S_RDR_EXTN_MCCLOSCURMEDICDRecord)curmedicd.get(i);
			
			
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
			SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord rec = (SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String curdeptcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord rec = (SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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

	public String curmedicdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_MCCLOSCURMEDICDRecord rec = (SS_S_RDR_EXTN_MCCLOSCURMEDICDRecord)curmedicd.get(i);
			
			
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
	SS_S_RDR_EXTN_MCCLOSDataSet ds = (SS_S_RDR_EXTN_MCCLOSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord curcommlistRec = (SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdeptcd.size(); i++){
		SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord curdeptcdRec = (SS_S_RDR_EXTN_MCCLOSCURDEPTCDRecord)ds.curdeptcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_S_RDR_EXTN_MCCLOSCURMEDICDRecord curmedicdRec = (SS_S_RDR_EXTN_MCCLOSCURMEDICDRecord)ds.curmedicd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBasidt()%>
<%= ds.getFrdt()%>
<%= ds.getTodt()%>
<%= ds.getClosyn()%>
<%= ds.getClosdt()%>
<%= ds.getSplychrgclosyn()%>
<%= ds.getSplychrgclosdt()%>
<%= ds.getClamdt()%>
<%= ds.getRemk()%>
<%= ds.getCurcommlist()%>
<%= ds.getCurdeptcd()%>
<%= ds.getCurmedicd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.medicd%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.basiamt1%>
<%= curcommlistRec.basiamt2%>
<%= curcommlistRec.basiamt3%>
<%= curdeptcdRec.deptcd%>
<%= curdeptcdRec.boksnm%>
<%= curmedicdRec.cicodeval%>
<%= curmedicdRec.cicdnm%>
<%= curmedicdRec.ciymgbcd%>
<%= curmedicdRec.cicdgb%>
<%= curmedicdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Feb 19 17:26:38 KST 2005 */