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


public class SS_L_MIGRMECDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList migrcrmmecdcur = new ArrayList();
	public ArrayList migrtmpmecdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_MIGRMECDDataSet(){}
	public SS_L_MIGRMECDDataSet(String errcode, String errmsg){
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
			SS_L_MIGRMECDMIGRTMPMECDCURRecord rec = new SS_L_MIGRMECDMIGRTMPMECDCURRecord();
			rec.sinmoon = Util.checkString(rset0.getString("sinmoon"));
			rec.af_code = Util.checkString(rset0.getString("af_code"));
			rec.yuga = Util.checkString(rset0.getString("yuga"));
			rec.jyuga = Util.checkString(rset0.getString("jyuga"));
			rec.muga = Util.checkString(rset0.getString("muga"));
			rec.etc = Util.checkString(rset0.getString("etc"));
			rec.total = Util.checkString(rset0.getString("total"));
			rec.jungji = Util.checkString(rset0.getString("jungji"));
			this.migrtmpmecdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SS_L_MIGRMECDMIGRCRMMECDCURRecord rec = new SS_L_MIGRMECDMIGRCRMMECDCURRecord();
			rec.sinmoon = Util.checkString(rset1.getString("sinmoon"));
			rec.af_code = Util.checkString(rset1.getString("af_code"));
			rec.yuga = Util.checkString(rset1.getString("yuga"));
			rec.jyuga = Util.checkString(rset1.getString("jyuga"));
			rec.muga = Util.checkString(rset1.getString("muga"));
			rec.total = Util.checkString(rset1.getString("total"));
			rec.jungji = Util.checkString(rset1.getString("jungji"));
			this.migrcrmmecdcur.add(rec);
		}
	}

	public String migrtmpmecdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrtmpmecdcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRMECDMIGRTMPMECDCURRecord rec = (SS_L_MIGRMECDMIGRTMPMECDCURRecord)migrtmpmecdcur.get(i);
			
			
			String code = rec.sinmoon;
			String name = rec.af_code;
			
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

	public String migrcrmmecdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrcrmmecdcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRMECDMIGRCRMMECDCURRecord rec = (SS_L_MIGRMECDMIGRCRMMECDCURRecord)migrcrmmecdcur.get(i);
			
			
			String code = rec.sinmoon;
			String name = rec.af_code;
			
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

	public String migrtmpmecdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrtmpmecdcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRMECDMIGRTMPMECDCURRecord rec = (SS_L_MIGRMECDMIGRTMPMECDCURRecord)migrtmpmecdcur.get(i);
			
			
			String code = rec.sinmoon;
			String name = rec.af_code;
			
			sb.append("<input name=\"");
			sb.append("sinmoon");
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

	public String migrcrmmecdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrcrmmecdcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRMECDMIGRCRMMECDCURRecord rec = (SS_L_MIGRMECDMIGRCRMMECDCURRecord)migrcrmmecdcur.get(i);
			
			
			String code = rec.sinmoon;
			String name = rec.af_code;
			
			sb.append("<input name=\"");
			sb.append("sinmoon");
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

	public String migrtmpmecdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrtmpmecdcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRMECDMIGRTMPMECDCURRecord rec = (SS_L_MIGRMECDMIGRTMPMECDCURRecord)migrtmpmecdcur.get(i);
			
			
			String code = rec.sinmoon;
			String name = rec.af_code;
			
			sb.append("<input name=\"");
			sb.append("sinmoon");
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

	public String migrcrmmecdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = migrcrmmecdcur.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRMECDMIGRCRMMECDCURRecord rec = (SS_L_MIGRMECDMIGRCRMMECDCURRecord)migrcrmmecdcur.get(i);
			
			
			String code = rec.sinmoon;
			String name = rec.af_code;
			
			sb.append("<input name=\"");
			sb.append("sinmoon");
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
	SS_L_MIGRMECDDataSet ds = (SS_L_MIGRMECDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.migrtmpmecdcur.size(); i++){
		SS_L_MIGRMECDMIGRTMPMECDCURRecord migrtmpmecdcurRec = (SS_L_MIGRMECDMIGRTMPMECDCURRecord)ds.migrtmpmecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.migrcrmmecdcur.size(); i++){
		SS_L_MIGRMECDMIGRCRMMECDCURRecord migrcrmmecdcurRec = (SS_L_MIGRMECDMIGRCRMMECDCURRecord)ds.migrcrmmecdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMigrtmpmecdcur()%>
<%= ds.getMigrcrmmecdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= migrtmpmecdcurRec.sinmoon%>
<%= migrtmpmecdcurRec.af_code%>
<%= migrtmpmecdcurRec.yuga%>
<%= migrtmpmecdcurRec.jyuga%>
<%= migrtmpmecdcurRec.muga%>
<%= migrtmpmecdcurRec.etc%>
<%= migrtmpmecdcurRec.total%>
<%= migrtmpmecdcurRec.jungji%>
<%= migrcrmmecdcurRec.sinmoon%>
<%= migrcrmmecdcurRec.af_code%>
<%= migrcrmmecdcurRec.yuga%>
<%= migrcrmmecdcurRec.jyuga%>
<%= migrcrmmecdcurRec.muga%>
<%= migrcrmmecdcurRec.total%>
<%= migrcrmmecdcurRec.jungji%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 24 15:35:34 KST 2004 */