/***************************************************************************************************
* ���ϸ�	: 
* ���		: 
* �ۼ�����	: 2004-01-13
* �ۼ���	: �����
***************************************************************************************************/
/***************************************************************************************************
* ��������	:
* ������	:
* ��������	:
* ���		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 *
 *
 */


public class SS_L_MIGRSGBANGDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList migrcrmsgbangcur = new ArrayList();
	public ArrayList migrtmpsgbangcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_MIGRSGBANGDataSet(){}
	public SS_L_MIGRSGBANGDataSet(String errcode, String errmsg){
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
			SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord rec = new SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord();
			rec.sinmoon = Util.checkString(rset0.getString("sinmoon"));
			rec.af_code = Util.checkString(rset0.getString("af_code"));
			rec.giro = Util.checkString(rset0.getString("giro"));
			rec.bangmun = Util.checkString(rset0.getString("bangmun"));
			rec.autogiro = Util.checkString(rset0.getString("autogiro"));
			rec.cardauto = Util.checkString(rset0.getString("cardauto"));
			rec.etc = Util.checkString(rset0.getString("etc"));
			rec.total = Util.checkString(rset0.getString("total"));
			this.migrtmpsgbangcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord rec = new SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord();
			rec.sinmoon = Util.checkString(rset1.getString("sinmoon"));
			rec.af_code = Util.checkString(rset1.getString("af_code"));
			rec.giro = Util.checkString(rset1.getString("giro"));
			rec.bangmun = Util.checkString(rset1.getString("bangmun"));
			rec.autogiro = Util.checkString(rset1.getString("autogiro"));
			rec.cardauto = Util.checkString(rset1.getString("cardauto"));
			rec.etc = Util.checkString(rset1.getString("etc"));
			rec.total = Util.checkString(rset1.getString("total"));
			this.migrcrmsgbangcur.add(rec);
		}
	}

	public String migrtmpsgbangcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrtmpsgbangcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord rec = (SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord)migrtmpsgbangcur.get(i);
			
			
			String code = rec.sinmoon;
			String name = rec.af_code;
			
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

	public String migrcrmsgbangcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrcrmsgbangcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord rec = (SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord)migrcrmsgbangcur.get(i);
			
			
			String code = rec.sinmoon;
			String name = rec.af_code;
			
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

	public String migrtmpsgbangcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrtmpsgbangcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord rec = (SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord)migrtmpsgbangcur.get(i);
			
			
			String code = rec.sinmoon;
			String name = rec.af_code;
			
			sb.append("<input name=\"");
			sb.append("sinmoon");
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

	public String migrcrmsgbangcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrcrmsgbangcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord rec = (SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord)migrcrmsgbangcur.get(i);
			
			
			String code = rec.sinmoon;
			String name = rec.af_code;
			
			sb.append("<input name=\"");
			sb.append("sinmoon");
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

	public String migrtmpsgbangcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrtmpsgbangcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord rec = (SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord)migrtmpsgbangcur.get(i);
			
			
			String code = rec.sinmoon;
			String name = rec.af_code;
			
			sb.append("<input name=\"");
			sb.append("sinmoon");
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

	public String migrcrmsgbangcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrcrmsgbangcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord rec = (SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord)migrcrmsgbangcur.get(i);
			
			
			String code = rec.sinmoon;
			String name = rec.af_code;
			
			sb.append("<input name=\"");
			sb.append("sinmoon");
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
	SS_L_MIGRSGBANGDataSet ds = (SS_L_MIGRSGBANGDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.migrtmpsgbangcur.size(); i++){
		SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord migrtmpsgbangcurRec = (SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord)ds.migrtmpsgbangcur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.migrcrmsgbangcur.size(); i++){
		SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord migrcrmsgbangcurRec = (SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord)ds.migrcrmsgbangcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMigrtmpsgbangcur()%>
<%= ds.getMigrcrmsgbangcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= migrtmpsgbangcurRec.sinmoon%>
<%= migrtmpsgbangcurRec.af_code%>
<%= migrtmpsgbangcurRec.giro%>
<%= migrtmpsgbangcurRec.bangmun%>
<%= migrtmpsgbangcurRec.autogiro%>
<%= migrtmpsgbangcurRec.cardauto%>
<%= migrtmpsgbangcurRec.etc%>
<%= migrtmpsgbangcurRec.total%>
<%= migrcrmsgbangcurRec.sinmoon%>
<%= migrcrmsgbangcurRec.af_code%>
<%= migrcrmsgbangcurRec.giro%>
<%= migrcrmsgbangcurRec.bangmun%>
<%= migrcrmsgbangcurRec.autogiro%>
<%= migrcrmsgbangcurRec.cardauto%>
<%= migrcrmsgbangcurRec.etc%>
<%= migrcrmsgbangcurRec.total%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 01 11:19:55 KST 2004 */