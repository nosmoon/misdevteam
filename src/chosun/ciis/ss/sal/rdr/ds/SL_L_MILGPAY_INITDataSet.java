/***************************************************************************************************
* 파일명 : SL_L_MILGPAY_INITDataSet.java
* 기능 : 독자정보관리(마일리지지급내역팝업-초기화면)
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
 * 독자정보관리(마일리지지급내역팝업-초기화면)
 *
 */

public class SL_L_MILGPAY_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList basicur = new ArrayList();
	public ArrayList paybasicur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_MILGPAY_INITDataSet(){}
	public SL_L_MILGPAY_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			SL_L_MILGPAY_INITBASICURRecord rec = new SL_L_MILGPAY_INITBASICURRecord();
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.paybasicd = Util.checkString(rset0.getString("paybasicd"));
			rec.paybasinm = Util.checkString(rset0.getString("paybasinm"));
			this.basicur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SL_L_MILGPAY_INITPAYBASICURRecord rec = new SL_L_MILGPAY_INITPAYBASICURRecord();
			rec.cmpycd = Util.checkString(rset1.getString("cmpycd"));
			rec.cmpynm = Util.checkString(rset1.getString("cmpynm"));
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.medinm = Util.checkString(rset1.getString("medinm"));
			rec.payclsfcd = Util.checkString(rset1.getString("payclsfcd"));
			rec.payclsfnm = Util.checkString(rset1.getString("payclsfnm"));
			rec.paybasicd = Util.checkString(rset1.getString("paybasicd"));
			rec.paybasinm = Util.checkString(rset1.getString("paybasinm"));
			rec.pontcalcclsfcd = Util.checkString(rset1.getString("pontcalcclsfcd"));
			rec.pont = rset1.getInt("pont");
			rec.pontrate = rset1.getInt("pontrate");
			rec.hdqtallmratio = rset1.getInt("hdqtallmratio");
			rec.boallmratio = rset1.getInt("boallmratio");
			rec.adjmexchrate = rset1.getInt("adjmexchrate");
			this.paybasicur.add(rec);
		}
	}

	public String basicurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = basicur.size();
		for(int i=0; i<size; i++){
			SL_L_MILGPAY_INITBASICURRecord rec = (SL_L_MILGPAY_INITBASICURRecord)basicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
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

	public String paybasicurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paybasicur.size();
		for(int i=0; i<size; i++){
			SL_L_MILGPAY_INITPAYBASICURRecord rec = (SL_L_MILGPAY_INITPAYBASICURRecord)paybasicur.get(i);
			
			
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

	public String basicurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = basicur.size();
		for(int i=0; i<size; i++){
			SL_L_MILGPAY_INITBASICURRecord rec = (SL_L_MILGPAY_INITBASICURRecord)basicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String paybasicurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paybasicur.size();
		for(int i=0; i<size; i++){
			SL_L_MILGPAY_INITPAYBASICURRecord rec = (SL_L_MILGPAY_INITPAYBASICURRecord)paybasicur.get(i);
			
			
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

	public String basicurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = basicur.size();
		for(int i=0; i<size; i++){
			SL_L_MILGPAY_INITBASICURRecord rec = (SL_L_MILGPAY_INITBASICURRecord)basicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String paybasicurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paybasicur.size();
		for(int i=0; i<size; i++){
			SL_L_MILGPAY_INITPAYBASICURRecord rec = (SL_L_MILGPAY_INITPAYBASICURRecord)paybasicur.get(i);
			
			
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
	SL_L_MILGPAY_INITDataSet ds = (SL_L_MILGPAY_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.basicur.size(); i++){
		SL_L_MILGPAY_INITBASICURRecord basicurRec = (SL_L_MILGPAY_INITBASICURRecord)ds.basicur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.paybasicur.size(); i++){
		SL_L_MILGPAY_INITPAYBASICURRecord paybasicurRec = (SL_L_MILGPAY_INITPAYBASICURRecord)ds.paybasicur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBasicur()%>
<%= ds.getPaybasicur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= basicurRec.medicd%>
<%= basicurRec.medinm%>
<%= basicurRec.paybasicd%>
<%= basicurRec.paybasinm%>
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


/* 작성시간 : Sun Jun 06 20:37:01 KST 2004 */