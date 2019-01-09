/***************************************************************************************************
* 파일명 : .java
* 기능 : * 지국경영-지국부수현황 조회(리스트)
* 작성일자 : 2010-01-25
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
 *  지국경영-지국부수현황 조회(리스트)
 */

public class SS_L_BOSENDPCONDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long iygwygbs;
	public long iygwmgbs;
	public long iytot;
	public long thmmvalqty;
	public long thmmvalqtydiff;
	public long valrate;
	public long aftcnt1;
	public long aftcnt2;
	public long aftcnt3;
	public long aftcnt4;
	public long excsaftcnt5;
	public long aftcnt_tot;
	public long aftcnt_totdiff;
	public long realtot;
	public long realtotdiff;
	public long realtotdiffrate;
	public long pub_infonwsp;
	public long dntnwsp;
	public long resvnwsp;
	public long totalcnt;
	public String bo_yymm;

	public SS_L_BOSENDPCONDDataSet(){}
	public SS_L_BOSENDPCONDDataSet(String errcode, String errmsg, long iygwygbs, long iygwmgbs, long iytot, long thmmvalqty, long thmmvalqtydiff, long valrate, long aftcnt1, long aftcnt2, long aftcnt3, long aftcnt4, long excsaftcnt5, long aftcnt_tot, long aftcnt_totdiff, long realtot, long realtotdiff, long realtotdiffrate, long pub_infonwsp, long dntnwsp, long resvnwsp, long totalcnt, String bo_yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.iygwygbs = iygwygbs;
		this.iygwmgbs = iygwmgbs;
		this.iytot = iytot;
		this.thmmvalqty = thmmvalqty;
		this.thmmvalqtydiff = thmmvalqtydiff;
		this.valrate = valrate;
		this.aftcnt1 = aftcnt1;
		this.aftcnt2 = aftcnt2;
		this.aftcnt3 = aftcnt3;
		this.aftcnt4 = aftcnt4;
		this.excsaftcnt5 = excsaftcnt5;
		this.aftcnt_tot = aftcnt_tot;
		this.aftcnt_totdiff = aftcnt_totdiff;
		this.realtot = realtot;
		this.realtotdiff = realtotdiff;
		this.realtotdiffrate = realtotdiffrate;
		this.pub_infonwsp = pub_infonwsp;
		this.dntnwsp = dntnwsp;
		this.resvnwsp = resvnwsp;
		this.totalcnt = totalcnt;
		this.bo_yymm = bo_yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setIygwygbs(long iygwygbs){
		this.iygwygbs = iygwygbs;
	}

	public void setIygwmgbs(long iygwmgbs){
		this.iygwmgbs = iygwmgbs;
	}

	public void setIytot(long iytot){
		this.iytot = iytot;
	}

	public void setThmmvalqty(long thmmvalqty){
		this.thmmvalqty = thmmvalqty;
	}

	public void setThmmvalqtydiff(long thmmvalqtydiff){
		this.thmmvalqtydiff = thmmvalqtydiff;
	}

	public void setValrate(long valrate){
		this.valrate = valrate;
	}

	public void setAftcnt1(long aftcnt1){
		this.aftcnt1 = aftcnt1;
	}

	public void setAftcnt2(long aftcnt2){
		this.aftcnt2 = aftcnt2;
	}

	public void setAftcnt3(long aftcnt3){
		this.aftcnt3 = aftcnt3;
	}

	public void setAftcnt4(long aftcnt4){
		this.aftcnt4 = aftcnt4;
	}

	public void setExcsaftcnt5(long excsaftcnt5){
		this.excsaftcnt5 = excsaftcnt5;
	}

	public void setAftcnt_tot(long aftcnt_tot){
		this.aftcnt_tot = aftcnt_tot;
	}

	public void setAftcnt_totdiff(long aftcnt_totdiff){
		this.aftcnt_totdiff = aftcnt_totdiff;
	}

	public void setRealtot(long realtot){
		this.realtot = realtot;
	}

	public void setRealtotdiff(long realtotdiff){
		this.realtotdiff = realtotdiff;
	}

	public void setRealtotdiffrate(long realtotdiffrate){
		this.realtotdiffrate = realtotdiffrate;
	}

	public void setPub_infonwsp(long pub_infonwsp){
		this.pub_infonwsp = pub_infonwsp;
	}

	public void setDntnwsp(long dntnwsp){
		this.dntnwsp = dntnwsp;
	}

	public void setResvnwsp(long resvnwsp){
		this.resvnwsp = resvnwsp;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public void setBo_yymm(String bo_yymm){
		this.bo_yymm = bo_yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getIygwygbs(){
		return this.iygwygbs;
	}

	public long getIygwmgbs(){
		return this.iygwmgbs;
	}

	public long getIytot(){
		return this.iytot;
	}

	public long getThmmvalqty(){
		return this.thmmvalqty;
	}

	public long getThmmvalqtydiff(){
		return this.thmmvalqtydiff;
	}

	public long getValrate(){
		return this.valrate;
	}

	public long getAftcnt1(){
		return this.aftcnt1;
	}

	public long getAftcnt2(){
		return this.aftcnt2;
	}

	public long getAftcnt3(){
		return this.aftcnt3;
	}

	public long getAftcnt4(){
		return this.aftcnt4;
	}

	public long getExcsaftcnt5(){
		return this.excsaftcnt5;
	}

	public long getAftcnt_tot(){
		return this.aftcnt_tot;
	}

	public long getAftcnt_totdiff(){
		return this.aftcnt_totdiff;
	}

	public long getRealtot(){
		return this.realtot;
	}

	public long getRealtotdiff(){
		return this.realtotdiff;
	}

	public long getRealtotdiffrate(){
		return this.realtotdiffrate;
	}

	public long getPub_infonwsp(){
		return this.pub_infonwsp;
	}

	public long getDntnwsp(){
		return this.dntnwsp;
	}

	public long getResvnwsp(){
		return this.resvnwsp;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public String getBo_yymm(){
		return this.bo_yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.iygwygbs = cstmt.getLong(13);
		this.iygwmgbs = cstmt.getLong(14);
		this.iytot = cstmt.getLong(15);
		this.thmmvalqty = cstmt.getLong(16);
		this.thmmvalqtydiff = cstmt.getLong(17);
		this.valrate = cstmt.getLong(18);
		this.aftcnt1 = cstmt.getLong(19);
		this.aftcnt2 = cstmt.getLong(20);
		this.aftcnt3 = cstmt.getLong(21);
		this.aftcnt4 = cstmt.getLong(22);
		this.excsaftcnt5 = cstmt.getLong(23);
		this.aftcnt_tot = cstmt.getLong(24);
		this.aftcnt_totdiff = cstmt.getLong(25);
		this.realtot = cstmt.getLong(26);
		this.realtotdiff = cstmt.getLong(27);
		this.realtotdiffrate = cstmt.getLong(28);
		this.pub_infonwsp = cstmt.getLong(29);
		this.dntnwsp = cstmt.getLong(30);
		this.resvnwsp = cstmt.getLong(31);
		this.totalcnt = cstmt.getLong(32);
		this.bo_yymm = Util.checkString(cstmt.getString(33));
		ResultSet rset0 = (ResultSet) cstmt.getObject(34);
		while(rset0.next()){
			SS_L_BOSENDPCONDCURCOMMLISTRecord rec = new SS_L_BOSENDPCONDCURCOMMLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.iygwygbs = rset0.getInt("iygwygbs");
			rec.iygwmgbs = rset0.getInt("iygwmgbs");
			rec.iytot = rset0.getInt("iytot");
			rec.thmmvalqty = rset0.getInt("thmmvalqty");
			rec.thmmvalqtydiff = rset0.getInt("thmmvalqtydiff");
			rec.valrate = rset0.getInt("valrate");
			rec.aftcnt1 = rset0.getInt("aftcnt1");
			rec.aftcnt2 = rset0.getInt("aftcnt2");
			rec.aftcnt3 = rset0.getInt("aftcnt3");
			rec.aftcnt4 = rset0.getInt("aftcnt4");
			rec.excsaftcnt5 = rset0.getInt("excsaftcnt5");
			rec.aftcnt_tot = rset0.getInt("aftcnt_tot");
			rec.aftcnt_totdiff = rset0.getInt("aftcnt_totdiff");
			rec.realtot = rset0.getInt("realtot");
			rec.realtotdiff = rset0.getInt("realtotdiff");
			rec.realtotdiffrate = rset0.getInt("realtotdiffrate");
			rec.pub_infonwsp = rset0.getInt("pub_infonwsp");
			rec.dntnwsp = rset0.getInt("dntnwsp");
			rec.resvnwsp = rset0.getInt("resvnwsp");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_BOSENDPCONDCURCOMMLISTRecord rec = (SS_L_BOSENDPCONDCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SS_L_BOSENDPCONDCURCOMMLISTRecord rec = (SS_L_BOSENDPCONDCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SS_L_BOSENDPCONDCURCOMMLISTRecord rec = (SS_L_BOSENDPCONDCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
	SS_L_BOSENDPCONDDataSet ds = (SS_L_BOSENDPCONDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOSENDPCONDCURCOMMLISTRecord curcommlistRec = (SS_L_BOSENDPCONDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getIygwygbs()%>
<%= ds.getIygwmgbs()%>
<%= ds.getIytot()%>
<%= ds.getThmmvalqty()%>
<%= ds.getThmmvalqtydiff()%>
<%= ds.getValrate()%>
<%= ds.getAftcnt1()%>
<%= ds.getAftcnt2()%>
<%= ds.getAftcnt3()%>
<%= ds.getAftcnt4()%>
<%= ds.getExcsaftcnt5()%>
<%= ds.getAftcnt_tot()%>
<%= ds.getAftcnt_totdiff()%>
<%= ds.getRealtot()%>
<%= ds.getRealtotdiff()%>
<%= ds.getRealtotdiffrate()%>
<%= ds.getPub_infonwsp()%>
<%= ds.getDntnwsp()%>
<%= ds.getResvnwsp()%>
<%= ds.getTotalcnt()%>
<%= ds.getBo_yymm()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.iygwygbs%>
<%= curcommlistRec.iygwmgbs%>
<%= curcommlistRec.iytot%>
<%= curcommlistRec.thmmvalqty%>
<%= curcommlistRec.thmmvalqtydiff%>
<%= curcommlistRec.valrate%>
<%= curcommlistRec.aftcnt1%>
<%= curcommlistRec.aftcnt2%>
<%= curcommlistRec.aftcnt3%>
<%= curcommlistRec.aftcnt4%>
<%= curcommlistRec.excsaftcnt5%>
<%= curcommlistRec.aftcnt_tot%>
<%= curcommlistRec.aftcnt_totdiff%>
<%= curcommlistRec.realtot%>
<%= curcommlistRec.realtotdiff%>
<%= curcommlistRec.realtotdiffrate%>
<%= curcommlistRec.pub_infonwsp%>
<%= curcommlistRec.dntnwsp%>
<%= curcommlistRec.resvnwsp%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 25 14:14:58 KST 2010 */