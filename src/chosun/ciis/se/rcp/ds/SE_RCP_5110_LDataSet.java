/***************************************************************************************************
* 파일명 : SE_RCP_5110_LDataSet.java
* 기능 : 판매- 입금관리 - 마감관리 - 입금전표생성
* 작성일자 : 2009-05-19
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_5110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_5110_LDataSet(){}
	public SE_RCP_5110_LDataSet(String errcode, String errmsg){
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
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_RCP_5110_LCURLISTRecord rec = new SE_RCP_5110_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.cnt_11 	= Util.checkString(rset0.getString("cnt_11"	));
			rec.amt_11 	= Util.checkString(rset0.getString("amt_11"	));
			rec.cnt_13 	= Util.checkString(rset0.getString("cnt_13"	));
			rec.amt_13 	= Util.checkString(rset0.getString("amt_13"	));
			rec.cnt_33 	= Util.checkString(rset0.getString("cnt_33"	));
			rec.amt_33 	= Util.checkString(rset0.getString("amt_33"	));
			rec.cnt_97 	= Util.checkString(rset0.getString("cnt_97"	));
			rec.amt_97 	= Util.checkString(rset0.getString("amt_97"	));
			rec.cnt_etc = Util.checkString(rset0.getString("cnt_etc"));
			rec.amt_etc = Util.checkString(rset0.getString("amt_etc"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_RCP_5110_LDataSet ds = (SE_RCP_5110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_5110_LCURLISTRecord curlistRec = (SE_RCP_5110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.clos_yn%>
<%= curlistRec.cnt_11%>
<%= curlistRec.amt_11%>
<%= curlistRec.cnt_13%>
<%= curlistRec.amt_13%>
<%= curlistRec.cnt_33%>
<%= curlistRec.amt_33%>
<%= curlistRec.cnt_97%>
<%= curlistRec.amt_97%>
<%= curlistRec.cnt_etc%>
<%= curlistRec.amt_etc%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 13:52:01 KST 2009 */