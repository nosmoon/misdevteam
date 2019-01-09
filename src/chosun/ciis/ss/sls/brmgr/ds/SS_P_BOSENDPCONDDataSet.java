/***************************************************************************************************
* 파일명 : .java
* 기능 : * 지국경영-지국부수현황 엑셀저장
* 작성일자 : 2010-01-26
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
 *  지국경영-지국부수현황 엑셀저장
 */

public class SS_P_BOSENDPCONDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_P_BOSENDPCONDDataSet(){}
	public SS_P_BOSENDPCONDDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_P_BOSENDPCONDCURCOMMLISTRecord rec = new SS_P_BOSENDPCONDCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.rdr_extnaplc = Util.checkString(rset0.getString("rdr_extnaplc"));
			rec.rdr_extnemp = Util.checkString(rset0.getString("rdr_extnemp"));
			rec.rdr_extnstaf = Util.checkString(rset0.getString("rdr_extnstaf"));
			rec.rdr_extnrdr_movm = Util.checkString(rset0.getString("rdr_extnrdr_movm"));
			rec.rdr_extnhdqt = Util.checkString(rset0.getString("rdr_extnhdqt"));
			rec.rdr_extnexg = Util.checkString(rset0.getString("rdr_extnexg"));
			rec.rdr_extncnvs = Util.checkString(rset0.getString("rdr_extncnvs"));
			rec.rdr_extnetc = Util.checkString(rset0.getString("rdr_extnetc"));
			rec.rdr_extnrate = Util.checkString(rset0.getString("rdr_extnrate"));
			rec.suspmovm = Util.checkString(rset0.getString("suspmovm"));
			rec.susprefu = Util.checkString(rset0.getString("susprefu"));
			rec.suspothnwsp = Util.checkString(rset0.getString("suspothnwsp"));
			rec.suspetc = Util.checkString(rset0.getString("suspetc"));
			rec.suspetc1 = Util.checkString(rset0.getString("suspetc1"));
			rec.suspetc2 = Util.checkString(rset0.getString("suspetc2"));
			rec.suspetc3 = Util.checkString(rset0.getString("suspetc3"));
			rec.suspetc4 = Util.checkString(rset0.getString("suspetc4"));
			rec.susprate = Util.checkString(rset0.getString("susprate"));
			rec.suspaplc = Util.checkString(rset0.getString("suspaplc"));
			rec.suspemp = Util.checkString(rset0.getString("suspemp"));
			rec.suspstaf = Util.checkString(rset0.getString("suspstaf"));
			rec.susprdr_movm = Util.checkString(rset0.getString("susprdr_movm"));
			rec.susphdqt = Util.checkString(rset0.getString("susphdqt"));
			rec.suspexg = Util.checkString(rset0.getString("suspexg"));
			rec.suspcnvsrdr_extn = Util.checkString(rset0.getString("suspcnvsrdr_extn"));
			rec.suspetcrdr_extn = Util.checkString(rset0.getString("suspetcrdr_extn"));
			rec.thmmsendqty = Util.checkString(rset0.getString("thmmsendqty"));
			rec.thmmvalqty = Util.checkString(rset0.getString("thmmvalqty"));
			rec.aftcnt1 = Util.checkString(rset0.getString("aftcnt1"));
			rec.aftcnt2 = Util.checkString(rset0.getString("aftcnt2"));
			rec.aftcnt3 = Util.checkString(rset0.getString("aftcnt3"));
			rec.aftcnt4 = Util.checkString(rset0.getString("aftcnt4"));
			rec.aftcnt5 = Util.checkString(rset0.getString("aftcnt5"));
			rec.aftcnt6 = Util.checkString(rset0.getString("aftcnt6"));
			rec.excsaftcnt6 = Util.checkString(rset0.getString("excsaftcnt6"));
			rec.aptqty = Util.checkString(rset0.getString("aptqty"));
			rec.villaqty = Util.checkString(rset0.getString("villaqty"));
			rec.housqty = Util.checkString(rset0.getString("housqty"));
			rec.offi_roomqty = Util.checkString(rset0.getString("offi_roomqty"));
			rec.shopqty = Util.checkString(rset0.getString("shopqty"));
			rec.etcqty = Util.checkString(rset0.getString("etcqty"));
			rec.pub_infonwsp = Util.checkString(rset0.getString("pub_infonwsp"));
			rec.hdqt_dntnwsp = Util.checkString(rset0.getString("hdqt_dntnwsp"));
			rec.bodntnwsp = Util.checkString(rset0.getString("bodntnwsp"));
			rec.frc_thrwnwsp = Util.checkString(rset0.getString("frc_thrwnwsp"));
			rec.etcfreenwsp = Util.checkString(rset0.getString("etcfreenwsp"));
			rec.resvnwsp = Util.checkString(rset0.getString("resvnwsp"));
			rec.cupn = Util.checkString(rset0.getString("cupn"));
			rec.thmmno_valqty = Util.checkString(rset0.getString("thmmno_valqty"));
			rec.thmmqty = Util.checkString(rset0.getString("thmmqty"));
			rec.nowun_recpqty = Util.checkString(rset0.getString("nowun_recpqty"));
			rec.medaqty = Util.checkString(rset0.getString("medaqty"));
			rec.re_freeqty = Util.checkString(rset0.getString("re_freeqty"));
			rec.lossqty = Util.checkString(rset0.getString("lossqty"));
			rec.ppymqty = Util.checkString(rset0.getString("ppymqty"));
			rec.temp_stopqty = Util.checkString(rset0.getString("temp_stopqty"));
			rec.now_un_recp_amt = Util.checkString(rset0.getString("now_un_recp_amt"));
			rec.thmm_amt = Util.checkString(rset0.getString("thmm_amt"));
			rec.thmmdscnamt = Util.checkString(rset0.getString("thmmdscnamt"));
			rec.thmmpost_dlvfee = Util.checkString(rset0.getString("thmmpost_dlvfee"));
			rec.meda_amt = Util.checkString(rset0.getString("meda_amt"));
			rec.re_freeamt = Util.checkString(rset0.getString("re_freeamt"));
			rec.lossamt = Util.checkString(rset0.getString("lossamt"));
			rec.ppymamt = Util.checkString(rset0.getString("ppymamt"));
			rec.temp_stopamt = Util.checkString(rset0.getString("temp_stopamt"));
			rec.giroclamt = Util.checkString(rset0.getString("giroclamt"));
			rec.vistclamt = Util.checkString(rset0.getString("vistclamt"));
			rec.giroauto_shiftclamt = Util.checkString(rset0.getString("giroauto_shiftclamt"));
			rec.docard_shiftclamt = Util.checkString(rset0.getString("docard_shiftclamt"));
			rec.gnrcard_shiftclamt = Util.checkString(rset0.getString("gnrcard_shiftclamt"));
			rec.onlsetlclamt = Util.checkString(rset0.getString("onlsetlclamt"));
			rec.etcclamt = Util.checkString(rset0.getString("etcclamt"));
			rec.un_recp_repm = Util.checkString(rset0.getString("un_recp_repm"));
			rec.new_repm = Util.checkString(rset0.getString("new_repm"));
			rec.pre_repm = Util.checkString(rset0.getString("pre_repm"));
			rec.arealeafclamt = Util.checkString(rset0.getString("arealeafclamt"));
			rec.teampreisleafclamt = Util.checkString(rset0.getString("teampreisleafclamt"));
			rec.incmgpers = Util.checkString(rset0.getString("incmgpers"));
			rec.incmgdt = Util.checkString(rset0.getString("incmgdt"));
			rec.chgpers = Util.checkString(rset0.getString("chgpers"));
			rec.chgdt = Util.checkString(rset0.getString("chgdt"));
			rec.thmmval_adsc_qty = Util.checkString(rset0.getString("thmmval_adsc_qty"));
			rec.thmmval_ndsc_qty = Util.checkString(rset0.getString("thmmval_ndsc_qty"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_P_BOSENDPCONDCURCOMMLISTRecord rec = (SS_P_BOSENDPCONDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.partnm;
			
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
			SS_P_BOSENDPCONDCURCOMMLISTRecord rec = (SS_P_BOSENDPCONDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.partnm;
			
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
			SS_P_BOSENDPCONDCURCOMMLISTRecord rec = (SS_P_BOSENDPCONDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.partnm;
			
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
	SS_P_BOSENDPCONDDataSet ds = (SS_P_BOSENDPCONDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_P_BOSENDPCONDCURCOMMLISTRecord curcommlistRec = (SS_P_BOSENDPCONDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.yymm%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.rdr_extnaplc%>
<%= curcommlistRec.rdr_extnemp%>
<%= curcommlistRec.rdr_extnstaf%>
<%= curcommlistRec.rdr_extnrdr_movm%>
<%= curcommlistRec.rdr_extnhdqt%>
<%= curcommlistRec.rdr_extnexg%>
<%= curcommlistRec.rdr_extncnvs%>
<%= curcommlistRec.rdr_extnetc%>
<%= curcommlistRec.rdr_extnrate%>
<%= curcommlistRec.suspmovm%>
<%= curcommlistRec.susprefu%>
<%= curcommlistRec.suspothnwsp%>
<%= curcommlistRec.suspetc%>
<%= curcommlistRec.suspetc1%>
<%= curcommlistRec.suspetc2%>
<%= curcommlistRec.suspetc3%>
<%= curcommlistRec.suspetc4%>
<%= curcommlistRec.susprate%>
<%= curcommlistRec.suspaplc%>
<%= curcommlistRec.suspemp%>
<%= curcommlistRec.suspstaf%>
<%= curcommlistRec.susprdr_movm%>
<%= curcommlistRec.susphdqt%>
<%= curcommlistRec.suspexg%>
<%= curcommlistRec.suspcnvsrdr_extn%>
<%= curcommlistRec.suspetcrdr_extn%>
<%= curcommlistRec.thmmsendqty%>
<%= curcommlistRec.thmmvalqty%>
<%= curcommlistRec.aftcnt1%>
<%= curcommlistRec.aftcnt2%>
<%= curcommlistRec.aftcnt3%>
<%= curcommlistRec.aftcnt4%>
<%= curcommlistRec.aftcnt5%>
<%= curcommlistRec.aftcnt6%>
<%= curcommlistRec.excsaftcnt6%>
<%= curcommlistRec.aptqty%>
<%= curcommlistRec.villaqty%>
<%= curcommlistRec.housqty%>
<%= curcommlistRec.offi_roomqty%>
<%= curcommlistRec.shopqty%>
<%= curcommlistRec.etcqty%>
<%= curcommlistRec.pub_infonwsp%>
<%= curcommlistRec.hdqt_dntnwsp%>
<%= curcommlistRec.bodntnwsp%>
<%= curcommlistRec.frc_thrwnwsp%>
<%= curcommlistRec.etcfreenwsp%>
<%= curcommlistRec.resvnwsp%>
<%= curcommlistRec.cupn%>
<%= curcommlistRec.thmmno_valqty%>
<%= curcommlistRec.thmmqty%>
<%= curcommlistRec.nowun_recpqty%>
<%= curcommlistRec.medaqty%>
<%= curcommlistRec.re_freeqty%>
<%= curcommlistRec.lossqty%>
<%= curcommlistRec.ppymqty%>
<%= curcommlistRec.temp_stopqty%>
<%= curcommlistRec.now_un_recp_amt%>
<%= curcommlistRec.thmm_amt%>
<%= curcommlistRec.thmmdscnamt%>
<%= curcommlistRec.thmmpost_dlvfee%>
<%= curcommlistRec.meda_amt%>
<%= curcommlistRec.re_freeamt%>
<%= curcommlistRec.lossamt%>
<%= curcommlistRec.ppymamt%>
<%= curcommlistRec.temp_stopamt%>
<%= curcommlistRec.giroclamt%>
<%= curcommlistRec.vistclamt%>
<%= curcommlistRec.giroauto_shiftclamt%>
<%= curcommlistRec.docard_shiftclamt%>
<%= curcommlistRec.gnrcard_shiftclamt%>
<%= curcommlistRec.onlsetlclamt%>
<%= curcommlistRec.etcclamt%>
<%= curcommlistRec.un_recp_repm%>
<%= curcommlistRec.new_repm%>
<%= curcommlistRec.pre_repm%>
<%= curcommlistRec.arealeafclamt%>
<%= curcommlistRec.teampreisleafclamt%>
<%= curcommlistRec.incmgpers%>
<%= curcommlistRec.incmgdt%>
<%= curcommlistRec.chgpers%>
<%= curcommlistRec.chgdt%>
<%= curcommlistRec.thmmval_adsc_qty%>
<%= curcommlistRec.thmmval_ndsc_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 26 13:46:53 KST 2010 */