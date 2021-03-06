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


package chosun.ciis.mt.etccar.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_5300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_5300_LDataSet(){}
	public MT_ETCCAR_5300_LDataSet(String errcode, String errmsg){
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
			MT_ETCCAR_5300_LCURLISTRecord rec = new MT_ETCCAR_5300_LCURLISTRecord();
			rec.driv_dt = Util.checkString(rset0.getString("driv_dt"));
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.cmpy_mang_nm = Util.checkString(rset0.getString("cmpy_mang_nm"));
			rec.oil_kind = Util.checkString(rset0.getString("oil_kind"));
			rec.rungag = Util.checkString(rset0.getString("rungag"));
			rec.buyoil_qunt = Util.checkString(rset0.getString("buyoil_qunt"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.money = Util.checkString(rset0.getString("money"));
			rec.fuel = Util.checkString(rset0.getString("fuel"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCCAR_5300_LDataSet ds = (MT_ETCCAR_5300_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCCAR_5300_LCURLISTRecord curlistRec = (MT_ETCCAR_5300_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.driv_dt%>
<%= curlistRec.car_no%>
<%= curlistRec.cmpy_mang_nm%>
<%= curlistRec.oil_kind%>
<%= curlistRec.rungag%>
<%= curlistRec.buyoil_qunt%>
<%= curlistRec.uprc%>
<%= curlistRec.money%>
<%= curlistRec.fuel%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 18:29:33 KST 2009 */