/***************************************************************************************************
* 파일명 : SS_SLS_BRSUP_2900_ADataSet.java
* 기능 : 센터지원-판촉현황-요원관리-요원별실적관리-초기화면
* 작성일자 : 2016-05-02
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 *  센터지원-판촉현황-요원관리-요원별실적관리-초기화면
 *
 */


public class SS_SLS_BRSUP_2900_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList curstafclsfcd = new ArrayList();
	public ArrayList curcntrstatcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_BRSUP_2900_ADataSet(){}
	public SS_SLS_BRSUP_2900_ADataSet(String errcode, String errmsg){
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
			SS_SLS_BRSUP_2900_ATEAMLISTRecord rec = new SS_SLS_BRSUP_2900_ATEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SS_SLS_BRSUP_2900_APARTLISTRecord rec = new SS_SLS_BRSUP_2900_APARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SS_SLS_BRSUP_2900_AAREALISTRecord rec = new SS_SLS_BRSUP_2900_AAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SS_SLS_BRSUP_2900_ACURSTAFCLSFCDRecord rec = new SS_SLS_BRSUP_2900_ACURSTAFCLSFCDRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.curstafclsfcd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			SS_SLS_BRSUP_2900_ACURCNTRSTATCDRecord rec = new SS_SLS_BRSUP_2900_ACURCNTRSTATCDRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.curcntrstatcd.add(rec);
		}
	}

	public String teamlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_SLS_BRSUP_2900_ATEAMLISTRecord rec = (SS_SLS_BRSUP_2900_ATEAMLISTRecord)teamlist.get(i);


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
			SS_SLS_BRSUP_2900_APARTLISTRecord rec = (SS_SLS_BRSUP_2900_APARTLISTRecord)partlist.get(i);


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
			SS_SLS_BRSUP_2900_AAREALISTRecord rec = (SS_SLS_BRSUP_2900_AAREALISTRecord)arealist.get(i);


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

	public String curstafclsfcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curstafclsfcd.size();
		for(int i=0; i<size; i++){
			SS_SLS_BRSUP_2900_ACURSTAFCLSFCDRecord rec = (SS_SLS_BRSUP_2900_ACURSTAFCLSFCDRecord)curstafclsfcd.get(i);


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

	public String curcntrstatcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcntrstatcd.size();
		for(int i=0; i<size; i++){
			SS_SLS_BRSUP_2900_ACURCNTRSTATCDRecord rec = (SS_SLS_BRSUP_2900_ACURCNTRSTATCDRecord)curcntrstatcd.get(i);


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
			SS_SLS_BRSUP_2900_ATEAMLISTRecord rec = (SS_SLS_BRSUP_2900_ATEAMLISTRecord)teamlist.get(i);


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
			SS_SLS_BRSUP_2900_APARTLISTRecord rec = (SS_SLS_BRSUP_2900_APARTLISTRecord)partlist.get(i);


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
			SS_SLS_BRSUP_2900_AAREALISTRecord rec = (SS_SLS_BRSUP_2900_AAREALISTRecord)arealist.get(i);


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

	public String curstafclsfcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curstafclsfcd.size();
		for(int i=0; i<size; i++){
			SS_SLS_BRSUP_2900_ACURSTAFCLSFCDRecord rec = (SS_SLS_BRSUP_2900_ACURSTAFCLSFCDRecord)curstafclsfcd.get(i);


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

	public String curcntrstatcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcntrstatcd.size();
		for(int i=0; i<size; i++){
			SS_SLS_BRSUP_2900_ACURCNTRSTATCDRecord rec = (SS_SLS_BRSUP_2900_ACURCNTRSTATCDRecord)curcntrstatcd.get(i);


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
			SS_SLS_BRSUP_2900_ATEAMLISTRecord rec = (SS_SLS_BRSUP_2900_ATEAMLISTRecord)teamlist.get(i);


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
			SS_SLS_BRSUP_2900_APARTLISTRecord rec = (SS_SLS_BRSUP_2900_APARTLISTRecord)partlist.get(i);


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
			SS_SLS_BRSUP_2900_AAREALISTRecord rec = (SS_SLS_BRSUP_2900_AAREALISTRecord)arealist.get(i);


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

	public String curstafclsfcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curstafclsfcd.size();
		for(int i=0; i<size; i++){
			SS_SLS_BRSUP_2900_ACURSTAFCLSFCDRecord rec = (SS_SLS_BRSUP_2900_ACURSTAFCLSFCDRecord)curstafclsfcd.get(i);


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

	public String curcntrstatcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcntrstatcd.size();
		for(int i=0; i<size; i++){
			SS_SLS_BRSUP_2900_ACURCNTRSTATCDRecord rec = (SS_SLS_BRSUP_2900_ACURCNTRSTATCDRecord)curcntrstatcd.get(i);


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
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRSUP_2900_ADataSet ds = (SS_SLS_BRSUP_2900_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_SLS_BRSUP_2900_ATEAMLISTRecord teamlistRec = (SS_SLS_BRSUP_2900_ATEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_SLS_BRSUP_2900_APARTLISTRecord partlistRec = (SS_SLS_BRSUP_2900_APARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_SLS_BRSUP_2900_AAREALISTRecord arealistRec = (SS_SLS_BRSUP_2900_AAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curstafclsfcd.size(); i++){
		SS_SLS_BRSUP_2900_ACURSTAFCLSFCDRecord curstafclsfcdRec = (SS_SLS_BRSUP_2900_ACURSTAFCLSFCDRecord)ds.curstafclsfcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcntrstatcd.size(); i++){
		SS_SLS_BRSUP_2900_ACURCNTRSTATCDRecord curcntrstatcdRec = (SS_SLS_BRSUP_2900_ACURCNTRSTATCDRecord)ds.curcntrstatcd.get(i);%>
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
<%= ds.getCurstafclsfcd()%>
<%= ds.getCurcntrstatcd()%>
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
<%= curstafclsfcdRec.cicodeval%>
<%= curstafclsfcdRec.cicdnm%>
<%= curstafclsfcdRec.ciymgbcd%>
<%= curstafclsfcdRec.cicdgb%>
<%= curstafclsfcdRec.cicdynm%>
<%= curcntrstatcdRec.cicodeval%>
<%= curcntrstatcdRec.cicdnm%>
<%= curcntrstatcdRec.ciymgbcd%>
<%= curcntrstatcdRec.cicdgb%>
<%= curcntrstatcdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 03 18:08:49 KST 2016 */