/***************************************************************************************************
* ���ϸ� : SL_L_MILGPAYDataSet.java
* ��� : ������������(���ϸ������޳����˾�-�����ȸ)
* �ۼ����� : 2004-06-03
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
 * ������������(���ϸ������޳����˾�-�����ȸ)
 *
 */

public class SL_L_MILGPAYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList paycur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_MILGPAYDataSet(){}
	public SL_L_MILGPAYDataSet(String errcode, String errmsg, long totalcnt){
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
			SL_L_MILGPAYPAYCURRecord rec = new SL_L_MILGPAYPAYCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.milgpaydt = Util.checkString(rset0.getString("milgpaydt"));
			rec.milgpayno = Util.checkString(rset0.getString("milgpayno"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.paybasinm = Util.checkString(rset0.getString("paybasinm"));
			rec.pont = rset0.getInt("pont");
			rec.hdqtallmamt = rset0.getInt("hdqtallmamt");
			rec.boallmamt = rset0.getInt("boallmamt");
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.margamyn = Util.checkString(rset0.getString("margamyn"));
			rec.rnum = rset0.getInt("rnum");
			this.paycur.add(rec);
		}
	}

	public String paycurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paycur.size();
		for(int i=0; i<size; i++){
			SL_L_MILGPAYPAYCURRecord rec = (SL_L_MILGPAYPAYCURRecord)paycur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.milgpaydt;
			
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

	public String paycurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paycur.size();
		for(int i=0; i<size; i++){
			SL_L_MILGPAYPAYCURRecord rec = (SL_L_MILGPAYPAYCURRecord)paycur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.milgpaydt;
			
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

	public String paycurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paycur.size();
		for(int i=0; i<size; i++){
			SL_L_MILGPAYPAYCURRecord rec = (SL_L_MILGPAYPAYCURRecord)paycur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.milgpaydt;
			
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
	SL_L_MILGPAYDataSet ds = (SL_L_MILGPAYDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.paycur.size(); i++){
		SL_L_MILGPAYPAYCURRecord paycurRec = (SL_L_MILGPAYPAYCURRecord)ds.paycur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getPaycur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= paycurRec.rdr_no%>
<%= paycurRec.milgpaydt%>
<%= paycurRec.milgpayno%>
<%= paycurRec.medinm%>
<%= paycurRec.paybasinm%>
<%= paycurRec.pont%>
<%= paycurRec.hdqtallmamt%>
<%= paycurRec.boallmamt%>
<%= paycurRec.bonm%>
<%= paycurRec.margamyn%>
<%= paycurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sun Jun 06 16:17:42 KST 2004 */