/***************************************************************************************************
* 파일명 : SE_BAS_1100_MDataSet.java
* 기능 :  판매 - 기준정보 - 지역관리 
 * 작성일자 : 2009.01.15
 * 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist  = new ArrayList();
	public ArrayList partlist  = new ArrayList();
	public ArrayList arealist  = new ArrayList();
	public ArrayList codelist  = new ArrayList();
	public ArrayList acctlist  = new ArrayList();
	public ArrayList selllist  = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BAS_1100_MDataSet(){}
	public SE_BAS_1100_MDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_BAS_1100_MTEAMLISTRecord rec = new SE_BAS_1100_MTEAMLISTRecord();
			rec.dept_cd		= Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm		= Util.checkString(rset0.getString("dept_nm"));
			
			this.teamlist.add(rec);
		}
		rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_BAS_1100_MPARTLISTRecord rec = new SE_BAS_1100_MPARTLISTRecord();
			rec.dept_cd 		= Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm 		= Util.checkString(rset0.getString("dept_nm"));
			rec.supr_dept_cd 	= Util.checkString(rset0.getString("supr_dept_cd"));
			
			this.partlist.add(rec);
		}
		rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_BAS_1100_MAREALISTRecord rec = new SE_BAS_1100_MAREALISTRecord();
			rec.area_cd			= Util.checkString(rset0.getString("area_cd"));
			rec.area_nm 		= Util.checkString(rset0.getString("area_nm"));
			rec.dept_cd 		= Util.checkString(rset0.getString("dept_cd"));
			rec.supr_dept_cd	= Util.checkString(rset0.getString("supr_dept_cd"));
			
			this.arealist.add(rec);
		}
		rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_BAS_1100_MCORDLISTRecord rec = new SE_BAS_1100_MCORDLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"));
			
			this.codelist.add(rec);
		}
		
		rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SE_BAS_1100_MACCTLISTRecord rec = new SE_BAS_1100_MACCTLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"));
			
			this.acctlist.add(rec);
		}
		
		rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SE_BAS_1100_MSELLLISTRecord rec = new SE_BAS_1100_MSELLLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"));
			
			this.selllist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BAS_1102DataSet ds = (SE_BAS_1102DataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BAS_1102CURLISTRecord curlistRec = (SE_BAS_1102CURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.sido_cd%>
<%= curlistRec.sido_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 13 18:16:18 KST 2009 */