/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_BOCYB_RSLTDataSet.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����(������)-���
* �ۼ����� : 2004-04-08
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-����(������)-���
 *
 */

public class SS_L_RDR_EXTN_BOCYB_RSLTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String frdt;
	public String todt;
	public long totalcnt;

	public SS_L_RDR_EXTN_BOCYB_RSLTDataSet(){}
	public SS_L_RDR_EXTN_BOCYB_RSLTDataSet(String errcode, String errmsg, String frdt, String todt, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.frdt = frdt;
		this.todt = todt;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
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

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.frdt = Util.checkString(cstmt.getString(11));
		this.todt = Util.checkString(cstmt.getString(12));
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_L_RDR_EXTN_BOCYB_RSLTCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_BOCYB_RSLTCURCOMMLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.extnqty = rset0.getInt("extnqty");
			rec.cnfmqty = rset0.getInt("cnfmqty");
			rec.uncnfmqty = rset0.getInt("uncnfmqty");
			rec.errqty = rset0.getInt("errqty");
			rec.rsltqty = rset0.getInt("rsltqty");
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(14);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_BOCYB_RSLTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_BOCYB_RSLTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
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
			SS_L_RDR_EXTN_BOCYB_RSLTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_BOCYB_RSLTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
			SS_L_RDR_EXTN_BOCYB_RSLTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_BOCYB_RSLTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
	SS_L_RDR_EXTN_BOCYB_RSLTDataSet ds = (SS_L_RDR_EXTN_BOCYB_RSLTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_BOCYB_RSLTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_BOCYB_RSLTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFrdt()%>
<%= ds.getTodt()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.extnqty%>
<%= curcommlistRec.cnfmqty%>
<%= curcommlistRec.uncnfmqty%>
<%= curcommlistRec.errqty%>
<%= curcommlistRec.rsltqty%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 08 17:15:38 KST 2004 */