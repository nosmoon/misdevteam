/***************************************************************************************************
* 파일명 : SS_S_MIGLBASIDataSet.java
* 기능 : 관리자-마일리지-지급기준-상세를 위한 DataSet
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-마일리지-지급기준-상세를 위한 DataSet
 */

public class SS_S_MIGLBASIDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curpontcalcclsfcd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String medicd;
	public String cmpycd;
	public String paybasicd;
	public String payclsfcd;
	public String pontcalcclsfcd;
	public String pontcalcclsf;
	public String cmpy;
	public String medinm;
	public String payclsf;
	public String paybasi;
	public String descri;
	public String paypointdescri;
	public String remk;
	public String pont;
	public String pontrate;
	public String hdqtallmratio;
	public String boallmratio;
	public String adjmexchrate;
	public String rdrgradsumyn;
	public String vdtyyn;

	public SS_S_MIGLBASIDataSet(){}
	public SS_S_MIGLBASIDataSet(String errcode, String errmsg, String medicd, String cmpycd, String paybasicd, String payclsfcd, String pontcalcclsfcd, String pontcalcclsf, String cmpy, String medinm, String payclsf, String paybasi, String descri, String paypointdescri, String remk, String pont, String pontrate, String hdqtallmratio, String boallmratio, String adjmexchrate, String rdrgradsumyn, String vdtyyn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medicd = medicd;
		this.cmpycd = cmpycd;
		this.paybasicd = paybasicd;
		this.payclsfcd = payclsfcd;
		this.pontcalcclsfcd = pontcalcclsfcd;
		this.pontcalcclsf = pontcalcclsf;
		this.cmpy = cmpy;
		this.medinm = medinm;
		this.payclsf = payclsf;
		this.paybasi = paybasi;
		this.descri = descri;
		this.paypointdescri = paypointdescri;
		this.remk = remk;
		this.pont = pont;
		this.pontrate = pontrate;
		this.hdqtallmratio = hdqtallmratio;
		this.boallmratio = boallmratio;
		this.adjmexchrate = adjmexchrate;
		this.rdrgradsumyn = rdrgradsumyn;
		this.vdtyyn = vdtyyn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setPaybasicd(String paybasicd){
		this.paybasicd = paybasicd;
	}

	public void setPayclsfcd(String payclsfcd){
		this.payclsfcd = payclsfcd;
	}

	public void setPontcalcclsfcd(String pontcalcclsfcd){
		this.pontcalcclsfcd = pontcalcclsfcd;
	}

	public void setPontcalcclsf(String pontcalcclsf){
		this.pontcalcclsf = pontcalcclsf;
	}

	public void setCmpy(String cmpy){
		this.cmpy = cmpy;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setPayclsf(String payclsf){
		this.payclsf = payclsf;
	}

	public void setPaybasi(String paybasi){
		this.paybasi = paybasi;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public void setPaypointdescri(String paypointdescri){
		this.paypointdescri = paypointdescri;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPont(String pont){
		this.pont = pont;
	}

	public void setPontrate(String pontrate){
		this.pontrate = pontrate;
	}

	public void setHdqtallmratio(String hdqtallmratio){
		this.hdqtallmratio = hdqtallmratio;
	}

	public void setBoallmratio(String boallmratio){
		this.boallmratio = boallmratio;
	}

	public void setAdjmexchrate(String adjmexchrate){
		this.adjmexchrate = adjmexchrate;
	}

	public void setRdrgradsumyn(String rdrgradsumyn){
		this.rdrgradsumyn = rdrgradsumyn;
	}

	public void setVdtyyn(String vdtyyn){
		this.vdtyyn = vdtyyn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getPaybasicd(){
		return this.paybasicd;
	}

	public String getPayclsfcd(){
		return this.payclsfcd;
	}

	public String getPontcalcclsfcd(){
		return this.pontcalcclsfcd;
	}

	public String getPontcalcclsf(){
		return this.pontcalcclsf;
	}

	public String getCmpy(){
		return this.cmpy;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getPayclsf(){
		return this.payclsf;
	}

	public String getPaybasi(){
		return this.paybasi;
	}

	public String getDescri(){
		return this.descri;
	}

	public String getPaypointdescri(){
		return this.paypointdescri;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPont(){
		return this.pont;
	}

	public String getPontrate(){
		return this.pontrate;
	}

	public String getHdqtallmratio(){
		return this.hdqtallmratio;
	}

	public String getBoallmratio(){
		return this.boallmratio;
	}

	public String getAdjmexchrate(){
		return this.adjmexchrate;
	}

	public String getRdrgradsumyn(){
		return this.rdrgradsumyn;
	}

	public String getVdtyyn(){
		return this.vdtyyn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.medicd = Util.checkString(cstmt.getString(7));
		this.cmpycd = Util.checkString(cstmt.getString(8));
		this.paybasicd = Util.checkString(cstmt.getString(9));
		this.payclsfcd = Util.checkString(cstmt.getString(10));
		this.pontcalcclsfcd = Util.checkString(cstmt.getString(11));
		this.pontcalcclsf = Util.checkString(cstmt.getString(12));
		this.cmpy = Util.checkString(cstmt.getString(13));
		this.medinm = Util.checkString(cstmt.getString(14));
		this.payclsf = Util.checkString(cstmt.getString(15));
		this.paybasi = Util.checkString(cstmt.getString(16));
		this.descri = Util.checkString(cstmt.getString(17));
		this.paypointdescri = Util.checkString(cstmt.getString(18));
		this.remk = Util.checkString(cstmt.getString(19));
		this.pont = Util.checkString(cstmt.getString(20));
		this.pontrate = Util.checkString(cstmt.getString(21));
		this.hdqtallmratio = Util.checkString(cstmt.getString(22));
		this.boallmratio = Util.checkString(cstmt.getString(23));
		this.adjmexchrate = Util.checkString(cstmt.getString(24));
		this.rdrgradsumyn = Util.checkString(cstmt.getString(25));
		this.vdtyyn = Util.checkString(cstmt.getString(26));
		ResultSet rset0 = (ResultSet) cstmt.getObject(27);
		while(rset0.next()){
			SS_S_MIGLBASICURPONTCALCCLSFCDRecord rec = new SS_S_MIGLBASICURPONTCALCCLSFCDRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curpontcalcclsfcd.add(rec);
		}
	}

	public String curpontcalcclsfcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curpontcalcclsfcd.size();
		for(int i=0; i<size; i++){
			SS_S_MIGLBASICURPONTCALCCLSFCDRecord rec = (SS_S_MIGLBASICURPONTCALCCLSFCDRecord)curpontcalcclsfcd.get(i);
			
			
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

	public String curpontcalcclsfcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curpontcalcclsfcd.size();
		for(int i=0; i<size; i++){
			SS_S_MIGLBASICURPONTCALCCLSFCDRecord rec = (SS_S_MIGLBASICURPONTCALCCLSFCDRecord)curpontcalcclsfcd.get(i);
			
			
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

	public String curpontcalcclsfcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curpontcalcclsfcd.size();
		for(int i=0; i<size; i++){
			SS_S_MIGLBASICURPONTCALCCLSFCDRecord rec = (SS_S_MIGLBASICURPONTCALCCLSFCDRecord)curpontcalcclsfcd.get(i);
			
			
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
	SS_S_MIGLBASIDataSet ds = (SS_S_MIGLBASIDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curpontcalcclsfcd.size(); i++){
		SS_S_MIGLBASICURPONTCALCCLSFCDRecord curpontcalcclsfcdRec = (SS_S_MIGLBASICURPONTCALCCLSFCDRecord)ds.curpontcalcclsfcd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedicd()%>
<%= ds.getCmpycd()%>
<%= ds.getPaybasicd()%>
<%= ds.getPayclsfcd()%>
<%= ds.getPontcalcclsfcd()%>
<%= ds.getPontcalcclsf()%>
<%= ds.getCmpy()%>
<%= ds.getMedinm()%>
<%= ds.getPayclsf()%>
<%= ds.getPaybasi()%>
<%= ds.getDescri()%>
<%= ds.getPaypointdescri()%>
<%= ds.getRemk()%>
<%= ds.getPont()%>
<%= ds.getPontrate()%>
<%= ds.getHdqtallmratio()%>
<%= ds.getBoallmratio()%>
<%= ds.getAdjmexchrate()%>
<%= ds.getRdrgradsumyn()%>
<%= ds.getVdtyyn()%>
<%= ds.getCurpontcalcclsfcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curpontcalcclsfcdRec.cicodeval%>
<%= curpontcalcclsfcdRec.cicdnm%>
<%= curpontcalcclsfcdRec.ciymgbcd%>
<%= curpontcalcclsfcdRec.cicdgb%>
<%= curpontcalcclsfcdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 22 22:44:58 KST 2004 */