/***************************************************************************************************
* 파일명 : .java
* 기능 : 에듀/제휴 확장 목록 조회  
* 작성일자 : 2009-05-28
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 에듀/제휴 확장 목록 조회  
 */

public class SS_L_EXTN_EDUINSTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList instlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_EDUINSTDataSet(){}
	public SS_L_EXTN_EDUINSTDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			SS_L_EXTN_EDUINSTINSTLISTRecord rec = new SS_L_EXTN_EDUINSTINSTLISTRecord();
			rec.type1 = Util.checkString(rset0.getString("type1"));
			rec.type2 = Util.checkString(rset0.getString("type2"));
			rec.insttnm = Util.checkString(rset0.getString("insttnm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.cntrbgndd = Util.checkString(rset0.getString("cntrbgndd"));
			rec.cntrto_dd = Util.checkString(rset0.getString("cntrto_dd"));
			rec.subsqty = rset0.getInt("subsqty");
			rec.ldgrnm = Util.checkString(rset0.getString("ldgrnm"));
			rec.rdr_extndd = Util.checkString(rset0.getString("rdr_extndd"));
			rec.subsuprc = rset0.getInt("subsuprc");
			rec.bns_itemuprc = rset0.getInt("bns_itemuprc");
			rec.comsuprc = rset0.getInt("comsuprc");
			rec.totsubsamt = rset0.getInt("totsubsamt");
			rec.tot_bnsitem_amt = rset0.getInt("tot_bnsitem_amt");
			rec.totcomsamt = rset0.getInt("totcomsamt");
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.insttcd = Util.checkString(rset0.getString("insttcd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			this.instlist.add(rec);
		}
	}

	public String instlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = instlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_EDUINSTINSTLISTRecord rec = (SS_L_EXTN_EDUINSTINSTLISTRecord)instlist.get(i);
			
			
			String code = rec.type1;
			String name = rec.type2;
			
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

	public String instlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = instlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_EDUINSTINSTLISTRecord rec = (SS_L_EXTN_EDUINSTINSTLISTRecord)instlist.get(i);
			
			
			String code = rec.type1;
			String name = rec.type2;
			
			sb.append("<input name=\"");
			sb.append("type1");
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

	public String instlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = instlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_EDUINSTINSTLISTRecord rec = (SS_L_EXTN_EDUINSTINSTLISTRecord)instlist.get(i);
			
			
			String code = rec.type1;
			String name = rec.type2;
			
			sb.append("<input name=\"");
			sb.append("type1");
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
	SS_L_EXTN_EDUINSTDataSet ds = (SS_L_EXTN_EDUINSTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.instlist.size(); i++){
		SS_L_EXTN_EDUINSTINSTLISTRecord instlistRec = (SS_L_EXTN_EDUINSTINSTLISTRecord)ds.instlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getInstlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= instlistRec.type1%>
<%= instlistRec.type2%>
<%= instlistRec.insttnm%>
<%= instlistRec.deptnm%>
<%= instlistRec.partnm%>
<%= instlistRec.areanm%>
<%= instlistRec.bonm%>
<%= instlistRec.cntrbgndd%>
<%= instlistRec.cntrto_dd%>
<%= instlistRec.subsqty%>
<%= instlistRec.ldgrnm%>
<%= instlistRec.rdr_extndd%>
<%= instlistRec.subsuprc%>
<%= instlistRec.bns_itemuprc%>
<%= instlistRec.comsuprc%>
<%= instlistRec.totsubsamt%>
<%= instlistRec.tot_bnsitem_amt%>
<%= instlistRec.totcomsamt%>
<%= instlistRec.remk%>
<%= instlistRec.insttcd%>
<%= instlistRec.dept_cd%>
<%= instlistRec.part_cd%>
<%= instlistRec.area_cd%>
<%= instlistRec.bocd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 16:26:56 KST 2009 */