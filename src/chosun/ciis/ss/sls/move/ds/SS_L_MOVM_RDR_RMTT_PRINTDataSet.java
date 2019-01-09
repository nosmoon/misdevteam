/***************************************************************************************************
* 파일명 : SS_L_MOVM_RDR_RMTT_PRINTDataSet.java
* 기능 : 이사독자-송금-인쇄를 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.move.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 이사독자-송금-인쇄를 위한 DataSet
 */

public class SS_L_MOVM_RDR_RMTT_PRINTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalcostamt;

	public SS_L_MOVM_RDR_RMTT_PRINTDataSet(){}
	public SS_L_MOVM_RDR_RMTT_PRINTDataSet(String errcode, String errmsg, long totalcnt, long totalcostamt){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord rec = new SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset1.getString("deptnm"));
			rec.areanm = Util.checkString(rset1.getString("areanm"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.deps_persnm = Util.checkString(rset1.getString("deps_persnm"));
			rec.banknm = Util.checkString(rset1.getString("banknm"));
			rec.acctno = Util.checkString(rset1.getString("acctno"));
			rec.costamt = rset1.getInt("costamt");
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(9);
		this.totalcostamt = cstmt.getLong(10);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord rec = (SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.areanm;
			
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
			SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord rec = (SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("deptnm");
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
			SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord rec = (SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("deptnm");
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
	SS_L_MOVM_RDR_RMTT_PRINTDataSet ds = (SS_L_MOVM_RDR_RMTT_PRINTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.deps_persnm%>
<%= curcommlistRec.banknm%>
<%= curcommlistRec.acctno%>
<%= curcommlistRec.costamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 08 14:07:59 KST 2004 */