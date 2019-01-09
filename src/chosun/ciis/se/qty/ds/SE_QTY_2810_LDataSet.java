/***************************************************************************************************
* 파일명 : SE_QTY_2810_LDataSet.java
* 기능 : 부수관리 - 발송부수 - 본지일자별발행부수
* 작성일자 : 2009-03-11
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


public class SE_QTY_2810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_QTY_2810_LDataSet(){}
	public SE_QTY_2810_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_QTY_2810_LCURLISTRecord rec = new SE_QTY_2810_LCURLISTRecord();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.pcnt	= Util.checkString(rset0.getString("pcnt"	));
			rec.qty 	= Util.checkString(rset0.getString("qty"	));
			rec.qty_11 	= Util.checkString(rset0.getString("qty_11"	));
			rec.qty_21 	= Util.checkString(rset0.getString("qty_21"	));
			rec.qty_31 	= Util.checkString(rset0.getString("qty_31"	));
			rec.qty_41 	= Util.checkString(rset0.getString("qty_41"	));
			rec.qty_51 	= Util.checkString(rset0.getString("qty_51"	));
			rec.qty_61 	= Util.checkString(rset0.getString("qty_61"	));
			rec.qty_71 	= Util.checkString(rset0.getString("qty_71"	));
			rec.qty_81 	= Util.checkString(rset0.getString("qty_81"	));
			rec.qty_91 	= Util.checkString(rset0.getString("qty_91"	));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_2810_LDataSet ds = (SE_QTY_2810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_2810_LCURLISTRecord curlistRec = (SE_QTY_2810_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.qty%>
<%= curlistRec.qty_11%>
<%= curlistRec.qty_21%>
<%= curlistRec.qty_31%>
<%= curlistRec.qty_41%>
<%= curlistRec.qty_51%>
<%= curlistRec.qty_61%>
<%= curlistRec.qty_71%>
<%= curlistRec.qty_81%>
<%= curlistRec.qty_91%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 21:05:21 KST 2009 */