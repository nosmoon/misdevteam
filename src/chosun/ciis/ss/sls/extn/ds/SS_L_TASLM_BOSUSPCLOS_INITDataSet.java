/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황 - 지국중지마감 목록 초기화 
* 작성일자 : 2009-08-26
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황 - 지국중지마감 목록 초기화 
 */

public class SS_L_TASLM_BOSUSPCLOS_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList aplcpath = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList curtype2 = new ArrayList();
	public ArrayList curtype1 = new ArrayList();
	public ArrayList curresitype = new ArrayList();
	public ArrayList suspresncd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_TASLM_BOSUSPCLOS_INITDataSet(){}
	public SS_L_TASLM_BOSUSPCLOS_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_TASLM_BOSUSPCLOS_INITCURTYPE1Record rec = new SS_L_TASLM_BOSUSPCLOS_INITCURTYPE1Record();
			rec.code = Util.checkString(rset0.getString("code"));
			rec.name = Util.checkString(rset0.getString("name"));
			this.curtype1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SS_L_TASLM_BOSUSPCLOS_INITCURTYPE2Record rec = new SS_L_TASLM_BOSUSPCLOS_INITCURTYPE2Record();
			rec.code = Util.checkString(rset1.getString("code"));
			rec.name = Util.checkString(rset1.getString("name"));
			this.curtype2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SS_L_TASLM_BOSUSPCLOS_INITCURRESITYPERecord rec = new SS_L_TASLM_BOSUSPCLOS_INITCURRESITYPERecord();
			rec.code = Util.checkString(rset2.getString("code"));
			rec.name = Util.checkString(rset2.getString("name"));
			this.curresitype.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			SS_L_TASLM_BOSUSPCLOS_INITAPLCPATHRecord rec = new SS_L_TASLM_BOSUSPCLOS_INITAPLCPATHRecord();
			rec.code = Util.checkString(rset3.getString("code"));
			rec.name = Util.checkString(rset3.getString("name"));
			this.aplcpath.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			SS_L_TASLM_BOSUSPCLOS_INITSUSPRESNCDRecord rec = new SS_L_TASLM_BOSUSPCLOS_INITSUSPRESNCDRecord();
			rec.code = Util.checkString(rset4.getString("code"));
			rec.name = Util.checkString(rset4.getString("name"));
			this.suspresncd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(13);
		while(rset5.next()){
			SS_L_TASLM_BOSUSPCLOS_INITTEAMLISTRecord rec = new SS_L_TASLM_BOSUSPCLOS_INITTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset5.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset5.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(14);
		while(rset6.next()){
			SS_L_TASLM_BOSUSPCLOS_INITPARTLISTRecord rec = new SS_L_TASLM_BOSUSPCLOS_INITPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset6.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset6.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset6.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(15);
		while(rset7.next()){
			SS_L_TASLM_BOSUSPCLOS_INITAREALISTRecord rec = new SS_L_TASLM_BOSUSPCLOS_INITAREALISTRecord();
			rec.area_cd = Util.checkString(rset7.getString("area_cd"));
			rec.area_nm = Util.checkString(rset7.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset7.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset7.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
	}

	public String curtype1OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curtype1.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITCURTYPE1Record rec = (SS_L_TASLM_BOSUSPCLOS_INITCURTYPE1Record)curtype1.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
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

	public String curtype2OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curtype2.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITCURTYPE2Record rec = (SS_L_TASLM_BOSUSPCLOS_INITCURTYPE2Record)curtype2.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
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

	public String curresitypeOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curresitype.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITCURRESITYPERecord rec = (SS_L_TASLM_BOSUSPCLOS_INITCURRESITYPERecord)curresitype.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
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

	public String aplcpathOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpath.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITAPLCPATHRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITAPLCPATHRecord)aplcpath.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
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

	public String suspresncdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = suspresncd.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITSUSPRESNCDRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITSUSPRESNCDRecord)suspresncd.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
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

	public String teamlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITTEAMLISTRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_L_TASLM_BOSUSPCLOS_INITPARTLISTRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_L_TASLM_BOSUSPCLOS_INITAREALISTRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String curtype1ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curtype1.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITCURTYPE1Record rec = (SS_L_TASLM_BOSUSPCLOS_INITCURTYPE1Record)curtype1.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
			sb.append("<input name=\"");
			sb.append("code");
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

	public String curtype2ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curtype2.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITCURTYPE2Record rec = (SS_L_TASLM_BOSUSPCLOS_INITCURTYPE2Record)curtype2.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
			sb.append("<input name=\"");
			sb.append("code");
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

	public String curresitypeChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curresitype.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITCURRESITYPERecord rec = (SS_L_TASLM_BOSUSPCLOS_INITCURRESITYPERecord)curresitype.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
			sb.append("<input name=\"");
			sb.append("code");
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

	public String aplcpathChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpath.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITAPLCPATHRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITAPLCPATHRecord)aplcpath.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
			sb.append("<input name=\"");
			sb.append("code");
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

	public String suspresncdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = suspresncd.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITSUSPRESNCDRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITSUSPRESNCDRecord)suspresncd.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
			sb.append("<input name=\"");
			sb.append("code");
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

	public String teamlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITTEAMLISTRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_L_TASLM_BOSUSPCLOS_INITPARTLISTRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_L_TASLM_BOSUSPCLOS_INITAREALISTRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String curtype1RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curtype1.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITCURTYPE1Record rec = (SS_L_TASLM_BOSUSPCLOS_INITCURTYPE1Record)curtype1.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
			sb.append("<input name=\"");
			sb.append("code");
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

	public String curtype2RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curtype2.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITCURTYPE2Record rec = (SS_L_TASLM_BOSUSPCLOS_INITCURTYPE2Record)curtype2.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
			sb.append("<input name=\"");
			sb.append("code");
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

	public String curresitypeRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curresitype.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITCURRESITYPERecord rec = (SS_L_TASLM_BOSUSPCLOS_INITCURRESITYPERecord)curresitype.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
			sb.append("<input name=\"");
			sb.append("code");
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

	public String aplcpathRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpath.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITAPLCPATHRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITAPLCPATHRecord)aplcpath.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
			sb.append("<input name=\"");
			sb.append("code");
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

	public String suspresncdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = suspresncd.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITSUSPRESNCDRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITSUSPRESNCDRecord)suspresncd.get(i);
			
			
			String code = rec.code;
			String name = rec.name;
			
			sb.append("<input name=\"");
			sb.append("code");
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

	public String teamlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BOSUSPCLOS_INITTEAMLISTRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_L_TASLM_BOSUSPCLOS_INITPARTLISTRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_L_TASLM_BOSUSPCLOS_INITAREALISTRecord rec = (SS_L_TASLM_BOSUSPCLOS_INITAREALISTRecord)arealist.get(i);
			
			
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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_TASLM_BOSUSPCLOS_INITDataSet ds = (SS_L_TASLM_BOSUSPCLOS_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curtype1.size(); i++){
		SS_L_TASLM_BOSUSPCLOS_INITCURTYPE1Record curtype1Rec = (SS_L_TASLM_BOSUSPCLOS_INITCURTYPE1Record)ds.curtype1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curtype2.size(); i++){
		SS_L_TASLM_BOSUSPCLOS_INITCURTYPE2Record curtype2Rec = (SS_L_TASLM_BOSUSPCLOS_INITCURTYPE2Record)ds.curtype2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curresitype.size(); i++){
		SS_L_TASLM_BOSUSPCLOS_INITCURRESITYPERecord curresitypeRec = (SS_L_TASLM_BOSUSPCLOS_INITCURRESITYPERecord)ds.curresitype.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.aplcpath.size(); i++){
		SS_L_TASLM_BOSUSPCLOS_INITAPLCPATHRecord aplcpathRec = (SS_L_TASLM_BOSUSPCLOS_INITAPLCPATHRecord)ds.aplcpath.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.suspresncd.size(); i++){
		SS_L_TASLM_BOSUSPCLOS_INITSUSPRESNCDRecord suspresncdRec = (SS_L_TASLM_BOSUSPCLOS_INITSUSPRESNCDRecord)ds.suspresncd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_L_TASLM_BOSUSPCLOS_INITTEAMLISTRecord teamlistRec = (SS_L_TASLM_BOSUSPCLOS_INITTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_L_TASLM_BOSUSPCLOS_INITPARTLISTRecord partlistRec = (SS_L_TASLM_BOSUSPCLOS_INITPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_L_TASLM_BOSUSPCLOS_INITAREALISTRecord arealistRec = (SS_L_TASLM_BOSUSPCLOS_INITAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurtype1()%>
<%= ds.getCurtype2()%>
<%= ds.getCurresitype()%>
<%= ds.getAplcpath()%>
<%= ds.getSuspresncd()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getArealist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curtype1Rec.code%>
<%= curtype1Rec.name%>
<%= curtype2Rec.code%>
<%= curtype2Rec.name%>
<%= curresitypeRec.code%>
<%= curresitypeRec.name%>
<%= aplcpathRec.code%>
<%= aplcpathRec.name%>
<%= suspresncdRec.code%>
<%= suspresncdRec.name%>
<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
<%= partlistRec.dept_cd%>
<%= partlistRec.dept_nm%>
<%= partlistRec.supr_dept_cd%>
<%= arealistRec.area_cd%>
<%= arealistRec.area_nm%>
<%= arealistRec.dept_cd%>
<%= arealistRec.supr_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 26 18:21:02 KST 2009 */