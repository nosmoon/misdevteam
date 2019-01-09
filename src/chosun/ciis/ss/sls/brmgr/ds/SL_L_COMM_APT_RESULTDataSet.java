/***************************************************************************************************
 * 파일명   : SL_L_COMM_APT_RESULTDataSet.java
 * 기능     : 지국경영-아파트투입율-투입결과조회
 * 작성일자 : 2005/11/07
 * 작성자   : 이혁
 **************************************************************************************************/



package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  지국경영-아파트투입율-투입결과조회
**/

public class SL_L_COMM_APT_RESULTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
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

	public SL_L_COMM_APT_RESULTDataSet(){}
	public SL_L_COMM_APT_RESULTDataSet(String errcode, String errmsg, long hoscnt, long cho_cnt, long jung_cnt, long dong_cnt, long totalcnt){
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
		this.hoscnt = cstmt.getLong(6);
		this.cho_cnt = cstmt.getLong(7);
		this.jung_cnt = cstmt.getLong(8);
		this.dong_cnt = cstmt.getLong(9);
		this.totalcnt = cstmt.getLong(10);
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord rec = new SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord();
			rec.invsgdt = Util.checkString(rset0.getString("invsgdt"));
			rec.pyong = Util.checkString(rset0.getString("pyong"));
			rec.invsgno = Util.checkString(rset0.getString("invsgno"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.addrcd = Util.checkString(rset0.getString("addrcd"));
			rec.dongno = Util.checkString(rset0.getString("dongno"));
			rec.hoscnt = Util.checkString(rset0.getString("hoscnt"));
			rec.cho_cnt = Util.checkString(rset0.getString("cho_cnt"));
			rec.cho_rate = Util.checkString(rset0.getString("cho_rate"));
			rec.jung_cnt = Util.checkString(rset0.getString("jung_cnt"));
			rec.jung_rate = Util.checkString(rset0.getString("jung_rate"));
			rec.dong_cnt = Util.checkString(rset0.getString("dong_cnt"));
			rec.dong_rate = Util.checkString(rset0.getString("dong_rate"));
			this.curthrwrtlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(12);
		while(rset1.next()){
			SL_L_COMM_APT_RESULTCURRESULTRecord rec = new SL_L_COMM_APT_RESULTCURRESULTRecord();
			rec.invsgdt = Util.checkString(rset1.getString("invsgdt"));
			rec.invsgno = Util.checkString(rset1.getString("invsgno"));
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.addrcd = Util.checkString(rset1.getString("addrcd"));
			rec.hoscnt = Util.checkString(rset1.getString("hoscnt"));
			rec.cho_cnt = Util.checkString(rset1.getString("cho_cnt"));
			rec.jung_cnt = Util.checkString(rset1.getString("jung_cnt"));
			rec.dong_cnt = Util.checkString(rset1.getString("dong_cnt"));
			this.curresult.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(13);
		while(rset2.next()){
			SL_L_COMM_APT_RESULTCURCOUNTRecord rec = new SL_L_COMM_APT_RESULTCURCOUNTRecord();
			rec.count = rset2.getInt("count");
			rec.tmp = rset2.getInt("tmp");
			this.curcount.add(rec);
		}
	}

	public String curthrwrtlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curthrwrtlist.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord rec = (SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord)curthrwrtlist.get(i);


			String code = rec.invsgdt;
			String name = rec.pyong;

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
			SL_L_COMM_APT_RESULTCURRESULTRecord rec = (SL_L_COMM_APT_RESULTCURRESULTRecord)curresult.get(i);


			String code = rec.invsgdt;
			String name = rec.invsgno;

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
			SL_L_COMM_APT_RESULTCURCOUNTRecord rec = (SL_L_COMM_APT_RESULTCURCOUNTRecord)curcount.get(i);


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

	public String curthrwrtlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curthrwrtlist.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord rec = (SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord)curthrwrtlist.get(i);


			String code = rec.invsgdt;
			String name = rec.pyong;

			sb.append("<input name=\"");
			sb.append("invsgdt");
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
			SL_L_COMM_APT_RESULTCURRESULTRecord rec = (SL_L_COMM_APT_RESULTCURRESULTRecord)curresult.get(i);


			String code = rec.invsgdt;
			String name = rec.invsgno;

			sb.append("<input name=\"");
			sb.append("invsgdt");
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
			SL_L_COMM_APT_RESULTCURCOUNTRecord rec = (SL_L_COMM_APT_RESULTCURCOUNTRecord)curcount.get(i);


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

	public String curthrwrtlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curthrwrtlist.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord rec = (SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord)curthrwrtlist.get(i);


			String code = rec.invsgdt;
			String name = rec.pyong;

			sb.append("<input name=\"");
			sb.append("invsgdt");
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
			SL_L_COMM_APT_RESULTCURRESULTRecord rec = (SL_L_COMM_APT_RESULTCURRESULTRecord)curresult.get(i);


			String code = rec.invsgdt;
			String name = rec.invsgno;

			sb.append("<input name=\"");
			sb.append("invsgdt");
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
			SL_L_COMM_APT_RESULTCURCOUNTRecord rec = (SL_L_COMM_APT_RESULTCURCOUNTRecord)curcount.get(i);


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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_L_COMM_APT_RESULTDataSet ds = (SL_L_COMM_APT_RESULTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curthrwrtlist.size(); i++){
		SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord curthrwrtlistRec = (SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord)ds.curthrwrtlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curresult.size(); i++){
		SL_L_COMM_APT_RESULTCURRESULTRecord curresultRec = (SL_L_COMM_APT_RESULTCURRESULTRecord)ds.curresult.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcount.size(); i++){
		SL_L_COMM_APT_RESULTCURCOUNTRecord curcountRec = (SL_L_COMM_APT_RESULTCURCOUNTRecord)ds.curcount.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curthrwrtlistRec.invsgdt%>
<%= curthrwrtlistRec.pyong%>
<%= curthrwrtlistRec.invsgno%>
<%= curthrwrtlistRec.bocd%>
<%= curthrwrtlistRec.addrcd%>
<%= curthrwrtlistRec.dongno%>
<%= curthrwrtlistRec.hoscnt%>
<%= curthrwrtlistRec.cho_cnt%>
<%= curthrwrtlistRec.cho_rate%>
<%= curthrwrtlistRec.jung_cnt%>
<%= curthrwrtlistRec.jung_rate%>
<%= curthrwrtlistRec.dong_cnt%>
<%= curthrwrtlistRec.dong_rate%>
<%= curresultRec.invsgdt%>
<%= curresultRec.invsgno%>
<%= curresultRec.bocd%>
<%= curresultRec.addrcd%>
<%= curresultRec.hoscnt%>
<%= curresultRec.cho_cnt%>
<%= curresultRec.jung_cnt%>
<%= curresultRec.dong_cnt%>
<%= curcountRec.count%>
<%= curcountRec.tmp%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 07 19:57:01 KST 2005 */
