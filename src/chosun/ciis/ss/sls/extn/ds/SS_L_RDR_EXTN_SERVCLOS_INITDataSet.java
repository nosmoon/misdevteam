/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_SERVCLOS_INITDataSet.java
* ��� : Ȯ����Ȳ-����ISȮ��-����(����IS)-�ʱ�ȭ���� ���� DataSet
* �ۼ����� : 2004-08-01
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-����ISȮ��-����(����IS)-�ʱ�ȭ���� ���� DataSet
 */


public class SS_L_RDR_EXTN_SERVCLOS_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList curmedicd = new ArrayList();
	public ArrayList curresitype = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_EXTN_SERVCLOS_INITDataSet(){}
	public SS_L_RDR_EXTN_SERVCLOS_INITDataSet(String errcode, String errmsg){
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
			SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord rec = new SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.boksnm = Util.checkString(rset0.getString("boksnm"));
			this.curdeptcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_L_RDR_EXTN_SERVCLOS_INITCURMEDICDRecord rec = new SS_L_RDR_EXTN_SERVCLOS_INITCURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			SS_L_RDR_EXTN_SERVCLOS_INITCURRESITYPERecord rec = new SS_L_RDR_EXTN_SERVCLOS_INITCURRESITYPERecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.curresitype.add(rec);
		}
	}

	public String curdeptcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord rec = (SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
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
			SS_L_RDR_EXTN_SERVCLOS_INITCURMEDICDRecord rec = (SS_L_RDR_EXTN_SERVCLOS_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curresitypeOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curresitype.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_SERVCLOS_INITCURRESITYPERecord rec = (SS_L_RDR_EXTN_SERVCLOS_INITCURRESITYPERecord)curresitype.get(i);
			
			
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

	public String curdeptcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord rec = (SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
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
			SS_L_RDR_EXTN_SERVCLOS_INITCURMEDICDRecord rec = (SS_L_RDR_EXTN_SERVCLOS_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curresitypeChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curresitype.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_SERVCLOS_INITCURRESITYPERecord rec = (SS_L_RDR_EXTN_SERVCLOS_INITCURRESITYPERecord)curresitype.get(i);
			
			
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

	public String curdeptcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord rec = (SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
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
			SS_L_RDR_EXTN_SERVCLOS_INITCURMEDICDRecord rec = (SS_L_RDR_EXTN_SERVCLOS_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curresitypeRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curresitype.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_SERVCLOS_INITCURRESITYPERecord rec = (SS_L_RDR_EXTN_SERVCLOS_INITCURRESITYPERecord)curresitype.get(i);
			
			
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
	SS_L_RDR_EXTN_SERVCLOS_INITDataSet ds = (SS_L_RDR_EXTN_SERVCLOS_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curdeptcd.size(); i++){
		SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord curdeptcdRec = (SS_L_RDR_EXTN_SERVCLOS_INITCURDEPTCDRecord)ds.curdeptcd.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_L_RDR_EXTN_SERVCLOS_INITCURMEDICDRecord curmedicdRec = (SS_L_RDR_EXTN_SERVCLOS_INITCURMEDICDRecord)ds.curmedicd.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curresitype.size(); i++){
		SS_L_RDR_EXTN_SERVCLOS_INITCURRESITYPERecord curresitypeRec = (SS_L_RDR_EXTN_SERVCLOS_INITCURRESITYPERecord)ds.curresitype.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdeptcd()%>
<%= ds.getCurmedicd()%>
<%= ds.getCurresitype()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curdeptcdRec.deptcd%>
<%= curdeptcdRec.boksnm%>
<%= curmedicdRec.cicodeval%>
<%= curmedicdRec.cicdnm%>
<%= curmedicdRec.ciymgbcd%>
<%= curmedicdRec.cicdgb%>
<%= curmedicdRec.cicdynm%>
<%= curresitypeRec.cicodeval%>
<%= curresitypeRec.cicdnm%>
<%= curresitypeRec.ciymgbcd%>
<%= curresitypeRec.cicdgb%>
<%= curresitypeRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Aug 02 15:53:00 KST 2004 */