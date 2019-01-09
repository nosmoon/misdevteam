/***************************************************************************************************
* 파일명 : PS_L_DAY_SCHEDataSet.java
* 기능 : 출판국 일정-달력
* 작성일자 : 2004-03-09
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * 출판국 일정-달력
 *
 */


public class PS_L_DAY_SCHEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dayschecur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_DAY_SCHEDataSet(){}
	public PS_L_DAY_SCHEDataSet(String errcode, String errmsg){
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
			PS_L_DAY_SCHEDAYSCHECURRecord rec = new PS_L_DAY_SCHEDAYSCHECURRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.endyn = Util.checkString(rset0.getString("endyn"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			this.dayschecur.add(rec);
		}
	}

	public String dayschecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dayschecur.size();
		for(int i=0; i<size; i++){
			PS_L_DAY_SCHEDAYSCHECURRecord rec = (PS_L_DAY_SCHEDAYSCHECURRecord)dayschecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
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

	public String dayschecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dayschecur.size();
		for(int i=0; i<size; i++){
			PS_L_DAY_SCHEDAYSCHECURRecord rec = (PS_L_DAY_SCHEDAYSCHECURRecord)dayschecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
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

	public String dayschecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dayschecur.size();
		for(int i=0; i<size; i++){
			PS_L_DAY_SCHEDAYSCHECURRecord rec = (PS_L_DAY_SCHEDAYSCHECURRecord)dayschecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
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
	PS_L_DAY_SCHEDataSet ds = (PS_L_DAY_SCHEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dayschecur.size(); i++){
		PS_L_DAY_SCHEDAYSCHECURRecord dayschecurRec = (PS_L_DAY_SCHEDAYSCHECURRecord)ds.dayschecur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDayschecur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dayschecurRec.seq%>
<%= dayschecurRec.frdt%>
<%= dayschecurRec.todt%>
<%= dayschecurRec.remk%>
<%= dayschecurRec.endyn%>
<%= dayschecurRec.deptcd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 21:43:44 KST 2004 */