/***************************************************************************************************
* 파일명 : SP_PS_S_EMP_ALON.java
* 수당-수당관리 초기화면 코드값조회
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * 수당-수당관리 초기화면 코드값조회
 *
 */ 

 

public class PS_S_EMP_ALONDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dutycur = new ArrayList();
	public ArrayList asinbocdcur = new ArrayList();
	public ArrayList fixlist = new ArrayList();
	public ArrayList alonlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;

	public PS_S_EMP_ALONDataSet(){}
	public PS_S_EMP_ALONDataSet(String errcode, String errmsg, String sysdate){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sysdate = sysdate;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSysdate(String sysdate){
		this.sysdate = sysdate;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSysdate(){
		return this.sysdate;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.sysdate = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PS_S_EMP_ALONASINBOCDCURRecord rec = new PS_S_EMP_ALONASINBOCDCURRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset0.getString("sellnetclsf"));
			this.asinbocdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PS_S_EMP_ALONDUTYCURRecord rec = new PS_S_EMP_ALONDUTYCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.dutycur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PS_S_EMP_ALONALONLISTRecord rec = new PS_S_EMP_ALONALONLISTRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.alonlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			PS_S_EMP_ALONFIXLISTRecord rec = new PS_S_EMP_ALONFIXLISTRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.fixlist.add(rec);
		}
	}

	public String asinbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_EMP_ALONASINBOCDCURRecord rec = (PS_S_EMP_ALONASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String dutycurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dutycur.size();
		for(int i=0; i<size; i++){
			PS_S_EMP_ALONDUTYCURRecord rec = (PS_S_EMP_ALONDUTYCURRecord)dutycur.get(i);
			
			
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

	public String alonlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = alonlist.size();
		for(int i=0; i<size; i++){
			PS_S_EMP_ALONALONLISTRecord rec = (PS_S_EMP_ALONALONLISTRecord)alonlist.get(i);
			
			
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

	public String fixlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = fixlist.size();
		for(int i=0; i<size; i++){
			PS_S_EMP_ALONFIXLISTRecord rec = (PS_S_EMP_ALONFIXLISTRecord)fixlist.get(i);
			
			
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

	public String asinbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_EMP_ALONASINBOCDCURRecord rec = (PS_S_EMP_ALONASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String dutycurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dutycur.size();
		for(int i=0; i<size; i++){
			PS_S_EMP_ALONDUTYCURRecord rec = (PS_S_EMP_ALONDUTYCURRecord)dutycur.get(i);
			
			
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

	public String alonlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = alonlist.size();
		for(int i=0; i<size; i++){
			PS_S_EMP_ALONALONLISTRecord rec = (PS_S_EMP_ALONALONLISTRecord)alonlist.get(i);
			
			
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

	public String fixlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = fixlist.size();
		for(int i=0; i<size; i++){
			PS_S_EMP_ALONFIXLISTRecord rec = (PS_S_EMP_ALONFIXLISTRecord)fixlist.get(i);
			
			
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

	public String asinbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_EMP_ALONASINBOCDCURRecord rec = (PS_S_EMP_ALONASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String dutycurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dutycur.size();
		for(int i=0; i<size; i++){
			PS_S_EMP_ALONDUTYCURRecord rec = (PS_S_EMP_ALONDUTYCURRecord)dutycur.get(i);
			
			
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

	public String alonlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = alonlist.size();
		for(int i=0; i<size; i++){
			PS_S_EMP_ALONALONLISTRecord rec = (PS_S_EMP_ALONALONLISTRecord)alonlist.get(i);
			
			
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

	public String fixlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = fixlist.size();
		for(int i=0; i<size; i++){
			PS_S_EMP_ALONFIXLISTRecord rec = (PS_S_EMP_ALONFIXLISTRecord)fixlist.get(i);
			
			
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
	PS_S_EMP_ALONDataSet ds = (PS_S_EMP_ALONDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.asinbocdcur.size(); i++){
		PS_S_EMP_ALONASINBOCDCURRecord asinbocdcurRec = (PS_S_EMP_ALONASINBOCDCURRecord)ds.asinbocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dutycur.size(); i++){
		PS_S_EMP_ALONDUTYCURRecord dutycurRec = (PS_S_EMP_ALONDUTYCURRecord)ds.dutycur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.alonlist.size(); i++){
		PS_S_EMP_ALONALONLISTRecord alonlistRec = (PS_S_EMP_ALONALONLISTRecord)ds.alonlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.fixlist.size(); i++){
		PS_S_EMP_ALONFIXLISTRecord fixlistRec = (PS_S_EMP_ALONFIXLISTRecord)ds.fixlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSysdate()%>
<%= ds.getAsinbocdcur()%>
<%= ds.getDutycur()%>
<%= ds.getAlonlist()%>
<%= ds.getFixlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= asinbocdcurRec.bocd%>
<%= asinbocdcurRec.bonm%>
<%= asinbocdcurRec.deptcd%>
<%= asinbocdcurRec.sellnetclsf%>
<%= dutycurRec.cicodeval%>
<%= dutycurRec.cicdnm%>
<%= dutycurRec.ciymgbcd%>
<%= dutycurRec.cicdgb%>
<%= dutycurRec.cicdynm%>
<%= alonlistRec.cicodeval%>
<%= alonlistRec.cicdnm%>
<%= alonlistRec.ciymgbcd%>
<%= alonlistRec.cicdgb%>
<%= alonlistRec.cicdynm%>
<%= fixlistRec.cicodeval%>
<%= fixlistRec.cicdnm%>
<%= fixlistRec.ciymgbcd%>
<%= fixlistRec.cicdgb%>
<%= fixlistRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 08 17:26:53 KST 2004 */