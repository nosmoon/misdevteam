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


public class AS_ASET_1005_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1005_SDataSet(){}
	public AS_ASET_1005_SDataSet(String errcode, String errmsg){
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
			AS_ASET_1005_SCURLISTRecord rec = new AS_ASET_1005_SCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.bldg_plcw = Util.checkString(rset0.getString("bldg_plcw"));
			rec.land_size = Util.checkString(rset0.getString("land_size"));
			rec.bldg_size = Util.checkString(rset0.getString("bldg_size"));
			rec.flor_size = Util.checkString(rset0.getString("flor_size"));
			rec.arch = Util.checkString(rset0.getString("arch"));
			rec.flor_cnt = Util.checkString(rset0.getString("flor_cnt"));
			rec.cmpl_yymm = Util.checkString(rset0.getString("cmpl_yymm"));
			rec.acqr_tax_amt = Util.checkString(rset0.getString("acqr_tax_amt"));
			rec.acqr_tax_yymm = Util.checkString(rset0.getString("acqr_tax_yymm"));
			rec.now_tax_amt = Util.checkString(rset0.getString("now_tax_amt"));
			rec.now_tax_yymm = Util.checkString(rset0.getString("now_tax_yymm"));
			rec.blng_ward_offi = Util.checkString(rset0.getString("blng_ward_offi"));
			rec.under_flor = Util.checkString(rset0.getString("under_flor"));
			rec.under_size = Util.checkString(rset0.getString("under_size"));
			rec.bldg_prmt_dt = Util.checkString(rset0.getString("bldg_prmt_dt"));
			rec.leas_ern_no = Util.checkString(rset0.getString("leas_ern_no"));
			rec.rela_no = Util.checkString(rset0.getString("rela_no"));
			rec.rela_nm = Util.checkString(rset0.getString("rela_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1005_SDataSet ds = (AS_ASET_1005_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASET_1005_SCURLISTRecord curlistRec = (AS_ASET_1005_SCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.bldg_plcw%>
<%= curlistRec.land_size%>
<%= curlistRec.bldg_size%>
<%= curlistRec.flor_size%>
<%= curlistRec.arch%>
<%= curlistRec.flor_cnt%>
<%= curlistRec.cmpl_yymm%>
<%= curlistRec.acqr_tax_amt%>
<%= curlistRec.acqr_tax_yymm%>
<%= curlistRec.now_tax_amt%>
<%= curlistRec.now_tax_yymm%>
<%= curlistRec.blng_ward_offi%>
<%= curlistRec.under_flor%>
<%= curlistRec.under_size%>
<%= curlistRec.bldg_prmt_dt%>
<%= curlistRec.leas_ern_no%>
<%= curlistRec.rela_no%>
<%= curlistRec.rela_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 04 12:58:00 KST 2009 */