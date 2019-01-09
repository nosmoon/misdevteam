/***************************************************************************************************
 * ���ϸ�   : SL_L_COMM_APT_DONGNODataSet.java
 * ���     : �����濵-����Ʈ������-�����
 * �ۼ����� : 2005/10/14
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  �����濵-����Ʈ������-�����
**/

public class SL_L_COMM_APT_DONGNODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dongcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_COMM_APT_DONGNODataSet(){}
	public SL_L_COMM_APT_DONGNODataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SL_L_COMM_APT_DONGNODONGCURRecord rec = new SL_L_COMM_APT_DONGNODONGCURRecord();
			rec.addrcd = Util.checkString(rset0.getString("addrcd"));
			rec.dongno = Util.checkString(rset0.getString("dongno"));
			this.dongcur.add(rec);
		}
	}

	public String dongcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dongcur.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_DONGNODONGCURRecord rec = (SL_L_COMM_APT_DONGNODONGCURRecord)dongcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.dongno;
			
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

	public String dongcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dongcur.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_DONGNODONGCURRecord rec = (SL_L_COMM_APT_DONGNODONGCURRecord)dongcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.dongno;
			
			sb.append("<input name=\"");
			sb.append("addrcd");
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

	public String dongcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dongcur.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_DONGNODONGCURRecord rec = (SL_L_COMM_APT_DONGNODONGCURRecord)dongcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.dongno;
			
			sb.append("<input name=\"");
			sb.append("addrcd");
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
	SL_L_COMM_APT_DONGNODataSet ds = (SL_L_COMM_APT_DONGNODataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.dongcur.size(); i++){
		SL_L_COMM_APT_DONGNODONGCURRecord dongcurRec = (SL_L_COMM_APT_DONGNODONGCURRecord)ds.dongcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDongcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= dongcurRec.addrcd%>
<%= dongcurRec.dongno%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Oct 14 14:11:02 KST 2005 */