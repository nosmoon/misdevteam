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


package chosun.ciis.ad.pub.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist13 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist12 = new ArrayList();
	public ArrayList curlist11 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist10 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist20 = new ArrayList();
	public ArrayList curlist19 = new ArrayList();
	public ArrayList curlist18 = new ArrayList();
	public ArrayList curlist17 = new ArrayList();
	public ArrayList curlist16 = new ArrayList();
	public ArrayList curlist9 = new ArrayList();
	public ArrayList curlist15 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist14 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_1000_MDataSet(){}
	public AD_PUB_1000_MDataSet(String errcode, String errmsg){
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
			AD_PUB_1000_MCURLIST1Record rec = new AD_PUB_1000_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AD_PUB_1000_MCURLIST2Record rec = new AD_PUB_1000_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			AD_PUB_1000_MCURLIST3Record rec = new AD_PUB_1000_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			AD_PUB_1000_MCURLIST4Record rec = new AD_PUB_1000_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			AD_PUB_1000_MCURLIST5Record rec = new AD_PUB_1000_MCURLIST5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			AD_PUB_1000_MCURLIST6Record rec = new AD_PUB_1000_MCURLIST6Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			AD_PUB_1000_MCURLIST7Record rec = new AD_PUB_1000_MCURLIST7Record();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			this.curlist7.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(12);
		while(rset7.next()){
			AD_PUB_1000_MCURLIST8Record rec = new AD_PUB_1000_MCURLIST8Record();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			this.curlist8.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(13);
		while(rset8.next()){
			AD_PUB_1000_MCURLIST9Record rec = new AD_PUB_1000_MCURLIST9Record();
			rec.cd = Util.checkString(rset8.getString("cd"));
			rec.cdnm = Util.checkString(rset8.getString("cdnm"));
			this.curlist9.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(14);
		while(rset9.next()){
			AD_PUB_1000_MCURLIST10Record rec = new AD_PUB_1000_MCURLIST10Record();
			rec.cd = Util.checkString(rset9.getString("cd"));
			rec.cdnm = Util.checkString(rset9.getString("cdnm"));
			this.curlist10.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(15);
		while(rset10.next()){
			AD_PUB_1000_MCURLIST11Record rec = new AD_PUB_1000_MCURLIST11Record();
			rec.cd = Util.checkString(rset10.getString("cd"));
			rec.cdnm = Util.checkString(rset10.getString("cdnm"));
			this.curlist11.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(16);
		while(rset11.next()){
			AD_PUB_1000_MCURLIST12Record rec = new AD_PUB_1000_MCURLIST12Record();
			rec.cd = Util.checkString(rset11.getString("cd"));
			rec.cdnm = Util.checkString(rset11.getString("cdnm"));
			this.curlist12.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(17);
		while(rset12.next()){
			AD_PUB_1000_MCURLIST13Record rec = new AD_PUB_1000_MCURLIST13Record();
			rec.cd = Util.checkString(rset12.getString("cd"));
			rec.cdnm = Util.checkString(rset12.getString("cdnm"));
			this.curlist13.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(18);
		while(rset13.next()){
			AD_PUB_1000_MCURLIST14Record rec = new AD_PUB_1000_MCURLIST14Record();
			rec.cd = Util.checkString(rset13.getString("cd"));
			rec.cdnm = Util.checkString(rset13.getString("cdnm"));
			this.curlist14.add(rec);
		}
		ResultSet rset14 = (ResultSet) cstmt.getObject(19);
		while(rset14.next()){
			AD_PUB_1000_MCURLIST15Record rec = new AD_PUB_1000_MCURLIST15Record();
			rec.cd = Util.checkString(rset14.getString("cd"));
			rec.cdnm = Util.checkString(rset14.getString("cdnm"));
			this.curlist15.add(rec);
		}
		ResultSet rset15 = (ResultSet) cstmt.getObject(20);
		while(rset15.next()){
			AD_PUB_1000_MCURLIST16Record rec = new AD_PUB_1000_MCURLIST16Record();
			rec.cd = Util.checkString(rset15.getString("cd"));
			rec.cdnm = Util.checkString(rset15.getString("cdnm"));
			this.curlist16.add(rec);
		}
		ResultSet rset16 = (ResultSet) cstmt.getObject(21);
		while(rset16.next()){
			AD_PUB_1000_MCURLIST17Record rec = new AD_PUB_1000_MCURLIST17Record();
			rec.cd = Util.checkString(rset16.getString("cd"));
			rec.cdnm = Util.checkString(rset16.getString("cdnm"));
			this.curlist17.add(rec);
		}
		ResultSet rset17 = (ResultSet) cstmt.getObject(22);
		while(rset17.next()){
			AD_PUB_1000_MCURLIST18Record rec = new AD_PUB_1000_MCURLIST18Record();
			rec.cd = Util.checkString(rset17.getString("cd"));
			rec.cdnm = Util.checkString(rset17.getString("cdnm"));
			this.curlist18.add(rec);
		}
		ResultSet rset18 = (ResultSet) cstmt.getObject(23);
		while(rset18.next()){
			AD_PUB_1000_MCURLIST19Record rec = new AD_PUB_1000_MCURLIST19Record();
			rec.cd = Util.checkString(rset18.getString("cd"));
			rec.cdnm = Util.checkString(rset18.getString("cdnm"));
			this.curlist19.add(rec);
		}
		ResultSet rset19 = (ResultSet) cstmt.getObject(24);
		while(rset19.next()){
			AD_PUB_1000_MCURLIST20Record rec = new AD_PUB_1000_MCURLIST20Record();
			rec.cd = Util.checkString(rset19.getString("cd"));
			rec.cdnm = Util.checkString(rset19.getString("cdnm"));
			this.curlist20.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1000_MDataSet ds = (AD_PUB_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_PUB_1000_MCURLIST1Record curlist1Rec = (AD_PUB_1000_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_PUB_1000_MCURLIST2Record curlist2Rec = (AD_PUB_1000_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_PUB_1000_MCURLIST3Record curlist3Rec = (AD_PUB_1000_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_PUB_1000_MCURLIST4Record curlist4Rec = (AD_PUB_1000_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_PUB_1000_MCURLIST5Record curlist5Rec = (AD_PUB_1000_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		AD_PUB_1000_MCURLIST6Record curlist6Rec = (AD_PUB_1000_MCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		AD_PUB_1000_MCURLIST7Record curlist7Rec = (AD_PUB_1000_MCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		AD_PUB_1000_MCURLIST8Record curlist8Rec = (AD_PUB_1000_MCURLIST8Record)ds.curlist8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist9.size(); i++){
		AD_PUB_1000_MCURLIST9Record curlist9Rec = (AD_PUB_1000_MCURLIST9Record)ds.curlist9.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist10.size(); i++){
		AD_PUB_1000_MCURLIST10Record curlist10Rec = (AD_PUB_1000_MCURLIST10Record)ds.curlist10.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist11.size(); i++){
		AD_PUB_1000_MCURLIST11Record curlist11Rec = (AD_PUB_1000_MCURLIST11Record)ds.curlist11.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist12.size(); i++){
		AD_PUB_1000_MCURLIST12Record curlist12Rec = (AD_PUB_1000_MCURLIST12Record)ds.curlist12.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist13.size(); i++){
		AD_PUB_1000_MCURLIST13Record curlist13Rec = (AD_PUB_1000_MCURLIST13Record)ds.curlist13.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist14.size(); i++){
		AD_PUB_1000_MCURLIST14Record curlist14Rec = (AD_PUB_1000_MCURLIST14Record)ds.curlist14.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist15.size(); i++){
		AD_PUB_1000_MCURLIST15Record curlist15Rec = (AD_PUB_1000_MCURLIST15Record)ds.curlist15.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist16.size(); i++){
		AD_PUB_1000_MCURLIST16Record curlist16Rec = (AD_PUB_1000_MCURLIST16Record)ds.curlist16.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist17.size(); i++){
		AD_PUB_1000_MCURLIST17Record curlist17Rec = (AD_PUB_1000_MCURLIST17Record)ds.curlist17.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist18.size(); i++){
		AD_PUB_1000_MCURLIST18Record curlist18Rec = (AD_PUB_1000_MCURLIST18Record)ds.curlist18.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist19.size(); i++){
		AD_PUB_1000_MCURLIST19Record curlist19Rec = (AD_PUB_1000_MCURLIST19Record)ds.curlist19.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist20.size(); i++){
		AD_PUB_1000_MCURLIST20Record curlist20Rec = (AD_PUB_1000_MCURLIST20Record)ds.curlist20.get(i);%>
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
<%= ds.getCurlist11()%>
<%= ds.getCurlist12()%>
<%= ds.getCurlist13()%>
<%= ds.getCurlist14()%>
<%= ds.getCurlist15()%>
<%= ds.getCurlist16()%>
<%= ds.getCurlist17()%>
<%= ds.getCurlist18()%>
<%= ds.getCurlist19()%>
<%= ds.getCurlist20()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cdnm%>
<%= curlist6Rec.cd%>
<%= curlist6Rec.cdnm%>
<%= curlist7Rec.cd%>
<%= curlist7Rec.cdnm%>
<%= curlist8Rec.cd%>
<%= curlist8Rec.cdnm%>
<%= curlist9Rec.cd%>
<%= curlist9Rec.cdnm%>
<%= curlist10Rec.cd%>
<%= curlist10Rec.cdnm%>
<%= curlist11Rec.cd%>
<%= curlist11Rec.cdnm%>
<%= curlist12Rec.cd%>
<%= curlist12Rec.cdnm%>
<%= curlist13Rec.cd%>
<%= curlist13Rec.cdnm%>
<%= curlist14Rec.cd%>
<%= curlist14Rec.cdnm%>
<%= curlist15Rec.cd%>
<%= curlist15Rec.cdnm%>
<%= curlist16Rec.cd%>
<%= curlist16Rec.cdnm%>
<%= curlist17Rec.cd%>
<%= curlist17Rec.cdnm%>
<%= curlist18Rec.cd%>
<%= curlist18Rec.cdnm%>
<%= curlist19Rec.cd%>
<%= curlist19Rec.cdnm%>
<%= curlist20Rec.cd%>
<%= curlist20Rec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 26 19:02:31 KST 2017 */