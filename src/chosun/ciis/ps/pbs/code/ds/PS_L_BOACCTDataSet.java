/***************************************************************************************************
* 파일명 : PS_L_BOACCT.java
* 기능   : 출판국-지사계좌관리 리스트
* 작성일자 : 2006-11-09
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/



package chosun.ciis.ps.pbs.code.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 출판지사-통합코드관리 리스트
 *
 */

public class PS_L_BOACCTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList asinbocdcur = new ArrayList();
	public ArrayList accitmcur = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public ArrayList bankcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_BOACCTDataSet(){}
	public PS_L_BOACCTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			PS_L_BOACCTCURCOMMLISTRecord rec = new PS_L_BOACCTCURCOMMLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.acctitem = Util.checkString(rset0.getString("acctitem"));
			rec.acctitem_nm = Util.checkString(rset0.getString("acctitem_nm"));
			rec.depskind = Util.checkString(rset0.getString("depskind"));
			rec.bankcd = Util.checkString(rset0.getString("bankcd"));
			rec.bankcd_nm = Util.checkString(rset0.getString("bankcd_nm"));
			rec.deps_persnm = Util.checkString(rset0.getString("deps_persnm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curcommlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			PS_L_BOACCTACCITMCURRecord rec = new PS_L_BOACCTACCITMCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.accitmcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			PS_L_BOACCTBANKCURRecord rec = new PS_L_BOACCTBANKCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			this.bankcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			PS_L_BOACCTASINBOCDCURRecord rec = new PS_L_BOACCTASINBOCDCURRecord();
			rec.bocd = Util.checkString(rset3.getString("bocd"));
			rec.bonm = Util.checkString(rset3.getString("bonm"));
			rec.deptcd = Util.checkString(rset3.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset3.getString("sellnetclsf"));
			this.asinbocdcur.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BOACCTCURCOMMLISTRecord rec = (PS_L_BOACCTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
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

	public String accitmcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = accitmcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOACCTACCITMCURRecord rec = (PS_L_BOACCTACCITMCURRecord)accitmcur.get(i);
			
			
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

	public String bankcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bankcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOACCTBANKCURRecord rec = (PS_L_BOACCTBANKCURRecord)bankcur.get(i);
			
			
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

	public String asinbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOACCTASINBOCDCURRecord rec = (PS_L_BOACCTASINBOCDCURRecord)asinbocdcur.get(i);
			
			
			String code = rec.bocd;
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BOACCTCURCOMMLISTRecord rec = (PS_L_BOACCTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String accitmcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = accitmcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOACCTACCITMCURRecord rec = (PS_L_BOACCTACCITMCURRecord)accitmcur.get(i);
			
			
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

	public String bankcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bankcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOACCTBANKCURRecord rec = (PS_L_BOACCTBANKCURRecord)bankcur.get(i);
			
			
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

	public String asinbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOACCTASINBOCDCURRecord rec = (PS_L_BOACCTASINBOCDCURRecord)asinbocdcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
			PS_L_BOACCTCURCOMMLISTRecord rec = (PS_L_BOACCTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String accitmcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = accitmcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOACCTACCITMCURRecord rec = (PS_L_BOACCTACCITMCURRecord)accitmcur.get(i);
			
			
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

	public String bankcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bankcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOACCTBANKCURRecord rec = (PS_L_BOACCTBANKCURRecord)bankcur.get(i);
			
			
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

	public String asinbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_L_BOACCTASINBOCDCURRecord rec = (PS_L_BOACCTASINBOCDCURRecord)asinbocdcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
	PS_L_BOACCTDataSet ds = (PS_L_BOACCTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_BOACCTCURCOMMLISTRecord curcommlistRec = (PS_L_BOACCTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.accitmcur.size(); i++){
		PS_L_BOACCTACCITMCURRecord accitmcurRec = (PS_L_BOACCTACCITMCURRecord)ds.accitmcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bankcur.size(); i++){
		PS_L_BOACCTBANKCURRecord bankcurRec = (PS_L_BOACCTBANKCURRecord)ds.bankcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.asinbocdcur.size(); i++){
		PS_L_BOACCTASINBOCDCURRecord asinbocdcurRec = (PS_L_BOACCTASINBOCDCURRecord)ds.asinbocdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getAccitmcur()%>
<%= ds.getBankcur()%>
<%= ds.getAsinbocdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.seq%>
<%= curcommlistRec.acctitem%>
<%= curcommlistRec.acctitem_nm%>
<%= curcommlistRec.depskind%>
<%= curcommlistRec.bankcd%>
<%= curcommlistRec.bankcd_nm%>
<%= curcommlistRec.deps_persnm%>
<%= curcommlistRec.acctno%>
<%= curcommlistRec.remk%>
<%= accitmcurRec.cicodeval%>
<%= accitmcurRec.cicdnm%>
<%= bankcurRec.cicodeval%>
<%= bankcurRec.cicdnm%>
<%= asinbocdcurRec.bocd%>
<%= asinbocdcurRec.bonm%>
<%= asinbocdcurRec.deptcd%>
<%= asinbocdcurRec.sellnetclsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 10 13:16:56 KST 2006 */