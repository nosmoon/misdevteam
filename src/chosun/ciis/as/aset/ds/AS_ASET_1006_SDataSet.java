/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1006_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1006_SDataSet(){}
	public AS_ASET_1006_SDataSet(String errcode, String errmsg){
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
			AS_ASET_1006_SCURLISTRecord rec = new AS_ASET_1006_SCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.car_engine_size = Util.checkString(rset0.getString("car_engine_size"));
			rec.car_kind = Util.checkString(rset0.getString("car_kind"));
			rec.insr_no = Util.checkString(rset0.getString("insr_no"));
			rec.quorum_cnt = Util.checkString(rset0.getString("quorum_cnt"));
			rec.car_mang_no = Util.checkString(rset0.getString("car_mang_no"));
			rec.car_make_yymm = Util.checkString(rset0.getString("car_make_yymm"));
			rec.car_usag = Util.checkString(rset0.getString("car_usag"));
			rec.use_car_oil = Util.checkString(rset0.getString("use_car_oil"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1006_SDataSet ds = (AS_ASET_1006_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASET_1006_SCURLISTRecord curlistRec = (AS_ASET_1006_SCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.aset_no%>
<%= curlistRec.car_no%>
<%= curlistRec.usag%>
<%= curlistRec.car_engine_size%>
<%= curlistRec.car_kind%>
<%= curlistRec.insr_no%>
<%= curlistRec.quorum_cnt%>
<%= curlistRec.car_mang_no%>
<%= curlistRec.car_make_yymm%>
<%= curlistRec.car_usag%>
<%= curlistRec.use_car_oil%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 03 14:30:33 KST 2009 */