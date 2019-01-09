/***************************************************************************************************
* 파일명 : SE_COMM_2400_MDataSet.java
* 기능 :  수송업자 팝업
* 작성일자 : 2009.06.09
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_2400_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList prtlist = new ArrayList();
	public ArrayList routelist = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList corplist = new ArrayList();
	public ArrayList banklist = new ArrayList();
	public ArrayList medilist = new ArrayList();
	public ArrayList sectlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_COMM_2400_MDataSet(){}
	public SE_COMM_2400_MDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_COMM_2400_MCURLISTRecord rec = new SE_COMM_2400_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SE_COMM_2400_MROUTELISTRecord rec = new SE_COMM_2400_MROUTELISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.routelist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			SE_COMM_2400_MPRTLISTRecord rec = new SE_COMM_2400_MPRTLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.prtlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			SE_COMM_2400_MCORPLISTRecord rec = new SE_COMM_2400_MCORPLISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			this.corplist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			SE_COMM_2400_MBANKLISTRecord rec = new SE_COMM_2400_MBANKLISTRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			this.banklist.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			SE_COMM_2400_MMEDILISTRecord rec = new SE_COMM_2400_MMEDILISTRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			this.medilist.add(rec);
		}
		
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			SE_COMM_2400_MSECTLISTRecord rec = new SE_COMM_2400_MSECTLISTRecord();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			this.sectlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_COMM_2100_MDataSet ds = (SE_COMM_2100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_COMM_2100_MCURLISTRecord curlistRec = (SE_COMM_2100_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.routelist.size(); i++){
		SE_COMM_2100_MROUTELISTRecord routelistRec = (SE_COMM_2100_MROUTELISTRecord)ds.routelist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.prtlist.size(); i++){
		SE_COMM_2100_MPRTLISTRecord prtlistRec = (SE_COMM_2100_MPRTLISTRecord)ds.prtlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getRoutelist()%>
<%= ds.getPrtlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= routelistRec.cd%>
<%= routelistRec.cdnm%>
<%= routelistRec.cd_abrv_nm%>
<%= prtlistRec.cd%>
<%= prtlistRec.cdnm%>
<%= prtlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 18 09:12:20 KST 2009 */