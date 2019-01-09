/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.mach.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.mach.dm.*;
import chosun.ciis.as.mach.rec.*;

/**
 * 
 */


public class AS_MACH_1015_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String cmpy_cd;
	public String mach_seq;
	public String work_clsf;
	public String mach_clsf;
	public String bldg_clsf;
	public String mach_name;
	public String model_name;
	public String stnd;
	public String usag;
	public String loca;
	public String inst_dt;
	public String exp_dt;
	public String make_comp;
	public String inst_comp;
	public String inst_fee;
	public String as_comp;
	public String as_fee;
	public String as_tel;
	public String remk;
	public String life_year;

	public AS_MACH_1015_SDataSet(){}
	public AS_MACH_1015_SDataSet(String errcode, String errmsg, String cmpy_cd, String mach_seq, String work_clsf, String mach_clsf, String bldg_clsf, String mach_name, String model_name, String stnd, String usag, String loca, String inst_dt, String exp_dt, String make_comp, String inst_comp, String inst_fee, String as_comp, String as_fee, String as_tel, String remk, String life_year){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cmpy_cd = cmpy_cd;
		this.mach_seq = mach_seq;
		this.work_clsf = work_clsf;
		this.mach_clsf = mach_clsf;
		this.bldg_clsf = bldg_clsf;
		this.mach_name = mach_name;
		this.model_name = model_name;
		this.stnd = stnd;
		this.usag = usag;
		this.loca = loca;
		this.inst_dt = inst_dt;
		this.exp_dt = exp_dt;
		this.make_comp = make_comp;
		this.inst_comp = inst_comp;
		this.inst_fee = inst_fee;
		this.as_comp = as_comp;
		this.as_fee = as_fee;
		this.as_tel = as_tel;
		this.remk = remk;
		this.life_year = life_year;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMach_seq(String mach_seq){
		this.mach_seq = mach_seq;
	}

	public void setWork_clsf(String work_clsf){
		this.work_clsf = work_clsf;
	}

	public void setMach_clsf(String mach_clsf){
		this.mach_clsf = mach_clsf;
	}

	public void setBldg_clsf(String bldg_clsf){
		this.bldg_clsf = bldg_clsf;
	}

	public void setMach_name(String mach_name){
		this.mach_name = mach_name;
	}

	public void setModel_name(String model_name){
		this.model_name = model_name;
	}

	public void setStnd(String stnd){
		this.stnd = stnd;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setLoca(String loca){
		this.loca = loca;
	}

	public void setInst_dt(String inst_dt){
		this.inst_dt = inst_dt;
	}

	public void setExp_dt(String exp_dt){
		this.exp_dt = exp_dt;
	}

	public void setMake_comp(String make_comp){
		this.make_comp = make_comp;
	}

	public void setInst_comp(String inst_comp){
		this.inst_comp = inst_comp;
	}

	public void setInst_fee(String inst_fee){
		this.inst_fee = inst_fee;
	}

	public void setAs_comp(String as_comp){
		this.as_comp = as_comp;
	}

	public void setAs_fee(String as_fee){
		this.as_fee = as_fee;
	}

	public void setAs_tel(String as_tel){
		this.as_tel = as_tel;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setLife_year(String life_year){
		this.life_year = life_year;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMach_seq(){
		return this.mach_seq;
	}

	public String getWork_clsf(){
		return this.work_clsf;
	}

	public String getMach_clsf(){
		return this.mach_clsf;
	}

	public String getBldg_clsf(){
		return this.bldg_clsf;
	}

	public String getMach_name(){
		return this.mach_name;
	}

	public String getModel_name(){
		return this.model_name;
	}

	public String getStnd(){
		return this.stnd;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getLoca(){
		return this.loca;
	}

	public String getInst_dt(){
		return this.inst_dt;
	}

	public String getExp_dt(){
		return this.exp_dt;
	}

	public String getMake_comp(){
		return this.make_comp;
	}

	public String getInst_comp(){
		return this.inst_comp;
	}

	public String getInst_fee(){
		return this.inst_fee;
	}

	public String getAs_comp(){
		return this.as_comp;
	}

	public String getAs_fee(){
		return this.as_fee;
	}

	public String getAs_tel(){
		return this.as_tel;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getLife_year(){
		return this.life_year;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.cmpy_cd = Util.checkString(cstmt.getString(5));
		this.mach_seq = Util.checkString(cstmt.getString(6));
		this.work_clsf = Util.checkString(cstmt.getString(7));
		this.mach_clsf = Util.checkString(cstmt.getString(8));
		this.bldg_clsf = Util.checkString(cstmt.getString(9));
		this.mach_name = Util.checkString(cstmt.getString(10));
		this.model_name = Util.checkString(cstmt.getString(11));
		this.stnd = Util.checkString(cstmt.getString(12));
		this.usag = Util.checkString(cstmt.getString(13));
		this.loca = Util.checkString(cstmt.getString(14));
		this.inst_dt = Util.checkString(cstmt.getString(15));
		this.exp_dt = Util.checkString(cstmt.getString(16));
		this.make_comp = Util.checkString(cstmt.getString(17));
		this.inst_comp = Util.checkString(cstmt.getString(18));
		this.inst_fee = Util.checkString(cstmt.getString(19));
		this.as_comp = Util.checkString(cstmt.getString(20));
		this.as_fee = Util.checkString(cstmt.getString(21));
		this.as_tel = Util.checkString(cstmt.getString(22));
		this.remk = Util.checkString(cstmt.getString(23));
		this.life_year = Util.checkString(cstmt.getString(24));
		ResultSet rset0 = (ResultSet) cstmt.getObject(25);
		while(rset0.next()){
			AS_MACH_1015_SCURLISTRecord rec = new AS_MACH_1015_SCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.mach_seq = Util.checkString(rset0.getString("mach_seq"));
			rec.as_seq = Util.checkString(rset0.getString("as_seq"));
			rec.mach_as_dt = Util.checkString(rset0.getString("mach_as_dt"));
			rec.as_comp = Util.checkString(rset0.getString("as_comp"));
			rec.as_fee = Util.checkString(rset0.getString("as_fee"));
			rec.as_cont = Util.checkString(rset0.getString("as_cont"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_MACH_1015_SDataSet ds = (AS_MACH_1015_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_MACH_1015_SCURLISTRecord curlistRec = (AS_MACH_1015_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCmpy_cd()%>
<%= ds.getMach_seq()%>
<%= ds.getWork_clsf()%>
<%= ds.getMach_clsf()%>
<%= ds.getBldg_clsf()%>
<%= ds.getMach_name()%>
<%= ds.getModel_name()%>
<%= ds.getStnd()%>
<%= ds.getUsag()%>
<%= ds.getLoca()%>
<%= ds.getInst_dt()%>
<%= ds.getExp_dt()%>
<%= ds.getMake_comp()%>
<%= ds.getInst_comp()%>
<%= ds.getInst_fee()%>
<%= ds.getAs_comp()%>
<%= ds.getAs_fee()%>
<%= ds.getAs_tel()%>
<%= ds.getRemk()%>
<%= ds.getLife_year()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.mach_seq%>
<%= curlistRec.as_seq%>
<%= curlistRec.mach_as_dt%>
<%= curlistRec.as_comp%>
<%= curlistRec.as_fee%>
<%= curlistRec.as_cont%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 14:13:49 KST 2015 */