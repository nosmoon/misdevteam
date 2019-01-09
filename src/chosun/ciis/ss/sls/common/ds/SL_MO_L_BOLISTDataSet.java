/***************************************************************************************************
* 파일명 : SL_MO_L_BOLISTDataSet.java
* 기능 : 공통코드-센터리스트
* 작성일자 : 2016-12-14
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.rec.*;

/**
 *
 */


public class SL_MO_L_BOLISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bolistcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_MO_L_BOLISTDataSet(){}
	public SL_MO_L_BOLISTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SL_MO_L_BOLISTBOLISTCURRecord rec = new SL_MO_L_BOLISTBOLISTCURRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.tel_no11 = Util.checkString(rset0.getString("tel_no11"));
			rec.tel_no12 = Util.checkString(rset0.getString("tel_no12"));
			rec.tel_no13 = Util.checkString(rset0.getString("tel_no13"));
			rec.fax1 = Util.checkString(rset0.getString("fax1"));
			rec.fax2 = Util.checkString(rset0.getString("fax2"));
			rec.fax3 = Util.checkString(rset0.getString("fax3"));
			rec.bo_headnm = Util.checkString(rset0.getString("bo_headnm"));
			rec.htel_no1 = Util.checkString(rset0.getString("htel_no1"));
			rec.htel_no2 = Util.checkString(rset0.getString("htel_no2"));
			rec.htel_no3 = Util.checkString(rset0.getString("htel_no3"));
			rec.hptph_no1 = Util.checkString(rset0.getString("hptph_no1"));
			rec.hptph_no2 = Util.checkString(rset0.getString("hptph_no2"));
			rec.hptph_no3 = Util.checkString(rset0.getString("hptph_no3"));
			rec.hemail = Util.checkString(rset0.getString("hemail"));
			rec.boaddr = Util.checkString(rset0.getString("boaddr"));
			rec.bodtlsaddr = Util.checkString(rset0.getString("bodtlsaddr"));
			rec.hboaddr = Util.checkString(rset0.getString("hboaddr"));
			rec.hbodtlsaddr = Util.checkString(rset0.getString("hbodtlsaddr"));
			this.bolistcur.add(rec);
		}
	}

	public String bolistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bolistcur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_BOLISTBOLISTCURRecord rec = (SL_MO_L_BOLISTBOLISTCURRecord)bolistcur.get(i);


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

	public String bolistcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bolistcur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_BOLISTBOLISTCURRecord rec = (SL_MO_L_BOLISTBOLISTCURRecord)bolistcur.get(i);


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

	public String bolistcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bolistcur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_BOLISTBOLISTCURRecord rec = (SL_MO_L_BOLISTBOLISTCURRecord)bolistcur.get(i);


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
	SL_MO_L_BOLISTDataSet ds = (SL_MO_L_BOLISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bolistcur.size(); i++){
		SL_MO_L_BOLISTBOLISTCURRecord bolistcurRec = (SL_MO_L_BOLISTBOLISTCURRecord)ds.bolistcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBolistcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bolistcurRec.bocd%>
<%= bolistcurRec.bonm%>
<%= bolistcurRec.deptcd%>
<%= bolistcurRec.deptnm%>
<%= bolistcurRec.areacd%>
<%= bolistcurRec.areanm%>
<%= bolistcurRec.tel_no11%>
<%= bolistcurRec.tel_no12%>
<%= bolistcurRec.tel_no13%>
<%= bolistcurRec.fax1%>
<%= bolistcurRec.fax2%>
<%= bolistcurRec.fax3%>
<%= bolistcurRec.bo_headnm%>
<%= bolistcurRec.htel_no1%>
<%= bolistcurRec.htel_no2%>
<%= bolistcurRec.htel_no3%>
<%= bolistcurRec.hptph_no1%>
<%= bolistcurRec.hptph_no2%>
<%= bolistcurRec.hptph_no3%>
<%= bolistcurRec.hemail%>
<%= bolistcurRec.boaddr%>
<%= bolistcurRec.bodtlsaddr%>
<%= bolistcurRec.hboaddr%>
<%= bolistcurRec.hbodtlsaddr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 15 14:11:17 KST 2016 */