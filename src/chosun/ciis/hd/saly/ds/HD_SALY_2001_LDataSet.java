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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_2001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_2001_LDataSet(){}
	public HD_SALY_2001_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_SALY_2001_LCURLISTRecord rec = new HD_SALY_2001_LCURLISTRecord();
			rec.dspch_enpr_main_clsf = Util.checkString(rset0.getString("dspch_enpr_main_clsf"));
			rec.presi_flnm = Util.checkString(rset0.getString("presi_flnm"));
			rec.eps_no = Util.checkString(rset0.getString("eps_no"));
			rec.zip_1 = Util.checkString(rset0.getString("zip_1"));
			rec.zip_2 = Util.checkString(rset0.getString("zip_2"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtls_addr = Util.checkString(rset0.getString("dtls_addr"));
			rec.servcost_calc_rate = Util.checkString(rset0.getString("servcost_calc_rate"));
			rec.mang_liab_pers_flnm = Util.checkString(rset0.getString("mang_liab_pers_flnm"));
			rec.mang_liab_pers_prn = Util.checkString(rset0.getString("mang_liab_pers_prn"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.aply_basi_dt = Util.checkString(rset0.getString("aply_basi_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_2001_LDataSet ds = (HD_SALY_2001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_2001_LCURLISTRecord curlistRec = (HD_SALY_2001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dspch_enpr_main_clsf%>
<%= curlistRec.presi_flnm%>
<%= curlistRec.eps_no%>
<%= curlistRec.zip_1%>
<%= curlistRec.zip_2%>
<%= curlistRec.addr%>
<%= curlistRec.dtls_addr%>
<%= curlistRec.servcost_calc_rate%>
<%= curlistRec.mang_liab_pers_flnm%>
<%= curlistRec.mang_liab_pers_prn%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.aply_basi_dt%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 25 13:35:06 KST 2009 */