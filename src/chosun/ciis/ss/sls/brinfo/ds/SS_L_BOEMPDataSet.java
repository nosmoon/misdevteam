/***************************************************************************************************
* 파일명 : SS_L_BOEMPDataSet.java
* 기능 : 지국Info-지국조직현황-목록을 위한 DataSet
* 작성일자 : 2004-11-12
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국Info-지국조직현황-목록을 위한 DataSet
 */


public class SS_L_BOEMPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long dutycd10cnt;
	public long dutycd20cnt;
	public long dutycd40cnt;
	public long dutycd50cnt;
	public long dutycd60cnt;
	public long dutycd70cnt;
	public long dutycd80cnt;
	public long total1cnt;
	public long dutycd100cnt;
	public long dutycd110cnt;
	public long dutycd120cnt;
	public long total2cnt;
	public long bsbusucnt;
	public long cybcntcnt;

	public SS_L_BOEMPDataSet(){}
	public SS_L_BOEMPDataSet(String errcode, String errmsg, long totalcnt, long dutycd10cnt, long dutycd20cnt, long dutycd40cnt, long dutycd50cnt, long dutycd60cnt, long dutycd70cnt, long dutycd80cnt, long total1cnt, long dutycd100cnt, long dutycd110cnt, long dutycd120cnt, long total2cnt, long bsbusucnt, long cybcntcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.dutycd10cnt = dutycd10cnt;
		this.dutycd20cnt = dutycd20cnt;
		this.dutycd40cnt = dutycd40cnt;
		this.dutycd50cnt = dutycd50cnt;
		this.dutycd60cnt = dutycd60cnt;
		this.dutycd70cnt = dutycd70cnt;
		this.dutycd80cnt = dutycd80cnt;
		this.total1cnt = total1cnt;
		this.dutycd100cnt = dutycd100cnt;
		this.dutycd110cnt = dutycd110cnt;
		this.dutycd120cnt = dutycd120cnt;
		this.total2cnt = total2cnt;
		this.bsbusucnt = bsbusucnt;
		this.cybcntcnt = cybcntcnt;
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

	public void setDutycd10cnt(long dutycd10cnt){
		this.dutycd10cnt = dutycd10cnt;
	}

	public void setDutycd20cnt(long dutycd20cnt){
		this.dutycd20cnt = dutycd20cnt;
	}

	public void setDutycd40cnt(long dutycd40cnt){
		this.dutycd40cnt = dutycd40cnt;
	}

	public void setDutycd50cnt(long dutycd50cnt){
		this.dutycd50cnt = dutycd50cnt;
	}

	public void setDutycd60cnt(long dutycd60cnt){
		this.dutycd60cnt = dutycd60cnt;
	}

	public void setDutycd70cnt(long dutycd70cnt){
		this.dutycd70cnt = dutycd70cnt;
	}

	public void setDutycd80cnt(long dutycd80cnt){
		this.dutycd80cnt = dutycd80cnt;
	}

	public void setTotal1cnt(long total1cnt){
		this.total1cnt = total1cnt;
	}

	public void setDutycd100cnt(long dutycd100cnt){
		this.dutycd100cnt = dutycd100cnt;
	}

	public void setDutycd110cnt(long dutycd110cnt){
		this.dutycd110cnt = dutycd110cnt;
	}

	public void setDutycd120cnt(long dutycd120cnt){
		this.dutycd120cnt = dutycd120cnt;
	}

	public void setTotal2cnt(long total2cnt){
		this.total2cnt = total2cnt;
	}

	public void setBsbusucnt(long bsbusucnt){
		this.bsbusucnt = bsbusucnt;
	}

	public void setCybcntcnt(long cybcntcnt){
		this.cybcntcnt = cybcntcnt;
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

	public long getDutycd10cnt(){
		return this.dutycd10cnt;
	}

	public long getDutycd20cnt(){
		return this.dutycd20cnt;
	}

	public long getDutycd40cnt(){
		return this.dutycd40cnt;
	}

	public long getDutycd50cnt(){
		return this.dutycd50cnt;
	}

	public long getDutycd60cnt(){
		return this.dutycd60cnt;
	}

	public long getDutycd70cnt(){
		return this.dutycd70cnt;
	}

	public long getDutycd80cnt(){
		return this.dutycd80cnt;
	}

	public long getTotal1cnt(){
		return this.total1cnt;
	}

	public long getDutycd100cnt(){
		return this.dutycd100cnt;
	}

	public long getDutycd110cnt(){
		return this.dutycd110cnt;
	}

	public long getDutycd120cnt(){
		return this.dutycd120cnt;
	}

	public long getTotal2cnt(){
		return this.total2cnt;
	}

	public long getBsbusucnt(){
		return this.bsbusucnt;
	}

	public long getCybcntcnt(){
		return this.cybcntcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(9);
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_L_BOEMPCURCOMMLISTRecord rec = new SS_L_BOEMPCURCOMMLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.boknm = Util.checkString(rset0.getString("boknm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bsbusu = rset0.getInt("bsbusu");
			rec.dutycd10 = rset0.getInt("dutycd10");
			rec.dutycd20 = rset0.getInt("dutycd20");
			rec.dutycd40 = rset0.getInt("dutycd40");
			rec.dutycd50 = rset0.getInt("dutycd50");
			rec.dutycd60 = rset0.getInt("dutycd60");
			rec.dutycd70 = rset0.getInt("dutycd70");
			rec.dutycd80 = rset0.getInt("dutycd80");
			rec.total1 = rset0.getInt("total1");
			rec.dutycd100 = rset0.getInt("dutycd100");
			rec.dutycd110 = rset0.getInt("dutycd110");
			rec.dutycd120 = rset0.getInt("dutycd120");
			rec.total2 = rset0.getInt("total2");
			rec.cybcnt = rset0.getInt("cybcnt");
			this.curcommlist.add(rec);
		}
		this.dutycd10cnt = cstmt.getLong(11);
		this.dutycd20cnt = cstmt.getLong(12);
		this.dutycd40cnt = cstmt.getLong(13);
		this.dutycd50cnt = cstmt.getLong(14);
		this.dutycd60cnt = cstmt.getLong(15);
		this.dutycd70cnt = cstmt.getLong(16);
		this.dutycd80cnt = cstmt.getLong(17);
		this.total1cnt = cstmt.getLong(18);
		this.dutycd100cnt = cstmt.getLong(19);
		this.dutycd110cnt = cstmt.getLong(20);
		this.dutycd120cnt = cstmt.getLong(21);
		this.total2cnt = cstmt.getLong(22);
		this.bsbusucnt = cstmt.getLong(23);
		this.cybcntcnt = cstmt.getLong(24);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_BOEMPCURCOMMLISTRecord rec = (SS_L_BOEMPCURCOMMLISTRecord)curcommlist.get(i);
			
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_BOEMPCURCOMMLISTRecord rec = (SS_L_BOEMPCURCOMMLISTRecord)curcommlist.get(i);
			
			
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_BOEMPCURCOMMLISTRecord rec = (SS_L_BOEMPCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
	SS_L_BOEMPDataSet ds = (SS_L_BOEMPDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOEMPCURCOMMLISTRecord curcommlistRec = (SS_L_BOEMPCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
<%= ds.getDutycd10cnt()%>
<%= ds.getDutycd20cnt()%>
<%= ds.getDutycd40cnt()%>
<%= ds.getDutycd50cnt()%>
<%= ds.getDutycd60cnt()%>
<%= ds.getDutycd70cnt()%>
<%= ds.getDutycd80cnt()%>
<%= ds.getTotal1cnt()%>
<%= ds.getDutycd100cnt()%>
<%= ds.getDutycd110cnt()%>
<%= ds.getDutycd120cnt()%>
<%= ds.getTotal2cnt()%>
<%= ds.getBsbusucnt()%>
<%= ds.getCybcntcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.boknm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bsbusu%>
<%= curcommlistRec.dutycd10%>
<%= curcommlistRec.dutycd20%>
<%= curcommlistRec.dutycd40%>
<%= curcommlistRec.dutycd50%>
<%= curcommlistRec.dutycd60%>
<%= curcommlistRec.dutycd70%>
<%= curcommlistRec.dutycd80%>
<%= curcommlistRec.total1%>
<%= curcommlistRec.dutycd100%>
<%= curcommlistRec.dutycd110%>
<%= curcommlistRec.dutycd120%>
<%= curcommlistRec.total2%>
<%= curcommlistRec.cybcnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 12 11:26:39 KST 2004 */