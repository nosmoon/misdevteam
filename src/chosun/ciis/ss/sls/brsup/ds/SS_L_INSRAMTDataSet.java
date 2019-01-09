/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-상해보험-보험금-목록
* 작성일자 : 2009-04-09
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-상해보험-보험금-목록
 */

public class SS_L_INSRAMTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curaccdtypecd = new ArrayList();
	public ArrayList curaccdcauscd = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalinsramt;

	public SS_L_INSRAMTDataSet(){}
	public SS_L_INSRAMTDataSet(String errcode, String errmsg, long totalcnt, long totalinsramt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalinsramt = totalinsramt;
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

	public void setTotalinsramt(long totalinsramt){
		this.totalinsramt = totalinsramt;
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

	public long getTotalinsramt(){
		return this.totalinsramt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SS_L_INSRAMTCURCOMMLISTRecord rec = new SS_L_INSRAMTCURCOMMLISTRecord();
			rec.acpndt = Util.checkString(rset0.getString("acpndt"));
			rec.accdacpnno = Util.checkString(rset0.getString("accdacpnno"));
			rec.accdcauscd = Util.checkString(rset0.getString("accdcauscd"));
			rec.accdtypecd = Util.checkString(rset0.getString("accdtypecd"));
			rec.insramt = rset0.getInt("insramt");
			rec.acctyn = Util.checkString(rset0.getString("acctyn"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dutynm = Util.checkString(rset0.getString("dutynm"));
			rec.accddt = Util.checkString(rset0.getString("accddt"));
			rec.procstat = Util.checkString(rset0.getString("procstat"));
			rec.procdt = Util.checkString(rset0.getString("procdt"));
			this.curcommlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(13);
		while(rset1.next()){
			SS_L_INSRAMTCURACCDCAUSCDRecord rec = new SS_L_INSRAMTCURACCDCAUSCDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curaccdcauscd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(14);
		while(rset2.next()){
			SS_L_INSRAMTCURACCDTYPECDRecord rec = new SS_L_INSRAMTCURACCDTYPECDRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.curaccdtypecd.add(rec);
		}
		this.totalcnt = cstmt.getLong(15);
		this.totalinsramt = cstmt.getLong(16);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_INSRAMTCURCOMMLISTRecord rec = (SS_L_INSRAMTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.acpndt;
			String name = rec.accdacpnno;
			
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

	public String curaccdcauscdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaccdcauscd.size();
		for(int i=0; i<size; i++){
			SS_L_INSRAMTCURACCDCAUSCDRecord rec = (SS_L_INSRAMTCURACCDCAUSCDRecord)curaccdcauscd.get(i);
			
			
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

	public String curaccdtypecdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaccdtypecd.size();
		for(int i=0; i<size; i++){
			SS_L_INSRAMTCURACCDTYPECDRecord rec = (SS_L_INSRAMTCURACCDTYPECDRecord)curaccdtypecd.get(i);
			
			
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
			SS_L_INSRAMTCURCOMMLISTRecord rec = (SS_L_INSRAMTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.acpndt;
			String name = rec.accdacpnno;
			
			sb.append("<input name=\"");
			sb.append("acpndt");
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

	public String curaccdcauscdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaccdcauscd.size();
		for(int i=0; i<size; i++){
			SS_L_INSRAMTCURACCDCAUSCDRecord rec = (SS_L_INSRAMTCURACCDCAUSCDRecord)curaccdcauscd.get(i);
			
			
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

	public String curaccdtypecdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaccdtypecd.size();
		for(int i=0; i<size; i++){
			SS_L_INSRAMTCURACCDTYPECDRecord rec = (SS_L_INSRAMTCURACCDTYPECDRecord)curaccdtypecd.get(i);
			
			
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
			SS_L_INSRAMTCURCOMMLISTRecord rec = (SS_L_INSRAMTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.acpndt;
			String name = rec.accdacpnno;
			
			sb.append("<input name=\"");
			sb.append("acpndt");
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

	public String curaccdcauscdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaccdcauscd.size();
		for(int i=0; i<size; i++){
			SS_L_INSRAMTCURACCDCAUSCDRecord rec = (SS_L_INSRAMTCURACCDCAUSCDRecord)curaccdcauscd.get(i);
			
			
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

	public String curaccdtypecdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaccdtypecd.size();
		for(int i=0; i<size; i++){
			SS_L_INSRAMTCURACCDTYPECDRecord rec = (SS_L_INSRAMTCURACCDTYPECDRecord)curaccdtypecd.get(i);
			
			
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
	SS_L_INSRAMTDataSet ds = (SS_L_INSRAMTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_INSRAMTCURCOMMLISTRecord curcommlistRec = (SS_L_INSRAMTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curaccdcauscd.size(); i++){
		SS_L_INSRAMTCURACCDCAUSCDRecord curaccdcauscdRec = (SS_L_INSRAMTCURACCDCAUSCDRecord)ds.curaccdcauscd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curaccdtypecd.size(); i++){
		SS_L_INSRAMTCURACCDTYPECDRecord curaccdtypecdRec = (SS_L_INSRAMTCURACCDTYPECDRecord)ds.curaccdtypecd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getCuraccdcauscd()%>
<%= ds.getCuraccdtypecd()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalinsramt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.acpndt%>
<%= curcommlistRec.accdacpnno%>
<%= curcommlistRec.accdcauscd%>
<%= curcommlistRec.accdtypecd%>
<%= curcommlistRec.insramt%>
<%= curcommlistRec.acctyn%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.flnm%>
<%= curcommlistRec.dutynm%>
<%= curcommlistRec.accddt%>
<%= curcommlistRec.procstat%>
<%= curcommlistRec.procdt%>
<%= curaccdcauscdRec.cicodeval%>
<%= curaccdcauscdRec.cicdnm%>
<%= curaccdcauscdRec.ciymgbcd%>
<%= curaccdcauscdRec.cicdgb%>
<%= curaccdcauscdRec.cicdynm%>
<%= curaccdtypecdRec.cicodeval%>
<%= curaccdtypecdRec.cicdnm%>
<%= curaccdtypecdRec.ciymgbcd%>
<%= curaccdtypecdRec.cicdgb%>
<%= curaccdtypecdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 20:19:17 KST 2009 */