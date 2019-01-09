/***************************************************************************************************
* ���ϸ� :SL_MO_L_NWSPSUBSCNTRPTCRDataSet.java_����Ͽ�
* ��� : �Ǹ�-���ڰ���-���������˻�-����������ȸ-���������˾�-��������Ʈ
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
import chosun.ciis.ss.sal.rdr.rec.SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord;

/**
 *
 */


public class SL_MO_L_NWSPSUBSCNTRPTCRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList nwspsubscntrcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_MO_L_NWSPSUBSCNTRPTCRDataSet(){}
	public SL_MO_L_NWSPSUBSCNTRPTCRDataSet(String errcode, String errmsg, long totalcnt){
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
			SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = new SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord();
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_extntypenm = Util.checkString(rset0.getString("rdr_extntypenm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.subsuprc = rset0.getInt("subsuprc");
			rec.subsqty = rset0.getInt("subsqty");
			rec.dscnamt = rset0.getInt("dscnamt");
			rec.post_dlvfee = rset0.getInt("post_dlvfee");
			rec.rdr_extncost = rset0.getInt("rdr_extncost");
			rec.freeyn = Util.checkString(rset0.getString("freeyn"));
			rec.freeclsf = Util.checkString(rset0.getString("freeclsf"));
			rec.suspresncd = Util.checkString(rset0.getString("suspresncd"));
			this.nwspsubscntrcur.add(rec);
		}
	}

	public String nwspsubscntrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = (SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);


			String code = rec.rdr_extndt;
			String name = rec.medinm;

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

	public String nwspsubscntrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = (SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);


			String code = rec.rdr_extndt;
			String name = rec.medinm;

			sb.append("<input name=\"");
			sb.append("rdr_extndt");
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

	public String nwspsubscntrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = (SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);


			String code = rec.rdr_extndt;
			String name = rec.medinm;

			sb.append("<input name=\"");
			sb.append("rdr_extndt");
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
	SL_MO_L_NWSPSUBSCNTRPTCRDataSet ds = (SL_MO_L_NWSPSUBSCNTRPTCRDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.nwspsubscntrcur.size(); i++){
		SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord nwspsubscntrcurRec = (SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getNwspsubscntrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= nwspsubscntrcurRec.rdr_extndt%>
<%= nwspsubscntrcurRec.medinm%>
<%= nwspsubscntrcurRec.suspdt%>
<%= nwspsubscntrcurRec.bonm%>
<%= nwspsubscntrcurRec.rdr_extntypenm%>
<%= nwspsubscntrcurRec.remk%>
<%= nwspsubscntrcurRec.extnnm%>
<%= nwspsubscntrcurRec.subsuprc%>
<%= nwspsubscntrcurRec.subsqty%>
<%= nwspsubscntrcurRec.dscnamt%>
<%= nwspsubscntrcurRec.post_dlvfee%>
<%= nwspsubscntrcurRec.rdr_extncost%>
<%= nwspsubscntrcurRec.freeyn%>
<%= nwspsubscntrcurRec.freeclsf%>
<%= nwspsubscntrcurRec.suspresncd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 06 10:54:22 KST 2017 */