/***************************************************************************************************
* 파일명 : SS_L_MOVM_RDRCOSTDataSet.java
* 기능 : 이사독자-비용-목록을 위한 DataSet
* 작성일자 : 2004-01-09
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
 * 이사독자-비용-목록을 위한 DataSet
 */

public class SS_L_MOVM_RDRCOSTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalcostamt;

	public SS_L_MOVM_RDRCOSTDataSet(){}
	public SS_L_MOVM_RDRCOSTDataSet(String errcode, String errmsg, long totalcnt, long totalcostamt){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			SS_L_MOVM_RDRCOSTCURCOMMLISTRecord rec = new SS_L_MOVM_RDRCOSTCURCOMMLISTRecord();
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.deptcdnm = Util.checkString(rset1.getString("deptcdnm"));
			rec.areacd = Util.checkString(rset1.getString("areacd"));
			rec.areacdnm = Util.checkString(rset1.getString("areacdnm"));
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bocdnm = Util.checkString(rset1.getString("bocdnm"));
			rec.basidt = Util.checkString(rset1.getString("basidt"));
			rec.costamt = rset1.getInt("costamt");
			rec.busnchrgclamtyn = Util.checkString(rset1.getString("busnchrgclamtyn"));
			rec.busnchrgclamtdt = Util.checkString(rset1.getString("busnchrgclamtdt"));
			rec.splychrgclamtyn = Util.checkString(rset1.getString("splychrgclamtyn"));
			rec.splychrgclamtdt = Util.checkString(rset1.getString("splychrgclamtdt"));
			rec.costburdyn = Util.checkString(rset1.getString("costburdyn"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(11);
		this.totalcostamt = cstmt.getLong(12);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MOVM_RDRCOSTCURCOMMLISTRecord rec = (SS_L_MOVM_RDRCOSTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.deptcd;
			String name = rec.deptcdnm;

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
			SS_L_MOVM_RDRCOSTCURCOMMLISTRecord rec = (SS_L_MOVM_RDRCOSTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.deptcd;
			String name = rec.deptcdnm;

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
			SS_L_MOVM_RDRCOSTCURCOMMLISTRecord rec = (SS_L_MOVM_RDRCOSTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.deptcd;
			String name = rec.deptcdnm;

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
	SS_L_MOVM_RDRCOSTDataSet ds = (SS_L_MOVM_RDRCOSTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MOVM_RDRCOSTCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDRCOSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptcdnm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areacdnm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bocdnm%>
<%= curcommlistRec.basidt%>
<%= curcommlistRec.costamt%>
<%= curcommlistRec.busnchrgclamtyn%>
<%= curcommlistRec.busnchrgclamtdt%>
<%= curcommlistRec.splychrgclamtyn%>
<%= curcommlistRec.splychrgclamtdt%>
<%= curcommlistRec.costburdyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 09 21:23:42 KST 2004 */