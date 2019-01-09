/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-입주아파트현황-입주아파트 엑셀저장
* 작성일자 : 2009-04-03
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * /지국경영-입주아파트현황-입주아파트 엑셀저장
 */

public class SL_L_MOVEIN_APT_PRINTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curaptlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_MOVEIN_APT_PRINTDataSet(){}
	public SL_L_MOVEIN_APT_PRINTDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SL_L_MOVEIN_APT_PRINTCURAPTLISTRecord rec = new SL_L_MOVEIN_APT_PRINTCURAPTLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.dongno = Util.checkString(rset0.getString("dongno"));
			rec.florcnt = Util.checkString(rset0.getString("florcnt"));
			rec.flor_houscnt = Util.checkString(rset0.getString("flor_houscnt"));
			rec.hoscnt = Util.checkString(rset0.getString("hoscnt"));
			rec.pyong = Util.checkString(rset0.getString("pyong"));
			rec.stairyn = Util.checkString(rset0.getString("stairyn"));
			rec.under_exne = Util.checkString(rset0.getString("under_exne"));
			rec.addrnm = Util.checkString(rset0.getString("addrnm"));
			rec.mvindt = Util.checkString(rset0.getString("mvindt"));
			rec.mvinexpdt = Util.checkString(rset0.getString("mvinexpdt"));
			rec.mvinaptyn = Util.checkString(rset0.getString("mvinaptyn"));
			this.curaptlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(11);
	}

	public String curaptlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaptlist.size();
		for(int i=0; i<size; i++){
			SL_L_MOVEIN_APT_PRINTCURAPTLISTRecord rec = (SL_L_MOVEIN_APT_PRINTCURAPTLISTRecord)curaptlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.areanm;
			
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

	public String curaptlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaptlist.size();
		for(int i=0; i<size; i++){
			SL_L_MOVEIN_APT_PRINTCURAPTLISTRecord rec = (SL_L_MOVEIN_APT_PRINTCURAPTLISTRecord)curaptlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("deptnm");
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

	public String curaptlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaptlist.size();
		for(int i=0; i<size; i++){
			SL_L_MOVEIN_APT_PRINTCURAPTLISTRecord rec = (SL_L_MOVEIN_APT_PRINTCURAPTLISTRecord)curaptlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("deptnm");
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
	SL_L_MOVEIN_APT_PRINTDataSet ds = (SL_L_MOVEIN_APT_PRINTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curaptlist.size(); i++){
		SL_L_MOVEIN_APT_PRINTCURAPTLISTRecord curaptlistRec = (SL_L_MOVEIN_APT_PRINTCURAPTLISTRecord)ds.curaptlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCuraptlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curaptlistRec.deptnm%>
<%= curaptlistRec.areanm%>
<%= curaptlistRec.bonm%>
<%= curaptlistRec.bocd%>
<%= curaptlistRec.dongno%>
<%= curaptlistRec.florcnt%>
<%= curaptlistRec.flor_houscnt%>
<%= curaptlistRec.hoscnt%>
<%= curaptlistRec.pyong%>
<%= curaptlistRec.stairyn%>
<%= curaptlistRec.under_exne%>
<%= curaptlistRec.addrnm%>
<%= curaptlistRec.mvindt%>
<%= curaptlistRec.mvinexpdt%>
<%= curaptlistRec.mvinaptyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 15:01:53 KST 2009 */