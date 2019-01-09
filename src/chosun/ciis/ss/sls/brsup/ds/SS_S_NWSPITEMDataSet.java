/***************************************************************************************************
* 파일명 : SS_S_NWSPITEMDataSet.java
* 기능 : 지국지원-신문지원물품-등록-상세를 위한 DataSet
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-신문지원물품-등록-상세를 위한 DataSet
 */



public class SS_S_NWSPITEMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String itemcd;
	public String itemnm;
	public long qunt;
	public long uprc;
	public long divnuprc;
	public long insddivnuprc;
	public String rcpmchrgpersclsf;
	public String unit;
	public String clamchrgpersclsf;
	public String itemclsf;
	public String sendclsf;
	public String costclsf;
	public String aplcfrdt;
	public String aplctodt;
	public String aplcclostm;
	public String remk;

	public SS_S_NWSPITEMDataSet(){}
	public SS_S_NWSPITEMDataSet(String errcode, String errmsg, String itemcd, String itemnm, long qunt, long uprc, long divnuprc, long insddivnuprc, String rcpmchrgpersclsf, String unit, String clamchrgpersclsf, String itemclsf, String sendclsf, String costclsf, String aplcfrdt, String aplctodt, String aplcclostm, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.itemcd = itemcd;
		this.itemnm = itemnm;
		this.qunt = qunt;
		this.uprc = uprc;
		this.divnuprc = divnuprc;
		this.insddivnuprc = insddivnuprc;
		this.rcpmchrgpersclsf = rcpmchrgpersclsf;
		this.unit = unit;
		this.clamchrgpersclsf = clamchrgpersclsf;
		this.itemclsf = itemclsf;
		this.sendclsf = sendclsf;
		this.costclsf = costclsf;
		this.aplcfrdt = aplcfrdt;
		this.aplctodt = aplctodt;
		this.aplcclostm = aplcclostm;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public void setQunt(long qunt){
		this.qunt = qunt;
	}

	public void setUprc(long uprc){
		this.uprc = uprc;
	}

	public void setDivnuprc(long divnuprc){
		this.divnuprc = divnuprc;
	}

	public void setInsddivnuprc(long insddivnuprc){
		this.insddivnuprc = insddivnuprc;
	}

	public void setRcpmchrgpersclsf(String rcpmchrgpersclsf){
		this.rcpmchrgpersclsf = rcpmchrgpersclsf;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setClamchrgpersclsf(String clamchrgpersclsf){
		this.clamchrgpersclsf = clamchrgpersclsf;
	}

	public void setItemclsf(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setCostclsf(String costclsf){
		this.costclsf = costclsf;
	}

	public void setAplcfrdt(String aplcfrdt){
		this.aplcfrdt = aplcfrdt;
	}

	public void setAplctodt(String aplctodt){
		this.aplctodt = aplctodt;
	}

	public void setAplcclostm(String aplcclostm){
		this.aplcclostm = aplcclostm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getItemnm(){
		return this.itemnm;
	}

	public long getQunt(){
		return this.qunt;
	}

	public long getUprc(){
		return this.uprc;
	}

	public long getDivnuprc(){
		return this.divnuprc;
	}

	public long getInsddivnuprc(){
		return this.insddivnuprc;
	}

	public String getRcpmchrgpersclsf(){
		return this.rcpmchrgpersclsf;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getClamchrgpersclsf(){
		return this.clamchrgpersclsf;
	}

	public String getItemclsf(){
		return this.itemclsf;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getCostclsf(){
		return this.costclsf;
	}

	public String getAplcfrdt(){
		return this.aplcfrdt;
	}

	public String getAplctodt(){
		return this.aplctodt;
	}

	public String getAplcclostm(){
		return this.aplcclostm;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.itemcd = Util.checkString(cstmt.getString(4));
		this.itemnm = Util.checkString(cstmt.getString(5));
		this.qunt = cstmt.getLong(6);
		this.uprc = cstmt.getLong(7);
		this.divnuprc = cstmt.getLong(8);
		this.insddivnuprc = cstmt.getLong(9);
		this.rcpmchrgpersclsf = Util.checkString(cstmt.getString(10));
		this.unit = Util.checkString(cstmt.getString(11));
		this.clamchrgpersclsf = Util.checkString(cstmt.getString(12));
		this.itemclsf = Util.checkString(cstmt.getString(13));
		this.sendclsf = Util.checkString(cstmt.getString(14));
		this.costclsf = Util.checkString(cstmt.getString(15));
		this.aplcfrdt = Util.checkString(cstmt.getString(16));
		this.aplctodt = Util.checkString(cstmt.getString(17));
		this.aplcclostm = Util.checkString(cstmt.getString(18));
		this.remk = Util.checkString(cstmt.getString(19));
		ResultSet rset0 = (ResultSet) cstmt.getObject(20);
		while(rset0.next()){
			SS_S_NWSPITEMCURCOMMLISTRecord rec = new SS_S_NWSPITEMCURCOMMLISTRecord();
			rec.itemcd = Util.checkString(rset0.getString("itemcd"));
			rec.itemnm = Util.checkString(rset0.getString("itemnm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_NWSPITEMCURCOMMLISTRecord rec = (SS_S_NWSPITEMCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.itemcd;
			String name = rec.itemnm;
			
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
			SS_S_NWSPITEMCURCOMMLISTRecord rec = (SS_S_NWSPITEMCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.itemcd;
			String name = rec.itemnm;
			
			sb.append("<input name=\"");
			sb.append("itemcd");
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
			SS_S_NWSPITEMCURCOMMLISTRecord rec = (SS_S_NWSPITEMCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.itemcd;
			String name = rec.itemnm;
			
			sb.append("<input name=\"");
			sb.append("itemcd");
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
	SS_S_NWSPITEMDataSet ds = (SS_S_NWSPITEMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_S_NWSPITEMCURCOMMLISTRecord curcommlistRec = (SS_S_NWSPITEMCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getItemcd()%>
<%= ds.getItemnm()%>
<%= ds.getQunt()%>
<%= ds.getUprc()%>
<%= ds.getDivnuprc()%>
<%= ds.getInsddivnuprc()%>
<%= ds.getRcpmchrgpersclsf()%>
<%= ds.getUnit()%>
<%= ds.getClamchrgpersclsf()%>
<%= ds.getItemclsf()%>
<%= ds.getSendclsf()%>
<%= ds.getCostclsf()%>
<%= ds.getAplcfrdt()%>
<%= ds.getAplctodt()%>
<%= ds.getAplcclostm()%>
<%= ds.getRemk()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.itemcd%>
<%= curcommlistRec.itemnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 29 21:06:58 KST 2004 */