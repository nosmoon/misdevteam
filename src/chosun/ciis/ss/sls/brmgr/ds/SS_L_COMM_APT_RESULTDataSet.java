/***************************************************************************************************
* 파일명 : .java
* 기능 : *아파트투입현황(결과보기)
* 작성일자 : 2009-05-29
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 아파트투입현황(결과보기)
 */

public class SS_L_COMM_APT_RESULTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList regtypecur2 = new ArrayList();
	public ArrayList regtypecur1 = new ArrayList();
	public ArrayList curthrwrtlist = new ArrayList();
	public ArrayList curcount = new ArrayList();
	public ArrayList curresult = new ArrayList();
	public String errcode;
	public String errmsg;
	public long hoscnt;
	public long cho_cnt;
	public long jung_cnt;
	public long dong_cnt;
	public long totalcnt;

	public SS_L_COMM_APT_RESULTDataSet(){}
	public SS_L_COMM_APT_RESULTDataSet(String errcode, String errmsg, long hoscnt, long cho_cnt, long jung_cnt, long dong_cnt, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.hoscnt = hoscnt;
		this.cho_cnt = cho_cnt;
		this.jung_cnt = jung_cnt;
		this.dong_cnt = dong_cnt;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setHoscnt(long hoscnt){
		this.hoscnt = hoscnt;
	}

	public void setCho_cnt(long cho_cnt){
		this.cho_cnt = cho_cnt;
	}

	public void setJung_cnt(long jung_cnt){
		this.jung_cnt = jung_cnt;
	}

	public void setDong_cnt(long dong_cnt){
		this.dong_cnt = dong_cnt;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getHoscnt(){
		return this.hoscnt;
	}

	public long getCho_cnt(){
		return this.cho_cnt;
	}

	public long getJung_cnt(){
		return this.jung_cnt;
	}

	public long getDong_cnt(){
		return this.dong_cnt;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.hoscnt = cstmt.getLong(19);
		this.cho_cnt = cstmt.getLong(20);
		this.jung_cnt = cstmt.getLong(21);
		this.dong_cnt = cstmt.getLong(22);
		this.totalcnt = cstmt.getLong(23);
		ResultSet rset0 = (ResultSet) cstmt.getObject(24);
		while(rset0.next()){
			SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord rec = new SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord();
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.invsgdt = Util.checkString(rset0.getString("invsgdt"));
			rec.pyong = Util.checkString(rset0.getString("pyong"));
			rec.invsgno = Util.checkString(rset0.getString("invsgno"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.addrcd = Util.checkString(rset0.getString("addrcd"));
			rec.dongno = Util.checkString(rset0.getString("dongno"));
			rec.hoscnt = Util.checkString(rset0.getString("hoscnt"));
			rec.cho_cnt = Util.checkString(rset0.getString("cho_cnt"));
			rec.cho_rate = Util.checkString(rset0.getString("cho_rate"));
			rec.jung_cnt = Util.checkString(rset0.getString("jung_cnt"));
			rec.jung_rate = Util.checkString(rset0.getString("jung_rate"));
			rec.dong_cnt = Util.checkString(rset0.getString("dong_cnt"));
			rec.dong_rate = Util.checkString(rset0.getString("dong_rate"));
			rec.remkclsf = Util.checkString(rset0.getString("remkclsf"));
			rec.invsgpers = Util.checkString(rset0.getString("invsgpers"));
			rec.regtype1 = Util.checkString(rset0.getString("regtype1"));
			rec.regtype2 = Util.checkString(rset0.getString("regtype2"));
			this.curthrwrtlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(25);
		while(rset1.next()){
			SS_L_COMM_APT_RESULTCURRESULTRecord rec = new SS_L_COMM_APT_RESULTCURRESULTRecord();
			rec.areacd = Util.checkString(rset1.getString("areacd"));
			rec.areanm = Util.checkString(rset1.getString("areanm"));
			rec.invsgdt = Util.checkString(rset1.getString("invsgdt"));
			rec.invsgno = Util.checkString(rset1.getString("invsgno"));
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.addrcd = Util.checkString(rset1.getString("addrcd"));
			rec.addrnm = Util.checkString(rset1.getString("addrnm"));
			rec.hoscnt = Util.checkString(rset1.getString("hoscnt"));
			rec.cho_cnt = Util.checkString(rset1.getString("cho_cnt"));
			rec.jung_cnt = Util.checkString(rset1.getString("jung_cnt"));
			rec.dong_cnt = Util.checkString(rset1.getString("dong_cnt"));
			rec.remkclsf = Util.checkString(rset1.getString("remkclsf"));
			rec.invsgpers = Util.checkString(rset1.getString("invsgpers"));
			rec.regtype1 = Util.checkString(rset1.getString("regtype1"));
			rec.regtype2 = Util.checkString(rset1.getString("regtype2"));
			this.curresult.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(26);
		while(rset2.next()){
			SS_L_COMM_APT_RESULTCURCOUNTRecord rec = new SS_L_COMM_APT_RESULTCURCOUNTRecord();
			rec.count = rset2.getInt("count");
			rec.tmp = rset2.getInt("tmp");
			this.curcount.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(27);
		while(rset3.next()){
			SS_L_COMM_APT_RESULTREGTYPECUR1Record rec = new SS_L_COMM_APT_RESULTREGTYPECUR1Record();
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.regtypecur1.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(28);
		while(rset4.next()){
			SS_L_COMM_APT_RESULTREGTYPECUR2Record rec = new SS_L_COMM_APT_RESULTREGTYPECUR2Record();
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.regtypecur2.add(rec);
		}
	}

	public String curthrwrtlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curthrwrtlist.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord rec = (SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord)curthrwrtlist.get(i);
			
			
			String code = rec.areacd;
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

	public String curresultOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curresult.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTCURRESULTRecord rec = (SS_L_COMM_APT_RESULTCURRESULTRecord)curresult.get(i);
			
			
			String code = rec.areacd;
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

	public String curcountOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcount.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTCURCOUNTRecord rec = (SS_L_COMM_APT_RESULTCURCOUNTRecord)curcount.get(i);
			
			
			String code = rec.count + "";
			String name = rec.tmp + "";
			
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

	public String regtypecur1OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur1.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTREGTYPECUR1Record rec = (SS_L_COMM_APT_RESULTREGTYPECUR1Record)regtypecur1.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String regtypecur2OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur2.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTREGTYPECUR2Record rec = (SS_L_COMM_APT_RESULTREGTYPECUR2Record)regtypecur2.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String curthrwrtlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curthrwrtlist.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord rec = (SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord)curthrwrtlist.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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

	public String curresultChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curresult.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTCURRESULTRecord rec = (SS_L_COMM_APT_RESULTCURRESULTRecord)curresult.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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

	public String curcountChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcount.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTCURCOUNTRecord rec = (SS_L_COMM_APT_RESULTCURCOUNTRecord)curcount.get(i);
			
			
			String code = rec.count + "";
			String name = rec.tmp + "";
			
			sb.append("<input name=\"");
			sb.append("count");
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

	public String regtypecur1ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur1.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTREGTYPECUR1Record rec = (SS_L_COMM_APT_RESULTREGTYPECUR1Record)regtypecur1.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String regtypecur2ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur2.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTREGTYPECUR2Record rec = (SS_L_COMM_APT_RESULTREGTYPECUR2Record)regtypecur2.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String curthrwrtlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curthrwrtlist.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord rec = (SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord)curthrwrtlist.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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

	public String curresultRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curresult.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTCURRESULTRecord rec = (SS_L_COMM_APT_RESULTCURRESULTRecord)curresult.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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

	public String curcountRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcount.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTCURCOUNTRecord rec = (SS_L_COMM_APT_RESULTCURCOUNTRecord)curcount.get(i);
			
			
			String code = rec.count + "";
			String name = rec.tmp + "";
			
			sb.append("<input name=\"");
			sb.append("count");
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

	public String regtypecur1RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur1.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTREGTYPECUR1Record rec = (SS_L_COMM_APT_RESULTREGTYPECUR1Record)regtypecur1.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String regtypecur2RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur2.size();
		for(int i=0; i<size; i++){
			SS_L_COMM_APT_RESULTREGTYPECUR2Record rec = (SS_L_COMM_APT_RESULTREGTYPECUR2Record)regtypecur2.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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
	SS_L_COMM_APT_RESULTDataSet ds = (SS_L_COMM_APT_RESULTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curthrwrtlist.size(); i++){
		SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord curthrwrtlistRec = (SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord)ds.curthrwrtlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curresult.size(); i++){
		SS_L_COMM_APT_RESULTCURRESULTRecord curresultRec = (SS_L_COMM_APT_RESULTCURRESULTRecord)ds.curresult.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcount.size(); i++){
		SS_L_COMM_APT_RESULTCURCOUNTRecord curcountRec = (SS_L_COMM_APT_RESULTCURCOUNTRecord)ds.curcount.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.regtypecur1.size(); i++){
		SS_L_COMM_APT_RESULTREGTYPECUR1Record regtypecur1Rec = (SS_L_COMM_APT_RESULTREGTYPECUR1Record)ds.regtypecur1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.regtypecur2.size(); i++){
		SS_L_COMM_APT_RESULTREGTYPECUR2Record regtypecur2Rec = (SS_L_COMM_APT_RESULTREGTYPECUR2Record)ds.regtypecur2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getHoscnt()%>
<%= ds.getCho_cnt()%>
<%= ds.getJung_cnt()%>
<%= ds.getDong_cnt()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurthrwrtlist()%>
<%= ds.getCurresult()%>
<%= ds.getCurcount()%>
<%= ds.getRegtypecur1()%>
<%= ds.getRegtypecur2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curthrwrtlistRec.areacd%>
<%= curthrwrtlistRec.areanm%>
<%= curthrwrtlistRec.invsgdt%>
<%= curthrwrtlistRec.pyong%>
<%= curthrwrtlistRec.invsgno%>
<%= curthrwrtlistRec.bocd%>
<%= curthrwrtlistRec.bonm%>
<%= curthrwrtlistRec.addrcd%>
<%= curthrwrtlistRec.dongno%>
<%= curthrwrtlistRec.hoscnt%>
<%= curthrwrtlistRec.cho_cnt%>
<%= curthrwrtlistRec.cho_rate%>
<%= curthrwrtlistRec.jung_cnt%>
<%= curthrwrtlistRec.jung_rate%>
<%= curthrwrtlistRec.dong_cnt%>
<%= curthrwrtlistRec.dong_rate%>
<%= curthrwrtlistRec.remkclsf%>
<%= curthrwrtlistRec.invsgpers%>
<%= curthrwrtlistRec.regtype1%>
<%= curthrwrtlistRec.regtype2%>
<%= curresultRec.areacd%>
<%= curresultRec.areanm%>
<%= curresultRec.invsgdt%>
<%= curresultRec.invsgno%>
<%= curresultRec.bocd%>
<%= curresultRec.bonm%>
<%= curresultRec.addrcd%>
<%= curresultRec.addrnm%>
<%= curresultRec.hoscnt%>
<%= curresultRec.cho_cnt%>
<%= curresultRec.jung_cnt%>
<%= curresultRec.dong_cnt%>
<%= curresultRec.remkclsf%>
<%= curresultRec.invsgpers%>
<%= curresultRec.regtype1%>
<%= curresultRec.regtype2%>
<%= curcountRec.count%>
<%= curcountRec.tmp%>
<%= regtypecur1Rec.ciymgbcd%>
<%= regtypecur1Rec.cicdgb%>
<%= regtypecur1Rec.cicodeval%>
<%= regtypecur1Rec.cicdnm%>
<%= regtypecur1Rec.cicdynm%>
<%= regtypecur2Rec.ciymgbcd%>
<%= regtypecur2Rec.cicdgb%>
<%= regtypecur2Rec.cicodeval%>
<%= regtypecur2Rec.cicdnm%>
<%= regtypecur2Rec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 17:08:00 KST 2009 */