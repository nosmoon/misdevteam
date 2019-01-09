/***************************************************************************************************
* 파일명 : .java
* 기능 : *독자현황-VacationStop-코드-초기화면
* 작성일자 : 2009-03-18
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-VacationStop-코드-초기화면
 */

public class SS_L_VSCD_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList curarearegcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_VSCD_INITDataSet(){}
	public SS_L_VSCD_INITDataSet(String errcode, String errmsg){
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
			SS_L_VSCD_INITCURAREAREGCDRecord rec = new SS_L_VSCD_INITCURAREAREGCDRecord();
			rec.vaca_arearegncd = Util.checkString(rset0.getString("vaca_arearegncd"));
			rec.vaca_arearegnnm = Util.checkString(rset0.getString("vaca_arearegnnm"));
			this.curarearegcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SS_L_VSCD_INITTEAMLISTRecord rec = new SS_L_VSCD_INITTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SS_L_VSCD_INITPARTLISTRecord rec = new SS_L_VSCD_INITPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset2.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SS_L_VSCD_INITAREALISTRecord rec = new SS_L_VSCD_INITAREALISTRecord();
			rec.area_cd = Util.checkString(rset3.getString("area_cd"));
			rec.area_nm = Util.checkString(rset3.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset3.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset3.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
	}

	public String curarearegcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curarearegcd.size();
		for(int i=0; i<size; i++){
			SS_L_VSCD_INITCURAREAREGCDRecord rec = (SS_L_VSCD_INITCURAREAREGCDRecord)curarearegcd.get(i);
			
			
			String code = rec.vaca_arearegncd;
			String name = rec.vaca_arearegnnm;
			
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
			SS_L_VSCD_INITTEAMLISTRecord rec = (SS_L_VSCD_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_L_VSCD_INITPARTLISTRecord rec = (SS_L_VSCD_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_L_VSCD_INITAREALISTRecord rec = (SS_L_VSCD_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String curarearegcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curarearegcd.size();
		for(int i=0; i<size; i++){
			SS_L_VSCD_INITCURAREAREGCDRecord rec = (SS_L_VSCD_INITCURAREAREGCDRecord)curarearegcd.get(i);
			
			
			String code = rec.vaca_arearegncd;
			String name = rec.vaca_arearegnnm;
			
			sb.append("<input name=\"");
			sb.append("vaca_arearegncd");
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
			SS_L_VSCD_INITTEAMLISTRecord rec = (SS_L_VSCD_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_L_VSCD_INITPARTLISTRecord rec = (SS_L_VSCD_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_L_VSCD_INITAREALISTRecord rec = (SS_L_VSCD_INITAREALISTRecord)arealist.get(i);
			
			
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

	public String curarearegcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curarearegcd.size();
		for(int i=0; i<size; i++){
			SS_L_VSCD_INITCURAREAREGCDRecord rec = (SS_L_VSCD_INITCURAREAREGCDRecord)curarearegcd.get(i);
			
			
			String code = rec.vaca_arearegncd;
			String name = rec.vaca_arearegnnm;
			
			sb.append("<input name=\"");
			sb.append("vaca_arearegncd");
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
			SS_L_VSCD_INITTEAMLISTRecord rec = (SS_L_VSCD_INITTEAMLISTRecord)teamlist.get(i);
			
			
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
			SS_L_VSCD_INITPARTLISTRecord rec = (SS_L_VSCD_INITPARTLISTRecord)partlist.get(i);
			
			
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
			SS_L_VSCD_INITAREALISTRecord rec = (SS_L_VSCD_INITAREALISTRecord)arealist.get(i);
			
			
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
	SS_L_VSCD_INITDataSet ds = (SS_L_VSCD_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curarearegcd.size(); i++){
		SS_L_VSCD_INITCURAREAREGCDRecord curarearegcdRec = (SS_L_VSCD_INITCURAREAREGCDRecord)ds.curarearegcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_L_VSCD_INITTEAMLISTRecord teamlistRec = (SS_L_VSCD_INITTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_L_VSCD_INITPARTLISTRecord partlistRec = (SS_L_VSCD_INITPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_L_VSCD_INITAREALISTRecord arealistRec = (SS_L_VSCD_INITAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurarearegcd()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getArealist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curarearegcdRec.vaca_arearegncd%>
<%= curarearegcdRec.vaca_arearegnnm%>
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


/* 작성시간 : Wed Mar 18 18:09:01 KST 2009 */