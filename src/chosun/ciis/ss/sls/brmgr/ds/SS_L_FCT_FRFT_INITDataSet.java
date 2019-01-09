/***************************************************************************************************
* 파일명 : SS_L_FCT_FRFT_INITDataSet.java
* 기능 : 지국경영-공정위 위약금 조회 화면
* 작성일자 : 2004-03-03
* 작성자 : 김성규
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국경영-공정위 위약금 조회 화면
 *
 */


public class SS_L_FCT_FRFT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deptlist = new ArrayList();
	public ArrayList delbocomlist = new ArrayList();
	public ArrayList viltresnlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_FCT_FRFT_INITDataSet(){}
	public SS_L_FCT_FRFT_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			SS_L_FCT_FRFT_INITDEPTLISTRecord rec = new SS_L_FCT_FRFT_INITDEPTLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.bcbuseonm = Util.checkString(rset0.getString("bcbuseonm"));
			this.deptlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_L_FCT_FRFT_INITDELBOCOMLISTRecord rec = new SS_L_FCT_FRFT_INITDELBOCOMLISTRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.delbocomlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			SS_L_FCT_FRFT_INITVILTRESNLISTRecord rec = new SS_L_FCT_FRFT_INITVILTRESNLISTRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			this.viltresnlist.add(rec);
		}
	}

	public String deptlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlist.size();
		for(int i=0; i<size; i++){
			SS_L_FCT_FRFT_INITDEPTLISTRecord rec = (SS_L_FCT_FRFT_INITDEPTLISTRecord)deptlist.get(i);


			String code = rec.deptcd;
			String name = rec.bcbuseonm;

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

	public String delbocomlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = delbocomlist.size();
		for(int i=0; i<size; i++){
			SS_L_FCT_FRFT_INITDELBOCOMLISTRecord rec = (SS_L_FCT_FRFT_INITDELBOCOMLISTRecord)delbocomlist.get(i);


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

	public String viltresnlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = viltresnlist.size();
		for(int i=0; i<size; i++){
			SS_L_FCT_FRFT_INITVILTRESNLISTRecord rec = (SS_L_FCT_FRFT_INITVILTRESNLISTRecord)viltresnlist.get(i);


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

	public String deptlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlist.size();
		for(int i=0; i<size; i++){
			SS_L_FCT_FRFT_INITDEPTLISTRecord rec = (SS_L_FCT_FRFT_INITDEPTLISTRecord)deptlist.get(i);


			String code = rec.deptcd;
			String name = rec.bcbuseonm;

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

	public String delbocomlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = delbocomlist.size();
		for(int i=0; i<size; i++){
			SS_L_FCT_FRFT_INITDELBOCOMLISTRecord rec = (SS_L_FCT_FRFT_INITDELBOCOMLISTRecord)delbocomlist.get(i);


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

	public String viltresnlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = viltresnlist.size();
		for(int i=0; i<size; i++){
			SS_L_FCT_FRFT_INITVILTRESNLISTRecord rec = (SS_L_FCT_FRFT_INITVILTRESNLISTRecord)viltresnlist.get(i);


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

	public String deptlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlist.size();
		for(int i=0; i<size; i++){
			SS_L_FCT_FRFT_INITDEPTLISTRecord rec = (SS_L_FCT_FRFT_INITDEPTLISTRecord)deptlist.get(i);


			String code = rec.deptcd;
			String name = rec.bcbuseonm;

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

	public String delbocomlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = delbocomlist.size();
		for(int i=0; i<size; i++){
			SS_L_FCT_FRFT_INITDELBOCOMLISTRecord rec = (SS_L_FCT_FRFT_INITDELBOCOMLISTRecord)delbocomlist.get(i);


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

	public String viltresnlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = viltresnlist.size();
		for(int i=0; i<size; i++){
			SS_L_FCT_FRFT_INITVILTRESNLISTRecord rec = (SS_L_FCT_FRFT_INITVILTRESNLISTRecord)viltresnlist.get(i);


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
	SS_L_FCT_FRFT_INITDataSet ds = (SS_L_FCT_FRFT_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.deptlist.size(); i++){
		SS_L_FCT_FRFT_INITDEPTLISTRecord deptlistRec = (SS_L_FCT_FRFT_INITDEPTLISTRecord)ds.deptlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.delbocomlist.size(); i++){
		SS_L_FCT_FRFT_INITDELBOCOMLISTRecord delbocomlistRec = (SS_L_FCT_FRFT_INITDELBOCOMLISTRecord)ds.delbocomlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.viltresnlist.size(); i++){
		SS_L_FCT_FRFT_INITVILTRESNLISTRecord viltresnlistRec = (SS_L_FCT_FRFT_INITVILTRESNLISTRecord)ds.viltresnlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeptlist()%>
<%= ds.getDelbocomlist()%>
<%= ds.getViltresnlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= deptlistRec.deptcd%>
<%= deptlistRec.bcbuseonm%>
<%= delbocomlistRec.cicodeval%>
<%= delbocomlistRec.cicdnm%>
<%= viltresnlistRec.cicodeval%>
<%= viltresnlistRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 22 16:50:35 KST 2004 */