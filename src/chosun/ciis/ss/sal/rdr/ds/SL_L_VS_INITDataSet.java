/***************************************************************************************************
* 파일명 : SL_L_VS_INITDataSet.java
* 기능 : VacationStop관리-초기화면
* 작성일자 : 2004-06-10
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
 * VacationStop관리-초기화면
 *
 */

public class SL_L_VS_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList clsfcur = new ArrayList();
	public ArrayList medicur = new ArrayList();
	public ArrayList vaca_arearegncur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_VS_INITDataSet(){}
	public SL_L_VS_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SL_L_VS_INITCLSFCURRecord rec = new SL_L_VS_INITCLSFCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.clsfcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SL_L_VS_INITVACA_AREAREGNCURRecord rec = new SL_L_VS_INITVACA_AREAREGNCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.vaca_arearegncur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			SL_L_VS_INITMEDICURRecord rec = new SL_L_VS_INITMEDICURRecord();
			rec.medicd = Util.checkString(rset2.getString("medicd"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cimgtcd2 = Util.checkString(rset2.getString("cimgtcd2"));
			rec.subsuprc = rset2.getInt("subsuprc");
			this.medicur.add(rec);
		}
	}

	public String clsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clsfcur.size();
		for(int i=0; i<size; i++){
			SL_L_VS_INITCLSFCURRecord rec = (SL_L_VS_INITCLSFCURRecord)clsfcur.get(i);
			
			
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

	public String vaca_arearegncurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vaca_arearegncur.size();
		for(int i=0; i<size; i++){
			SL_L_VS_INITVACA_AREAREGNCURRecord rec = (SL_L_VS_INITVACA_AREAREGNCURRecord)vaca_arearegncur.get(i);
			
			
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

	public String medicurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_L_VS_INITMEDICURRecord rec = (SL_L_VS_INITMEDICURRecord)medicur.get(i);
			
			
			String code = rec.medicd;
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

	public String clsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clsfcur.size();
		for(int i=0; i<size; i++){
			SL_L_VS_INITCLSFCURRecord rec = (SL_L_VS_INITCLSFCURRecord)clsfcur.get(i);
			
			
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

	public String vaca_arearegncurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vaca_arearegncur.size();
		for(int i=0; i<size; i++){
			SL_L_VS_INITVACA_AREAREGNCURRecord rec = (SL_L_VS_INITVACA_AREAREGNCURRecord)vaca_arearegncur.get(i);
			
			
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

	public String medicurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_L_VS_INITMEDICURRecord rec = (SL_L_VS_INITMEDICURRecord)medicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.cicdnm;
			
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

	public String clsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clsfcur.size();
		for(int i=0; i<size; i++){
			SL_L_VS_INITCLSFCURRecord rec = (SL_L_VS_INITCLSFCURRecord)clsfcur.get(i);
			
			
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

	public String vaca_arearegncurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vaca_arearegncur.size();
		for(int i=0; i<size; i++){
			SL_L_VS_INITVACA_AREAREGNCURRecord rec = (SL_L_VS_INITVACA_AREAREGNCURRecord)vaca_arearegncur.get(i);
			
			
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

	public String medicurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_L_VS_INITMEDICURRecord rec = (SL_L_VS_INITMEDICURRecord)medicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.cicdnm;
			
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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_L_VS_INITDataSet ds = (SL_L_VS_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.clsfcur.size(); i++){
		SL_L_VS_INITCLSFCURRecord clsfcurRec = (SL_L_VS_INITCLSFCURRecord)ds.clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.vaca_arearegncur.size(); i++){
		SL_L_VS_INITVACA_AREAREGNCURRecord vaca_arearegncurRec = (SL_L_VS_INITVACA_AREAREGNCURRecord)ds.vaca_arearegncur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicur.size(); i++){
		SL_L_VS_INITMEDICURRecord medicurRec = (SL_L_VS_INITMEDICURRecord)ds.medicur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClsfcur()%>
<%= ds.getVaca_arearegncur()%>
<%= ds.getMedicur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= clsfcurRec.cicodeval%>
<%= clsfcurRec.cicdnm%>
<%= clsfcurRec.cicdynm%>
<%= clsfcurRec.ciymgbcd%>
<%= clsfcurRec.cicdgb%>
<%= vaca_arearegncurRec.cicodeval%>
<%= vaca_arearegncurRec.cicdnm%>
<%= vaca_arearegncurRec.cicdynm%>
<%= vaca_arearegncurRec.ciymgbcd%>
<%= vaca_arearegncurRec.cicdgb%>
<%= medicurRec.medicd%>
<%= medicurRec.cicdnm%>
<%= medicurRec.cimgtcd2%>
<%= medicurRec.subsuprc%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 10 21:15:30 KST 2004 */