/***************************************************************************************************
 * ���ϸ�   : SL_L_APTLISTDataSet.java
 * ���     : �����濵-����������
 * �ۼ����� : 2006/06/27
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
**  SP_SL_L_APTLIST
**/

public class SL_L_APTLISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList addrcdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_APTLISTDataSet(){}
	public SL_L_APTLISTDataSet(String errcode, String errmsg){
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
			SL_L_APTLISTADDRCDCURRecord rec = new SL_L_APTLISTADDRCDCURRecord();
			rec.addrcd = Util.checkString(rset0.getString("addrcd"));
			rec.addrnm = Util.checkString(rset0.getString("addrnm"));
			this.addrcdcur.add(rec);
		}
	}

	public String addrcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_APTLISTADDRCDCURRecord rec = (SL_L_APTLISTADDRCDCURRecord)addrcdcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.addrnm;
			
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

	public String addrcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_APTLISTADDRCDCURRecord rec = (SL_L_APTLISTADDRCDCURRecord)addrcdcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.addrnm;
			
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

	public String addrcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_APTLISTADDRCDCURRecord rec = (SL_L_APTLISTADDRCDCURRecord)addrcdcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.addrnm;
			
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
	SL_L_APTLISTDataSet ds = (SL_L_APTLISTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.addrcdcur.size(); i++){
		SL_L_APTLISTADDRCDCURRecord addrcdcurRec = (SL_L_APTLISTADDRCDCURRecord)ds.addrcdcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAddrcdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= addrcdcurRec.addrcd%>
<%= addrcdcurRec.addrnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 27 15:11:40 KST 2006 */