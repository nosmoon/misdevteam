/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 
 */


public class SS_L_SQL_EXECUTE_DWLOADDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList resultcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String filenm;

	public SS_L_SQL_EXECUTE_DWLOADDataSet(){}
	public SS_L_SQL_EXECUTE_DWLOADDataSet(String errcode, String errmsg, String filenm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.filenm = filenm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.filenm = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_SQL_EXECUTE_DWLOADRESULTCURRecord rec = new SS_L_SQL_EXECUTE_DWLOADRESULTCURRecord();
			rec.a1 = Util.checkString(rset0.getString("a1"));
			rec.a2 = Util.checkString(rset0.getString("a2"));
			rec.a3 = Util.checkString(rset0.getString("a3"));
			rec.a4 = Util.checkString(rset0.getString("a4"));
			rec.a5 = Util.checkString(rset0.getString("a5"));
			rec.a6 = Util.checkString(rset0.getString("a6"));
			rec.a7 = Util.checkString(rset0.getString("a7"));
			rec.a8 = Util.checkString(rset0.getString("a8"));
			rec.a9 = Util.checkString(rset0.getString("a9"));
			rec.a10 = Util.checkString(rset0.getString("a10"));
			rec.a11 = Util.checkString(rset0.getString("a11"));
			rec.a12 = Util.checkString(rset0.getString("a12"));
			rec.a13 = Util.checkString(rset0.getString("a13"));
			rec.a14 = Util.checkString(rset0.getString("a14"));
			rec.a15 = Util.checkString(rset0.getString("a15"));
			rec.a16 = Util.checkString(rset0.getString("a16"));
			rec.a17 = Util.checkString(rset0.getString("a17"));
			rec.a18 = Util.checkString(rset0.getString("a18"));
			rec.a19 = Util.checkString(rset0.getString("a19"));
			rec.a20 = Util.checkString(rset0.getString("a20"));
			rec.a21 = Util.checkString(rset0.getString("a21"));
			rec.a22 = Util.checkString(rset0.getString("a22"));
			rec.a23 = Util.checkString(rset0.getString("a23"));
			rec.a24 = Util.checkString(rset0.getString("a24"));
			rec.a25 = Util.checkString(rset0.getString("a25"));
			rec.a26 = Util.checkString(rset0.getString("a26"));
			rec.a27 = Util.checkString(rset0.getString("a27"));
			rec.a28 = Util.checkString(rset0.getString("a28"));
			rec.a29 = Util.checkString(rset0.getString("a29"));
			rec.a30 = Util.checkString(rset0.getString("a30"));
			rec.a31 = Util.checkString(rset0.getString("a31"));
			rec.a32 = Util.checkString(rset0.getString("a32"));
			rec.a33 = Util.checkString(rset0.getString("a33"));
			rec.a34 = Util.checkString(rset0.getString("a34"));
			rec.a35 = Util.checkString(rset0.getString("a35"));
			rec.a36 = Util.checkString(rset0.getString("a36"));
			rec.a37 = Util.checkString(rset0.getString("a37"));
			rec.a38 = Util.checkString(rset0.getString("a38"));
			rec.a39 = Util.checkString(rset0.getString("a39"));
			rec.a40 = Util.checkString(rset0.getString("a40"));
			rec.a41 = Util.checkString(rset0.getString("a41"));
			rec.a42 = Util.checkString(rset0.getString("a42"));
			rec.a43 = Util.checkString(rset0.getString("a43"));
			rec.a44 = Util.checkString(rset0.getString("a44"));
			rec.a45 = Util.checkString(rset0.getString("a45"));
			rec.a46 = Util.checkString(rset0.getString("a46"));
			rec.a47 = Util.checkString(rset0.getString("a47"));
			rec.a48 = Util.checkString(rset0.getString("a48"));
			rec.a49 = Util.checkString(rset0.getString("a49"));
			rec.a50 = Util.checkString(rset0.getString("a50"));
			rec.a51 = Util.checkString(rset0.getString("a51"));
			rec.a52 = Util.checkString(rset0.getString("a52"));
			rec.a53 = Util.checkString(rset0.getString("a53"));
			rec.a54 = Util.checkString(rset0.getString("a54"));
			rec.a55 = Util.checkString(rset0.getString("a55"));
			rec.a56 = Util.checkString(rset0.getString("a56"));
			rec.a57 = Util.checkString(rset0.getString("a57"));
			rec.a58 = Util.checkString(rset0.getString("a58"));
			rec.a59 = Util.checkString(rset0.getString("a59"));
			rec.a60 = Util.checkString(rset0.getString("a60"));
			rec.a61 = Util.checkString(rset0.getString("a61"));
			rec.a62 = Util.checkString(rset0.getString("a62"));
			rec.a63 = Util.checkString(rset0.getString("a63"));
			rec.a64 = Util.checkString(rset0.getString("a64"));
			rec.a65 = Util.checkString(rset0.getString("a65"));
			rec.a66 = Util.checkString(rset0.getString("a66"));
			rec.a67 = Util.checkString(rset0.getString("a67"));
			rec.a68 = Util.checkString(rset0.getString("a68"));
			rec.a69 = Util.checkString(rset0.getString("a69"));
			rec.a70 = Util.checkString(rset0.getString("a70"));
			rec.a71 = Util.checkString(rset0.getString("a71"));
			rec.a72 = Util.checkString(rset0.getString("a72"));
			rec.a73 = Util.checkString(rset0.getString("a73"));
			rec.a74 = Util.checkString(rset0.getString("a74"));
			rec.a75 = Util.checkString(rset0.getString("a75"));
			rec.a76 = Util.checkString(rset0.getString("a76"));
			rec.a77 = Util.checkString(rset0.getString("a77"));
			rec.a78 = Util.checkString(rset0.getString("a78"));
			rec.a79 = Util.checkString(rset0.getString("a79"));
			rec.a80 = Util.checkString(rset0.getString("a80"));
			rec.a81 = Util.checkString(rset0.getString("a81"));
			rec.a82 = Util.checkString(rset0.getString("a82"));
			rec.a83 = Util.checkString(rset0.getString("a83"));
			rec.a84 = Util.checkString(rset0.getString("a84"));
			rec.a85 = Util.checkString(rset0.getString("a85"));
			rec.a86 = Util.checkString(rset0.getString("a86"));
			rec.a87 = Util.checkString(rset0.getString("a87"));
			rec.a88 = Util.checkString(rset0.getString("a88"));
			rec.a89 = Util.checkString(rset0.getString("a89"));
			rec.a90 = Util.checkString(rset0.getString("a90"));
			rec.a91 = Util.checkString(rset0.getString("a91"));
			rec.a92 = Util.checkString(rset0.getString("a92"));
			rec.a93 = Util.checkString(rset0.getString("a93"));
			rec.a94 = Util.checkString(rset0.getString("a94"));
			rec.a95 = Util.checkString(rset0.getString("a95"));
			rec.a96 = Util.checkString(rset0.getString("a96"));
			rec.a97 = Util.checkString(rset0.getString("a97"));
			rec.a98 = Util.checkString(rset0.getString("a98"));
			rec.a99 = Util.checkString(rset0.getString("a99"));
			rec.a100 = Util.checkString(rset0.getString("a100"));
			this.resultcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_SQL_EXECUTE_DWLOADDataSet ds = (SS_L_SQL_EXECUTE_DWLOADDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.resultcur.size(); i++){
		SS_L_SQL_EXECUTE_DWLOADRESULTCURRecord resultcurRec = (SS_L_SQL_EXECUTE_DWLOADRESULTCURRecord)ds.resultcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFilenm()%>
<%= ds.getResultcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= resultcurRec.a1%>
<%= resultcurRec.a2%>
<%= resultcurRec.a3%>
<%= resultcurRec.a4%>
<%= resultcurRec.a5%>
<%= resultcurRec.a6%>
<%= resultcurRec.a7%>
<%= resultcurRec.a8%>
<%= resultcurRec.a9%>
<%= resultcurRec.a10%>
<%= resultcurRec.a11%>
<%= resultcurRec.a12%>
<%= resultcurRec.a13%>
<%= resultcurRec.a14%>
<%= resultcurRec.a15%>
<%= resultcurRec.a16%>
<%= resultcurRec.a17%>
<%= resultcurRec.a18%>
<%= resultcurRec.a19%>
<%= resultcurRec.a20%>
<%= resultcurRec.a21%>
<%= resultcurRec.a22%>
<%= resultcurRec.a23%>
<%= resultcurRec.a24%>
<%= resultcurRec.a25%>
<%= resultcurRec.a26%>
<%= resultcurRec.a27%>
<%= resultcurRec.a28%>
<%= resultcurRec.a29%>
<%= resultcurRec.a30%>
<%= resultcurRec.a31%>
<%= resultcurRec.a32%>
<%= resultcurRec.a33%>
<%= resultcurRec.a34%>
<%= resultcurRec.a35%>
<%= resultcurRec.a36%>
<%= resultcurRec.a37%>
<%= resultcurRec.a38%>
<%= resultcurRec.a39%>
<%= resultcurRec.a40%>
<%= resultcurRec.a41%>
<%= resultcurRec.a42%>
<%= resultcurRec.a43%>
<%= resultcurRec.a44%>
<%= resultcurRec.a45%>
<%= resultcurRec.a46%>
<%= resultcurRec.a47%>
<%= resultcurRec.a48%>
<%= resultcurRec.a49%>
<%= resultcurRec.a50%>
<%= resultcurRec.a51%>
<%= resultcurRec.a52%>
<%= resultcurRec.a53%>
<%= resultcurRec.a54%>
<%= resultcurRec.a55%>
<%= resultcurRec.a56%>
<%= resultcurRec.a57%>
<%= resultcurRec.a58%>
<%= resultcurRec.a59%>
<%= resultcurRec.a60%>
<%= resultcurRec.a61%>
<%= resultcurRec.a62%>
<%= resultcurRec.a63%>
<%= resultcurRec.a64%>
<%= resultcurRec.a65%>
<%= resultcurRec.a66%>
<%= resultcurRec.a67%>
<%= resultcurRec.a68%>
<%= resultcurRec.a69%>
<%= resultcurRec.a70%>
<%= resultcurRec.a71%>
<%= resultcurRec.a72%>
<%= resultcurRec.a73%>
<%= resultcurRec.a74%>
<%= resultcurRec.a75%>
<%= resultcurRec.a76%>
<%= resultcurRec.a77%>
<%= resultcurRec.a78%>
<%= resultcurRec.a79%>
<%= resultcurRec.a80%>
<%= resultcurRec.a81%>
<%= resultcurRec.a82%>
<%= resultcurRec.a83%>
<%= resultcurRec.a84%>
<%= resultcurRec.a85%>
<%= resultcurRec.a86%>
<%= resultcurRec.a87%>
<%= resultcurRec.a88%>
<%= resultcurRec.a89%>
<%= resultcurRec.a90%>
<%= resultcurRec.a91%>
<%= resultcurRec.a92%>
<%= resultcurRec.a93%>
<%= resultcurRec.a94%>
<%= resultcurRec.a95%>
<%= resultcurRec.a96%>
<%= resultcurRec.a97%>
<%= resultcurRec.a98%>
<%= resultcurRec.a99%>
<%= resultcurRec.a100%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 26 03:52:16 GMT 2013 */