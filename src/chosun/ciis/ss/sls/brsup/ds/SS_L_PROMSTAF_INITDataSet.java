/***************************************************************************************************
* 파일명 : SS_L_PROMSTAF_INITDataSet.java
* 기능 : 지국지원-판촉현황-요원관리-초기화면을 위한 DataSet
* 작성일자 : 2004-03-05
* 작성자 : 김대섭
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
 * 지국지원-판촉현황-요원관리-초기화면을 위한 DataSet
 */

public class SS_L_PROMSTAF_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curstafclsfcd = new ArrayList();
	public ArrayList curacctbank = new ArrayList();
	public ArrayList curcntrstatcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_PROMSTAF_INITDataSet(){}
	public SS_L_PROMSTAF_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			SS_L_PROMSTAF_INITCURSTAFCLSFCDRecord rec = new SS_L_PROMSTAF_INITCURSTAFCLSFCDRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curstafclsfcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_L_PROMSTAF_INITCURCNTRSTATCDRecord rec = new SS_L_PROMSTAF_INITCURCNTRSTATCDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curcntrstatcd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			SS_L_PROMSTAF_INITCURACCTBANKRecord rec = new SS_L_PROMSTAF_INITCURACCTBANKRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.curacctbank.add(rec);
		}
	}

	public String curstafclsfcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curstafclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_INITCURSTAFCLSFCDRecord rec = (SS_L_PROMSTAF_INITCURSTAFCLSFCDRecord)curstafclsfcd.get(i);
			
			
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

	public String curcntrstatcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcntrstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_INITCURCNTRSTATCDRecord rec = (SS_L_PROMSTAF_INITCURCNTRSTATCDRecord)curcntrstatcd.get(i);
			
			
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

	public String curacctbankOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curacctbank.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_INITCURACCTBANKRecord rec = (SS_L_PROMSTAF_INITCURACCTBANKRecord)curacctbank.get(i);
			
			
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

	public String curstafclsfcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curstafclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_INITCURSTAFCLSFCDRecord rec = (SS_L_PROMSTAF_INITCURSTAFCLSFCDRecord)curstafclsfcd.get(i);
			
			
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

	public String curcntrstatcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcntrstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_INITCURCNTRSTATCDRecord rec = (SS_L_PROMSTAF_INITCURCNTRSTATCDRecord)curcntrstatcd.get(i);
			
			
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

	public String curacctbankChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curacctbank.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_INITCURACCTBANKRecord rec = (SS_L_PROMSTAF_INITCURACCTBANKRecord)curacctbank.get(i);
			
			
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

	public String curstafclsfcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curstafclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_INITCURSTAFCLSFCDRecord rec = (SS_L_PROMSTAF_INITCURSTAFCLSFCDRecord)curstafclsfcd.get(i);
			
			
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

	public String curcntrstatcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcntrstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_INITCURCNTRSTATCDRecord rec = (SS_L_PROMSTAF_INITCURCNTRSTATCDRecord)curcntrstatcd.get(i);
			
			
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

	public String curacctbankRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curacctbank.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_INITCURACCTBANKRecord rec = (SS_L_PROMSTAF_INITCURACCTBANKRecord)curacctbank.get(i);
			
			
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
	SS_L_PROMSTAF_INITDataSet ds = (SS_L_PROMSTAF_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curstafclsfcd.size(); i++){
		SS_L_PROMSTAF_INITCURSTAFCLSFCDRecord curstafclsfcdRec = (SS_L_PROMSTAF_INITCURSTAFCLSFCDRecord)ds.curstafclsfcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcntrstatcd.size(); i++){
		SS_L_PROMSTAF_INITCURCNTRSTATCDRecord curcntrstatcdRec = (SS_L_PROMSTAF_INITCURCNTRSTATCDRecord)ds.curcntrstatcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curacctbank.size(); i++){
		SS_L_PROMSTAF_INITCURACCTBANKRecord curacctbankRec = (SS_L_PROMSTAF_INITCURACCTBANKRecord)ds.curacctbank.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurstafclsfcd()%>
<%= ds.getCurcntrstatcd()%>
<%= ds.getCuracctbank()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curstafclsfcdRec.cicodeval%>
<%= curstafclsfcdRec.cicdnm%>
<%= curstafclsfcdRec.ciymgbcd%>
<%= curstafclsfcdRec.cicdgb%>
<%= curstafclsfcdRec.cicdynm%>
<%= curcntrstatcdRec.cicodeval%>
<%= curcntrstatcdRec.cicdnm%>
<%= curcntrstatcdRec.ciymgbcd%>
<%= curcntrstatcdRec.cicdgb%>
<%= curcntrstatcdRec.cicdynm%>
<%= curacctbankRec.cicodeval%>
<%= curacctbankRec.cicdnm%>
<%= curacctbankRec.ciymgbcd%>
<%= curacctbankRec.cicdgb%>
<%= curacctbankRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 08 16:30:49 KST 2004 */