/***************************************************************************************************
* 파일명 : SL_S_MILGPAYDataSet.java
* 기능 : 독자정보관리(마일리지지급내역팝업-상세조회)
* 작성일자 : 2004-06-03
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자정보관리(마일리지지급내역팝업-상세조회)
 *
 */

public class SL_S_MILGPAYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList paybasicur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String cmpycd;
	public String cmpynm;
	public String medicd;
	public String medinm;
	public String paybasicd;
	public String paybasinm;
	public String payclsfcd;
	public String payclsfnm;
	public long pont;
	public long hdqtallmamt;
	public long boallmamt;
	public String bonm;
	public String paystatcd;
	public String margamyn;

	public SL_S_MILGPAYDataSet(){}
	public SL_S_MILGPAYDataSet(String errcode, String errmsg, String cmpycd, String cmpynm, String medicd, String medinm, String paybasicd, String paybasinm, String payclsfcd, String payclsfnm, long pont, long hdqtallmamt, long boallmamt, String bonm, String paystatcd, String margamyn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cmpycd = cmpycd;
		this.cmpynm = cmpynm;
		this.medicd = medicd;
		this.medinm = medinm;
		this.paybasicd = paybasicd;
		this.paybasinm = paybasinm;
		this.payclsfcd = payclsfcd;
		this.payclsfnm = payclsfnm;
		this.pont = pont;
		this.hdqtallmamt = hdqtallmamt;
		this.boallmamt = boallmamt;
		this.bonm = bonm;
		this.paystatcd = paystatcd;
		this.margamyn = margamyn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setPaybasicd(String paybasicd){
		this.paybasicd = paybasicd;
	}

	public void setPaybasinm(String paybasinm){
		this.paybasinm = paybasinm;
	}

	public void setPayclsfcd(String payclsfcd){
		this.payclsfcd = payclsfcd;
	}

	public void setPayclsfnm(String payclsfnm){
		this.payclsfnm = payclsfnm;
	}

	public void setPont(long pont){
		this.pont = pont;
	}

	public void setHdqtallmamt(long hdqtallmamt){
		this.hdqtallmamt = hdqtallmamt;
	}

	public void setBoallmamt(long boallmamt){
		this.boallmamt = boallmamt;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setPaystatcd(String paystatcd){
		this.paystatcd = paystatcd;
	}

	public void setMargamyn(String margamyn){
		this.margamyn = margamyn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getPaybasicd(){
		return this.paybasicd;
	}

	public String getPaybasinm(){
		return this.paybasinm;
	}

	public String getPayclsfcd(){
		return this.payclsfcd;
	}

	public String getPayclsfnm(){
		return this.payclsfnm;
	}

	public long getPont(){
		return this.pont;
	}

	public long getHdqtallmamt(){
		return this.hdqtallmamt;
	}

	public long getBoallmamt(){
		return this.boallmamt;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getPaystatcd(){
		return this.paystatcd;
	}

	public String getMargamyn(){
		return this.margamyn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.cmpycd = Util.checkString(cstmt.getString(6));
		this.cmpynm = Util.checkString(cstmt.getString(7));
		this.medicd = Util.checkString(cstmt.getString(8));
		this.medinm = Util.checkString(cstmt.getString(9));
		this.paybasicd = Util.checkString(cstmt.getString(10));
		this.paybasinm = Util.checkString(cstmt.getString(11));
		this.payclsfcd = Util.checkString(cstmt.getString(12));
		this.payclsfnm = Util.checkString(cstmt.getString(13));
		this.pont = cstmt.getLong(14);
		this.hdqtallmamt = cstmt.getLong(15);
		this.boallmamt = cstmt.getLong(16);
		this.bonm = Util.checkString(cstmt.getString(17));
		this.paystatcd = Util.checkString(cstmt.getString(18));
		this.margamyn = Util.checkString(cstmt.getString(19));
		ResultSet rset0 = (ResultSet) cstmt.getObject(20);
		while(rset0.next()){
			SL_S_MILGPAYPAYBASICURRecord rec = new SL_S_MILGPAYPAYBASICURRecord();
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.cmpynm = Util.checkString(rset0.getString("cmpynm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.payclsfcd = Util.checkString(rset0.getString("payclsfcd"));
			rec.payclsfnm = Util.checkString(rset0.getString("payclsfnm"));
			rec.paybasicd = Util.checkString(rset0.getString("paybasicd"));
			rec.paybasinm = Util.checkString(rset0.getString("paybasinm"));
			rec.pontcalcclsfcd = Util.checkString(rset0.getString("pontcalcclsfcd"));
			rec.pont = rset0.getInt("pont");
			rec.pontrate = rset0.getInt("pontrate");
			rec.hdqtallmratio = rset0.getInt("hdqtallmratio");
			rec.boallmratio = rset0.getInt("boallmratio");
			rec.adjmexchrate = rset0.getInt("adjmexchrate");
			this.paybasicur.add(rec);
		}
	}

	public String paybasicurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paybasicur.size();
		for(int i=0; i<size; i++){
			SL_S_MILGPAYPAYBASICURRecord rec = (SL_S_MILGPAYPAYBASICURRecord)paybasicur.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.cmpynm;
			
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

	public String paybasicurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paybasicur.size();
		for(int i=0; i<size; i++){
			SL_S_MILGPAYPAYBASICURRecord rec = (SL_S_MILGPAYPAYBASICURRecord)paybasicur.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.cmpynm;
			
			sb.append("<input name=\"");
			sb.append("cmpycd");
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

	public String paybasicurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paybasicur.size();
		for(int i=0; i<size; i++){
			SL_S_MILGPAYPAYBASICURRecord rec = (SL_S_MILGPAYPAYBASICURRecord)paybasicur.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.cmpynm;
			
			sb.append("<input name=\"");
			sb.append("cmpycd");
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
	SL_S_MILGPAYDataSet ds = (SL_S_MILGPAYDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.paybasicur.size(); i++){
		SL_S_MILGPAYPAYBASICURRecord paybasicurRec = (SL_S_MILGPAYPAYBASICURRecord)ds.paybasicur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCmpycd()%>
<%= ds.getCmpynm()%>
<%= ds.getMedicd()%>
<%= ds.getMedinm()%>
<%= ds.getPaybasicd()%>
<%= ds.getPaybasinm()%>
<%= ds.getPayclsfcd()%>
<%= ds.getPayclsfnm()%>
<%= ds.getPont()%>
<%= ds.getHdqtallmamt()%>
<%= ds.getBoallmamt()%>
<%= ds.getBonm()%>
<%= ds.getPaystatcd()%>
<%= ds.getMargamyn()%>
<%= ds.getPaybasicur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= paybasicurRec.cmpycd%>
<%= paybasicurRec.cmpynm%>
<%= paybasicurRec.medicd%>
<%= paybasicurRec.medinm%>
<%= paybasicurRec.payclsfcd%>
<%= paybasicurRec.payclsfnm%>
<%= paybasicurRec.paybasicd%>
<%= paybasicurRec.paybasinm%>
<%= paybasicurRec.pontcalcclsfcd%>
<%= paybasicurRec.pont%>
<%= paybasicurRec.pontrate%>
<%= paybasicurRec.hdqtallmratio%>
<%= paybasicurRec.boallmratio%>
<%= paybasicurRec.adjmexchrate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jun 06 19:52:51 KST 2004 */