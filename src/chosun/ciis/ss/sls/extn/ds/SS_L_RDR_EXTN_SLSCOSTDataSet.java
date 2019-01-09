/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_SLSCOSTDataSet.java
* 기능 : 확장지원비용 목록을 위한 DataSet
* 작성일자 : 2003-12-18
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


public class SS_L_RDR_EXTN_SLSCOSTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String basidt;
	public String boextn;
	public String movm;
	public String empextn;
	public String exgextn;
	public long totalcnt;
	public long totalsplyamt;

	public SS_L_RDR_EXTN_SLSCOSTDataSet(){}
	public SS_L_RDR_EXTN_SLSCOSTDataSet(String errcode, String errmsg, String basidt, String boextn, String movm, String empextn, String exgextn, long totalcnt, long totalsplyamt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.basidt = basidt;
		this.boextn = boextn;
		this.movm = movm;
		this.empextn = empextn;
		this.exgextn = exgextn;
		this.totalcnt = totalcnt;
		this.totalsplyamt = totalsplyamt;
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

	public void setBoextn(String boextn){
		this.boextn = boextn;
	}

	public void setMovm(String movm){
		this.movm = movm;
	}

	public void setEmpextn(String empextn){
		this.empextn = empextn;
	}

	public void setExgextn(String exgextn){
		this.exgextn = exgextn;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public void setTotalsplyamt(long totalsplyamt){
		this.totalsplyamt = totalsplyamt;
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

	public String getBoextn(){
		return this.boextn;
	}

	public String getMovm(){
		return this.movm;
	}

	public String getEmpextn(){
		return this.empextn;
	}

	public String getExgextn(){
		return this.exgextn;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public long getTotalsplyamt(){
		return this.totalsplyamt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.basidt = Util.checkString(cstmt.getString(11));
		this.boextn = Util.checkString(cstmt.getString(12));
		this.movm = Util.checkString(cstmt.getString(13));
		this.empextn = Util.checkString(cstmt.getString(14));
		this.exgextn = Util.checkString(cstmt.getString(15));
		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptcdnm = Util.checkString(rset0.getString("deptcdnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areacdnm = Util.checkString(rset0.getString("areacdnm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bocdnm = Util.checkString(rset0.getString("bocdnm"));
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.realrdrcnt = rset0.getInt("realrdrcnt");
			rec.boqty = rset0.getInt("boqty");
			rec.movmqty = rset0.getInt("movmqty");
			rec.empqty = rset0.getInt("empqty");
			rec.exgqty = rset0.getInt("exgqty");
			rec.sumqty = rset0.getInt("sumqty");
			rec.apt = rset0.getInt("apt");
			rec.villa = rset0.getInt("villa");
			rec.hous = rset0.getInt("hous");
			rec.offi_room = rset0.getInt("offi_room");
			rec.shop = rset0.getInt("shop");
			rec.etc = rset0.getInt("etc");
			rec.rsltqty = rset0.getInt("rsltqty");
			rec.payqty = rset0.getInt("payqty");
			rec.uprc = rset0.getInt("uprc");
			rec.splyamt = rset0.getInt("splyamt");
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(17);
		this.totalsplyamt = cstmt.getLong(18);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord)curcommlist.get(i);


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
			SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord)curcommlist.get(i);


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
			SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord)curcommlist.get(i);


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
	SS_L_RDR_EXTN_SLSCOSTDataSet ds = (SS_L_RDR_EXTN_SLSCOSTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBasidt()%>
<%= ds.getBoextn()%>
<%= ds.getMovm()%>
<%= ds.getEmpextn()%>
<%= ds.getExgextn()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalsplyamt()%>
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
<%= curcommlistRec.realrdrcnt%>
<%= curcommlistRec.boqty%>
<%= curcommlistRec.movmqty%>
<%= curcommlistRec.empqty%>
<%= curcommlistRec.exgqty%>
<%= curcommlistRec.sumqty%>
<%= curcommlistRec.apt%>
<%= curcommlistRec.villa%>
<%= curcommlistRec.hous%>
<%= curcommlistRec.offi_room%>
<%= curcommlistRec.shop%>
<%= curcommlistRec.etc%>
<%= curcommlistRec.rsltqty%>
<%= curcommlistRec.payqty%>
<%= curcommlistRec.uprc%>
<%= curcommlistRec.splyamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 19 16:51:31 KST 2003 */