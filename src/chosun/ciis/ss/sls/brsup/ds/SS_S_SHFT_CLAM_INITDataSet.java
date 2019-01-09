/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국업무지원-자동이체-청구-초기화면
* 작성일자 : 2009-04-14
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-자동이체-청구-초기화면
 */

public class SS_S_SHFT_CLAM_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList shftclsf = new ArrayList();
	public ArrayList teamlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList jycur = new ArrayList();
	public ArrayList aplcprocstat = new ArrayList();
	public ArrayList aplcclsf = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_SHFT_CLAM_INITDataSet(){}
	public SS_S_SHFT_CLAM_INITDataSet(String errcode, String errmsg){
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
			SS_S_SHFT_CLAM_INITTEAMLISTRecord rec = new SS_S_SHFT_CLAM_INITTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SS_S_SHFT_CLAM_INITPARTLISTRecord rec = new SS_S_SHFT_CLAM_INITPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SS_S_SHFT_CLAM_INITAREALISTRecord rec = new SS_S_SHFT_CLAM_INITAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SS_S_SHFT_CLAM_INITSHFTCLSFRecord rec = new SS_S_SHFT_CLAM_INITSHFTCLSFRecord();
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.shftclsf.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			SS_S_SHFT_CLAM_INITAPLCCLSFRecord rec = new SS_S_SHFT_CLAM_INITAPLCCLSFRecord();
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.aplcclsf.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			SS_S_SHFT_CLAM_INITAPLCPROCSTATRecord rec = new SS_S_SHFT_CLAM_INITAPLCPROCSTATRecord();
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.aplcprocstat.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			SS_S_SHFT_CLAM_INITJYCURRecord rec = new SS_S_SHFT_CLAM_INITJYCURRecord();
			rec.areacd = Util.checkString(rset6.getString("areacd"));
			rec.areanm = Util.checkString(rset6.getString("areanm"));
			this.jycur.add(rec);
		}
	}

	public String teamlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITTEAMLISTRecord rec = (SS_S_SHFT_CLAM_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_S_SHFT_CLAM_INITPARTLISTRecord rec = (SS_S_SHFT_CLAM_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_S_SHFT_CLAM_INITAREALISTRecord rec = (SS_S_SHFT_CLAM_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String shftclsfOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = shftclsf.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITSHFTCLSFRecord rec = (SS_S_SHFT_CLAM_INITSHFTCLSFRecord)shftclsf.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String aplcclsfOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcclsf.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITAPLCCLSFRecord rec = (SS_S_SHFT_CLAM_INITAPLCCLSFRecord)aplcclsf.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String aplcprocstatOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcprocstat.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITAPLCPROCSTATRecord rec = (SS_S_SHFT_CLAM_INITAPLCPROCSTATRecord)aplcprocstat.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String jycurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = jycur.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITJYCURRecord rec = (SS_S_SHFT_CLAM_INITJYCURRecord)jycur.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
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
			SS_S_SHFT_CLAM_INITTEAMLISTRecord rec = (SS_S_SHFT_CLAM_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_S_SHFT_CLAM_INITPARTLISTRecord rec = (SS_S_SHFT_CLAM_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_S_SHFT_CLAM_INITAREALISTRecord rec = (SS_S_SHFT_CLAM_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String shftclsfChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = shftclsf.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITSHFTCLSFRecord rec = (SS_S_SHFT_CLAM_INITSHFTCLSFRecord)shftclsf.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String aplcclsfChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcclsf.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITAPLCCLSFRecord rec = (SS_S_SHFT_CLAM_INITAPLCCLSFRecord)aplcclsf.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String aplcprocstatChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcprocstat.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITAPLCPROCSTATRecord rec = (SS_S_SHFT_CLAM_INITAPLCPROCSTATRecord)aplcprocstat.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String jycurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = jycur.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITJYCURRecord rec = (SS_S_SHFT_CLAM_INITJYCURRecord)jycur.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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
			SS_S_SHFT_CLAM_INITTEAMLISTRecord rec = (SS_S_SHFT_CLAM_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_S_SHFT_CLAM_INITPARTLISTRecord rec = (SS_S_SHFT_CLAM_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_S_SHFT_CLAM_INITAREALISTRecord rec = (SS_S_SHFT_CLAM_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String shftclsfRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = shftclsf.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITSHFTCLSFRecord rec = (SS_S_SHFT_CLAM_INITSHFTCLSFRecord)shftclsf.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String aplcclsfRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcclsf.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITAPLCCLSFRecord rec = (SS_S_SHFT_CLAM_INITAPLCCLSFRecord)aplcclsf.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String aplcprocstatRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcprocstat.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITAPLCPROCSTATRecord rec = (SS_S_SHFT_CLAM_INITAPLCPROCSTATRecord)aplcprocstat.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String jycurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = jycur.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_INITJYCURRecord rec = (SS_S_SHFT_CLAM_INITJYCURRecord)jycur.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_SHFT_CLAM_INITDataSet ds = (SS_S_SHFT_CLAM_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_S_SHFT_CLAM_INITTEAMLISTRecord teamlistRec = (SS_S_SHFT_CLAM_INITTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_S_SHFT_CLAM_INITPARTLISTRecord partlistRec = (SS_S_SHFT_CLAM_INITPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_S_SHFT_CLAM_INITAREALISTRecord arealistRec = (SS_S_SHFT_CLAM_INITAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.shftclsf.size(); i++){
		SS_S_SHFT_CLAM_INITSHFTCLSFRecord shftclsfRec = (SS_S_SHFT_CLAM_INITSHFTCLSFRecord)ds.shftclsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.aplcclsf.size(); i++){
		SS_S_SHFT_CLAM_INITAPLCCLSFRecord aplcclsfRec = (SS_S_SHFT_CLAM_INITAPLCCLSFRecord)ds.aplcclsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.aplcprocstat.size(); i++){
		SS_S_SHFT_CLAM_INITAPLCPROCSTATRecord aplcprocstatRec = (SS_S_SHFT_CLAM_INITAPLCPROCSTATRecord)ds.aplcprocstat.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.jycur.size(); i++){
		SS_S_SHFT_CLAM_INITJYCURRecord jycurRec = (SS_S_SHFT_CLAM_INITJYCURRecord)ds.jycur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getArealist()%>
<%= ds.getShftclsf()%>
<%= ds.getAplcclsf()%>
<%= ds.getAplcprocstat()%>
<%= ds.getJycur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
<%= partlistRec.dept_cd%>
<%= partlistRec.dept_nm%>
<%= partlistRec.supr_dept_cd%>
<%= arealistRec.area_cd%>
<%= arealistRec.area_nm%>
<%= arealistRec.dept_cd%>
<%= arealistRec.supr_dept_cd%>
<%= shftclsfRec.ciymgbcd%>
<%= shftclsfRec.cicdgb%>
<%= shftclsfRec.cicodeval%>
<%= shftclsfRec.cicdnm%>
<%= shftclsfRec.cicdynm%>
<%= aplcclsfRec.ciymgbcd%>
<%= aplcclsfRec.cicdgb%>
<%= aplcclsfRec.cicodeval%>
<%= aplcclsfRec.cicdnm%>
<%= aplcclsfRec.cicdynm%>
<%= aplcprocstatRec.ciymgbcd%>
<%= aplcprocstatRec.cicdgb%>
<%= aplcprocstatRec.cicodeval%>
<%= aplcprocstatRec.cicdnm%>
<%= aplcprocstatRec.cicdynm%>
<%= jycurRec.areacd%>
<%= jycurRec.areanm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 14:49:13 KST 2009 */