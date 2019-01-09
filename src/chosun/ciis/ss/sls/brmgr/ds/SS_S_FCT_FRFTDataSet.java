/***************************************************************************************************
* 파일명 : SS_S_FCT_FRFTDataSet.java
* 기능 : 지국 경영 - 공정위위약금 - 상세
* 작성일자 : 2004-04-16
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국 경영 - 공정위위약금 - 상세
 *
 */

public class SS_S_FCT_FRFTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deptlist = new ArrayList();
	public ArrayList delbocomlist = new ArrayList();
	public ArrayList viltresnlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String impndt;
	public String deptcd;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String viltnoit;
	public String viltresn;
	public String rdrnm;
	public String frftimpnamt;
	public String delbocom;
	public String hdqtrcpmamt;
	public String hdqtrcpmdt;
	public String borcpmdt;
	public String hdqtun_pymtamt;
	public String borcpmamt;
	public String boun_pymtamt;
	public String resamt;

	public SS_S_FCT_FRFTDataSet(){}
	public SS_S_FCT_FRFTDataSet(String errcode, String errmsg, String impndt, String deptcd, String areacd, String areanm, String bocd, String bonm, String viltnoit, String viltresn, String rdrnm, String frftimpnamt, String delbocom, String hdqtrcpmamt, String hdqtrcpmdt, String borcpmdt, String hdqtun_pymtamt, String borcpmamt, String boun_pymtamt, String resamt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.impndt = impndt;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.areanm = areanm;
		this.bocd = bocd;
		this.bonm = bonm;
		this.viltnoit = viltnoit;
		this.viltresn = viltresn;
		this.rdrnm = rdrnm;
		this.frftimpnamt = frftimpnamt;
		this.delbocom = delbocom;
		this.hdqtrcpmamt = hdqtrcpmamt;
		this.hdqtrcpmdt = hdqtrcpmdt;
		this.borcpmdt = borcpmdt;
		this.hdqtun_pymtamt = hdqtun_pymtamt;
		this.borcpmamt = borcpmamt;
		this.boun_pymtamt = boun_pymtamt;
		this.resamt = resamt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setImpndt(String impndt){
		this.impndt = impndt;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setViltnoit(String viltnoit){
		this.viltnoit = viltnoit;
	}

	public void setViltresn(String viltresn){
		this.viltresn = viltresn;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setFrftimpnamt(String frftimpnamt){
		this.frftimpnamt = frftimpnamt;
	}

	public void setDelbocom(String delbocom){
		this.delbocom = delbocom;
	}

	public void setHdqtrcpmamt(String hdqtrcpmamt){
		this.hdqtrcpmamt = hdqtrcpmamt;
	}

	public void setHdqtrcpmdt(String hdqtrcpmdt){
		this.hdqtrcpmdt = hdqtrcpmdt;
	}

	public void setBorcpmdt(String borcpmdt){
		this.borcpmdt = borcpmdt;
	}

	public void setHdqtun_pymtamt(String hdqtun_pymtamt){
		this.hdqtun_pymtamt = hdqtun_pymtamt;
	}

	public void setBorcpmamt(String borcpmamt){
		this.borcpmamt = borcpmamt;
	}

	public void setBoun_pymtamt(String boun_pymtamt){
		this.boun_pymtamt = boun_pymtamt;
	}

	public void setResamt(String resamt){
		this.resamt = resamt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getImpndt(){
		return this.impndt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getViltnoit(){
		return this.viltnoit;
	}

	public String getViltresn(){
		return this.viltresn;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getFrftimpnamt(){
		return this.frftimpnamt;
	}

	public String getDelbocom(){
		return this.delbocom;
	}

	public String getHdqtrcpmamt(){
		return this.hdqtrcpmamt;
	}

	public String getHdqtrcpmdt(){
		return this.hdqtrcpmdt;
	}

	public String getBorcpmdt(){
		return this.borcpmdt;
	}

	public String getHdqtun_pymtamt(){
		return this.hdqtun_pymtamt;
	}

	public String getBorcpmamt(){
		return this.borcpmamt;
	}

	public String getBoun_pymtamt(){
		return this.boun_pymtamt;
	}

	public String getResamt(){
		return this.resamt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.impndt = Util.checkString(cstmt.getString(8));
		this.deptcd = Util.checkString(cstmt.getString(9));
		this.areacd = Util.checkString(cstmt.getString(10));
		this.areanm = Util.checkString(cstmt.getString(11));
		this.bocd = Util.checkString(cstmt.getString(12));
		this.bonm = Util.checkString(cstmt.getString(13));
		this.viltnoit = Util.checkString(cstmt.getString(14));
		this.viltresn = Util.checkString(cstmt.getString(15));
		this.rdrnm = Util.checkString(cstmt.getString(16));
		this.frftimpnamt = Util.checkString(cstmt.getString(17));
		this.delbocom = Util.checkString(cstmt.getString(18));
		this.hdqtrcpmamt = Util.checkString(cstmt.getString(19));
		this.hdqtrcpmdt = Util.checkString(cstmt.getString(20));
		this.borcpmdt = Util.checkString(cstmt.getString(21));
		this.hdqtun_pymtamt = Util.checkString(cstmt.getString(22));
		this.borcpmamt = Util.checkString(cstmt.getString(23));
		this.boun_pymtamt = Util.checkString(cstmt.getString(24));
		this.resamt = Util.checkString(cstmt.getString(25));
		ResultSet rset0 = (ResultSet) cstmt.getObject(26);
		while(rset0.next()){
			SS_S_FCT_FRFTDEPTLISTRecord rec = new SS_S_FCT_FRFTDEPTLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.boksnm = Util.checkString(rset0.getString("boksnm"));
			this.deptlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(27);
		while(rset1.next()){
			SS_S_FCT_FRFTDELBOCOMLISTRecord rec = new SS_S_FCT_FRFTDELBOCOMLISTRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.delbocomlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(28);
		while(rset2.next()){
			SS_S_FCT_FRFTVILTRESNLISTRecord rec = new SS_S_FCT_FRFTVILTRESNLISTRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.viltresnlist.add(rec);
		}
	}

	public String deptlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlist.size();
		for(int i=0; i<size; i++){
			SS_S_FCT_FRFTDEPTLISTRecord rec = (SS_S_FCT_FRFTDEPTLISTRecord)deptlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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

	public String delbocomlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = delbocomlist.size();
		for(int i=0; i<size; i++){
			SS_S_FCT_FRFTDELBOCOMLISTRecord rec = (SS_S_FCT_FRFTDELBOCOMLISTRecord)delbocomlist.get(i);
			
			
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

	public String viltresnlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = viltresnlist.size();
		for(int i=0; i<size; i++){
			SS_S_FCT_FRFTVILTRESNLISTRecord rec = (SS_S_FCT_FRFTVILTRESNLISTRecord)viltresnlist.get(i);
			
			
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

	public String deptlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlist.size();
		for(int i=0; i<size; i++){
			SS_S_FCT_FRFTDEPTLISTRecord rec = (SS_S_FCT_FRFTDEPTLISTRecord)deptlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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

	public String delbocomlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = delbocomlist.size();
		for(int i=0; i<size; i++){
			SS_S_FCT_FRFTDELBOCOMLISTRecord rec = (SS_S_FCT_FRFTDELBOCOMLISTRecord)delbocomlist.get(i);
			
			
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

	public String viltresnlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = viltresnlist.size();
		for(int i=0; i<size; i++){
			SS_S_FCT_FRFTVILTRESNLISTRecord rec = (SS_S_FCT_FRFTVILTRESNLISTRecord)viltresnlist.get(i);
			
			
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

	public String deptlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlist.size();
		for(int i=0; i<size; i++){
			SS_S_FCT_FRFTDEPTLISTRecord rec = (SS_S_FCT_FRFTDEPTLISTRecord)deptlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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

	public String delbocomlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = delbocomlist.size();
		for(int i=0; i<size; i++){
			SS_S_FCT_FRFTDELBOCOMLISTRecord rec = (SS_S_FCT_FRFTDELBOCOMLISTRecord)delbocomlist.get(i);
			
			
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

	public String viltresnlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = viltresnlist.size();
		for(int i=0; i<size; i++){
			SS_S_FCT_FRFTVILTRESNLISTRecord rec = (SS_S_FCT_FRFTVILTRESNLISTRecord)viltresnlist.get(i);
			
			
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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_FCT_FRFTDataSet ds = (SS_S_FCT_FRFTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.deptlist.size(); i++){
		SS_S_FCT_FRFTDEPTLISTRecord deptlistRec = (SS_S_FCT_FRFTDEPTLISTRecord)ds.deptlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.delbocomlist.size(); i++){
		SS_S_FCT_FRFTDELBOCOMLISTRecord delbocomlistRec = (SS_S_FCT_FRFTDELBOCOMLISTRecord)ds.delbocomlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.viltresnlist.size(); i++){
		SS_S_FCT_FRFTVILTRESNLISTRecord viltresnlistRec = (SS_S_FCT_FRFTVILTRESNLISTRecord)ds.viltresnlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getImpndt()%>
<%= ds.getDeptcd()%>
<%= ds.getAreacd()%>
<%= ds.getAreanm()%>
<%= ds.getBocd()%>
<%= ds.getBonm()%>
<%= ds.getViltnoit()%>
<%= ds.getViltresn()%>
<%= ds.getRdrnm()%>
<%= ds.getFrftimpnamt()%>
<%= ds.getDelbocom()%>
<%= ds.getHdqtrcpmamt()%>
<%= ds.getHdqtrcpmdt()%>
<%= ds.getBorcpmdt()%>
<%= ds.getHdqtun_pymtamt()%>
<%= ds.getBorcpmamt()%>
<%= ds.getBoun_pymtamt()%>
<%= ds.getResamt()%>
<%= ds.getDeptlist()%>
<%= ds.getDelbocomlist()%>
<%= ds.getViltresnlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= deptlistRec.deptcd%>
<%= deptlistRec.boksnm%>
<%= delbocomlistRec.cicodeval%>
<%= delbocomlistRec.cicdnm%>
<%= delbocomlistRec.ciymgbcd%>
<%= delbocomlistRec.cicdgb%>
<%= delbocomlistRec.cicdynm%>
<%= viltresnlistRec.cicodeval%>
<%= viltresnlistRec.cicdnm%>
<%= viltresnlistRec.ciymgbcd%>
<%= viltresnlistRec.cicdgb%>
<%= viltresnlistRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 19 15:24:39 KST 2004 */