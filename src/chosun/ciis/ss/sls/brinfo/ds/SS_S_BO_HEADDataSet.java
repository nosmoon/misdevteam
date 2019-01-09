/***************************************************************************************************
 * 파일명   : SS_S_BO_HEADDataSet.java
 * 기능     : 지국info-지국장정보-상세조회
 * 작성일자 : 2007/01/11
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
**  SP_SS_S_BO_HEAD
**/

public class SS_S_BO_HEADDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList jgjangir_list = new ArrayList();
	public ArrayList bohead_dtl = new ArrayList();
	public ArrayList bjinfo_dtl = new ArrayList();
	public ArrayList nativ_list = new ArrayList();
	public ArrayList lastschir_list = new ArrayList();
	public ArrayList headfaml_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_BO_HEADDataSet(){}
	public SS_S_BO_HEADDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_S_BO_HEADBOHEAD_DTLRecord rec = new SS_S_BO_HEADBOHEAD_DTLRecord();
			rec.jmjgbbcd = Util.checkString(rset0.getString("jmjgbbcd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bo_headnm = Util.checkString(rset0.getString("bo_headnm"));
			rec.jmgycymd = Util.checkString(rset0.getString("jmgycymd"));
			rec.jmhycymd = Util.checkString(rset0.getString("jmhycymd"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.lastschir = Util.checkString(rset0.getString("lastschir"));
			rec.lastschirnm = Util.checkString(rset0.getString("lastschirnm"));
			rec.nativ = Util.checkString(rset0.getString("nativ"));
			rec.nativnm = Util.checkString(rset0.getString("nativnm"));
			rec.hby = Util.checkString(rset0.getString("hby"));
			rec.spc = Util.checkString(rset0.getString("spc"));
			rec.relg = Util.checkString(rset0.getString("relg"));
			rec.drink = Util.checkString(rset0.getString("drink"));
			rec.smok = Util.checkString(rset0.getString("smok"));
			rec.jmgystgb = Util.checkString(rset0.getString("jmgystgb"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.tel_no1 = Util.checkString(rset0.getString("tel_no1"));
			rec.tel_no2 = Util.checkString(rset0.getString("tel_no2"));
			rec.tel_no3 = Util.checkString(rset0.getString("tel_no3"));
			rec.ptph_no1 = Util.checkString(rset0.getString("ptph_no1"));
			rec.ptph_no2 = Util.checkString(rset0.getString("ptph_no2"));
			rec.ptph_no3 = Util.checkString(rset0.getString("ptph_no3"));
			this.bohead_dtl.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SS_S_BO_HEADBJINFO_DTLRecord rec = new SS_S_BO_HEADBJINFO_DTLRecord();
			rec.bjnm = Util.checkString(rset1.getString("bjnm"));
			rec.bjjuminno = Util.checkString(rset1.getString("bjjuminno"));
			rec.bjtelno = Util.checkString(rset1.getString("bjtelno"));
			rec.bjzipcd1 = Util.checkString(rset1.getString("bjzipcd1"));
			rec.bjzipcd2 = Util.checkString(rset1.getString("bjzipcd2"));
			rec.bjjuso4 = Util.checkString(rset1.getString("bjjuso4"));
			this.bjinfo_dtl.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SS_S_BO_HEADLASTSCHIR_LISTRecord rec = new SS_S_BO_HEADLASTSCHIR_LISTRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.lastschir_list.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SS_S_BO_HEADNATIV_LISTRecord rec = new SS_S_BO_HEADNATIV_LISTRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.nativ_list.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			SS_S_BO_HEADJGJANGIR_LISTRecord rec = new SS_S_BO_HEADJGJANGIR_LISTRecord();
			rec.ircy = Util.checkString(rset4.getString("ircy"));
			rec.irmm = Util.checkString(rset4.getString("irmm"));
			rec.irsh = Util.checkString(rset4.getString("irsh"));
			this.jgjangir_list.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			SS_S_BO_HEADHEADFAML_LISTRecord rec = new SS_S_BO_HEADHEADFAML_LISTRecord();
			rec.seq = Util.checkString(rset5.getString("seq"));
			rec.prn = Util.checkString(rset5.getString("prn"));
			rec.flnm = Util.checkString(rset5.getString("flnm"));
			rec.rshp = Util.checkString(rset5.getString("rshp"));
			rec.bidt = Util.checkString(rset5.getString("bidt"));
			this.headfaml_list.add(rec);
		}
	}

	public String bohead_dtlOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bohead_dtl.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADBOHEAD_DTLRecord rec = (SS_S_BO_HEADBOHEAD_DTLRecord)bohead_dtl.get(i);
			
			
			String code = rec.jmjgbbcd;
			String name = rec.bonm;
			
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

	public String bjinfo_dtlOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bjinfo_dtl.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADBJINFO_DTLRecord rec = (SS_S_BO_HEADBJINFO_DTLRecord)bjinfo_dtl.get(i);
			
			
			String code = rec.bjnm;
			String name = rec.bjjuminno;
			
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

	public String lastschir_listOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = lastschir_list.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADLASTSCHIR_LISTRecord rec = (SS_S_BO_HEADLASTSCHIR_LISTRecord)lastschir_list.get(i);
			
			
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

	public String nativ_listOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nativ_list.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADNATIV_LISTRecord rec = (SS_S_BO_HEADNATIV_LISTRecord)nativ_list.get(i);
			
			
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

	public String jgjangir_listOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = jgjangir_list.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADJGJANGIR_LISTRecord rec = (SS_S_BO_HEADJGJANGIR_LISTRecord)jgjangir_list.get(i);
			
			
			String code = rec.ircy;
			String name = rec.irmm;
			
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

	public String headfaml_listOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = headfaml_list.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADHEADFAML_LISTRecord rec = (SS_S_BO_HEADHEADFAML_LISTRecord)headfaml_list.get(i);
			
			
			String code = rec.seq;
			String name = rec.prn;
			
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

	public String bohead_dtlChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bohead_dtl.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADBOHEAD_DTLRecord rec = (SS_S_BO_HEADBOHEAD_DTLRecord)bohead_dtl.get(i);
			
			
			String code = rec.jmjgbbcd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("jmjgbbcd");
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

	public String bjinfo_dtlChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bjinfo_dtl.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADBJINFO_DTLRecord rec = (SS_S_BO_HEADBJINFO_DTLRecord)bjinfo_dtl.get(i);
			
			
			String code = rec.bjnm;
			String name = rec.bjjuminno;
			
			sb.append("<input name=\"");
			sb.append("bjnm");
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

	public String lastschir_listChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = lastschir_list.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADLASTSCHIR_LISTRecord rec = (SS_S_BO_HEADLASTSCHIR_LISTRecord)lastschir_list.get(i);
			
			
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

	public String nativ_listChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nativ_list.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADNATIV_LISTRecord rec = (SS_S_BO_HEADNATIV_LISTRecord)nativ_list.get(i);
			
			
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

	public String jgjangir_listChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = jgjangir_list.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADJGJANGIR_LISTRecord rec = (SS_S_BO_HEADJGJANGIR_LISTRecord)jgjangir_list.get(i);
			
			
			String code = rec.ircy;
			String name = rec.irmm;
			
			sb.append("<input name=\"");
			sb.append("ircy");
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

	public String headfaml_listChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = headfaml_list.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADHEADFAML_LISTRecord rec = (SS_S_BO_HEADHEADFAML_LISTRecord)headfaml_list.get(i);
			
			
			String code = rec.seq;
			String name = rec.prn;
			
			sb.append("<input name=\"");
			sb.append("seq");
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

	public String bohead_dtlRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bohead_dtl.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADBOHEAD_DTLRecord rec = (SS_S_BO_HEADBOHEAD_DTLRecord)bohead_dtl.get(i);
			
			
			String code = rec.jmjgbbcd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("jmjgbbcd");
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

	public String bjinfo_dtlRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bjinfo_dtl.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADBJINFO_DTLRecord rec = (SS_S_BO_HEADBJINFO_DTLRecord)bjinfo_dtl.get(i);
			
			
			String code = rec.bjnm;
			String name = rec.bjjuminno;
			
			sb.append("<input name=\"");
			sb.append("bjnm");
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

	public String lastschir_listRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = lastschir_list.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADLASTSCHIR_LISTRecord rec = (SS_S_BO_HEADLASTSCHIR_LISTRecord)lastschir_list.get(i);
			
			
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

	public String nativ_listRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nativ_list.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADNATIV_LISTRecord rec = (SS_S_BO_HEADNATIV_LISTRecord)nativ_list.get(i);
			
			
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

	public String jgjangir_listRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = jgjangir_list.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADJGJANGIR_LISTRecord rec = (SS_S_BO_HEADJGJANGIR_LISTRecord)jgjangir_list.get(i);
			
			
			String code = rec.ircy;
			String name = rec.irmm;
			
			sb.append("<input name=\"");
			sb.append("ircy");
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

	public String headfaml_listRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = headfaml_list.size();
		for(int i=0; i<size; i++){
			SS_S_BO_HEADHEADFAML_LISTRecord rec = (SS_S_BO_HEADHEADFAML_LISTRecord)headfaml_list.get(i);
			
			
			String code = rec.seq;
			String name = rec.prn;
			
			sb.append("<input name=\"");
			sb.append("seq");
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
	SS_S_BO_HEADDataSet ds = (SS_S_BO_HEADDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bohead_dtl.size(); i++){
		SS_S_BO_HEADBOHEAD_DTLRecord bohead_dtlRec = (SS_S_BO_HEADBOHEAD_DTLRecord)ds.bohead_dtl.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bjinfo_dtl.size(); i++){
		SS_S_BO_HEADBJINFO_DTLRecord bjinfo_dtlRec = (SS_S_BO_HEADBJINFO_DTLRecord)ds.bjinfo_dtl.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.lastschir_list.size(); i++){
		SS_S_BO_HEADLASTSCHIR_LISTRecord lastschir_listRec = (SS_S_BO_HEADLASTSCHIR_LISTRecord)ds.lastschir_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.nativ_list.size(); i++){
		SS_S_BO_HEADNATIV_LISTRecord nativ_listRec = (SS_S_BO_HEADNATIV_LISTRecord)ds.nativ_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.jgjangir_list.size(); i++){
		SS_S_BO_HEADJGJANGIR_LISTRecord jgjangir_listRec = (SS_S_BO_HEADJGJANGIR_LISTRecord)ds.jgjangir_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.headfaml_list.size(); i++){
		SS_S_BO_HEADHEADFAML_LISTRecord headfaml_listRec = (SS_S_BO_HEADHEADFAML_LISTRecord)ds.headfaml_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBohead_dtl()%>
<%= ds.getBjinfo_dtl()%>
<%= ds.getLastschir_list()%>
<%= ds.getNativ_list()%>
<%= ds.getJgjangir_list()%>
<%= ds.getHeadfaml_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bohead_dtlRec.jmjgbbcd%>
<%= bohead_dtlRec.bonm%>
<%= bohead_dtlRec.bo_headnm%>
<%= bohead_dtlRec.jmgycymd%>
<%= bohead_dtlRec.jmhycymd%>
<%= bohead_dtlRec.prn%>
<%= bohead_dtlRec.lastschir%>
<%= bohead_dtlRec.lastschirnm%>
<%= bohead_dtlRec.nativ%>
<%= bohead_dtlRec.nativnm%>
<%= bohead_dtlRec.hby%>
<%= bohead_dtlRec.spc%>
<%= bohead_dtlRec.relg%>
<%= bohead_dtlRec.drink%>
<%= bohead_dtlRec.smok%>
<%= bohead_dtlRec.jmgystgb%>
<%= bohead_dtlRec.zip%>
<%= bohead_dtlRec.addr%>
<%= bohead_dtlRec.dtlsaddr%>
<%= bohead_dtlRec.tel_no1%>
<%= bohead_dtlRec.tel_no2%>
<%= bohead_dtlRec.tel_no3%>
<%= bohead_dtlRec.ptph_no1%>
<%= bohead_dtlRec.ptph_no2%>
<%= bohead_dtlRec.ptph_no3%>
<%= bjinfo_dtlRec.bjnm%>
<%= bjinfo_dtlRec.bjjuminno%>
<%= bjinfo_dtlRec.bjtelno%>
<%= bjinfo_dtlRec.bjzipcd1%>
<%= bjinfo_dtlRec.bjzipcd2%>
<%= bjinfo_dtlRec.bjjuso4%>
<%= lastschir_listRec.cicodeval%>
<%= lastschir_listRec.cicdnm%>
<%= lastschir_listRec.ciymgbcd%>
<%= lastschir_listRec.cicdgb%>
<%= lastschir_listRec.cicdynm%>
<%= nativ_listRec.cicodeval%>
<%= nativ_listRec.cicdnm%>
<%= nativ_listRec.ciymgbcd%>
<%= nativ_listRec.cicdgb%>
<%= nativ_listRec.cicdynm%>
<%= jgjangir_listRec.ircy%>
<%= jgjangir_listRec.irmm%>
<%= jgjangir_listRec.irsh%>
<%= headfaml_listRec.seq%>
<%= headfaml_listRec.prn%>
<%= headfaml_listRec.flnm%>
<%= headfaml_listRec.rshp%>
<%= headfaml_listRec.bidt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 11 14:52:18 KST 2007 */