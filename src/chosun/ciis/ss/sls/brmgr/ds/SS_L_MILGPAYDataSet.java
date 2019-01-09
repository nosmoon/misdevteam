/***************************************************************************************************
* 파일명 : SS_L_MILGPAYDataSet.java
* 기능 : 지국경영-마일리지현황 상세
* 작성일자 : 2004-03-16
* 작성자 : 고윤홍
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
 * 지국경영-마일리지현황 상세
 *
 */

public class SS_L_MILGPAYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_MILGPAYDataSet(){}
	public SS_L_MILGPAYDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(8);
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_MILGPAYCURCOMMLISTRecord rec = new SS_L_MILGPAYCURCOMMLISTRecord();
			rec.milgpaydt = Util.checkString(rset0.getString("milgpaydt"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medicdnm = Util.checkString(rset0.getString("medicdnm"));
			rec.pont = rset0.getInt("pont");
			rec.payclsfcd = Util.checkString(rset0.getString("payclsfcd"));
			rec.payclsfcdnm = Util.checkString(rset0.getString("payclsfcdnm"));
			rec.paybasicd = Util.checkString(rset0.getString("paybasicd"));
			rec.paybasinm = Util.checkString(rset0.getString("paybasinm"));
			rec.adjmexchrate = rset0.getInt("adjmexchrate");
			rec.adjmamt = rset0.getInt("adjmamt");
			rec.hdqtallmamt = rset0.getInt("hdqtallmamt");
			rec.boallmamt = rset0.getInt("boallmamt");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MILGPAYCURCOMMLISTRecord rec = (SS_L_MILGPAYCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.milgpaydt;
			String name = rec.rdr_no;
			
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
			SS_L_MILGPAYCURCOMMLISTRecord rec = (SS_L_MILGPAYCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.milgpaydt;
			String name = rec.rdr_no;
			
			sb.append("<input name=\"");
			sb.append("milgpaydt");
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
			SS_L_MILGPAYCURCOMMLISTRecord rec = (SS_L_MILGPAYCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.milgpaydt;
			String name = rec.rdr_no;
			
			sb.append("<input name=\"");
			sb.append("milgpaydt");
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
	SS_L_MILGPAYDataSet ds = (SS_L_MILGPAYDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MILGPAYCURCOMMLISTRecord curcommlistRec = (SS_L_MILGPAYCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.milgpaydt%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.medicdnm%>
<%= curcommlistRec.pont%>
<%= curcommlistRec.payclsfcd%>
<%= curcommlistRec.payclsfcdnm%>
<%= curcommlistRec.paybasicd%>
<%= curcommlistRec.paybasinm%>
<%= curcommlistRec.adjmexchrate%>
<%= curcommlistRec.adjmamt%>
<%= curcommlistRec.hdqtallmamt%>
<%= curcommlistRec.boallmamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 17 23:08:54 KST 2004 */