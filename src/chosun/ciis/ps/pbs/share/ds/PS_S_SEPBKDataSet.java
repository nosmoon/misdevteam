/***************************************************************************************************
* ���ϸ� : PS_S_SEPBKDataSet.java
* ��� : ���Ǳ� �޺��ڽ�
* �ۼ����� : 2004-02-23
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * ���Ǳ� �޺��ڽ�
 *
 */


public class PS_S_SEPBKDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cmpycdcur = new ArrayList();
	public ArrayList rmsgexttcdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_S_SEPBKDataSet(){}
	public PS_S_SEPBKDataSet(String errcode, String errmsg){
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
			PS_S_SEPBKRMSGEXTTCDCURRecord rec = new PS_S_SEPBKRMSGEXTTCDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			this.rmsgexttcdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			PS_S_SEPBKCMPYCDCURRecord rec = new PS_S_SEPBKCMPYCDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.cmpycdcur.add(rec);
		}
	}

	public String rmsgexttcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rmsgexttcdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBKRMSGEXTTCDCURRecord rec = (PS_S_SEPBKRMSGEXTTCDCURRecord)rmsgexttcdcur.get(i);
			
			
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

	public String cmpycdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cmpycdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBKCMPYCDCURRecord rec = (PS_S_SEPBKCMPYCDCURRecord)cmpycdcur.get(i);
			
			
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

	public String rmsgexttcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rmsgexttcdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBKRMSGEXTTCDCURRecord rec = (PS_S_SEPBKRMSGEXTTCDCURRecord)rmsgexttcdcur.get(i);
			
			
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

	public String cmpycdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cmpycdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBKCMPYCDCURRecord rec = (PS_S_SEPBKCMPYCDCURRecord)cmpycdcur.get(i);
			
			
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

	public String rmsgexttcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rmsgexttcdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBKRMSGEXTTCDCURRecord rec = (PS_S_SEPBKRMSGEXTTCDCURRecord)rmsgexttcdcur.get(i);
			
			
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

	public String cmpycdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cmpycdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEPBKCMPYCDCURRecord rec = (PS_S_SEPBKCMPYCDCURRecord)cmpycdcur.get(i);
			
			
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
	PS_S_SEPBKDataSet ds = (PS_S_SEPBKDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.rmsgexttcdcur.size(); i++){
		PS_S_SEPBKRMSGEXTTCDCURRecord rmsgexttcdcurRec = (PS_S_SEPBKRMSGEXTTCDCURRecord)ds.rmsgexttcdcur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.cmpycdcur.size(); i++){
		PS_S_SEPBKCMPYCDCURRecord cmpycdcurRec = (PS_S_SEPBKCMPYCDCURRecord)ds.cmpycdcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRmsgexttcdcur()%>
<%= ds.getCmpycdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= rmsgexttcdcurRec.cicodeval%>
<%= rmsgexttcdcurRec.cicdnm%>
<%= cmpycdcurRec.cicodeval%>
<%= cmpycdcurRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 25 16:32:25 KST 2004 */