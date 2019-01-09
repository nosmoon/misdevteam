/***************************************************************************************************
 * 파일명   : SP_SS_S_PUBL_RDR
 * 기능     : 지국경영-주간조선 독자조회
 * 작성일자 : 2007/06/15
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  SP_SS_S_PUBL_RDR
**/

public class SS_S_PUBL_RDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList asinbocdcur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList areacdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_PUBL_RDRDataSet(){}
	public SS_S_PUBL_RDRDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SS_S_PUBL_RDRASINBOCDCURRecord rec = new SS_S_PUBL_RDRASINBOCDCURRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset0.getString("sellnetclsf"));
			this.asinbocdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SS_S_PUBL_RDRMEDICDCURRecord rec = new SS_S_PUBL_RDRMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.medicdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			SS_S_PUBL_RDRCURDEPTCDRecord rec = new SS_S_PUBL_RDRCURDEPTCDRecord();
			rec.deptcd = Util.checkString(rset2.getString("deptcd"));
			rec.boksnm = Util.checkString(rset2.getString("boksnm"));
			this.curdeptcd.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			SS_S_PUBL_RDRAREACDCURRecord rec = new SS_S_PUBL_RDRAREACDCURRecord();
			rec.areacd = Util.checkString(rset3.getString("areacd"));
			rec.areanm = Util.checkString(rset3.getString("areanm"));
			this.areacdcur.add(rec);
		}
	}

	public String asinbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			SS_S_PUBL_RDRASINBOCDCURRecord rec = (SS_S_PUBL_RDRASINBOCDCURRecord)asinbocdcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
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

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			SS_S_PUBL_RDRMEDICDCURRecord rec = (SS_S_PUBL_RDRMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String curdeptcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_S_PUBL_RDRCURDEPTCDRecord rec = (SS_S_PUBL_RDRCURDEPTCDRecord)curdeptcd.get(i);
			
			
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

	public String areacdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = areacdcur.size();
		for(int i=0; i<size; i++){
			SS_S_PUBL_RDRAREACDCURRecord rec = (SS_S_PUBL_RDRAREACDCURRecord)areacdcur.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
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

	public String asinbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			SS_S_PUBL_RDRASINBOCDCURRecord rec = (SS_S_PUBL_RDRASINBOCDCURRecord)asinbocdcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			SS_S_PUBL_RDRMEDICDCURRecord rec = (SS_S_PUBL_RDRMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String curdeptcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_S_PUBL_RDRCURDEPTCDRecord rec = (SS_S_PUBL_RDRCURDEPTCDRecord)curdeptcd.get(i);
			
			
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

	public String areacdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = areacdcur.size();
		for(int i=0; i<size; i++){
			SS_S_PUBL_RDRAREACDCURRecord rec = (SS_S_PUBL_RDRAREACDCURRecord)areacdcur.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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

	public String asinbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			SS_S_PUBL_RDRASINBOCDCURRecord rec = (SS_S_PUBL_RDRASINBOCDCURRecord)asinbocdcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			SS_S_PUBL_RDRMEDICDCURRecord rec = (SS_S_PUBL_RDRMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String curdeptcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_S_PUBL_RDRCURDEPTCDRecord rec = (SS_S_PUBL_RDRCURDEPTCDRecord)curdeptcd.get(i);
			
			
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

	public String areacdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = areacdcur.size();
		for(int i=0; i<size; i++){
			SS_S_PUBL_RDRAREACDCURRecord rec = (SS_S_PUBL_RDRAREACDCURRecord)areacdcur.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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
	SS_S_PUBL_RDRDataSet ds = (SS_S_PUBL_RDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.asinbocdcur.size(); i++){
		SS_S_PUBL_RDRASINBOCDCURRecord asinbocdcurRec = (SS_S_PUBL_RDRASINBOCDCURRecord)ds.asinbocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		SS_S_PUBL_RDRMEDICDCURRecord medicdcurRec = (SS_S_PUBL_RDRMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdeptcd.size(); i++){
		SS_S_PUBL_RDRCURDEPTCDRecord curdeptcdRec = (SS_S_PUBL_RDRCURDEPTCDRecord)ds.curdeptcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.areacdcur.size(); i++){
		SS_S_PUBL_RDRAREACDCURRecord areacdcurRec = (SS_S_PUBL_RDRAREACDCURRecord)ds.areacdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAsinbocdcur()%>
<%= ds.getMedicdcur()%>
<%= ds.getCurdeptcd()%>
<%= ds.getAreacdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= asinbocdcurRec.bocd%>
<%= asinbocdcurRec.bonm%>
<%= asinbocdcurRec.deptcd%>
<%= asinbocdcurRec.sellnetclsf%>
<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= curdeptcdRec.deptcd%>
<%= curdeptcdRec.boksnm%>
<%= areacdcurRec.areacd%>
<%= areacdcurRec.areanm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 15 15:57:09 KST 2007 */