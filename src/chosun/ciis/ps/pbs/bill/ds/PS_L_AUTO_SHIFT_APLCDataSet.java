/***************************************************************************************************
* 파일명 : PS_L_AUTO_SHIFT_APLC.java
* 기능   : 자동이체신청 목록조회
* 작성일자 : 2006-04-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 출판국 -자동이체신청 목록조회
 *
 */

public class PS_L_AUTO_SHIFT_APLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long uncnfmcnt;
	public long cnfmcnt;
	public long canccnt;
	public long aprverrcnt;
	public long totalcnt;

	public PS_L_AUTO_SHIFT_APLCDataSet(){}
	public PS_L_AUTO_SHIFT_APLCDataSet(String errcode, String errmsg, long uncnfmcnt, long cnfmcnt, long canccnt, long aprverrcnt, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.uncnfmcnt = uncnfmcnt;
		this.cnfmcnt = cnfmcnt;
		this.canccnt = canccnt;
		this.aprverrcnt = aprverrcnt;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setUncnfmcnt(long uncnfmcnt){
		this.uncnfmcnt = uncnfmcnt;
	}

	public void setCnfmcnt(long cnfmcnt){
		this.cnfmcnt = cnfmcnt;
	}

	public void setCanccnt(long canccnt){
		this.canccnt = canccnt;
	}

	public void setAprverrcnt(long aprverrcnt){
		this.aprverrcnt = aprverrcnt;
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

	public long getUncnfmcnt(){
		return this.uncnfmcnt;
	}

	public long getCnfmcnt(){
		return this.cnfmcnt;
	}

	public long getCanccnt(){
		return this.canccnt;
	}

	public long getAprverrcnt(){
		return this.aprverrcnt;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.uncnfmcnt = cstmt.getLong(14);
		this.cnfmcnt = cstmt.getLong(15);
		this.canccnt = cstmt.getLong(16);
		this.aprverrcnt = cstmt.getLong(17);
		this.totalcnt = cstmt.getLong(18);
		ResultSet rset0 = (ResultSet) cstmt.getObject(19);
		while(rset0.next()){
			PS_L_AUTO_SHIFT_APLCRSLTCURRecord rec = new PS_L_AUTO_SHIFT_APLCRSLTCURRecord();
			rec.aplcno = Util.checkString(rset0.getString("aplcno"));
			rec.aplcclsf = Util.checkString(rset0.getString("aplcclsf"));
			rec.aplcclsfnm = Util.checkString(rset0.getString("aplcclsfnm"));
			rec.aplcprocstat = Util.checkString(rset0.getString("aplcprocstat"));
			rec.aplcprocstatnm = Util.checkString(rset0.getString("aplcprocstatnm"));
			rec.pymtno_2 = Util.checkString(rset0.getString("pymtno_2"));
			rec.shftclsf = Util.checkString(rset0.getString("shftclsf"));
			rec.shftclsfnm = Util.checkString(rset0.getString("shftclsfnm"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.pymtnm = Util.checkString(rset0.getString("pymtnm"));
			rec.pymttel1 = Util.checkString(rset0.getString("pymttel1"));
			rec.pymttel2 = Util.checkString(rset0.getString("pymttel2"));
			rec.pymttel3 = Util.checkString(rset0.getString("pymttel3"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.aplyyymm = Util.checkString(rset0.getString("aplyyymm"));
			rec.trsmyn = Util.checkString(rset0.getString("trsmyn"));
			rec.pymtinforflyn = Util.checkString(rset0.getString("pymtinforflyn"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvaddrdtls = Util.checkString(rset0.getString("dlvaddrdtls"));
			rec.dlvdstccd = Util.checkString(rset0.getString("dlvdstccd"));
			rec.dlvno = Util.checkString(rset0.getString("dlvno"));
			rec.shftaplcclsf = Util.checkString(rset0.getString("shftaplcclsf"));
			rec.shftaplcclsfnm = Util.checkString(rset0.getString("shftaplcclsfnm"));
			rec.dlvqty = rset0.getInt("dlvqty");
			rec.fstaplcdt = Util.checkString(rset0.getString("fstaplcdt"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLCRSLTCURRecord rec = (PS_L_AUTO_SHIFT_APLCRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.aplcno;
			String name = rec.aplcclsf;
			
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

	public String rsltcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLCRSLTCURRecord rec = (PS_L_AUTO_SHIFT_APLCRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.aplcno;
			String name = rec.aplcclsf;
			
			sb.append("<input name=\"");
			sb.append("aplcno");
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

	public String rsltcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLCRSLTCURRecord rec = (PS_L_AUTO_SHIFT_APLCRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.aplcno;
			String name = rec.aplcclsf;
			
			sb.append("<input name=\"");
			sb.append("aplcno");
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
	PS_L_AUTO_SHIFT_APLCDataSet ds = (PS_L_AUTO_SHIFT_APLCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		PS_L_AUTO_SHIFT_APLCRSLTCURRecord rsltcurRec = (PS_L_AUTO_SHIFT_APLCRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getUncnfmcnt()%>
<%= ds.getCnfmcnt()%>
<%= ds.getCanccnt()%>
<%= ds.getAprverrcnt()%>
<%= ds.getTotalcnt()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.aplcno%>
<%= rsltcurRec.aplcclsf%>
<%= rsltcurRec.aplcclsfnm%>
<%= rsltcurRec.aplcprocstat%>
<%= rsltcurRec.aplcprocstatnm%>
<%= rsltcurRec.pymtno_2%>
<%= rsltcurRec.shftclsf%>
<%= rsltcurRec.shftclsfnm%>
<%= rsltcurRec.aplcdt%>
<%= rsltcurRec.pymtnm%>
<%= rsltcurRec.pymttel1%>
<%= rsltcurRec.pymttel2%>
<%= rsltcurRec.pymttel3%>
<%= rsltcurRec.rdrnm%>
<%= rsltcurRec.aplyyymm%>
<%= rsltcurRec.trsmyn%>
<%= rsltcurRec.pymtinforflyn%>
<%= rsltcurRec.medicd%>
<%= rsltcurRec.medinm%>
<%= rsltcurRec.dlvaddr%>
<%= rsltcurRec.dlvaddrdtls%>
<%= rsltcurRec.dlvdstccd%>
<%= rsltcurRec.dlvno%>
<%= rsltcurRec.shftaplcclsf%>
<%= rsltcurRec.shftaplcclsfnm%>
<%= rsltcurRec.dlvqty%>
<%= rsltcurRec.fstaplcdt%>
<%= rsltcurRec.rdr_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 08 17:36:57 KST 2006 */