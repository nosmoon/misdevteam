/***************************************************************************************************
 * ���ϸ�   : SP_SS_L_CVSRECP_INIT
 * ���     : ��������-����-������������Ȳ-�ʱ�ȭ��
 * �ۼ����� : 2007/04/20
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SS_L_CVSRECP_INIT
**/

public class SS_L_CVSRECP_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cvsinfocur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_CVSRECP_INITDataSet(){}
	public SS_L_CVSRECP_INITDataSet(String errcode, String errmsg){
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
			SS_L_CVSRECP_INITCVSINFOCURRecord rec = new SS_L_CVSRECP_INITCVSINFOCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.cvsinfocur.add(rec);
		}
	}

	public String cvsinfocurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cvsinfocur.size();
		for(int i=0; i<size; i++){
			SS_L_CVSRECP_INITCVSINFOCURRecord rec = (SS_L_CVSRECP_INITCVSINFOCURRecord)cvsinfocur.get(i);
			
			
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

	public String cvsinfocurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cvsinfocur.size();
		for(int i=0; i<size; i++){
			SS_L_CVSRECP_INITCVSINFOCURRecord rec = (SS_L_CVSRECP_INITCVSINFOCURRecord)cvsinfocur.get(i);
			
			
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

	public String cvsinfocurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cvsinfocur.size();
		for(int i=0; i<size; i++){
			SS_L_CVSRECP_INITCVSINFOCURRecord rec = (SS_L_CVSRECP_INITCVSINFOCURRecord)cvsinfocur.get(i);
			
			
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
	SS_L_CVSRECP_INITDataSet ds = (SS_L_CVSRECP_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.cvsinfocur.size(); i++){
		SS_L_CVSRECP_INITCVSINFOCURRecord cvsinfocurRec = (SS_L_CVSRECP_INITCVSINFOCURRecord)ds.cvsinfocur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCvsinfocur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= cvsinfocurRec.cicodeval%>
<%= cvsinfocurRec.cicdnm%>
<%= cvsinfocurRec.cicdynm%>
<%= cvsinfocurRec.ciymgbcd%>
<%= cvsinfocurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 20 17:16:24 KST 2007 */