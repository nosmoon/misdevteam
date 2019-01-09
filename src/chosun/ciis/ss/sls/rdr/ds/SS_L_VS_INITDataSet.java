/***************************************************************************************************
* ���ϸ� : .java
* ��� : *������Ȳ-VacationStop-��û �ʱ�ȭ��
* �ۼ����� : 2009-03-12
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * ������Ȳ-VacationStop-��û �ʱ�ȭ��
 */

public class SS_L_VS_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList clsfcd = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList aplcpathcd = new ArrayList();
	public ArrayList curvaca_arearegncd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_VS_INITDataSet(){}
	public SS_L_VS_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_VS_INITTEAMLISTRecord rec = new SS_L_VS_INITTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SS_L_VS_INITPARTLISTRecord rec = new SS_L_VS_INITPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SS_L_VS_INITAREALISTRecord rec = new SS_L_VS_INITAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SS_L_VS_INITCLSFCDRecord rec = new SS_L_VS_INITCLSFCDRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.clsfcd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			SS_L_VS_INITAPLCPATHCDRecord rec = new SS_L_VS_INITAPLCPATHCDRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.aplcpathcd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			SS_L_VS_INITCURVACA_AREAREGNCDRecord rec = new SS_L_VS_INITCURVACA_AREAREGNCDRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.curvaca_arearegncd.add(rec);
		}
	}

	public String teamlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITTEAMLISTRecord rec = (SS_L_VS_INITTEAMLISTRecord)teamlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
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

	public String partlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = partlist.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITPARTLISTRecord rec = (SS_L_VS_INITPARTLISTRecord)partlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
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

	public String arealistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = arealist.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITAREALISTRecord rec = (SS_L_VS_INITAREALISTRecord)arealist.get(i);
			
			
			String code = rec.area_cd;
			String name = rec.area_nm;
			
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

	public String clsfcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITCLSFCDRecord rec = (SS_L_VS_INITCLSFCDRecord)clsfcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String aplcpathcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpathcd.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITAPLCPATHCDRecord rec = (SS_L_VS_INITAPLCPATHCDRecord)aplcpathcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String curvaca_arearegncdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curvaca_arearegncd.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITCURVACA_AREAREGNCDRecord rec = (SS_L_VS_INITCURVACA_AREAREGNCDRecord)curvaca_arearegncd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String teamlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITTEAMLISTRecord rec = (SS_L_VS_INITTEAMLISTRecord)teamlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_cd");
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

	public String partlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = partlist.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITPARTLISTRecord rec = (SS_L_VS_INITPARTLISTRecord)partlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_cd");
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

	public String arealistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = arealist.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITAREALISTRecord rec = (SS_L_VS_INITAREALISTRecord)arealist.get(i);
			
			
			String code = rec.area_cd;
			String name = rec.area_nm;
			
			sb.append("<input name=\"");
			sb.append("area_cd");
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

	public String clsfcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITCLSFCDRecord rec = (SS_L_VS_INITCLSFCDRecord)clsfcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String aplcpathcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpathcd.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITAPLCPATHCDRecord rec = (SS_L_VS_INITAPLCPATHCDRecord)aplcpathcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curvaca_arearegncdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curvaca_arearegncd.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITCURVACA_AREAREGNCDRecord rec = (SS_L_VS_INITCURVACA_AREAREGNCDRecord)curvaca_arearegncd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String teamlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITTEAMLISTRecord rec = (SS_L_VS_INITTEAMLISTRecord)teamlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_cd");
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

	public String partlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = partlist.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITPARTLISTRecord rec = (SS_L_VS_INITPARTLISTRecord)partlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_cd");
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

	public String arealistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = arealist.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITAREALISTRecord rec = (SS_L_VS_INITAREALISTRecord)arealist.get(i);
			
			
			String code = rec.area_cd;
			String name = rec.area_nm;
			
			sb.append("<input name=\"");
			sb.append("area_cd");
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

	public String clsfcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITCLSFCDRecord rec = (SS_L_VS_INITCLSFCDRecord)clsfcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String aplcpathcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpathcd.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITAPLCPATHCDRecord rec = (SS_L_VS_INITAPLCPATHCDRecord)aplcpathcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curvaca_arearegncdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curvaca_arearegncd.size();
		for(int i=0; i<size; i++){
			SS_L_VS_INITCURVACA_AREAREGNCDRecord rec = (SS_L_VS_INITCURVACA_AREAREGNCDRecord)curvaca_arearegncd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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
	SS_L_VS_INITDataSet ds = (SS_L_VS_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_L_VS_INITTEAMLISTRecord teamlistRec = (SS_L_VS_INITTEAMLISTRecord)ds.teamlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_L_VS_INITPARTLISTRecord partlistRec = (SS_L_VS_INITPARTLISTRecord)ds.partlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_L_VS_INITAREALISTRecord arealistRec = (SS_L_VS_INITAREALISTRecord)ds.arealist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.clsfcd.size(); i++){
		SS_L_VS_INITCLSFCDRecord clsfcdRec = (SS_L_VS_INITCLSFCDRecord)ds.clsfcd.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.aplcpathcd.size(); i++){
		SS_L_VS_INITAPLCPATHCDRecord aplcpathcdRec = (SS_L_VS_INITAPLCPATHCDRecord)ds.aplcpathcd.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curvaca_arearegncd.size(); i++){
		SS_L_VS_INITCURVACA_AREAREGNCDRecord curvaca_arearegncdRec = (SS_L_VS_INITCURVACA_AREAREGNCDRecord)ds.curvaca_arearegncd.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getArealist()%>
<%= ds.getClsfcd()%>
<%= ds.getAplcpathcd()%>
<%= ds.getCurvaca_arearegncd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
<%= partlistRec.dept_cd%>
<%= partlistRec.dept_nm%>
<%= partlistRec.supr_dept_cd%>
<%= arealistRec.area_cd%>
<%= arealistRec.area_nm%>
<%= arealistRec.dept_cd%>
<%= arealistRec.supr_dept_cd%>
<%= clsfcdRec.cicodeval%>
<%= clsfcdRec.cicdnm%>
<%= clsfcdRec.ciymgbcd%>
<%= clsfcdRec.cicdgb%>
<%= clsfcdRec.cicdynm%>
<%= aplcpathcdRec.cicodeval%>
<%= aplcpathcdRec.cicdnm%>
<%= aplcpathcdRec.ciymgbcd%>
<%= aplcpathcdRec.cicdgb%>
<%= aplcpathcdRec.cicdynm%>
<%= curvaca_arearegncdRec.cicodeval%>
<%= curvaca_arearegncdRec.cicdnm%>
<%= curvaca_arearegncdRec.ciymgbcd%>
<%= curvaca_arearegncdRec.cicdgb%>
<%= curvaca_arearegncdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 17 15:17:29 KST 2009 */