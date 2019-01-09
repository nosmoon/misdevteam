/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_EMPCOSTDataSet.java
* 기능 : 사원확장비용 목록을 위한 DataSet
* 작성일자 : 2003-12-13
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


public class SS_L_RDR_EXTN_EMPCOSTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalcostamt;

	public SS_L_RDR_EXTN_EMPCOSTDataSet(){}
	public SS_L_RDR_EXTN_EMPCOSTDataSet(String errcode, String errmsg, long totalcnt, long totalcostamt){
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
			SS_L_RDR_EXTN_EMPCOSTCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_EMPCOSTCURCOMMLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptcdnm = Util.checkString(rset0.getString("deptcdnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areacdnm = Util.checkString(rset0.getString("areacdnm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bocdnm = Util.checkString(rset0.getString("bocdnm"));
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.costamt = rset0.getInt("costamt");
			rec.busnchrgclamtyn = Util.checkString(rset0.getString("busnchrgclamtyn"));
			rec.busnchrgclamtdt = Util.checkString(rset0.getString("busnchrgclamtdt"));
			rec.splychrgclamtyn = Util.checkString(rset0.getString("splychrgclamtyn"));
			rec.splychrgclamtdt = Util.checkString(rset0.getString("splychrgclamtdt"));
			rec.costburdyn = Util.checkString(rset0.getString("costburdyn"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(11);
		this.totalcostamt = cstmt.getLong(12);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_EMPCOSTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_EMPCOSTCURCOMMLISTRecord)curcommlist.get(i);


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
			SS_L_RDR_EXTN_EMPCOSTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_EMPCOSTCURCOMMLISTRecord)curcommlist.get(i);


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
			SS_L_RDR_EXTN_EMPCOSTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_EMPCOSTCURCOMMLISTRecord)curcommlist.get(i);


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
	SS_L_RDR_EXTN_EMPCOSTDataSet ds = (SS_L_RDR_EXTN_EMPCOSTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_EMPCOSTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EMPCOSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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


/* 작성시간 : Mon Dec 15 14:11:47 KST 2003 */