/***************************************************************************************************
* ���ϸ� : .java
* ��� : �����濵-����������������ȸ-ķ���θ����ȸ
* �ۼ����� : 2008-10-17
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 *�����濵-����������������ȸ-ķ���θ����ȸ
 */

public class CO_L_CAMPINFODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList campinfolist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_L_CAMPINFODataSet(){}
	public CO_L_CAMPINFODataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			CO_L_CAMPINFOCAMPINFOLISTRecord rec = new CO_L_CAMPINFOCAMPINFOLISTRecord();
			rec.campid = Util.checkString(rset0.getString("campid"));
			rec.campnm = Util.checkString(rset0.getString("campnm"));
			rec.campmclscd = Util.checkString(rset0.getString("campmclscd"));
			rec.campmclsnm = Util.checkString(rset0.getString("campmclsnm"));
			rec.camppurp = Util.checkString(rset0.getString("camppurp"));
			rec.campexecclsfcd = Util.checkString(rset0.getString("campexecclsfcd"));
			rec.campexecfrdt = rset0.getTimestamp("campexecfrdt");
			rec.campexectodt = rset0.getTimestamp("campexectodt");
			rec.campchnlfrdt = Util.checkString(rset0.getString("campchnlfrdt"));
			rec.campchnltodt = Util.checkString(rset0.getString("campchnltodt"));
			rec.campobjcnt = rset0.getInt("campobjcnt");
			rec.campplanpersid = Util.checkString(rset0.getString("campplanpersid"));
			rec.campplanpersnm = Util.checkString(rset0.getString("campplanpersnm"));
			rec.campexecguid = Util.checkString(rset0.getString("campexecguid"));
			rec.outsdcustyn = Util.checkString(rset0.getString("outsdcustyn"));
			rec.camptypecd = Util.checkString(rset0.getString("camptypecd"));
			this.campinfolist.add(rec);
		}
	}

	public String campinfolistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = campinfolist.size();
		for(int i=0; i<size; i++){
			CO_L_CAMPINFOCAMPINFOLISTRecord rec = (CO_L_CAMPINFOCAMPINFOLISTRecord)campinfolist.get(i);
			
			
			String code = rec.campid;
			String name = rec.campnm;
			
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

	public String campinfolistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = campinfolist.size();
		for(int i=0; i<size; i++){
			CO_L_CAMPINFOCAMPINFOLISTRecord rec = (CO_L_CAMPINFOCAMPINFOLISTRecord)campinfolist.get(i);
			
			
			String code = rec.campid;
			String name = rec.campnm;
			
			sb.append("<input name=\"");
			sb.append("campid");
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

	public String campinfolistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = campinfolist.size();
		for(int i=0; i<size; i++){
			CO_L_CAMPINFOCAMPINFOLISTRecord rec = (CO_L_CAMPINFOCAMPINFOLISTRecord)campinfolist.get(i);
			
			
			String code = rec.campid;
			String name = rec.campnm;
			
			sb.append("<input name=\"");
			sb.append("campid");
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
	CO_L_CAMPINFODataSet ds = (CO_L_CAMPINFODataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.campinfolist.size(); i++){
		CO_L_CAMPINFOCAMPINFOLISTRecord campinfolistRec = (CO_L_CAMPINFOCAMPINFOLISTRecord)ds.campinfolist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCampinfolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= campinfolistRec.campid%>
<%= campinfolistRec.campnm%>
<%= campinfolistRec.campmclscd%>
<%= campinfolistRec.campmclsnm%>
<%= campinfolistRec.camppurp%>
<%= campinfolistRec.campexecclsfcd%>
<%= campinfolistRec.campexecfrdt%>
<%= campinfolistRec.campexectodt%>
<%= campinfolistRec.campchnlfrdt%>
<%= campinfolistRec.campchnltodt%>
<%= campinfolistRec.campobjcnt%>
<%= campinfolistRec.campplanpersid%>
<%= campinfolistRec.campplanpersnm%>
<%= campinfolistRec.campexecguid%>
<%= campinfolistRec.outsdcustyn%>
<%= campinfolistRec.camptypecd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Oct 17 16:27:18 KST 2008 */