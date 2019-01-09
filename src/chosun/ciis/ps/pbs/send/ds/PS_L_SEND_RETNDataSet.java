/***************************************************************************************************
* ���ϸ� : SP_PS_L_SEND_RETN.java
* �߼�-�ݼ۰��� ��ȸȭ��
* �ۼ����� : 2004-03-19
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * �߼�-�ݼ۰��� ��ȸȭ��
 *
 */

public class PS_L_SEND_RETNDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList retnptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_SEND_RETNDataSet(){}
	public PS_L_SEND_RETNDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			PS_L_SEND_RETNRETNPTCRCURRecord rec = new PS_L_SEND_RETNRETNPTCRCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.retnseq = Util.checkString(rset0.getString("retnseq"));
			rec.retndt = Util.checkString(rset0.getString("retndt"));
			rec.retnclsf = Util.checkString(rset0.getString("retnclsf"));
			rec.retnclsf_nm = Util.checkString(rset0.getString("retnclsf_nm"));
			rec.retn_nmno = Util.checkString(rset0.getString("retn_nmno"));
			rec.bns_bookcd = Util.checkString(rset0.getString("bns_bookcd"));
			rec.bns_booknm = Util.checkString(rset0.getString("bns_booknm"));
			rec.agrmntdt = Util.checkString(rset0.getString("agrmntdt"));
			rec.agrmntamt = Util.checkString(rset0.getString("agrmntamt"));
			rec.retnresncd = Util.checkString(rset0.getString("retnresncd"));
			rec.retnresncd_nm = Util.checkString(rset0.getString("retnresncd_nm"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			rec.boprocyn = Util.checkString(rset0.getString("boprocyn"));
			rec.boprocdt = Util.checkString(rset0.getString("boprocdt"));
			rec.boprocmemo = Util.checkString(rset0.getString("boprocmemo"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			this.retnptcrcur.add(rec);
		}
	}

	public String retnptcrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnptcrcur.size();
		for(int i=0; i<size; i++){
			PS_L_SEND_RETNRETNPTCRCURRecord rec = (PS_L_SEND_RETNRETNPTCRCURRecord)retnptcrcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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

	public String retnptcrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnptcrcur.size();
		for(int i=0; i<size; i++){
			PS_L_SEND_RETNRETNPTCRCURRecord rec = (PS_L_SEND_RETNRETNPTCRCURRecord)retnptcrcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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

	public String retnptcrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnptcrcur.size();
		for(int i=0; i<size; i++){
			PS_L_SEND_RETNRETNPTCRCURRecord rec = (PS_L_SEND_RETNRETNPTCRCURRecord)retnptcrcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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
	PS_L_SEND_RETNDataSet ds = (PS_L_SEND_RETNDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.retnptcrcur.size(); i++){
		PS_L_SEND_RETNRETNPTCRCURRecord retnptcrcurRec = (PS_L_SEND_RETNRETNPTCRCURRecord)ds.retnptcrcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getRetnptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= retnptcrcurRec.rdr_no%>
<%= retnptcrcurRec.medicd%>
<%= retnptcrcurRec.termsubsno%>
<%= retnptcrcurRec.rdrnm%>
<%= retnptcrcurRec.retnseq%>
<%= retnptcrcurRec.retndt%>
<%= retnptcrcurRec.retnclsf%>
<%= retnptcrcurRec.retnclsf_nm%>
<%= retnptcrcurRec.retn_nmno%>
<%= retnptcrcurRec.bns_bookcd%>
<%= retnptcrcurRec.bns_booknm%>
<%= retnptcrcurRec.agrmntdt%>
<%= retnptcrcurRec.agrmntamt%>
<%= retnptcrcurRec.retnresncd%>
<%= retnptcrcurRec.retnresncd_nm%>
<%= retnptcrcurRec.memo%>
<%= retnptcrcurRec.boprocyn%>
<%= retnptcrcurRec.boprocdt%>
<%= retnptcrcurRec.boprocmemo%>
<%= retnptcrcurRec.bocd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 18 16:58:09 KST 2008 */