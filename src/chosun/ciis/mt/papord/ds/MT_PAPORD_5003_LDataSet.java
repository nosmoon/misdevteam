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


package chosun.ciis.mt.papord.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_5003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_5003_LDataSet(){}
	public MT_PAPORD_5003_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_PAPORD_5003_LCURLISTRecord rec = new MT_PAPORD_5003_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.papcmpy_cd = Util.checkString(rset0.getString("papcmpy_cd"));
			rec.papcmpy_nm = Util.checkString(rset0.getString("papcmpy_nm"));
			rec.matr_cd_a = Util.checkString(rset0.getString("matr_cd_a"));
			rec.roll_wgt_a = Util.checkString(rset0.getString("roll_wgt_a"));
			rec.somo_cnt_a = Util.checkString(rset0.getString("somo_cnt_a"));
			rec.somo_wgt_a = Util.checkString(rset0.getString("somo_wgt_a"));
			rec.ordr_roll_cnt_a = Util.checkString(rset0.getString("ordr_roll_cnt_a"));
			rec.ordr_wgt_a = Util.checkString(rset0.getString("ordr_wgt_a"));
			rec.car_kind_a = Util.checkString(rset0.getString("car_kind_a"));
			rec.seq_a = Util.checkString(rset0.getString("seq_a"));
			rec.occr_dt_a = Util.checkString(rset0.getString("occr_dt_a"));
			rec.car_prd_cnt_a = Util.checkString(rset0.getString("car_prd_cnt_a"));
			rec.mix_roll_a = Util.checkString(rset0.getString("mix_roll_a"));
			rec.mix_wgt_a = Util.checkString(rset0.getString("mix_wgt_a"));
			rec.matr_cd_b = Util.checkString(rset0.getString("matr_cd_b"));
			rec.roll_wgt_b = Util.checkString(rset0.getString("roll_wgt_b"));
			rec.somo_cnt_b = Util.checkString(rset0.getString("somo_cnt_b"));
			rec.somo_wgt_b = Util.checkString(rset0.getString("somo_wgt_b"));
			rec.ordr_roll_cnt_b = Util.checkString(rset0.getString("ordr_roll_cnt_b"));
			rec.ordr_wgt_b = Util.checkString(rset0.getString("ordr_wgt_b"));
			rec.car_kind_b = Util.checkString(rset0.getString("car_kind_b"));
			rec.seq_b = Util.checkString(rset0.getString("seq_b"));
			rec.occr_dt_b = Util.checkString(rset0.getString("occr_dt_b"));
			rec.car_prd_cnt_b = Util.checkString(rset0.getString("car_prd_cnt_b"));
			rec.mix_roll_b = Util.checkString(rset0.getString("mix_roll_b"));
			rec.mix_wgt_b = Util.checkString(rset0.getString("mix_wgt_b"));
			rec.matr_cd_c = Util.checkString(rset0.getString("matr_cd_c"));
			rec.roll_wgt_c = Util.checkString(rset0.getString("roll_wgt_c"));
			rec.somo_cnt_c = Util.checkString(rset0.getString("somo_cnt_c"));
			rec.somo_wgt_c = Util.checkString(rset0.getString("somo_wgt_c"));
			rec.ordr_roll_cnt_c = Util.checkString(rset0.getString("ordr_roll_cnt_c"));
			rec.ordr_wgt_c = Util.checkString(rset0.getString("ordr_wgt_c"));
			rec.car_kind_c = Util.checkString(rset0.getString("car_kind_c"));
			rec.seq_c = Util.checkString(rset0.getString("seq_c"));
			rec.occr_dt_c = Util.checkString(rset0.getString("occr_dt_c"));
			rec.car_prd_cnt_c = Util.checkString(rset0.getString("car_prd_cnt_c"));
			rec.mix_roll_c = Util.checkString(rset0.getString("mix_roll_c"));
			rec.mix_wgt_c = Util.checkString(rset0.getString("mix_wgt_c"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPORD_5003_LDataSet ds = (MT_PAPORD_5003_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPORD_5003_LCURLISTRecord curlistRec = (MT_PAPORD_5003_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.papcmpy_cd%>
<%= curlistRec.papcmpy_nm%>
<%= curlistRec.matr_cd_a%>
<%= curlistRec.roll_wgt_a%>
<%= curlistRec.somo_cnt_a%>
<%= curlistRec.somo_wgt_a%>
<%= curlistRec.ordr_roll_cnt_a%>
<%= curlistRec.ordr_wgt_a%>
<%= curlistRec.car_kind_a%>
<%= curlistRec.seq_a%>
<%= curlistRec.occr_dt_a%>
<%= curlistRec.car_prd_cnt_a%>
<%= curlistRec.mix_roll_a%>
<%= curlistRec.mix_wgt_a%>
<%= curlistRec.matr_cd_b%>
<%= curlistRec.roll_wgt_b%>
<%= curlistRec.somo_cnt_b%>
<%= curlistRec.somo_wgt_b%>
<%= curlistRec.ordr_roll_cnt_b%>
<%= curlistRec.ordr_wgt_b%>
<%= curlistRec.car_kind_b%>
<%= curlistRec.seq_b%>
<%= curlistRec.occr_dt_b%>
<%= curlistRec.car_prd_cnt_b%>
<%= curlistRec.mix_roll_b%>
<%= curlistRec.mix_wgt_b%>
<%= curlistRec.matr_cd_c%>
<%= curlistRec.roll_wgt_c%>
<%= curlistRec.somo_cnt_c%>
<%= curlistRec.somo_wgt_c%>
<%= curlistRec.ordr_roll_cnt_c%>
<%= curlistRec.ordr_wgt_c%>
<%= curlistRec.car_kind_c%>
<%= curlistRec.seq_c%>
<%= curlistRec.occr_dt_c%>
<%= curlistRec.car_prd_cnt_c%>
<%= curlistRec.mix_roll_c%>
<%= curlistRec.mix_wgt_c%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 12 18:43:00 KST 2009 */