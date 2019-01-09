/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-부수증감-본지신청(지원)-인쇄
* 작성일자 : 2009-04-20
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
 * 지국경영-부수증감-본지신청(지원)-인쇄
 */

public class SS_L_QTYAPLC_MAINNWSP_PRINTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String bo_yymm;
	public long totalboaplcicdcqty;
	public long totalchrgupdicdcqty;
	public long totaliygwygbs;
	public long totaliygwhbbs;
	public long totalbsbusu;
	public long totalthmmvalqty;
	public long totalaftcnt_tot;
	public long totalrealtot;
	public long totalpub_infonwsp;
	public long totalcnt;

	public SS_L_QTYAPLC_MAINNWSP_PRINTDataSet(){}
	public SS_L_QTYAPLC_MAINNWSP_PRINTDataSet(String errcode, String errmsg, String bo_yymm, long totalboaplcicdcqty, long totalchrgupdicdcqty, long totaliygwygbs, long totaliygwhbbs, long totalbsbusu, long totalthmmvalqty, long totalaftcnt_tot, long totalrealtot, long totalpub_infonwsp, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bo_yymm = bo_yymm;
		this.totalboaplcicdcqty = totalboaplcicdcqty;
		this.totalchrgupdicdcqty = totalchrgupdicdcqty;
		this.totaliygwygbs = totaliygwygbs;
		this.totaliygwhbbs = totaliygwhbbs;
		this.totalbsbusu = totalbsbusu;
		this.totalthmmvalqty = totalthmmvalqty;
		this.totalaftcnt_tot = totalaftcnt_tot;
		this.totalrealtot = totalrealtot;
		this.totalpub_infonwsp = totalpub_infonwsp;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBo_yymm(String bo_yymm){
		this.bo_yymm = bo_yymm;
	}

	public void setTotalboaplcicdcqty(long totalboaplcicdcqty){
		this.totalboaplcicdcqty = totalboaplcicdcqty;
	}

	public void setTotalchrgupdicdcqty(long totalchrgupdicdcqty){
		this.totalchrgupdicdcqty = totalchrgupdicdcqty;
	}

	public void setTotaliygwygbs(long totaliygwygbs){
		this.totaliygwygbs = totaliygwygbs;
	}

	public void setTotaliygwhbbs(long totaliygwhbbs){
		this.totaliygwhbbs = totaliygwhbbs;
	}

	public void setTotalbsbusu(long totalbsbusu){
		this.totalbsbusu = totalbsbusu;
	}

	public void setTotalthmmvalqty(long totalthmmvalqty){
		this.totalthmmvalqty = totalthmmvalqty;
	}

	public void setTotalaftcnt_tot(long totalaftcnt_tot){
		this.totalaftcnt_tot = totalaftcnt_tot;
	}

	public void setTotalrealtot(long totalrealtot){
		this.totalrealtot = totalrealtot;
	}

	public void setTotalpub_infonwsp(long totalpub_infonwsp){
		this.totalpub_infonwsp = totalpub_infonwsp;
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

	public String getBo_yymm(){
		return this.bo_yymm;
	}

	public long getTotalboaplcicdcqty(){
		return this.totalboaplcicdcqty;
	}

	public long getTotalchrgupdicdcqty(){
		return this.totalchrgupdicdcqty;
	}

	public long getTotaliygwygbs(){
		return this.totaliygwygbs;
	}

	public long getTotaliygwhbbs(){
		return this.totaliygwhbbs;
	}

	public long getTotalbsbusu(){
		return this.totalbsbusu;
	}

	public long getTotalthmmvalqty(){
		return this.totalthmmvalqty;
	}

	public long getTotalaftcnt_tot(){
		return this.totalaftcnt_tot;
	}

	public long getTotalrealtot(){
		return this.totalrealtot;
	}

	public long getTotalpub_infonwsp(){
		return this.totalpub_infonwsp;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bo_yymm = Util.checkString(cstmt.getString(10));
		this.totalboaplcicdcqty = cstmt.getLong(11);
		this.totalchrgupdicdcqty = cstmt.getLong(12);
		this.totaliygwygbs = cstmt.getLong(13);
		this.totaliygwhbbs = cstmt.getLong(14);
		this.totalbsbusu = cstmt.getLong(15);
		this.totalthmmvalqty = cstmt.getLong(16);
		this.totalaftcnt_tot = cstmt.getLong(17);
		this.totalrealtot = cstmt.getLong(18);
		this.totalpub_infonwsp = cstmt.getLong(19);
		this.totalcnt = cstmt.getLong(20);
		ResultSet rset0 = (ResultSet) cstmt.getObject(21);
		while(rset0.next()){
			SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord rec = new SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.issudt = Util.checkString(rset0.getString("issudt"));
			rec.boaplcicdcqty = rset0.getInt("boaplcicdcqty");
			rec.chrgupdicdcqty = rset0.getInt("chrgupdicdcqty");
			rec.iygwygbs = rset0.getInt("iygwygbs");
			rec.iygwhbbs = rset0.getInt("iygwhbbs");
			rec.bsbusu = rset0.getInt("bsbusu");
			rec.thmmvalqty = rset0.getInt("thmmvalqty");
			rec.aftcnt_tot = rset0.getInt("aftcnt_tot");
			rec.realtot = rset0.getInt("realtot");
			rec.pub_infonwsp = rset0.getInt("pub_infonwsp");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord rec = (SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord rec = (SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("deptnm");
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
			SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord rec = (SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("deptnm");
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
	SS_L_QTYAPLC_MAINNWSP_PRINTDataSet ds = (SS_L_QTYAPLC_MAINNWSP_PRINTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBo_yymm()%>
<%= ds.getTotalboaplcicdcqty()%>
<%= ds.getTotalchrgupdicdcqty()%>
<%= ds.getTotaliygwygbs()%>
<%= ds.getTotaliygwhbbs()%>
<%= ds.getTotalbsbusu()%>
<%= ds.getTotalthmmvalqty()%>
<%= ds.getTotalaftcnt_tot()%>
<%= ds.getTotalrealtot()%>
<%= ds.getTotalpub_infonwsp()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.issudt%>
<%= curcommlistRec.boaplcicdcqty%>
<%= curcommlistRec.chrgupdicdcqty%>
<%= curcommlistRec.iygwygbs%>
<%= curcommlistRec.iygwhbbs%>
<%= curcommlistRec.bsbusu%>
<%= curcommlistRec.thmmvalqty%>
<%= curcommlistRec.aftcnt_tot%>
<%= curcommlistRec.realtot%>
<%= curcommlistRec.pub_infonwsp%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 20 21:30:12 KST 2009 */