/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.26
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_3601_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_3601_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable
{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3601_LDataSet(){}
	public AD_BAS_3601_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next())
		{
			AD_BAS_3601_LCURLISTRecord rec = new AD_BAS_3601_LCURLISTRecord();
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.cust_seq = Util.checkString(rset0.getString("cust_seq"));
			rec.cust_name = Util.checkString(rset0.getString("cust_name"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.department = Util.checkString(rset0.getString("department"));
			rec.position = Util.checkString(rset0.getString("position"));
			rec.mobile1 = Util.checkString(rset0.getString("mobile1"));
			rec.mobile2 = Util.checkString(rset0.getString("mobile2"));
			rec.phone1 = Util.checkString(rset0.getString("phone1"));
			rec.phone2 = Util.checkString(rset0.getString("phone2"));
			rec.homepage = Util.checkString(rset0.getString("homepage"));
			rec.fax = Util.checkString(rset0.getString("fax"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.cmpy_addr = Util.checkString(rset0.getString("cmpy_addr"));
			rec.home_addr = Util.checkString(rset0.getString("home_addr"));
			rec.etc_addr = Util.checkString(rset0.getString("etc_addr"));
			rec.task1 = Util.checkString(rset0.getString("task1"));
			rec.task1_represent = Util.checkString(rset0.getString("task1_represent"));
			rec.task2 = Util.checkString(rset0.getString("task2"));
			rec.task2_represent = Util.checkString(rset0.getString("task2_represent"));
			rec.incumbent_yn = Util.checkString(rset0.getString("incumbent_yn"));
			rec.birth_place = Util.checkString(rset0.getString("birth_place"));
			rec.birth_day = Util.checkString(rset0.getString("birth_day"));
			rec.sex = Util.checkString(rset0.getString("sex"));
			rec.wedding_yn = Util.checkString(rset0.getString("wedding_yn"));
			rec.wedding_day = Util.checkString(rset0.getString("wedding_day"));
			rec.family_size = Util.checkString(rset0.getString("family_size"));
			rec.religion = Util.checkString(rset0.getString("religion"));
			rec.military_service = Util.checkString(rset0.getString("military_service"));
			rec.hobby = Util.checkString(rset0.getString("hobby"));
			rec.golf = Util.checkString(rset0.getString("golf"));
			rec.drinking = Util.checkString(rset0.getString("drinking"));
			rec.smoking = Util.checkString(rset0.getString("smoking"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.protensity = Util.checkString(rset0.getString("protensity"));
			rec.reputation = Util.checkString(rset0.getString("reputation"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.slcrg_pers_nm = Util.checkString(rset0.getString("slcrg_pers_nm"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			rec.mchrg_pers_nm = Util.checkString(rset0.getString("mchrg_pers_nm"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_pers_nm = Util.checkString(rset0.getString("incmg_pers_nm"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_pers_nm = Util.checkString(rset0.getString("chg_pers_nm"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.peopledb_no = Util.checkString(rset0.getString("peopledb_no"));
			rec.item_list = Util.checkString(rset0.getString("item_list"));
			rec.grp_cmpy_cd = Util.checkString(rset0.getString("grp_cmpy_cd"));
			rec.grp_cmpy = Util.checkString(rset0.getString("grp_cmpy"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_3510_LDataSet ds = (AD_BAS_3510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_3510_LCURLISTRecord curlistRec = (AD_BAS_3510_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.oth_clsf%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.pubc_side%>
<%= curlistRec.issu_ser_no%>
<%= curlistRec.std%>
<%= curlistRec.advcs%>
<%= curlistRec.advt_cont%>
<%= curlistRec.indt_clsf%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.pubc_amt%>
<%= curlistRec.pubc_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 15 18:21:44 KST 2009 */