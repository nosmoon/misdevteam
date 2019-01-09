/***************************************************************************************************
* ���ϸ� : SS_L_PROMSTAF_CYEXPAY_INITDataSet.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����-�ʱ�ȭ���� ���� DataSet
* �ۼ����� : 2004-09-13
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
 * Ȯ����Ȳ-���̹�Ȯ��-����-�ʱ�ȭ���� ���� DataSet
 */


public class SS_L_PROMSTAF_CYEXPAY_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList curmedicd = new ArrayList();
	public ArrayList cursubscnfmstatcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_PROMSTAF_CYEXPAY_INITDataSet(){}
	public SS_L_PROMSTAF_CYEXPAY_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord rec = new SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.boksnm = Util.checkString(rset0.getString("boksnm"));
			this.curdeptcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SS_L_PROMSTAF_CYEXPAY_INITCURMEDICDRecord rec = new SS_L_PROMSTAF_CYEXPAY_INITCURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord rec = new SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.cursubscnfmstatcd.add(rec);
		}
	}

	public String curdeptcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord rec = (SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
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
			SS_L_PROMSTAF_CYEXPAY_INITCURMEDICDRecord rec = (SS_L_PROMSTAF_CYEXPAY_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String cursubscnfmstatcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursubscnfmstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord rec = (SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord)cursubscnfmstatcd.get(i);
			
			
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
			SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord rec = (SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
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
			SS_L_PROMSTAF_CYEXPAY_INITCURMEDICDRecord rec = (SS_L_PROMSTAF_CYEXPAY_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String cursubscnfmstatcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursubscnfmstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord rec = (SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord)cursubscnfmstatcd.get(i);
			
			
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
			SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord rec = (SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
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
			SS_L_PROMSTAF_CYEXPAY_INITCURMEDICDRecord rec = (SS_L_PROMSTAF_CYEXPAY_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String cursubscnfmstatcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursubscnfmstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord rec = (SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord)cursubscnfmstatcd.get(i);
			
			
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
	SS_L_PROMSTAF_CYEXPAY_INITDataSet ds = (SS_L_PROMSTAF_CYEXPAY_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curdeptcd.size(); i++){
		SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord curdeptcdRec = (SS_L_PROMSTAF_CYEXPAY_INITCURDEPTCDRecord)ds.curdeptcd.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_L_PROMSTAF_CYEXPAY_INITCURMEDICDRecord curmedicdRec = (SS_L_PROMSTAF_CYEXPAY_INITCURMEDICDRecord)ds.curmedicd.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.cursubscnfmstatcd.size(); i++){
		SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord cursubscnfmstatcdRec = (SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord)ds.cursubscnfmstatcd.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdeptcd()%>
<%= ds.getCurmedicd()%>
<%= ds.getCursubscnfmstatcd()%>
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
<%= cursubscnfmstatcdRec.cicodeval%>
<%= cursubscnfmstatcdRec.cicdnm%>
<%= cursubscnfmstatcdRec.ciymgbcd%>
<%= cursubscnfmstatcdRec.cicdgb%>
<%= cursubscnfmstatcdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Sep 14 19:44:43 KST 2004 */