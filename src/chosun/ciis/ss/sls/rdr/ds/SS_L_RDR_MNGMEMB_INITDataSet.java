/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڰ��� �ʱ�ȭ��
* �ۼ����� : 2009-08-07
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * ���ڰ��� �ʱ�ȭ�� 
 */

public class SS_L_RDR_MNGMEMB_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList custtype = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_MNGMEMB_INITDataSet(){}
	public SS_L_RDR_MNGMEMB_INITDataSet(String errcode, String errmsg){
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
			SS_L_RDR_MNGMEMB_INITCUSTTYPERecord rec = new SS_L_RDR_MNGMEMB_INITCUSTTYPERecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			this.custtype.add(rec);
		}
	}

	public String custtypeOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = custtype.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_MNGMEMB_INITCUSTTYPERecord rec = (SS_L_RDR_MNGMEMB_INITCUSTTYPERecord)custtype.get(i);
			
			
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

	public String custtypeChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = custtype.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_MNGMEMB_INITCUSTTYPERecord rec = (SS_L_RDR_MNGMEMB_INITCUSTTYPERecord)custtype.get(i);
			
			
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

	public String custtypeRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = custtype.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_MNGMEMB_INITCUSTTYPERecord rec = (SS_L_RDR_MNGMEMB_INITCUSTTYPERecord)custtype.get(i);
			
			
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
	SS_L_RDR_MNGMEMB_INITDataSet ds = (SS_L_RDR_MNGMEMB_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.custtype.size(); i++){
		SS_L_RDR_MNGMEMB_INITCUSTTYPERecord custtypeRec = (SS_L_RDR_MNGMEMB_INITCUSTTYPERecord)ds.custtype.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCusttype()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= custtypeRec.cicodeval%>
<%= custtypeRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Aug 07 16:31:16 KST 2009 */