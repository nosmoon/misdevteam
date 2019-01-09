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


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_3110_LCURLIST2Record;
import chosun.ciis.ad.dep.rec.AD_DEP_3110_LCURLIST3Record;
import chosun.ciis.ad.dep.rec.AD_DEP_3110_LCURLIST4Record;
import chosun.ciis.ad.dep.rec.AD_DEP_3110_LCURLIST5Record;
import chosun.ciis.ad.dep.rec.AD_DEP_3110_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_3110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_3110_LDataSet(){}
	public AD_DEP_3110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AD_DEP_3110_LCURLISTRecord rec = new AD_DEP_3110_LCURLISTRecord();
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.per_per_pubc_amt = Util.checkString(rset0.getString("per_per_pubc_amt"));
			rec.pre_pubc_amt = Util.checkString(rset0.getString("pre_pubc_amt"));
			rec.pubc_amt = Util.checkString(rset0.getString("pubc_amt"));
			rec.next_pubc_amt = Util.checkString(rset0.getString("next_pubc_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			AD_DEP_3110_LCURLIST2Record rec = new AD_DEP_3110_LCURLIST2Record();
			rec.pubc_amt01 = Util.checkString(rset1.getString("pubc_amt01"));
			rec.pubc_amt02 = Util.checkString(rset1.getString("pubc_amt02"));
			rec.pubc_amt03 = Util.checkString(rset1.getString("pubc_amt03"));
			rec.pubc_amt04 = Util.checkString(rset1.getString("pubc_amt04"));
			rec.pubc_amt05 = Util.checkString(rset1.getString("pubc_amt05"));
			rec.pubc_amt06 = Util.checkString(rset1.getString("pubc_amt06"));
			rec.pubc_amt07 = Util.checkString(rset1.getString("pubc_amt07"));
			rec.pubc_amt08 = Util.checkString(rset1.getString("pubc_amt08"));
			rec.pubc_amt09 = Util.checkString(rset1.getString("pubc_amt09"));
			rec.pubc_amt10 = Util.checkString(rset1.getString("pubc_amt10"));
			rec.pubc_amt11 = Util.checkString(rset1.getString("pubc_amt11"));
			rec.pubc_amt12 = Util.checkString(rset1.getString("pubc_amt12"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			AD_DEP_3110_LCURLIST3Record rec = new AD_DEP_3110_LCURLIST3Record();
			rec.rcpm_mm = Util.checkString(rset2.getString("rcpm_mm"));
			rec.rcpm_amt01 = Util.checkString(rset2.getString("rcpm_amt01"));
			rec.rcpm_amt02 = Util.checkString(rset2.getString("rcpm_amt02"));
			rec.rcpm_amt03 = Util.checkString(rset2.getString("rcpm_amt03"));
			rec.rcpm_amt04 = Util.checkString(rset2.getString("rcpm_amt04"));
			rec.rcpm_amt05 = Util.checkString(rset2.getString("rcpm_amt05"));
			rec.rcpm_amt06 = Util.checkString(rset2.getString("rcpm_amt06"));
			rec.rcpm_amt07 = Util.checkString(rset2.getString("rcpm_amt07"));
			rec.rcpm_amt08 = Util.checkString(rset2.getString("rcpm_amt08"));
			rec.rcpm_amt09 = Util.checkString(rset2.getString("rcpm_amt09"));
			rec.rcpm_amt10 = Util.checkString(rset2.getString("rcpm_amt10"));
			rec.rcpm_amt11 = Util.checkString(rset2.getString("rcpm_amt11"));
			rec.rcpm_amt12 = Util.checkString(rset2.getString("rcpm_amt12"));
			rec.rcpm_amt00 = Util.checkString(rset2.getString("rcpm_amt00"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			AD_DEP_3110_LCURLIST4Record rec = new AD_DEP_3110_LCURLIST4Record();
			rec.pubc_amt1 = Util.checkString(rset3.getString("pubc_amt1"));
			rec.pubc_amt2 = Util.checkString(rset3.getString("pubc_amt2"));
			rec.pubc_amt3 = Util.checkString(rset3.getString("pubc_amt3"));
			rec.pubc_amt4 = Util.checkString(rset3.getString("pubc_amt4"));
			rec.pubc_amt5 = Util.checkString(rset3.getString("pubc_amt5"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			AD_DEP_3110_LCURLIST5Record rec = new AD_DEP_3110_LCURLIST5Record();
			rec.rcpm_yymm = Util.checkString(rset4.getString("rcpm_yymm"));
			rec.rcpm_amt01 = Util.checkString(rset4.getString("rcpm_amt01"));
			rec.rcpm_amt02 = Util.checkString(rset4.getString("rcpm_amt02"));
			rec.rcpm_amt03 = Util.checkString(rset4.getString("rcpm_amt03"));
			rec.rcpm_amt04 = Util.checkString(rset4.getString("rcpm_amt04"));
			rec.rcpm_amt05 = Util.checkString(rset4.getString("rcpm_amt05"));
			this.curlist5.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_3110_LDataSet ds = (AD_DEP_3110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_3110_LCURLISTRecord curlistRec = (AD_DEP_3110_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_DEP_3110_LCURLIST2Record curlist2Rec = (AD_DEP_3110_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_DEP_3110_LCURLIST3Record curlist3Rec = (AD_DEP_3110_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_DEP_3110_LCURLIST4Record curlist4Rec = (AD_DEP_3110_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_DEP_3110_LCURLIST5Record curlist5Rec = (AD_DEP_3110_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.gubun%>
<%= curlistRec.per_per_pubc_amt%>
<%= curlistRec.pre_pubc_amt%>
<%= curlistRec.pubc_amt%>
<%= curlistRec.next_pubc_amt%>
<%= curlistRec.tot_amt%>
<%= curlist2Rec.pubc_amt01%>
<%= curlist2Rec.pubc_amt02%>
<%= curlist2Rec.pubc_amt03%>
<%= curlist2Rec.pubc_amt04%>
<%= curlist2Rec.pubc_amt05%>
<%= curlist2Rec.pubc_amt06%>
<%= curlist2Rec.pubc_amt07%>
<%= curlist2Rec.pubc_amt08%>
<%= curlist2Rec.pubc_amt09%>
<%= curlist2Rec.pubc_amt10%>
<%= curlist2Rec.pubc_amt11%>
<%= curlist2Rec.pubc_amt12%>
<%= curlist3Rec.rcpm_mm%>
<%= curlist3Rec.rcpm_amt01%>
<%= curlist3Rec.rcpm_amt02%>
<%= curlist3Rec.rcpm_amt03%>
<%= curlist3Rec.rcpm_amt04%>
<%= curlist3Rec.rcpm_amt05%>
<%= curlist3Rec.rcpm_amt06%>
<%= curlist3Rec.rcpm_amt07%>
<%= curlist3Rec.rcpm_amt08%>
<%= curlist3Rec.rcpm_amt09%>
<%= curlist3Rec.rcpm_amt10%>
<%= curlist3Rec.rcpm_amt11%>
<%= curlist3Rec.rcpm_amt12%>
<%= curlist3Rec.rcpm_amt00%>
<%= curlist4Rec.pubc_amt1%>
<%= curlist4Rec.pubc_amt2%>
<%= curlist4Rec.pubc_amt3%>
<%= curlist4Rec.pubc_amt4%>
<%= curlist4Rec.pubc_amt5%>
<%= curlist5Rec.rcpm_yymm%>
<%= curlist5Rec.rcpm_amt01%>
<%= curlist5Rec.rcpm_amt02%>
<%= curlist5Rec.rcpm_amt03%>
<%= curlist5Rec.rcpm_amt04%>
<%= curlist5Rec.rcpm_amt05%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 17 10:06:44 KST 2009 */