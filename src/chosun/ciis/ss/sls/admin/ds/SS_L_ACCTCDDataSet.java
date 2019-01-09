/***************************************************************************************************
* ���ϸ� : SS_L_ACCTCDDataSet.java
* ��� : ������-�����ڵ�-����� ���� DataSet
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * ������-�����ڵ�-����� ���� DataSet
 */


public class SS_L_ACCTCDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList acctcdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_ACCTCDDataSet(){}
	public SS_L_ACCTCDDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_ACCTCDACCTCDCURRecord rec = new SS_L_ACCTCDACCTCDCURRecord();
			rec.acctcd = Util.checkString(rset0.getString("acctcd"));
			rec.acctnm = Util.checkString(rset0.getString("acctnm"));
			rec.imptexpnclsf = Util.checkString(rset0.getString("imptexpnclsf"));
			rec.leaf_inyn = Util.checkString(rset0.getString("leaf_inyn"));
			rec.empadvyn = Util.checkString(rset0.getString("empadvyn"));
			this.acctcdcur.add(rec);
		}
		this.totalcnt = cstmt.getLong(9);
	}

	public String acctcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acctcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_ACCTCDACCTCDCURRecord rec = (SS_L_ACCTCDACCTCDCURRecord)acctcdcur.get(i);
			
			
			String code = rec.acctcd;
			String name = rec.acctnm;
			
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

	public String acctcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acctcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_ACCTCDACCTCDCURRecord rec = (SS_L_ACCTCDACCTCDCURRecord)acctcdcur.get(i);
			
			
			String code = rec.acctcd;
			String name = rec.acctnm;
			
			sb.append("<input name=\"");
			sb.append("acctcd");
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

	public String acctcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acctcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_ACCTCDACCTCDCURRecord rec = (SS_L_ACCTCDACCTCDCURRecord)acctcdcur.get(i);
			
			
			String code = rec.acctcd;
			String name = rec.acctnm;
			
			sb.append("<input name=\"");
			sb.append("acctcd");
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
	SS_L_ACCTCDDataSet ds = (SS_L_ACCTCDDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.acctcdcur.size(); i++){
		SS_L_ACCTCDACCTCDCURRecord acctcdcurRec = (SS_L_ACCTCDACCTCDCURRecord)ds.acctcdcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAcctcdcur()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= acctcdcurRec.acctcd%>
<%= acctcdcurRec.acctnm%>
<%= acctcdcurRec.imptexpnclsf%>
<%= acctcdcurRec.leaf_inyn%>
<%= acctcdcurRec.empadvyn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jul 03 17:32:29 KST 2004 */