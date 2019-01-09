/***************************************************************************************************
* 파일명 : SE_BAS_1400_MDataSet.java
* 기능 :  판매 - 기준정보 - 담당자 등록 
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


public class SE_BAS_1400_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList clsflist = new ArrayList();
	public ArrayList deptlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BAS_1400_MDataSet(){}
	public SE_BAS_1400_MDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SE_BAS_1400_MCLSFLISTRecord rec = new SE_BAS_1400_MCLSFLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.clsflist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SE_BAS_1400_MDEPTLISTRecord rec = new SE_BAS_1400_MDEPTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			this.deptlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BAS_1400_MDataSet ds = (SE_BAS_1400_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.clsflist.size(); i++){
		SE_BAS_1400_MCLSFLISTRecord clsflistRec = (SE_BAS_1400_MCLSFLISTRecord)ds.clsflist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.deptlist.size(); i++){
		SE_BAS_1400_MDEPTLISTRecord deptlistRec = (SE_BAS_1400_MDEPTLISTRecord)ds.deptlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClsflist()%>
<%= ds.getDeptlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= clsflistRec.cd%>
<%= clsflistRec.cdnm%>
<%= deptlistRec.dept_cd%>
<%= deptlistRec.dept_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 15 11:30:23 KST 2009 */