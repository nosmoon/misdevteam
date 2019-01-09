/***************************************************************************************************
* ���ϸ� : PS_L_BILL_TACOM_GRRCPCM.java
* ����-�ϰ��Ա� ��ȸȭ��
* �ۼ����� : 2004-03-29
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ : 
* �������� :     
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/** 
 * ����-�ϰ��Ա� ��ȸȭ��   
 * 
 */

public class PS_L_BILL_TACOM_GRRCPCMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_BILL_TACOM_GRRCPCMDataSet(){}
	public PS_L_BILL_TACOM_GRRCPCMDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(10);
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord rec = new PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord();
			rec.acqdt = Util.checkString(rset0.getString("acqdt"));
			rec.acqno = Util.checkString(rset0.getString("acqno"));
			rec.girono = Util.checkString(rset0.getString("girono"));
			rec.normnoit = rset0.getInt("normnoit");
			rec.normamt = rset0.getInt("normamt");
			rec.rejectnoit = rset0.getInt("rejectnoit");
			rec.rejectamt = rset0.getInt("rejectamt");
			rec.intngironoit = rset0.getInt("intngironoit");
			rec.intngiroamt = rset0.getInt("intngiroamt");
			rec.rmsgdt = Util.checkString(rset0.getString("rmsgdt"));
			rec.rcpmrflendyn = Util.checkString(rset0.getString("rcpmrflendyn"));
			rec.incmgdt = Util.checkString(rset0.getString("incmgdt"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord rec = (PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.acqdt;
			String name = rec.acqno;
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord rec = (PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.acqdt;
			String name = rec.acqno;
			
			sb.append("<input name=\"");
			sb.append("acqdt");
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord rec = (PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.acqdt;
			String name = rec.acqno;
			
			sb.append("<input name=\"");
			sb.append("acqdt");
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
	PS_L_BILL_TACOM_GRRCPCMDataSet ds = (PS_L_BILL_TACOM_GRRCPCMDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord curcommlistRec = (PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.acqdt%>
<%= curcommlistRec.acqno%>
<%= curcommlistRec.girono%>
<%= curcommlistRec.normnoit%>
<%= curcommlistRec.normamt%>
<%= curcommlistRec.rejectnoit%>
<%= curcommlistRec.rejectamt%>
<%= curcommlistRec.intngironoit%>
<%= curcommlistRec.intngiroamt%>
<%= curcommlistRec.rmsgdt%>
<%= curcommlistRec.rcpmrflendyn%>
<%= curcommlistRec.incmgdt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 04 14:09:34 KST 2006 */