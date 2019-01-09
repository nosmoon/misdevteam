/***************************************************************************************************
* 파일명 : .java
* 기능 : 판촉물관리 - 판촉물등록
* 작성일자 : 2009-03-16
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_2220_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_2220_LDataSet(){}
	public SE_BOI_2220_LDataSet(String errcode, String errmsg){
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
			SE_BOI_2220_LCURLISTRecord rec = new SE_BOI_2220_LCURLISTRecord();
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_addr = Util.checkString(rset0.getString("bo_addr"));
			rec.ratio = Util.checkString(rset0.getString("ratio"));
			rec.apt_cnt = Util.checkString(rset0.getString("apt_cnt"));
			rec.hous_cnt = Util.checkString(rset0.getString("hous_cnt"));
			rec.shop_cnt = Util.checkString(rset0.getString("shop_cnt"));
			rec.offi_cnt = Util.checkString(rset0.getString("offi_cnt"));
			rec.tot_cnt = Util.checkString(rset0.getString("tot_cnt"));
			rec.popl_cnt = Util.checkString(rset0.getString("popl_cnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_2220_LDataSet ds = (SE_BOI_2220_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_2220_LCURLISTRecord curlistRec = (SE_BOI_2220_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bo_cd%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_addr%>
<%= curlistRec.ratio%>
<%= curlistRec.apt_cnt%>
<%= curlistRec.hous_cnt%>
<%= curlistRec.shop_cnt%>
<%= curlistRec.offi_cnt%>
<%= curlistRec.tot_cnt%>
<%= curlistRec.popl_cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 14:47:03 KST 2009 */