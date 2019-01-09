/***************************************************************************************************
* 파일명 : SS_L_RDR_XTN_EMPCAMP_INITDataSet.java
* 기능 : 사원확장대회 초기화를 위한 DataSet
* 작성일자 : 2003-11-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * class definition
 *
 */


public class SS_L_RDR_XTN_EMPCAMP_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmedicd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_XTN_EMPCAMP_INITDataSet(){}
	public SS_L_RDR_XTN_EMPCAMP_INITDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){	return;	}
		ResultSet rset1 = (ResultSet) cstmt.getObject(3);
		while(rset1.next()){
			SS_L_RDR_XTN_EMPCAMP_INITCURMEDICDRecord rec = new SS_L_RDR_XTN_EMPCAMP_INITCURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
	}

	public String curmedicdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_XTN_EMPCAMP_INITCURMEDICDRecord rec = (SS_L_RDR_XTN_EMPCAMP_INITCURMEDICDRecord)curmedicd.get(i);


			String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<option value=");
			sb.append(code);
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String curmedicdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_XTN_EMPCAMP_INITCURMEDICDRecord rec = (SS_L_RDR_XTN_EMPCAMP_INITCURMEDICDRecord)curmedicd.get(i);


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

	public String curmedicdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_XTN_EMPCAMP_INITCURMEDICDRecord rec = (SS_L_RDR_XTN_EMPCAMP_INITCURMEDICDRecord)curmedicd.get(i);


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
	SS_L_RDR_XTN_EMPCAMP_INITDataSet ds = (SS_L_RDR_XTN_EMPCAMP_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_L_RDR_XTN_EMPCAMP_INITCURMEDICDRecord curmedicdRec = (SS_L_RDR_XTN_EMPCAMP_INITCURMEDICDRecord)ds.curmedicd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurmedicd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curmedicdRec.cicodeval%>
<%= curmedicdRec.cicdnm%>
<%= curmedicdRec.ciymgbcd%>
<%= curmedicdRec.cicdgb%>
<%= curmedicdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 10 16:54:08 KST 2003 */
