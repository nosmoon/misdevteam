/***************************************************************************************************
* 파일명 : SS_L_LEASAMT_LISTDataSet.java
* 기능 : 지국Info-전세지원금-목록을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국Info-전세지원금-목록을 위한 DataSet
 */

public class SS_L_LEASAMT_LISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalamt;

	public SS_L_LEASAMT_LISTDataSet(){}
	public SS_L_LEASAMT_LISTDataSet(String errcode, String errmsg, long totalcnt, long totalamt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalamt = totalamt;
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

	public void setTotalamt(long totalamt){
		this.totalamt = totalamt;
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

	public long getTotalamt(){
		return this.totalamt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_L_LEASAMT_LISTCURCOMMLISTRecord rec = new SS_L_LEASAMT_LISTCURCOMMLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bo_presinm = Util.checkString(rset0.getString("bo_presinm"));
			rec.hdqtsplyamt = rset0.getInt("hdqtsplyamt");
			rec.wholgurtamt = rset0.getInt("wholgurtamt");
			rec.bondprsvamt = rset0.getInt("bondprsvamt");
			rec.bondprsvkind = Util.checkString(rset0.getString("bondprsvkind"));
			rec.nowchrg = Util.checkString(rset0.getString("nowchrg"));
			rec.booffi_roomownr = Util.checkString(rset0.getString("booffi_roomownr"));
			rec.bondprsvobjvolownr = Util.checkString(rset0.getString("bondprsvobjvolownr"));
			rec.leascntrdt = Util.checkString(rset0.getString("leascntrdt"));
			rec.leasexprdt = Util.checkString(rset0.getString("leasexprdt"));
			rec.deciddocuno = Util.checkString(rset0.getString("deciddocuno"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(12);
		this.totalamt = cstmt.getLong(13);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_LEASAMT_LISTCURCOMMLISTRecord rec = (SS_L_LEASAMT_LISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.areacd;
			
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
			SS_L_LEASAMT_LISTCURCOMMLISTRecord rec = (SS_L_LEASAMT_LISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.areacd;
			
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
			SS_L_LEASAMT_LISTCURCOMMLISTRecord rec = (SS_L_LEASAMT_LISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.areacd;
			
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
	SS_L_LEASAMT_LISTDataSet ds = (SS_L_LEASAMT_LISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_LEASAMT_LISTCURCOMMLISTRecord curcommlistRec = (SS_L_LEASAMT_LISTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalamt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptcd%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.seq%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.bo_presinm%>
<%= curcommlistRec.hdqtsplyamt%>
<%= curcommlistRec.wholgurtamt%>
<%= curcommlistRec.bondprsvamt%>
<%= curcommlistRec.bondprsvkind%>
<%= curcommlistRec.nowchrg%>
<%= curcommlistRec.booffi_roomownr%>
<%= curcommlistRec.bondprsvobjvolownr%>
<%= curcommlistRec.leascntrdt%>
<%= curcommlistRec.leasexprdt%>
<%= curcommlistRec.deciddocuno%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 21 17:39:46 KST 2004 */