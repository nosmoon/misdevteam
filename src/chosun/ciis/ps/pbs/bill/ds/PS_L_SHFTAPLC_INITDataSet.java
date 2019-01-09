/***************************************************************************************************
* ���ϸ� : PS_L_SHFTAPLC_INIT.java
* ���   : ����/ī���ڵ���ü �ʱ�ȭ��
* �ۼ����� : 2006-04-19
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * ���Ǳ� - ���� - ����/ī���ڵ���ü �ʱ�ȭ��
 *
 */

public class PS_L_SHFTAPLC_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcardcd = new ArrayList();
	public ArrayList curbankcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_SHFTAPLC_INITDataSet(){}
	public PS_L_SHFTAPLC_INITDataSet(String errcode, String errmsg){
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
			PS_L_SHFTAPLC_INITCURBANKCDRecord rec = new PS_L_SHFTAPLC_INITCURBANKCDRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.curbankcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			PS_L_SHFTAPLC_INITCURCARDCDRecord rec = new PS_L_SHFTAPLC_INITCURCARDCDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.curcardcd.add(rec);
		}
	}

	public String curbankcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curbankcd.size();
		for(int i=0; i<size; i++){
			PS_L_SHFTAPLC_INITCURBANKCDRecord rec = (PS_L_SHFTAPLC_INITCURBANKCDRecord)curbankcd.get(i);
			
			
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

	public String curcardcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcardcd.size();
		for(int i=0; i<size; i++){
			PS_L_SHFTAPLC_INITCURCARDCDRecord rec = (PS_L_SHFTAPLC_INITCURCARDCDRecord)curcardcd.get(i);
			
			
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

	public String curbankcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curbankcd.size();
		for(int i=0; i<size; i++){
			PS_L_SHFTAPLC_INITCURBANKCDRecord rec = (PS_L_SHFTAPLC_INITCURBANKCDRecord)curbankcd.get(i);
			
			
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

	public String curcardcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcardcd.size();
		for(int i=0; i<size; i++){
			PS_L_SHFTAPLC_INITCURCARDCDRecord rec = (PS_L_SHFTAPLC_INITCURCARDCDRecord)curcardcd.get(i);
			
			
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

	public String curbankcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curbankcd.size();
		for(int i=0; i<size; i++){
			PS_L_SHFTAPLC_INITCURBANKCDRecord rec = (PS_L_SHFTAPLC_INITCURBANKCDRecord)curbankcd.get(i);
			
			
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

	public String curcardcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcardcd.size();
		for(int i=0; i<size; i++){
			PS_L_SHFTAPLC_INITCURCARDCDRecord rec = (PS_L_SHFTAPLC_INITCURCARDCDRecord)curcardcd.get(i);
			
			
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
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PS_L_SHFTAPLC_INITDataSet ds = (PS_L_SHFTAPLC_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curbankcd.size(); i++){
		PS_L_SHFTAPLC_INITCURBANKCDRecord curbankcdRec = (PS_L_SHFTAPLC_INITCURBANKCDRecord)ds.curbankcd.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curcardcd.size(); i++){
		PS_L_SHFTAPLC_INITCURCARDCDRecord curcardcdRec = (PS_L_SHFTAPLC_INITCURCARDCDRecord)ds.curcardcd.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurbankcd()%>
<%= ds.getCurcardcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curbankcdRec.cicodeval%>
<%= curbankcdRec.cicdnm%>
<%= curbankcdRec.cicdynm%>
<%= curbankcdRec.ciymgbcd%>
<%= curbankcdRec.cicdgb%>
<%= curcardcdRec.cicodeval%>
<%= curcardcdRec.cicdnm%>
<%= curcardcdRec.cicdynm%>
<%= curcardcdRec.ciymgbcd%>
<%= curcardcdRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 19 17:56:20 KST 2006 */