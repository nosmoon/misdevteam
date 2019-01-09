/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 2012-02-20
* 작성자 : 
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
 * 
 */


public class SL_L_CAMPEXTN_UNIDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curextnlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalqty;
	public long totalcnt;

	public SL_L_CAMPEXTN_UNIDataSet(){}
	public SL_L_CAMPEXTN_UNIDataSet(String errcode, String errmsg, long totalqty, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalqty = totalqty;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalqty(long totalqty){
		this.totalqty = totalqty;
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

	public long getTotalqty(){
		return this.totalqty;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.totalqty = cstmt.getLong(5);
		this.totalcnt = cstmt.getLong(6);
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SL_L_CAMPEXTN_UNICUREXTNLISTRecord rec = new SL_L_CAMPEXTN_UNICUREXTNLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.qty = rset0.getInt("qty");
			rec.rdr_extntypecd = Util.checkString(rset0.getString("rdr_extntypecd"));
			rec.aplcpersnm = Util.checkString(rset0.getString("aplcpersnm"));
			rec.aplcpersemail = Util.checkString(rset0.getString("aplcpersemail"));
			rec.aplcperstel = Util.checkString(rset0.getString("aplcperstel"));
			rec.aplcpersptph = Util.checkString(rset0.getString("aplcpersptph"));
			rec.aplcperszip = Util.checkString(rset0.getString("aplcperszip"));
			rec.aplcaddr = Util.checkString(rset0.getString("aplcaddr"));
			rec.aplcpersmembseq = Util.checkString(rset0.getString("aplcpersmembseq"));
			rec.aplcpersid = Util.checkString(rset0.getString("aplcpersid"));
			rec.aplcpersremk = Util.checkString(rset0.getString("aplcpersremk"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.rdrptph_no = Util.checkString(rset0.getString("rdrptph_no"));
			rec.rdremail = Util.checkString(rset0.getString("rdremail"));
			rec.bo_headcnfmyn = Util.checkString(rset0.getString("bo_headcnfmyn"));
			rec.bo_headcnfmdt = Util.checkString(rset0.getString("bo_headcnfmdt"));
			rec.subscnfmstatcd = Util.checkString(rset0.getString("subscnfmstatcd"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.rdraddr = Util.checkString(rset0.getString("rdraddr"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.clamtmthdcd = Util.checkString(rset0.getString("clamtmthdcd"));
			rec.clamtnm = Util.checkString(rset0.getString("clamtnm"));
			rec.subsuprc = rset0.getInt("subsuprc");
			rec.dscnamt = rset0.getInt("dscnamt");
			rec.subsqty = rset0.getInt("subsqty");
			rec.subsfr_dt = Util.checkString(rset0.getString("subsfr_dt"));
			rec.suspnm = Util.checkString(rset0.getString("suspnm"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.aplcpathcd = Util.checkString(rset0.getString("aplcpathcd"));
			rec.freeyn = Util.checkString(rset0.getString("freeyn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.delyn = Util.checkString(rset0.getString("delyn"));
			rec.svccd = Util.checkString(rset0.getString("svccd"));
			rec.svcnm = Util.checkString(rset0.getString("svcnm"));
			this.curextnlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_L_CAMPEXTN_UNIDataSet ds = (SL_L_CAMPEXTN_UNIDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curextnlist.size(); i++){
		SL_L_CAMPEXTN_UNICUREXTNLISTRecord curextnlistRec = (SL_L_CAMPEXTN_UNICUREXTNLISTRecord)ds.curextnlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalqty()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurextnlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curextnlistRec.bocd%>
<%= curextnlistRec.bonm%>
<%= curextnlistRec.rdr_extndt%>
<%= curextnlistRec.rdr_extnno%>
<%= curextnlistRec.aplcdt%>
<%= curextnlistRec.qty%>
<%= curextnlistRec.rdr_extntypecd%>
<%= curextnlistRec.aplcpersnm%>
<%= curextnlistRec.aplcpersemail%>
<%= curextnlistRec.aplcperstel%>
<%= curextnlistRec.aplcpersptph%>
<%= curextnlistRec.aplcperszip%>
<%= curextnlistRec.aplcaddr%>
<%= curextnlistRec.aplcpersmembseq%>
<%= curextnlistRec.aplcpersid%>
<%= curextnlistRec.aplcpersremk%>
<%= curextnlistRec.rdrnm%>
<%= curextnlistRec.rdrtel_no%>
<%= curextnlistRec.rdrptph_no%>
<%= curextnlistRec.rdremail%>
<%= curextnlistRec.bo_headcnfmyn%>
<%= curextnlistRec.bo_headcnfmdt%>
<%= curextnlistRec.subscnfmstatcd%>
<%= curextnlistRec.dlvzip%>
<%= curextnlistRec.rdraddr%>
<%= curextnlistRec.rdr_no%>
<%= curextnlistRec.medicd%>
<%= curextnlistRec.medinm%>
<%= curextnlistRec.valmm%>
<%= curextnlistRec.clamtmthdcd%>
<%= curextnlistRec.clamtnm%>
<%= curextnlistRec.subsuprc%>
<%= curextnlistRec.dscnamt%>
<%= curextnlistRec.subsqty%>
<%= curextnlistRec.subsfr_dt%>
<%= curextnlistRec.suspnm%>
<%= curextnlistRec.suspdt%>
<%= curextnlistRec.aplcpathcd%>
<%= curextnlistRec.freeyn%>
<%= curextnlistRec.remk%>
<%= curextnlistRec.delyn%>
<%= curextnlistRec.svccd%>
<%= curextnlistRec.svcnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 21 16:54:07 KST 2012 */