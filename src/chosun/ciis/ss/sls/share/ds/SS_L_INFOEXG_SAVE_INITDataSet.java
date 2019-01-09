/***************************************************************************************************
* 파일명 : SS_L_INFOEXG_SAVE_INITDataSet.java
* 기능 : 정보공유 게시판 등록 초기화면
* 작성일자 : 2004-05-20
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유 게시판 등록 초기화면
 *
 */

public class SS_L_INFOEXG_SAVE_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList buseolist = new ArrayList();
	public ArrayList rmsgexttcd_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_INFOEXG_SAVE_INITDataSet(){}
	public SS_L_INFOEXG_SAVE_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord rec = new SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			this.rmsgexttcd_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SS_L_INFOEXG_SAVE_INITBUSEOLISTRecord rec = new SS_L_INFOEXG_SAVE_INITBUSEOLISTRecord();
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.boksnm = Util.checkString(rset1.getString("boksnm"));
			this.buseolist.add(rec);
		}
	}

	public String rmsgexttcd_listOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rmsgexttcd_list.size();
		for(int i=0; i<size; i++){
			SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord rec = (SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord)rmsgexttcd_list.get(i);
			
			
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

	public String buseolistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_INFOEXG_SAVE_INITBUSEOLISTRecord rec = (SS_L_INFOEXG_SAVE_INITBUSEOLISTRecord)buseolist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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

	public String rmsgexttcd_listChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rmsgexttcd_list.size();
		for(int i=0; i<size; i++){
			SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord rec = (SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord)rmsgexttcd_list.get(i);
			
			
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

	public String buseolistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_INFOEXG_SAVE_INITBUSEOLISTRecord rec = (SS_L_INFOEXG_SAVE_INITBUSEOLISTRecord)buseolist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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

	public String rmsgexttcd_listRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rmsgexttcd_list.size();
		for(int i=0; i<size; i++){
			SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord rec = (SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord)rmsgexttcd_list.get(i);
			
			
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

	public String buseolistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_INFOEXG_SAVE_INITBUSEOLISTRecord rec = (SS_L_INFOEXG_SAVE_INITBUSEOLISTRecord)buseolist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_INFOEXG_SAVE_INITDataSet ds = (SS_L_INFOEXG_SAVE_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rmsgexttcd_list.size(); i++){
		SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord rmsgexttcd_listRec = (SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord)ds.rmsgexttcd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.buseolist.size(); i++){
		SS_L_INFOEXG_SAVE_INITBUSEOLISTRecord buseolistRec = (SS_L_INFOEXG_SAVE_INITBUSEOLISTRecord)ds.buseolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRmsgexttcd_list()%>
<%= ds.getBuseolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rmsgexttcd_listRec.cicodeval%>
<%= rmsgexttcd_listRec.cicdnm%>
<%= buseolistRec.deptcd%>
<%= buseolistRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 21 16:34:33 KST 2004 */