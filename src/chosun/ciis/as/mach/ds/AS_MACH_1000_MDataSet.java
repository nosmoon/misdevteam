/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.mach.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.mach.dm.*;
import chosun.ciis.as.mach.rec.*;

/**
 * 
 */


public class AS_MACH_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmach = new ArrayList();
	public ArrayList curbldg = new ArrayList();
	public ArrayList curwork = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_MACH_1000_MDataSet(){}
	public AS_MACH_1000_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			AS_MACH_1000_MCURWORKRecord rec = new AS_MACH_1000_MCURWORKRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curwork.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			AS_MACH_1000_MCURMACHRecord rec = new AS_MACH_1000_MCURMACHRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curmach.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			AS_MACH_1000_MCURBLDGRecord rec = new AS_MACH_1000_MCURBLDGRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curbldg.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_MACH_1000_MDataSet ds = (AS_MACH_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curwork.size(); i++){
		AS_MACH_1000_MCURWORKRecord curworkRec = (AS_MACH_1000_MCURWORKRecord)ds.curwork.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmach.size(); i++){
		AS_MACH_1000_MCURMACHRecord curmachRec = (AS_MACH_1000_MCURMACHRecord)ds.curmach.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curbldg.size(); i++){
		AS_MACH_1000_MCURBLDGRecord curbldgRec = (AS_MACH_1000_MCURBLDGRecord)ds.curbldg.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurwork()%>
<%= ds.getCurmach()%>
<%= ds.getCurbldg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curworkRec.cd%>
<%= curworkRec.cdnm%>
<%= curworkRec.cd_abrv_nm%>
<%= curworkRec.cdnm_cd%>
<%= curworkRec.cdabrvnm_cd%>
<%= curmachRec.cd%>
<%= curmachRec.cdnm%>
<%= curmachRec.cd_abrv_nm%>
<%= curmachRec.cdnm_cd%>
<%= curmachRec.cdabrvnm_cd%>
<%= curbldgRec.cd%>
<%= curbldgRec.cdnm%>
<%= curbldgRec.cd_abrv_nm%>
<%= curbldgRec.cdnm_cd%>
<%= curbldgRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 10 11:05:24 KST 2015 */