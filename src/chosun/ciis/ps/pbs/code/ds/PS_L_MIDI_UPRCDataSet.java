/***************************************************************************************************
 * 파일명   : PS_L_MIDI_UPRC.java
 * 기능     : 매체단가 관리 - 조회
 * 작성일자 : 2005-06-30
 * 작성자   : 전현표
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.code.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 *  매체단가 관리 - 조회
 */

public class PS_L_MIDI_UPRCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_MIDI_UPRCDataSet(){}
	public PS_L_MIDI_UPRCDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(10);
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			PS_L_MIDI_UPRCCURCOMMLISTRecord rec = new PS_L_MIDI_UPRCCURCOMMLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.acpntype = Util.checkString(rset0.getString("acpntype"));
			rec.acpntypenm = Util.checkString(rset0.getString("acpntypenm"));
			rec.acpnclsf = Util.checkString(rset0.getString("acpnclsf"));
			rec.acpnclsfnm = Util.checkString(rset0.getString("acpnclsfnm"));
			rec.natnareaclsf = Util.checkString(rset0.getString("natnareaclsf"));
			rec.cntryys = Util.checkString(rset0.getString("cntryys"));
			rec.aplydt = Util.checkString(rset0.getString("aplydt"));
			rec.sell_amt = rset0.getInt("sell_amt");
			rec.busnalon = rset0.getInt("busnalon");
			rec.uprc = rset0.getInt("uprc");
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.expy_dt = Util.checkString(rset0.getString("expy_dt"));
			rec.extn_cnt = rset0.getInt("extn_cnt");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_MIDI_UPRCCURCOMMLISTRecord rec = (PS_L_MIDI_UPRCCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			PS_L_MIDI_UPRCCURCOMMLISTRecord rec = (PS_L_MIDI_UPRCCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			PS_L_MIDI_UPRCCURCOMMLISTRecord rec = (PS_L_MIDI_UPRCCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
	PS_L_MIDI_UPRCDataSet ds = (PS_L_MIDI_UPRCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_MIDI_UPRCCURCOMMLISTRecord curcommlistRec = (PS_L_MIDI_UPRCCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.acpntype%>
<%= curcommlistRec.acpntypenm%>
<%= curcommlistRec.acpnclsf%>
<%= curcommlistRec.acpnclsfnm%>
<%= curcommlistRec.natnareaclsf%>
<%= curcommlistRec.cntryys%>
<%= curcommlistRec.aplydt%>
<%= curcommlistRec.sell_amt%>
<%= curcommlistRec.busnalon%>
<%= curcommlistRec.uprc%>
<%= curcommlistRec.remk%>
<%= curcommlistRec.expy_dt%>
<%= curcommlistRec.extn_cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 24 15:28:04 KST 2005 */