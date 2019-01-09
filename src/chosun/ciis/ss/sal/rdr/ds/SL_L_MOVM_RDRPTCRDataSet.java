/***************************************************************************************************
* ���ϸ� : SL_L_MOVM_RDRPTCRDataSet.java
* ��� : ������������(���������˾�-�̻系��)
* �ۼ����� : 2003-12-27
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * ������������(���������˾�-�̻系��)
 *
 */


public class SL_L_MOVM_RDRPTCRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList movm_rdrcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_MOVM_RDRPTCRDataSet(){}
	public SL_L_MOVM_RDRPTCRDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(9);
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord rec = new SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord();
			rec.movmdt = Util.checkString(rset0.getString("movmdt"));
			rec.trsfbocd = Util.checkString(rset0.getString("trsfbocd"));
			rec.trsfbonm = Util.checkString(rset0.getString("trsfbonm"));
			rec.acptbocd = Util.checkString(rset0.getString("acptbocd"));
			rec.acptbonm = Util.checkString(rset0.getString("acptbonm"));
			this.movm_rdrcur.add(rec);
		}
	}

	public String movm_rdrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = movm_rdrcur.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord rec = (SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord)movm_rdrcur.get(i);


			String code = rec.movmdt;
			String name = rec.trsfbocd;

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

	public String movm_rdrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = movm_rdrcur.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord rec = (SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord)movm_rdrcur.get(i);


			String code = rec.movmdt;
			String name = rec.trsfbocd;

			sb.append("<input name=\"");
			sb.append("movmdt");
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

	public String movm_rdrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = movm_rdrcur.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord rec = (SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord)movm_rdrcur.get(i);


			String code = rec.movmdt;
			String name = rec.trsfbocd;

			sb.append("<input name=\"");
			sb.append("movmdt");
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
	SL_L_MOVM_RDRPTCRDataSet ds = (SL_L_MOVM_RDRPTCRDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.movm_rdrcur.size(); i++){
		SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord movm_rdrcurRec = (SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord)ds.movm_rdrcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getMovm_rdrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= movm_rdrcurRec.movmdt%>
<%= movm_rdrcurRec.trsfbocd%>
<%= movm_rdrcurRec.trsfbonm%>
<%= movm_rdrcurRec.acptbocd%>
<%= movm_rdrcurRec.acptbonm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Dec 29 22:25:04 KST 2003 */