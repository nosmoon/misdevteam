/***************************************************************************************************
* 파일명	: 
* 기능		: 
* 작성일자	: 2004-01-13
* 작성자	: 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	:
* 수정자	:
* 수정일자	:
* 백업		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 *
 *
 */


public class SS_L_MIGRGUYUKDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList migrcrmguyukcur = new ArrayList();
	public ArrayList migrtmpguyukcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_MIGRGUYUKDataSet(){}
	public SS_L_MIGRGUYUKDataSet(String errcode, String errmsg){
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
			SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord rec = new SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord();
			rec.guyuk = Util.checkString(rset0.getString("guyuk"));
			rec.yuga = Util.checkString(rset0.getString("yuga"));
			rec.jyuga = Util.checkString(rset0.getString("jyuga"));
			rec.muga = Util.checkString(rset0.getString("muga"));
			rec.etc = Util.checkString(rset0.getString("etc"));
			rec.total = Util.checkString(rset0.getString("total"));
			rec.jungji = Util.checkString(rset0.getString("jungji"));
			this.migrtmpguyukcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord rec = new SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord();
			rec.guyuk = Util.checkString(rset1.getString("guyuk"));
			rec.yuga = Util.checkString(rset1.getString("yuga"));
			rec.jyuga = Util.checkString(rset1.getString("jyuga"));
			rec.muga = Util.checkString(rset1.getString("muga"));
			rec.total = Util.checkString(rset1.getString("total"));
			rec.jungji = Util.checkString(rset1.getString("jungji"));
			this.migrcrmguyukcur.add(rec);
		}
	}

	public String migrtmpguyukcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrtmpguyukcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord rec = (SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord)migrtmpguyukcur.get(i);
			
			
			String code = rec.guyuk;
			String name = rec.yuga;
			
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

	public String migrcrmguyukcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrcrmguyukcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord rec = (SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord)migrcrmguyukcur.get(i);
			
			
			String code = rec.guyuk;
			String name = rec.yuga;
			
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

	public String migrtmpguyukcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrtmpguyukcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord rec = (SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord)migrtmpguyukcur.get(i);
			
			
			String code = rec.guyuk;
			String name = rec.yuga;
			
			sb.append("<input name=\"");
			sb.append("guyuk");
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

	public String migrcrmguyukcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrcrmguyukcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord rec = (SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord)migrcrmguyukcur.get(i);
			
			
			String code = rec.guyuk;
			String name = rec.yuga;
			
			sb.append("<input name=\"");
			sb.append("guyuk");
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

	public String migrtmpguyukcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrtmpguyukcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord rec = (SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord)migrtmpguyukcur.get(i);
			
			
			String code = rec.guyuk;
			String name = rec.yuga;
			
			sb.append("<input name=\"");
			sb.append("guyuk");
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

	public String migrcrmguyukcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrcrmguyukcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord rec = (SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord)migrcrmguyukcur.get(i);
			
			
			String code = rec.guyuk;
			String name = rec.yuga;
			
			sb.append("<input name=\"");
			sb.append("guyuk");
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
	SS_L_MIGRGUYUKDataSet ds = (SS_L_MIGRGUYUKDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.migrtmpguyukcur.size(); i++){
		SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord migrtmpguyukcurRec = (SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord)ds.migrtmpguyukcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.migrcrmguyukcur.size(); i++){
		SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord migrcrmguyukcurRec = (SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord)ds.migrcrmguyukcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMigrtmpguyukcur()%>
<%= ds.getMigrcrmguyukcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= migrtmpguyukcurRec.guyuk%>
<%= migrtmpguyukcurRec.yuga%>
<%= migrtmpguyukcurRec.jyuga%>
<%= migrtmpguyukcurRec.muga%>
<%= migrtmpguyukcurRec.etc%>
<%= migrtmpguyukcurRec.total%>
<%= migrtmpguyukcurRec.jungji%>
<%= migrcrmguyukcurRec.guyuk%>
<%= migrcrmguyukcurRec.yuga%>
<%= migrcrmguyukcurRec.jyuga%>
<%= migrcrmguyukcurRec.muga%>
<%= migrcrmguyukcurRec.total%>
<%= migrcrmguyukcurRec.jungji%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 01 11:19:34 KST 2004 */