/***************************************************************************************************
* 파일명 : SP_PS_S_BILL_SEPR.java
* 수금-개별입금 초기화면
* 작성일자 : 2004-03-29
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 수금-개별입금 초기화면
 *
 */

public class PS_S_BILL_SEPRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList crpmyncur = new ArrayList();
	public ArrayList rcpmmthdcur = new ArrayList();
	public ArrayList intgbocdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;

	public PS_S_BILL_SEPRDataSet(){}
	public PS_S_BILL_SEPRDataSet(String errcode, String errmsg, String sysdate){
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
			PS_S_BILL_SEPRCRPMYNCURRecord rec = new PS_S_BILL_SEPRCRPMYNCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.crpmyncur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PS_S_BILL_SEPRINTGBOCDCURRecord rec = new PS_S_BILL_SEPRINTGBOCDCURRecord();
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset1.getString("sellnetclsf"));
			this.intgbocdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PS_S_BILL_SEPRRCPMMTHDCURRecord rec = new PS_S_BILL_SEPRRCPMMTHDCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.rcpmmthdcur.add(rec);
		}
	}

	public String crpmyncurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = crpmyncur.size();
		for(int i=0; i<size; i++){
			PS_S_BILL_SEPRCRPMYNCURRecord rec = (PS_S_BILL_SEPRCRPMYNCURRecord)crpmyncur.get(i);
			
			
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

	public String intgbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intgbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BILL_SEPRINTGBOCDCURRecord rec = (PS_S_BILL_SEPRINTGBOCDCURRecord)intgbocdcur.get(i);
			
			
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

	public String rcpmmthdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rcpmmthdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BILL_SEPRRCPMMTHDCURRecord rec = (PS_S_BILL_SEPRRCPMMTHDCURRecord)rcpmmthdcur.get(i);
			
			
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

	public String crpmyncurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = crpmyncur.size();
		for(int i=0; i<size; i++){
			PS_S_BILL_SEPRCRPMYNCURRecord rec = (PS_S_BILL_SEPRCRPMYNCURRecord)crpmyncur.get(i);
			
			
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

	public String intgbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intgbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BILL_SEPRINTGBOCDCURRecord rec = (PS_S_BILL_SEPRINTGBOCDCURRecord)intgbocdcur.get(i);
			
			
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

	public String rcpmmthdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rcpmmthdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BILL_SEPRRCPMMTHDCURRecord rec = (PS_S_BILL_SEPRRCPMMTHDCURRecord)rcpmmthdcur.get(i);
			
			
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

	public String crpmyncurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = crpmyncur.size();
		for(int i=0; i<size; i++){
			PS_S_BILL_SEPRCRPMYNCURRecord rec = (PS_S_BILL_SEPRCRPMYNCURRecord)crpmyncur.get(i);
			
			
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

	public String intgbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intgbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BILL_SEPRINTGBOCDCURRecord rec = (PS_S_BILL_SEPRINTGBOCDCURRecord)intgbocdcur.get(i);
			
			
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

	public String rcpmmthdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rcpmmthdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BILL_SEPRRCPMMTHDCURRecord rec = (PS_S_BILL_SEPRRCPMMTHDCURRecord)rcpmmthdcur.get(i);
			
			
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
	PS_S_BILL_SEPRDataSet ds = (PS_S_BILL_SEPRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.crpmyncur.size(); i++){
		PS_S_BILL_SEPRCRPMYNCURRecord crpmyncurRec = (PS_S_BILL_SEPRCRPMYNCURRecord)ds.crpmyncur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.intgbocdcur.size(); i++){
		PS_S_BILL_SEPRINTGBOCDCURRecord intgbocdcurRec = (PS_S_BILL_SEPRINTGBOCDCURRecord)ds.intgbocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rcpmmthdcur.size(); i++){
		PS_S_BILL_SEPRRCPMMTHDCURRecord rcpmmthdcurRec = (PS_S_BILL_SEPRRCPMMTHDCURRecord)ds.rcpmmthdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSysdate()%>
<%= ds.getCrpmyncur()%>
<%= ds.getIntgbocdcur()%>
<%= ds.getRcpmmthdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= crpmyncurRec.cicodeval%>
<%= crpmyncurRec.cicdnm%>
<%= crpmyncurRec.cicdynm%>
<%= crpmyncurRec.ciymgbcd%>
<%= crpmyncurRec.cicdgb%>
<%= intgbocdcurRec.bocd%>
<%= intgbocdcurRec.bonm%>
<%= intgbocdcurRec.deptcd%>
<%= intgbocdcurRec.sellnetclsf%>
<%= rcpmmthdcurRec.cicodeval%>
<%= rcpmmthdcurRec.cicdnm%>
<%= rcpmmthdcurRec.cicdynm%>
<%= rcpmmthdcurRec.ciymgbcd%>
<%= rcpmmthdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 03 17:23:22 KST 2006 */