/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 삭제여부추가
* 수정자 : 장선희
* 수정일자 : 2017-09-26
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


public class SE_BOI_1050_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList boempcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_1050_LDataSet(){}
	public SE_BOI_1050_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_BOI_1050_LBOEMPCURRecord rec = new SE_BOI_1050_LBOEMPCURRecord();
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.dutynm = Util.checkString(rset0.getString("dutynm"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.lv_cmpy_dt = Util.checkString(rset0.getString("lv_cmpy_dt"));
			rec.delyn = Util.checkString(rset0.getString("delyn"));
			this.boempcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1050_LDataSet ds = (SE_BOI_1050_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.boempcur.size(); i++){
		SE_BOI_1050_LBOEMPCURRecord boempcurRec = (SE_BOI_1050_LBOEMPCURRecord)ds.boempcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBoempcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= boempcurRec.boemp_no%>
<%= boempcurRec.flnm%>
<%= boempcurRec.prn%>
<%= boempcurRec.dutynm%>
<%= boempcurRec.tel_no%>
<%= boempcurRec.ptph_no%>
<%= boempcurRec.in_cmpy_dt%>
<%= boempcurRec.lv_cmpy_dt%>
<%= boempcurRec.delyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 27 11:16:50 KST 2017 */