/***************************************************************************************************
 * ���ϸ�   : PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord.java
 * ���     : ����-������������ �ʱ�
 * �ۼ����� : 2004-03-08
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.allow.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 *   ����-������������ �ʱ�
 *
 **/

public class PS_L_BOEMP_ALON_KINDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList empalonkindcur = new ArrayList();
	public ArrayList intgbocdcur = new ArrayList();
	public ArrayList deptlistcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_BOEMP_ALON_KINDDataSet(){}
	public PS_L_BOEMP_ALON_KINDDataSet(String errcode, String errmsg){
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
			PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord rec = new PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.busn_alon = Util.checkString(rset0.getString("busn_alon"));
			rec.rslt_alon = Util.checkString(rset0.getString("rslt_alon"));
			rec.dcl_amt_alon = Util.checkString(rset0.getString("dcl_amt_alon"));
			rec.spc_alon = Util.checkString(rset0.getString("spc_alon"));
			rec.posi_alon = Util.checkString(rset0.getString("posi_alon"));
			rec.prsnt_alon = Util.checkString(rset0.getString("prsnt_alon"));
			rec.camp_alon = Util.checkString(rset0.getString("camp_alon"));
			rec.cash_alon = Util.checkString(rset0.getString("cash_alon"));
			rec.advn_alon = Util.checkString(rset0.getString("advn_alon"));
			rec.busnshow_alon = Util.checkString(rset0.getString("busnshow_alon"));
			rec.telfee_alon = Util.checkString(rset0.getString("telfee_alon"));
			this.empalonkindcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord rec = new PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord();
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset1.getString("sellnetclsf"));
			this.intgbocdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(11);
		while(rset2.next()){
			PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord rec = new PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord();
			rec.deptcd = Util.checkString(rset2.getString("deptcd"));
			rec.deptnm = Util.checkString(rset2.getString("deptnm"));
			this.deptlistcur.add(rec);
		}
	}

	public String empalonkindcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = empalonkindcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord rec = (PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord)empalonkindcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.boemp_no;
			
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

	public String intgbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intgbocdcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord rec = (PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord)intgbocdcur.get(i);
			
			
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

	public String deptlistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlistcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord rec = (PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord)deptlistcur.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
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

	public String empalonkindcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = empalonkindcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord rec = (PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord)empalonkindcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.boemp_no;
			
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

	public String intgbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intgbocdcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord rec = (PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord)intgbocdcur.get(i);
			
			
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

	public String deptlistcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlistcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord rec = (PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord)deptlistcur.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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

	public String empalonkindcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = empalonkindcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord rec = (PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord)empalonkindcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.boemp_no;
			
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

	public String intgbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intgbocdcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord rec = (PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord)intgbocdcur.get(i);
			
			
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

	public String deptlistcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlistcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord rec = (PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord)deptlistcur.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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
	PS_L_BOEMP_ALON_KINDDataSet ds = (PS_L_BOEMP_ALON_KINDDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.empalonkindcur.size(); i++){
		PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord empalonkindcurRec = (PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord)ds.empalonkindcur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.intgbocdcur.size(); i++){
		PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord intgbocdcurRec = (PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord)ds.intgbocdcur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.deptlistcur.size(); i++){
		PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord deptlistcurRec = (PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord)ds.deptlistcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getEmpalonkindcur()%>
<%= ds.getIntgbocdcur()%>
<%= ds.getDeptlistcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= empalonkindcurRec.bocd%>
<%= empalonkindcurRec.boemp_no%>
<%= empalonkindcurRec.flnm%>
<%= empalonkindcurRec.deptcd%>
<%= empalonkindcurRec.deptnm%>
<%= empalonkindcurRec.busn_alon%>
<%= empalonkindcurRec.rslt_alon%>
<%= empalonkindcurRec.dcl_amt_alon%>
<%= empalonkindcurRec.spc_alon%>
<%= empalonkindcurRec.posi_alon%>
<%= empalonkindcurRec.prsnt_alon%>
<%= empalonkindcurRec.camp_alon%>
<%= empalonkindcurRec.cash_alon%>
<%= empalonkindcurRec.advn_alon%>
<%= empalonkindcurRec.busnshow_alon%>
<%= empalonkindcurRec.telfee_alon%>
<%= intgbocdcurRec.bocd%>
<%= intgbocdcurRec.bonm%>
<%= intgbocdcurRec.deptcd%>
<%= intgbocdcurRec.sellnetclsf%>
<%= deptlistcurRec.deptcd%>
<%= deptlistcurRec.deptnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 21 18:40:03 KST 2007 */