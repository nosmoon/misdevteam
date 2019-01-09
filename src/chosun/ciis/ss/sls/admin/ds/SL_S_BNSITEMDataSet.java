/***************************************************************************************************
 * 파일명   : SP_SL_S_BNSITEM
 * 기능     : 관리자-판촉코드-상세보기
 * 작성일자 : 2007/05/25
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
**  SP_SL_S_BNSITEM
**/

public class SL_S_BNSITEMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList useclsfcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String bns_itemcd;
	public String bns_itemnm;
	public long uprc;
	public String mnftwon;
	public String spec;
	public String remk;
	public String useclsf;
	public String useyn;
	public String delyn;

	public SL_S_BNSITEMDataSet(){}
	public SL_S_BNSITEMDataSet(String errcode, String errmsg, String bns_itemcd, String bns_itemnm, long uprc, String mnftwon, String spec, String remk, String useclsf, String useyn, String delyn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bns_itemcd = bns_itemcd;
		this.bns_itemnm = bns_itemnm;
		this.uprc = uprc;
		this.mnftwon = mnftwon;
		this.spec = spec;
		this.remk = remk;
		this.useclsf = useclsf;
		this.useyn = useyn;
		this.delyn = delyn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setBns_itemnm(String bns_itemnm){
		this.bns_itemnm = bns_itemnm;
	}

	public void setUprc(long uprc){
		this.uprc = uprc;
	}

	public void setMnftwon(String mnftwon){
		this.mnftwon = mnftwon;
	}

	public void setSpec(String spec){
		this.spec = spec;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setUseclsf(String useclsf){
		this.useclsf = useclsf;
	}

	public void setUseyn(String useyn){
		this.useyn = useyn;
	}

	public void setDelyn(String delyn){
		this.delyn = delyn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getBns_itemnm(){
		return this.bns_itemnm;
	}

	public long getUprc(){
		return this.uprc;
	}

	public String getMnftwon(){
		return this.mnftwon;
	}

	public String getSpec(){
		return this.spec;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getUseclsf(){
		return this.useclsf;
	}

	public String getUseyn(){
		return this.useyn;
	}

	public String getDelyn(){
		return this.delyn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bns_itemcd = Util.checkString(cstmt.getString(4));
		this.bns_itemnm = Util.checkString(cstmt.getString(5));
		this.uprc = cstmt.getLong(6);
		this.mnftwon = Util.checkString(cstmt.getString(7));
		this.spec = Util.checkString(cstmt.getString(8));
		this.remk = Util.checkString(cstmt.getString(9));
		this.useclsf = Util.checkString(cstmt.getString(10));
		this.useyn = Util.checkString(cstmt.getString(11));
		this.delyn = Util.checkString(cstmt.getString(12));
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SL_S_BNSITEMUSECLSFCURRecord rec = new SL_S_BNSITEMUSECLSFCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.useclsfcur.add(rec);
		}
	}

	public String useclsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = useclsfcur.size();
		for(int i=0; i<size; i++){
			SL_S_BNSITEMUSECLSFCURRecord rec = (SL_S_BNSITEMUSECLSFCURRecord)useclsfcur.get(i);
			
			
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

	public String useclsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = useclsfcur.size();
		for(int i=0; i<size; i++){
			SL_S_BNSITEMUSECLSFCURRecord rec = (SL_S_BNSITEMUSECLSFCURRecord)useclsfcur.get(i);
			
			
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

	public String useclsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = useclsfcur.size();
		for(int i=0; i<size; i++){
			SL_S_BNSITEMUSECLSFCURRecord rec = (SL_S_BNSITEMUSECLSFCURRecord)useclsfcur.get(i);
			
			
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
	SL_S_BNSITEMDataSet ds = (SL_S_BNSITEMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.useclsfcur.size(); i++){
		SL_S_BNSITEMUSECLSFCURRecord useclsfcurRec = (SL_S_BNSITEMUSECLSFCURRecord)ds.useclsfcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBns_itemcd()%>
<%= ds.getBns_itemnm()%>
<%= ds.getUprc()%>
<%= ds.getMnftwon()%>
<%= ds.getSpec()%>
<%= ds.getRemk()%>
<%= ds.getUseclsf()%>
<%= ds.getUseyn()%>
<%= ds.getDelyn()%>
<%= ds.getUseclsfcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= useclsfcurRec.cicodeval%>
<%= useclsfcurRec.cicdnm%>
<%= useclsfcurRec.cicdynm%>
<%= useclsfcurRec.ciymgbcd%>
<%= useclsfcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 25 15:52:53 KST 2007 */