/***************************************************************************************************
* 파일명 : .java
* 기능 : 광고매출분석
* 작성일자 : 2010.09.10
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.pub.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.pub.rec.AD_PUB_3000_MCURLISTRecord;

/**
 * 
 */


public class AD_PUB_3000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_3000_MDataSet(){}
	public AD_PUB_3000_MDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AD_PUB_3000_MCURLISTRecord rec = new AD_PUB_3000_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist1.add(rec);
		}		
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			AD_PUB_3000_MCURLISTRecord rec = new AD_PUB_3000_MCURLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			AD_PUB_3000_MCURLISTRecord rec = new AD_PUB_3000_MCURLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset2.getString("mang_cd_1"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			AD_PUB_3000_MCURLISTRecord rec = new AD_PUB_3000_MCURLISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset3.getString("mang_cd_1"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			AD_PUB_3000_MCURLISTRecord rec = new AD_PUB_3000_MCURLISTRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset4.getString("mang_cd_1"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			AD_PUB_3000_MCURLISTRecord rec = new AD_PUB_3000_MCURLISTRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset5.getString("mang_cd_1"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(12);
		while(rset6.next()){
			AD_PUB_3000_MCURLISTRecord rec = new AD_PUB_3000_MCURLISTRecord();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			this.curlist7.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_2100_MDataSet ds = (AD_PUB_2100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2100_MCURLISTRecord curlistRec = (AD_PUB_2100_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 04 19:54:56 KST 2009 */