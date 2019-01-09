/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국경영-부수증감-본지신청(영업)-조회(리스트)
* 작성일자 : 2009-07-23
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
 * 지국경영-부수증감 신청(담당) 조회(리스트)
 */

public class SS_L_QTYAPLC_MAIN_NWSPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String bo_yymm;
	public long totalcnt;
	public long chrgupdicdcqty_tot;

	public SS_L_QTYAPLC_MAIN_NWSPDataSet(){}
	public SS_L_QTYAPLC_MAIN_NWSPDataSet(String errcode, String errmsg, String bo_yymm, long totalcnt, long chrgupdicdcqty_tot){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bo_yymm = bo_yymm;
		this.totalcnt = totalcnt;
		this.chrgupdicdcqty_tot = chrgupdicdcqty_tot;
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

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public void setChrgupdicdcqty_tot(long chrgupdicdcqty_tot){
		this.chrgupdicdcqty_tot = chrgupdicdcqty_tot;
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

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public long getChrgupdicdcqty_tot(){
		return this.chrgupdicdcqty_tot;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bo_yymm = Util.checkString(cstmt.getString(11));
		this.totalcnt = cstmt.getLong(12);
		this.chrgupdicdcqty_tot = cstmt.getLong(13);
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord rec = new SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.issudt = Util.checkString(rset0.getString("issudt"));
			rec.iygwygbs = rset0.getInt("iygwygbs");
			rec.iygwmgbs = rset0.getInt("iygwmgbs");
			rec.iygwygbs_rate = rset0.getInt("iygwygbs_rate");
			rec.iytot = rset0.getInt("iytot");
			rec.chrgupdicdcqty = rset0.getInt("chrgupdicdcqty");
			rec.aft_iygwygbs = rset0.getInt("aft_iygwygbs");
			rec.aft_iygwmgbs = rset0.getInt("aft_iygwmgbs");
			rec.aft_iygwmgbs_rate = rset0.getInt("aft_iygwmgbs_rate");
			rec.thmmvalqty = rset0.getInt("thmmvalqty");
			rec.aftcnt_tot = rset0.getInt("aftcnt_tot");
			rec.realtot = rset0.getInt("realtot");
			rec.pub_infonwsp = rset0.getInt("pub_infonwsp");
			rec.chrgcnfmyn = Util.checkString(rset0.getString("chrgcnfmyn"));
			rec.closyn = Util.checkString(rset0.getString("closyn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord rec = (SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.areacd;
			
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
			SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord rec = (SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.areacd;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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
			SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord rec = (SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.areacd;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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
	SS_L_QTYAPLC_MAIN_NWSPDataSet ds = (SS_L_QTYAPLC_MAIN_NWSPDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBo_yymm()%>
<%= ds.getTotalcnt()%>
<%= ds.getChrgupdicdcqty_tot()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptcd%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.issudt%>
<%= curcommlistRec.iygwygbs%>
<%= curcommlistRec.iygwmgbs%>
<%= curcommlistRec.iygwygbs_rate%>
<%= curcommlistRec.iytot%>
<%= curcommlistRec.chrgupdicdcqty%>
<%= curcommlistRec.aft_iygwygbs%>
<%= curcommlistRec.aft_iygwmgbs%>
<%= curcommlistRec.aft_iygwmgbs_rate%>
<%= curcommlistRec.thmmvalqty%>
<%= curcommlistRec.aftcnt_tot%>
<%= curcommlistRec.realtot%>
<%= curcommlistRec.pub_infonwsp%>
<%= curcommlistRec.chrgcnfmyn%>
<%= curcommlistRec.closyn%>
<%= curcommlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 23 14:31:11 KST 2009 */