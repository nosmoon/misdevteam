/***************************************************************************************************
* ���ϸ� :SL_MO_L_VSPTCRDataSet.java_����Ͽ�
* ��� : �Ǹ�-���ڰ���-���������˻�-����������ȸ-���������˾�-�޵�����Ʈ
* �ۼ����� : 2017-02-06
* �ۼ��� : �� �� ��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ss.sal.rdr.rec.SL_MO_L_VSPTCRVSPTCRCURRecord;

/**
 *
 */


public class SL_MO_L_VSPTCRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList vsptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_MO_L_VSPTCRDataSet(){}
	public SL_MO_L_VSPTCRDataSet(String errcode, String errmsg, long totalcnt){
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
			SL_MO_L_VSPTCRVSPTCRCURRecord rec = new SL_MO_L_VSPTCRVSPTCRCURRecord();
			rec.suspfrdt = Util.checkString(rset0.getString("suspfrdt"));
			rec.susptodt = Util.checkString(rset0.getString("susptodt"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.clsfnm = Util.checkString(rset0.getString("clsfnm"));
			this.vsptcrcur.add(rec);
		}
	}

	public String vsptcrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vsptcrcur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_VSPTCRVSPTCRCURRecord rec = (SL_MO_L_VSPTCRVSPTCRCURRecord)vsptcrcur.get(i);


			String code = rec.suspfrdt;
			String name = rec.susptodt;

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

	public String vsptcrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vsptcrcur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_VSPTCRVSPTCRCURRecord rec = (SL_MO_L_VSPTCRVSPTCRCURRecord)vsptcrcur.get(i);


			String code = rec.suspfrdt;
			String name = rec.susptodt;

			sb.append("<input name=\"");
			sb.append("suspfrdt");
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

	public String vsptcrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vsptcrcur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_VSPTCRVSPTCRCURRecord rec = (SL_MO_L_VSPTCRVSPTCRCURRecord)vsptcrcur.get(i);


			String code = rec.suspfrdt;
			String name = rec.susptodt;

			sb.append("<input name=\"");
			sb.append("suspfrdt");
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
	SL_MO_L_VSPTCRDataSet ds = (SL_MO_L_VSPTCRDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.vsptcrcur.size(); i++){
		SL_MO_L_VSPTCRVSPTCRCURRecord vsptcrcurRec = (SL_MO_L_VSPTCRVSPTCRCURRecord)ds.vsptcrcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getVsptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= vsptcrcurRec.suspfrdt%>
<%= vsptcrcurRec.susptodt%>
<%= vsptcrcurRec.medinm%>
<%= vsptcrcurRec.bonm%>
<%= vsptcrcurRec.clsfnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 06 10:55:12 KST 2017 */