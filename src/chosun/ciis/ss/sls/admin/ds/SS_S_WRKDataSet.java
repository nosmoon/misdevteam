/***************************************************************************************************
* 파일명 : SS_S_WRKDataSet.java
* 기능 : 관리자-작업-등록-상세를 위한 DataSet
* 작성일자 : 2004-04-08
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-작업-등록-상세를 위한 DataSet
 */

public class SS_S_WRKDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcycllist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String id;
	public String descri;
	public String cycl;
	public String basidt;
	public String endddyn;
	public String basitm;
	public String pgmnm;
	public String remk;

	public SS_S_WRKDataSet(){}
	public SS_S_WRKDataSet(String errcode, String errmsg, String id, String descri, String cycl, String basidt, String endddyn, String basitm, String pgmnm, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.id = id;
		this.descri = descri;
		this.cycl = cycl;
		this.basidt = basidt;
		this.endddyn = endddyn;
		this.basitm = basitm;
		this.pgmnm = pgmnm;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setId(String id){
		this.id = id;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public void setCycl(String cycl){
		this.cycl = cycl;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setEndddyn(String endddyn){
		this.endddyn = endddyn;
	}

	public void setBasitm(String basitm){
		this.basitm = basitm;
	}

	public void setPgmnm(String pgmnm){
		this.pgmnm = pgmnm;
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

	public String getId(){
		return this.id;
	}

	public String getDescri(){
		return this.descri;
	}

	public String getCycl(){
		return this.cycl;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getEndddyn(){
		return this.endddyn;
	}

	public String getBasitm(){
		return this.basitm;
	}

	public String getPgmnm(){
		return this.pgmnm;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.id = Util.checkString(cstmt.getString(4));
		this.descri = Util.checkString(cstmt.getString(5));
		this.cycl = Util.checkString(cstmt.getString(6));
		this.basidt = Util.checkString(cstmt.getString(7));
		this.endddyn = Util.checkString(cstmt.getString(8));
		this.basitm = Util.checkString(cstmt.getString(9));
		this.pgmnm = Util.checkString(cstmt.getString(10));
		this.remk = Util.checkString(cstmt.getString(11));
		ResultSet rset2 = (ResultSet) cstmt.getObject(12);
		while(rset2.next()){
			SS_S_WRKCURCYCLLISTRecord rec = new SS_S_WRKCURCYCLLISTRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.curcycllist.add(rec);
		}
	}

	public String curcycllistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcycllist.size();
		for(int i=0; i<size; i++){
			SS_S_WRKCURCYCLLISTRecord rec = (SS_S_WRKCURCYCLLISTRecord)curcycllist.get(i);


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

	public String curcycllistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcycllist.size();
		for(int i=0; i<size; i++){
			SS_S_WRKCURCYCLLISTRecord rec = (SS_S_WRKCURCYCLLISTRecord)curcycllist.get(i);


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

	public String curcycllistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcycllist.size();
		for(int i=0; i<size; i++){
			SS_S_WRKCURCYCLLISTRecord rec = (SS_S_WRKCURCYCLLISTRecord)curcycllist.get(i);


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
	SS_S_WRKDataSet ds = (SS_S_WRKDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcycllist.size(); i++){
		SS_S_WRKCURCYCLLISTRecord curcycllistRec = (SS_S_WRKCURCYCLLISTRecord)ds.curcycllist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getId()%>
<%= ds.getDescri()%>
<%= ds.getCycl()%>
<%= ds.getBasidt()%>
<%= ds.getEndddyn()%>
<%= ds.getBasitm()%>
<%= ds.getPgmnm()%>
<%= ds.getRemk()%>
<%= ds.getCurcycllist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcycllistRec.cicodeval%>
<%= curcycllistRec.cicdnm%>
<%= curcycllistRec.ciymgbcd%>
<%= curcycllistRec.cicdgb%>
<%= curcycllistRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 08 21:03:58 KST 2004 */