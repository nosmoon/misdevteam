/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_SERVCOSTDataSet.java
* 기능 : 확장현황-조선IS확장-요원별
* 작성일자 : 2005-02-20
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
 * 확장현황-조선IS확장-요원별
 */


public class SS_L_RDR_EXTN_SERVCOSTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_RDR_EXTN_SERVCOSTDataSet(){}
	public SS_L_RDR_EXTN_SERVCOSTDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord();
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.stafnm = Util.checkString(rset0.getString("stafnm"));
			rec.ptph_no1 = Util.checkString(rset0.getString("ptph_no1"));
			rec.ptph_no2 = Util.checkString(rset0.getString("ptph_no2"));
			rec.ptph_no3 = Util.checkString(rset0.getString("ptph_no3"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.totqty = rset0.getInt("totqty");
			rec.servcost = rset0.getInt("servcost");
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(10);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.basidt;
			String name = rec.stafno;
			
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
			SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.basidt;
			String name = rec.stafno;
			
			sb.append("<input name=\"");
			sb.append("basidt");
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
			SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.basidt;
			String name = rec.stafno;
			
			sb.append("<input name=\"");
			sb.append("basidt");
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
	SS_L_RDR_EXTN_SERVCOSTDataSet ds = (SS_L_RDR_EXTN_SERVCOSTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.basidt%>
<%= curcommlistRec.stafno%>
<%= curcommlistRec.stafnm%>
<%= curcommlistRec.ptph_no1%>
<%= curcommlistRec.ptph_no2%>
<%= curcommlistRec.ptph_no3%>
<%= curcommlistRec.email%>
<%= curcommlistRec.totqty%>
<%= curcommlistRec.servcost%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Feb 20 00:49:04 KST 2005 */