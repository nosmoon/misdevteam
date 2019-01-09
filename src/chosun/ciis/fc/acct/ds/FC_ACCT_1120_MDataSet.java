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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1120_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_pay_cycl_cd_010;
	public String xx_pay_cycl_cd_020;
	public String xx_pay_cycl_cd_030;
	public String xx_ch_010;
	public String xx_ch_020;
	public String xx_ch_030;
	public String xx_ch_040;
	public String xx_ch_050;
	public String xx_ch_060;

	public FC_ACCT_1120_MDataSet(){}
	public FC_ACCT_1120_MDataSet(String errcode, String errmsg, String xx_pay_cycl_cd_010, String xx_pay_cycl_cd_020, String xx_pay_cycl_cd_030, String xx_ch_010, String xx_ch_020, String xx_ch_030, String xx_ch_040, String xx_ch_050, String xx_ch_060){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_pay_cycl_cd_010 = xx_pay_cycl_cd_010;
		this.xx_pay_cycl_cd_020 = xx_pay_cycl_cd_020;
		this.xx_pay_cycl_cd_030 = xx_pay_cycl_cd_030;
		this.xx_ch_010 = xx_ch_010;
		this.xx_ch_020 = xx_ch_020;
		this.xx_ch_030 = xx_ch_030;
		this.xx_ch_040 = xx_ch_040;
		this.xx_ch_050 = xx_ch_050;
		this.xx_ch_060 = xx_ch_060;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_pay_cycl_cd_010(String xx_pay_cycl_cd_010){
		this.xx_pay_cycl_cd_010 = xx_pay_cycl_cd_010;
	}

	public void setXx_pay_cycl_cd_020(String xx_pay_cycl_cd_020){
		this.xx_pay_cycl_cd_020 = xx_pay_cycl_cd_020;
	}

	public void setXx_pay_cycl_cd_030(String xx_pay_cycl_cd_030){
		this.xx_pay_cycl_cd_030 = xx_pay_cycl_cd_030;
	}

	public void setXx_ch_010(String xx_ch_010){
		this.xx_ch_010 = xx_ch_010;
	}

	public void setXx_ch_020(String xx_ch_020){
		this.xx_ch_020 = xx_ch_020;
	}

	public void setXx_ch_030(String xx_ch_030){
		this.xx_ch_030 = xx_ch_030;
	}

	public void setXx_ch_040(String xx_ch_040){
		this.xx_ch_040 = xx_ch_040;
	}

	public void setXx_ch_050(String xx_ch_050){
		this.xx_ch_050 = xx_ch_050;
	}

	public void setXx_ch_060(String xx_ch_060){
		this.xx_ch_060 = xx_ch_060;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_pay_cycl_cd_010(){
		return this.xx_pay_cycl_cd_010;
	}

	public String getXx_pay_cycl_cd_020(){
		return this.xx_pay_cycl_cd_020;
	}

	public String getXx_pay_cycl_cd_030(){
		return this.xx_pay_cycl_cd_030;
	}

	public String getXx_ch_010(){
		return this.xx_ch_010;
	}

	public String getXx_ch_020(){
		return this.xx_ch_020;
	}

	public String getXx_ch_030(){
		return this.xx_ch_030;
	}

	public String getXx_ch_040(){
		return this.xx_ch_040;
	}

	public String getXx_ch_050(){
		return this.xx_ch_050;
	}

	public String getXx_ch_060(){
		return this.xx_ch_060;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_1120_MCURLIST1Record rec = new FC_ACCT_1120_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_1120_MCURLIST2Record rec = new FC_ACCT_1120_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_1120_MCURLIST3Record rec = new FC_ACCT_1120_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_ACCT_1120_MCURLIST4Record rec = new FC_ACCT_1120_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_ACCT_1120_MCURLIST5Record rec = new FC_ACCT_1120_MCURLIST5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			FC_ACCT_1120_MCURLIST6Record rec = new FC_ACCT_1120_MCURLIST6Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			FC_ACCT_1120_MCURLIST7Record rec = new FC_ACCT_1120_MCURLIST7Record();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			this.curlist7.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(12);
		while(rset7.next()){
			FC_ACCT_1120_MCURLIST8Record rec = new FC_ACCT_1120_MCURLIST8Record();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			this.curlist8.add(rec);
		}
		this.xx_pay_cycl_cd_010 = Util.checkString(cstmt.getString(13));
		this.xx_pay_cycl_cd_020 = Util.checkString(cstmt.getString(14));
		this.xx_pay_cycl_cd_030 = Util.checkString(cstmt.getString(15));
		this.xx_ch_010 = Util.checkString(cstmt.getString(16));
		this.xx_ch_020 = Util.checkString(cstmt.getString(17));
		this.xx_ch_030 = Util.checkString(cstmt.getString(18));
		this.xx_ch_040 = Util.checkString(cstmt.getString(19));
		this.xx_ch_050 = Util.checkString(cstmt.getString(20));
		this.xx_ch_060 = Util.checkString(cstmt.getString(21));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_1120_MDataSet ds = (FC_ACCT_1120_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_1120_MCURLIST1Record curlist1Rec = (FC_ACCT_1120_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_1120_MCURLIST2Record curlist2Rec = (FC_ACCT_1120_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_ACCT_1120_MCURLIST3Record curlist3Rec = (FC_ACCT_1120_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		FC_ACCT_1120_MCURLIST4Record curlist4Rec = (FC_ACCT_1120_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		FC_ACCT_1120_MCURLIST5Record curlist5Rec = (FC_ACCT_1120_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		FC_ACCT_1120_MCURLIST6Record curlist6Rec = (FC_ACCT_1120_MCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		FC_ACCT_1120_MCURLIST7Record curlist7Rec = (FC_ACCT_1120_MCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		FC_ACCT_1120_MCURLIST8Record curlist8Rec = (FC_ACCT_1120_MCURLIST8Record)ds.curlist8.get(i);%>
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
<%= ds.getXx_pay_cycl_cd_010()%>
<%= ds.getXx_pay_cycl_cd_020()%>
<%= ds.getXx_pay_cycl_cd_030()%>
<%= ds.getXx_ch_010()%>
<%= ds.getXx_ch_020()%>
<%= ds.getXx_ch_030()%>
<%= ds.getXx_ch_040()%>
<%= ds.getXx_ch_050()%>
<%= ds.getXx_ch_060()%>
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
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 06 15:05:15 KST 2012 */