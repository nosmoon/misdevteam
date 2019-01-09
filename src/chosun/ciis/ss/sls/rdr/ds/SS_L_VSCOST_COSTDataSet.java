/***************************************************************************************************
* 파일명 : SS_L_VSCOST_COSTDataSet.java
* 기능 : 독자현황-VacationStop-비용-목록을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-VacationStop-비용-목록을 위한 DataSet
 */

public class SS_L_VSCOST_COSTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalcostamt;

	public SS_L_VSCOST_COSTDataSet(){}
	public SS_L_VSCOST_COSTDataSet(String errcode, String errmsg, long totalcnt, long totalcostamt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalcostamt = totalcostamt;
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

	public void setTotalcostamt(long totalcostamt){
		this.totalcostamt = totalcostamt;
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

	public long getTotalcostamt(){
		return this.totalcostamt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_L_VSCOST_COSTCURCOMMLISTRecord rec = new SS_L_VSCOST_COSTCURCOMMLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.dlvqty = rset0.getInt("dlvqty");
			rec.amt = rset0.getInt("amt");
			rec.costprocdt = Util.checkString(rset0.getString("costprocdt"));
			rec.vaca_arearegncd = Util.checkString(rset0.getString("vaca_arearegncd"));
			rec.vaca_arearegnnm = Util.checkString(rset0.getString("vaca_arearegnnm"));
			rec.vaca_areacd = Util.checkString(rset0.getString("vaca_areacd"));
			rec.vaca_areanm = Util.checkString(rset0.getString("vaca_areanm"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.costbasiamt = rset0.getInt("costbasiamt");
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(11);
		this.totalcostamt = cstmt.getLong(12);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_VSCOST_COSTCURCOMMLISTRecord rec = (SS_L_VSCOST_COSTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.bocd;
			String name = rec.basidt;

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
			SS_L_VSCOST_COSTCURCOMMLISTRecord rec = (SS_L_VSCOST_COSTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.bocd;
			String name = rec.basidt;

			sb.append("<input name=\"");
			sb.append("bocd");
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
			SS_L_VSCOST_COSTCURCOMMLISTRecord rec = (SS_L_VSCOST_COSTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.bocd;
			String name = rec.basidt;

			sb.append("<input name=\"");
			sb.append("bocd");
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
	SS_L_VSCOST_COSTDataSet ds = (SS_L_VSCOST_COSTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_VSCOST_COSTCURCOMMLISTRecord curcommlistRec = (SS_L_VSCOST_COSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalcostamt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bocd%>
<%= curcommlistRec.basidt%>
<%= curcommlistRec.dlvqty%>
<%= curcommlistRec.amt%>
<%= curcommlistRec.costprocdt%>
<%= curcommlistRec.vaca_arearegncd%>
<%= curcommlistRec.vaca_arearegnnm%>
<%= curcommlistRec.vaca_areacd%>
<%= curcommlistRec.vaca_areanm%>
<%= curcommlistRec.frdt%>
<%= curcommlistRec.todt%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.costbasiamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 26 19:34:12 KST 2004 */