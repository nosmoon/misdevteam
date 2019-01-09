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


package chosun.ciis.hd.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.dm.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_1009_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist0 = new ArrayList();
	public ArrayList curlist10 = new ArrayList();
	public ArrayList curlist9 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String pay_cost;

	public HD_COST_1009_MDataSet(){}
	public HD_COST_1009_MDataSet(String errcode, String errmsg, String pay_cost){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.pay_cost = pay_cost;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPay_cost(String pay_cost){
		this.pay_cost = pay_cost;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPay_cost(){
		return this.pay_cost;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			HD_COST_1009_MCURLIST0Record rec = new HD_COST_1009_MCURLIST0Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset0.getString("mang_cd_1"));
			this.curlist0.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			HD_COST_1009_MCURLIST1Record rec = new HD_COST_1009_MCURLIST1Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset1.getString("mang_cd_1"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			HD_COST_1009_MCURLIST2Record rec = new HD_COST_1009_MCURLIST2Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset2.getString("mang_cd_1"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			HD_COST_1009_MCURLIST3Record rec = new HD_COST_1009_MCURLIST3Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset3.getString("mang_cd_1"));
			this.curlist3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			HD_COST_1009_MCURLIST4Record rec = new HD_COST_1009_MCURLIST4Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset4.getString("mang_cd_1"));
			this.curlist4.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(9);
		while(rset5.next()){
			HD_COST_1009_MCURLIST5Record rec = new HD_COST_1009_MCURLIST5Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset5.getString("mang_cd_1"));
			this.curlist5.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(10);
		while(rset6.next()){
			HD_COST_1009_MCURLIST6Record rec = new HD_COST_1009_MCURLIST6Record();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset6.getString("mang_cd_1"));
			this.curlist6.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(11);
		while(rset7.next()){
			HD_COST_1009_MCURLIST7Record rec = new HD_COST_1009_MCURLIST7Record();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset7.getString("mang_cd_1"));
			this.curlist7.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(12);
		while(rset8.next()){
			HD_COST_1009_MCURLIST8Record rec = new HD_COST_1009_MCURLIST8Record();
			rec.cd = Util.checkString(rset8.getString("cd"));
			rec.cdnm = Util.checkString(rset8.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset8.getString("mang_cd_1"));
			this.curlist8.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(13);
		while(rset9.next()){
			HD_COST_1009_MCURLIST9Record rec = new HD_COST_1009_MCURLIST9Record();
			rec.cd = Util.checkString(rset9.getString("cd"));
			rec.cdnm = Util.checkString(rset9.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset9.getString("mang_cd_1"));
			this.curlist9.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(14);
		while(rset10.next()){
			HD_COST_1009_MCURLIST10Record rec = new HD_COST_1009_MCURLIST10Record();
			rec.cd = Util.checkString(rset10.getString("cd"));
			rec.cdnm = Util.checkString(rset10.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset10.getString("mang_cd_1"));
			this.curlist10.add(rec);
		}
		this.pay_cost = Util.checkString(cstmt.getString(15));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_COST_1009_MDataSet ds = (HD_COST_1009_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist0.size(); i++){
		HD_COST_1009_MCURLIST0Record curlist0Rec = (HD_COST_1009_MCURLIST0Record)ds.curlist0.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_COST_1009_MCURLIST1Record curlist1Rec = (HD_COST_1009_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_COST_1009_MCURLIST2Record curlist2Rec = (HD_COST_1009_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_COST_1009_MCURLIST3Record curlist3Rec = (HD_COST_1009_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_COST_1009_MCURLIST4Record curlist4Rec = (HD_COST_1009_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		HD_COST_1009_MCURLIST5Record curlist5Rec = (HD_COST_1009_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		HD_COST_1009_MCURLIST6Record curlist6Rec = (HD_COST_1009_MCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		HD_COST_1009_MCURLIST7Record curlist7Rec = (HD_COST_1009_MCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		HD_COST_1009_MCURLIST8Record curlist8Rec = (HD_COST_1009_MCURLIST8Record)ds.curlist8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist9.size(); i++){
		HD_COST_1009_MCURLIST9Record curlist9Rec = (HD_COST_1009_MCURLIST9Record)ds.curlist9.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist10.size(); i++){
		HD_COST_1009_MCURLIST10Record curlist10Rec = (HD_COST_1009_MCURLIST10Record)ds.curlist10.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist0()%>
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
<%= ds.getPay_cost()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist0Rec.cd%>
<%= curlist0Rec.cdnm%>
<%= curlist0Rec.mang_cd_1%>
<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.mang_cd_1%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.mang_cd_1%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.mang_cd_1%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist4Rec.mang_cd_1%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cdnm%>
<%= curlist5Rec.mang_cd_1%>
<%= curlist6Rec.cd%>
<%= curlist6Rec.cdnm%>
<%= curlist6Rec.mang_cd_1%>
<%= curlist7Rec.cd%>
<%= curlist7Rec.cdnm%>
<%= curlist7Rec.mang_cd_1%>
<%= curlist8Rec.cd%>
<%= curlist8Rec.cdnm%>
<%= curlist8Rec.mang_cd_1%>
<%= curlist9Rec.cd%>
<%= curlist9Rec.cdnm%>
<%= curlist9Rec.mang_cd_1%>
<%= curlist10Rec.cd%>
<%= curlist10Rec.cdnm%>
<%= curlist10Rec.mang_cd_1%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 31 15:55:05 KST 2018 */