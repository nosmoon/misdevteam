/***************************************************************************************************
* 파일명 : SS_S_MOVM_RDRCLOSDataSet.java
* 기능 : 이사독자-마감-상세를 위한 DataSet
* 작성일자 : 2004-01-07
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
 * 이사독자-마감-상세를 위한 DataSet
 */

public class SS_S_MOVM_RDRCLOSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmedicd = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String basidt;
	public String frdt;
	public String todt;
	public String closyn;
	public String closdt;
	public String costpaydt;
	public String remk;

	public SS_S_MOVM_RDRCLOSDataSet(){}
	public SS_S_MOVM_RDRCLOSDataSet(String errcode, String errmsg, String basidt, String frdt, String todt, String closyn, String closdt, String costpaydt, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.basidt = basidt;
		this.frdt = frdt;
		this.todt = todt;
		this.closyn = closyn;
		this.closdt = closdt;
		this.costpaydt = costpaydt;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setCostpaydt(String costpaydt){
		this.costpaydt = costpaydt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getCostpaydt(){
		return this.costpaydt;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.basidt = Util.checkString(cstmt.getString(4));
		this.frdt = Util.checkString(cstmt.getString(5));
		this.todt = Util.checkString(cstmt.getString(6));
		this.closyn = Util.checkString(cstmt.getString(7));
		this.closdt = Util.checkString(cstmt.getString(8));
		this.costpaydt = Util.checkString(cstmt.getString(9));
		this.remk = Util.checkString(cstmt.getString(10));
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_S_MOVM_RDRCLOSCURCOMMLISTRecord rec = new SS_S_MOVM_RDRCLOSCURCOMMLISTRecord();
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medicdnm = Util.checkString(rset0.getString("medicdnm"));
			rec.alonamt = rset0.getInt("alonamt");
			rec.qtyaplydt = Util.checkString(rset0.getString("qtyaplydt"));
			rec.basivalqty = rset0.getInt("basivalqty");
			this.curcommlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(12);
		while(rset1.next()){
			SS_S_MOVM_RDRCLOSCURMEDICDRecord rec = new SS_S_MOVM_RDRCLOSCURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_MOVM_RDRCLOSCURCOMMLISTRecord rec = (SS_S_MOVM_RDRCLOSCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.medicd;
			String name = rec.medicdnm;

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

	public String curmedicdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_S_MOVM_RDRCLOSCURMEDICDRecord rec = (SS_S_MOVM_RDRCLOSCURMEDICDRecord)curmedicd.get(i);


			String code = rec.cicodeval;
			String name = rec.cicdnm;

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
			SS_S_MOVM_RDRCLOSCURCOMMLISTRecord rec = (SS_S_MOVM_RDRCLOSCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.medicd;
			String name = rec.medicdnm;

			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String curmedicdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_S_MOVM_RDRCLOSCURMEDICDRecord rec = (SS_S_MOVM_RDRCLOSCURMEDICDRecord)curmedicd.get(i);


			String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<input name=\"");
			sb.append("cicodeval");
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
			SS_S_MOVM_RDRCLOSCURCOMMLISTRecord rec = (SS_S_MOVM_RDRCLOSCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.medicd;
			String name = rec.medicdnm;

			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String curmedicdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_S_MOVM_RDRCLOSCURMEDICDRecord rec = (SS_S_MOVM_RDRCLOSCURMEDICDRecord)curmedicd.get(i);


			String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<input name=\"");
			sb.append("cicodeval");
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
	SS_S_MOVM_RDRCLOSDataSet ds = (SS_S_MOVM_RDRCLOSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_S_MOVM_RDRCLOSCURCOMMLISTRecord curcommlistRec = (SS_S_MOVM_RDRCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_S_MOVM_RDRCLOSCURMEDICDRecord curmedicdRec = (SS_S_MOVM_RDRCLOSCURMEDICDRecord)ds.curmedicd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBasidt()%>
<%= ds.getFrdt()%>
<%= ds.getTodt()%>
<%= ds.getClosyn()%>
<%= ds.getClosdt()%>
<%= ds.getCostpaydt()%>
<%= ds.getRemk()%>
<%= ds.getCurcommlist()%>
<%= ds.getCurmedicd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.medicd%>
<%= curcommlistRec.medicdnm%>
<%= curcommlistRec.alonamt%>
<%= curcommlistRec.qtyaplydt%>
<%= curcommlistRec.basivalqty%>
<%= curmedicdRec.cicodeval%>
<%= curmedicdRec.cicdnm%>
<%= curmedicdRec.ciymgbcd%>
<%= curmedicdRec.cicdgb%>
<%= curmedicdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 08 20:25:03 KST 2004 */