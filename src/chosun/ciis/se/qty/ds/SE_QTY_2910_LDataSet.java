/***************************************************************************************************
* 파일명 : SE_QTY_2910_LDataSet.java
* 기능 : 부수관리 - 발송부수 - 발송부수변동현황
* 작성일자 : 2009-03-09
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode	;
	public String errmsg	;

	public SE_QTY_2910_LDataSet(){}
	public SE_QTY_2910_LDataSet(String errcode, String errmsg){
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
		this.errcode 		= Util.checkString(cstmt.getString(1));
		this.errmsg 		= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 	= (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SE_QTY_2910_LCURLISTRecord rec = new SE_QTY_2910_LCURLISTRecord();
			rec.dept_cd 	= Util.checkString(rset0.getString("dept_cd"	));
			rec.dept_nm 	= Util.checkString(rset0.getString("dept_nm"	));
			rec.part_cd 	= Util.checkString(rset0.getString("part_cd"	));
			rec.part_nm 	= Util.checkString(rset0.getString("part_nm"	));
			rec.area_cd 	= Util.checkString(rset0.getString("area_cd"	));
			rec.area_nm 	= Util.checkString(rset0.getString("area_nm"	));
			rec.bo_cd   	= Util.checkString(rset0.getString("bo_cd"  	));
			rec.bo_seq   	= Util.checkString(rset0.getString("bo_seq" 	));
			rec.bo_nm   	= Util.checkString(rset0.getString("bo_nm"  	));
			rec.issu_dt 	= Util.checkString(rset0.getString("issu_dt"	));
			rec.icdc_qty 	= Util.checkString(rset0.getString("icdc_qty"	));
			rec.send_qty 	= Util.checkString(rset0.getString("send_qty"	));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_2910_LDataSet ds = (SE_QTY_2910_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_2910_LCURLISTRecord curlistRec = (SE_QTY_2910_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.issu_dt%>
<%= curlistRec.icdc_qty%>
<%= curlistRec.send_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 15:32:49 KST 2009 */