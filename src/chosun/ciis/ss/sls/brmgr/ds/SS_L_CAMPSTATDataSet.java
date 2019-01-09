/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-구독유지-상세
* 작성일자 : 2009-04-25
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국경영-구독유지-상세
 */

public class SS_L_CAMPSTATDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList camp_stat = new ArrayList();
	public String errcode;
	public String errmsg;
	public long cnfmstatcd_00_tot;
	public long cnfmstatcd_10_tot;
	public long totalcnt;

	public SS_L_CAMPSTATDataSet(){}
	public SS_L_CAMPSTATDataSet(String errcode, String errmsg, long cnfmstatcd_00_tot, long cnfmstatcd_10_tot, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cnfmstatcd_00_tot = cnfmstatcd_00_tot;
		this.cnfmstatcd_10_tot = cnfmstatcd_10_tot;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCnfmstatcd_00_tot(long cnfmstatcd_00_tot){
		this.cnfmstatcd_00_tot = cnfmstatcd_00_tot;
	}

	public void setCnfmstatcd_10_tot(long cnfmstatcd_10_tot){
		this.cnfmstatcd_10_tot = cnfmstatcd_10_tot;
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

	public long getCnfmstatcd_00_tot(){
		return this.cnfmstatcd_00_tot;
	}

	public long getCnfmstatcd_10_tot(){
		return this.cnfmstatcd_10_tot;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.cnfmstatcd_00_tot = cstmt.getLong(11);
		this.cnfmstatcd_10_tot = cstmt.getLong(12);
		this.totalcnt = cstmt.getLong(13);
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_L_CAMPSTATCAMP_STATRecord rec = new SS_L_CAMPSTATCAMP_STATRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.boinsdseq = Util.checkString(rset0.getString("boinsdseq"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.cnfmstatcd_00 = rset0.getInt("cnfmstatcd_00");
			rec.cnfmstatcd_10 = rset0.getInt("cnfmstatcd_10");
			rec.cnfmocomcd_10 = rset0.getInt("cnfmocomcd_10");
			rec.cnfmocomcd_20 = rset0.getInt("cnfmocomcd_20");
			rec.cnfmocomcd_30 = rset0.getInt("cnfmocomcd_30");
			rec.cnfmocomcd_40 = rset0.getInt("cnfmocomcd_40");
			rec.cnfmocomcd_50 = rset0.getInt("cnfmocomcd_50");
			rec.cnfmocomcd_60 = rset0.getInt("cnfmocomcd_60");
			rec.resvcol1 = rset0.getInt("resvcol1");
			rec.resvcol2 = rset0.getInt("resvcol2");
			rec.resvcol3 = rset0.getInt("resvcol3");
			this.camp_stat.add(rec);
		}
	}

	public String camp_statOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = camp_stat.size();
		for(int i=0; i<size; i++){
			SS_L_CAMPSTATCAMP_STATRecord rec = (SS_L_CAMPSTATCAMP_STATRecord)camp_stat.get(i);
			
			
			String code = rec.bocd;
			String name = rec.boinsdseq;
			
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

	public String camp_statChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = camp_stat.size();
		for(int i=0; i<size; i++){
			SS_L_CAMPSTATCAMP_STATRecord rec = (SS_L_CAMPSTATCAMP_STATRecord)camp_stat.get(i);
			
			
			String code = rec.bocd;
			String name = rec.boinsdseq;
			
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

	public String camp_statRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = camp_stat.size();
		for(int i=0; i<size; i++){
			SS_L_CAMPSTATCAMP_STATRecord rec = (SS_L_CAMPSTATCAMP_STATRecord)camp_stat.get(i);
			
			
			String code = rec.bocd;
			String name = rec.boinsdseq;
			
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
	SS_L_CAMPSTATDataSet ds = (SS_L_CAMPSTATDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.camp_stat.size(); i++){
		SS_L_CAMPSTATCAMP_STATRecord camp_statRec = (SS_L_CAMPSTATCAMP_STATRecord)ds.camp_stat.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCnfmstatcd_00_tot()%>
<%= ds.getCnfmstatcd_10_tot()%>
<%= ds.getTotalcnt()%>
<%= ds.getCamp_stat()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= camp_statRec.bocd%>
<%= camp_statRec.boinsdseq%>
<%= camp_statRec.bonm%>
<%= camp_statRec.cnfmstatcd_00%>
<%= camp_statRec.cnfmstatcd_10%>
<%= camp_statRec.cnfmocomcd_10%>
<%= camp_statRec.cnfmocomcd_20%>
<%= camp_statRec.cnfmocomcd_30%>
<%= camp_statRec.cnfmocomcd_40%>
<%= camp_statRec.cnfmocomcd_50%>
<%= camp_statRec.cnfmocomcd_60%>
<%= camp_statRec.resvcol1%>
<%= camp_statRec.resvcol2%>
<%= camp_statRec.resvcol3%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 25 14:09:02 KST 2009 */