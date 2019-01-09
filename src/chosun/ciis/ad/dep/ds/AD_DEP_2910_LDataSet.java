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
import chosun.ciis.ad.dep.rec.AD_DEP_2910_LCURLIST2Record;
import chosun.ciis.ad.dep.rec.AD_DEP_2910_LCURLIST3Record;
import chosun.ciis.ad.dep.rec.AD_DEP_2910_LCURLIST4Record;
import chosun.ciis.ad.dep.rec.AD_DEP_2910_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_2910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_2910_LDataSet(){}
	public AD_DEP_2910_LDataSet(String errcode, String errmsg){
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
			AD_DEP_2910_LCURLISTRecord rec = new AD_DEP_2910_LCURLISTRecord();
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.medi_110 = Util.checkString(rset0.getString("medi_110"));
			rec.medi_130 = Util.checkString(rset0.getString("medi_130"));
			rec.medi_190 = Util.checkString(rset0.getString("medi_190"));
			rec.medi_210 = Util.checkString(rset0.getString("medi_210"));
			rec.medi_230 = Util.checkString(rset0.getString("medi_230"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			AD_DEP_2910_LCURLIST2Record rec = new AD_DEP_2910_LCURLIST2Record();
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.issu_dt = Util.checkString(rset1.getString("issu_dt"));
			rec.issu_side = Util.checkString(rset1.getString("issu_side"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			AD_DEP_2910_LCURLIST3Record rec = new AD_DEP_2910_LCURLIST3Record();
			rec.pubc_amt01 = Util.checkString(rset2.getString("pubc_amt01"));
			rec.pubc_amt02 = Util.checkString(rset2.getString("pubc_amt02"));
			rec.pubc_amt03 = Util.checkString(rset2.getString("pubc_amt03"));
			rec.pubc_amt04 = Util.checkString(rset2.getString("pubc_amt04"));
			rec.pubc_amt05 = Util.checkString(rset2.getString("pubc_amt05"));
			rec.pubc_amt07 = Util.checkString(rset2.getString("pubc_amt07"));
			rec.pubc_amt09 = Util.checkString(rset2.getString("pubc_amt09"));
			rec.rcpm_amt01 = Util.checkString(rset2.getString("rcpm_amt01"));
			rec.rcpm_amt02 = Util.checkString(rset2.getString("rcpm_amt02"));
			rec.rcpm_amt03 = Util.checkString(rset2.getString("rcpm_amt03"));
			rec.rcpm_amt04 = Util.checkString(rset2.getString("rcpm_amt04"));
			rec.rcpm_amt05 = Util.checkString(rset2.getString("rcpm_amt05"));
			rec.rcpm_amt07 = Util.checkString(rset2.getString("rcpm_amt07"));
			rec.rcpm_amt09 = Util.checkString(rset2.getString("rcpm_amt09"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			AD_DEP_2910_LCURLIST4Record rec = new AD_DEP_2910_LCURLIST4Record();
			rec.pre_pre_year1 = Util.checkString(rset3.getString("pre_pre_year1"));
			rec.pre_pre_year2 = Util.checkString(rset3.getString("pre_pre_year2"));
			rec.pre_pre_tot3 = Util.checkString(rset3.getString("pre_pre_tot3"));
			rec.pre_year1 = Util.checkString(rset3.getString("pre_year1"));
			rec.pre_year2 = Util.checkString(rset3.getString("pre_year2"));
			rec.pre_tot3 = Util.checkString(rset3.getString("pre_tot3"));
			rec.now_year1 = Util.checkString(rset3.getString("now_year1"));
			rec.now_year2 = Util.checkString(rset3.getString("now_year2"));
			rec.now_tot3 = Util.checkString(rset3.getString("now_tot3"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_2910_LDataSet ds = (AD_DEP_2910_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_2910_LCURLISTRecord curlistRec = (AD_DEP_2910_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_DEP_2910_LCURLIST2Record curlist2Rec = (AD_DEP_2910_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_DEP_2910_LCURLIST3Record curlist3Rec = (AD_DEP_2910_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_DEP_2910_LCURLIST4Record curlist4Rec = (AD_DEP_2910_LCURLIST4Record)ds.curlist4.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.gubun%>
<%= curlistRec.medi_110%>
<%= curlistRec.medi_130%>
<%= curlistRec.medi_190%>
<%= curlistRec.medi_210%>
<%= curlistRec.medi_230%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.issu_dt%>
<%= curlist2Rec.issu_side%>
<%= curlist3Rec.pubc_amt01%>
<%= curlist3Rec.pubc_amt02%>
<%= curlist3Rec.pubc_amt03%>
<%= curlist3Rec.pubc_amt04%>
<%= curlist3Rec.pubc_amt05%>
<%= curlist3Rec.pubc_amt07%>
<%= curlist3Rec.pubc_amt09%>
<%= curlist3Rec.rcpm_amt01%>
<%= curlist3Rec.rcpm_amt02%>
<%= curlist3Rec.rcpm_amt03%>
<%= curlist3Rec.rcpm_amt04%>
<%= curlist3Rec.rcpm_amt05%>
<%= curlist3Rec.rcpm_amt07%>
<%= curlist3Rec.rcpm_amt09%>
<%= curlist4Rec.pre_pre_year1%>
<%= curlist4Rec.pre_pre_year2%>
<%= curlist4Rec.pre_pre_tot3%>
<%= curlist4Rec.pre_year1%>
<%= curlist4Rec.pre_year2%>
<%= curlist4Rec.pre_tot3%>
<%= curlist4Rec.now_year1%>
<%= curlist4Rec.now_year2%>
<%= curlist4Rec.now_tot3%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 11:45:19 KST 2009 */