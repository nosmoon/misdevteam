/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_4410_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_4410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String mchrg_pers;
	public String part_pers;
	public String team_pers;
	public String errcode;
	public String errmsg;

	public AD_DEP_4410_LDataSet(){}
	public AD_DEP_4410_LDataSet(String errcode, String errmsg){
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
			AD_DEP_4410_LCURLISTRecord rec = new AD_DEP_4410_LCURLISTRecord();
			rec.seq					= Util.checkString(rset0.getString("seq"));
			rec.rcpm_shet_no		= Util.checkString(rset0.getString("rcpm_shet_no"));
			rec.medi_nm				= Util.checkString(rset0.getString("medi_nm"));
			rec.mang_chrg_pers_nm	= Util.checkString(rset0.getString("mang_chrg_pers_nm"));
			rec.dlco_nm				= Util.checkString(rset0.getString("dlco_nm"));
			rec.rcpm_clsf_nm		= Util.checkString(rset0.getString("rcpm_clsf_nm"));
			rec.amt					= Util.checkString(rset0.getString("amt"));
			rec.note_no				= Util.checkString(rset0.getString("note_no"));
			rec.bank_nm				= Util.checkString(rset0.getString("bank_nm"));
			rec.note_clsf_nm		= Util.checkString(rset0.getString("note_clsf_nm"));
			rec.mtry_dt				= Util.checkString(rset0.getString("mtry_dt"));
			rec.issu_pers_nm		= Util.checkString(rset0.getString("issu_pers_nm"));
			
			this.curlist.add(rec);
		}
		
		this.mchrg_pers = Util.checkString(cstmt.getString(8));
		this.part_pers = Util.checkString(cstmt.getString(9));
		this.team_pers = Util.checkString(cstmt.getString(10));
	}
}