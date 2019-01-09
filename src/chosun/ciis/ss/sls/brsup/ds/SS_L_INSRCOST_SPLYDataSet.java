/***************************************************************************************************
* 파일명 : SS_L_INSRCOST_SPLYDataSet.java
* 기능 : 지국지원-상해보험-비용(지원담당)-목록을 위한 DataSet
* 작성일자 : 2004-02-20
* 작성자 : 김대섭
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
 * 지국지원-상해보험-비용(지원담당)-목록을 위한 DataSet
 */

public class SS_L_INSRCOST_SPLYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long insruprc;
	public long hdqtsplyuprc;
	public long totalcnt;
	public long totalsplychrgamt;

	public SS_L_INSRCOST_SPLYDataSet(){}
	public SS_L_INSRCOST_SPLYDataSet(String errcode, String errmsg, long insruprc, long hdqtsplyuprc, long totalcnt, long totalsplychrgamt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.insruprc = insruprc;
		this.hdqtsplyuprc = hdqtsplyuprc;
		this.totalcnt = totalcnt;
		this.totalsplychrgamt = totalsplychrgamt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setInsruprc(long insruprc){
		this.insruprc = insruprc;
	}

	public void setHdqtsplyuprc(long hdqtsplyuprc){
		this.hdqtsplyuprc = hdqtsplyuprc;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public void setTotalsplychrgamt(long totalsplychrgamt){
		this.totalsplychrgamt = totalsplychrgamt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getInsruprc(){
		return this.insruprc;
	}

	public long getHdqtsplyuprc(){
		return this.hdqtsplyuprc;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public long getTotalsplychrgamt(){
		return this.totalsplychrgamt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.insruprc = cstmt.getLong(8);
		this.hdqtsplyuprc = cstmt.getLong(9);
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_L_INSRCOST_SPLYCURCOMMLISTRecord rec = new SS_L_INSRCOST_SPLYCURCOMMLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.aplcqunt = rset0.getInt("aplcqunt");
			rec.totamt = rset0.getInt("totamt");
			rec.hdqtsplyqunt = rset0.getInt("hdqtsplyqunt");
			rec.hdqtsplyamt = rset0.getInt("hdqtsplyamt");
			rec.clamamt = rset0.getInt("clamamt");
			rec.busnchrgclamtend = Util.checkString(rset0.getString("busnchrgclamtend"));
			rec.splychrgclamtyn = Util.checkString(rset0.getString("splychrgclamtyn"));
			rec.splychrgclamtdt = Util.checkString(rset0.getString("splychrgclamtdt"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(11);
		this.totalsplychrgamt = cstmt.getLong(12);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_INSRCOST_SPLYCURCOMMLISTRecord rec = (SS_L_INSRCOST_SPLYCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
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
			SS_L_INSRCOST_SPLYCURCOMMLISTRecord rec = (SS_L_INSRCOST_SPLYCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_INSRCOST_SPLYCURCOMMLISTRecord rec = (SS_L_INSRCOST_SPLYCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
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
	SS_L_INSRCOST_SPLYDataSet ds = (SS_L_INSRCOST_SPLYDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_INSRCOST_SPLYCURCOMMLISTRecord curcommlistRec = (SS_L_INSRCOST_SPLYCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getInsruprc()%>
<%= ds.getHdqtsplyuprc()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalsplychrgamt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.basidt%>
<%= curcommlistRec.aplcqunt%>
<%= curcommlistRec.totamt%>
<%= curcommlistRec.hdqtsplyqunt%>
<%= curcommlistRec.hdqtsplyamt%>
<%= curcommlistRec.clamamt%>
<%= curcommlistRec.busnchrgclamtend%>
<%= curcommlistRec.splychrgclamtyn%>
<%= curcommlistRec.splychrgclamtdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Feb 22 14:02:12 KST 2004 */