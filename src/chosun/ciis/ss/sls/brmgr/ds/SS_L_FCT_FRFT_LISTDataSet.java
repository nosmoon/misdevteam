/***************************************************************************************************
* 파일명 : SS_L_FCT_FRFT_LISTDataSet.java
* 기능 : 지국경영-공정위위약금-목록을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국경영-공정위위약금-목록을 위한 DataSet
 */

public class SS_L_FCT_FRFT_LISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long frftimpnamt_total;
	public long hdqtrcpmamt_total;
	public long hdqtun_pymtamt_total;
	public long borcpmamt_total;
	public long boun_pymtamt_total;
	public long resamt_total;

	public SS_L_FCT_FRFT_LISTDataSet(){}
	public SS_L_FCT_FRFT_LISTDataSet(String errcode, String errmsg, long totalcnt, long frftimpnamt_total, long hdqtrcpmamt_total, long hdqtun_pymtamt_total, long borcpmamt_total, long boun_pymtamt_total, long resamt_total){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.frftimpnamt_total = frftimpnamt_total;
		this.hdqtrcpmamt_total = hdqtrcpmamt_total;
		this.hdqtun_pymtamt_total = hdqtun_pymtamt_total;
		this.borcpmamt_total = borcpmamt_total;
		this.boun_pymtamt_total = boun_pymtamt_total;
		this.resamt_total = resamt_total;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public void setFrftimpnamt_total(long frftimpnamt_total){
		this.frftimpnamt_total = frftimpnamt_total;
	}

	public void setHdqtrcpmamt_total(long hdqtrcpmamt_total){
		this.hdqtrcpmamt_total = hdqtrcpmamt_total;
	}

	public void setHdqtun_pymtamt_total(long hdqtun_pymtamt_total){
		this.hdqtun_pymtamt_total = hdqtun_pymtamt_total;
	}

	public void setBorcpmamt_total(long borcpmamt_total){
		this.borcpmamt_total = borcpmamt_total;
	}

	public void setBoun_pymtamt_total(long boun_pymtamt_total){
		this.boun_pymtamt_total = boun_pymtamt_total;
	}

	public void setResamt_total(long resamt_total){
		this.resamt_total = resamt_total;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public long getFrftimpnamt_total(){
		return this.frftimpnamt_total;
	}

	public long getHdqtrcpmamt_total(){
		return this.hdqtrcpmamt_total;
	}

	public long getHdqtun_pymtamt_total(){
		return this.hdqtun_pymtamt_total;
	}

	public long getBorcpmamt_total(){
		return this.borcpmamt_total;
	}

	public long getBoun_pymtamt_total(){
		return this.boun_pymtamt_total;
	}

	public long getResamt_total(){
		return this.resamt_total;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_L_FCT_FRFT_LISTCURCOMMLISTRecord rec = new SS_L_FCT_FRFT_LISTCURCOMMLISTRecord();
			rec.impndt = Util.checkString(rset0.getString("impndt"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.viltresn = Util.checkString(rset0.getString("viltresn"));
			rec.viltresnnm = Util.checkString(rset0.getString("viltresnnm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.delbocomnm = Util.checkString(rset0.getString("delbocomnm"));
			rec.frftimpnamt = rset0.getInt("frftimpnamt");
			rec.hdqtrcpmamt = rset0.getInt("hdqtrcpmamt");
			rec.hdqtrcpmdt = Util.checkString(rset0.getString("hdqtrcpmdt"));
			rec.hdqtun_pymtamt = rset0.getInt("hdqtun_pymtamt");
			rec.borcpmamt = rset0.getInt("borcpmamt");
			rec.borcpmdt = Util.checkString(rset0.getString("borcpmdt"));
			rec.boun_pymtamt = rset0.getInt("boun_pymtamt");
			rec.resamt = rset0.getInt("resamt");
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(14);
		this.frftimpnamt_total = cstmt.getLong(15);
		this.hdqtrcpmamt_total = cstmt.getLong(16);
		this.hdqtun_pymtamt_total = cstmt.getLong(17);
		this.borcpmamt_total = cstmt.getLong(18);
		this.boun_pymtamt_total = cstmt.getLong(19);
		this.resamt_total = cstmt.getLong(20);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_FCT_FRFT_LISTCURCOMMLISTRecord rec = (SS_L_FCT_FRFT_LISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.impndt;
			String name = rec.deptcd;
			
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
			SS_L_FCT_FRFT_LISTCURCOMMLISTRecord rec = (SS_L_FCT_FRFT_LISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.impndt;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("impndt");
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
			SS_L_FCT_FRFT_LISTCURCOMMLISTRecord rec = (SS_L_FCT_FRFT_LISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.impndt;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("impndt");
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
	SS_L_FCT_FRFT_LISTDataSet ds = (SS_L_FCT_FRFT_LISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_FCT_FRFT_LISTCURCOMMLISTRecord curcommlistRec = (SS_L_FCT_FRFT_LISTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getFrftimpnamt_total()%>
<%= ds.getHdqtrcpmamt_total()%>
<%= ds.getHdqtun_pymtamt_total()%>
<%= ds.getBorcpmamt_total()%>
<%= ds.getBoun_pymtamt_total()%>
<%= ds.getResamt_total()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.impndt%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.viltresn%>
<%= curcommlistRec.viltresnnm%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.delbocomnm%>
<%= curcommlistRec.frftimpnamt%>
<%= curcommlistRec.hdqtrcpmamt%>
<%= curcommlistRec.hdqtrcpmdt%>
<%= curcommlistRec.hdqtun_pymtamt%>
<%= curcommlistRec.borcpmamt%>
<%= curcommlistRec.borcpmdt%>
<%= curcommlistRec.boun_pymtamt%>
<%= curcommlistRec.resamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 22 17:02:29 KST 2004 */