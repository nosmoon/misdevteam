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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_1021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_1021_LDataSet(){}
	public MC_BUDG_1021_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_1021_LCURLISTRecord rec = new MC_BUDG_1021_LCURLISTRecord();
			rec.budg_type_cd = Util.checkString(rset0.getString("budg_type_cd"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_cdnm = Util.checkString(rset0.getString("budg_cdnm"));
			rec.ycbrnm1 = Util.checkString(rset0.getString("ycbrnm1"));
			rec.ycbrnm2 = Util.checkString(rset0.getString("ycbrnm2"));
			rec.ycbrnm3 = Util.checkString(rset0.getString("ycbrnm3"));
			rec.ycbrnm4 = Util.checkString(rset0.getString("ycbrnm4"));
			rec.budg_clas_cd = Util.checkString(rset0.getString("budg_clas_cd"));
			rec.cyov_yn = Util.checkString(rset0.getString("cyov_yn"));
			rec.lesd_yn = Util.checkString(rset0.getString("lesd_yn"));
			rec.advc_cndt_yn = Util.checkString(rset0.getString("advc_cndt_yn"));
			rec.fixfee_yn = Util.checkString(rset0.getString("fixfee_yn"));
			rec.posbfee_yn = Util.checkString(rset0.getString("posbfee_yn"));
			rec.limt_chk_yn = Util.checkString(rset0.getString("limt_chk_yn"));
			rec.medi_dstb_cd = Util.checkString(rset0.getString("medi_dstb_cd"));
			rec.whco_comn_cost_yn = Util.checkString(rset0.getString("whco_comn_cost_yn"));
			rec.whco_ndstb_cd = Util.checkString(rset0.getString("whco_ndstb_cd"));
			rec.dstb_acct_cd = Util.checkString(rset0.getString("dstb_acct_cd"));
			rec.via_dept_cd = Util.checkString(rset0.getString("via_dept_cd"));
			rec.drcr_bal_clsf = Util.checkString(rset0.getString("drcr_bal_clsf"));
			rec.use_bgn_dt = Util.checkString(rset0.getString("use_bgn_dt"));
			rec.use_end_dt = Util.checkString(rset0.getString("use_end_dt"));
			rec.item_01 = Util.checkString(rset0.getString("item_01"));
			rec.item_02 = Util.checkString(rset0.getString("item_02"));
			rec.item_03 = Util.checkString(rset0.getString("item_03"));
			rec.item_04 = Util.checkString(rset0.getString("item_04"));
			rec.item_05 = Util.checkString(rset0.getString("item_05"));
			rec.item_06 = Util.checkString(rset0.getString("item_06"));
			rec.item_07 = Util.checkString(rset0.getString("item_07"));
			rec.item_08 = Util.checkString(rset0.getString("item_08"));
			rec.item_09 = Util.checkString(rset0.getString("item_09"));
			rec.item_10 = Util.checkString(rset0.getString("item_10"));
			rec.item_11 = Util.checkString(rset0.getString("item_11"));
			rec.item_12 = Util.checkString(rset0.getString("item_12"));
			rec.item_13 = Util.checkString(rset0.getString("item_13"));
			rec.item_14 = Util.checkString(rset0.getString("item_14"));
			rec.item_15 = Util.checkString(rset0.getString("item_15"));
			rec.item_16 = Util.checkString(rset0.getString("item_16"));
			rec.item_17 = Util.checkString(rset0.getString("item_17"));
			rec.item_18 = Util.checkString(rset0.getString("item_18"));
			rec.item_19 = Util.checkString(rset0.getString("item_19"));
			rec.item_20 = Util.checkString(rset0.getString("item_20"));
			rec.item_21 = Util.checkString(rset0.getString("item_21"));
			rec.item_22 = Util.checkString(rset0.getString("item_22"));
			rec.item_23 = Util.checkString(rset0.getString("item_23"));
			rec.item_24 = Util.checkString(rset0.getString("item_24"));
			rec.item_25 = Util.checkString(rset0.getString("item_25"));
			rec.item_26 = Util.checkString(rset0.getString("item_26"));
			rec.item_27 = Util.checkString(rset0.getString("item_27"));
			rec.item_28 = Util.checkString(rset0.getString("item_28"));
			rec.item_29 = Util.checkString(rset0.getString("item_29"));
			rec.item_30 = Util.checkString(rset0.getString("item_30"));
			rec.item_31 = Util.checkString(rset0.getString("item_31"));
			rec.item_32 = Util.checkString(rset0.getString("item_32"));
			rec.item_33 = Util.checkString(rset0.getString("item_33"));
			rec.item_34 = Util.checkString(rset0.getString("item_34"));
			rec.item_35 = Util.checkString(rset0.getString("item_35"));
			rec.item_36 = Util.checkString(rset0.getString("item_36"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_1021_LDataSet ds = (MC_BUDG_1021_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_1021_LCURLISTRecord curlistRec = (MC_BUDG_1021_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.budg_type_cd%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_cdnm%>
<%= curlistRec.ycbrnm1%>
<%= curlistRec.ycbrnm2%>
<%= curlistRec.ycbrnm3%>
<%= curlistRec.ycbrnm4%>
<%= curlistRec.budg_clas_cd%>
<%= curlistRec.cyov_yn%>
<%= curlistRec.lesd_yn%>
<%= curlistRec.advc_cndt_yn%>
<%= curlistRec.fixfee_yn%>
<%= curlistRec.posbfee_yn%>
<%= curlistRec.limt_chk_yn%>
<%= curlistRec.medi_dstb_cd%>
<%= curlistRec.whco_comn_cost_yn%>
<%= curlistRec.whco_ndstb_cd%>
<%= curlistRec.dstb_acct_cd%>
<%= curlistRec.via_dept_cd%>
<%= curlistRec.drcr_bal_clsf%>
<%= curlistRec.use_bgn_dt%>
<%= curlistRec.use_end_dt%>
<%= curlistRec.item_01%>
<%= curlistRec.item_02%>
<%= curlistRec.item_03%>
<%= curlistRec.item_04%>
<%= curlistRec.item_05%>
<%= curlistRec.item_06%>
<%= curlistRec.item_07%>
<%= curlistRec.item_08%>
<%= curlistRec.item_09%>
<%= curlistRec.item_10%>
<%= curlistRec.item_11%>
<%= curlistRec.item_12%>
<%= curlistRec.item_13%>
<%= curlistRec.item_14%>
<%= curlistRec.item_15%>
<%= curlistRec.item_16%>
<%= curlistRec.item_17%>
<%= curlistRec.item_18%>
<%= curlistRec.item_19%>
<%= curlistRec.item_20%>
<%= curlistRec.item_21%>
<%= curlistRec.item_22%>
<%= curlistRec.item_23%>
<%= curlistRec.item_24%>
<%= curlistRec.item_25%>
<%= curlistRec.item_26%>
<%= curlistRec.item_27%>
<%= curlistRec.item_28%>
<%= curlistRec.item_29%>
<%= curlistRec.item_30%>
<%= curlistRec.item_31%>
<%= curlistRec.item_32%>
<%= curlistRec.item_33%>
<%= curlistRec.item_34%>
<%= curlistRec.item_35%>
<%= curlistRec.item_36%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 21:09:56 KST 2009 */