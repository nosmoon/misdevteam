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


package chosun.ciis.hd.insr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1600_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist10 = new ArrayList();
	public ArrayList curlist9 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INSR_1600_LDataSet(){}
	public HD_INSR_1600_LDataSet(String errcode, String errmsg){
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
			HD_INSR_1600_LCURLIST1Record rec = new HD_INSR_1600_LCURLIST1Record();
			rec.tot_saly_sum_a = Util.checkString(rset0.getString("tot_saly_sum_a"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_INSR_1600_LCURLIST2Record rec = new HD_INSR_1600_LCURLIST2Record();
			rec.tot_saly_human_sum_a = Util.checkString(rset1.getString("tot_saly_human_sum_a"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			HD_INSR_1600_LCURLIST3Record rec = new HD_INSR_1600_LCURLIST3Record();
			rec.bns_sum_tm = Util.checkString(rset2.getString("bns_sum_tm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			HD_INSR_1600_LCURLIST4Record rec = new HD_INSR_1600_LCURLIST4Record();
			rec.bns_human_sum_tm = Util.checkString(rset3.getString("bns_human_sum_tm"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			HD_INSR_1600_LCURLIST5Record rec = new HD_INSR_1600_LCURLIST5Record();
			rec.tot_alon_sum_a = Util.checkString(rset4.getString("tot_alon_sum_a"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			HD_INSR_1600_LCURLIST6Record rec = new HD_INSR_1600_LCURLIST6Record();
			rec.tot_alon_human_sum_a = Util.checkString(rset5.getString("tot_alon_human_sum_a"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			HD_INSR_1600_LCURLIST7Record rec = new HD_INSR_1600_LCURLIST7Record();
			rec.tot_sum_b = Util.checkString(rset6.getString("tot_sum_b"));
			this.curlist7.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(12);
		while(rset7.next()){
			HD_INSR_1600_LCURLIST8Record rec = new HD_INSR_1600_LCURLIST8Record();
			rec.tot_human_sum_b = Util.checkString(rset7.getString("tot_human_sum_b"));
			this.curlist8.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(13);
		while(rset8.next()){
			HD_INSR_1600_LCURLIST9Record rec = new HD_INSR_1600_LCURLIST9Record();
			rec.tot_sum_tm = Util.checkString(rset8.getString("tot_sum_tm"));
			this.curlist9.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(14);
		while(rset9.next()){
			HD_INSR_1600_LCURLIST10Record rec = new HD_INSR_1600_LCURLIST10Record();
			rec.tot_human_sum_tm = Util.checkString(rset9.getString("tot_human_sum_tm"));
			this.curlist10.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INSR_1600_LDataSet ds = (HD_INSR_1600_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INSR_1600_LCURLIST1Record curlist1Rec = (HD_INSR_1600_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_INSR_1600_LCURLIST2Record curlist2Rec = (HD_INSR_1600_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_INSR_1600_LCURLIST3Record curlist3Rec = (HD_INSR_1600_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_INSR_1600_LCURLIST4Record curlist4Rec = (HD_INSR_1600_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		HD_INSR_1600_LCURLIST5Record curlist5Rec = (HD_INSR_1600_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		HD_INSR_1600_LCURLIST6Record curlist6Rec = (HD_INSR_1600_LCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		HD_INSR_1600_LCURLIST7Record curlist7Rec = (HD_INSR_1600_LCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		HD_INSR_1600_LCURLIST8Record curlist8Rec = (HD_INSR_1600_LCURLIST8Record)ds.curlist8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist9.size(); i++){
		HD_INSR_1600_LCURLIST9Record curlist9Rec = (HD_INSR_1600_LCURLIST9Record)ds.curlist9.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist10.size(); i++){
		HD_INSR_1600_LCURLIST10Record curlist10Rec = (HD_INSR_1600_LCURLIST10Record)ds.curlist10.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
<%= ds.getCurlist7()%>
<%= ds.getCurlist8()%>
<%= ds.getCurlist9()%>
<%= ds.getCurlist10()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.tot_saly_sum_a%>
<%= curlist2Rec.tot_saly_human_sum_a%>
<%= curlist3Rec.bns_sum_tm%>
<%= curlist4Rec.bns_human_sum_tm%>
<%= curlist5Rec.tot_alon_sum_a%>
<%= curlist6Rec.tot_alon_human_sum_a%>
<%= curlist7Rec.tot_sum_b%>
<%= curlist8Rec.tot_human_sum_b%>
<%= curlist9Rec.tot_sum_tm%>
<%= curlist10Rec.tot_human_sum_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 08 17:51:17 KST 2009 */