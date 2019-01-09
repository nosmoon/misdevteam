/***************************************************************************************************
* ���ϸ� : PS_L_DAY_SCHEDataSet.java
* ��� : ���Ǳ� ����-�޷�
* �ۼ����� : 2004-03-09
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
 * ���Ǳ� ����-�޷�
 *
 */


public class PS_L_DAY_SCHEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dayschecur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_DAY_SCHEDataSet(){}
	public PS_L_DAY_SCHEDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PS_L_DAY_SCHEDAYSCHECURRecord rec = new PS_L_DAY_SCHEDAYSCHECURRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.endyn = Util.checkString(rset0.getString("endyn"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			this.dayschecur.add(rec);
		}
	}

	public String dayschecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dayschecur.size();
		for(int i=0; i<size; i++){
			PS_L_DAY_SCHEDAYSCHECURRecord rec = (PS_L_DAY_SCHEDAYSCHECURRecord)dayschecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
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

	public String dayschecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dayschecur.size();
		for(int i=0; i<size; i++){
			PS_L_DAY_SCHEDAYSCHECURRecord rec = (PS_L_DAY_SCHEDAYSCHECURRecord)dayschecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
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

	public String dayschecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dayschecur.size();
		for(int i=0; i<size; i++){
			PS_L_DAY_SCHEDAYSCHECURRecord rec = (PS_L_DAY_SCHEDAYSCHECURRecord)dayschecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
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
	PS_L_DAY_SCHEDataSet ds = (PS_L_DAY_SCHEDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.dayschecur.size(); i++){
		PS_L_DAY_SCHEDAYSCHECURRecord dayschecurRec = (PS_L_DAY_SCHEDAYSCHECURRecord)ds.dayschecur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDayschecur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= dayschecurRec.seq%>
<%= dayschecurRec.frdt%>
<%= dayschecurRec.todt%>
<%= dayschecurRec.remk%>
<%= dayschecurRec.endyn%>
<%= dayschecurRec.deptcd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 09 21:43:44 KST 2004 */