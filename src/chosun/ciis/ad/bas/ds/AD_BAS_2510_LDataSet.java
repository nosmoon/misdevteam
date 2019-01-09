/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_2510_LCURLIST22Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2510_LCURLIST2Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2510_LCURLIST3Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2510_LCURLIST4Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2510_LCURLIST5Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2510_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_2510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist22 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String yyyymm;
	public String yyyymm2;

	public AD_BAS_2510_LDataSet(){}
	public AD_BAS_2510_LDataSet(String errcode, String errmsg, String yyyymm, String yyyymm2){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.yyyymm = yyyymm;
		this.yyyymm2 = yyyymm2;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public void setYyyymm2(String yyyymm2){
		this.yyyymm2 = yyyymm2;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getYyyymm2(){
		return this.yyyymm2;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.yyyymm = Util.checkString(cstmt.getString(6));
		this.yyyymm2 = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AD_BAS_2510_LCURLISTRecord rec = new AD_BAS_2510_LCURLISTRecord();
			rec.yy1 = Util.checkString(rset0.getString("yy1"));
			rec.yy2 = Util.checkString(rset0.getString("yy2"));
			rec.cnt1 = Util.checkString(rset0.getString("cnt1"));
			rec.cnt2 = Util.checkString(rset0.getString("cnt2"));
			rec.pubcamt1 = Util.checkString(rset0.getString("pubcamt1"));
			rec.trgtamt1 = Util.checkString(rset0.getString("trgtamt1"));
			rec.pubcamt2 = Util.checkString(rset0.getString("pubcamt2"));
			rec.trgtamt2 = Util.checkString(rset0.getString("trgtamt2"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			AD_BAS_2510_LCURLIST2Record rec = new AD_BAS_2510_LCURLIST2Record();
			rec.pubc_dt = Util.checkString(rset1.getString("pubc_dt"));
			rec.yoil = Util.checkString(rset1.getString("yoil"));
			rec.pubc_side = Util.checkString(rset1.getString("pubc_side"));
			rec.dn = Util.checkString(rset1.getString("dn"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			AD_BAS_2510_LCURLIST22Record rec = new AD_BAS_2510_LCURLIST22Record();
			rec.pubc_dt = Util.checkString(rset2.getString("pubc_dt"));
			rec.yoil = Util.checkString(rset2.getString("yoil"));
			rec.pubc_side = Util.checkString(rset2.getString("pubc_side"));
			rec.dn = Util.checkString(rset2.getString("dn"));
			rec.amt = Util.checkString(rset2.getString("amt"));
			this.curlist22.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			AD_BAS_2510_LCURLIST3Record rec = new AD_BAS_2510_LCURLIST3Record();
			rec.yy1 = Util.checkString(rset3.getString("yy1"));
			rec.cnt1 = Util.checkString(rset3.getString("cnt1"));
			rec.medi_nm = Util.checkString(rset3.getString("medi_nm"));
			rec.pubcamt1 = Util.checkString(rset3.getString("pubcamt1"));
			rec.pubcamt2 = Util.checkString(rset3.getString("pubcamt2"));
			rec.incamt = Util.checkString(rset3.getString("incamt"));
			rec.incavg = Util.checkString(rset3.getString("incavg"));
			rec.trgtamt = Util.checkString(rset3.getString("trgtamt"));
			rec.shortamt = Util.checkString(rset3.getString("shortamt"));
			rec.shortavg = Util.checkString(rset3.getString("shortavg"));
			this.curlist3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			AD_BAS_2510_LCURLIST4Record rec = new AD_BAS_2510_LCURLIST4Record();
			rec.yy1 = Util.checkString(rset4.getString("yy1"));
			rec.cnt1 = Util.checkString(rset4.getString("cnt1"));
			rec.medi_nm = Util.checkString(rset4.getString("medi_nm"));
			rec.pubcamt1 = Util.checkString(rset4.getString("pubcamt1"));
			rec.pubcamt2 = Util.checkString(rset4.getString("pubcamt2"));
			rec.incamt = Util.checkString(rset4.getString("incamt"));
			rec.incavg = Util.checkString(rset4.getString("incavg"));
			rec.trgtamt = Util.checkString(rset4.getString("trgtamt"));
			rec.shortamt = Util.checkString(rset4.getString("shortamt"));
			rec.shortavg = Util.checkString(rset4.getString("shortavg"));
			this.curlist4.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(13);
		while(rset5.next()){
			AD_BAS_2510_LCURLIST5Record rec = new AD_BAS_2510_LCURLIST5Record();
			rec.pubc_dt = Util.checkString(rset5.getString("pubc_dt"));
			rec.pubc_cnt = Util.checkString(rset5.getString("pubc_cnt"));
			rec.issu_side = Util.checkString(rset5.getString("issu_side"));
			rec.addn = Util.checkString(rset5.getString("addn"));
			this.curlist5.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_2510_LDataSet ds = (AD_BAS_2510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_2510_LCURLISTRecord curlistRec = (AD_BAS_2510_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_2510_LCURLIST2Record curlist2Rec = (AD_BAS_2510_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist22.size(); i++){
		AD_BAS_2510_LCURLIST22Record curlist22Rec = (AD_BAS_2510_LCURLIST22Record)ds.curlist22.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_2510_LCURLIST3Record curlist3Rec = (AD_BAS_2510_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_BAS_2510_LCURLIST4Record curlist4Rec = (AD_BAS_2510_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_BAS_2510_LCURLIST5Record curlist5Rec = (AD_BAS_2510_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getYyyymm()%>
<%= ds.getYyyymm2()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist22()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.yy1%>
<%= curlistRec.yy2%>
<%= curlistRec.cnt1%>
<%= curlistRec.cnt2%>
<%= curlistRec.pubcamt1%>
<%= curlistRec.trgtamt1%>
<%= curlistRec.pubcamt2%>
<%= curlistRec.trgtamt2%>
<%= curlist2Rec.pubc_dt%>
<%= curlist2Rec.yoil%>
<%= curlist2Rec.pubc_side%>
<%= curlist2Rec.dn%>
<%= curlist2Rec.amt%>
<%= curlist22Rec.pubc_dt%>
<%= curlist22Rec.yoil%>
<%= curlist22Rec.pubc_side%>
<%= curlist22Rec.dn%>
<%= curlist22Rec.amt%>
<%= curlist3Rec.yy1%>
<%= curlist3Rec.cnt1%>
<%= curlist3Rec.medi_nm%>
<%= curlist3Rec.pubcamt1%>
<%= curlist3Rec.pubcamt2%>
<%= curlist3Rec.incamt%>
<%= curlist3Rec.incavg%>
<%= curlist3Rec.trgtamt%>
<%= curlist3Rec.shortamt%>
<%= curlist3Rec.shortavg%>
<%= curlist4Rec.yy1%>
<%= curlist4Rec.cnt1%>
<%= curlist4Rec.medi_nm%>
<%= curlist4Rec.pubcamt1%>
<%= curlist4Rec.pubcamt2%>
<%= curlist4Rec.incamt%>
<%= curlist4Rec.incavg%>
<%= curlist4Rec.trgtamt%>
<%= curlist4Rec.shortamt%>
<%= curlist4Rec.shortavg%>
<%= curlist5Rec.pubc_dt%>
<%= curlist5Rec.pubc_cnt%>
<%= curlist5Rec.issu_side%>
<%= curlist5Rec.addn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 01 15:02:52 KST 2009 */