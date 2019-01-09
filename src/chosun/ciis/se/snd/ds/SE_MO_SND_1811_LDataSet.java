/***************************************************************************************************
* 파일명 : SE_MO_SND_1811_LDataSet.java
* 기능 : 판매 - 발송관리-노선관리-노선조회_모바일용
 * 작성일자 : 2017-01-07
 * 작성자 :   장선희
***************************************************************************************************
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 *
 */


public class SE_MO_SND_1811_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_MO_SND_1811_LDataSet(){}
	public SE_MO_SND_1811_LDataSet(String errcode, String errmsg){
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
			SE_MO_SND_1811_LCURLISTRecord rec = new SE_MO_SND_1811_LCURLISTRecord();
			rec.route_cd = Util.checkString(rset0.getString("route_cd"));
			rec.route_nm = Util.checkString(rset0.getString("route_nm"));
			rec.plac_nm = Util.checkString(rset0.getString("plac_nm"));
			rec.send_rank = Util.checkString(rset0.getString("send_rank"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.route_seq = Util.checkString(rset0.getString("route_seq"));
			this.curlist.add(rec);
		}
	}

	public String curlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist.size();
		for(int i=0; i<size; i++){
			SE_MO_SND_1811_LCURLISTRecord rec = (SE_MO_SND_1811_LCURLISTRecord)curlist.get(i);


			String code = rec.route_cd;
			String name = rec.route_nm;

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

	public String curlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist.size();
		for(int i=0; i<size; i++){
			SE_MO_SND_1811_LCURLISTRecord rec = (SE_MO_SND_1811_LCURLISTRecord)curlist.get(i);


			String code = rec.route_cd;
			String name = rec.route_nm;

			sb.append("<input name=\"");
			sb.append("route_cd");
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

	public String curlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist.size();
		for(int i=0; i<size; i++){
			SE_MO_SND_1811_LCURLISTRecord rec = (SE_MO_SND_1811_LCURLISTRecord)curlist.get(i);


			String code = rec.route_cd;
			String name = rec.route_nm;

			sb.append("<input name=\"");
			sb.append("route_cd");
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
	SE_MO_SND_1811_LDataSet ds = (SE_MO_SND_1811_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_MO_SND_1811_LCURLISTRecord curlistRec = (SE_MO_SND_1811_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.route_cd%>
<%= curlistRec.route_nm%>
<%= curlistRec.plac_nm%>
<%= curlistRec.send_rank%>
<%= curlistRec.addr%>
<%= curlistRec.route_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 09 10:25:36 KST 2017 */