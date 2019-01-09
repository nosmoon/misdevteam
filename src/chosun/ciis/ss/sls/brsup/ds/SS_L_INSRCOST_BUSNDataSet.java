/***************************************************************************************************
* 파일명 : SS_L_INSRCOST_BUSNDataSet.java
* 기능 : 지국지원-상해보험-비용(영업담당)-목록을 위한 DataSet
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
 * 지국지원-상해보험-비용(영업담당)-목록을 위한 DataSet
 */

public class SS_L_INSRCOST_BUSNDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long insruprc;
	public long hdqtsplyuprc;
	public long totalcnt;

	public SS_L_INSRCOST_BUSNDataSet(){}
	public SS_L_INSRCOST_BUSNDataSet(String errcode, String errmsg, long insruprc, long hdqtsplyuprc, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.insruprc = insruprc;
		this.hdqtsplyuprc = hdqtsplyuprc;
		this.totalcnt = totalcnt;
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.insruprc = cstmt.getLong(8);
		this.hdqtsplyuprc = cstmt.getLong(9);
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			SS_L_INSRCOST_BUSNCURCOMMLISTRecord rec = new SS_L_INSRCOST_BUSNCURCOMMLISTRecord();
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.deptnm = Util.checkString(rset1.getString("deptnm"));
			rec.areacd = Util.checkString(rset1.getString("areacd"));
			rec.areanm = Util.checkString(rset1.getString("areanm"));
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.basidt = Util.checkString(rset1.getString("basidt"));
			rec.aplcqunt = rset1.getInt("aplcqunt");
			rec.totamt = rset1.getInt("totamt");
			rec.hdqtsplyqunt = rset1.getInt("hdqtsplyqunt");
			rec.hdqtsplyamt = rset1.getInt("hdqtsplyamt");
			rec.clamamt = rset1.getInt("clamamt");
			rec.clamtbal = rset1.getInt("clamtbal");
			rec.busnchrgclamtend = Util.checkString(rset1.getString("busnchrgclamtend"));
			rec.busnchrgclamtdt = Util.checkString(rset1.getString("busnchrgclamtdt"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(11);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_INSRCOST_BUSNCURCOMMLISTRecord rec = (SS_L_INSRCOST_BUSNCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SS_L_INSRCOST_BUSNCURCOMMLISTRecord rec = (SS_L_INSRCOST_BUSNCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SS_L_INSRCOST_BUSNCURCOMMLISTRecord rec = (SS_L_INSRCOST_BUSNCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
	SS_L_INSRCOST_BUSNDataSet ds = (SS_L_INSRCOST_BUSNDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_INSRCOST_BUSNCURCOMMLISTRecord curcommlistRec = (SS_L_INSRCOST_BUSNCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
<%= curcommlistRec.clamtbal%>
<%= curcommlistRec.busnchrgclamtend%>
<%= curcommlistRec.busnchrgclamtdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Feb 22 14:02:12 KST 2004 */