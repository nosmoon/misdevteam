/***************************************************************************************************
* 파일명 : SL_L_RDR_MOVMWORKDataSet.java
* 기능 : 관할지국조정관리-인계(인계작업목록검색)
*       관할지국조정관리-인수(인수작업목록검색)
* 작성일자 : 2004-02-07
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 관할지국조정관리-인계(인계작업목록검색)
 * 관할지국조정관리-인수(인수작업목록검색)
 * 특기사항 : 유지보수자는 관할지국조정관리(인계와 인수에 동시 쓰임에 유의할 것)
 */


public class SL_L_RDR_MOVMWORKDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList movmcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_RDR_MOVMWORKDataSet(){}
	public SL_L_RDR_MOVMWORKDataSet(String errcode, String errmsg){
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
			SL_L_RDR_MOVMWORKMOVMCURRecord rec = new SL_L_RDR_MOVMWORKMOVMCURRecord();
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.medabasidt = Util.checkString(rset0.getString("medabasidt"));
			rec.trsfbocd = Util.checkString(rset0.getString("trsfbocd"));
			rec.trsfbonm = Util.checkString(rset0.getString("trsfbonm"));
			rec.acptbocd = Util.checkString(rset0.getString("acptbocd"));
			rec.acptbonm = Util.checkString(rset0.getString("acptbonm"));
			rec.rdrcnt = rset0.getInt("rdrcnt");
			rec.procstat = Util.checkString(rset0.getString("procstat"));
			rec.procstatnm = Util.checkString(rset0.getString("procstatnm"));
            rec.trsfdt_tm = Util.checkString(rset0.getString("trsfdt_tm"));
			rec.chrgcnfmdt_tm = Util.checkString(rset0.getString("chrgcnfmdt_tm"));
			rec.acptdt_tm = Util.checkString(rset0.getString("acptdt_tm"));
			this.movmcur.add(rec);
		}
	}

	public String movmcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = movmcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_MOVMWORKMOVMCURRecord rec = (SL_L_RDR_MOVMWORKMOVMCURRecord)movmcur.get(i);


			String code = rec.regdt;
			String name = rec.regno;

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

	public String movmcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = movmcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_MOVMWORKMOVMCURRecord rec = (SL_L_RDR_MOVMWORKMOVMCURRecord)movmcur.get(i);


			String code = rec.regdt;
			String name = rec.regno;

			sb.append("<input name=\"");
			sb.append("regdt");
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

	public String movmcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = movmcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_MOVMWORKMOVMCURRecord rec = (SL_L_RDR_MOVMWORKMOVMCURRecord)movmcur.get(i);


			String code = rec.regdt;
			String name = rec.regno;

			sb.append("<input name=\"");
			sb.append("regdt");
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
	SL_L_RDR_MOVMWORKDataSet ds = (SL_L_RDR_MOVMWORKDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.movmcur.size(); i++){
		SL_L_RDR_MOVMWORKMOVMCURRecord movmcurRec = (SL_L_RDR_MOVMWORKMOVMCURRecord)ds.movmcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMovmcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= movmcurRec.regdt%>
<%= movmcurRec.regno%>
<%= movmcurRec.medabasidt%>
<%= movmcurRec.trsfbocd%>
<%= movmcurRec.trsfbonm%>
<%= movmcurRec.acptbocd%>
<%= movmcurRec.acptbonm%>
<%= movmcurRec.rdrcnt%>
<%= movmcurRec.procstat%>
<%= movmcurRec.procstatnm%>
<%= movmcurRec.trsfdt_tm%>
<%= movmcurRec.chrgcnfmdt_tm%>
<%= movmcurRec.acptdt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Feb 07 16:47:38 KST 2004 */