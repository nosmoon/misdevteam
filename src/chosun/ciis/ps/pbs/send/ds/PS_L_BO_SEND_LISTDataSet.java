/***************************************************************************************************
 * 파일명 :PS_L_BO_SEND_LIST.java
 * 기능 : 지국별발송 목록
 * 작성일자 : 2007-06-21
 * 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 발송-지국별발송 목록
 */

public class PS_L_BO_SEND_LISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String medinm;
	public long totalcnt;

	public PS_L_BO_SEND_LISTDataSet(){}
	public PS_L_BO_SEND_LISTDataSet(String errcode, String errmsg, String medinm, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medinm = medinm;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.medinm = Util.checkString(cstmt.getString(13));
		this.totalcnt = cstmt.getLong(14);
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			PS_L_BO_SEND_LISTCURCOMMLISTRecord rec = new PS_L_BO_SEND_LISTCURCOMMLISTRecord();
			rec.hbiscnm = Util.checkString(rset0.getString("hbiscnm"));
			rec.bhnscd = Util.checkString(rset0.getString("bhnscd"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.mediser_no = Util.checkString(rset0.getString("mediser_no"));
			rec.sendqty = rset0.getInt("sendqty");
			rec.sendresvqty = rset0.getInt("sendresvqty");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BO_SEND_LISTCURCOMMLISTRecord rec = (PS_L_BO_SEND_LISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.hbiscnm;
			String name = rec.bhnscd;
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BO_SEND_LISTCURCOMMLISTRecord rec = (PS_L_BO_SEND_LISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.hbiscnm;
			String name = rec.bhnscd;
			
			sb.append("<input name=\"");
			sb.append("hbiscnm");
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BO_SEND_LISTCURCOMMLISTRecord rec = (PS_L_BO_SEND_LISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.hbiscnm;
			String name = rec.bhnscd;
			
			sb.append("<input name=\"");
			sb.append("hbiscnm");
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
	PS_L_BO_SEND_LISTDataSet ds = (PS_L_BO_SEND_LISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_BO_SEND_LISTCURCOMMLISTRecord curcommlistRec = (PS_L_BO_SEND_LISTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedinm()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.hbiscnm%>
<%= curcommlistRec.bhnscd%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.mediser_no%>
<%= curcommlistRec.sendqty%>
<%= curcommlistRec.sendresvqty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 21 13:56:16 KST 2007 */