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


public class MT_ETCCAR_5100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_5100_LDataSet(){}
	public MT_ETCCAR_5100_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_ETCCAR_5100_LCURLISTRecord rec = new MT_ETCCAR_5100_LCURLISTRecord();
			rec.driv_dt = Util.checkString(rset0.getString("driv_dt"));
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.cmpy_mang_nm = Util.checkString(rset0.getString("cmpy_mang_nm"));
			rec.oil_kind = Util.checkString(rset0.getString("oil_kind"));
			rec.rungag = Util.checkString(rset0.getString("rungag"));
			rec.carsno = Util.checkString(rset0.getString("carsno"));
			rec.buyoil_qunt01 = Util.checkString(rset0.getString("buyoil_qunt01"));
			rec.buyoil_qunt02 = Util.checkString(rset0.getString("buyoil_qunt02"));
			rec.buyoil_qunt03 = Util.checkString(rset0.getString("buyoil_qunt03"));
			rec.buyoil_qunt04 = Util.checkString(rset0.getString("buyoil_qunt04"));
			rec.buyoil_qunt05 = Util.checkString(rset0.getString("buyoil_qunt05"));
			rec.buyoil_qunt06 = Util.checkString(rset0.getString("buyoil_qunt06"));
			rec.buyoil_qunt07 = Util.checkString(rset0.getString("buyoil_qunt07"));
			rec.buyoil_qunt08 = Util.checkString(rset0.getString("buyoil_qunt08"));
			rec.buyoil_qunt09 = Util.checkString(rset0.getString("buyoil_qunt09"));
			rec.buyoil_qunt10 = Util.checkString(rset0.getString("buyoil_qunt10"));
			rec.buyoil_qunt11 = Util.checkString(rset0.getString("buyoil_qunt11"));
			rec.buyoil_qunt12 = Util.checkString(rset0.getString("buyoil_qunt12"));
			rec.buyoil_qunt13 = Util.checkString(rset0.getString("buyoil_qunt13"));
			rec.buyoil_qunt14 = Util.checkString(rset0.getString("buyoil_qunt14"));
			rec.buyoil_qunt15 = Util.checkString(rset0.getString("buyoil_qunt15"));
			rec.buyoil_qunt16 = Util.checkString(rset0.getString("buyoil_qunt16"));
			rec.buyoil_qunt17 = Util.checkString(rset0.getString("buyoil_qunt17"));
			rec.buyoil_qunt18 = Util.checkString(rset0.getString("buyoil_qunt18"));
			rec.buyoil_qunt19 = Util.checkString(rset0.getString("buyoil_qunt19"));
			rec.buyoil_qunt20 = Util.checkString(rset0.getString("buyoil_qunt20"));
			rec.buyoil_qunt21 = Util.checkString(rset0.getString("buyoil_qunt21"));
			rec.buyoil_qunt22 = Util.checkString(rset0.getString("buyoil_qunt22"));
			rec.buyoil_qunt23 = Util.checkString(rset0.getString("buyoil_qunt23"));
			rec.buyoil_qunt24 = Util.checkString(rset0.getString("buyoil_qunt24"));
			rec.buyoil_qunt25 = Util.checkString(rset0.getString("buyoil_qunt25"));
			rec.buyoil_qunt26 = Util.checkString(rset0.getString("buyoil_qunt26"));
			rec.buyoil_qunt27 = Util.checkString(rset0.getString("buyoil_qunt27"));
			rec.buyoil_qunt28 = Util.checkString(rset0.getString("buyoil_qunt28"));
			rec.buyoil_qunt29 = Util.checkString(rset0.getString("buyoil_qunt29"));
			rec.buyoil_qunt30 = Util.checkString(rset0.getString("buyoil_qunt30"));
			rec.buyoil_qunt31 = Util.checkString(rset0.getString("buyoil_qunt31"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCCAR_5100_LDataSet ds = (MT_ETCCAR_5100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCCAR_5100_LCURLISTRecord curlistRec = (MT_ETCCAR_5100_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.carsno%>
<%= curlistRec.buyoil_qunt01%>
<%= curlistRec.buyoil_qunt02%>
<%= curlistRec.buyoil_qunt03%>
<%= curlistRec.buyoil_qunt04%>
<%= curlistRec.buyoil_qunt05%>
<%= curlistRec.buyoil_qunt06%>
<%= curlistRec.buyoil_qunt07%>
<%= curlistRec.buyoil_qunt08%>
<%= curlistRec.buyoil_qunt09%>
<%= curlistRec.buyoil_qunt10%>
<%= curlistRec.buyoil_qunt11%>
<%= curlistRec.buyoil_qunt12%>
<%= curlistRec.buyoil_qunt13%>
<%= curlistRec.buyoil_qunt14%>
<%= curlistRec.buyoil_qunt15%>
<%= curlistRec.buyoil_qunt16%>
<%= curlistRec.buyoil_qunt17%>
<%= curlistRec.buyoil_qunt18%>
<%= curlistRec.buyoil_qunt19%>
<%= curlistRec.buyoil_qunt20%>
<%= curlistRec.buyoil_qunt21%>
<%= curlistRec.buyoil_qunt22%>
<%= curlistRec.buyoil_qunt23%>
<%= curlistRec.buyoil_qunt24%>
<%= curlistRec.buyoil_qunt25%>
<%= curlistRec.buyoil_qunt26%>
<%= curlistRec.buyoil_qunt27%>
<%= curlistRec.buyoil_qunt28%>
<%= curlistRec.buyoil_qunt29%>
<%= curlistRec.buyoil_qunt30%>
<%= curlistRec.buyoil_qunt31%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 22 15:36:48 KST 2009 */