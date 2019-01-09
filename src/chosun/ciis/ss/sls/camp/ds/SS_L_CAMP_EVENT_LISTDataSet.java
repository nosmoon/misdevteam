/***************************************************************************************************
 * ���ϸ�   : SP_SS_L_CAMP_EVENT_LIST.java
 * ���     : ķ����Ȯ��
 * �ۼ����� : 2005/05/26
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.camp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.camp.dm.*;
import chosun.ciis.ss.sls.camp.rec.*;

/**
 * ķ����Ȯ��
 */

public class SS_L_CAMP_EVENT_LISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcampeventcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_CAMP_EVENT_LISTDataSet(){}
	public SS_L_CAMP_EVENT_LISTDataSet(String errcode, String errmsg){
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
			SS_L_CAMP_EVENT_LISTCURCAMPEVENTCDRecord rec = new SS_L_CAMP_EVENT_LISTCURCAMPEVENTCDRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curcampeventcd.add(rec);
		}
	}

	public String curcampeventcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcampeventcd.size();
		for(int i=0; i<size; i++){
			SS_L_CAMP_EVENT_LISTCURCAMPEVENTCDRecord rec = (SS_L_CAMP_EVENT_LISTCURCAMPEVENTCDRecord)curcampeventcd.get(i);
			
			
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

	public String curcampeventcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcampeventcd.size();
		for(int i=0; i<size; i++){
			SS_L_CAMP_EVENT_LISTCURCAMPEVENTCDRecord rec = (SS_L_CAMP_EVENT_LISTCURCAMPEVENTCDRecord)curcampeventcd.get(i);
			
			
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

	public String curcampeventcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcampeventcd.size();
		for(int i=0; i<size; i++){
			SS_L_CAMP_EVENT_LISTCURCAMPEVENTCDRecord rec = (SS_L_CAMP_EVENT_LISTCURCAMPEVENTCDRecord)curcampeventcd.get(i);
			
			
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
	SS_L_CAMP_EVENT_LISTDataSet ds = (SS_L_CAMP_EVENT_LISTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcampeventcd.size(); i++){
		SS_L_CAMP_EVENT_LISTCURCAMPEVENTCDRecord curcampeventcdRec = (SS_L_CAMP_EVENT_LISTCURCAMPEVENTCDRecord)ds.curcampeventcd.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcampeventcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcampeventcdRec.cicodeval%>
<%= curcampeventcdRec.cicdnm%>
<%= curcampeventcdRec.ciymgbcd%>
<%= curcampeventcdRec.cicdgb%>
<%= curcampeventcdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 27 14:31:44 KST 2005 */