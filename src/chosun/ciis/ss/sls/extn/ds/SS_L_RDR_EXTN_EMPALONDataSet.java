/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_EMPALONDataSet.java
* 기능 : 사원확장 수당 목록을 위한 DataSet
* 작성일자 : 2003-12-15
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * class definition
 *
 */


public class SS_L_RDR_EXTN_EMPALONDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalalonamt;

	public SS_L_RDR_EXTN_EMPALONDataSet(){}
	public SS_L_RDR_EXTN_EMPALONDataSet(String errcode, String errmsg, long totalcnt, long totalalonamt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalalonamt = totalalonamt;
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

	public void setTotalalonamt(long totalalonamt){
		this.totalalonamt = totalalonamt;
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

	public long getTotalalonamt(){
		return this.totalalonamt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord();
			rec.campnm = Util.checkString(rset0.getString("campnm"));
			rec.rdr_extncampno = Util.checkString(rset0.getString("rdr_extncampno"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.empseq = Util.checkString(rset0.getString("empseq"));
			rec.empnm = Util.checkString(rset0.getString("empnm"));
			rec.empcmpynm = Util.checkString(rset0.getString("empcmpynm"));
			rec.empdeptnm = Util.checkString(rset0.getString("empdeptnm"));
			rec.alonamt = rset0.getInt("alonamt");
			rec.payyn = Util.checkString(rset0.getString("payyn"));
			rec.paydt = Util.checkString(rset0.getString("paydt"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(9);
		this.totalalonamt = cstmt.getLong(10);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.campnm;
			String name = rec.rdr_extncampno;
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.campnm;
			String name = rec.rdr_extncampno;
			
			sb.append("<input name=\"");
			sb.append("campnm");
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.campnm;
			String name = rec.rdr_extncampno;
			
			sb.append("<input name=\"");
			sb.append("campnm");
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
	SS_L_RDR_EXTN_EMPALONDataSet ds = (SS_L_RDR_EXTN_EMPALONDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalalonamt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.campnm%>
<%= curcommlistRec.rdr_extncampno%>
<%= curcommlistRec.frdt%>
<%= curcommlistRec.todt%>
<%= curcommlistRec.empseq%>
<%= curcommlistRec.empnm%>
<%= curcommlistRec.empcmpynm%>
<%= curcommlistRec.empdeptnm%>
<%= curcommlistRec.alonamt%>
<%= curcommlistRec.payyn%>
<%= curcommlistRec.paydt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 16 11:53:45 KST 2003 */