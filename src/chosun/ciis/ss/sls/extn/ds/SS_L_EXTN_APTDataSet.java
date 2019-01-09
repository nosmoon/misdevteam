/***************************************************************************************************
* 파일명 : .java
* 기능 : 입주아파트관리 조회
* 작성일자 : 2009-05-18
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
 * 입주아파트관리 조회
 */

public class SS_L_EXTN_APTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList aptlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_APTDataSet(){}
	public SS_L_EXTN_APTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_EXTN_APTAPTLISTRecord rec = new SS_L_EXTN_APTAPTLISTRecord();
			rec.aptcd = Util.checkString(rset0.getString("aptcd"));
			rec.aptnm = Util.checkString(rset0.getString("aptnm"));
			rec.teamcd = Util.checkString(rset0.getString("teamcd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.chrgemp_no = Util.checkString(rset0.getString("chrgemp_no"));
			rec.addr1 = Util.checkString(rset0.getString("addr1"));
			rec.addr2 = Util.checkString(rset0.getString("addr2"));
			rec.addr3 = Util.checkString(rset0.getString("addr3"));
			rec.tothoscnt = rset0.getInt("tothoscnt");
			rec.pyong = Util.checkString(rset0.getString("pyong"));
			rec.pyongothin = Util.checkString(rset0.getString("pyongothin"));
			rec.hoscnt = rset0.getInt("hoscnt");
			rec.saledd = Util.checkString(rset0.getString("saledd"));
			rec.mvinplandd = Util.checkString(rset0.getString("mvinplandd"));
			rec.constcmpynm = Util.checkString(rset0.getString("constcmpynm"));
			rec.apttype = Util.checkString(rset0.getString("apttype"));
			rec.stat = Util.checkString(rset0.getString("stat"));
			rec.statnm = Util.checkString(rset0.getString("statnm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.aptlist.add(rec);
		}
	}

	public String aptlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_APTAPTLISTRecord rec = (SS_L_EXTN_APTAPTLISTRecord)aptlist.get(i);
			
			
			String code = rec.aptcd;
			String name = rec.aptnm;
			
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

	public String aptlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_APTAPTLISTRecord rec = (SS_L_EXTN_APTAPTLISTRecord)aptlist.get(i);
			
			
			String code = rec.aptcd;
			String name = rec.aptnm;
			
			sb.append("<input name=\"");
			sb.append("aptcd");
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

	public String aptlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_APTAPTLISTRecord rec = (SS_L_EXTN_APTAPTLISTRecord)aptlist.get(i);
			
			
			String code = rec.aptcd;
			String name = rec.aptnm;
			
			sb.append("<input name=\"");
			sb.append("aptcd");
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
	SS_L_EXTN_APTDataSet ds = (SS_L_EXTN_APTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.aptlist.size(); i++){
		SS_L_EXTN_APTAPTLISTRecord aptlistRec = (SS_L_EXTN_APTAPTLISTRecord)ds.aptlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAptlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= aptlistRec.aptcd%>
<%= aptlistRec.aptnm%>
<%= aptlistRec.teamcd%>
<%= aptlistRec.dept_nm%>
<%= aptlistRec.partcd%>
<%= aptlistRec.part_nm%>
<%= aptlistRec.areacd%>
<%= aptlistRec.area_nm%>
<%= aptlistRec.bocd%>
<%= aptlistRec.bonm%>
<%= aptlistRec.chrgemp_no%>
<%= aptlistRec.addr1%>
<%= aptlistRec.addr2%>
<%= aptlistRec.addr3%>
<%= aptlistRec.tothoscnt%>
<%= aptlistRec.pyong%>
<%= aptlistRec.pyongothin%>
<%= aptlistRec.hoscnt%>
<%= aptlistRec.saledd%>
<%= aptlistRec.mvinplandd%>
<%= aptlistRec.constcmpynm%>
<%= aptlistRec.apttype%>
<%= aptlistRec.stat%>
<%= aptlistRec.statnm%>
<%= aptlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 15:17:45 KST 2009 */