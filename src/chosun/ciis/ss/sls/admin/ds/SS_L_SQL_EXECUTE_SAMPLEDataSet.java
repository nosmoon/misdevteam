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


public class SS_L_SQL_EXECUTE_SAMPLEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist2 = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_SQL_EXECUTE_SAMPLEDataSet(){}
	public SS_L_SQL_EXECUTE_SAMPLEDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SS_L_SQL_EXECUTE_SAMPLECURCOMMLISTRecord rec = new SS_L_SQL_EXECUTE_SAMPLECURCOMMLISTRecord();
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
			this.curcommlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SS_L_SQL_EXECUTE_SAMPLECURCOMMLIST2Record rec = new SS_L_SQL_EXECUTE_SAMPLECURCOMMLIST2Record();
			rec.a1 = Util.checkString(rset1.getString("a1"));
			rec.a2 = Util.checkString(rset1.getString("a2"));
			rec.a3 = Util.checkString(rset1.getString("a3"));
			rec.a4 = Util.checkString(rset1.getString("a4"));
			rec.a5 = Util.checkString(rset1.getString("a5"));
			rec.a6 = Util.checkString(rset1.getString("a6"));
			rec.a7 = Util.checkString(rset1.getString("a7"));
			rec.a8 = Util.checkString(rset1.getString("a8"));
			rec.a9 = Util.checkString(rset1.getString("a9"));
			rec.a10 = Util.checkString(rset1.getString("a10"));
			rec.a11 = Util.checkString(rset1.getString("a11"));
			rec.a12 = Util.checkString(rset1.getString("a12"));
			rec.a13 = Util.checkString(rset1.getString("a13"));
			rec.a14 = Util.checkString(rset1.getString("a14"));
			rec.a15 = Util.checkString(rset1.getString("a15"));
			rec.a16 = Util.checkString(rset1.getString("a16"));
			rec.a17 = Util.checkString(rset1.getString("a17"));
			rec.a18 = Util.checkString(rset1.getString("a18"));
			rec.a19 = Util.checkString(rset1.getString("a19"));
			rec.a20 = Util.checkString(rset1.getString("a20"));
			rec.a21 = Util.checkString(rset1.getString("a21"));
			rec.a22 = Util.checkString(rset1.getString("a22"));
			rec.a23 = Util.checkString(rset1.getString("a23"));
			rec.a24 = Util.checkString(rset1.getString("a24"));
			rec.a25 = Util.checkString(rset1.getString("a25"));
			rec.a26 = Util.checkString(rset1.getString("a26"));
			rec.a27 = Util.checkString(rset1.getString("a27"));
			rec.a28 = Util.checkString(rset1.getString("a28"));
			rec.a29 = Util.checkString(rset1.getString("a29"));
			rec.a30 = Util.checkString(rset1.getString("a30"));
			rec.a31 = Util.checkString(rset1.getString("a31"));
			rec.a32 = Util.checkString(rset1.getString("a32"));
			rec.a33 = Util.checkString(rset1.getString("a33"));
			rec.a34 = Util.checkString(rset1.getString("a34"));
			rec.a35 = Util.checkString(rset1.getString("a35"));
			rec.a36 = Util.checkString(rset1.getString("a36"));
			rec.a37 = Util.checkString(rset1.getString("a37"));
			rec.a38 = Util.checkString(rset1.getString("a38"));
			rec.a39 = Util.checkString(rset1.getString("a39"));
			rec.a40 = Util.checkString(rset1.getString("a40"));
			rec.a41 = Util.checkString(rset1.getString("a41"));
			rec.a42 = Util.checkString(rset1.getString("a42"));
			rec.a43 = Util.checkString(rset1.getString("a43"));
			rec.a44 = Util.checkString(rset1.getString("a44"));
			rec.a45 = Util.checkString(rset1.getString("a45"));
			rec.a46 = Util.checkString(rset1.getString("a46"));
			rec.a47 = Util.checkString(rset1.getString("a47"));
			rec.a48 = Util.checkString(rset1.getString("a48"));
			rec.a49 = Util.checkString(rset1.getString("a49"));
			rec.a50 = Util.checkString(rset1.getString("a50"));
			rec.a51 = Util.checkString(rset1.getString("a51"));
			rec.a52 = Util.checkString(rset1.getString("a52"));
			rec.a53 = Util.checkString(rset1.getString("a53"));
			rec.a54 = Util.checkString(rset1.getString("a54"));
			rec.a55 = Util.checkString(rset1.getString("a55"));
			rec.a56 = Util.checkString(rset1.getString("a56"));
			rec.a57 = Util.checkString(rset1.getString("a57"));
			rec.a58 = Util.checkString(rset1.getString("a58"));
			rec.a59 = Util.checkString(rset1.getString("a59"));
			rec.a60 = Util.checkString(rset1.getString("a60"));
			rec.a61 = Util.checkString(rset1.getString("a61"));
			rec.a62 = Util.checkString(rset1.getString("a62"));
			rec.a63 = Util.checkString(rset1.getString("a63"));
			rec.a64 = Util.checkString(rset1.getString("a64"));
			rec.a65 = Util.checkString(rset1.getString("a65"));
			rec.a66 = Util.checkString(rset1.getString("a66"));
			rec.a67 = Util.checkString(rset1.getString("a67"));
			rec.a68 = Util.checkString(rset1.getString("a68"));
			rec.a69 = Util.checkString(rset1.getString("a69"));
			rec.a70 = Util.checkString(rset1.getString("a70"));
			rec.a71 = Util.checkString(rset1.getString("a71"));
			rec.a72 = Util.checkString(rset1.getString("a72"));
			rec.a73 = Util.checkString(rset1.getString("a73"));
			rec.a74 = Util.checkString(rset1.getString("a74"));
			rec.a75 = Util.checkString(rset1.getString("a75"));
			rec.a76 = Util.checkString(rset1.getString("a76"));
			rec.a77 = Util.checkString(rset1.getString("a77"));
			rec.a78 = Util.checkString(rset1.getString("a78"));
			rec.a79 = Util.checkString(rset1.getString("a79"));
			rec.a80 = Util.checkString(rset1.getString("a80"));
			rec.a81 = Util.checkString(rset1.getString("a81"));
			rec.a82 = Util.checkString(rset1.getString("a82"));
			rec.a83 = Util.checkString(rset1.getString("a83"));
			rec.a84 = Util.checkString(rset1.getString("a84"));
			rec.a85 = Util.checkString(rset1.getString("a85"));
			rec.a86 = Util.checkString(rset1.getString("a86"));
			rec.a87 = Util.checkString(rset1.getString("a87"));
			rec.a88 = Util.checkString(rset1.getString("a88"));
			rec.a89 = Util.checkString(rset1.getString("a89"));
			rec.a90 = Util.checkString(rset1.getString("a90"));
			rec.a91 = Util.checkString(rset1.getString("a91"));
			rec.a92 = Util.checkString(rset1.getString("a92"));
			rec.a93 = Util.checkString(rset1.getString("a93"));
			rec.a94 = Util.checkString(rset1.getString("a94"));
			rec.a95 = Util.checkString(rset1.getString("a95"));
			rec.a96 = Util.checkString(rset1.getString("a96"));
			rec.a97 = Util.checkString(rset1.getString("a97"));
			rec.a98 = Util.checkString(rset1.getString("a98"));
			rec.a99 = Util.checkString(rset1.getString("a99"));
			rec.a100 = Util.checkString(rset1.getString("a100"));
			this.curcommlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_SQL_EXECUTE_SAMPLEDataSet ds = (SS_L_SQL_EXECUTE_SAMPLEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_SQL_EXECUTE_SAMPLECURCOMMLISTRecord curcommlistRec = (SS_L_SQL_EXECUTE_SAMPLECURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcommlist2.size(); i++){
		SS_L_SQL_EXECUTE_SAMPLECURCOMMLIST2Record curcommlist2Rec = (SS_L_SQL_EXECUTE_SAMPLECURCOMMLIST2Record)ds.curcommlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getCurcommlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.a1%>
<%= curcommlistRec.a2%>
<%= curcommlistRec.a3%>
<%= curcommlistRec.a4%>
<%= curcommlistRec.a5%>
<%= curcommlistRec.a6%>
<%= curcommlistRec.a7%>
<%= curcommlistRec.a8%>
<%= curcommlistRec.a9%>
<%= curcommlistRec.a10%>
<%= curcommlistRec.a11%>
<%= curcommlistRec.a12%>
<%= curcommlistRec.a13%>
<%= curcommlistRec.a14%>
<%= curcommlistRec.a15%>
<%= curcommlistRec.a16%>
<%= curcommlistRec.a17%>
<%= curcommlistRec.a18%>
<%= curcommlistRec.a19%>
<%= curcommlistRec.a20%>
<%= curcommlistRec.a21%>
<%= curcommlistRec.a22%>
<%= curcommlistRec.a23%>
<%= curcommlistRec.a24%>
<%= curcommlistRec.a25%>
<%= curcommlistRec.a26%>
<%= curcommlistRec.a27%>
<%= curcommlistRec.a28%>
<%= curcommlistRec.a29%>
<%= curcommlistRec.a30%>
<%= curcommlistRec.a31%>
<%= curcommlistRec.a32%>
<%= curcommlistRec.a33%>
<%= curcommlistRec.a34%>
<%= curcommlistRec.a35%>
<%= curcommlistRec.a36%>
<%= curcommlistRec.a37%>
<%= curcommlistRec.a38%>
<%= curcommlistRec.a39%>
<%= curcommlistRec.a40%>
<%= curcommlistRec.a41%>
<%= curcommlistRec.a42%>
<%= curcommlistRec.a43%>
<%= curcommlistRec.a44%>
<%= curcommlistRec.a45%>
<%= curcommlistRec.a46%>
<%= curcommlistRec.a47%>
<%= curcommlistRec.a48%>
<%= curcommlistRec.a49%>
<%= curcommlistRec.a50%>
<%= curcommlistRec.a51%>
<%= curcommlistRec.a52%>
<%= curcommlistRec.a53%>
<%= curcommlistRec.a54%>
<%= curcommlistRec.a55%>
<%= curcommlistRec.a56%>
<%= curcommlistRec.a57%>
<%= curcommlistRec.a58%>
<%= curcommlistRec.a59%>
<%= curcommlistRec.a60%>
<%= curcommlistRec.a61%>
<%= curcommlistRec.a62%>
<%= curcommlistRec.a63%>
<%= curcommlistRec.a64%>
<%= curcommlistRec.a65%>
<%= curcommlistRec.a66%>
<%= curcommlistRec.a67%>
<%= curcommlistRec.a68%>
<%= curcommlistRec.a69%>
<%= curcommlistRec.a70%>
<%= curcommlistRec.a71%>
<%= curcommlistRec.a72%>
<%= curcommlistRec.a73%>
<%= curcommlistRec.a74%>
<%= curcommlistRec.a75%>
<%= curcommlistRec.a76%>
<%= curcommlistRec.a77%>
<%= curcommlistRec.a78%>
<%= curcommlistRec.a79%>
<%= curcommlistRec.a80%>
<%= curcommlistRec.a81%>
<%= curcommlistRec.a82%>
<%= curcommlistRec.a83%>
<%= curcommlistRec.a84%>
<%= curcommlistRec.a85%>
<%= curcommlistRec.a86%>
<%= curcommlistRec.a87%>
<%= curcommlistRec.a88%>
<%= curcommlistRec.a89%>
<%= curcommlistRec.a90%>
<%= curcommlistRec.a91%>
<%= curcommlistRec.a92%>
<%= curcommlistRec.a93%>
<%= curcommlistRec.a94%>
<%= curcommlistRec.a95%>
<%= curcommlistRec.a96%>
<%= curcommlistRec.a97%>
<%= curcommlistRec.a98%>
<%= curcommlistRec.a99%>
<%= curcommlistRec.a100%>
<%= curcommlist2Rec.a1%>
<%= curcommlist2Rec.a2%>
<%= curcommlist2Rec.a3%>
<%= curcommlist2Rec.a4%>
<%= curcommlist2Rec.a5%>
<%= curcommlist2Rec.a6%>
<%= curcommlist2Rec.a7%>
<%= curcommlist2Rec.a8%>
<%= curcommlist2Rec.a9%>
<%= curcommlist2Rec.a10%>
<%= curcommlist2Rec.a11%>
<%= curcommlist2Rec.a12%>
<%= curcommlist2Rec.a13%>
<%= curcommlist2Rec.a14%>
<%= curcommlist2Rec.a15%>
<%= curcommlist2Rec.a16%>
<%= curcommlist2Rec.a17%>
<%= curcommlist2Rec.a18%>
<%= curcommlist2Rec.a19%>
<%= curcommlist2Rec.a20%>
<%= curcommlist2Rec.a21%>
<%= curcommlist2Rec.a22%>
<%= curcommlist2Rec.a23%>
<%= curcommlist2Rec.a24%>
<%= curcommlist2Rec.a25%>
<%= curcommlist2Rec.a26%>
<%= curcommlist2Rec.a27%>
<%= curcommlist2Rec.a28%>
<%= curcommlist2Rec.a29%>
<%= curcommlist2Rec.a30%>
<%= curcommlist2Rec.a31%>
<%= curcommlist2Rec.a32%>
<%= curcommlist2Rec.a33%>
<%= curcommlist2Rec.a34%>
<%= curcommlist2Rec.a35%>
<%= curcommlist2Rec.a36%>
<%= curcommlist2Rec.a37%>
<%= curcommlist2Rec.a38%>
<%= curcommlist2Rec.a39%>
<%= curcommlist2Rec.a40%>
<%= curcommlist2Rec.a41%>
<%= curcommlist2Rec.a42%>
<%= curcommlist2Rec.a43%>
<%= curcommlist2Rec.a44%>
<%= curcommlist2Rec.a45%>
<%= curcommlist2Rec.a46%>
<%= curcommlist2Rec.a47%>
<%= curcommlist2Rec.a48%>
<%= curcommlist2Rec.a49%>
<%= curcommlist2Rec.a50%>
<%= curcommlist2Rec.a51%>
<%= curcommlist2Rec.a52%>
<%= curcommlist2Rec.a53%>
<%= curcommlist2Rec.a54%>
<%= curcommlist2Rec.a55%>
<%= curcommlist2Rec.a56%>
<%= curcommlist2Rec.a57%>
<%= curcommlist2Rec.a58%>
<%= curcommlist2Rec.a59%>
<%= curcommlist2Rec.a60%>
<%= curcommlist2Rec.a61%>
<%= curcommlist2Rec.a62%>
<%= curcommlist2Rec.a63%>
<%= curcommlist2Rec.a64%>
<%= curcommlist2Rec.a65%>
<%= curcommlist2Rec.a66%>
<%= curcommlist2Rec.a67%>
<%= curcommlist2Rec.a68%>
<%= curcommlist2Rec.a69%>
<%= curcommlist2Rec.a70%>
<%= curcommlist2Rec.a71%>
<%= curcommlist2Rec.a72%>
<%= curcommlist2Rec.a73%>
<%= curcommlist2Rec.a74%>
<%= curcommlist2Rec.a75%>
<%= curcommlist2Rec.a76%>
<%= curcommlist2Rec.a77%>
<%= curcommlist2Rec.a78%>
<%= curcommlist2Rec.a79%>
<%= curcommlist2Rec.a80%>
<%= curcommlist2Rec.a81%>
<%= curcommlist2Rec.a82%>
<%= curcommlist2Rec.a83%>
<%= curcommlist2Rec.a84%>
<%= curcommlist2Rec.a85%>
<%= curcommlist2Rec.a86%>
<%= curcommlist2Rec.a87%>
<%= curcommlist2Rec.a88%>
<%= curcommlist2Rec.a89%>
<%= curcommlist2Rec.a90%>
<%= curcommlist2Rec.a91%>
<%= curcommlist2Rec.a92%>
<%= curcommlist2Rec.a93%>
<%= curcommlist2Rec.a94%>
<%= curcommlist2Rec.a95%>
<%= curcommlist2Rec.a96%>
<%= curcommlist2Rec.a97%>
<%= curcommlist2Rec.a98%>
<%= curcommlist2Rec.a99%>
<%= curcommlist2Rec.a100%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 29 05:41:38 GMT 2014 */