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


public class MT_ETCCAR_5400_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_5400_LDataSet(){}
	public MT_ETCCAR_5400_LDataSet(String errcode, String errmsg){
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
			MT_ETCCAR_5400_LCURLISTRecord rec = new MT_ETCCAR_5400_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.buy_lent_clsf = Util.checkString(rset0.getString("buy_lent_clsf"));
			rec.control = Util.checkString(rset0.getString("control"));
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.car_modl = Util.checkString(rset0.getString("car_modl"));
			rec.mnft_cmpy = Util.checkString(rset0.getString("mnft_cmpy"));
			rec.engn_dsplt = Util.checkString(rset0.getString("engn_dsplt"));
			rec.engnclsf = Util.checkString(rset0.getString("engnclsf"));
			rec.gearbx = Util.checkString(rset0.getString("gearbx"));
			rec.rid_nops = Util.checkString(rset0.getString("rid_nops"));
			rec.oil_kind = Util.checkString(rset0.getString("oil_kind"));
			rec.own_clsf = Util.checkString(rset0.getString("own_clsf"));
			rec.use_usag = Util.checkString(rset0.getString("use_usag"));
			rec.cmpy_mang_nm = Util.checkString(rset0.getString("cmpy_mang_nm"));
			rec.use_pers = Util.checkString(rset0.getString("use_pers"));
			rec.buy_dt = Util.checkString(rset0.getString("buy_dt"));
			rec.buy_amt = Util.checkString(rset0.getString("buy_amt"));
			rec.carp_car_clsf = Util.checkString(rset0.getString("carp_car_clsf"));
			rec.carp_car_dt = Util.checkString(rset0.getString("carp_car_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCCAR_5400_LDataSet ds = (MT_ETCCAR_5400_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCCAR_5400_LCURLISTRecord curlistRec = (MT_ETCCAR_5400_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.seq%>
<%= curlistRec.buy_lent_clsf%>
<%= curlistRec.control%>
<%= curlistRec.car_no%>
<%= curlistRec.car_modl%>
<%= curlistRec.mnft_cmpy%>
<%= curlistRec.engn_dsplt%>
<%= curlistRec.engnclsf%>
<%= curlistRec.gearbx%>
<%= curlistRec.rid_nops%>
<%= curlistRec.oil_kind%>
<%= curlistRec.own_clsf%>
<%= curlistRec.use_usag%>
<%= curlistRec.cmpy_mang_nm%>
<%= curlistRec.use_pers%>
<%= curlistRec.buy_dt%>
<%= curlistRec.buy_amt%>
<%= curlistRec.carp_car_clsf%>
<%= curlistRec.carp_car_dt%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 10:19:13 KST 2009 */