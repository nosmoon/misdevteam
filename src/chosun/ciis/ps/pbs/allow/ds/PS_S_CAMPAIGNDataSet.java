/***************************************************************************************************
* 파일명 : SP_PS_S_CAMPAIGN.java
* 수당-캠페인관리 캠페인 상세조회
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * 수당-캠페인관리 캠페인 상세조회
 *
 */ 

  

public class PS_S_CAMPAIGNDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList asinbocdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String cmpycd;
	public String bocd;
	public String bonm;
	public String campseq;
	public String campnm;
	public String bgncampdt;
	public String endcampdt;
	public String cont;

	public PS_S_CAMPAIGNDataSet(){}
	public PS_S_CAMPAIGNDataSet(String errcode, String errmsg, String cmpycd, String bocd, String bonm, String campseq, String campnm, String bgncampdt, String endcampdt, String cont){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.bonm = bonm;
		this.campseq = campseq;
		this.campnm = campnm;
		this.bgncampdt = bgncampdt;
		this.endcampdt = endcampdt;
		this.cont = cont;
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

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setCampseq(String campseq){
		this.campseq = campseq;
	}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public void setBgncampdt(String bgncampdt){
		this.bgncampdt = bgncampdt;
	}

	public void setEndcampdt(String endcampdt){
		this.endcampdt = endcampdt;
	}

	public void setCont(String cont){
		this.cont = cont;
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

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getCampseq(){
		return this.campseq;
	}

	public String getCampnm(){
		return this.campnm;
	}

	public String getBgncampdt(){
		return this.bgncampdt;
	}

	public String getEndcampdt(){
		return this.endcampdt;
	}

	public String getCont(){
		return this.cont;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.cmpycd = Util.checkString(cstmt.getString(7));
		this.bocd = Util.checkString(cstmt.getString(8));
		this.bonm = Util.checkString(cstmt.getString(9));
		this.campseq = Util.checkString(cstmt.getString(10));
		this.campnm = Util.checkString(cstmt.getString(11));
		this.bgncampdt = Util.checkString(cstmt.getString(12));
		this.endcampdt = Util.checkString(cstmt.getString(13));
		this.cont = Util.checkString(cstmt.getString(14));
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			PS_S_CAMPAIGNASINBOCDCURRecord rec = new PS_S_CAMPAIGNASINBOCDCURRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset0.getString("sellnetclsf"));
			this.asinbocdcur.add(rec);
		}
	}

	public String asinbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_CAMPAIGNASINBOCDCURRecord rec = (PS_S_CAMPAIGNASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String asinbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_CAMPAIGNASINBOCDCURRecord rec = (PS_S_CAMPAIGNASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String asinbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_CAMPAIGNASINBOCDCURRecord rec = (PS_S_CAMPAIGNASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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
	PS_S_CAMPAIGNDataSet ds = (PS_S_CAMPAIGNDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.asinbocdcur.size(); i++){
		PS_S_CAMPAIGNASINBOCDCURRecord asinbocdcurRec = (PS_S_CAMPAIGNASINBOCDCURRecord)ds.asinbocdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCmpycd()%>
<%= ds.getBocd()%>
<%= ds.getBonm()%>
<%= ds.getCampseq()%>
<%= ds.getCampnm()%>
<%= ds.getBgncampdt()%>
<%= ds.getEndcampdt()%>
<%= ds.getCont()%>
<%= ds.getAsinbocdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= asinbocdcurRec.bocd%>
<%= asinbocdcurRec.bonm%>
<%= asinbocdcurRec.deptcd%>
<%= asinbocdcurRec.sellnetclsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 11 17:44:24 KST 2004 */